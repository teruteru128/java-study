package com.twitter.teruteru128.study;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneOffset;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.twitter.teruteru128.study.sf.Shangri_laFrontierCountDown;

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
        var future = service.schedule(new Shangri_laFrontierCountDown(), 0, TimeUnit.NANOSECONDS);
        var shutdownFuture = service.schedule(() -> {
            System.out.println("シャットダウンします……");
            service.shutdown();
        }, 500, TimeUnit.MILLISECONDS);
        future.get();
        shutdownFuture.get();
        var date = LocalDateTime.of(2007, Month.AUGUST, 31, 0, 0, 0, 0);
        var d = date.plusYears(39);
        System.out.println(d);
        var i = d.toInstant(ZoneOffset.ofHours(9));
        var epoch = i.getEpochSecond();
        System.out.printf("%1$016x, %1$d%n", epoch);
        System.out.printf("%1$016x, %1$d%n", 0x7fffffffL);
    }
}
