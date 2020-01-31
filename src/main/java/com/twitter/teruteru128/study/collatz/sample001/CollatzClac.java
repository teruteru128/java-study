package com.twitter.teruteru128.study.collatz.sample001;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @author Teruteru
 *
 */
public class CollatzClac {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BigInteger rn = new BigInteger(8192, new SecureRandom());
		var a = Stream.iterate(rn, i -> i.compareTo(ONE) > 0,
		i -> i.testBit(0) ? i.multiply(THREE).add(ONE) : i.shiftRight(1)).count();
		System.out.println(a);
		// collatz(n -> {}, rn.pow(27).multiply(rn).add(rn));
	}

	private static final BigInteger ONE = BigInteger.valueOf(1L);
	private static final BigInteger THREE = BigInteger.valueOf(3L);

	public static BigInteger collatz(Consumer<BigInteger> consumer, BigInteger n) {

		consumer.accept(n);
		if (n.compareTo(ONE) > 0) {
			return collatz(consumer, n.testBit(0) ? n.multiply(THREE).add(ONE) : n.shiftRight(1));
		} else {
			return ONE;
		}
	}
}
