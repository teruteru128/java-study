package com.twitter.teruteru128.study.random;

import java.security.SecureRandom;

public class Dice {

    public static void main(final String[] args) throws Exception {
        final var random = SecureRandom.getInstance("nativeprngnonblocking");
        System.out.printf("%03d%n", random.nextInt(999) + 1);
    }

}
