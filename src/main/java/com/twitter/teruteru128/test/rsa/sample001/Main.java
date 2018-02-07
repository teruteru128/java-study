package com.twitter.teruteru128.test.rsa.sample001;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.interfaces.RSAPublicKey;

/**
 * @author Teruteru
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws CertificateException,
			IOException {
		Certificate certificate = loadCertificate("verisign_G5.cer");
		RSAPublicKey key = (RSAPublicKey) certificate.getPublicKey();
		BigInteger modulus = key.getModulus();
		System.out.printf("0x%0514x%n", modulus);
		// 2, 4, 8, 16
		// 3, 5, 7, 9, 11, 13
		int[][] matrix = { { 2, 7 }, { 5, 8 }, { 3, 13 }, { 4, 9 }, { 11, 16 } };
		int length = matrix.length;
		BigInteger tmp = modulus;
		for (int i = 0; i < length; i++) {
			int[] map = matrix[i];
			tmp = convert(tmp, map[0], map[1]);
		}
		System.out.printf("0x%0514x%n", tmp);
	}

	public static BigInteger convert(BigInteger n, int out, int in) {
		return new BigInteger(n.toString(out), in);
	}

	/**
	 * 
	 */
	private static Certificate loadCertificate(String name)
			throws CertificateException, IOException {
		CertificateFactory factory = CertificateFactory.getInstance("X.509");
		try (InputStream stream = ClassLoader.getSystemResourceAsStream(name)) {
			return factory.generateCertificate(stream);
		} catch (Exception e) {
			return null;
		}
	}
}
