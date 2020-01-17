package com.twitter.teruteru128.test.rsa.sample003;

import java.math.BigInteger;

import com.twitter.teruteru128.holders.SecureRandomHolder;
import com.twitter.teruteru128.test.rsa.util.Util;

/**
 * ax + b ≡ 0 (mod c - x) を満たす整数xを探す
 * 
 * @author Teruteru
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final BigInteger n = Util.N;
		final BigInteger sqrt_n = Util.SQRT_N;
		final BigInteger zero = BigInteger.valueOf(0L);
		final BigInteger one = BigInteger.valueOf(1L);
		final BigInteger two = BigInteger.valueOf(2L);
		final BigInteger p = BigInteger.probablePrime(1365,
				SecureRandomHolder.getInstance());
		BigInteger[] ds = n.divideAndRemainder(p);
		final BigInteger a = ds[0];
		final BigInteger b = ds[1];
		final BigInteger c = p;
		BigInteger mod = c;
		BigInteger x = new BigInteger(1300, SecureRandomHolder.getInstance());
		BigInteger d = c.divide(a).add(one).multiply(a).mod(c);
		
		int maxModBitLength = mod.bitLength();
		int currentModBitLength;
		BigInteger primod = c;
		BigInteger prix = x;
		do {
			System.out.println("c");
			x = x.add(d);
			if (x.compareTo(c) >= 0) {
				break;
			}
			mod = a.multiply(x).add(b).mod(c.subtract(x));
			currentModBitLength = mod.bitLength();
			if (currentModBitLength != 0) {
				if (currentModBitLength < maxModBitLength) {
					maxModBitLength = currentModBitLength;
					System.out.printf("%d%n", mod);
				}
				if (primod.compareTo(mod) > 0) {
					System.out.println("primod > mod");
					break;
				}
			}
			primod = mod;
			prix = x;
		} while (!mod.equals(zero));
		System.out.printf("a : %dbit%n", a.bitLength());
		System.out.printf("b : %dbit%n", b.bitLength());
		System.out.printf("c(%dbit) : %d%n", c.bitLength(), c);
		System.out.printf("d(%dbit) : %d%n", d.bitLength(), d);
		System.out.printf("(%dbit)\t%d * %d + %d ≡ %d (mod %d)%n",
				primod.bitLength(), a, prix, b, primod, c.subtract(prix));
		System.out.printf("(%dbit)\t%d * %d + %d ≡ %d (mod %d)%n",
				mod.bitLength(), a, x, b, mod, c.subtract(x));
	}

}
