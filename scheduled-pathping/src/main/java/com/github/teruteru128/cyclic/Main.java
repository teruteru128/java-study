package com.github.teruteru128.cyclic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    private static final ExecutorService threadPool = Executors.newCachedThreadPool();
    private static final Object lock = new Object();
    private static final Charset cs = Charset.forName("Shift-JIS");

    public static void main(String[] args) {
        var host = args.length >= 1 ? args[0] : "8.8.8.8";
        var builder = new ProcessBuilder("C:\\WINDOWS\\system32\\PATHPING.EXE", host);
        try (var scheduledExecutor = Executors.newSingleThreadScheduledExecutor()) {
            scheduledExecutor.scheduleWithFixedDelay(() -> {
                System.out.println(LocalDateTime.now());
                Process p;
                try {
                    p = builder.start();
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
                var future = CompletableFuture.supplyAsync(() -> {
                    try (var bin = new BufferedReader(new InputStreamReader(p.getInputStream(), cs))) {
                        bin.lines().forEach(System.out::println);
                    } catch (IOException e) {
                        throw new UncheckedIOException(e);
                    }
                    return null;
                }, threadPool);
                try {
                    p.waitFor();
                } catch (InterruptedException e) {
                    logger.error("Interrupted in PATHPING task", e);
                    Thread.currentThread().interrupt();
                } finally {
                    future.join();
                }
            }, 0, 2, TimeUnit.HOURS);
            // デッドロックを意図的に発生させることで永遠にスリープさせる
            synchronized (lock) {
                lock.wait();
            }
        } catch (InterruptedException e) {
            logger.error("Interrupted in main thread", e);
            Thread.currentThread().interrupt();
        }
    }
}
