package com.twitter.teruteru128.study.verisign.test1.step1;

import java.math.BigInteger;
import java.util.concurrent.Callable;

/**
 * function f
 */
abstract class Step2<T extends Number> implements Callable<T> {
    public static final long[] COEFFICIENTS = { 13059432575421L, 35854406314518L, 17331828477071L, 13034327323742L,
            29514981607474L, 43445188776312L, 3142829599298L, 5460057595620L, 34527421678024L, 49393492009205L,
            40550988304495L, 25701092995268L, 6966123055549L, 27402022662977L, 8180294287490L, 15982263555793L,
            30364252058746L, 15771104626963L, 34340951834734L, 18379141503416L, 19494509807378L, 40100174645071L,
            16462821808731L, 30368112432793L, 9863951454481L, 23404881919283L, 37669794611020L, 22595159029663L,
            8003031153939L, 1764692752928L, 23371216285082L, 30597180133872L, 24109952539057L, 6062466143281L,
            38251774072999L, 19092807831160L, 9083060666127L, 14527227616768L, 32037266559191L, 36077235972286L,
            22377606219621L, 49679898511950L, 20449603096312L, 43620429879736L, 27L, 1L };
    public static final BigInteger M = BigInteger.valueOf(49721724815627L);
    public final T m;
    private long[] coefficients;

    public Step2(T m) {
        this.m = m;
        this.coefficients = COEFFICIENTS;
    }

    public long[] getCoefficients() {
        return coefficients;
    }

    public T getM() {
        return m;
    }
    
    @Override
    abstract public T call() throws Exception;
}