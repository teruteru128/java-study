package com.twitter.teruteru128.sample.verisign.test1.step1;

import java.math.BigInteger;

public class Step2_0 extends Step2<BigInteger> {

	public Step2_0(BigInteger negate) {
		super(negate);
	}

	@Override
	public BigInteger call() throws Exception {
		BigInteger sum = BigInteger.valueOf(0);
		BigInteger x = BigInteger.valueOf(1);
		for (long coefficient : getCoefficients()) {
			sum = sum.add(x.multiply(BigInteger.valueOf(coefficient)));
			x = x.multiply(getM());
		}
		return sum;
	}
}