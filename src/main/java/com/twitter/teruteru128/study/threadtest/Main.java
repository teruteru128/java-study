package com.twitter.teruteru128.study.threadtest;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Teruteru
 *
 */
public class Main {

    /**
     * 狙った回数だけ実行させて停止させるテスト
     * 
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(10);
        ScheduledThreadPoolExecutor service = new ScheduledThreadPoolExecutor(1);
        service.scheduleAtFixedRate(new HelloThread(latch), 1000L, 1000L, TimeUnit.MILLISECONDS);

        try {
            latch.await();
        } finally {
            service.shutdown();
        }
    }

}
