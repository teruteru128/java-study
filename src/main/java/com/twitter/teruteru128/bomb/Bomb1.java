package com.twitter.teruteru128.bomb;

/**
 * @author Teruteru
 *
 */
public class Bomb1 implements Bomb {

    public Bomb1() {
    }

    /**
     * (非 Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        Main.service.submit(new Bomb2());
    }

}
