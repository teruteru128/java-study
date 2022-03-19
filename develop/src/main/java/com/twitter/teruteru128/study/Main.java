package com.twitter.teruteru128.study;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.twitter.teruteru128.study.regex.RegexSample;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws Exception {
        var service = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(12);
        var future = service.schedule(new RegexSample(), 0, TimeUnit.NANOSECONDS);
        var shutdownFuture = service.schedule(() -> {
            System.out.println("シャットダウンします……");
            service.shutdown();
        }, 500, TimeUnit.MILLISECONDS);
        System.out.println(future.get());
        shutdownFuture.get();
    }
}
