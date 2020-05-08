package com.twitter.teruteru128.study;

public class Test {

    public static void main(String[] args) {
        int x;
        for (x = 0; x <= 1000; x++) {
            // x : 1000 - i, y : 0 - (long) Math.pow(10, (double) (3 * i) / 1000))
            // y = sqrt((1000-x)^2 + 10^(0.006x))
            double y = Math.pow(10, 3 * x / 1000D);
            System.out.printf("%d\t%f\t%f%n", x, y, Math.hypot(1000 - x, y));
        }
    }
}
