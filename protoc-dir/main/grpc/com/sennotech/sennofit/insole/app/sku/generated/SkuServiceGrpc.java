package com.sennotech.sennofit.insole.app.sku.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * 商品服务
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.14.0)",
    comments = "Source: com/sennotech/sennofit/insole/app/proto/sku.proto")
public final class SkuServiceGrpc {

  private SkuServiceGrpc() {}

  public static final String SERVICE_NAME = "insole.app.sku.SkuService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sennotech.sennofit.insole.app.sku.generated.CreateSkuRequest,
      com.sennotech.sennofit.insole.app.sku.generated.SkuDetailResponse> getCreateSkuMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSku",
      requestType = com.sennotech.sennofit.insole.app.sku.generated.CreateSkuRequest.class,
      responseType = com.sennotech.sennofit.insole.app.sku.generated.SkuDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sennotech.sennofit.insole.app.sku.generated.CreateSkuRequest,
      com.sennotech.sennofit.insole.app.sku.generated.SkuDetailResponse> getCreateSkuMethod() {
    io.grpc.MethodDescriptor<com.sennotech.sennofit.insole.app.sku.generated.CreateSkuRequest, com.sennotech.sennofit.insole.app.sku.generated.SkuDetailResponse> getCreateSkuMethod;
    if ((getCreateSkuMethod = SkuServiceGrpc.getCreateSkuMethod) == null) {
      synchronized (SkuServiceGrpc.class) {
        if ((getCreateSkuMethod = SkuServiceGrpc.getCreateSkuMethod) == null) {
          SkuServiceGrpc.getCreateSkuMethod = getCreateSkuMethod = 
              io.grpc.MethodDescriptor.<com.sennotech.sennofit.insole.app.sku.generated.CreateSkuRequest, com.sennotech.sennofit.insole.app.sku.generated.SkuDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "insole.app.sku.SkuService", "CreateSku"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sennotech.sennofit.insole.app.sku.generated.CreateSkuRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sennotech.sennofit.insole.app.sku.generated.SkuDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SkuServiceMethodDescriptorSupplier("CreateSku"))
                  .build();
          }
        }
     }
     return getCreateSkuMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sennotech.sennofit.insole.app.sku.generated.ListSkuRequest,
      com.sennotech.sennofit.insole.app.sku.generated.ListSkuResponse> getListSkuMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSku",
      requestType = com.sennotech.sennofit.insole.app.sku.generated.ListSkuRequest.class,
      responseType = com.sennotech.sennofit.insole.app.sku.generated.ListSkuResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sennotech.sennofit.insole.app.sku.generated.ListSkuRequest,
      com.sennotech.sennofit.insole.app.sku.generated.ListSkuResponse> getListSkuMethod() {
    io.grpc.MethodDescriptor<com.sennotech.sennofit.insole.app.sku.generated.ListSkuRequest, com.sennotech.sennofit.insole.app.sku.generated.ListSkuResponse> getListSkuMethod;
    if ((getListSkuMethod = SkuServiceGrpc.getListSkuMethod) == null) {
      synchronized (SkuServiceGrpc.class) {
        if ((getListSkuMethod = SkuServiceGrpc.getListSkuMethod) == null) {
          SkuServiceGrpc.getListSkuMethod = getListSkuMethod = 
              io.grpc.MethodDescriptor.<com.sennotech.sennofit.insole.app.sku.generated.ListSkuRequest, com.sennotech.sennofit.insole.app.sku.generated.ListSkuResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "insole.app.sku.SkuService", "ListSku"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sennotech.sennofit.insole.app.sku.generated.ListSkuRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sennotech.sennofit.insole.app.sku.generated.ListSkuResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SkuServiceMethodDescriptorSupplier("ListSku"))
                  .build();
          }
        }
     }
     return getListSkuMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sennotech.sennofit.insole.app.sku.generated.GetSkuRequest,
      com.sennotech.sennofit.insole.app.sku.generated.SkuDetailResponse> getGetSkuMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSku",
      requestType = com.sennotech.sennofit.insole.app.sku.generated.GetSkuRequest.class,
      responseType = com.sennotech.sennofit.insole.app.sku.generated.SkuDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sennotech.sennofit.insole.app.sku.generated.GetSkuRequest,
      com.sennotech.sennofit.insole.app.sku.generated.SkuDetailResponse> getGetSkuMethod() {
    io.grpc.MethodDescriptor<com.sennotech.sennofit.insole.app.sku.generated.GetSkuRequest, com.sennotech.sennofit.insole.app.sku.generated.SkuDetailResponse> getGetSkuMethod;
    if ((getGetSkuMethod = SkuServiceGrpc.getGetSkuMethod) == null) {
      synchronized (SkuServiceGrpc.class) {
        if ((getGetSkuMethod = SkuServiceGrpc.getGetSkuMethod) == null) {
          SkuServiceGrpc.getGetSkuMethod = getGetSkuMethod = 
              io.grpc.MethodDescriptor.<com.sennotech.sennofit.insole.app.sku.generated.GetSkuRequest, com.sennotech.sennofit.insole.app.sku.generated.SkuDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "insole.app.sku.SkuService", "GetSku"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sennotech.sennofit.insole.app.sku.generated.GetSkuRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sennotech.sennofit.insole.app.sku.generated.SkuDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SkuServiceMethodDescriptorSupplier("GetSku"))
                  .build();
          }
        }
     }
     return getGetSkuMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SkuServiceStub newStub(io.grpc.Channel channel) {
    return new SkuServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SkuServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SkuServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SkuServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SkuServiceFutureStub(channel);
  }

