package com.twitter.teruteru128.bitmessage;

import java.nio.channels.SocketChannel;

import javax.net.ssl.SSLEngine;

public class ConnectSession {
    private SocketChannel channel;
    private SSLEngine engine = null;

    public ConnectSession(SocketChannel channel) {
        super();
        this.channel = channel;
    }

    public ConnectSession(SocketChannel channel, SSLEngine engine) {
        super();
        this.channel = channel;
        this.engine = engine;
    }
}
