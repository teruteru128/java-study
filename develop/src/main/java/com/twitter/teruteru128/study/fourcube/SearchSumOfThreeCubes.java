package com.twitter.teruteru128.study.fourcube;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 * 114 - z^3 = x^3 + y^3 の形式に変形し、 x^3 + y^3 = (x + y)(x^2 - xy + y^2)
 * の形式に変形できれば成功
 * 
 * @see https://www.quantamagazine.org/why-the-sum-of-three-cubes-is-a-hard-math-problem-20191105/
 */
public class SearchSumOfThreeCubes {

    public static void main(String[] args) {
        final var _114 = BigInteger.valueOf(114);
        final var random = new SecureRandom();
        var z = new BigInteger(128, random);
        System.out.println(z);
        System.out.println(_114.subtract(z.pow(3)));
    }

}
