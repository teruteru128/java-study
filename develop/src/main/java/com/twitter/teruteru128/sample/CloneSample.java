package com.twitter.teruteru128.sample;

import com.twitter.teruteru128.study.MyB;

import java.math.BigInteger;

public class CloneSample {
    public static void cloneSample() {
        var signNumber = 0;
        var magnitude = new byte[0];
        var myZero = new MyB(signNumber, magnitude);
        var zero = BigInteger.ZERO;
        System.out.println(zero.equals(myZero));
        System.out.println(zero.getClass() == myZero.getClass());
    }
}
