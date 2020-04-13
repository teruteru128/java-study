package com.twitter.teruteru128.study.threadtest;

class HelloThread implements Runnable {

    public HelloThread() {
        this(10);
    }

    public HelloThread(int max) {
        this.max = max;
    }

    private final int max;
    private int counter = 0;

    @Override
    public void run() {
        System.out.println("hello thread.");
        counter++;
        if (counter == max) {
            throw new RuntimeException();
        }
    }
}
