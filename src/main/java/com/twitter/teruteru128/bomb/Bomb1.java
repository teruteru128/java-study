package com.twitter.teruteru128.bomb;

import java.util.concurrent.ExecutorService;

/**
 * @author Teruteru
 *
 */
public class Bomb1 implements Bomb {

    private final ExecutorService service;

    public Bomb1(ExecutorService service) {
        this.service = service;
    }

    /**
     * (非 Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        final ExecutorService service = this.service;
        service.submit(new Bomb2(service));
    }

}
