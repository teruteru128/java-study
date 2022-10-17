package com.twitter.teruteru128.study;

import java.util.Random;
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
        var factory = RandomGeneratorFactory.<Random>of("Random");
        var random = factory.create();
        random.setSeed(155239116123415L);
        System.out.printf("%.17a%n", random.nextFloat());
        System.out.printf("%.17a%n", random.nextFloat());
    }
}
