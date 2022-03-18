package com.twitter.teruteru128.study.crypto;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.NamedParameterSpec;
import java.util.concurrent.Callable;
import java.util.concurrent.Exchanger;

import javax.crypto.KeyAgreement;

import jakarta.xml.bind.DatatypeConverter;

/**
 * @see com.twitter.teruteru128.study.crypto.ECIESSample
 */
public class ExchangerSample implements Callable<Void> {
    private String name;
    private Exchanger<PublicKey> exchanger;

    public ExchangerSample(String name, Exchanger<PublicKey> exchanger) {
        this.name = name;
        this.exchanger = exchanger;
    }

    @Override
    public Void call() throws NoSuchAlgorithmException, InvalidAlgorithmParameterException, InterruptedException,
            InvalidKeyException, IllegalStateException {
        // X25519 鍵生成
        var keyPairGenerator = KeyPairGenerator.getInstance("XDH");
        var parameterSpec = new NamedParameterSpec("X25519");
        keyPairGenerator.initialize(parameterSpec);
        var keyPair = keyPairGenerator.generateKeyPair();
        var privateKey = keyPair.getPrivate();
        var publicKey = keyPair.getPublic();

        // 公開鍵交換
        var himPublicKey = exchanger.exchange(publicKey);

        // 鍵共有
        // わざわざ自前で共有鍵を生成せずにECIESを使うべきだと思う
        var agreement = KeyAgreement.getInstance("XDH");
        agreement.init(privateKey);
        agreement.doPhase(himPublicKey, true);

        // 共有秘密生成＆秘密鍵に変換
        var rawAgreement = agreement.generateSecret();
        System.out.printf("%s's raw: %s%n", name, DatatypeConverter.printHexBinary(rawAgreement));

        var sha3_512 = MessageDigest.getInstance("SHA3-512");
        var hashedAgreement = sha3_512.digest(rawAgreement);
        System.out.printf("%s's hashed: %s%n", name, DatatypeConverter.printHexBinary(hashedAgreement));
        return null;
    }

}
