package com.sennotech.sennofit.insole.app.stock.generated;

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
    comments = "Source: com/sennotech/sennofit/insole/app/proto/stock.proto")
public final class StockServiceGrpc {

  private StockServiceGrpc() {}

  public static final String SERVICE_NAME = "insole.app.stock.StockService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sennotech.sennofit.insole.app.stock.generated.UpdateStockRequest,
      com.sennotech.sennofit.insole.app.stock.generated.UpdateStockResponse> getUpdateStockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateStock",
      requestType = com.sennotech.sennofit.insole.app.stock.generated.UpdateStockRequest.class,
      responseType = com.sennotech.sennofit.insole.app.stock.generated.UpdateStockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sennotech.sennofit.insole.app.stock.generated.UpdateStockRequest,
      com.sennotech.sennofit.insole.app.stock.generated.UpdateStockResponse> getUpdateStockMethod() {
    io.grpc.MethodDescriptor<com.sennotech.sennofit.insole.app.stock.generated.UpdateStockRequest, com.sennotech.sennofit.insole.app.stock.generated.UpdateStockResponse> getUpdateStockMethod;
    if ((getUpdateStockMethod = StockServiceGrpc.getUpdateStockMethod) == null) {
      synchronized (StockServiceGrpc.class) {
        if ((getUpdateStockMethod = StockServiceGrpc.getUpdateStockMethod) == null) {
          StockServiceGrpc.getUpdateStockMethod = getUpdateStockMethod = 
              io.grpc.MethodDescriptor.<com.sennotech.sennofit.insole.app.stock.generated.UpdateStockRequest, com.sennotech.sennofit.insole.app.stock.generated.UpdateStockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "insole.app.stock.StockService", "UpdateStock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sennotech.sennofit.insole.app.stock.generated.UpdateStockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sennotech.sennofit.insole.app.stock.generated.UpdateStockResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StockServiceMethodDescriptorSupplier("UpdateStock"))
                  .build();
          }
        }
     }
     return getUpdateStockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sennotech.sennofit.insole.app.stock.generated.StockRequest,
      com.sennotech.sennofit.insole.app.stock.generated.StockResponse> getStockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stock",
      requestType = com.sennotech.sennofit.insole.app.stock.generated.StockRequest.class,
      responseType = com.sennotech.sennofit.insole.app.stock.generated.StockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sennotech.sennofit.insole.app.stock.generated.StockRequest,
      com.sennotech.sennofit.insole.app.stock.generated.StockResponse> getStockMethod() {
    io.grpc.MethodDescriptor<com.sennotech.sennofit.insole.app.stock.generated.StockRequest, com.sennotech.sennofit.insole.app.stock.generated.StockResponse> getStockMethod;
    if ((getStockMethod = StockServiceGrpc.getStockMethod) == null) {
      synchronized (StockServiceGrpc.class) {
        if ((getStockMethod = StockServiceGrpc.getStockMethod) == null) {
          StockServiceGrpc.getStockMethod = getStockMethod = 
              io.grpc.MethodDescriptor.<com.sennotech.sennofit.insole.app.stock.generated.StockRequest, com.sennotech.sennofit.insole.app.stock.generated.StockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "insole.app.stock.StockService", "Stock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sennotech.sennofit.insole.app.stock.generated.StockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sennotech.sennofit.insole.app.stock.generated.StockResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StockServiceMethodDescriptorSupplier("Stock"))
                  .build();
          }
        }
     }
     return getStockMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StockServiceStub newStub(io.grpc.Channel channel) {
    return new StockServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StockServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StockServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StockServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StockServiceFutureStub(channel);
  }

  /**
   * <pre>
   * 商品服务
   * </pre>
   */
  public static abstract class StockServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void updateStock(com.sennotech.sennofit.insole.app.stock.generated.UpdateStockRequest request,
        io.grpc.stub.StreamObserver<com.sennotech.sennofit.insole.app.stock.generated.UpdateStockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateStockMethod(), responseObserver);
    }

    /**
     */
    public void stock(com.sennotech.sennofit.insole.app.stock.generated.StockRequest request,
        io.grpc.stub.StreamObserver<com.sennotech.sennofit.insole.app.stock.generated.StockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStockMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUpdateStockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sennotech.sennofit.insole.app.stock.generated.UpdateStockRequest,
                com.sennotech.sennofit.insole.app.stock.generated.UpdateStockResponse>(
                  this, METHODID_UPDATE_STOCK)))
          .addMethod(
            getStockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sennotech.sennofit.insole.app.stock.generated.StockRequest,
                com.sennotech.sennofit.insole.app.stock.generated.StockResponse>(
                  this, METHODID_STOCK)))
          .build();
    }
  }

  /**
   * <pre>
   * 商品服务
   * </pre>
   */
  public static final class StockServiceStub extends io.grpc.stub.AbstractStub<StockServiceStub> {
    private StockServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StockServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StockServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StockServiceStub(channel, callOptions);
    }

    /**
     */
    public void updateStock(com.sennotech.sennofit.insole.app.stock.generated.UpdateStockRequest request,
        io.grpc.stub.StreamObserver<com.sennotech.sennofit.insole.app.stock.generated.UpdateStockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateStockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stock(com.sennotech.sennofit.insole.app.stock.generated.StockRequest request,
        io.grpc.stub.StreamObserver<com.sennotech.sennofit.insole.app.stock.generated.StockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStockMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 商品服务
   * </pre>
   */
  public static final class StockServiceBlockingStub extends io.grpc.stub.AbstractStub<StockServiceBlockingStub> {
    private StockServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StockServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StockServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StockServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sennotech.sennofit.insole.app.stock.generated.UpdateStockResponse updateStock(com.sennotech.sennofit.insole.app.stock.generated.UpdateStockRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateStockMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sennotech.sennofit.insole.app.stock.generated.StockResponse stock(com.sennotech.sennofit.insole.app.stock.generated.StockRequest request) {
      return blockingUnaryCall(
          getChannel(), getStockMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 商品服务
   * </pre>
   */
  public static final class StockServiceFutureStub extends io.grpc.stub.AbstractStub<StockServiceFutureStub> {
    private StockServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StockServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StockServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StockServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sennotech.sennofit.insole.app.stock.generated.UpdateStockResponse> updateStock(
        com.sennotech.sennofit.insole.app.stock.generated.UpdateStockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateStockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sennotech.sennofit.insole.app.stock.generated.StockResponse> stock(
        com.sennotech.sennofit.insole.app.stock.generated.StockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStockMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE_STOCK = 0;
  private static final int METHODID_STOCK = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StockServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StockServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPDATE_STOCK:
          serviceImpl.updateStock((com.sennotech.sennofit.insole.app.stock.generated.UpdateStockRequest) request,
              (io.grpc.stub.StreamObserver<com.sennotech.sennofit.insole.app.stock.generated.UpdateStockResponse>) responseObserver);
          break;
        case METHODID_STOCK:
          serviceImpl.stock((com.sennotech.sennofit.insole.app.stock.generated.StockRequest) request,
              (io.grpc.stub.StreamObserver<com.sennotech.sennofit.insole.app.stock.generated.StockResponse>) responseObserver);
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

  private static abstract class StockServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StockServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sennotech.sennofit.insole.app.stock.generated.Stock.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StockService");
    }
  }

  private static final class StockServiceFileDescriptorSupplier
      extends StockServiceBaseDescriptorSupplier {
    StockServiceFileDescriptorSupplier() {}
  }

  private static final class StockServiceMethodDescriptorSupplier
      extends StockServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StockServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StockServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StockServiceFileDescriptorSupplier())
              .addMethod(getUpdateStockMethod())
              .addMethod(getStockMethod())
              .build();
        }
      }
    }
    return result;
  }
}
