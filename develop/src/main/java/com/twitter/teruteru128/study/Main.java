package com.twitter.teruteru128.study;

import java.util.Arrays;

/**
 * Main
 */
public class Main {

    private static final char[] HEAD_SUFFIX = "^o^)┐".toCharArray();
    private static final char[] TAIL_PREFIX = "┌(".toCharArray();

    static {
        try {
            Class.forName("com.twitter.teruteru128.study.BCProviderLoader");
        } catch (ClassNotFoundException e) {
            throw new InternalError(e);
        }
    }

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        var numOfLegs = args.length >= 1 ? Integer.parseInt(args[0]) : 2;
        var array = getHomo(numOfLegs);
        System.out.println(array);
        System.out.println();
    }

    /**
     * ホモォジェネレータ
     * @param numOfLegs
     * @return
     */
    private static char[] getHomo(int numOfLegs) {
        if (numOfLegs < 1) {
            throw new IllegalArgumentException("Insufficient number of legs.");
        }
        var array = new char[7 + numOfLegs - 1];
        // そっか配列だからarraycopyとかfillとかが使えるしそっちのほうが早いのか
        System.arraycopy(TAIL_PREFIX, 0, array, 0, 2);
        Arrays.fill(array, 2, 2 + numOfLegs - 1, '┌');
        System.arraycopy(HEAD_SUFFIX, 0, array, 2 + numOfLegs - 1, 5);
        return array;
    }
}
