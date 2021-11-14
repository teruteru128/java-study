package com.twitter.teruteru128.study.bouyomichan;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;

public class BouyomiServerConfig {
    SocketAddress address;
    Proxy proxy;

    public BouyomiServerConfig(String hostname, int port) {
        this(new InetSocketAddress(hostname, port));
    }

    public BouyomiServerConfig(SocketAddress address) {
        this(address, Proxy.NO_PROXY);
    }

    public BouyomiServerConfig(SocketAddress address, Proxy proxy) {
        this.address = address;
        this.proxy = proxy;
    }

    public BouyomiServerConfig(String hostname, int port, Proxy proxy) {
        this(new InetSocketAddress(hostname, port), proxy);
    }
}
