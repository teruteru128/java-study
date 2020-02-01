package com.twitter.teruteru128.study.sao;

import java.util.StringJoiner;
import java.util.stream.IntStream;

public class Main {

	private static IntStream getStream(int end, int pow, int lessthan) {
		return IntStream.rangeClosed(1, end).map(i -> (int) Math.pow(i, pow)).filter(i -> i <= lessthan);
	}

	static StringJoiner collectToStringJoiner(IntStream in) {
		return in.collect(() -> new StringJoiner(" "), (j, k) -> j.add(Integer.toString(k)), (j, k) -> j.merge(k));
	}

	public static void main(String[] args) {
		var a = IntStream.rangeClosed(1, 100).flatMap(i -> IntStream.range(1, 4).map(j -> (int) Math.pow(i, j)))
				.filter(i -> i <= 1000).distinct().sorted()
				.collect(() -> new StringJoiner(" "), (j, k) -> j.add(Integer.toString(k)), (j, k) -> j.merge(k))
				.toString();
		System.out.println(a);
		System.out.println("--");
		IntStream stream2 = getStream(100, 2, 1000);
		IntStream stream3 = getStream(100, 3, 1000);
		IntStream stream4 = getStream(10, 4, 1000);
		System.out.println(collectToStringJoiner(stream2).toString());
		System.out.println("--");
		System.out.println(collectToStringJoiner(stream3).toString());
		System.out.println("--");
		System.out.println(collectToStringJoiner(stream4).toString());
		System.out.println("--");
		stream2 = getStream(100, 2, 1000);
		stream3 = getStream(100, 3, 1000);
		stream4 = getStream(10, 4, 1000);
		System.out.println(
				collectToStringJoiner(IntStream.concat(IntStream.concat(stream2, stream3), stream4).sorted().distinct())
						.toString());
	}

}
