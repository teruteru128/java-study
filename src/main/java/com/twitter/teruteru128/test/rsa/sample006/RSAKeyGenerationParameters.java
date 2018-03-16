package com.twitter.teruteru128.test.rsa.sample006;

import java.math.BigInteger;
import java.security.SecureRandom;

public class RSAKeyGenerationParameters extends KeyGenerationParameters {
	private BigInteger publicExponent;
	private int certainty;

	/**
	 * 
	 */
	public RSAKeyGenerationParameters(BigInteger publicExponent,
			SecureRandom r, int st, int certainty) {
		super(r, st);
		this.publicExponent = publicExponent;
		this.certainty = certainty;
	}

	/**
	 * @return publicExponent
	 */
	public BigInteger getPublicExponent() {
		return publicExponent;
	}

	/**
	 * @return certainty
	 */
	public int getCertainty() {
		return certainty;
	}
}