package com.twitter.teruteru128.sample;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.commons.math3.distribution.LogNormalDistribution;

/**
 * 対数正規分布のサンプル
 * @see https://qiita.com/t_uehara/items/460e04ba7d2b19fdd497
 */
public class LognormalDistributionSample implements Sample {

    public void sample(File outFile) throws IOException {
        try (var os = new PrintStream(new BufferedOutputStream(new FileOutputStream(outFile)))) {
            double MU = Math.log(15); // ln(x)の平均μ 大きいほどグラフの右側が伸びる
            double SIGMA = 1; // ln(x)の標準偏差σ 大きいほどグラフが横に広がる
            var distribution = new LogNormalDistribution(MU, SIGMA);

            List<Double> results = IntStream.rangeClosed(1, 60000000).boxed()
                    .map(i -> distribution.sample())
                    .collect(Collectors.toList());

            printResults(results, os);
            results.stream().sorted(Comparator.reverseOrder()).limit(10).forEach(os::println);
        }
    }

    private void printResults(List<Double> results, PrintStream os) {
        long[] b = new long[14000];
        int max = b.length * 5;
        long overscale = 0;
        for (double d : results) {
            if (d < max) {
                b[(int) (d / 5)]++;
            } else {
                overscale++;
            }
        }
        for (int i = 0; i < b.length; i++) {
            int start = i * 5;
            int end = (i + 1) * 5;
            os.printf("%d\t\uff5e\t%d\t%d%n", start, end, b[i]);
        }
        os.printf("%d\t\uff5e\t\t%d%n", max, overscale);
    }

    @Override
    public void sample() throws IOException {
        sample(new File(""));
    }

    public static void sample2() {
        var dist = new LogNormalDistribution(44. / 16, 44. / 64);
        double[] samples = dist.sample(100000);
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
