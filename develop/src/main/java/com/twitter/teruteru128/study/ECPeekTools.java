package com.twitter.teruteru128.study;

import java.util.HexFormat;

import org.bouncycastle.math.ec.ECPoint;

public class ECPeekTools {

    public static void printPoint(ECPoint point1) {
        HexFormat format = HexFormat.of();
        System.out.println(point1);
        System.out.println(format.formatHex(point1.getEncoded(false)));
        System.out.println(format.formatHex(point1.getEncoded(true)));
        System.out.println(point1.getClass());
        System.out.println(point1 instanceof ECPoint.AbstractF2m);
        System.out.println(point1 instanceof ECPoint.AbstractFp);
        System.out.println(point1 instanceof ECPoint.F2m);
        System.out.println(point1 instanceof ECPoint.Fp);
    }
    
}
