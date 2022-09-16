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
        var stream = RandomGeneratorFactory.all();
        stream.map(f->String.format("%s, %s, %b, %d", f.name(), f.group(), f.isSplittable(), f.stateBits())).forEach(System.out::println);
        System.out.println("--");
        System.out.println(RandomGeneratorFactory.getDefault().name());
        System.out.println("--");
        var factory = RandomGeneratorFactory.<SecureRandom>of("SecureRandom");
        var securerandom = factory.create();
        System.out.println(securerandom.getClass());
    }
}
