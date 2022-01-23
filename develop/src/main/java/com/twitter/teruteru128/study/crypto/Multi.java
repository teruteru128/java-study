package com.twitter.teruteru128.study.crypto;

import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.spec.NamedParameterSpec;
import java.util.concurrent.Callable;
import java.util.concurrent.Exchanger;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import javax.crypto.KeyAgreement;

import jakarta.xml.bind.DatatypeConverter;

/**
 * Multi...何？
*/
public class Multi implements Callable<Void> {
    private String name;
    private Exchanger<PublicKey> exchanger;

    public Multi(String name, Exchanger<PublicKey> exchanger) {
        this.name = name;
        this.exchanger = exchanger;
    }

    @Override
    public Void call() throws Exception {
        try {
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
            var agreement = KeyAgreement.getInstance("XDH");
            agreement.init(privateKey);
            agreement.doPhase(himPublicKey, true);

            // 共有秘密生成＆秘密鍵に変換
            var rawAgreement = agreement.generateSecret();
            System.out.printf("%s's raw: %s%n", name, DatatypeConverter.printHexBinary(rawAgreement));

            var sha3_512 = MessageDigest.getInstance("SHA3-512");
            var hashedAgreement = sha3_512.digest(rawAgreement);
            System.out.printf("%s's hashed: %s%n", name, DatatypeConverter.printHexBinary(hashedAgreement));
        } catch (Exception e) {
            throw e;
        }
        return null;
    }

    public static void main(String[] args) throws Exception {
        var executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        var exchanger = new Exchanger<PublicKey>();
        var futureAlice = executor.submit(new Multi("Alice", exchanger));
        var futureBoB = executor.submit(new Multi("BoB", exchanger));
        Thread.sleep(500);
        futureAlice.get();
        futureBoB.get();
        executor.shutdown();
    }

}
