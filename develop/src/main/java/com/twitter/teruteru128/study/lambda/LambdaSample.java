package com.twitter.teruteru128.study.lambda;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.stream.Stream;

public class LambdaSample implements Callable<Void> {

    public Void call() {
        Arrays.asList("list1", "list2", "list3", "list4", "list5").stream().forEach(System.out::println);

        String[] stringArray = { "配列1", "配列2", "配列3", "配列4", "配列5" };
        Arrays.stream(stringArray).forEach(System.out::println);
        Stream.of(stringArray).forEach(System.out::println);

        int[] primitiveArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Arrays.stream(primitiveArray).forEach(System.out::println);

        Stream.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10").mapToInt(Integer::valueOf)
                .forEach(System.out::println);
        return null;
    }

}
