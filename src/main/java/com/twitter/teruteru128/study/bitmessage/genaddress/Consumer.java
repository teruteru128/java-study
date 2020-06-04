package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {


    public Consumer() {
    }

    @Override
    public void run() {
        BlockingQueue<Response> responses = Queues.getResponseQueue();
        while (true) {
            try {
                BMAddressGenerator.exportAddress(responses.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
