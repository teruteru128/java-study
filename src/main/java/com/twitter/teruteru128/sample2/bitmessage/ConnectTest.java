package com.twitter.teruteru128.sample2.bitmessage;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

public class ConnectTest {

	public static void main(String[] args) throws IOException {
		InetSocketAddress address = new InetSocketAddress("", 8444);
		try (SocketChannel channel = SocketChannel.open(address)) {
			System.out.println(channel.isConnected());
		}
	}

}
