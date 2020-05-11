package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.util.concurrent.BlockingQueue;

class Consumer implements Runnable {


    public Consumer() {
    }

    @Override
    public void run() {
        BlockingQueue<Response> responses = Queues.getResponseQueue();
        while (true) {
            try {
                AddressGenerator.exportAddress(responses.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
