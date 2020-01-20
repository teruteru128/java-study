package com.twitter.teruteru128.sample.tor.s2k.sample1;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * @see <a href="https://gist.github.com/antitree/3962751/d7110ef3767f64b1f10750da6ddf0a7ad4337709">a</a>
 */
class Main {
	public static String genHashedPassword(byte[] secret) {
		SecureRandom random = new SecureRandom();
		char indicator = (char) 0x60;

		byte[] salt = new byte[9];
		random.nextBytes(salt);
		salt[8] = (byte) indicator;

		String prefix = "16:";
		int c = salt[8];
		int EXPBIAS = 6;
		int count = (16 + (c & 15)) << ((c >> 4) + EXPBIAS);
		MessageDigest d=null;
		try {
			d = MessageDigest.getInstance("SHA-1");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		byte[] tmp = new byte[salt.length + secret.length];
		System.arraycopy(salt, 0, tmp, 0, salt.length);
		System.arraycopy(secret, 0, tmp, salt.length, secret.length);

		int slen = tmp.length;
		while (count > 0) {
			if (count > slen) {
				d.update(tmp);
				count -= slen;
			} else {
				d.update(tmp, 0, count);
				count = 0;
			}
		}
		byte[] hashed = d.digest();
		/*
		 * #Convert to hex salt = binascii.b2a_hex(salt[:8]).upper() indicator =
		 * binascii.b2a_hex(indicator) torhash = binascii.b2a_hex(hashed).upper()
		 * 
		 * #Put it all together into the proprietary Tor format. print(prefix + salt +
		 * torhash)
		 */
		return null;
	}
}
