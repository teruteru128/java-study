package com.twitter.teruteru128.bitmessage.genaddress;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private final Logger logger = LoggerFactory.getLogger(Consumer.class);

    public Consumer() {
    }

    @Override
    public void run() {
        BlockingQueue<Response> responses = Queues.getResponseQueue();
        while (true) {
            try {
                BMAddressGenerator.exportAddress(responses.take());
            } catch (InterruptedException e) {
                logger.error("", e);
            }
        }
    }
}
