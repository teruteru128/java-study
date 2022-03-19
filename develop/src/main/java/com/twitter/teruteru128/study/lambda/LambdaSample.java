package com.twitter.teruteru128.study.lambda;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.stream.Stream;

public class LambdaSample implements Callable<Void> {

    public Void call() {
        Arrays.asList("list1", "list2", "list3", "list4", "list5").stream().forEach(System.out::println);;
        String[] array = { "配列1", "配列2", "配列3", "配列4", "配列5" };
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Arrays.stream(a).forEach(System.out::println);
        Arrays.stream(array).forEach(System.out::println);
        Stream.of(array).forEach(System.out::println);
        Stream.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10").mapToInt(Integer::valueOf).forEach(System.out::println);
        return null;
    }

}
