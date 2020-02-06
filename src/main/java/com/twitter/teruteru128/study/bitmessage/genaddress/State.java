package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.util.concurrent.atomic.AtomicInteger;

class State {

    private static final AtomicInteger shutdown = new AtomicInteger(0);

    private State() {
    }

    public static AtomicInteger getShutdown() {
        return shutdown;
    }
}