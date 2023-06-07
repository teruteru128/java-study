package com.twitter.teruteru128.study;

import java.math.BigInteger;
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
        int xlength = xbitlength >>> 3;
        byte[] encoded = new byte[xlength + 1];
        encoded[0] = 0x03;
        ECPoint point = null;
        for (BigInteger a = new BigInteger(xbitlength, random); point == null; a = a.add(BigInteger.ONE)) {
            var b = a.toByteArray();
            System.arraycopy(b, b[0] == 0 ? 1 : 0, encoded, 1, xlength);
            try {
                point = curve.decodePoint(encoded);
            } catch (Exception e) {
            }
        }
        return point;
    }
}
