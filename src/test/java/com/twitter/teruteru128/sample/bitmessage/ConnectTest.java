package com.twitter.teruteru128.sample.bitmessage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

public class ConnectTest {

    public static void main(String[] args) throws IOException {
        InetSocketAddress address = new InetSocketAddress(InetAddress.getLoopbackAddress(), 8444);
        try (SocketChannel channel = SocketChannel.open(address)) {
            System.out.println(channel.isConnected());
        }
    }

}
