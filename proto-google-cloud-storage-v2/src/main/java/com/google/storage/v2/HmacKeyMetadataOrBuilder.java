/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/storage/v2/storage.proto

package com.google.storage.v2;

public interface HmacKeyMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.storage.v2.HmacKeyMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Immutable. Resource name ID of the key in the format
   * {projectIdentifier}/{accessId}.
   * {projectIdentifier} can be the project ID or project number.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Immutable. Resource name ID of the key in the format
   * {projectIdentifier}/{accessId}.
   * {projectIdentifier} can be the project ID or project number.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Immutable. Globally unique id for keys.
   * </pre>
   *
   * <code>string access_id = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The accessId.
   */
  java.lang.String getAccessId();
  /**
   *
   *
   * <pre>
   * Immutable. Globally unique id for keys.
   * </pre>
   *
   * <code>string access_id = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for accessId.
   */
  com.google.protobuf.ByteString getAccessIdBytes();

  /**
   *
   *
   * <pre>
   * Immutable. Identifies the project that owns the service account of the
   * specified HMAC key, in the format "projects/{projectIdentifier}".
   * {projectIdentifier} can be the project ID or project number.
   * </pre>
   *
   * <code>
   * string project = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The project.
   */
  java.lang.String getProject();
  /**
   *
   *
   * <pre>
   * Immutable. Identifies the project that owns the service account of the
   * specified HMAC key, in the format "projects/{projectIdentifier}".
   * {projectIdentifier} can be the project ID or project number.
   * </pre>
   *
   * <code>
   * string project = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString getProjectBytes();

  /**
   *
   *
   * <pre>
   * Output only. Email of the service account the key authenticates as.
   * </pre>
   *
   * <code>string service_account_email = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The serviceAccountEmail.
   */
  java.lang.String getServiceAccountEmail();
  /**
   *
   *
   * <pre>
   * Output only. Email of the service account the key authenticates as.
   * </pre>
   *
   * <code>string service_account_email = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for serviceAccountEmail.
   */
  com.google.protobuf.ByteString getServiceAccountEmailBytes();

  /**
   *
   *
   * <pre>
   * State of the key. One of ACTIVE, INACTIVE, or DELETED.
   * Writable, can be updated by UpdateHmacKey operation.
   * </pre>
   *
   * <code>string state = 5;</code>
   *
   * @return The state.
   */
  java.lang.String getState();
  /**
   *
   *
   * <pre>
   * State of the key. One of ACTIVE, INACTIVE, or DELETED.
   * Writable, can be updated by UpdateHmacKey operation.
   * </pre>
   *
   * <code>string state = 5;</code>
   *
   * @return The bytes for state.
   */
  com.google.protobuf.ByteString getStateBytes();

  /**
   *
   *
   * <pre>
   * Output only. The creation time of the HMAC key.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation time of the HMAC key.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation time of the HMAC key.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The last modification time of the HMAC key metadata.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last modification time of the HMAC key metadata.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last modification time of the HMAC key metadata.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The etag of the HMAC key.
   * </pre>
   *
   * <code>string etag = 8;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * The etag of the HMAC key.
   * </pre>
   *
   * <code>string etag = 8;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();
}
