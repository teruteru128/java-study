package com.twitter.teruteru128.study;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// FIXME
public class Takarakuji {

    public static void getLoto7Numbers(int counts) {
        var numberOriginalList = IntStream.rangeClosed(1, 37).boxed()
                .collect(Collectors.toCollection(ArrayList<Integer>::new));
        var selectedNumberArray = new int[7];
        SecureRandom random;
        try {
            random = SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException e) {
            random = new SecureRandom();
        }
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
