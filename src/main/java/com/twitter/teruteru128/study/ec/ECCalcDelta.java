package com.twitter.teruteru128.study.ec;

import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;

public class ECCalcDelta {

    /**
     * 楕円曲線の判別式&Delta;を計算する
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        AlgorithmParameters parameters = AlgorithmParameters.getInstance("EC");
        parameters.init(new ECGenParameterSpec("secp256r1"));
        var spec = parameters.getParameterSpec(ECParameterSpec.class);
        var curve = spec.getCurve();
        var a = curve.getA();
        var b = curve.getB();
        var delta = a.pow(3).multiply(BigInteger.valueOf(4L)).add(b.pow(2).multiply(BigInteger.valueOf(27))).multiply(BigInteger.valueOf(-16L));
        System.out.println(delta);
    }

}
