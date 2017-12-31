package cn.cgg.grpc.demo.client;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import cn.egg.tutorial.demo.grpc.model.HelloRequest;
import cn.egg.tutorial.demo.grpc.model.HelloResponse;
import cn.egg.tutorial.demo.service.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.netty.NegotiationType;
import io.grpc.netty.NettyChannelBuilder;

public class GreetingServiceClient {

	private static final Logger logger = Logger.getLogger(GreetingServiceClient.class.getName());

	private final ManagedChannel channel;

	private final HelloServiceGrpc.HelloServiceBlockingStub blockingStub;

	public GreetingServiceClient(String host, int port) {

		channel = NettyChannelBuilder.forAddress(host, port).negotiationType(NegotiationType.PLAINTEXT).build();
		blockingStub = HelloServiceGrpc.newBlockingStub(channel);
	}

	public void shutdown() throws InterruptedException {
		channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	}

	public void sayHello(String name) {
		try {
			System.out.println("Will try to say Hello  " + name + " ...");
			HelloRequest request = HelloRequest.newBuilder().setName(name).setId(12345678).build();
			HelloResponse response = blockingStub.sayHello(request);
			System.out.println("result from server: " + response.getMessage());
		} catch (RuntimeException e) {
			System.out.println("RPC failed:" + e.getMessage());
			return;
		}
	}

	public static void main(String[] args) throws Exception {

		GreetingServiceClient client = new GreetingServiceClient("127.0.0.1", 50051);
		try {
			String name = "Eric";
			logger.info(String.format("Client 调用RPC接口，参数为name = {%s}", name));
			client.sayHello(name);
		} finally {
			client.shutdown();
		}
	}
}
