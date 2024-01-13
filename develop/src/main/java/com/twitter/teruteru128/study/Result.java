package com.twitter.teruteru128.study;

public record Result(long ripe, int signIndex, int encIndex) {
    @Override
    public final String toString() {
        return new StringBuilder(24).append(ripe).append(": ").append(signIndex).append(", ").append(encIndex).toString();
    }
}
