package com.twitter.teruteru128.study;

// カウンター
public class Counter {

    public Counter() {
    }

    private int count;

    void countUp() {
        synchronized (this) {
            System.out.print("[");
            int n = count; // カウンターを読み出して
            System.out.print(".");
            count = n + 1; // 加算して書き戻す
            System.out.print("]");
        }
    }

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }
}
