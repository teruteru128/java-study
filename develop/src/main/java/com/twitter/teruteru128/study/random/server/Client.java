package com.twitter.teruteru128.study.random.server;

import java.net.InetSocketAddress;

public class Client implements Runnable {

    @Override
    public void run() {
        InetSocketAddress socketAddress = InetSocketAddress.createUnresolved("localhost", 8123);
        System.out.println(socketAddress);
    }
}
