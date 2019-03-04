// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/sennotech/sennofit/insole/app/proto/order.proto

package com.sennotech.sennofit.insole.app.order.generated;

public final class Order {
  private Order() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_insole_app_order_CreateOrderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_insole_app_order_CreateOrderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_insole_app_order_CreateOrderResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_insole_app_order_CreateOrderResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_insole_app_order_ReportDetail_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_insole_app_order_ReportDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_insole_app_order_OrderDetailResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_insole_app_order_OrderDetailResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_insole_app_order_OrderDetail_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_insole_app_order_OrderDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_insole_app_order_ListOrderResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_insole_app_order_ListOrderResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_insole_app_order_ListOrderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_insole_app_order_ListOrderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_insole_app_order_GetOrderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_insole_app_order_GetOrderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_insole_app_order_AddressDetail_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_insole_app_order_AddressDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_insole_app_order_OrderItemDetailRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_insole_app_order_OrderItemDetailRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_insole_app_order_OrderItemDetailResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_insole_app_order_OrderItemDetailResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3com/sennotech/sennofit/insole/app/prot" +
      "o/order.proto\022\020insole.app.order\032\034google/" +
      "api/annotations.proto\032\036google/protobuf/w" +
      "rappers.proto\032\037google/protobuf/timestamp" +
      ".proto\0321com/sennotech/sennofit/insole/ap" +
      "p/proto/sku.proto\"\322\001\n\022CreateOrderRequest" +
      "\0220\n\007address\030\002 \001(\0132\037.insole.app.order.Add" +
      "ressDetail\022<\n\norderItems\030\003 \003(\0132(.insole." +
      "app.order.OrderItemDetailRequest\022\026\n\016orga" +
      "nizationId\030\004 \001(\003\0224\n\014reportDetail\030\005 \001(\0132\036" +
      ".insole.app.order.ReportDetail\"\025\n\023Create" +
      "OrderResponse\"l\n\014ReportDetail\022\014\n\004gait\030\001 " +
      "\001(\t\022\024\n\014frontPosture\030\002 \001(\t\022\023\n\013sidePosture" +
      "\030\003 \001(\t\022\020\n\010leftFoot\030\004 \001(\t\022\021\n\trightFoot\030\005 " +
      "\001(\t\"I\n\023OrderDetailResponse\0222\n\013orderDetai" +
      "l\030\001 \001(\0132\035.insole.app.order.OrderDetail\"\212" +
      "\001\n\013OrderDetail\022\n\n\002id\030\001 \001(\t\0220\n\007address\030\002 " +
      "\001(\0132\037.insole.app.order.AddressDetail\022=\n\n" +
      "orderItems\030\003 \003(\0132).insole.app.order.Orde" +
      "rItemDetailResponse\"F\n\021ListOrderResponse" +
      "\0221\n\norderItems\030\001 \003(\0132\035.insole.app.order." +
      "OrderDetail\"\022\n\020ListOrderRequest\"\035\n\017GetOr" +
      "derRequest\022\n\n\002id\030\001 \001(\003\"U\n\rAddressDetail\022" +
      "\027\n\017shippingAddress\030\002 \001(\t\022\024\n\014customerName" +
      "\030\003 \001(\t\022\025\n\rcustomerPhone\030\004 \001(\t\"L\n\026OrderIt" +
      "emDetailRequest\022\021\n\tshoesSize\030\001 \001(\005\022\020\n\010qu" +
      "antity\030\002 \001(\005\022\r\n\005skuId\030\003 \001(\t\"f\n\027OrderItem" +
      "DetailResponse\022\021\n\tshoesSize\030\001 \001(\005\022\020\n\010qua" +
      "ntity\030\002 \001(\005\022&\n\003sku\030\003 \001(\0132\031.insole.app.sk" +
      "u.SkuDetail2\375\002\n\014OrderService\022\216\001\n\013CreateO" +
      "rder\022$.insole.app.order.CreateOrderReque" +
      "st\032%.insole.app.order.CreateOrderRespons" +
      "e\"2\202\323\344\223\002,\"*/insole.app.order.OrderServic" +
      "e/CreateOrder\022T\n\tListOrder\022\".insole.app." +
      "order.ListOrderRequest\032#.insole.app.orde" +
      "r.ListOrderResponse\022\205\001\n\010GetOrder\022!.insol" +
      "e.app.order.GetOrderRequest\032%.insole.app" +
      ".order.OrderDetailResponse\"/\202\323\344\223\002)\022\'/ins" +
      "ole.app.order.OrderService/GetOrderB5\n1c" +
      "om.sennotech.sennofit.insole.app.order.g" +
      "eneratedP\001b\006proto3"
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
          com.sennotech.sennofit.insole.app.sku.generated.Sku.getDescriptor(),
        }, assigner);
    internal_static_insole_app_order_CreateOrderRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_insole_app_order_CreateOrderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_insole_app_order_CreateOrderRequest_descriptor,
        new java.lang.String[] { "Address", "OrderItems", "OrganizationId", "ReportDetail", });
    internal_static_insole_app_order_CreateOrderResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_insole_app_order_CreateOrderResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_insole_app_order_CreateOrderResponse_descriptor,
        new java.lang.String[] { });
    internal_static_insole_app_order_ReportDetail_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_insole_app_order_ReportDetail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_insole_app_order_ReportDetail_descriptor,
        new java.lang.String[] { "Gait", "FrontPosture", "SidePosture", "LeftFoot", "RightFoot", });
    internal_static_insole_app_order_OrderDetailResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_insole_app_order_OrderDetailResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_insole_app_order_OrderDetailResponse_descriptor,
        new java.lang.String[] { "OrderDetail", });
    internal_static_insole_app_order_OrderDetail_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_insole_app_order_OrderDetail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_insole_app_order_OrderDetail_descriptor,
        new java.lang.String[] { "Id", "Address", "OrderItems", });
    internal_static_insole_app_order_ListOrderResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_insole_app_order_ListOrderResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_insole_app_order_ListOrderResponse_descriptor,
        new java.lang.String[] { "OrderItems", });
    internal_static_insole_app_order_ListOrderRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_insole_app_order_ListOrderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_insole_app_order_ListOrderRequest_descriptor,
        new java.lang.String[] { });
    internal_static_insole_app_order_GetOrderRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_insole_app_order_GetOrderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_insole_app_order_GetOrderRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_insole_app_order_AddressDetail_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_insole_app_order_AddressDetail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_insole_app_order_AddressDetail_descriptor,
        new java.lang.String[] { "ShippingAddress", "CustomerName", "CustomerPhone", });
    internal_static_insole_app_order_OrderItemDetailRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_insole_app_order_OrderItemDetailRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_insole_app_order_OrderItemDetailRequest_descriptor,
        new java.lang.String[] { "ShoesSize", "Quantity", "SkuId", });
    internal_static_insole_app_order_OrderItemDetailResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_insole_app_order_OrderItemDetailResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_insole_app_order_OrderItemDetailResponse_descriptor,
        new java.lang.String[] { "ShoesSize", "Quantity", "Sku", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.sennotech.sennofit.insole.app.sku.generated.Sku.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
