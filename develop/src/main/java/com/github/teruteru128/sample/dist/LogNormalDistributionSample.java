package com.github.teruteru128.sample.dist;

import com.github.teruteru128.sample.Sample;
import java.io.IOException;
import java.io.PrintStream;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import org.apache.commons.rng.simple.JDKRandomWrapper;
import org.apache.commons.statistics.distribution.LogNormalDistribution;

/**
 * 対数正規分布のサンプル
 *
 * @see <a href="https://qiita.com/t_uehara/items/460e04ba7d2b19fdd497">Javaで正規分布・対数正規分布の乱数を生成する</a>
 */
public class LogNormalDistributionSample implements Sample {

  @Override
  public void sample() throws IOException {
    // ln(x)の平均μ 大きいほどグラフの右側が伸びる
    // ln(x)の標準偏差σ 大きいほどグラフが横に広がる

    var expMu = 21.0;
    var sigma = 1;
    var distribution = LogNormalDistribution.of(Math.log(expMu), sigma);
    var sampler = distribution.createSampler(new JDKRandomWrapper(new SecureRandom()));

    // var results = sampler.samples(60000000).toArray();
    var samples = sampler.samples(6000_0000).toArray();
    var name = "out6";
    try(var f = new PrintStream(name + ".txt")) {
      System.out.printf("μ=log(%f), σ=%s%n", expMu, sigma);
      f.printf("μ=log(%f), σ=%s%n", expMu, sigma);
      Arrays.stream(samples).forEach(f::println);
      Arrays.stream(samples).average().ifPresent(a-> {
        System.out.printf("avg: %s%n", a);
        f.printf("avg: %s%n", a);
      });
    }
    try(var f = new PrintStream(name + "-sorted.txt")) {
      Arrays.sort(samples);
      Arrays.stream(samples).forEach(f::println);
    }
  }
}
