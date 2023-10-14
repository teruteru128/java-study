package com.twitter.teruteru128.sample;

import java.util.concurrent.ThreadLocalRandom;

/**
 * AnyDistributionSample
 */
public class AnyDistributionSample {

    /**
     * @see org.apache.commons.math3.distribution.ExponentialDistribution
     */
    public static void anyDistributionSample() {
        double r = 0;
        double s = 0;
        for (int i = 0; i < 10; i++) {
            // ここ指数分布
            r = -Math.log(1 - ThreadLocalRandom.current().nextDouble());
            s = Math.sqrt(r);
            System.out.printf("%f, %f%n", r * 600, s * 600);
        }
    }
}