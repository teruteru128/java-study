package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;

class Consumer implements Runnable {

    private CountDownLatch latch;

    public Consumer(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        BlockingQueue<Response> responses = Queues.getResponseQueue();
        while (true) {
            try {
                AddressGenerator.exportAddress(responses.take());
                latch.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
