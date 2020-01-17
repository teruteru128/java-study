package com.twitter.teruteru128.test.ts.sample002;

import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

/**
 * @author Teruteru
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long counter = 190500641686L;
		long nano = System.nanoTime();
		long milli = System.currentTimeMillis();
		long seed = nano ^ milli;
		counter = new Random(seed).nextLong();
		String key = "MEwDAgcAAgEgAiEA7Vo1+Orf2xuuu6hTPAPldSfrUZZ7WYAzpRcO5DoYFLoCIF1JKVBctOGvMOy495O/BWFuFEYH4i1f6vU0b9+a64RD";
		try {
			MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
			StringBuilder builder = new StringBuilder(key);
			int start_ptr = builder.length();
			byte[] hash = new byte[20];
			int zerobytes = 0;
			int zerobits = 0;
			int securityLevel = 0;
			String counter_str;
			while (true) {
				counter_str = Long.toUnsignedString(counter, 10);
				builder.append(counter_str);
				sha1.update(builder.toString().getBytes());
				sha1.digest(hash, 0, 20);
				builder.setLength(start_ptr);
				while (zerobytes < 20 && hash[zerobytes] == 0) {
					zerobytes++;
				}
				if (zerobytes >= 4) {
					if (zerobytes < 20) {
						byte lastbyte = hash[zerobytes];
						while ((lastbyte & 1) != 1) {
							zerobits++;
							lastbyte >>= 1;
						}
					}
					securityLevel = 8 * zerobytes + zerobits;
					if (securityLevel >= 38) {
						System.out.printf("Security Level(counter) : %d(%s)%n",
								securityLevel, counter_str);
					}
				}
				zerobytes = 0;
				zerobits = 0;
				counter++;
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (DigestException e) {
			e.printStackTrace();
		}
	}

}
