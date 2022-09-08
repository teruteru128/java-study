package com.twitter.teruteru128.study;

import java.math.BigInteger;

/**
 * Main
 */
public class Main {

    static private BigInteger a(BigInteger b, int c, int d) {
        return new BigInteger(b.toString(c), d);
    }

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        BigInteger i = BigInteger.valueOf(55);
        BigInteger b = BigInteger.valueOf(0xb);
        BigInteger n = BigInteger.ONE.shiftLeft(48).subtract(BigInteger.ONE);
        System.out.printf("%d%n", i);
        BigInteger o = i;
        for (int j = 0; j < 25; j++) {
            o = a(o.add(b), 10, 16).and(n);
            System.out.printf("%012x%n", o);
        }
    }
}
