package com.twitter.teruteru128.study;

import java.io.IOException;
import java.util.concurrent.Callable;

/**
 * ProcessTask
 */
public class ProcessTask implements Callable<Void> {

    @Override
    public Void call() throws IOException {
        // パケットキューをチェックして処理を行う
        // ネットワークIOは重いからできればまた別のスレッドに任せたい
        return null;
    }

}
