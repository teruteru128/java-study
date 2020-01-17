package com.twitter.teruteru128.test.rsa.sample006;

import java.security.SecureRandom;

public class KeyGenerationParameters {
	private SecureRandom random;
	private int strength;

	/**
	 * 
	 */
	public KeyGenerationParameters(SecureRandom random, int strength) {
		this.random = random;
		this.strength = strength;
	}

	/**
	 * @return random
	 */
	public SecureRandom getRandom() {
		return random;
	}

	/**
	 * @return strength
	 */
	public int getStrength() {
		return strength;
	}
}