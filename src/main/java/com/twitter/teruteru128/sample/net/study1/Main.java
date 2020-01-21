package com.twitter.teruteru128.sample.net.study1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	private static final int port = 20007;

	public static void main(String[] args) {
		ServerSocket server = null;
		Socket socket = null;
		ExecutorService service = Executors.newSingleThreadExecutor();
		try {
			server = new ServerSocket(port);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class CallableServerTask implements Callable<Void> {
	public CallableServerTask() {
	}

	@Override
	public Void call() throws Exception {
		return VoidHolder.getInstance();
	}
}
