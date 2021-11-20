package com.twitter.teruteru128.study.bouyomichan;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public class BouyomiChanServer {

    private InetSocketAddress address;

    public BouyomiChanServer() throws UnknownHostException {
        this(new InetSocketAddress(InetAddress.getLocalHost(), 50001));
    }

    public BouyomiChanServer(InetSocketAddress address) {
        this.address = address;
    }

    public InetSocketAddress getAddress() {
        return address;
    }
}
