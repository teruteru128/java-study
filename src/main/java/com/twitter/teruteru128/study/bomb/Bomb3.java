package com.twitter.teruteru128.study.bomb;

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
        service.submit(new Bomb1(service));
        service.submit(new Bomb2(service));
        service.submit(new Bomb4(service));
    }

}