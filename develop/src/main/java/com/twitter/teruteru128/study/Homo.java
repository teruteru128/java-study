package com.twitter.teruteru128.study;

import java.util.Arrays;
import java.util.random.RandomGenerator;

/**
 * ホモォジェネレータ
 */
public class Homo {

    static final char[] HEAD_SUFFIX = " ^o^)┐".toCharArray();
    static final char[] TAIL_PREFIX = "┌(".toCharArray();
    public static final char RIGHT_FOOT = '┌';

    static {
        System.err.println(getHomo(RandomGenerator.getDefault().nextInt(1, 21)));
    }

    /**
     *
     * @param numOfLegs 足の数
     * @return ホモォのAAを含むchar配列
     */
    public static char[] getHomo(int numOfLegs) {
        if (numOfLegs < 1) {
            throw new IllegalArgumentException("Insufficient number of legs.");
        }
        var array = new char[8 + numOfLegs - 1];
        // そっか配列だからarraycopyとかfillとかが使えるしそっちのほうが早いのか
        System.arraycopy(TAIL_PREFIX, 0, array, 0, 2);
        Arrays.fill(array, 2, 2 + numOfLegs - 1, RIGHT_FOOT);
        System.arraycopy(HEAD_SUFFIX, 0, array, 2 + numOfLegs - 1, 6);
        return array;
    }

}
