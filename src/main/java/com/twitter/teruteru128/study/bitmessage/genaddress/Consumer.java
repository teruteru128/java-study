package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;

class Consumer implements Callable<Void> {


    public Consumer() {
    }

    @Override
    public Void call() throws InterruptedException {
        BlockingQueue<Response> responses = Queues.getResponseQueue();
        while (true) {
            AddressGenerator.exportAddress(responses.take());
        }
    }
}
