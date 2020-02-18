package com.twitter.teruteru128.study.fourcube;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

public class SearchSumOfThreeCubes114 {

    public static void main(String[] args) {
        BigInteger x, xLength, xMax;
        BigInteger y, yLength, yMax;
        BigInteger z, zLength, zMax;

        Random rnd = new SecureRandom();
        x = new BigInteger(128, rnd).abs();
        y = new BigInteger(128, rnd);
        z = new BigInteger(128, rnd).abs().negate();
        System.out.printf("%d, %d, %d%n", x, y, z);
        xLength = yLength = zLength = BigInteger.valueOf(0x1000000L);
        xMax = x.add(xLength);
        yMax = y.add(yLength);
        zMax = z.add(zLength);

        final var ONE = BigInteger.valueOf(1);
        final var threshold = BigInteger.valueOf(200);
        for (; x.compareTo(xMax) < 0; x = x.add(ONE)) {
            for (; y.compareTo(yMax) < 0; y = y.add(ONE)) {
                for (; z.compareTo(zMax) < 0; z = z.add(ONE)) {
                    BigInteger sum = x.pow(3).add(y.pow(3)).add(z.pow(3));
                    if (sum.abs().compareTo(threshold) < 0) {
                        System.out.printf("%d, %d, %d, %d%n", sum, x, y, z);
                    }
                }
            }
        }
    }

}
