package com.twitter.teruteru128.study;

import java.util.concurrent.ThreadLocalRandom;

public class PoissonDistributionSample {

    /**
     * {@link com.twitter.teruteru128.bitmessage.dandelion.Dandelion#poissonTimeout()}のサンプル
     * 
     * @param average
     * @return
     */
    public static long poisson(long average) {
        double xp = 1. / (1 - ThreadLocalRandom.current().nextDouble());
        long count = 0;
        double exp_average = Math.exp(average);
        while (xp < exp_average) {
            xp /= (1 - ThreadLocalRandom.current().nextDouble());
            count++;
        }
        return count;
    }
    
}
