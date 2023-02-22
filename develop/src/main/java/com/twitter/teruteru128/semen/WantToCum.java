package com.twitter.teruteru128.semen;

import java.util.function.ToDoubleFunction;
import java.util.random.RandomGenerator;

@FunctionalInterface
public interface WantToCum extends ToDoubleFunction<RandomGenerator> {

    default double cum(RandomGenerator generator) {
        return this.applyAsDouble(generator);
    }
}
