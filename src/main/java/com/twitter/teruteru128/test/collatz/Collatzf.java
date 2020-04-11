package com.twitter.teruteru128.test.collatz;

/**
 * @author teruteru128
 *
 */
@FunctionalInterface
public interface Collatzf {
    /**
     *  再帰
     *  @param n 整数
     *  @param f
     *  */
    public int collatz(long n, Collatzf f);
}
