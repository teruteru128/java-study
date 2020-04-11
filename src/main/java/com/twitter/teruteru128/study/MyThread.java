package com.twitter.teruteru128.study;

// スレッド
public class MyThread implements Runnable {
    private Counter counter;

    public MyThread(Counter counter) {
        super();
        this.counter = counter;
    }

    public void run() {
        this.counter.countUp();
    }
}
