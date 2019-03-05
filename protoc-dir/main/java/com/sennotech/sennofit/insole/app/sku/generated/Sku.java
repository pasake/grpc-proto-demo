// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sennotech/sennofit/insole/app/proto/sku.proto

package com.sennotech.sennofit.insole.app.sku.generated;

public final class Sku {
  private Sku() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_insole_app_sku_UpdateSkuRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_insole_app_sku_UpdateSkuRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_insole_app_sku_UpdateSkuResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_insole_app_sku_UpdateSkuResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_insole_app_sku_CreateSkuRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_insole_app_sku_CreateSkuRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_insole_app_sku_SkuDetailResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_insole_app_sku_SkuDetailResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_insole_app_sku_SkuDetail_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_insole_app_sku_SkuDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_insole_app_sku_ListSkuResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_insole_app_sku_ListSkuResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_insole_app_sku_ListSkuRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_insole_app_sku_ListSkuRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_insole_app_sku_GetSkuRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_insole_app_sku_GetSkuRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1com/sennotech/sennofit/insole/app/prot" +
      "o/sku.proto\022\016insole.app.sku\032\034google/api/" +
      "annotations.proto\032\036google/protobuf/wrapp" +
      "ers.proto\032\037google/protobuf/timestamp.pro" +
      "to\"S\n\020UpdateSkuRequest\022\017\n\007skuName\030\001 \001(\t\022" +
      "\020\n\010oriPrice\030\003 \001(\005\022\020\n\010curPrice\030\004 \001(\005\022\n\n\002i" +
      "d\030\005 \001(\t\"\023\n\021UpdateSkuResponse\"W\n\020CreateSk" +
      "uRequest\022\017\n\007skuName\030\001 \001(\t\022\016\n\006skuUrl\030\002 \001(" +
      "\t\022\020\n\010oriPrice\030\003 \001(\005\022\020\n\010curPrice\030\004 \001(\005\"A\n" +
      "\021SkuDetailResponse\022,\n\tskuDetail\030\001 \001(\0132\031." +
      "insole.app.sku.SkuDetail\"\210\001\n\tSkuDetail\022\017" +
      "\n\007skuName\030\001 \001(\t\022\016\n\006picUrl\030\002 \001(\t\022\020\n\010oriPr" +
      "ice\030\003 \001(\005\022\020\n\010curPrice\030\004 \001(\005\022\n\n\002id\030\005 \001(\t\022" +
      "*\n\004desc\030\006 \001(\0132\034.google.protobuf.StringVa" +
      "lue\";\n\017ListSkuResponse\022(\n\005items\030\001 \003(\0132\031." +
      "insole.app.sku.SkuDetail\"\020\n\016ListSkuReque" +
      "st\"\033\n\rGetSkuRequest\022\n\n\002id\030\001 \001(\t2\242\003\n\nSkuS" +
      "ervice\022P\n\tCreateSku\022 .insole.app.sku.Cre" +
      "ateSkuRequest\032!.insole.app.sku.SkuDetail" +
      "Response\022v\n\007ListSku\022\036.insole.app.sku.Lis" +
      "tSkuRequest\032\037.insole.app.sku.ListSkuResp" +
      "onse\"*\202\323\344\223\002$\022\"/insole.app.sku.SkuService" +
      "/ListSku\022J\n\006GetSku\022\035.insole.app.sku.GetS" +
      "kuRequest\032!.insole.app.sku.SkuDetailResp" +
      "onse\022~\n\tUpdateSku\022 .insole.app.sku.Updat" +
      "eSkuRequest\032!.insole.app.sku.UpdateSkuRe" +
      "sponse\",\202\323\344\223\002&\032$/insole.app.sku.SkuServi" +
      "ce/UpdateSkuB3\n/com.sennotech.sennofit.i" +
      "nsole.app.sku.generatedP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_insole_app_sku_UpdateSkuRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_insole_app_sku_UpdateSkuRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_insole_app_sku_UpdateSkuRequest_descriptor,
        new java.lang.String[] { "SkuName", "OriPrice", "CurPrice", "Id", });
    internal_static_insole_app_sku_UpdateSkuResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_insole_app_sku_UpdateSkuResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_insole_app_sku_UpdateSkuResponse_descriptor,
        new java.lang.String[] { });
    internal_static_insole_app_sku_CreateSkuRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_insole_app_sku_CreateSkuRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_insole_app_sku_CreateSkuRequest_descriptor,
        new java.lang.String[] { "SkuName", "SkuUrl", "OriPrice", "CurPrice", });
    internal_static_insole_app_sku_SkuDetailResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_insole_app_sku_SkuDetailResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_insole_app_sku_SkuDetailResponse_descriptor,
        new java.lang.String[] { "SkuDetail", });
    internal_static_insole_app_sku_SkuDetail_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_insole_app_sku_SkuDetail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_insole_app_sku_SkuDetail_descriptor,
        new java.lang.String[] { "SkuName", "PicUrl", "OriPrice", "CurPrice", "Id", "Desc", });
    internal_static_insole_app_sku_ListSkuResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_insole_app_sku_ListSkuResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_insole_app_sku_ListSkuResponse_descriptor,
        new java.lang.String[] { "Items", });
    internal_static_insole_app_sku_ListSkuRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_insole_app_sku_ListSkuRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_insole_app_sku_ListSkuRequest_descriptor,
        new java.lang.String[] { });
    internal_static_insole_app_sku_GetSkuRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_insole_app_sku_GetSkuRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_insole_app_sku_GetSkuRequest_descriptor,
        new java.lang.String[] { "Id", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
