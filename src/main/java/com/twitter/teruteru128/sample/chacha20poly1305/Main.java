package com.twitter.teruteru128.sample.chacha20poly1305;

import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class Main {

	public static void main(String[] args) throws Exception {

		KeyGenerator keyGenerator = KeyGenerator.getInstance("ChaCha20");

		SecretKey secretKey = keyGenerator.generateKey();

		byte[] nonce = new byte[12];
		{
			SecureRandom random = SecureRandom.getInstanceStrong();
			random.nextBytes(nonce);
		}

		Cipher aliceCipher = Cipher.getInstance("ChaCha20-Poly1305");
		Cipher bobCipher = Cipher.getInstance("ChaCha20-Poly1305");

		var parameterSpec2 = new IvParameterSpec(nonce);

		aliceCipher.init(Cipher.ENCRYPT_MODE, secretKey, parameterSpec2);

		byte[] encryptedResult = aliceCipher.doFinal("Hello world! This is Alice!".getBytes());

		bobCipher.init(Cipher.DECRYPT_MODE, secretKey, parameterSpec2);
		byte[] clearText = bobCipher.doFinal(encryptedResult);
		System.out.println(new String(clearText));
	}

}
