package com.twitter.teruteru128.collatz;

import java.math.BigInteger;
import java.util.function.Consumer;

/**
 * 2で割るステップを省略して、2の累乗になったら終了ってやろうと思ったんですけど、そう簡単には行かないですよね
 */
public class Collatz5 implements Consumer<BigInteger> {

  public boolean isPowerOf2(BigInteger m) {
    return m.and(m.subtract(BigInteger.ONE)).equals(BigInteger.ZERO);
  }

  @Override
  public void accept(BigInteger m) {
    final var THREE = BigInteger.valueOf(3);
    while (!m.equals(BigInteger.ONE)) {
      System.out.printf("%d%n", m);
      if (m.and(BigInteger.ONE).equals(BigInteger.ZERO)) {
        m = m.shiftRight(1);
      } else {
        m = m.multiply(THREE).add(BigInteger.ONE);
      }
    }
    System.out.printf("%d%n", m);
  }

}
