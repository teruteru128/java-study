package com.twitter.teruteru128.study;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.twitter.teruteru128.study.crypto.ECIESSample3;
import com.twitter.teruteru128.study.crypto.ECReflectionSample;
import com.twitter.teruteru128.study.crypto.X25519ChaCha20Poly1305Sample;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws Exception {
        var service = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(12);
        var future = service.schedule(new X25519ChaCha20Poly1305Sample(), 0, TimeUnit.NANOSECONDS);
        var future2 = service.schedule(new ECIESSample3(), 0, TimeUnit.NANOSECONDS);
        var future3 = service.schedule(new ECReflectionSample(), 0, TimeUnit.NANOSECONDS);
        service.schedule(() -> {
            System.out.println("シャットダウンします……");
            service.shutdown();
        }, 500, TimeUnit.MILLISECONDS);
        future.get();
        future2.get();
        future3.get();
    }
}
