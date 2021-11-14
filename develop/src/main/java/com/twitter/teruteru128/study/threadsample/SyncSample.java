package com.twitter.teruteru128.study.threadsample;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SyncSample {

    private static void get(Future<Void> future) throws InterruptedException {
        try {
            future.get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Counter counter = new Counter();

        // スレッドを1000個作成する
        var threads = new ArrayList<Callable<Void>>(1000);
        for (var i = 0; i < 1000; i++) {
            threads.add(Executors.<Void>callable(counter::countUp, null));
        }

        ExecutorService service = Executors.newFixedThreadPool(16);
        try {
            List<Future<Void>> futures = service.invokeAll(threads);

            // スレッドがすべて終了するのを待つ
            for (Future<Void> future : futures) {
                get(future);
            }
        } catch (InterruptedException e1) {
            e1.printStackTrace();
            Thread.currentThread().interrupt();
        } finally {
            service.shutdown();
        }

        // カウンターを表示する
        System.out.println(counter.getCount());
    }
}
