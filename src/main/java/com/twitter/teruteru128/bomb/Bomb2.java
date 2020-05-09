package com.twitter.teruteru128.bomb;

import java.util.concurrent.ExecutorService;

/**
 * @author Teruteru
 *
 */
public class Bomb2 implements Bomb {

    private final ExecutorService service;

    public Bomb2(ExecutorService service) {
        this.service = service;
    }

    /**
     * (非 Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        service.submit(new Bomb3(service));
    }

}
