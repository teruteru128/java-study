package com.twitter.teruteru128.study;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws Exception {
        var service = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(12);
        var future = service.schedule(() -> Paths.get(System.getProperty("user.dir"), "plugins"), 0,
                TimeUnit.NANOSECONDS);
        var shutdownFuture = service.schedule(() -> {
            System.out.println("シャットダウンします……");
            service.shutdown();
        }, 500, TimeUnit.MILLISECONDS);
        var pluginsPath = future.get();
        if (Files.exists(pluginsPath)) {
            System.out.println("exists");
        } else {
            System.out.println("no exists");
        }
        System.out.println(pluginsPath);
        shutdownFuture.get();
        var propterties = System.getProperties();
        for (Map.Entry<Object, Object> entry : propterties.entrySet()) {
            System.out.printf("%s: %s%n", entry.getKey(), entry.getValue());
        }
    }
}
