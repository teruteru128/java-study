package com.twitter.teruteru128.sample;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Security;
import java.security.spec.ECGenParameterSpec;
import java.util.HexFormat;

import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class ECKeyGenerateSample {

    static {
        if (Security.getProvider("BC") == null) {
            Security.addProvider(new BouncyCastleProvider());
        }
    }

    public static void dosecp256k1GenerateSample()
            throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        var generator1 = KeyPairGenerator.getInstance("EC", "BC");
        // secp256k1はJDK 16で削除されました。
        generator1.initialize(new ECGenParameterSpec("secp256k1"));
        var pubKey = (ECPublicKey) generator1.generateKeyPair().getPublic();
        System.out.println(pubKey.getAlgorithm());
        System.out.println(pubKey.getFormat());
        var q = pubKey.getQ();
        System.out.println(q.getXCoord().getClass());
        System.out.println(HexFormat.of().formatHex(pubKey.getQ().getEncoded(false)));
        System.out.println(HexFormat.of().formatHex(pubKey.getEncoded()));

    }

}
