package com.twitter.teruteru128.study.threadtest;

class HelloThread implements Runnable {
    int counter = 0;

    @Override
    public void run() {
        System.out.println("hello thread.");
        counter++;
        if (counter % 10 == 0) {
            throw new RuntimeException();
        }
    }
}
