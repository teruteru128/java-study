package com.twitter.teruteru128.study.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author Teruteru
 *
 */
public class Citrus_depressa {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Stream<String> hoge = createStream();
        Stream<String> hoge2 = createStream();
        hoge.forEach(System.out::println);
        System.out.println(hoge2.count());
    }

    private static Stream<String> createStream() {
        ArrayList<String> sourceA = new ArrayList<>(Arrays.asList("ィ", "イ", "ィー", "イー", "ー"));
        ArrayList<String> sourceB = new ArrayList<>(Arrays.asList("ア", "ァ", "ワ", "ヮ"));
        ArrayList<String> sourceC = new ArrayList<>(Arrays.asList("ー", ""));
        ArrayList<String> sourceD = new ArrayList<>(Arrays.asList("サ", "シャ"));
        return sourceA.stream().<String>flatMap(a -> {
            return sourceB.stream().<String>flatMap(b -> {
                return sourceC.stream().<String>flatMap(c -> {
                    return sourceD.stream().<String>map(d -> {
                        return new StringBuilder("シ").append(a).append("ク").append(b).append(c).append(d).append("ー").toString();
                    });
                });
            });
        });
    }
}
