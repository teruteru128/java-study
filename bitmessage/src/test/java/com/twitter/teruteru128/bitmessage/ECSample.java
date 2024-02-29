package com.twitter.teruteru128.bitmessage;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.util.HexFormat;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.security.auth.DestroyFailedException;

import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.jce.spec.ECPrivateKeySpec;
import org.bouncycastle.jce.spec.ECPublicKeySpec;
import org.bouncycastle.jce.spec.IESParameterSpec;

/**
 * ECSample
 */
public class ECSample {

    public static void getS() throws NoSuchAlgorithmException, InvalidParameterSpecException, InvalidKeySpecException,
            NoSuchProviderException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException,
            IllegalBlockSizeException, BadPaddingException, SignatureException, DestroyFailedException {
        // 面倒くせえ
        var privateKey = ECSample.getPrivateKey();

        var parameterSpec = Const.SEC_P256_K1_PARAMETER_SPEC;
        var p2spec = new org.bouncycastle.jce.spec.ECPrivateKeySpec(privateKey.getS(), parameterSpec);

        sampleECSignature("");

        var ecp = Const.SEC_P256_K1_G.multiply(((ECPrivateKey) privateKey).getS());
        var pubspec = new ECPublicKeySpec(ecp, parameterSpec);

        var factory = KeyFactory.getInstance("EC", "BC");

        var publicKey = (ECPublicKey) factory.generatePublic(pubspec);
        var spec2 = new IESParameterSpec(null, null, 256, 256, null, false);

        var cipher = Cipher.getInstance("ECIESwithAES-CBC", "BC");
        System.out.println(cipher.getProvider());
        cipher.init(Cipher.ENCRYPT_MODE, publicKey, spec2);
        byte[] message = "やったぜ。".getBytes();
        cipher.update(message);
        var b = cipher.doFinal();
        System.out.printf("BC's ecies: %s%n", ECSample.format.formatHex(b));
        var ppppppp = EllipticCurveIntegratedEncryptionScheme.encrypt(message, publicKey);
        System.out.printf("teruteru's ecies: %s%n", ECSample.format.formatHex(ppppppp));
        var s = EllipticCurveIntegratedEncryptionScheme.decrypt(b, (org.bouncycastle.jce.interfaces.ECPrivateKey) factory.generatePrivate(p2spec));
        System.out.println(new String(s));
    }

    static void sampleECSignature(String message)
            throws NoSuchAlgorithmException, InvalidParameterSpecException,
            InvalidKeySpecException, InvalidKeyException, SignatureException, DestroyFailedException {
        var pri = ECSample.getPrivateKey();
        var messageBytes = message.getBytes(StandardCharsets.UTF_8);
        var signature = Signature.getInstance("SHA256withECDSA");
        signature.initSign(pri);
        signature.update(messageBytes);
        var s = signature.sign();
        System.out.println(ECSample.format.formatHex(s));
        return;
    }

    static ECPrivateKey getPrivateKey()
            throws NoSuchAlgorithmException, InvalidParameterSpecException, InvalidKeySpecException {
        var format = HexFormat.of();
        var params = AlgorithmParameters.getInstance("EC");
        params.init(new ECGenParameterSpec("secp256k1"));
        var parameterSpec = params.getParameterSpec(org.bouncycastle.jce.spec.ECParameterSpec.class);
        var privateKeyStr = System.getenv("PRIVATE_KEY_STR");
        if (privateKeyStr == null || privateKeyStr.isEmpty()) {
            System.err.println("fail!");
            throw new RuntimeException();
        }
        var rawPrivateKey = format.parseHex(privateKeyStr);
        if (rawPrivateKey.length < 32) {
            System.err.println("fail!");
            throw new RuntimeException();
        }
        var spec = new ECPrivateKeySpec(new BigInteger(rawPrivateKey, 0, 32), parameterSpec);
        var factory = KeyFactory.getInstance("EC");
        // お前毎度毎度分かりにくいんだよ生データを鍵まで持ってくのがよぉ！
        var pri = factory.generatePrivate(spec);

        return (ECPrivateKey) pri;
    }

    private static HexFormat format = HexFormat.of();

}
