package com.twitter.teruteru128.test.ts.sample003;

import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class Searcher implements Runnable {
	private final String publicKey;
	private long verifier;
	private final int minSecurityLevel;
	private final int minbytes;

	/**
	 * @param publicKey
	 *            base64 encoded public key
	 * @param verifier
	 *            security level verifier
	 * @param min
	 *            Security level lower limit boundary value
	 */
	public Searcher(String publicKey, long verifier, int min) {
		this.publicKey = publicKey;
		this.verifier = verifier;
		this.minSecurityLevel = min;
		this.minbytes = min / 8;
	}

	/**
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		try {
			MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
			long verifier = this.verifier;
			String verifier_str;
			byte[] buf = new byte[20];
			final int length = publicKey.length();
			final int minbytes = this.minbytes;
			final int minbits = this.minSecurityLevel;
			StringBuilder buffer = new StringBuilder(publicKey);
			int zerobytes;
			int zerobits;
			int securityLevel = 0;
			while (true) {
				zerobytes = zerobits = 0;
				verifier_str = Long.toUnsignedString(verifier, 10);
				buffer.append(verifier_str);
				sha1.update(buffer.toString().getBytes());
				buffer.setLength(length);
				try {
					sha1.digest(buf, 0, 20);
				} catch (DigestException e) {
					e.printStackTrace();
				}
				for (zerobytes = 0; zerobytes < 20 && buf[zerobytes] == 0; zerobytes++) {
					// NONE
				}
				if (zerobytes >= minbytes) {
					if (zerobytes < 20) {
						byte lastbyte = buf[zerobytes];
						for (zerobits = 0; (lastbyte & 1) != 1; zerobits++, lastbyte >>= 1) {
							// NONE
						}
						securityLevel = 8 * zerobytes + zerobits;
						if (securityLevel >= minbits) {
							System.out.printf(
									"Security Level(verifier) : %d(%s)%n",
									securityLevel, verifier_str);
						}
					}
				}
				verifier++;
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}

}