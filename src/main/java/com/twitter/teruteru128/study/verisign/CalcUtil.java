package com.twitter.teruteru128.study.verisign;

import java.math.BigInteger;

public final class CalcUtil {

    public static BigInteger f(BigInteger x, long[] cof) {
        BigInteger sum = BigInteger.valueOf(0L);
        BigInteger x_tmp = BigInteger.valueOf(1L);
        for (long c : cof) {
            sum = sum.add(x_tmp.multiply(BigInteger.valueOf(c)));
            x_tmp = x_tmp.multiply(x);
        }
        //sum = sum.add(x_tmp.multiply(BigInteger.valueOf(cof[cof.length - 1])));
        return sum;
    }

    public static BigInteger f(BigInteger x, BigInteger[] cof) {
        BigInteger sum = BigInteger.valueOf(0L);
        BigInteger x_tmp = BigInteger.valueOf(1L);
        for (BigInteger c : cof) {
            sum = sum.add(x_tmp.multiply(c));
            x_tmp = x_tmp.multiply(x);
        }
        return sum;
    }
}
