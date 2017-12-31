package cn.egg.tutorial.demo.service;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@javax.annotation.Generated("by gRPC proto compiler")
public class HelloServiceGrpc {

  private HelloServiceGrpc() {}

  public static final String SERVICE_NAME = "cn.egg.tutorial.demo.grpc.HelloService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<cn.egg.tutorial.demo.grpc.model.HelloRequest,
      cn.egg.tutorial.demo.grpc.model.HelloResponse> METHOD_SAY_HELLO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "cn.egg.tutorial.demo.grpc.HelloService", "sayHello"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.egg.tutorial.demo.grpc.model.HelloRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.egg.tutorial.demo.grpc.model.HelloResponse.getDefaultInstance()));

  public static HelloServiceStub newStub(io.grpc.Channel channel) {
    return new HelloServiceStub(channel);
  }

  public static HelloServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HelloServiceBlockingStub(channel);
  }

  public static HelloServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HelloServiceFutureStub(channel);
  }

  public static interface HelloService {

    public void sayHello(cn.egg.tutorial.demo.grpc.model.HelloRequest request,
        io.grpc.stub.StreamObserver<cn.egg.tutorial.demo.grpc.model.HelloResponse> responseObserver);
  }

  public static interface HelloServiceBlockingClient {

    public cn.egg.tutorial.demo.grpc.model.HelloResponse sayHello(cn.egg.tutorial.demo.grpc.model.HelloRequest request);
  }

  public static interface HelloServiceFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<cn.egg.tutorial.demo.grpc.model.HelloResponse> sayHello(
        cn.egg.tutorial.demo.grpc.model.HelloRequest request);
  }

  public static class HelloServiceStub extends io.grpc.stub.AbstractStub<HelloServiceStub>
      implements HelloService {
    private HelloServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloServiceStub(channel, callOptions);
    }

    //@java.lang.Override
    public void sayHello(cn.egg.tutorial.demo.grpc.model.HelloRequest request,
        io.grpc.stub.StreamObserver<cn.egg.tutorial.demo.grpc.model.HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SAY_HELLO, getCallOptions()), request, responseObserver);
    }
  }

  public static class HelloServiceBlockingStub extends io.grpc.stub.AbstractStub<HelloServiceBlockingStub>
      implements HelloServiceBlockingClient {
    private HelloServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloServiceBlockingStub(channel, callOptions);
    }

    //@java.lang.Override
    public cn.egg.tutorial.demo.grpc.model.HelloResponse sayHello(cn.egg.tutorial.demo.grpc.model.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SAY_HELLO, getCallOptions(), request);
    }
  }

  public static class HelloServiceFutureStub extends io.grpc.stub.AbstractStub<HelloServiceFutureStub>
      implements HelloServiceFutureClient {
    private HelloServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloServiceFutureStub(channel, callOptions);
    }

   // @java.lang.Override
  
    public com.google.common.util.concurrent.ListenableFuture<cn.egg.tutorial.demo.grpc.model.HelloResponse> sayHello(
        cn.egg.tutorial.demo.grpc.model.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAY_HELLO, getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloService serviceImpl;
    private final int methodId;

    public MethodHandlers(HelloService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((cn.egg.tutorial.demo.grpc.model.HelloRequest) request,
              (io.grpc.stub.StreamObserver<cn.egg.tutorial.demo.grpc.model.HelloResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final HelloService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_SAY_HELLO,
          asyncUnaryCall(
            new MethodHandlers<
              cn.egg.tutorial.demo.grpc.model.HelloRequest,
              cn.egg.tutorial.demo.grpc.model.HelloResponse>(
                serviceImpl, METHODID_SAY_HELLO)))
        .build();
  }
}
