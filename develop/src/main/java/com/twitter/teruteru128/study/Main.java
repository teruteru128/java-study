package com.twitter.teruteru128.study;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (MulticastSocket socket = new MulticastSocket(new InetSocketAddress(InetAddress.getByName("172.18.125.138"), 0))) {
            System.out.println(socket.getLocalPort());
        }
    }
}
