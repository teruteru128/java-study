package com.twitter.teruteru128.study;

import java.nio.file.Path;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.twitter.teruteru128.study.bitmessage.DeterministicAddressesGenerator;
import com.twitter.teruteru128.study.bitmessage.SearchRangeFactoryImpl;
import com.twitter.teruteru128.study.bitmessage.genaddress.BMAddress;
import com.twitter.teruteru128.study.image.ImageLoadTest;
import com.twitter.teruteru128.study.sf.Shangri_laFrontierCountDown;
import com.twitter.teruteru128.study.swing.SwingStudy;
import com.twitter.teruteru128.study.utf8.UTF8DecodeSample;

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
        var randomFuture = service.schedule(() -> SecureRandom.getInstance("NativePRNG"), 0, TimeUnit.NANOSECONDS);
        // service.schedule(new UTF8DecodeSample(), 0, TimeUnit.NANOSECONDS);
        var a = service.schedule(() -> {
            var random = randomFuture.get();
            return new StringBuilder(4).append((char) random.nextInt('A', 'Z')).append((char) random.nextInt('A', 'Z'))
                    .append((char) random.nextInt('A', 'Z')).append((char) random.nextInt('A', 'Z')).toString();
        }, 0, TimeUnit.NANOSECONDS);
        System.out.println(a.get());
        service.schedule(() -> {
            System.out.println("シャットダウンします……");
            service.shutdown();
            return null;
        }, 0, TimeUnit.SECONDS);
    }
}
