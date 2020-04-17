package com.twitter.teruteru128.bomb;

public class Bomb3 implements Bomb {

    @Override
    public void run() {
        new Thread(new Bomb4(), "bomblets").start();
    }
}
