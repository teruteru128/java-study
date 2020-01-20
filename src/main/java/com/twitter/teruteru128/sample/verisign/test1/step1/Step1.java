package com.twitter.teruteru128.sample.verisign.test1.step1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/**
 * calc coefficients
 */
class Step1 implements Callable<ArrayList<BigInteger>> {
	BigInteger n;
	int d;
	final BigInteger m;

	public Step1(BigInteger n, BigInteger m, int orderOfPolynomial) {
		this.n = n;
		this.m = m;
		this.d = orderOfPolynomial;
	}

	@Override
	public ArrayList<BigInteger> call() throws Exception {
		BigInteger zero = BigInteger.valueOf(0L);
		BigInteger one = BigInteger.valueOf(1L);
		ArrayList<BigInteger> list = new ArrayList<>();
		BigInteger tmp = n;

		for (BigInteger val = m.pow(d); tmp.compareTo(zero) >= 0 && val.compareTo(one) >= 0; val = val.divide(m)) {
			BigInteger[] dandr = tmp.divideAndRemainder(val);
			list.add(dandr[0]);
			tmp = dandr[1];
		}
		return list;
	}
}