package com.twitter.teruteru128.study;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.twitter.teruteru128.library.Library;
import com.twitter.teruteru128.library.LibraryFactory;
import com.twitter.teruteru128.study.sf.Shangri_laFrontierCountDown;
import com.twitter.teruteru128.study.swing.SwingStudy;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws Exception {
        var service = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(2);
        // service.scheduleAtFixedRate(new DeepWebRadioPoller(), 0, 73, TimeUnit.MINUTES);
        // https://docs.oracle.com/javase/jp/17/docs/api/java.base/java/util/concurrent/ScheduledExecutorService.html
        service.schedule(new Shangri_laFrontierCountDown(), 0, TimeUnit.NANOSECONDS);
        // service.schedule(new ServiceCallSample(), 0, TimeUnit.NANOSECONDS);
        //service.schedule(new SwingStudy(), 0, TimeUnit.NANOSECONDS);
        service.schedule(() -> {
            System.out.println("シャットダウンします……");
            service.shutdown();
        }, 5, TimeUnit.SECONDS);
    }
}
