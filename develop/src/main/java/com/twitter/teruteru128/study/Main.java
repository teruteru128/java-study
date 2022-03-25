package com.twitter.teruteru128.study;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import java.util.function.IntFunction;

/**
 * Main
 */
public class Main {

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        var service = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(12);
        var future = service.schedule(()->OffsetDateTime.of(2006, 8, 16, 7, 14, 22, 9, ZoneOffset.ofHours(9)), 0, TimeUnit.NANOSECONDS);
        var shutdownFuture = service.schedule(() -> {
            System.out.println("シャットダウンします……");
            service.shutdown();
        }, 500, TimeUnit.MILLISECONDS);
        var f = future.get();
        System.out.printf("%s%n", f.getDayOfWeek());
        shutdownFuture.get();
    }
}
