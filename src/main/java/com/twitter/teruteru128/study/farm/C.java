package com.twitter.teruteru128.study.farm;

/**
 * C
 */
public class C {

    public static void main(String[] args) {
        long mask = (1L << 48) - 1;
        long seed1 = -3213054711323627496L;
        System.out.printf("%d%n", seed1);
        System.out.printf("%d%n", mask);
        System.out.printf("%016x%n", seed1);
        System.out.printf("%016x%n", mask);
        System.out.printf("%d%n", seed1 & mask);
        System.out.printf("%016x%n", seed1 & mask);
        var seed2 = 1613738097659009556L;
        System.out.printf("%d%n", seed2 & mask);
        System.out.printf("%016x%n", seed2 & mask);
    }
}
