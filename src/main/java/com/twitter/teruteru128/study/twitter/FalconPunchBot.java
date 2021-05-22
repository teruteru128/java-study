package com.twitter.teruteru128.study.twitter;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 2~4時間おきにファルコン・パンチするbot
 */
public class FalconPunchBot {

    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
        service.scheduleAtFixedRate(new FalconPunch(), 0, 5, TimeUnit.MINUTES);
    }
}
