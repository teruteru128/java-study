package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class Queues {
    /**
     * オリジナルはタプルで実装されています。
     */
    private static final BlockingQueue<Response> RESPONSE_QUEUE = new LinkedBlockingQueue<>();

    private Queues() {
    }

    /**
     * @return the responseQueue
     */
    public static BlockingQueue<Response> getResponseQueue() {
        return RESPONSE_QUEUE;
    }
}
