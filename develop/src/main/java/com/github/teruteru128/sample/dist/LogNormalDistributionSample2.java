package com.github.teruteru128.sample.dist;

import com.github.teruteru128.sample.Sample;
import org.apache.commons.rng.simple.JDKRandomWrapper;
import org.apache.commons.statistics.distribution.LogNormalDistribution;

import java.security.SecureRandom;
import java.util.Arrays;

public class LogNormalDistributionSample2 implements Sample {
    public void sample() {
        var dist = LogNormalDistribution.of(44. / 16, 44. / 64);
        var sampler = dist.createSampler(new JDKRandomWrapper(new SecureRandom()));
        double[] samples = sampler.samples(100000).toArray();
        int length = samples.length;
        int over150 = 0;
        int over200 = 0;
        int over250 = 0;
        int over300 = 0;
        int over350 = 0;
        int over400 = 0;
        Arrays.sort(samples);
        double sum = 0.;
        for (double d : samples) {
            var e = d + 65;
            if (e >= 400) {
                over400++;
            }
            if (e >= 350) {
                over350++;
            }
            if (e >= 300) {
                over300++;
            }
            if (e >= 250) {
                over250++;
            }
            if (e >= 200) {
                over200++;
            }
            if (e >= 150) {
                over150++;
            }
            sum += e;
        }
        var avg = sum / length;
        double nspow = 0;
        for (double d : samples) {
            var e = d + 65;
            nspow += Math.pow(e - avg, 2);
        }
        // 分散
        var variance = nspow / length;
        // 標準偏差
        var sd = Math.sqrt(variance);
        int s = Math.min(5, length);
        for (int i = 0; i < s; i++) {
            System.out.println(samples[i] + 65);
        }
        var middle = (samples[49999] + samples[50000] + 130) / 2;
        System.out.println("...");
        for (int i = Math.max(0, length - 5); i < length; i++) {
            System.out.println(samples[i] + 65);
        }
        System.out.printf("%d人中150overが%d人、200overが%d人、250overが%d人、300overが%d人、350overが%d人、400overが%d人%n", length,
                over150, over200, over250, over300, over350, over400);
        System.out.printf("平均値: %f, 中央値: %f, 分散: %f, 標準偏差: %f%n", avg, middle, variance, sd);
    }
}
