package com.twitter.teruteru128.study;

public record Result(long worldSeed, int x, int z) {

    @Override
    public String toString() {
        return new StringBuilder("seed: ").append(worldSeed).append(", x: ").append(x << 4).append(", z: ").append(z << 4)
                .toString();
    }
}
