package com.twitter.teruteru128.study.fourcube;

import java.math.BigInteger;
import java.util.List;

/**
 * x^3 + y^3 + z^3 = a
 * z^3 -a = x^3+y^3
 */
public class SumOfThreeCubes {

  public static void main(String args[]) {
    final var terms = List.of(new BigInteger("569936821221962380720"), new BigInteger("-569936821113563493509"),
        new BigInteger("-472715493453327032"));
    var sum = terms.stream().map(a -> a.pow(3)).reduce(BigInteger.valueOf(0), (a, b) -> a.add(b));
    System.out.println(sum);
  }
}
