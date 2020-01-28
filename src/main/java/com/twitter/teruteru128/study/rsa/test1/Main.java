package com.twitter.teruteru128.study.rsa.test1;

import java.math.BigInteger;
import java.security.SecureRandom;

public class Main {

	public static void main(String[] args) throws Exception {
		//System.out.println((1<<23) / 20 * 64);
		var ONE = BigInteger.valueOf(1L);
		var random = SecureRandom.getInstanceStrong();
		//var p = BigInteger.probablePrime(1 << 23, random);
		
		var t = new BigInteger(131072, random);
		var tMinusOne = t.subtract(ONE);
		var m = tMinusOne;
		int a = m.getLowestSetBit();
		m = m.shiftRight(a);
		BigInteger b;
		do {
            b = new BigInteger(t.bitLength(), random);
        } while (b.compareTo(ONE) <= 0 || b.compareTo(t) >= 0);
		long start = System.nanoTime();
		BigInteger z=b.modPow(m, t);
		long finish = System.nanoTime();
		System.out.println(z.bitLength());
		long diff = finish -start;
		System.out.printf("%d.%06d%n",diff / 1000000000, diff % 1000000000);
	}

}
