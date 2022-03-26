package com.twitter.teruteru128.study;

import java.nio.file.Paths;
import java.util.LinkedHashSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.twitter.teruteru128.ncv.User;
import com.twitter.teruteru128.study.ncv.UserSettingLoadSample;

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
            System.err.println("UserSetting.xml のパスを指定してください");
            Runtime.getRuntime().exit(1);
        }
        var service = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(12);
        var future = service.schedule(new UserSettingLoadSample(Paths.get(args[0]).toFile()), 0, TimeUnit.NANOSECONDS);
        var shutdownFuture = service.schedule(() -> {
            System.out.println("シャットダウンします……");
            service.shutdown();
        }, 500, TimeUnit.MILLISECONDS);
        var f = future.get();
        var users = f.getUser();
        var set = new LinkedHashSet<User>();
        for (User user : users) {
            var u = user.clone();
            u.setName("");
            if (!set.add(u)) {
                System.out.println(user);
            }
        }
        System.out.printf("%s, %s%n", users.size(), set.size());
        shutdownFuture.get();
    }
}
