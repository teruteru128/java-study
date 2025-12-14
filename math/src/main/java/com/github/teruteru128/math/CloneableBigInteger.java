package com.github.teruteru128.math;

import java.math.BigInteger;
import java.util.Random;

/**
 * {@link java.math.BigInteger}は継承可能であることを示すクラス
 */
public final class CloneableBigInteger extends BigInteger implements Cloneable {
    public CloneableBigInteger(byte[] val, int off, int len) {
        super(val, off, len);
    }

    public CloneableBigInteger(byte[] val) {
        super(val);
    }

    public CloneableBigInteger(int signum, byte[] magnitude, int off, int len) {
        super(signum, magnitude, off, len);
    }

    public CloneableBigInteger(int signum, byte[] magnitude) {
        super(signum, magnitude);
    }

    public CloneableBigInteger(String val, int radix) {
        super(val, radix);
    }

    public CloneableBigInteger(String val) {
        super(val);
    }

    public CloneableBigInteger(int numBits, Random rnd) {
        super(numBits, rnd);
    }

    public CloneableBigInteger(int bitLength, int certainty, Random rnd) {
        super(bitLength, certainty, rnd);
    }

    @Override
    public CloneableBigInteger clone() {
        try {
            return (CloneableBigInteger) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("clone failed", e);
        }
    }
}
