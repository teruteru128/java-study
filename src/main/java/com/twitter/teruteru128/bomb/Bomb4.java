package com.twitter.teruteru128.bomb;

import java.util.concurrent.ExecutorService;

/**
 * @author Teruteru
 *
 */
public class Bomb4 implements Bomb {

    private final ExecutorService service;

    public Bomb4(ExecutorService service) {
        this.service = service;
    }

    /**
     * (非 Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        service.submit(new Bomb1(service));
        service.submit(new Bomb2(service));
        service.submit(new Bomb3(service));
    }

}
