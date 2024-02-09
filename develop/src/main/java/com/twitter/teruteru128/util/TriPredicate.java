package com.twitter.teruteru128.util;
@FunctionalInterface
public interface TriPredicate {
    boolean test(long a, int b, int c);
}
