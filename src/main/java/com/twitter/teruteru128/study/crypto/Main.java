package com.twitter.teruteru128.study.crypto;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.spec.NamedParameterSpec;

import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import com.twitter.teruteru128.study.crypto.DataPrinter;

public class Main {

    public static void main(String[] args) throws Exception {
        // X25519 鍵生成
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("XDH");
        NamedParameterSpec parameterSpec = new NamedParameterSpec("X25519");
        keyPairGenerator.initialize(parameterSpec);
        KeyPair aliceXKeypair = keyPairGenerator.generateKeyPair();
        KeyPair bobXKeypair = keyPairGenerator.generateKeyPair();

        // 鍵共有
        KeyAgreement aliceAgreement = KeyAgreement.getInstance("XDH");
        KeyAgreement bobAgreement = KeyAgreement.getInstance("XDH");

        aliceAgreement.init(aliceXKeypair.getPrivate());
        bobAgreement.init(bobXKeypair.getPrivate());

        aliceAgreement.doPhase(bobXKeypair.getPublic(), true);
        bobAgreement.doPhase(aliceXKeypair.getPublic(), true);

        // 共有秘密生成＆秘密鍵に変換
        // XXX .generateSecret("ChaCha20") is not supported... fuck
        //SecretKey aliceSecretKey = aliceAgreement.generateSecret("ChaCha20");
        //SecretKey bobSecretKey = bobAgreement.generateSecret("ChaCha20");
        MessageDigest sha3_256 = MessageDigest.getInstance("SHA3-256");
        SecretKey aliceSecretKey = new SecretKeySpec(sha3_256.digest(aliceAgreement.generateSecret()), "ChaCha20");
        SecretKey bobSecretKey = new SecretKeySpec(sha3_256.digest(bobAgreement.generateSecret()), "ChaCha20");

        // 暗号インスタンス生成
        Cipher aliceCipher = Cipher.getInstance("ChaCha20-Poly1305");
        Cipher bobCipher = Cipher.getInstance("ChaCha20-Poly1305");

        // ノンス生成
        byte[] nonce = new byte[12];
        SecureRandom random = SecureRandom.getInstanceStrong();//NativePRNGNonBlocking
        System.out.println(random.getAlgorithm());
        random = SecureRandom.getInstance("NativePRNGNonBlocking");
        random.nextBytes(nonce);
        var parameterSpec2 = new IvParameterSpec(nonce);

        // 暗号化
        aliceCipher.init(Cipher.ENCRYPT_MODE, aliceSecretKey, parameterSpec2);
        byte[] encryptedResult = aliceCipher.doFinal("Hello world! This is Alice!".getBytes());

        System.out.println(DataPrinter.printHexBinary(encryptedResult));

        // 複合
        bobCipher.init(Cipher.DECRYPT_MODE, bobSecretKey, parameterSpec2);
        try {
            byte[] clearText = bobCipher.doFinal(encryptedResult);

            System.out.println(new String(clearText));
        } catch (AEADBadTagException e) {
            e.printStackTrace();
            System.err.println("This message has been tampered with!");
        }

    }

}
