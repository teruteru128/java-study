package com.twitter.teruteru128.net;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

public class OnionProxySelector extends ProxySelector {

    private static final List<Proxy> LIST = Collections
            .singletonList(new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("localhost", 9150)));

    private static final OnionProxySelector INSTANCE = new OnionProxySelector();

    public static OnionProxySelector getInstance() {
        return INSTANCE;
    }

    private OnionProxySelector() {
    }

    @Override
    public List<Proxy> select(URI uri) {
        return LIST;
    }

    @Override
    public void connectFailed(URI uri, SocketAddress sa, IOException ioe) {
        // none
        throw new RuntimeException(ioe);
    }

}
