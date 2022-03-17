package com.twitter.teruteru128.study.rsa.search1;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        System.out.println("start");
        SecureRandom random = new SecureRandom();
        BigInteger p = new BigInteger(2048, 100, random);
        p.setBit(0);
        long start;
        long finish;
        start = System.nanoTime();
        System.out.println(p.isProbablePrime(2));
        finish = System.nanoTime();
        System.out.printf("system : %fseconds\n", (finish - start) / (1e9));
        start = System.nanoTime();
        System.out.println(isProbablePrime(p, 2));
        finish = System.nanoTime();
        System.out.printf("stream : %fseconds\n", (finish - start) / (1e9));
        // findFirst(false);->見つからないなら正常、falseが見つかったら中断
        p = new BigInteger(131072, random).setBit(0);
        start = System.nanoTime();
        System.out.println(isProbablePrime(p, 4));
        finish = System.nanoTime();
        System.out.printf("stream : %fseconds\n", (finish - start) / (1e9));
        start = System.nanoTime();
        System.out.println(p.isProbablePrime(2));
        finish = System.nanoTime();
        System.out.printf("system : %fseconds\n", (finish - start) / (1e9));
    }

    private static final BigInteger ONE = BigInteger.ONE;
    private static final BigInteger TWO = BigInteger.TWO;

    private static boolean isProbablePrime(BigInteger n, int certainty) {
        if (certainty <= 0)
            return true;
        BigInteger w = n.abs();
        if (w.equals(TWO))
            return true;
        if (!w.testBit(0) || w.equals(ONE))
            return false;

        return primeToCertainty(n, certainty, null);
    }

    private static boolean primeToCertainty(BigInteger n, int certainty, Random random) {
        int rounds = 0;
        int a = (Math.min(certainty, Integer.MAX_VALUE - 1) + 1) / 2;

        // The relationship between the certainty and the number of rounds
        // we perform is given in the draft standard ANSI X9.80, "PRIME
        // NUMBER GENERATION, PRIMALITY TESTING, AND PRIMALITY CERTIFICATES".
        int sizeInBits = n.bitLength();
        if (sizeInBits < 100) {
            rounds = 50;
            rounds = a < rounds ? a : rounds;
            return passesMillerRabin(n, rounds, random);
        }

        if (sizeInBits < 256) {
            rounds = 27;
        } else if (sizeInBits < 512) {
            rounds = 15;
        } else if (sizeInBits < 768) {
            rounds = 8;
        } else if (sizeInBits < 1024) {
            rounds = 4;
        } else {
            rounds = 2;
        }
        rounds = a < rounds ? a : rounds;
        return passesMillerRabin(n, rounds, random);
    }

    private static boolean passesMillerRabin(BigInteger n, int iterations, Random rnd) {
        // Find a and m such that m is odd and this == 1 + 2**a * m
        final BigInteger o = n.subtract(ONE);
        final int a = o.getLowestSetBit();
        final BigInteger m = o.shiftRight(a);

        var stream = Stream.generate(() -> new BigInteger(n.bitLength(),  rnd != null ? rnd : ThreadLocalRandom.current()));
        stream = stream.filter(b -> b.compareTo(ONE) > 0);
        stream = stream.filter(b -> b.compareTo(n) < 0);
        stream = stream.map(z -> z.modPow(m, n));// <- bottleneck
        stream = stream.filter(i -> !i.equals(ONE));
        stream = stream.limit(iterations);
        stream = stream.parallel();
        stream = stream.flatMap(i -> Stream.iterate(i, b -> (b.compareTo(o) < 0), z -> z.pow(2)).parallel());
        // すべてtrueであることを確認して素数とするのではなく、1件でもfalseがあれば素数でないとみなす
        stream = stream.filter(i -> !(i.equals(ONE) || i.equals(o)));
        Optional<BigInteger> optional = stream.findAny();
        return optional.isEmpty();
    }
}
