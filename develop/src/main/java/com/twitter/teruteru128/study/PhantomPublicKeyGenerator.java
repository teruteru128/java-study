package com.twitter.teruteru128.study;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

public class PhantomPublicKeyGenerator {
    private ECCurve curve;

    public PhantomPublicKeyGenerator(ECCurve curve) {
        this.curve = curve;
    }

    public ECPoint generate(Random random) {
        int xbitlength = curve.getFieldSize();
        int xlength = (xbitlength + 7) >>> 3;
        byte[] encoded = new byte[xlength + 1];
        encoded[0] = 0x03;
        int encoded_length = encoded.length;
        ECPoint point = null;
        byte[] b = null;
        int b_offset = 0;
        int b_length = 0;
        for (BigInteger a = new BigInteger(xbitlength, random); point == null; a = a.add(BigInteger.ONE)) {
            b = a.toByteArray();
            Arrays.fill(encoded, 1, encoded_length, (byte)0);
            b_offset = (b[0] == 0) ? 1 : 0;
            b_length = b.length - b_offset;
            System.arraycopy(b, b_offset, encoded, encoded_length - b_length, b_length);
            try {
                point = curve.decodePoint(encoded);
            } catch (Exception e) {
            }
        }
        return point;
    }
}
