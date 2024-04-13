package com.github.teruteru128.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// FIXME
public class Takarakuji {

    private static final ArrayList<Integer> numberOriginalList = IntStream.rangeClosed(1, 37).boxed()
            .collect(Collectors.toCollection(ArrayList<Integer>::new));
    private static final RandomGenerator random = RandomGeneratorFactory.all().filter(f -> !f.name().equals("SecureRandom") && f.stateBits() >= 144).min(Comparator.comparingInt(RandomGeneratorFactory<RandomGenerator>::stateBits)).orElse(RandomGeneratorFactory.of("SecureRandom")).create();

    public static void getLoto7Numbers(int counts) {
        var selectedNumberArray = new int[7];
        for (int i = 0; i < counts; i++) {
            Collections.shuffle(numberOriginalList, random);
            for (int j = 0; j < 7; j++) {
                selectedNumberArray[j] = numberOriginalList.get(j);
            }
            Arrays.sort(selectedNumberArray);
            System.out.printf("%d, %d, %d, %d, %d, %d, %d%n", selectedNumberArray[0], selectedNumberArray[1],
                    selectedNumberArray[2], selectedNumberArray[3], selectedNumberArray[4], selectedNumberArray[5],
                    selectedNumberArray[6]);
        }
    }

}
