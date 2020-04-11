package com.twitter.teruteru128.study;

class SyncTest {

    public static void main(String[] args) {
        Counter counter = new Counter();

        // スレッドを1000個作成する
        Thread[] threads = new Thread[1000];
        for (int i = 0; i < 1000; i++) {
            threads[i] = new Thread(new MyThread(counter));
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
        System.out.println(counter.getCount());
    }
}
