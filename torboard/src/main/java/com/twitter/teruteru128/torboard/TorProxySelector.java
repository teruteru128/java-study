package com.twitter.teruteru128.torboard;

import java.net.InetSocketAddress;
import java.net.Proxy;

public class TorProxySelector extends StaticProxySelector {
    public TorProxySelector() {
        super(new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("localhost", 9050)));
    }

}