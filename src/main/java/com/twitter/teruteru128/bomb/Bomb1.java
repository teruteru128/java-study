package com.twitter.teruteru128.bomb;

/**
 * @author Teruteru
 *
 */
public class Bomb1 implements Runnable,Bomb {
    private static final String NAME ="bomblets";
    /**
     * (非 Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        Thread t1 = new Thread(new Bomb1(),NAME);
        Thread t2 = new Thread(new Bomb1(),NAME);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.start();
        t2.start();
    }

}
interface Bomb extends Runnable{
    
}