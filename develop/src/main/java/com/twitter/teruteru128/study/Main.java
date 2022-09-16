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
        var securerandom = factory.create();
        double semen = 0;
        for (int days = 2; days < 10; days++) {
            System.out.printf("%d日目%n", days + 1);
            do {
                semen = securerandom.nextDouble(1000.);
                System.out.printf("  %fL%n", semen);
            } while (securerandom.nextDouble() < 0.8);
        }
    }
}
