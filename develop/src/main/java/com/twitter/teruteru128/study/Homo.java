package com.twitter.teruteru128.study;

import java.util.Arrays;

public class Homo {

    /**
     * ホモォジェネレータ
     * 
     * @param numOfLegs
     * @return
     */
    public static char[] getHomo(int numOfLegs) {
        if (numOfLegs < 1) {
            throw new IllegalArgumentException("Insufficient number of legs.");
        }
        var array = new char[7 + numOfLegs - 1];
        // そっか配列だからarraycopyとかfillとかが使えるしそっちのほうが早いのか
        System.arraycopy(Main.TAIL_PREFIX, 0, array, 0, 2);
        Arrays.fill(array, 2, 2 + numOfLegs - 1, '┌');
        System.arraycopy(Main.HEAD_SUFFIX, 0, array, 2 + numOfLegs - 1, 5);
        return array;
    }

}
