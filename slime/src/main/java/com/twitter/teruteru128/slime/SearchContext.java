package com.twitter.teruteru128.slime;

import java.util.concurrent.atomic.AtomicLong;

public class SearchContext {
    private AtomicLong worldSeed = new AtomicLong();

    public SearchContext() {
    }

    public AtomicLong getWorldSeed() {
        return worldSeed;
    }
}
