package com.twitter.teruteru128.study;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class SyncTest {

    public static void main(String[] args) {
        Counter counter = new Counter();

        // スレッドを1000個作成する
        List<Callable<Void>> threads = new ArrayList<Callable<Void>>(1000);
        for (int i = 0; i < 1000; i++) {
            threads.add(Executors.<Void>callable(new MyThread(counter), null));
        }

        ExecutorService service = Executors.newCachedThreadPool();
        try {
            List<Future<Void>> futures = service.invokeAll(threads);

            // スレッドがすべて終了するのを待つ
            for (int i = 0; i < 1000; i++) {
                try {
                    futures.get(i).get();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        } finally {
            service.shutdown();
        }

        // カウンターを表示する
        System.out.println(counter.getCount());
    }
}
