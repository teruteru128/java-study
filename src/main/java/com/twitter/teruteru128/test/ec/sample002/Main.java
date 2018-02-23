package com.twitter.teruteru128.test.ec.sample002;

import java.math.BigInteger;

import org.bouncycastle.jce.ECNamedCurveTable;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.math.ec.ECPoint;

/**
 * @author Teruteru
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ECNamedCurveParameterSpec spec1 = ECNamedCurveTable
				.getParameterSpec("secp256r1");
		BigInteger n = spec1.getN();
		BigInteger one = BigInteger.valueOf(1L);
		BigInteger two = BigInteger.valueOf(2L);
		ECPoint g = spec1.getG();
		ECPoint inf = g.multiply(n);
		ECPoint g1 = g.multiply(n.subtract(one));
		ECPoint g2 = g.multiply(two);
		ECPoint g3 = g.multiply(one);
		System.out.printf("G : %s%n", g);
		System.out.printf("INF : %s%n", inf);
		System.out.printf("(N-1)G : %s%n", g1);
		System.out.printf("g1+G : %s%n", g1.add(g));
		System.out.printf("2G : %s%n", g3);
		System.out.printf("3G : %s%n", g2);
		System.out.printf("g1+g2 : %s%n", g1.add(g2));
		System.out.printf("(n+1)G : %s%n", g.multiply(n.add(one)));
	}

}
