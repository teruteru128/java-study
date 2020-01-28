package com.twitter.teruteru128.study.tcp.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.concurrent.Callable;

class ServerWaittingThread implements Callable<Void> {
	private ServerConfig config;

	public ServerWaittingThread(ServerConfig config) {
		this.config = config;
	}

	@Override
	public Void call() throws Exception {
		try {
			ServerSocketChannel server = ServerSocketChannel.open();
			server.bind(new InetSocketAddress(config.getHostname(), config.getPort()));
			while (true) {
				SocketChannel channel = server.accept();
				config.getService().submit(new ChannelEchoThread(channel,config));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			config.getLatch().countDown();
		}
		return null;
	}
}