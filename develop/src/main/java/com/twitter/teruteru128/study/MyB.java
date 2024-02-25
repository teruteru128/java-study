package com.twitter.teruteru128.study;

import java.math.BigInteger;
import java.util.Random;

public final class MyB extends BigInteger implements Cloneable {
    public MyB(byte[] val, int off, int len) {
        super(val, off, len);
    }

    public MyB(byte[] val) {
        super(val);
    }

    public MyB(int signum, byte[] magnitude, int off, int len) {
        super(signum, magnitude, off, len);
    }

    public MyB(int signum, byte[] magnitude) {
        super(signum, magnitude);
    }

    public MyB(String val, int radix) {
        super(val, radix);
    }

    public MyB(String val) {
        super(val);
    }

    public MyB(int numBits, Random rnd) {
        super(numBits, rnd);
    }

    public MyB(int bitLength, int certainty, Random rnd) {
        super(bitLength, certainty, rnd);
    }

    @Override
    public MyB clone() {
        try {
            return (MyB) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
