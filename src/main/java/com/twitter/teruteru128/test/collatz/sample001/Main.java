package com.twitter.teruteru128.test.collatz.sample001;

import java.math.BigInteger;
import java.util.function.Consumer;

import com.twitter.teruteru128.holders.SecureRandomHolder;

/**
 * @author Teruteru
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BigInteger rn = new BigInteger(8192,
				SecureRandomHolder.getInstanceStrong());
		collatz(n -> {
		}, rn.pow(27).multiply(rn).add(rn));
	}

	private static final BigInteger ONE = BigInteger.valueOf(1L);
	private static final BigInteger THREE = BigInteger.valueOf(3L);

	public static BigInteger collatz(Consumer<BigInteger> consumer, BigInteger n) {

		consumer.accept(n);
		if (n.compareTo(ONE) > 0) {
			return collatz(consumer, n.testBit(0) ? n.multiply(THREE).add(ONE)
					: n.shiftRight(1));
		} else {
			return ONE;
		}
	}
}
