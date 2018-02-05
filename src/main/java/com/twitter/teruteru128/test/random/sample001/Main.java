package com.twitter.teruteru128.test.random.sample001;

import java.math.BigInteger;
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

		char[] password = "In cryptographic salt, uniqueness is more important than unpredictability.".toCharArray();
		/**
		 * salt生成法 seedをシステム製作時に符号なし512bit整数として生成し、
		 * seedからsaltを作成するたびにseedをインクリメントする
		 * */
		BigInteger seed = new BigInteger(64 * 8, random);
		byte[] salt = seed.toByteArray();
		seed = seed.add(BigInteger.valueOf(1L));
		int iterationCount = 1 << 14;
		int keyLength = 512;
		PBEKeySpec spec = new PBEKeySpec(password, salt, iterationCount,
				keyLength);
		PBEKey key = (PBEKey) factory.generateSecret(spec);
		byte[] hashedPassword = key.getEncoded();
		System.out.printf("%s%n",
				DatatypeConverter.printHexBinary(hashedPassword));
	}

}
