package com.twitter.teruteru128.study.threadtest;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Teruteru
 *
 */
public class Main {

    /**
     * 狙った回数だけ実行させて停止させるテスト
     * TODO カウントダウンラッチ
     * 
     * @param args
     */
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor service = new ScheduledThreadPoolExecutor(1);
        ScheduledFuture<?> future = service.scheduleAtFixedRate(new HelloThread(), 1000L, 1000L, TimeUnit.MILLISECONDS);

        while (true) {
            if (future.isCancelled() || future.isDone()) {
                service.shutdown();
                break;
            }
        }
    }

}
