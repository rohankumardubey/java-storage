/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.storage;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.core.InternalApi;
import com.google.api.gax.grpc.GrpcCallContext;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.storage.v2.BidiWriteObjectRequest;
import com.google.storage.v2.BidiWriteObjectResponse;
import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import java.time.Clock;

public class BidiBlobWriteSessionConfig extends BlobWriteSessionConfig
    implements BlobWriteSessionConfig.GrpcCompatible {
  private static final long serialVersionUID = -903533790705476197L;

  private final int bufferSize;

  @InternalApi
  BidiBlobWriteSessionConfig(int bufferSize) {
    this.bufferSize = bufferSize;
  }

  /**
   * The number of bytes to hold in the buffer before each flush
   *
   * <p><i>Default:</i> {@code 16777216 (16 MiB)}
   *
   * @see #withBufferSize(int)
   * @since 2.34.0 This new api is in preview and is subject to breaking changes.
   */
  public int getBufferSize() {
    return bufferSize;
  }

  @Override
  WriterFactory createFactory(Clock clock) throws IOException {
    return new Factory(ByteSizeConstants._16MiB);
  }

  @InternalApi
  private static final class Factory implements WriterFactory {
    private static final Conversions.Decoder<BidiWriteObjectResponse, BlobInfo>
        WRITE_OBJECT_RESPONSE_BLOB_INFO_DECODER =
            Conversions.grpc().blobInfo().compose(BidiWriteObjectResponse::getResource);

    private final int bufferSize;

    private Factory(int bufferSize) {
      this.bufferSize = bufferSize;
    }

    @InternalApi
    @Override
    public WritableByteChannelSession<?, BlobInfo> writeSession(
        StorageInternal s, BlobInfo info, UnifiedOpts.Opts<UnifiedOpts.ObjectTargetOpt> opts) {
      if (s instanceof GrpcStorageImpl) {
        return new DecoratedWritableByteChannelSession<>(
            new LazySession<>(
                new LazyWriteChannel<>(
                    () -> {
                      GrpcStorageImpl grpc = (GrpcStorageImpl) s;
                      GrpcCallContext grpcCallContext =
                          opts.grpcMetadataMapper().apply(GrpcCallContext.createDefault());
                      BidiWriteObjectRequest req = grpc.getBidiWriteObjectRequest(info, opts);

                      ApiFuture<BidiResumableWrite> startResumableWrite =
                          grpc.startResumableWrite(grpcCallContext, req);
                      return ResumableMedia.gapic()
                          .write()
                          .bidiByteChannel(grpc.storageClient.bidiWriteObjectCallable())
                          .setHasher(Hasher.noop())
                          .setByteStringStrategy(ByteStringStrategy.copy())
                          .resumable()
                          .withRetryConfig(
                              grpc.getOptions(), grpc.retryAlgorithmManager.idempotent())
                          .buffered(BufferHandle.allocate(bufferSize))
                          .setStartAsync(startResumableWrite)
                          .build();
                    })),
            WRITE_OBJECT_RESPONSE_BLOB_INFO_DECODER);
      } else {
        throw new IllegalStateException(
            "Unknown Storage implementation: " + s.getClass().getName());
      }
    }
  }

  /**
   * Create a new instance with the {@code bufferSize} set to the specified value.
   *
   * <p><i>Default:</i> {@code 16777216 (16 MiB)}
   *
   * @param bufferSize The number of bytes to hold in the buffer before each flush. Must be &gt;=
   *     {@code 262144 (256 KiB)}
   * @return The new instance
   * @see #getBufferSize()
   * @since 2.34.0 This new api is in preview and is subject to breaking changes.
   */
  @BetaApi
  public BidiBlobWriteSessionConfig withBufferSize(int bufferSize) {
    Preconditions.checkArgument(
        bufferSize >= ByteSizeConstants._256KiB,
        "bufferSize must be >= %d",
        ByteSizeConstants._256KiB);
    return new BidiBlobWriteSessionConfig(bufferSize);
  }

  private static final class DecoratedWritableByteChannelSession<WBC extends WritableByteChannel, T>
      implements WritableByteChannelSession<WBC, BlobInfo> {

    private final WritableByteChannelSession<WBC, T> delegate;
    private final Conversions.Decoder<T, BlobInfo> decoder;

    private DecoratedWritableByteChannelSession(
        WritableByteChannelSession<WBC, T> delegate, Conversions.Decoder<T, BlobInfo> decoder) {
      this.delegate = delegate;
      this.decoder = decoder;
    }

    @Override
    public WBC open() {
      try {
        return WritableByteChannelSession.super.open();
      } catch (Exception e) {
        throw StorageException.coalesce(e);
      }
    }

    @Override
    public ApiFuture<WBC> openAsync() {
      return delegate.openAsync();
    }

    @Override
    public ApiFuture<BlobInfo> getResult() {
      return ApiFutures.transform(
          delegate.getResult(), decoder::decode, MoreExecutors.directExecutor());
    }
  }

  private static final class LazySession<R>
      implements WritableByteChannelSession<
          BufferedWritableByteChannelSession.BufferedWritableByteChannel, R> {
    private final LazyWriteChannel<R> lazy;

    private LazySession(LazyWriteChannel<R> lazy) {
      this.lazy = lazy;
    }

    @Override
    public ApiFuture<BufferedWritableByteChannelSession.BufferedWritableByteChannel> openAsync() {
      return lazy.getSession().openAsync();
    }

    @Override
    public ApiFuture<R> getResult() {
      return lazy.getSession().getResult();
    }
  }
}
