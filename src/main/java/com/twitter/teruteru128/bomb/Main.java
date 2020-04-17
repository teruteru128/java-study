package com.twitter.teruteru128.bomb;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Teruteru
 *
 */
public class Main {

    public static final ExecutorService service = Executors.newFixedThreadPool(8);

    public static void main(String[] args) {
        service.submit(new Bomb1());
    }
}
