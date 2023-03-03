package com.twitter.teruteru128.study;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class R implements Callable<Long> {
    @Override
    public Long call() throws Exception {
        int r = 0;
        long count = 0;
        do {
            r = ThreadLocalRandom.current().nextInt(16777216);
            count++;
        } while (r != 0);
        return count;
    }
}
