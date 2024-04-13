package com.github.teruteru128.sample;

import org.apache.commons.rng.simple.JDKRandomWrapper;
import org.apache.commons.statistics.distribution.LogNormalDistribution;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;

/**
 * 対数正規分布のサンプル
 *
 * @see <a href="https://qiita.com/t_uehara/items/460e04ba7d2b19fdd497">Javaで正規分布・対数正規分布の乱数を生成する</a>
 */
public class LogNormalDistributionSample implements Sample {

    public static void getS() throws IOException {
        var distribution = LogNormalDistribution.of(Math.log(80.0), 1.);
        var sampler = distribution.createSampler(new JDKRandomWrapper(new SecureRandom()));
        var samples = sampler.samples(60000000).toArray();
        var map = new TreeMap<Long, Long>();
        Long key;
        long value;
        double offset = 3.;
        for (double sample : samples) {
            key = (long) Math.floor((sample + offset) * 2);
            value = map.containsKey(key) ? map.get(key) + 1 : 1;
            map.put(key, value);
            // System.out.printf("%f: %f%n", floor / 2.0, sample);
        }
        try (var ps = new PrintStream("s13.txt", StandardCharsets.UTF_8)) {
            ps.printf("μ: log(%f), σ: %f, offset: %+f%n", Math.exp(distribution.getMu()), distribution.getSigma(), offset);
            for (var set : map.entrySet()) {
                ps.printf("%.1f: %d%n", set.getKey() / 2.0, set.getValue());
            }
        }
    }

    public static void sample2() {
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

    public void sample(File outFile) throws IOException {
        try (var os = new PrintStream(new BufferedOutputStream(new FileOutputStream(outFile)))) {
            // ln(x)の平均μ 大きいほどグラフの右側が伸びる
            // ln(x)の標準偏差σ 大きいほどグラフが横に広がる
            var distribution = LogNormalDistribution.of(Math.log(21.0), 1.0);
            var sampler = distribution.createSampler(new JDKRandomWrapper(new SecureRandom()));

            var results = sampler.samples(60000000).toArray();

            printResults(results, os);
            Arrays.stream(results).boxed().sorted(Comparator.reverseOrder()).mapToDouble(i -> i).limit(10).forEach(os::println);
        }
    }

    private void printResults(double[] results, PrintStream os) {
        int entries = 14000;
        int max = entries * 5;
        var c = Arrays.stream(results).collect(() -> new long[entries + 1], (a, b) -> a[(b < max) ? (int) (b / 5): entries]++
                , (a, b) -> {
                    int allNum = entries + 1;
                    for (int i = 0; i < allNum; i++) {
                        a[i] += b[i];
                    }
                });
        for (int i = 0; i < entries; i++) {
            int start = i * 5;
            int end = (i + 1) * 5;
            os.printf("%d\t～\t%d\t%d%n", start, end, c[i]);
        }
        os.printf("%d\t～\t\t%d%n", max, c[entries]);
    }

    @Override
    public void sample() throws IOException {
        sample(new File(""));
    }
}
