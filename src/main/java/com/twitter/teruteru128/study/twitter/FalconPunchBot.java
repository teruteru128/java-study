package com.twitter.teruteru128.study.twitter;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * 2~4時間おきにファルコン・パンチするbot
 */
public class FalconPunchBot {

    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
        //service.scheduleAtFixedRate(command, initialDelay, period, unit);
    }
}
