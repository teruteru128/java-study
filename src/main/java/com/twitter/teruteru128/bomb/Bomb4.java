package com.twitter.teruteru128.bomb;

public class Bomb4 implements Bomb {

    @Override
    public void run() {
        new Thread(new Bomb1(), "bomblets").start();
    }
}
