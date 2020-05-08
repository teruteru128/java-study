package com.twitter.teruteru128.study;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MyNumberValidaterTest {

    @ParameterizedTest
    @MethodSource("getFalseTestSourceStream")
    public void test1(String a, boolean b) {
        assertEquals(MyNumberValidater.validateMyNumber(a), b);
    }

    public static Stream<Arguments> getFalseTestSourceStream() {
        return Stream.of(Arguments.of("123456789010", false), Arguments.of("123456789011", false), Arguments.of("123456789012", false),
                Arguments.of("123456789013", false), Arguments.of("123456789014", false), Arguments.of("123456789015", false),
                Arguments.of("123456789016", false), Arguments.of("123456789017", false), Arguments.of("123456789018", true),
                Arguments.of("123456789019", false), Arguments.of("023456789013", true), Arguments.of("114514191900", true));
    }

}
