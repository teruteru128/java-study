package com.twitter.teruteru128.study;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class Handler implements Runnable {
    private SocketChannel channel;

    public Handler(SocketChannel channel) {
        this.channel = channel;
    }

    @Override
    public void run() {
        try {
            channel.read((ByteBuffer) null);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
