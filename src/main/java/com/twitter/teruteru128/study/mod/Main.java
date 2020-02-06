package com.twitter.teruteru128.study.mod;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger m = BigInteger.valueOf(65537);
        for (int i = 1; i < 65537; i++) {
            System.out.println(m.modInverse(BigInteger.valueOf(i)));
        }
    }
}
