package com.twitter.teruteru128.ssl;

import java.io.IOException;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.AbstractSelectableChannel;

import javax.net.ssl.SSLEngine;

public class SSLSocketChannel extends AbstractSelectableChannel {

    private SocketChannel channel;
    private SSLEngine engine;

    protected SSLSocketChannel(SocketChannel channel, SSLEngine engine) {
        super(channel.provider());
        this.channel = channel;
        this.engine = engine;
    }

    @Override
    protected void implCloseSelectableChannel() throws IOException {
        throw new UnsupportedOperationException("Unimplemented method 'implCloseSelectableChannel'");
    }

    @Override
    protected void implConfigureBlocking(boolean block) throws IOException {
        throw new UnsupportedOperationException("Unimplemented method 'implConfigureBlocking'");
    }

    @Override
    public int validOps() {
        throw new UnsupportedOperationException("Unimplemented method 'validOps'");
    }

}
