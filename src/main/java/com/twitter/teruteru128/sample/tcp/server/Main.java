package com.twitter.teruteru128.sample.tcp.server;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public Main() {
	}

	public static void main(String[] args) throws Exception {
		ExecutorService service = Executors.newWorkStealingPool();
		String hostname = "localhost";
		int port = 50000;
		CountDownLatch latch = new CountDownLatch(1);
		ServerConfig config = new ServerConfig(hostname, port, service, latch);
		service.submit(new ServerWaittingThread(config));
		config.getLatch().await();
	}

}