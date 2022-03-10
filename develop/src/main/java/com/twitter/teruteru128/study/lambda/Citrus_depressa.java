package com.twitter.teruteru128.study.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * シークワーサーの表記揺れを返す
 * @author Teruteru
 *
 */
public class Citrus_depressa {

    /**
     * @param args
     */
    public static void main(String[] args) {
        createStream().forEach(System.out::println);
        System.out.println(createStream().count());
    }

    private static Stream<String> createStream() {
        List<String> sourceA = Arrays.asList("ィ", "イ", "ィー", "イー", "ー");
        List<String> sourceB = Arrays.asList("ア", "ァ", "ワ", "ヮ");
        List<String> sourceC = Arrays.asList("ー", "");
        List<String> sourceD = Arrays.asList("サ", "シャ");
        return sourceA.stream()
                .flatMap(a -> sourceB.stream()
                        .flatMap(b -> sourceC.stream().flatMap(c -> sourceD.stream().map(d -> new StringBuilder("シ")
                                .append(a).append("ク").append(b).append(c).append(d).append("ー").toString()))));
    }
}
