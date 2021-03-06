package com.twitter.teruteru128.study.collatz;

/**
 * @author Teruteru
 *
 */
public class Collatz2 {
    public static int collatz(long n) {
        int result = 0;
        long tmp = n;
        while (tmp > 1) {
            result = result + 1;
            if ((tmp % 2) == 0) {
                tmp = tmp / 2;
            } else {
                tmp = tmp * 3 + 1;
            }
        }
        return result;
    }

}
