package com.twitter.teruteru128.study;

import java.security.SecureRandom;
import java.util.random.RandomGeneratorFactory;

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
        var factory = RandomGeneratorFactory.<SecureRandom>of("SecureRandom");
        var random = factory.create();
        double penissize = 120 + random.nextDouble(10);
        System.out.printf("%f cm%n", penissize);
    }
}
