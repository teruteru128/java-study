package com.twitter.teruteru128.test.ecdh.sample001;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.spec.ECGenParameterSpec;
import java.util.Arrays;

import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * @author teruteru128
 *
 */
public class Main {
	public static final int GCM_NONCE_LENGTH = 12; // in bytes
	public static final int GCM_TAG_LENGTH = 16; // in bytes

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		byte[] inputText = "encrypto test".getBytes();

		SecureRandom random = new SecureRandom();

		KeyPairGenerator generator = KeyPairGenerator.getInstance("EC");
		Signature sign = Signature.getInstance("SHA512withECDSA");
		KeyAgreement agreement = KeyAgreement.getInstance("ECDH");
		MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
		Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");

		generator.initialize(new ECGenParameterSpec("secp521r1"), random);

		KeyPair signKeyPair1 = generator.generateKeyPair();
		KeyPair exchangeKeyPair1 = generator.generateKeyPair();
		KeyPair exchangeKeyPair2 = generator.generateKeyPair();

		sign.initSign(signKeyPair1.getPrivate(), random);
		sign.update(inputText);
		byte[] signed = sign.sign();
		sign.initVerify(signKeyPair1.getPublic());
		sign.update(inputText);
		if (sign.verify(signed)) {
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}

		PublicKey exchangePublicKey1 = exchangeKeyPair1.getPublic();
		PrivateKey exchangePrivateKey1 = exchangeKeyPair1.getPrivate();

		PublicKey exchangePublicKey2 = exchangeKeyPair2.getPublic();
		PrivateKey exchangePrivateKey2 = exchangeKeyPair2.getPrivate();

		agreement.init(exchangePrivateKey1, random);
		agreement.doPhase(exchangePublicKey2, true);
		SecretKey secretKey1 = new SecretKeySpec(sha256.digest(agreement
				.generateSecret()), "AES");

		agreement.init(exchangePrivateKey2, random);
		agreement.doPhase(exchangePublicKey1, true);
		SecretKey secretKey2 = new SecretKeySpec(sha256.digest(agreement
				.generateSecret()), "AES");

		final byte[] nonce = new byte[GCM_NONCE_LENGTH];
		random.nextBytes(nonce);
		GCMParameterSpec spec = new GCMParameterSpec(GCM_TAG_LENGTH * 8, nonce);
		cipher.init(Cipher.ENCRYPT_MODE, secretKey1, spec);

		byte[] aad = "Whatever I like".getBytes();
		cipher.updateAAD(aad);

		byte[] cipherText = cipher.doFinal(inputText);

		cipher.init(Cipher.DECRYPT_MODE, secretKey2, spec);

		cipher.updateAAD(aad);

		byte[] plainText = cipher.doFinal(cipherText);

		if (Arrays.equals(inputText, plainText)) {
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}
	}

}
