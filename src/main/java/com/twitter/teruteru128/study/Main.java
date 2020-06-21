package com.twitter.teruteru128.study;

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
        long seed = 0;
        long prevseed1 = 0;
        long prevseed2 = 0;
        seed = (seed * 0x5DEECE66DL + 0xBL) & 0xFFFFFFFFFFFFL;
        System.out.printf("%d%n", seed);
        seed = 246345201500483L ^ 0x5DEECE66DL;
        seed = (seed * 0x5DEECE66DL + 0xBL) & 0xFFFFFFFFFFFFL;
        System.out.printf("%012x%n", seed);
        seed = (seed * 0x5DEECE66DL + 0xBL) & 0xFFFFFFFFFFFFL;
        System.out.printf("%012x%n", seed);
        seed = 0;
        seed = (seed - 0xBL) * 0xDFE05BCB1365L & 0xFFFFFFFFFFFFL;
        System.out.printf("%d%n", seed);
        System.out.printf("%d%n", seed ^ 0x5DEECE66DL);
        seed = (seed - 0xBL) * 0xDFE05BCB1365L & 0xFFFFFFFFFFFFL;
        seed = (seed - 0xBL) * 0xDFE05BCB1365L & 0xFFFFFFFFFFFFL;
        System.out.printf("%d%n", seed ^ 0x5DEECE66DL);
        seed = 0x4498;
        seed = (seed - 0xBL) * 0xDFE05BCB1365L & 0xFFFFFFFFFFFFL;
        seed = (seed - 0xBL) * 0xDFE05BCB1365L & 0xFFFFFFFFFFFFL;
        System.out.printf("0x4498 -> %d%n", seed);
        System.out.printf("0x4498 -> %d%n", seed ^ 0x5DEECE66DL);
        System.out.printf("0x4498 -> %012x%n", seed);
        System.out.printf("0x4498 -> %012x%n", seed & 0x0000ffff0000L);
        System.out.printf("0x4498 -> %012x%n", seed ^ 0x5DEECE66DL);
        Random random = new Random();
        random.setSeed(246345201500483L);
        System.out.printf("%x%n", random.nextLong());
        System.out.printf("%x%n", random.nextLong());
        random.setSeed(164311266871034L);
        System.out.printf("%a%n", random.nextDouble());
        System.out.printf("%a%n", random.nextDouble());
        random.setSeed(74803317123181L);
        System.out.printf("74803317123181: %012x%n", random.nextLong());
        System.out.printf("74803317123181: %012x%n", random.nextLong());
        random.setSeed(74803317123181L);
        System.out.printf("74803317123181: %f%n", random.nextDouble());
        System.out.printf("74803317123181: %f%n", random.nextDouble());

        for (long i = 0x0000_0000_0000L; i < 0x0000_0001_0000L; i++) {
            seed = 0xffff_ffff_0000L + i;
            prevseed1 = (seed - 0xBL) * 0xDFE05BCB1365L & 0xFFFFFFFFFFFFL;
            if ((prevseed1 & 0x0000_ffff_0000L) == 0x0000_0000_0000L) {
                prevseed2 = (prevseed1 - 0xBL) * 0xDFE05BCB1365L & 0xFFFFFFFFFFFFL;
                System.out.printf("d : %d%n", prevseed2 ^ 0x5DEECE66DL);
                random.setSeed(prevseed2 ^ 0x5DEECE66DL);
                System.out.printf("d : %012x%n", random.nextLong());
                System.out.printf("d : %012x%n", random.nextLong());
                random.setSeed(prevseed2 ^ 0x5DEECE66DL);
                System.out.printf("d : %a%n", random.nextDouble());
                System.out.printf("d : %a%n", random.nextDouble());
            }
        }
    }
}
