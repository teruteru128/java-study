package com.twitter.teruteru128.study.thread;

import java.util.concurrent.CountDownLatch;

class HelloThread implements Runnable {

    public HelloThread(CountDownLatch latch) {
        this.latch = latch;
    }

    private CountDownLatch latch;

    @Override
    public void run() {
        System.out.println("hello thread.");
        latch.countDown();
    }
}
