package com.sennotech.sennofit.insole.app.report.generated;

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
    comments = "Source: com/sennotech/sennofit/insole/app/proto/report.proto")
public final class ReportServiceGrpc {

  private ReportServiceGrpc() {}

  public static final String SERVICE_NAME = "insole.app.report.ReportService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sennotech.sennofit.insole.app.report.generated.Report.GenReportCredentialRequest,
      com.sennotech.sennofit.insole.app.report.generated.Report.GenReportCredentialResponse> getGenReportCredentialMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenReportCredential",
      requestType = com.sennotech.sennofit.insole.app.report.generated.Report.GenReportCredentialRequest.class,
      responseType = com.sennotech.sennofit.insole.app.report.generated.Report.GenReportCredentialResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sennotech.sennofit.insole.app.report.generated.Report.GenReportCredentialRequest,
      com.sennotech.sennofit.insole.app.report.generated.Report.GenReportCredentialResponse> getGenReportCredentialMethod() {
    io.grpc.MethodDescriptor<com.sennotech.sennofit.insole.app.report.generated.Report.GenReportCredentialRequest, com.sennotech.sennofit.insole.app.report.generated.Report.GenReportCredentialResponse> getGenReportCredentialMethod;
    if ((getGenReportCredentialMethod = ReportServiceGrpc.getGenReportCredentialMethod) == null) {
      synchronized (ReportServiceGrpc.class) {
        if ((getGenReportCredentialMethod = ReportServiceGrpc.getGenReportCredentialMethod) == null) {
          ReportServiceGrpc.getGenReportCredentialMethod = getGenReportCredentialMethod = 
              io.grpc.MethodDescriptor.<com.sennotech.sennofit.insole.app.report.generated.Report.GenReportCredentialRequest, com.sennotech.sennofit.insole.app.report.generated.Report.GenReportCredentialResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "insole.app.report.ReportService", "GenReportCredential"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sennotech.sennofit.insole.app.report.generated.Report.GenReportCredentialRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sennotech.sennofit.insole.app.report.generated.Report.GenReportCredentialResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReportServiceMethodDescriptorSupplier("GenReportCredential"))
                  .build();
          }
        }
     }
     return getGenReportCredentialMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReportServiceStub newStub(io.grpc.Channel channel) {
    return new ReportServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReportServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ReportServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReportServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ReportServiceFutureStub(channel);
  }

  /**
   * <pre>
   * 商品服务
   * </pre>
   */
  public static abstract class ReportServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void genReportCredential(com.sennotech.sennofit.insole.app.report.generated.Report.GenReportCredentialRequest request,
        io.grpc.stub.StreamObserver<com.sennotech.sennofit.insole.app.report.generated.Report.GenReportCredentialResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGenReportCredentialMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGenReportCredentialMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sennotech.sennofit.insole.app.report.generated.Report.GenReportCredentialRequest,
                com.sennotech.sennofit.insole.app.report.generated.Report.GenReportCredentialResponse>(
                  this, METHODID_GEN_REPORT_CREDENTIAL)))
          .build();
    }
  }

  /**
   * <pre>
   * 商品服务
   * </pre>
   */
  public static final class ReportServiceStub extends io.grpc.stub.AbstractStub<ReportServiceStub> {
    private ReportServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReportServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReportServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReportServiceStub(channel, callOptions);
    }

    /**
     */
    public void genReportCredential(com.sennotech.sennofit.insole.app.report.generated.Report.GenReportCredentialRequest request,
        io.grpc.stub.StreamObserver<com.sennotech.sennofit.insole.app.report.generated.Report.GenReportCredentialResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenReportCredentialMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 商品服务
   * </pre>
   */
  public static final class ReportServiceBlockingStub extends io.grpc.stub.AbstractStub<ReportServiceBlockingStub> {
    private ReportServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReportServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReportServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReportServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sennotech.sennofit.insole.app.report.generated.Report.GenReportCredentialResponse genReportCredential(com.sennotech.sennofit.insole.app.report.generated.Report.GenReportCredentialRequest request) {
      return blockingUnaryCall(
          getChannel(), getGenReportCredentialMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 商品服务
   * </pre>
   */
  public static final class ReportServiceFutureStub extends io.grpc.stub.AbstractStub<ReportServiceFutureStub> {
    private ReportServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReportServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReportServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReportServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sennotech.sennofit.insole.app.report.generated.Report.GenReportCredentialResponse> genReportCredential(
        com.sennotech.sennofit.insole.app.report.generated.Report.GenReportCredentialRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGenReportCredentialMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GEN_REPORT_CREDENTIAL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReportServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReportServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GEN_REPORT_CREDENTIAL:
          serviceImpl.genReportCredential((com.sennotech.sennofit.insole.app.report.generated.Report.GenReportCredentialRequest) request,
              (io.grpc.stub.StreamObserver<com.sennotech.sennofit.insole.app.report.generated.Report.GenReportCredentialResponse>) responseObserver);
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

  private static abstract class ReportServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReportServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sennotech.sennofit.insole.app.report.generated.Report.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReportService");
    }
  }

  private static final class ReportServiceFileDescriptorSupplier
      extends ReportServiceBaseDescriptorSupplier {
    ReportServiceFileDescriptorSupplier() {}
  }

  private static final class ReportServiceMethodDescriptorSupplier
      extends ReportServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReportServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ReportServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReportServiceFileDescriptorSupplier())
              .addMethod(getGenReportCredentialMethod())
              .build();
        }
      }
    }
    return result;
  }
}
