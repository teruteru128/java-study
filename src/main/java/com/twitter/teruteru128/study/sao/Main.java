package com.twitter.teruteru128.study.sao;

import java.util.StringJoiner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		// IntStream.rangeClosed(1, 100).flatMap(i -> IntStream.range(1, 4).map(j ->
		// (int)
		// Math.pow(i, j))).filter(i -> i <=
		// 1000).distinct().sorted().forEach(System.out::println);
		IntStream stream2 = IntStream.rangeClosed(1, 100).map(i -> (int) Math.pow(i, 2)).filter(i -> i <= 1000);
		IntStream stream3 = IntStream.rangeClosed(1, 100).map(i -> (int) Math.pow(i, 3)).filter(i -> i <= 1000);
		IntStream stream4 = IntStream.rangeClosed(1, 10).map(i -> (int) Math.pow(i, 4)).filter(i -> i <= 1000);
		System.out.println(stream2.collect(() -> new StringJoiner(" "), (j, k) -> j.add(Integer.toString(k)),
				(j, k) -> j.add(k.toString())).toString());
		System.out.println("--");
		System.out.println(stream3.collect(() -> new StringJoiner(" "), (j, k) -> j.add(Integer.toString(k)),
				(j, k) -> j.add(k.toString())).toString());
		System.out.println("--");
		System.out.println(stream4.collect(() -> new StringJoiner(" "), (j, k) -> j.add(Integer.toString(k)),
				(j, k) -> j.add(k.toString())).toString());
		System.out.println("--");
		stream2 = IntStream.rangeClosed(1, 100).map(i -> (int) Math.pow(i, 2)).filter(i -> i <= 1000);
		stream3 = IntStream.rangeClosed(1, 100).map(i -> (int) Math.pow(i, 3)).filter(i -> i <= 1000);
		stream4 = IntStream.rangeClosed(1, 10).map(i -> (int) Math.pow(i, 4)).filter(i -> i <= 1000);
		System.out.println(IntStream.concat(IntStream.concat(stream2, stream3), stream4).distinct().sorted()
				.collect(() -> new StringJoiner(" "), (j, k) -> j.add(Integer.toString(k)),
						(j, k) -> j.add(k.toString()))
				.toString());
	}

}
