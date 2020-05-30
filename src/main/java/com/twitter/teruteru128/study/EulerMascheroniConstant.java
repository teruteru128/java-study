package com.twitter.teruteru128.study;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.stream.LongStream;

public class EulerMascheroniConstant {

    public static void main(String[] args) {
        long k_min = 1;
        long k_max = 1L << 16;
        final MathContext context = new MathContext(128, RoundingMode.DOWN);
        final BigDecimal one = BigDecimal.valueOf(1L);
        System.out.println(context);
        BigDecimal sum = LongStream.range(k_min, k_max).parallel().mapToObj(BigDecimal::valueOf)
                .map(i -> one.divide(i, context)).reduce(BigDecimal.valueOf(0), (a, b) -> a.add(b));
        System.out.printf("%.32f%n", sum);
    }
}
