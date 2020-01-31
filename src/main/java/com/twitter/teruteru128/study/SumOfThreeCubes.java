package com.twitter.teruteru128.study;

import java.math.BigInteger;
import java.util.List;

class SumOfThreeCubes {

  public static void main(String args[]) {
    var sum = BigInteger.valueOf(0);
    List<BigInteger> terms = List.of(new BigInteger("569936821221962380720"), new BigInteger("-569936821113563493509"), new BigInteger("-472715493453327032"));
    for (BigInteger term : terms) {
      sum = sum.add(term.pow(3));
    }
    System.out.println(sum);
  }
}
