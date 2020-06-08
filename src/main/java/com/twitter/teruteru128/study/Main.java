package com.twitter.teruteru128.study;

import com.twitter.teruteru128.study.tcp.client.Client;

/**
 * Main
 * 
 */
public class Main {

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(new Client());
        thread.start();
    }
}
