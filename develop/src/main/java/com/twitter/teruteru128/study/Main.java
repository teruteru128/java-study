package com.twitter.teruteru128.study;

import java.security.SecureRandom;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws Exception {
        var service = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(12);
        // service.schedule(new Shangri_laFrontierCountDown(), 0, TimeUnit.NANOSECONDS);
        // service.schedule(new ServiceCallSample(), 0, TimeUnit.NANOSECONDS);
        // var study = args.length >= 1 ? new SwingStudy(Path.of(args[0])) : new
        // SwingStudy();
        // service.schedule(study, 0, TimeUnit.NANOSECONDS);
        // 普通こうやって時間のかかる処理を裏でやらせるための機能だよね……？
        var randomFuture = service.schedule(() -> {
            var random = SecureRandom.getInstance("NativePRNG");
            return new StringBuilder(4).append((char) random.nextInt('A', 'Z' + 1))
                    .append((char) random.nextInt('A', 'Z' + 1))
                    .append((char) random.nextInt('A', 'Z' + 1)).append((char) random.nextInt('A', 'Z' + 1)).toString();
        }, 0, TimeUnit.NANOSECONDS);
        // service.schedule(new UTF8DecodeSample(), 0, TimeUnit.NANOSECONDS);
        System.out.println(randomFuture.get());
        service.schedule(() -> {
            System.out.println("シャットダウンします……");
            service.shutdown();
        }, 0, TimeUnit.SECONDS);
    }
}
