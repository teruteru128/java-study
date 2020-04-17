package com.twitter.teruteru128.bomb;

public class Bomb3 implements Bomb {

    @Override
    public void run() {
        Main.service.submit(new Bomb4());
    }
}
