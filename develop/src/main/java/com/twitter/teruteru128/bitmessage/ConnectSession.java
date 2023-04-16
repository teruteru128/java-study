package com.twitter.teruteru128.bitmessage;

import java.nio.channels.SocketChannel;

import javax.net.ssl.SSLEngine;

public class ConnectSession {
    private SocketChannel channel;
    private SSLEngine engine = null;
    private boolean verackReceived = false;
    private boolean verackSent = false;

    public ConnectSession(SocketChannel channel) {
        this(channel, null);
    }

    public ConnectSession(SocketChannel channel, SSLEngine engine) {
        super();
        this.channel = channel;
        this.engine = engine;
    }

    public boolean isVerackReceived() {
        return verackReceived;
    }

    public boolean isVerackSent() {
        return verackSent;
    }
}
