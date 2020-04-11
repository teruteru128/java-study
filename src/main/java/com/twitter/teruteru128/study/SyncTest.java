package com.twitter.teruteru128.study;


class SyncTest {
    static Counter counter = new Counter();

    public static void main(String[] args) {

        // スレッドを1000個作成する
        MyThread[] threads = new MyThread[1000];
        for (int i = 0; i < 1000; i++) {
            threads[i] = new MyThread();
            threads[i].start();
        }

        // スレッドがすべて終了するのを待つ
        for (int i = 0; i < 1000; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        // カウンターを表示する
        System.out.println(Counter.count);
    }
}

// スレッド
class MyThread extends Thread {
    public void run() {
        SyncTest.counter.countUp();

    }
}

// カウンター
class Counter {
    static int count;

    void countUp() {
        synchronized (this) {
            System.out.print("[");
            int n = count; // カウンターを読み出して
            System.out.print(".");
            count = n + 1; // 加算して書き戻す
            System.out.print("]");
        }
    }
}
