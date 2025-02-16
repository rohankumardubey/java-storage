/*
 * Copyright 2024 Google LLC
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
// source: google/storage/control/v2/storage_control.proto

// Protobuf Java Version: 3.25.2
package com.google.storage.control.v2;

public final class StorageControlProto {
  private StorageControlProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_storage_control_v2_PendingRenameInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_storage_control_v2_PendingRenameInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_storage_control_v2_Folder_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_storage_control_v2_Folder_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_storage_control_v2_GetFolderRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_storage_control_v2_GetFolderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_storage_control_v2_CreateFolderRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_storage_control_v2_CreateFolderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_storage_control_v2_DeleteFolderRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_storage_control_v2_DeleteFolderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_storage_control_v2_ListFoldersRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_storage_control_v2_ListFoldersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_storage_control_v2_ListFoldersResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_storage_control_v2_ListFoldersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_storage_control_v2_RenameFolderRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_storage_control_v2_RenameFolderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_storage_control_v2_CommonLongRunningOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_storage_control_v2_CommonLongRunningOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_storage_control_v2_RenameFolderMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_storage_control_v2_RenameFolderMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_storage_control_v2_StorageLayout_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_storage_control_v2_StorageLayout_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_storage_control_v2_StorageLayout_CustomPlacementConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_storage_control_v2_StorageLayout_CustomPlacementConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_storage_control_v2_StorageLayout_HierarchicalNamespace_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_storage_control_v2_StorageLayout_HierarchicalNamespace_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_storage_control_v2_GetStorageLayoutRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_storage_control_v2_GetStorageLayoutRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/storage/control/v2/storage_cont"
          + "rol.proto\022\031google.storage.control.v2\032\027go"
          + "ogle/api/client.proto\032\037google/api/field_"
          + "behavior.proto\032\033google/api/field_info.pr"
          + "oto\032\031google/api/resource.proto\032\030google/a"
          + "pi/routing.proto\032#google/longrunning/ope"
          + "rations.proto\032\033google/protobuf/empty.pro"
          + "to\032\037google/protobuf/timestamp.proto\"+\n\021P"
          + "endingRenameInfo\022\026\n\toperation\030\001 \001(\tB\003\340A\003"
          + "\"\342\002\n\006Folder\022\021\n\004name\030\001 \001(\tB\003\340A\010\022\033\n\016metage"
          + "neration\030\003 \001(\003B\003\340A\003\0224\n\013create_time\030\004 \001(\013"
          + "2\032.google.protobuf.TimestampB\003\340A\003\0224\n\013upd"
          + "ate_time\030\005 \001(\0132\032.google.protobuf.Timesta"
          + "mpB\003\340A\003\022N\n\023pending_rename_info\030\007 \001(\0132,.g"
          + "oogle.storage.control.v2.PendingRenameIn"
          + "foB\003\340A\003:l\352Ai\n\035storage.googleapis.com/Fol"
          + "der\0227projects/{project}/buckets/{bucket}"
          + "/folders/{folder=**}*\007folders2\006folder\"\364\001"
          + "\n\020GetFolderRequest\0223\n\004name\030\006 \001(\tB%\340A\002\372A\037"
          + "\n\035storage.googleapis.com/Folder\022$\n\027if_me"
          + "tageneration_match\030\003 \001(\003H\000\210\001\001\022(\n\033if_meta"
          + "generation_not_match\030\004 \001(\003H\001\210\001\001\022\037\n\nreque"
          + "st_id\030\005 \001(\tB\013\340A\001\342\214\317\327\010\002\010\001B\032\n\030_if_metagene"
          + "ration_matchB\036\n\034_if_metageneration_not_m"
          + "atch\"\325\001\n\023CreateFolderRequest\0225\n\006parent\030\001"
          + " \001(\tB%\340A\002\372A\037\022\035storage.googleapis.com/Fol"
          + "der\0226\n\006folder\030\002 \001(\0132!.google.storage.con"
          + "trol.v2.FolderB\003\340A\002\022\026\n\tfolder_id\030\003 \001(\tB\003"
          + "\340A\002\022\026\n\trecursive\030\004 \001(\010B\003\340A\001\022\037\n\nrequest_i"
          + "d\030\005 \001(\tB\013\340A\001\342\214\317\327\010\002\010\001\"\367\001\n\023DeleteFolderReq"
          + "uest\0223\n\004name\030\006 \001(\tB%\340A\002\372A\037\n\035storage.goog"
          + "leapis.com/Folder\022$\n\027if_metageneration_m"
          + "atch\030\003 \001(\003H\000\210\001\001\022(\n\033if_metageneration_not"
          + "_match\030\004 \001(\003H\001\210\001\001\022\037\n\nrequest_id\030\005 \001(\tB\013\340"
          + "A\001\342\214\317\327\010\002\010\001B\032\n\030_if_metageneration_matchB\036"
          + "\n\034_if_metageneration_not_match\"\214\002\n\022ListF"
          + "oldersRequest\0225\n\006parent\030\001 \001(\tB%\340A\002\372A\037\022\035s"
          + "torage.googleapis.com/Folder\022\026\n\tpage_siz"
          + "e\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\tB\003\340A\001\022\023\n"
          + "\006prefix\030\004 \001(\tB\003\340A\001\022\026\n\tdelimiter\030\010 \001(\tB\003\340"
          + "A\001\022 \n\023lexicographic_start\030\006 \001(\tB\003\340A\001\022\036\n\021"
          + "lexicographic_end\030\007 \001(\tB\003\340A\001\022\037\n\nrequest_"
          + "id\030\t \001(\tB\013\340A\001\342\214\317\327\010\002\010\001\"b\n\023ListFoldersResp"
          + "onse\0222\n\007folders\030\001 \003(\0132!.google.storage.c"
          + "ontrol.v2.Folder\022\027\n\017next_page_token\030\002 \001("
          + "\t\"\233\002\n\023RenameFolderRequest\0223\n\004name\030\007 \001(\tB"
          + "%\340A\002\372A\037\n\035storage.googleapis.com/Folder\022\""
          + "\n\025destination_folder_id\030\010 \001(\tB\003\340A\002\022$\n\027if"
          + "_metageneration_match\030\004 \001(\003H\000\210\001\001\022(\n\033if_m"
          + "etageneration_not_match\030\005 \001(\003H\001\210\001\001\022\037\n\nre"
          + "quest_id\030\006 \001(\tB\013\340A\001\342\214\317\327\010\002\010\001B\032\n\030_if_metag"
          + "eneration_matchB\036\n\034_if_metageneration_no"
          + "t_match\"\232\002\n\"CommonLongRunningOperationMe"
          + "tadata\0224\n\013create_time\030\001 \001(\0132\032.google.pro"
          + "tobuf.TimestampB\003\340A\003\0221\n\010end_time\030\002 \001(\0132\032"
          + ".google.protobuf.TimestampB\003\340A\003\0224\n\013updat"
          + "e_time\030\003 \001(\0132\032.google.protobuf.Timestamp"
          + "B\003\340A\003\022\021\n\004type\030\004 \001(\tB\003\340A\003\022#\n\026requested_ca"
          + "ncellation\030\005 \001(\010B\003\340A\003\022\035\n\020progress_percen"
          + "t\030\006 \001(\005B\003\340A\003\"\247\001\n\024RenameFolderMetadata\022V\n"
          + "\017common_metadata\030\001 \001(\0132=.google.storage."
          + "control.v2.CommonLongRunningOperationMet"
          + "adata\022\030\n\020source_folder_id\030\002 \001(\t\022\035\n\025desti"
          + "nation_folder_id\030\003 \001(\t\"\331\003\n\rStorageLayout"
          + "\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\025\n\010location\030\002 \001(\tB\003\340"
          + "A\003\022\032\n\rlocation_type\030\003 \001(\tB\003\340A\003\022d\n\027custom"
          + "_placement_config\030\004 \001(\0132>.google.storage"
          + ".control.v2.StorageLayout.CustomPlacemen"
          + "tConfigB\003\340A\003\022c\n\026hierarchical_namespace\030\005"
          + " \001(\0132>.google.storage.control.v2.Storage"
          + "Layout.HierarchicalNamespaceB\003\340A\003\032/\n\025Cus"
          + "tomPlacementConfig\022\026\n\016data_locations\030\001 \003"
          + "(\t\032(\n\025HierarchicalNamespace\022\017\n\007enabled\030\001"
          + " \001(\010:\\\352AY\n$storage.googleapis.com/Storag"
          + "eLayout\0221projects/{project}/buckets/{buc"
          + "ket}/storageLayout\"\206\001\n\027GetStorageLayoutR"
          + "equest\022:\n\004name\030\001 \001(\tB,\340A\002\372A&\n$storage.go"
          + "ogleapis.com/StorageLayout\022\016\n\006prefix\030\002 \001"
          + "(\t\022\037\n\nrequest_id\030\003 \001(\tB\013\340A\001\342\214\317\327\010\002\010\0012\223\n\n\016"
          + "StorageControl\022\232\001\n\014CreateFolder\022..google"
          + ".storage.control.v2.CreateFolderRequest\032"
          + "!.google.storage.control.v2.Folder\"7\332A\027p"
          + "arent,folder,folder_id\212\323\344\223\002\027\022\025\n\006parent\022\013"
          + "{bucket=**}\022\217\001\n\014DeleteFolder\022..google.st"
          + "orage.control.v2.DeleteFolderRequest\032\026.g"
          + "oogle.protobuf.Empty\"7\332A\004name\212\323\344\223\002*\022(\n\004n"
          + "ame\022 {bucket=projects/*/buckets/*}/**\022\224\001"
          + "\n\tGetFolder\022+.google.storage.control.v2."
          + "GetFolderRequest\032!.google.storage.contro"
          + "l.v2.Folder\"7\332A\004name\212\323\344\223\002*\022(\n\004name\022 {buc"
          + "ket=projects/*/buckets/*}/**\022\224\001\n\013ListFol"
          + "ders\022-.google.storage.control.v2.ListFol"
          + "dersRequest\032..google.storage.control.v2."
          + "ListFoldersResponse\"&\332A\006parent\212\323\344\223\002\027\022\025\n\006"
          + "parent\022\013{bucket=**}\022\315\001\n\014RenameFolder\022..g"
          + "oogle.storage.control.v2.RenameFolderReq"
          + "uest\032\035.google.longrunning.Operation\"n\312A\036"
          + "\n\006Folder\022\024RenameFolderMetadata\332A\032name,de"
          + "stination_folder_id\212\323\344\223\002*\022(\n\004name\022 {buck"
          + "et=projects/*/buckets/*}/**\022\251\001\n\020GetStora"
          + "geLayout\0222.google.storage.control.v2.Get"
          + "StorageLayoutRequest\032(.google.storage.co"
          + "ntrol.v2.StorageLayout\"7\332A\004name\212\323\344\223\002*\022(\n"
          + "\004name\022 {bucket=projects/*/buckets/*}/**\032"
          + "\247\002\312A\026storage.googleapis.com\322A\212\002https://w"
          + "ww.googleapis.com/auth/cloud-platform,ht"
          + "tps://www.googleapis.com/auth/cloud-plat"
          + "form.read-only,https://www.googleapis.co"
          + "m/auth/devstorage.full_control,https://w"
          + "ww.googleapis.com/auth/devstorage.read_o"
          + "nly,https://www.googleapis.com/auth/devs"
          + "torage.read_writeB\312\001\n\035com.google.storage"
          + ".control.v2B\023StorageControlProtoP\001ZKclou"
          + "d.google.com/go/storage/control/apiv2/st"
          + "oragecontrolpb;storagecontrolpb\352AD\n\035stor"
          + "age.googleapis.com/Bucket\022#projects/{pro"
          + "ject}/buckets/{bucket}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.FieldInfoProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.api.RoutingProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_storage_control_v2_PendingRenameInfo_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_storage_control_v2_PendingRenameInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_storage_control_v2_PendingRenameInfo_descriptor,
            new java.lang.String[] {
              "Operation",
            });
    internal_static_google_storage_control_v2_Folder_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_storage_control_v2_Folder_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_storage_control_v2_Folder_descriptor,
            new java.lang.String[] {
              "Name", "Metageneration", "CreateTime", "UpdateTime", "PendingRenameInfo",
            });
    internal_static_google_storage_control_v2_GetFolderRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_storage_control_v2_GetFolderRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_storage_control_v2_GetFolderRequest_descriptor,
            new java.lang.String[] {
              "Name", "IfMetagenerationMatch", "IfMetagenerationNotMatch", "RequestId",
            });
    internal_static_google_storage_control_v2_CreateFolderRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_storage_control_v2_CreateFolderRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_storage_control_v2_CreateFolderRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Folder", "FolderId", "Recursive", "RequestId",
            });
    internal_static_google_storage_control_v2_DeleteFolderRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_storage_control_v2_DeleteFolderRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_storage_control_v2_DeleteFolderRequest_descriptor,
            new java.lang.String[] {
              "Name", "IfMetagenerationMatch", "IfMetagenerationNotMatch", "RequestId",
            });
    internal_static_google_storage_control_v2_ListFoldersRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_storage_control_v2_ListFoldersRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_storage_control_v2_ListFoldersRequest_descriptor,
            new java.lang.String[] {
              "Parent",
              "PageSize",
              "PageToken",
              "Prefix",
              "Delimiter",
              "LexicographicStart",
              "LexicographicEnd",
              "RequestId",
            });
    internal_static_google_storage_control_v2_ListFoldersResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_storage_control_v2_ListFoldersResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_storage_control_v2_ListFoldersResponse_descriptor,
            new java.lang.String[] {
              "Folders", "NextPageToken",
            });
    internal_static_google_storage_control_v2_RenameFolderRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_storage_control_v2_RenameFolderRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_storage_control_v2_RenameFolderRequest_descriptor,
            new java.lang.String[] {
              "Name",
              "DestinationFolderId",
              "IfMetagenerationMatch",
              "IfMetagenerationNotMatch",
              "RequestId",
            });
    internal_static_google_storage_control_v2_CommonLongRunningOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_storage_control_v2_CommonLongRunningOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_storage_control_v2_CommonLongRunningOperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "UpdateTime",
              "Type",
              "RequestedCancellation",
              "ProgressPercent",
            });
    internal_static_google_storage_control_v2_RenameFolderMetadata_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_storage_control_v2_RenameFolderMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_storage_control_v2_RenameFolderMetadata_descriptor,
            new java.lang.String[] {
              "CommonMetadata", "SourceFolderId", "DestinationFolderId",
            });
    internal_static_google_storage_control_v2_StorageLayout_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_storage_control_v2_StorageLayout_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_storage_control_v2_StorageLayout_descriptor,
            new java.lang.String[] {
              "Name", "Location", "LocationType", "CustomPlacementConfig", "HierarchicalNamespace",
            });
    internal_static_google_storage_control_v2_StorageLayout_CustomPlacementConfig_descriptor =
        internal_static_google_storage_control_v2_StorageLayout_descriptor.getNestedTypes().get(0);
    internal_static_google_storage_control_v2_StorageLayout_CustomPlacementConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_storage_control_v2_StorageLayout_CustomPlacementConfig_descriptor,
            new java.lang.String[] {
              "DataLocations",
            });
    internal_static_google_storage_control_v2_StorageLayout_HierarchicalNamespace_descriptor =
        internal_static_google_storage_control_v2_StorageLayout_descriptor.getNestedTypes().get(1);
    internal_static_google_storage_control_v2_StorageLayout_HierarchicalNamespace_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_storage_control_v2_StorageLayout_HierarchicalNamespace_descriptor,
            new java.lang.String[] {
              "Enabled",
            });
    internal_static_google_storage_control_v2_GetStorageLayoutRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_storage_control_v2_GetStorageLayoutRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_storage_control_v2_GetStorageLayoutRequest_descriptor,
            new java.lang.String[] {
              "Name", "Prefix", "RequestId",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.FieldInfoProto.fieldInfo);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.api.RoutingProto.routing);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.FieldInfoProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.RoutingProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
