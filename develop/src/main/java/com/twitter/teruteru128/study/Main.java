package com.twitter.teruteru128.study;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws Exception {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(2);
        var future = service.scheduleAtFixedRate(new DeepWebRadioPoller(), 0, 73, TimeUnit.MINUTES);
        // https://docs.oracle.com/javase/jp/17/docs/api/java.base/java/util/concurrent/ScheduledExecutorService.html
        service.schedule(() -> {
            System.out.println("シャットダウンします……");
            future.cancel(false);
            service.shutdown();
        }, 20, TimeUnit.DAYS);
    }
}
