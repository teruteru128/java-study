package com.twitter.teruteru128.study.bouyomichan;

import java.net.Proxy;
import java.net.SocketAddress;

public class BouyomiServerConfig {
    SocketAddress address;
    Proxy proxy;

    public BouyomiServerConfig(SocketAddress address) {
        this(address, Proxy.NO_PROXY);
    }

    public BouyomiServerConfig(SocketAddress address, Proxy proxy) {
        this.address = address;
        this.proxy = proxy;
    }
}
