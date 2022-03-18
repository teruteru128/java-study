package com.twitter.teruteru128.study;

import java.security.PublicKey;
import java.util.concurrent.Exchanger;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.twitter.teruteru128.study.crypto.ExchangerSample;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws Exception {
        var service = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(12);
        var exchanger = new Exchanger<PublicKey>();
        var futureAlice = service.schedule(new ExchangerSample("Alice", exchanger), 0, TimeUnit.NANOSECONDS);
        var futureBoB = service.schedule(new ExchangerSample("BoB", exchanger), 0, TimeUnit.NANOSECONDS);
        service.schedule(() -> {
            System.out.println("シャットダウンします……");
            service.shutdown();
        }, 500, TimeUnit.MILLISECONDS);
        futureAlice.get();
        futureBoB.get();
    }
}
