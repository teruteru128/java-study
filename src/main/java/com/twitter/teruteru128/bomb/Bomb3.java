package com.twitter.teruteru128.bomb;

import java.util.concurrent.ExecutorService;

/**
 * @author Teruteru
 *
 */
public class Bomb3 implements Bomb {

    private final ExecutorService service;

    public Bomb3(ExecutorService service) {
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
        service.submit(new Bomb4(service));
    }

}
