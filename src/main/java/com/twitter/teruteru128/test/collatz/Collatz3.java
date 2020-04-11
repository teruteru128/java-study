package com.twitter.teruteru128.test.collatz;

/**
 * @author Teruteru
 *
 */
public class Collatz3{
    public int collatz(long n) {
        if (n <= 1) {
            return 0;
        }
        if ((n % 2) == 0) {
            return collatz(n / 2) + 1;
        } else {
            return collatz(n * 3 + 1) + 1;
        }
    }
}
