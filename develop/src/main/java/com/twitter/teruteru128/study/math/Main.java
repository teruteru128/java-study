package com.twitter.teruteru128.study.math;

import java.math.BigInteger;

/**
 * @author Teruteru
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        for (BigInteger i = BigInteger.ONE, l = BigInteger.TEN.pow(100); l
                .compareTo(i) > 0; i = i.multiply(BigInteger.TEN).add(i).add(BigInteger.ONE)) {
            System.out.printf("%100d%n",i);
        }
    }

}
