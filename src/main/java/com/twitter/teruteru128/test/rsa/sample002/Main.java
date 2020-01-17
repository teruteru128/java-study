package com.twitter.teruteru128.test.rsa.sample002;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author Teruteru
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BigInteger n1 = new BigInteger(
				"af240808297a359e600caae74b3b4edc7cbc3c451cbb2be0fe2902f95708a364851527f5f1adc831895d22e82aaaa642b38ff8b955b7b1b74bb3fe8f7e0757ecef43db66621561cf600da4d8def8e0c362083d5413eb49ca59548526e52b8f1b",
				16);
		BigDecimal n = new BigDecimal(
				"3.2590569672321782171743988150442311952228418283526525233070268010887319184696991837922217436198986916871395313891958895e+115");
		BigInteger sqrt_n = n.toBigInteger();
		System.out.printf("%x%n", sqrt_n);
		System.out.println(sqrt_n.pow(2));
		System.out.println(n1);
		System.out.println(sqrt_n.add(BigInteger.valueOf(1L)).pow(2));
	}

}
