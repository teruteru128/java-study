package com.twitter.teruteru128.study.crypto;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.NamedParameterSpec;
import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.crypto.KeyAgreement;

public class Multi implements Runnable {
    private String name;
    private Exchanger<PublicKey> exchanger;

    public Multi(String name, Exchanger<PublicKey> exchanger) {
        this.name = name;
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            // X25519 鍵生成
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("XDH");
            NamedParameterSpec parameterSpec = new NamedParameterSpec("X25519");
            keyPairGenerator.initialize(parameterSpec);
            KeyPair keyPair = keyPairGenerator.generateKeyPair();
            PrivateKey privateKey = keyPair.getPrivate();
            PublicKey publicKey = keyPair.getPublic();

            // 公開鍵交換
            var himPublicKey = exchanger.exchange(publicKey);

            // 鍵共有
            KeyAgreement agreement = KeyAgreement.getInstance("XDH");
            agreement.init(privateKey);
            agreement.doPhase(himPublicKey, true);

            // 共有秘密生成＆秘密鍵に変換
            byte[] rawAgreement = agreement.generateSecret();
            System.out.printf("%s's raw: %s%n", name, DataPrinter.printHexBinary(rawAgreement));

            MessageDigest sha3_512 = MessageDigest.getInstance("SHA3-512");
            byte[] hashedAgreement = sha3_512.digest(rawAgreement);
            System.out.printf("%s's hashed: %s%n", name, DataPrinter.printHexBinary(hashedAgreement));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Exchanger<PublicKey> exchanger = new Exchanger<>();
        executor.execute(new Multi("Alice", exchanger));
        executor.execute(new Multi("BoB", exchanger));
        Thread.sleep(500);
        executor.shutdown();
    }

}
