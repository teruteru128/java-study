package com.github.teruteru128.slime.slime;

import java.util.concurrent.atomic.AtomicLong;

public class SearchContext {
    private AtomicLong worldSeed = new AtomicLong();

    public SearchContext() {
    }

    public AtomicLong getWorldSeed() {
        return worldSeed;
    }
}
