package com.twitter.teruteru128.sample.ec;

import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;

public class Main {

	public static void main(String[] args) throws Exception {
		AlgorithmParameters parameters = AlgorithmParameters.getInstance("EC");
		parameters.init(new ECGenParameterSpec("secp256r1"));
		var spec = parameters.getParameterSpec(ECParameterSpec.class);
		var curve = spec.getCurve();
		var a = curve.getA();
		var b = curve.getB();
		var coefficient_A = BigInteger.valueOf(4L);
		var coefficient_B = BigInteger.valueOf(27);
		var coefficient_delta = BigInteger.valueOf(-16L);
		var term_A = coefficient_A.multiply(a.pow(3));
		var term_B = coefficient_B.multiply(b.pow(2));
		var delta = term_A.add(term_B).multiply(coefficient_delta);
		System.out.println(delta);
	}

}
