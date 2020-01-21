package com.twitter.teruteru128.study.rsa.sample001;

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
		System.out.printf("0x%x%n", modulus);
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
