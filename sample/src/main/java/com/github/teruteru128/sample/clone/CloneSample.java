package com.github.teruteru128.sample.clone;

import com.github.teruteru128.study.MyB;

import java.math.BigInteger;

public class CloneSample {
    public static int cloneSample() {
        var signNumber = 0;
        var magnitude = new byte[0];
        var myZero = new MyB(signNumber, magnitude);
        var cloned = myZero.clone();
        var zero = BigInteger.ZERO;
        System.out.println(zero.equals(myZero));
        System.out.println(myZero.equals(cloned));
        System.out.println(zero.equals(cloned));
        System.out.println(zero.getClass() == myZero.getClass());
        return 0;
    }
}
