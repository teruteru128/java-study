package com.twitter.teruteru128.study;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Takarakuji {

    public static void getLoto7Numbers(int counts) throws NoSuchAlgorithmException {
        var numberOriginalList = IntStream.rangeClosed(1, 37).mapToObj(Integer::valueOf)
                .collect(Collectors.toCollection(ArrayList<Integer>::new));
        var selectedNumberArray = new int[7];
        SecureRandom random;
        try {
            random = SecureRandom.getInstanceStrong();
        } catch (Exception e) {
            random = new SecureRandom();
        }
        for (int i = 0; i < counts; i++) {
            Collections.shuffle(numberOriginalList, random);
            for (int j = 0; j < 7; j++) {
                selectedNumberArray[j] = numberOriginalList.get(j);
            }
            Arrays.sort(selectedNumberArray);
            StringJoiner joiner = new StringJoiner(", ");
            for (var n : selectedNumberArray) {
                joiner.add(Integer.toString(n));
            }
            System.out.println(joiner);
        }
    }

}
