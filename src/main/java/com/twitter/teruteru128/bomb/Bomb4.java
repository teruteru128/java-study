package com.twitter.teruteru128.bomb;

public class Bomb4 implements Bomb {

    @Override
    public void run() {
        Main.service.submit(new Bomb1());
    }
}
