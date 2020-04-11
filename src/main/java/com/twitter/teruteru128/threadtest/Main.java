package com.twitter.teruteru128.threadtest;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Teruteru
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor service = new ScheduledThreadPoolExecutor(1);
          ScheduledFuture<?> future = service.scheduleAtFixedRate(new Runnable() {
          //ScheduledFuture future = service.scheduleWithFixedDelay(new Runnable() {
           int counter = 0;
           @Override
           public void run() {
            System.out.println("hello thread.");
            counter++;
            if (counter % 10 == 0) {
             throw new RuntimeException();
            }
           }
          }, 1000L, 1000L, TimeUnit.MILLISECONDS);

          while (true) {
           if (future.isCancelled() || future.isDone()) {
            service.shutdown();
            break;
           }
          }
    }

}
