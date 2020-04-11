package com.twitter.teruteru128.bomb;

/**
 * @author Teruteru
 *
 */
public class Main {
    public static void main(String[] args) {
        Thread ignition = new Thread(new Bomb2(),"ignition");
        ignition.start();
    }
}
