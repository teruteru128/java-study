package com.twitter.teruteru128.study.rsa.gen003;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws IOException {
		Path path1 = Paths.get("C:\\Users\\terut\\Downloads\\out2.txt");
		Path path2 = Paths.get("C:\\Users\\terut\\Downloads\\out3.txt");
		List<String> list = Files.readAllLines(path1).stream().map(l -> new BigInteger(l, 10))
				.map(i -> i.bitLength() != 67108864 ? i.shiftLeft(2).or(BigInteger.ONE) : i).map(i -> i.toString(16))
				.collect(Collectors.toList());
		Files.write(path2, list, StandardOpenOption.CREATE);
		// System.out.println(isPrime(BigInteger.valueOf(65537)));
	}

	private static boolean isPrime(BigInteger p) {
		final BigInteger zero = BigInteger.valueOf(0);
		final BigInteger one = BigInteger.valueOf(1);
		final BigInteger two = BigInteger.valueOf(2);
		BigInteger n = p.abs();
		// n = 2
		if (n.equals(two)) {
			return true;
		}
		// n = 1 or n is even
		if (n.equals(one) || n.and(one).equals(zero)) {
			return false;
		}
		int k = 1;
		BigInteger a = BigInteger.valueOf(2);

		return true;
	}

	private static BigInteger random(BigInteger n) {
		return new BigInteger(n.bitLength(), new Random());
	}
}
