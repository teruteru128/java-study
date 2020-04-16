package com.twitter.teruteru128.bomb;

/**
 * @author Teruteru
 *
 */
public class Bomb2 implements Bomb {

    public Bomb2() {
    }

    /**
     * (非 Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        new Thread(new Bomb1(), "bomblets").start();
    }

}
