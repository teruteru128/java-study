package com.twitter.teruteru128.study;

public record Result(long mcseed, int x, int z) {

    @Override
    public String toString() {
        return new StringBuilder("seed: ").append(mcseed).append(", x: ").append(x << 4).append(", z: ").append(z << 4)
                .toString();
    }
}
