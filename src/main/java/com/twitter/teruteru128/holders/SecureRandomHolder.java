package com.twitter.teruteru128.holders;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * @author Teruteru
 *
 */
public final class SecureRandomHolder {
	/**
 * 
 */
	private SecureRandomHolder() {

	}

	private static final SecureRandom INSTANCE;
	private static final SecureRandom INSTANCE_STRONG;

	static {
		SecureRandom instance = null;
		SecureRandom instanceStrong = null;
		try {
			instanceStrong = SecureRandom.getInstanceStrong();
		} catch (NoSuchAlgorithmException e) {
			// XXX (Probably) environment dependent code
			instanceStrong = new SecureRandom();
		} finally {
			instance = new SecureRandom(instanceStrong.generateSeed(8));
			INSTANCE_STRONG = instanceStrong;
			INSTANCE = instance;
		}
	}

	/**
	 * @return instance
	 */
	public static SecureRandom getInstance() {
		return INSTANCE;
	}

	/**
	 * @return instanceStrong
	 */
	public static SecureRandom getInstanceStrong() {
		return INSTANCE_STRONG;
	}
}
