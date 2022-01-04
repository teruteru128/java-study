package com.twitter.teruteru128.study;

import java.util.Random;

/**
 * Main
 */
public class Main {
    public static long pow2(int bits) {
        return 1L << bits;
    }

    public static long mask(int bits) {
        if (bits >= 64) {
            return ~0;
        }

        return pow2(bits) - 1;
    }

    public static long maskSigned(long value, int bits) {
        return value << bits >> bits; // removes top bits and copies sign bits back down
    }

    public static long modInverse(long a, int k) {
        long x = ((((a << 1) ^ a) & 4) << 1) ^ a;

        x += x - a * x * x;
        x += x - a * x * x;
        x += x - a * x * x;
        x += x - a * x * x;

        return x & mask(k);
    }

    public static long solveRoot(long c, long root) {
        for (int j = 1; j < 64; j <<= 1) {
            root = root - (A * root * root + B * root + c) * modInverse(2 * A * root + B, 64);
        }

        return root;
    }

    private static long A = 6364136223846793005L;
    private static long B = 1442695040888963407L;

    public static long mixSeed(long seed, long salt) {
        seed *= seed * A + B;
        seed += salt;
        return seed;
    }

    public static long getShadowSeed(long worldSeed) {
        long nextSeed = mixSeed(worldSeed, 0L);
        return solveRoot(-nextSeed, ~worldSeed & 1);
    }

    private static long MULTIPLIER = 0x5DEECE66DL;
    private static long ADDEND = 0xBL;
    private static long MASK = 0xFFFFFFFFFFFFL;

    private static long init(long seed) {
        return (seed ^ MULTIPLIER) & MASK;
    }

    private static long lcg(long seed) {
        return (seed * MULTIPLIER + ADDEND) & MASK;
    }

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.printf("%d%n", getShadowSeed(74803317123181L));
        Random random = new Random(74803317123181L);
        System.out.println(random.nextInt());
        System.out.println(random.nextInt());
    }
}
