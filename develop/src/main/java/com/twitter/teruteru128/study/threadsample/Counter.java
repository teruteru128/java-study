package com.twitter.teruteru128.study.threadsample;

import java.io.Serializable;
import java.util.concurrent.Callable;

// カウンター
public class Counter implements Callable<Void>, Serializable {

    private static final long serialVersionUID = 0;

    private int count;

    public Void call() {
        synchronized (this) {
            System.out.print("[");
            int n = count; // カウンターを読み出して
            System.out.print(".");
            count = n + 1; // 加算して書き戻す
            System.out.print("]");
        }
        return null;
    }

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }
}
