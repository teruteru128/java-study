package com.twitter.teruteru128.bomb;

/**
 * @author Teruteru
 *
 */
public class Bomb2 implements Bomb {

    private long a;

    public Bomb2(long a) {
        this.a = a;
    }

    /**
     * (非 Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        new Thread(new Bomb1(a + 1), "bomblets").start();
    }

}
