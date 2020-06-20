package com.twitter.teruteru128.study;

import java.math.BigInteger;
import java.util.Random;

/**
 * Main
 * 
 */
public class Main {

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        // 107038380838084L
        random.setSeed(0x6159D0AACCC4L);
        System.out.println(random.nextLong() == 0);
        System.out.println(random.nextLong() == 0);
        System.out.println(random.nextLong() == 0);
        System.out.println("--");

        // 164311266871034
        random.setSeed(0x9570B2B1C6FAL);
        System.out.println(random.nextLong() == 0);
        System.out.println(random.nextLong() == 0);
        System.out.println(random.nextLong() == 0);
        System.out.println("--");

        // 240144965573432
        random.setSeed(0xda691b5e1b38L);
        System.out.println(random.nextLong() == 0);
        System.out.println(random.nextLong() == 0);
        System.out.println(random.nextLong() == 0);
        System.out.println("--");

        // 388513357548740
        random.setSeed(0x16159D0AACCC4L);
        System.out.println(random.nextLong() == 0);
        System.out.println(random.nextLong() == 0);
        System.out.println(random.nextLong() == 0);
        System.out.println("--");

        BigInteger a = BigInteger.valueOf(0x615C0E462AA9L);
        BigInteger b = BigInteger.valueOf(0x5DEECE66DL);
        System.out.printf("%x%n", a.multiply(b));
        long seed = 0x123456789abcL;
        int c = (int) (seed >>> (48 - 32));
        System.out.printf("c : %x%n", c);
        random = new Random();
        long head = 0;
        BigInteger shifthead = BigInteger.valueOf(0);
        BigInteger mod = BigInteger.valueOf(0x1000000000000L);
        BigInteger mask1 = BigInteger.valueOf(0xffffffffffffL);
        BigInteger mask2 = BigInteger.valueOf(0xffffffff0000L);
        BigInteger tail = BigInteger.valueOf(0xfffffffffff5L);
        BigInteger one = BigInteger.valueOf(1);
        BigInteger zero = BigInteger.valueOf(0);
        BigInteger n = BigInteger.valueOf(0);
        BigInteger mult = BigInteger.valueOf(0x5DEECE66DL);
        BigInteger[] rem;
        long t = 0;
        System.out.printf("%x%n", BigInteger.valueOf(0x2B9BL).multiply(mult));
        System.out.printf("%x%n", BigInteger.valueOf(0x2B9CL).multiply(mult).mod(mod));
        System.out.printf("%x%n", BigInteger.valueOf(0x5736L).multiply(mult));
        System.out.printf("%x%n", BigInteger.valueOf(0x5737L).multiply(mult).mod(mod));
        System.out.printf("%x%n", BigInteger.valueOf(0x2000000000000L).divide(mult));
        seed = 0x000000000000L;
        System.out.printf("innerseed : %012x%n", ((0x00000000000BL - 0xBL) * 0xDFE05BCB1365L) & 0xFFFFFFFFFFFFL);
        System.out.printf("%d%n", (((0x00000000000BL - 0xBL) * 0xDFE05BCB1365L) ^ 0x5DEECE66DL) & 0xFFFFFFFFFFFFL);
        /*
        System.out.println("--");
        for (;; head++) {
            shifthead = BigInteger.valueOf(head).shiftLeft(48);
            for (t = 0x0L; t <= 0xFFF4L; t++) {
                n = shifthead.add(BigInteger.valueOf(t));
                rem = n.divideAndRemainder(mult);
                if (rem[1].equals(zero)) {
                    System.out.printf("%x\n", rem[0]);
                }
            }
            for (t = 0xFFFFFFFFFFF5L; t <= 0xFFFFFFFFFFFFL; t++) {
                n = shifthead.add(BigInteger.valueOf(t));
                rem = n.divideAndRemainder(mult);
                if (rem[1].equals(zero)) {
                    System.out.printf("%x\n", rem[0]);
                }
            }
        }
        */
    }
}
