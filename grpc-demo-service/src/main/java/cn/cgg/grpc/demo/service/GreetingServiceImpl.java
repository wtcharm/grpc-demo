package cn.cgg.grpc.demo.service;
import java.util.logging.Logger;

import cn.egg.tutorial.demo.grpc.model.HelloRequest;
import cn.egg.tutorial.demo.grpc.model.HelloResponse;
import cn.egg.tutorial.demo.service.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;
public class GreetingServiceImpl implements HelloServiceGrpc.HelloService{

	private static final Logger logger = Logger.getLogger(GreetingServiceImpl.class.getName());

	public void sayHello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {

		logger.info(String.format("sayHello方法调用的请求参数信息: name={%s}, id={%d}", request.getName(), request.getId()));

		HelloResponse reply = HelloResponse.newBuilder().setMessage(String.format("Hello, %s", request.getName()))
				.build();
		
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}

}
