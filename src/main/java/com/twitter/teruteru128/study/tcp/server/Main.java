package com.twitter.teruteru128.study.tcp.server;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main implements Runnable {

	public Main() {
	}

	@Override
	public void run() {
		ExecutorService service = Executors.newWorkStealingPool();
		String hostname = "localhost";
		int port = 50000;
		CountDownLatch latch = new CountDownLatch(1);
		ServerConfig config = new ServerConfig(hostname, port, service, latch);
		service.submit(new ServerWaittingThread(config));
		try {
			config.getLatch().await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			service.shutdown();
		}
	}

	public static void main(String[] args) throws Exception {
		Thread serverThread = new Thread(new Main());
		serverThread.start();
	}

}