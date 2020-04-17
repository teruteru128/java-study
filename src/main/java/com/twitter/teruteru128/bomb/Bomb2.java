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
        Main.service.submit(new Bomb3());
    }

}
