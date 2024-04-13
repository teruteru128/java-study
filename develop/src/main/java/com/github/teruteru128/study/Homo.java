package com.github.teruteru128.study;

import java.util.Arrays;

/**
 * ホモォジェネレータ
 */
public final class Homo {

    public static final char RIGHT_FOOT = '┌';
    static final char[] HEAD_SUFFIX = " ^o^)┐".toCharArray();
    static final char[] TAIL_PREFIX = "┌(".toCharArray();

    private Homo() {
    }

    /**
     * @param numOfLegs 足の数
     * @return ホモォのAAを含むchar配列
     */
    public static char[] getHomo(int numOfLegs) {
        if (numOfLegs < 0) {
            throw new IllegalArgumentException("Insufficient number of legs.");
        }
        var array = new char[8 + numOfLegs];
        // そっか配列だからarraycopyとかfillとかが使えるしそっちのほうが早いのか
        System.arraycopy(TAIL_PREFIX, 0, array, 0, 2);
        Arrays.fill(array, 2, 2 + numOfLegs, RIGHT_FOOT);
        System.arraycopy(HEAD_SUFFIX, 0, array, 2 + numOfLegs, 6);
        return array;
    }

}
