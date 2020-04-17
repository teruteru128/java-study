package com.twitter.teruteru128.bomb;

/**
 * @author Teruteru
 *
 */
public class Main {
    public static void main(String[] args) {
        new Thread(new Bomb1(1), "ignition").start();
    }
}
