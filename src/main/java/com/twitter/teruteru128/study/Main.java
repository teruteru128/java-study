package com.twitter.teruteru128.study;

/**
 * Main
 */
public class Main {

    /**
     * https://twitter.com/potetoichiro/status/1397541150295158791
     * 
     * @param args
     */
    public static void main(String[] args) {
        String f;
        int i;
        int j;
        int sum;
        int product;
        for (i = 0; i < 100; i++) {
            for (j = 0; j < 100; j++) {
                sum = i - j;
                product = i * j;
                f = String.format("%d%d%d%d", i, j, sum, product);
                if (sum > 0 && product < 1000 && f.contains("1") && f.contains("2") && f.contains("3")
                        && f.contains("4") && f.contains("5") && f.contains("6") && f.contains("7") && f.contains("8")
                        && f.contains("9")) {
                    System.out.printf("(x + %d)(x - %d) = x^2 + %dx - %d%n", i, j, sum, product);
                }
            }
        }
    }
}
