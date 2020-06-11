package com.twitter.teruteru128.study;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Main
 * 
 */
public class Main {

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        final MathContext context = new MathContext(52, RoundingMode.HALF_EVEN);
        final BigDecimal three = BigDecimal.valueOf(3);
        final BigDecimal threshold = BigDecimal.valueOf(10000);
        final BigDecimal a0 = BigDecimal.ONE;
        final BigDecimal a1 = new BigDecimal("1.5788573135586235");
        BigDecimal a = BigDecimal.ZERO;
        BigDecimal an2 = a0;
        BigDecimal an = a1;
        for (int i = 0; i < 100; i++) {
            a = an2.pow(3).add(an).divide(three, context);
            if (a.compareTo(threshold) >= 0) {
                System.out.println("over!");
                break;
            }
            an2 = an;
            an = a;
            System.out.println(a);
        }
    }
}
