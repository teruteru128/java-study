package com.twitter.teruteru128.test.random.sample001;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.SecretKeyFactory;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;
import javax.xml.bind.DatatypeConverter;

import com.twitter.teruteru128.test.holders.SecureRandomHolder;

/**
 * @author Teruteru
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws NoSuchAlgorithmException
	 * @throws InvalidKeySpecException
	 */
	public static void main(String[] args) throws NoSuchAlgorithmException,
			InvalidKeySpecException {
		SecureRandom random = SecureRandomHolder.getInstance();
		SecretKeyFactory factory = SecretKeyFactory
				.getInstance("PBKDF2WithHMACSHA512");

		char[] password = "".toCharArray();
		byte[] salt = new byte[64];
		random.nextBytes(salt);
		int iterationCount = 1 << 14;
		int keyLength = 512;
		System.out.println(iterationCount);
		PBEKeySpec spec = new PBEKeySpec(password, salt, iterationCount,
				keyLength);
		PBEKey key = (PBEKey) factory.generateSecret(spec);
		byte[] hashedPassword = key.getEncoded();
		System.out.printf("%s%n",
				DatatypeConverter.printHexBinary(hashedPassword));
	}

}
