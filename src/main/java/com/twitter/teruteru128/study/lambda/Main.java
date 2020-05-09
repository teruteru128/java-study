package com.twitter.teruteru128.study.lambda;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.twitter.teruteru128.util.Printer;

public class Main {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("list1", "list2", "list3", "list4",
                "list5");
        String[] array = { "配列1", "配列2", "配列3", "配列4", "配列5" };
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        IntStream ints = Arrays.stream(a);
        Stream<String> stream1 = list.stream();
        Stream<String> stream2 = Arrays.stream(array);
        Stream<String> stream3 = Stream.of(array);
        Stream<String> stream4 = Stream.of("1", "2", "3", "4");
        ints.forEach(e -> Printer.println(e));
        stream1.forEach(e -> Printer.println(e));
        stream2.forEach(e -> Printer.println(e));
        stream3.forEach(e -> Printer.println(e));
        stream4.forEach(e -> Printer.println(e));
        Supplier<Stream<String>> t = () -> Stream.of("t");
        CompareFunction<LocalDateTime> f = LocalDateTime.now()::compareTo; 
    }

}
