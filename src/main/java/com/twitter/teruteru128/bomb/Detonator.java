package com.twitter.teruteru128.bomb;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Teruteru
 *
 */
public class Detonator {

    public static void main(String[] args) {
        final ExecutorService service = Executors.newCachedThreadPool();
        service.submit(new Bomb1(service));
    }
}
