package com.twitter.teruteru128.sample;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
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
}
