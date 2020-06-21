package com.twitter.teruteru128.study;

/**
 * Main
 * 
 */
public class Main {

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        long newseed = 0;
        long minseed = 1L << 48;
        for (long seed = 0x0; seed < 0x10000; seed++) {
            newseed = (seed - 0xBL) * 0xDFE05BCB1365L & 0xFFFFFFFFFFFFL;
            minseed = Math.min(newseed, minseed);
        }
        System.out.println(minseed);
    }
}
