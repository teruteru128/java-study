package com.twitter.teruteru128.sample.fourcube;

import java.security.SecureRandom;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		long x, xLength, xMax;
		long y, yLength, yMax;
		long z, zLength, zMax;

		Random rnd = new SecureRandom();
		x =Math.abs(rnd.nextInt());
		y = rnd.nextInt();
		z = -Math.abs(rnd.nextInt());
		System.out.printf("%d, %d, %d%n", x, y, z);
		xLength = yLength = zLength = 100000000;

		long sum = 0;
		for (; x < Long.MAX_VALUE; x++) {
			for (; y < Long.MAX_VALUE; y++) {
				for (; z < Long.MAX_VALUE; z++) {
					sum = x * x * x + y * y * y + z * z * z;
					if (0 <= sum && sum < 200) {
						System.out.printf("%d, %d, %d, %d%n", sum, x, y, z);
					}
				}
			}
		}
	}

}
