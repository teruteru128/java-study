package com.twitter.teruteru128.study.random;

import java.security.SecureRandom;
import java.util.random.RandomGenerator;

/**
 * @author Teruteru
 *
 */
public class RandomTest {
    public static void main(String[] args) {
        SecureRandom r = (SecureRandom) RandomGenerator.of("SecureRandom");
        System.out.println(r.getAlgorithm());
        System.out.println(r.getProvider());
        double x, Min = 1, Max = 0;
        for (int i = 0; i < 100; i++) {
            x = r.nextDouble();
            if (x > Max)
                Max = x;
            if (x < Min)
                Min = x;
        }
        System.out.printf("Min=%s Max=%s%n", Double.toString(Min), Double.toString(Max));
    }
}
