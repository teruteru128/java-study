package com.twitter.teruteru128.bomb;

/**
 * @author Teruteru
 *
 */
public class Bomb2 implements Bomb {

    /**
     * (非 Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        long i;
        for (i = 0; i < 10000000000L; i++) {
        }
    }

}
