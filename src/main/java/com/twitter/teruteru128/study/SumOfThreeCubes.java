package com.twitter.teruteru128.study;
import static java.lang.Math.abs;
import static java.math.BigInteger.valueOf;

import java.math.BigInteger;
import java.util.Random;

class SumOfThreeCubes{

  public static void main(String args[]){
    Random random = new Random(System.nanoTime());
    BigInteger x = valueOf(abs(random.nextLong())), y = valueOf(abs(random.nextLong())), z = valueOf(abs(random.nextLong()));
    System.out.printf("x = %d, y = %d, z = %d\n",  x, y, z);
    BigInteger x3 = x.pow(3), y3 = y.pow(3), z3 = z.pow(3);
    //System.out.printf("%d\n",  x3.add(y3).add(z3));
    System.out.printf("%d\n",  x3.add(y3).subtract(z3));
    System.out.printf("%d\n",  x3.subtract(y3).add(z3));
    System.out.printf("%d\n",  x3.subtract(y3).subtract(z3));
    System.out.printf("%d\n",  x3.negate().add(y3).add(z3));
    System.out.printf("%d\n",  x3.negate().add(y3).subtract(z3));
    System.out.printf("%d\n",  x3.negate().subtract(y3).add(z3));
    System.out.printf("%d\n",  x3.negate().subtract(y3).subtract(z3));
    return;
  }
}

