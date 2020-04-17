package com.twitter.teruteru128.bomb;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Teruteru
 *
 */
public class Bomb1 implements Bomb {

    private long a;

    public Bomb1(long a) {
        this.a = a;
    }

    /**
     * (非 Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        new Thread(new Bomb2(a + 1), "bomblets").start();
        if (ThreadLocalRandom.current().nextDouble() < (1 / (double) a)) {
            new Thread(new Bomb2(a + 1), "bomblets").start();
        }
    }

}
