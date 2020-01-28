package com.twitter.teruteru128.study.random;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random(0);
		System.out.println(random.nextInt());
		System.out.printf("%s%n", Integer.toUnsignedString(random.nextInt()));
	}

}
