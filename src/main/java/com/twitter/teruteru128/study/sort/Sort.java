package com.twitter.teruteru128.study.sort;

/**
 * @author Teruteru
 *
 */
public class Sort implements AbstractIntSort {
    public void sort(int[] src) {
        int tmp;
        int i;
        int j;
        int k;
        int length = src.length;
        for (i = 0; i < length; i++) {
            tmp = src[i];
            for (j = 0; j < i; j++) {
                if (tmp < src[j]) {
                    break;
                }
            }
            for (k = i; k > j; k--) {
                src[k] = src[k - 1];
            }
            src[j] = tmp;
        }
        return;
    }
}
