package com.twitter.teruteru128.bitmessage.client;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
  
  public static void main(String[] args) {
    var service = (ScheduledThreadPoolExecutor) Executors.newSingleThreadScheduledExecutor();
    service.schedule(() -> {
        System.out.println("シャットダウンします……");
        service.shutdown();
    }, 0, TimeUnit.SECONDS);
  }
}
