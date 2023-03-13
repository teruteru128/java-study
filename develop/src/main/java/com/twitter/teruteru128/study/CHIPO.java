package com.twitter.teruteru128.study;

import java.util.concurrent.ThreadLocalRandom;

import org.apache.commons.math3.distribution.TriangularDistribution;

public class CHIPO {

    /**
     * 
    */
    public static void chinpo() {
        double penisSize1 = 0;
        double penisSize2 = 0;
        double penisSize3 = 0;
        double penisSize4 = 0;
        for (int i = 0; i < 10; i++) {
            penisSize1 = ThreadLocalRandom.current().nextGaussian(21, 9);
            penisSize2 = ThreadLocalRandom.current().nextDouble(9, 17);
            System.out.printf("%s, %s%n", Double.toString(penisSize1), Double.toString(penisSize2));
        }
        for (int i = 0; i < 10; i++) {
            penisSize3 = new TriangularDistribution(18, 24, 30).sample();
            penisSize4 = new TriangularDistribution(9, 15, 17).sample();
            System.out.printf("%s, %s%n", Double.toString(penisSize3), Double.toString(penisSize4));
        }
    }
    
}
