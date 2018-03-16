package com.twitter.teruteru128.test.ts.sample003;

import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Searcher implements Runnable {
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
			byte[] buf1 = new byte[20];
			byte[] buf2 = new byte[20];
			final byte[] key = publicKey.getBytes();
			final int minbytes = this.minbytes;
			final int minbits = this.minSecurityLevel;
			int zerobytes;
			int zerobits;
			int securityLevel = 0;
			final boolean flg = (minSecurityLevel < 8);
			int length;
			while (true) {
				length = toUnsignedDecByteArray(verifier, buf2);
				sha1.update(key);
				sha1.update(buf2, 0, length);
				try {
					sha1.digest(buf1, 0, 20);
				} catch (DigestException e) {
					e.printStackTrace();
				}
				if (flg || buf1[0] == 0) {
					for (zerobytes = 0; zerobytes < 20 && buf1[zerobytes] == 0; zerobytes++) {
						// NONE
					}
					if (zerobytes >= minbytes) {
						if (zerobytes < 20) {
							byte lastbyte = buf1[zerobytes];
							for (zerobits = 0; (lastbyte & 1) != 1; zerobits++, lastbyte >>= 1) {
								// NONE
							}
							securityLevel = 8 * zerobytes + zerobits;
							if (securityLevel >= minbits) {
								synchronized (System.out) {
									System.out
											.printf("Security Level(verifier) : %d(%s)%n",
													securityLevel,
													Long.toUnsignedString(verifier));
								}
							}
						}
					}
				}
				verifier++;
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}

	private static final byte[] DIGIT = { '0', '1', '2', '3', '4', '5', '6',
			'7', '8', '9' };

	/**
	 * 
	 */
	private int toUnsignedDecByteArray(long l, byte[] buf) {
		long quot = (l >>> 1) / 5;
		long rem = l - (quot * 10);
		int length = 0;
		if (l == Long.MIN_VALUE) {
			System.arraycopy("18446744073709551615".getBytes(), 0, buf, 0, 20);
			length = 20;
		} else if (l >= 0) {
			length = toUnsignedDecByteArrayPos(l, buf);
		} else {
			length = toUnsignedDecByteArrayPos(quot, buf);
			buf[length++] = DIGIT[(int) rem];
		}
		return length;
	}

	private static final byte[] DigitTens = { '0', '0', '0', '0', '0', '0',
			'0', '0', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1',
			'1', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '3', '3',
			'3', '3', '3', '3', '3', '3', '3', '3', '4', '4', '4', '4', '4',
			'4', '4', '4', '4', '4', '5', '5', '5', '5', '5', '5', '5', '5',
			'5', '5', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '7',
			'7', '7', '7', '7', '7', '7', '7', '7', '7', '8', '8', '8', '8',
			'8', '8', '8', '8', '8', '8', '9', '9', '9', '9', '9', '9', '9',
			'9', '9', '9', };
	private static final byte[] DigitOnes = { '0', '1', '2', '3', '4', '5',
			'6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8',
			'9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1',
			'2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4',
			'5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7',
			'8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
			'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3',
			'4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6',
			'7', '8', '9', };
	private static final byte[] digits = { '0', '1', '2', '3', '4', '5', '6',
			'7', '8', '9' };

	private int toUnsignedDecByteArrayPos(long l, byte[] buf) {
		int length = stringSize(l);
		long q;
		int r;
		int charPos = length;
		while (l > Integer.MAX_VALUE) {
			q = l / 100;
			// really: r = i - (q * 100);
			r = (int) (l - ((q << 6) + (q << 5) + (q << 2)));
			l = q;
			buf[--charPos] = DigitOnes[r];
			buf[--charPos] = DigitTens[r];
		}
		int q2;
		int i2 = (int) l;
		while (i2 >= 65536) {
			q2 = i2 / 100;
			r = i2 - ((q2 << 6) + (q2 << 5) + (q2 << 2));
			i2 = q2;
			buf[--charPos] = DigitOnes[r];
			buf[--charPos] = DigitTens[r];
		}
		for (;;) {
			q2 = (i2 * 52429) >>> (16 + 3);
			r = i2 - ((q2 << 3) + (q2 << 1));
			buf[--charPos] = digits[r];
			i2 = q2;
			if (i2 == 0) {
				break;
			}
		}
		return length;
	}

	/**
	 * @param l
	 * @return
	 */
	private int stringSize(long l) {
		long p = 10;
		for (int i = 1; i < 19; i++) {
			if (l < p) {
				return i;
			}
			p = 10 * p;
		}
		return 19;
	}
}