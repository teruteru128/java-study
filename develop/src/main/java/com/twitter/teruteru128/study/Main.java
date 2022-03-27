package com.twitter.teruteru128.study;

import java.io.File;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.twitter.teruteru128.ncv.usersetting.UserSettingLoadSample;

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
        if (args.length < 1) {
            return;
        }
        var service = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(12);
        var future = service.schedule(new UserSettingLoadSample(new File(args[0])), 0,
                TimeUnit.NANOSECONDS);
        var shutdownFuture = service.schedule(() -> {
            System.out.println("シャットダウンします……");
            service.shutdown();
        }, 500, TimeUnit.MILLISECONDS);
        var se = future.get();
        int i = 0;
        for (var user : se.getUser()) {
            System.out.println(user);
            if (i >= 10) {
                break;
            }
            i++;
        }
        shutdownFuture.get();
    }
}
