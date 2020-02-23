package com.twitter.teruteru128.study.random;

import java.security.SecureRandom;

public class Dice {

    public static void main(final String[] args) throws Exception {
        final var random = SecureRandom.getInstance("nativeprngnonblocking");
        // System.out.printf("%03d%n", random.nextInt(999)+1);
        double sum = 0;
        int count = 60;
        for (int i = 0; i < count; i++) {
            double cum = (random.nextDouble() * 4) + 5;
            sum += cum;
            System.out.printf("cum,%d,%f%n", i + 1, cum);
        }
        System.out.printf("sum,,%f%n", sum);
        System.out.printf("avg,,%f%n", sum / count);
    }

}