  /**
   * <pre>
   * 商品服务
   * </pre>
   */
  public static abstract class SkuServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createSku(com.sennotech.sennofit.insole.app.sku.generated.CreateSkuRequest request,
        io.grpc.stub.StreamObserver<com.sennotech.sennofit.insole.app.sku.generated.SkuDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateSkuMethod(), responseObserver);
    }

    /**
     */
    public void listSku(com.sennotech.sennofit.insole.app.sku.generated.ListSkuRequest request,
        io.grpc.stub.StreamObserver<com.sennotech.sennofit.insole.app.sku.generated.ListSkuResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListSkuMethod(), responseObserver);
    }

    /**
     */
    public void getSku(com.sennotech.sennofit.insole.app.sku.generated.GetSkuRequest request,
        io.grpc.stub.StreamObserver<com.sennotech.sennofit.insole.app.sku.generated.SkuDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSkuMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateSkuMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sennotech.sennofit.insole.app.sku.generated.CreateSkuRequest,
                com.sennotech.sennofit.insole.app.sku.generated.SkuDetailResponse>(
                  this, METHODID_CREATE_SKU)))
          .addMethod(
            getListSkuMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sennotech.sennofit.insole.app.sku.generated.ListSkuRequest,
                com.sennotech.sennofit.insole.app.sku.generated.ListSkuResponse>(
                  this, METHODID_LIST_SKU)))
          .addMethod(
            getGetSkuMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sennotech.sennofit.insole.app.sku.generated.GetSkuRequest,
                com.sennotech.sennofit.insole.app.sku.generated.SkuDetailResponse>(
                  this, METHODID_GET_SKU)))
          .build();
    }
  }

  /**
   * <pre>
   * 商品服务
   * </pre>
   */
  public static final class SkuServiceStub extends io.grpc.stub.AbstractStub<SkuServiceStub> {
    private SkuServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SkuServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SkuServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SkuServiceStub(channel, callOptions);
    }

    /**
     */
    public void createSku(com.sennotech.sennofit.insole.app.sku.generated.CreateSkuRequest request,
        io.grpc.stub.StreamObserver<com.sennotech.sennofit.insole.app.sku.generated.SkuDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateSkuMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listSku(com.sennotech.sennofit.insole.app.sku.generated.ListSkuRequest request,
        io.grpc.stub.StreamObserver<com.sennotech.sennofit.insole.app.sku.generated.ListSkuResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSkuMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSku(com.sennotech.sennofit.insole.app.sku.generated.GetSkuRequest request,
        io.grpc.stub.StreamObserver<com.sennotech.sennofit.insole.app.sku.generated.SkuDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSkuMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 商品服务
   * </pre>
   */
  public static final class SkuServiceBlockingStub extends io.grpc.stub.AbstractStub<SkuServiceBlockingStub> {
    private SkuServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SkuServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SkuServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SkuServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sennotech.sennofit.insole.app.sku.generated.SkuDetailResponse createSku(com.sennotech.sennofit.insole.app.sku.generated.CreateSkuRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateSkuMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sennotech.sennofit.insole.app.sku.generated.ListSkuResponse listSku(com.sennotech.sennofit.insole.app.sku.generated.ListSkuRequest request) {
      return blockingUnaryCall(
          getChannel(), getListSkuMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sennotech.sennofit.insole.app.sku.generated.SkuDetailResponse getSku(com.sennotech.sennofit.insole.app.sku.generated.GetSkuRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSkuMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 商品服务
   * </pre>
   */
  public static final class SkuServiceFutureStub extends io.grpc.stub.AbstractStub<SkuServiceFutureStub> {
    private SkuServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SkuServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SkuServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SkuServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sennotech.sennofit.insole.app.sku.generated.SkuDetailResponse> createSku(
        com.sennotech.sennofit.insole.app.sku.generated.CreateSkuRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateSkuMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sennotech.sennofit.insole.app.sku.generated.ListSkuResponse> listSku(
        com.sennotech.sennofit.insole.app.sku.generated.ListSkuRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListSkuMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sennotech.sennofit.insole.app.sku.generated.SkuDetailResponse> getSku(
        com.sennotech.sennofit.insole.app.sku.generated.GetSkuRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSkuMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SKU = 0;
  private static final int METHODID_LIST_SKU = 1;
  private static final int METHODID_GET_SKU = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SkuServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SkuServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_SKU:
          serviceImpl.createSku((com.sennotech.sennofit.insole.app.sku.generated.CreateSkuRequest) request,
              (io.grpc.stub.StreamObserver<com.sennotech.sennofit.insole.app.sku.generated.SkuDetailResponse>) responseObserver);
          break;
        case METHODID_LIST_SKU:
          serviceImpl.listSku((com.sennotech.sennofit.insole.app.sku.generated.ListSkuRequest) request,
              (io.grpc.stub.StreamObserver<com.sennotech.sennofit.insole.app.sku.generated.ListSkuResponse>) responseObserver);
          break;
        case METHODID_GET_SKU:
          serviceImpl.getSku((com.sennotech.sennofit.insole.app.sku.generated.GetSkuRequest) request,
              (io.grpc.stub.StreamObserver<com.sennotech.sennofit.insole.app.sku.generated.SkuDetailResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SkuServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SkuServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sennotech.sennofit.insole.app.sku.generated.Sku.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SkuService");
    }
  }

  private static final class SkuServiceFileDescriptorSupplier
      extends SkuServiceBaseDescriptorSupplier {
    SkuServiceFileDescriptorSupplier() {}
  }

  private static final class SkuServiceMethodDescriptorSupplier
      extends SkuServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SkuServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SkuServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SkuServiceFileDescriptorSupplier())
              .addMethod(getCreateSkuMethod())
              .addMethod(getListSkuMethod())
              .addMethod(getGetSkuMethod())
              .build();
        }
      }
    }
    return result;
  }
}
