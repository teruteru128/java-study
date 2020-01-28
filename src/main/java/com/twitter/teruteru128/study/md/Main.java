package com.twitter.teruteru128.study.md;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;

public class Main implements Callable<HashBean> {
	private int targetnlz;
	private String obfId;

	public Main(int targetnlz, String obfId) {
		this.targetnlz = targetnlz;
		this.obfId = obfId;
	}

	private int toUnsignedStringBytes(long i, byte[] buf) {
		if (i >= 0) {
			int size = stringSize(i);
			if (size < buf.length) {
				throw new IllegalArgumentException("Buffer size is insufficient");
			}
			return toStringBytes(i, size, buf);
		} else {
			long quot = (i >>> 1) / 5;
			long rem = i - quot * 10;
			int size = stringSize(quot);
			if ((size + 1) < buf.length) {
				throw new IllegalArgumentException("Buffer size is insufficient");
			}
			int length = toStringBytes(quot, size, buf);
			buf[0] = (byte) ('0' + rem);
			return length + 1;
		}
	}

	static final byte[] DigitTens = { '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1',
			'1', '1', '1', '1', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '3', '3', '3', '3', '3', '3', '3',
			'3', '3', '3', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '5', '5', '5', '5', '5', '5', '5', '5',
			'5', '5', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '7', '7', '7', '7', '7', '7', '7', '7', '7',
			'7', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9', };

	static final byte[] DigitOnes = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5',
			'6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6',
			'7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7',
			'8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8',
			'9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', };

	private int toStringBytes(long i, int index, byte[] buf) {
		long q;
		int r;
		int charPos = index;

		boolean negative = (i < 0);
		if (!negative) {
			i = -i;
		}

		// Get 2 digits/iteration using longs until quotient fits into an int
		while (i <= Integer.MIN_VALUE) {
			q = i / 100;
			r = (int) ((q * 100) - i);
			i = q;
			buf[--charPos] = DigitOnes[r];
			buf[--charPos] = DigitTens[r];
		}

		// Get 2 digits/iteration using ints
		int q2;
		int i2 = (int) i;
		while (i2 <= -100) {
			q2 = i2 / 100;
			r = (q2 * 100) - i2;
			i2 = q2;
			buf[--charPos] = DigitOnes[r];
			buf[--charPos] = DigitTens[r];
		}

		// We know there are at most two digits left at this point.
		q2 = i2 / 10;
		r = (q2 * 10) - i2;
		buf[--charPos] = (byte) ('0' + r);

		// Whatever left is the remaining digit.
		if (q2 < 0) {
			buf[--charPos] = (byte) ('0' - q2);
		}

		if (negative) {
			buf[--charPos] = (byte) '-';
		}
		return charPos;
	}

	private int stringSize(long x) {
		int d = 1;
		if (x >= 0) {
			d = 0;
			x = -x;
		}
		long p = -10;
		for (int i = 1; i < 19; i++) {
			if (x > p)
				return i + d;
			p = 10 * p;
		}
		return 19 + d;
	}

	@Override
	public HashBean call() throws Exception {
		long salt = 0;
		Long.toUnsignedString(salt);
		byte[] a = new byte[20];
		byte[] b = new byte[20];
		Arrays.fill(b, (byte) 0);
		byte[] swap_tmp = null;
		MessageDigest sha1 = MessageDigest.getInstance("SHA1");
		final int hashbytes = sha1.getDigestLength();
		ThreadLocalRandom.current().nextBytes(a);
		int zerobytes = 0;
		int zerobits = 0;
		int currentnlz;
		int bestnlz = 0;
		int targetnlz = this.targetnlz;
		byte lastbyte_tmp = 0;
		System.out.printf("Thread id : %d%n", Thread.currentThread().getId());
		HashBean bean = HashBean.getEmpty();
		for (;;) {
			sha1.update(a, 0, 20);
			sha1.digest(b, 0, 20);
			for (zerobytes = 0; zerobytes < hashbytes && b[zerobytes] == 0; zerobytes++) {
				// NONE
			}
			zerobits = 0;
			if (zerobytes < hashbytes) {
				lastbyte_tmp = b[zerobytes];
				while ((lastbyte_tmp & 0x80) == 0) {
					zerobits++;
					lastbyte_tmp <<= 1;
				}
			}
			currentnlz = zerobytes * 8 + zerobits;
			if (currentnlz > bestnlz) {
				synchronized (System.out) {
					System.out.printf("%d:%dbits:", Thread.currentThread().getId(), currentnlz);
					for (byte data : a) {
						System.out.printf("%02x", data);
					}
					System.out.print(":");
					for (byte data : b) {
						System.out.printf("%02x", data);
					}
					System.out.println();
				}
				bestnlz = currentnlz;
				bean = new HashBean(a.clone(), b.clone(), currentnlz);
			}

			if (currentnlz >= targetnlz) {
				break;
			}
			swap_tmp = a;
			a = b;
			b = swap_tmp;
		}
		return bean;
	}

	private void obsIdToPublicKey() {
		// TODO
	}

	public static void main(String[] args) throws Exception {
		ExecutorService service = Executors.newWorkStealingPool();
		ArrayList<Main> list = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			list.add(new Main(160,
					"TQtQLS+B9PF8KlpNFNhh0Gw0WxkeKUNWC0wURBYHXWE1dmRbV2FREDZoPFJiPXRLE2dSfQV2XD8jeVsie34BeHtnclNAKn5GLCtIUFhULkpzZ3FAInBqKgMNBFEHFWYABwkdUjY0UkRBaUJzUjQ0MmpBYlVldkZkajVlWktVOWEzcHh1d0JIQzNBS29ZYVpJczRSWDZRPT0="));
		}
		HashBean bean = service.invokeAny(list);
		if (!bean.isEmpty()) {
			System.out.printf("%dbits%n", bean.getNlz());
			for (byte b : bean.getInput()) {
				System.out.printf("%02x", b);
			}
			System.out.print(":");
			for (byte b : bean.getHash()) {
				System.out.printf("%02x", b);
			}
		}
	}

}
