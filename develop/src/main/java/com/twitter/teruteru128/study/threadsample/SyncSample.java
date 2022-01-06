package com.twitter.teruteru128.study.threadsample;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SyncSample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        var counter = new Counter();

        // スレッドを1000個作成する
        var threads = new ArrayList<Callable<Void>>(1000);
        for (var i = 0; i < 1000; i++) {
            threads.add(counter);
        }

        ExecutorService service = Executors.newFixedThreadPool(16);
        try {
            List<Future<Void>> futures = service.invokeAll(threads);

            // スレッドがすべて終了するのを待つ
            for (Future<Void> future : futures) {
                future.get();
            }
        } finally {
            service.shutdown();
        }

        // カウンターを表示する
        System.out.println(counter.getCount());
    }
}
