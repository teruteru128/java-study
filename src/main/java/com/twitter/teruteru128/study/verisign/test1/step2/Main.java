package com.twitter.teruteru128.study.verisign.test1.step2;

import java.math.BigDecimal;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.twitter.teruteru128.study.verisign.test1.step1.Step2_1;

public class Main {

    public static void main(String[] args) {
        final BigDecimal zero = BigDecimal.valueOf(0);
        final BigDecimal two = BigDecimal.valueOf(2);
        ExecutorService service = Executors.newSingleThreadExecutor();
        BigDecimal min = new BigDecimal("-1");
        BigDecimal max = new BigDecimal("0");
        BigDecimal half = BigDecimal.ZERO;
        BigDecimal b;
        int counter = 0;
        do {
            half = max.add(min).divide(two);
            var future = service.submit(new Step2_1(half));
            try {
                b = future.get();
                if (b.equals(zero)) {
                    break;
                } else if (b.compareTo(zero) > 0) {
                    // b > zero
                    max = half;
                } else {
                    // b < zero
                    min = half;
                }
                System.out.printf("(%.1000f, %.1000f)%n", half, b);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
            if (counter >= 720) {
                break;
            }
            counter++;
        } while (true);
        service.shutdown();
    }

}
