package com.twitter.teruteru128.study;

import org.bouncycastle.math.ec.ECPoint;

import java.util.HexFormat;

import static java.lang.System.out;

/**
 * streamのpeekにでも突っ込んだらいいよ
 */
public class ECPeekTools {

    public static void printPoint(ECPoint point1) {
        var format = HexFormat.of();
        out.println(point1);
        out.println(format.formatHex(point1.getEncoded(false)));
        out.println(format.formatHex(point1.getEncoded(true)));
        out.println(point1.getClass());
        out.println(point1 instanceof ECPoint.AbstractF2m);
        out.println(point1 instanceof ECPoint.AbstractFp);
        out.println(point1 instanceof ECPoint.F2m);
        out.println(point1 instanceof ECPoint.Fp);
    }

}
