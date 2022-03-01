package com.twitter.teruteru128.study;

import java.math.BigInteger;

import com.twitter.teruteru128.study.collatz.Collatz5;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Collatz5 c = new Collatz5();
        c.accept(BigInteger.valueOf(3));
    }
}
