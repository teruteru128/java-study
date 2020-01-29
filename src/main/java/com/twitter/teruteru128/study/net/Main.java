package com.twitter.teruteru128.study.net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main implements Runnable{
	public Main() {
		this(DEFAULT_SERVER_PORT);
	}
	public Main(int port) {
		super();
		this.server_port = port;
	}
	@Override
	public void run() {
		ServerSocket server = null;
		Socket socket = null;
		ExecutorService service = Executors.newSingleThreadExecutor();
		try {
			server = new ServerSocket(DEFAULT_SERVER_PORT);
			server.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		service.shutdown();
	}

	private static final int DEFAULT_SERVER_PORT = 20007;
	private int server_port;

	public static void main(String[] args) {
		var thread = new Thread(new Main());
		thread.start();
	}

}
