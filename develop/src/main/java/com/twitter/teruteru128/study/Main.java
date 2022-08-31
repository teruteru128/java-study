package com.twitter.teruteru128.study;

import java.math.BigInteger;
import java.util.Random;

import com.twitter.teruteru128.study.bitmessage.DeterministicAddressesGenerator;

/**
 * Main
 */
public class Main {

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        BigInteger n = BigInteger.valueOf(55);
        BigInteger d = BigInteger.valueOf(3);
        int p[] = { 21, 29, 23, 29, 15, 5, 34, 10, 23, 16, 29, 22 };
        for (int i : p) {
            System.out.printf("%d ", BigInteger.valueOf(i).modPow(d, n));
        }
        System.out.println();
    }
}
