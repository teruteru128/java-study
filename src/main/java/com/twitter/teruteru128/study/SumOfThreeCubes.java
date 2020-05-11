package com.twitter.teruteru128.study;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.List;

class SumOfThreeCubes {

  public static void main(String args[]) {
    final var terms = List.of(new BigInteger("569936821221962380720"), new BigInteger("-569936821113563493509"),
        new BigInteger("-472715493453327032"));
    var sum = terms.stream().map(a -> a.pow(3)).reduce(BigInteger.valueOf(0), (a, b) -> a.add(b));
    System.out.println(sum);
    final BigInteger positive1000 = BigInteger.valueOf(1000);
    final BigInteger negative1000 = positive1000.negate();
    SecureRandom rnd = new SecureRandom();
    BigInteger x = new BigInteger(72, rnd);
    BigInteger y;
    BigInteger z;
    BigInteger x3 = x.pow(3);
    BigInteger y3;
    BigInteger z3;
    while (true) {
      y = new BigInteger(72, rnd).negate();
      z = new BigInteger(72, rnd);
      y3 = y.pow(3);
      z3 = z.pow(3);
      sum = x3.add(y3).add(z3);
      if (negative1000.compareTo(sum) <= 0 && sum.compareTo(positive1000) <= 0) {
        System.out.printf("sum : %d%n", sum);
        System.out.printf("\tx : %d%n", x);
        System.out.printf("\ty : %d%n", y);
        System.out.printf("\tz : %d%n", z);
      }
      sum = x3.add(y3).subtract(z3);
      if (negative1000.compareTo(sum) <= 0 && sum.compareTo(positive1000) <= 0) {
        System.out.printf("sum : %d%n", sum);
        System.out.printf("\tx : %d%n", x);
        System.out.printf("\ty : %d%n", y);
        System.out.printf("\tz : %d%n", z.negate());
      }
    }
  }
}
