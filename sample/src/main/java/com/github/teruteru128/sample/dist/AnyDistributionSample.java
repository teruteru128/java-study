package com.github.teruteru128.sample.dist;

import com.github.teruteru128.sample.Sample;

import java.util.concurrent.ThreadLocalRandom;

/**
 * AnyDistributionSample
 */
public class AnyDistributionSample implements Sample {

    /**
     * @see org.apache.commons.statistics.distribution.ExponentialDistribution
     */
    @Override
    public void sample() {
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