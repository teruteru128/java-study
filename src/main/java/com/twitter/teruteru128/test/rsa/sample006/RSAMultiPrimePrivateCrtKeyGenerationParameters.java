package com.twitter.teruteru128.test.rsa.sample006;

import java.math.BigInteger;
import java.security.SecureRandom;

public class RSAMultiPrimePrivateCrtKeyGenerationParameters extends
		RSAKeyGenerationParameters {
	private int otherPrimeInfoNum;

	/**
	 * 
	 */
	public RSAMultiPrimePrivateCrtKeyGenerationParameters(BigInteger p,
			SecureRandom r, int s, int c, int num) {
		super(p, r, s, c);
		if (num < 0) {
			throw new IllegalArgumentException(
					"other prime info num cannot be negative");
		}
	}

	/**
	 * @return otherPrimeInfoNum
	 */
	public int getOtherPrimeInfoNum() {
		return otherPrimeInfoNum;
	}
}