package com.twitter.teruteru128.study;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Security;

import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey;
import org.bouncycastle.jce.ECNamedCurveTable;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECPrivateKeySpec;
import org.bouncycastle.jce.spec.ECPublicKeySpec;
import org.bouncycastle.math.ec.ECPoint;

import jakarta.xml.bind.DatatypeConverter;

// TODO 将来的にエントリポイントをこのクラス一つにする
// TODO コマンドライン引数の実装方法
// TODO 設定ファイルの実装方法 Propaties XML JSON YAML
/**
 * Main
 * 
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Provider provider = Security.getProvider("BC");
        if (provider == null) {
            Security.addProvider(provider = new BouncyCastleProvider());
        }
        // B35A05C46FE60A121F1EB49098AC10ADABAFFDC7054D3DDF66B49EAB30ED7C32
        // 040eb410f1cc143cf71b64015d23cee68ab0464df89c97601ada403f81a10d1777fe60c4708457016f6c458f7b1bcd3db83e30ee0ce971cde2039f2630586dd47f
        final var parameters = CustomNamedCurves.getByName("secp256k1");
        final var g = parameters.getG();
        /*
        var spec = ECNamedCurveTable.getParameterSpec("secp256k1");
        var curve = spec.getCurve();
        byte[] magnitude = DatatypeConverter
                .parseHexBinary("B35A05C46FE60A121F1EB49098AC10ADABAFFDC7054D3DDF66B49EAB30ED7C32");
        BigInteger d = new BigInteger(1, magnitude);
        ECPrivateKeySpec privateKeySpec = new ECPrivateKeySpec(d, spec);
        byte[] encoded = DatatypeConverter.parseHexBinary(
                "040eb410f1cc143cf71b64015d23cee68ab0464df89c97601ada403f81a10d1777fe60c4708457016f6c458f7b1bcd3db83e30ee0ce971cde2039f2630586dd47f");
        ECPoint point = curve.decodePoint(encoded);
        ECPublicKeySpec publicKeySpec = new ECPublicKeySpec(point, spec);
        ECPoint point2 = spec.getG().multiply(d);
        ECPublicKeySpec publicKeySpec2 = new ECPublicKeySpec(point2, spec);
        System.out.println(point.equals(point2));
        System.out.println(point.isValid());
        KeyFactory factory = KeyFactory.getInstance("EC", provider);
        PublicKey pub = factory.generatePublic(publicKeySpec);
        PublicKey pub2 = factory.generatePublic(publicKeySpec2);
        System.out.println(pub.toString());
        System.out.println(pub.equals(pub2));
        */
        final int privateKeyLen = 32;
        final int publicKeyLen = 65;
        final int keyCacheSize = 1 << 24;
        final byte[] privateKeys = new byte[keyCacheSize * privateKeyLen];
        final byte[] publicKeys = new byte[keyCacheSize * publicKeyLen];
        final SecureRandom random = new SecureRandom();
        byte[] tmp;
        random.nextBytes(privateKeys);
        long start = System.nanoTime();
        for (int i = 0; i < keyCacheSize; i++) {
            // 公開鍵の導出は重い処理のため、予め大量に導出しておいて組み合わせたほうが早い
            tmp = g.multiply(new BigInteger(1, privateKeys, i * privateKeyLen, privateKeyLen)).normalize().getEncoded(false);
            System.arraycopy(tmp, 0, publicKeys, i * publicKeyLen, publicKeyLen);
        }
        long fin = System.nanoTime();
        System.out.printf("%f%n", (1000000000D * keyCacheSize) / (fin - start));
    }
}
