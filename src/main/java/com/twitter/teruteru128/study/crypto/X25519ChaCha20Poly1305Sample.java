package com.twitter.teruteru128.study.crypto;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.spec.NamedParameterSpec;
import java.util.Arrays;

import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.SealedObject;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class X25519ChaCha20Poly1305Sample {

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
        // XXX KeyAgreement.generateSecret("ChaCha20") is not supported... fuck
        // SecretKey aliceSecretKey = aliceAgreement.generateSecret("ChaCha20");
        // SecretKey bobSecretKey = bobAgreement.generateSecret("ChaCha20");
        MessageDigest sha3_512 = MessageDigest.getInstance("SHA3-512");
        byte[] hashedAliceAgreement = sha3_512.digest(aliceAgreement.generateSecret());
        byte[] hashedBobAgreement = sha3_512.digest(bobAgreement.generateSecret());
        SecretKey aliceSecretKey = new SecretKeySpec(Arrays.copyOfRange(hashedAliceAgreement, 0, 32), "ChaCha20");
        SecretKey bobSecretKey = new SecretKeySpec(Arrays.copyOfRange(hashedBobAgreement, 0, 32), "ChaCha20");

        // 暗号インスタンス生成
        Cipher aliceCipher = Cipher.getInstance("ChaCha20-Poly1305");
        Cipher bobCipher = Cipher.getInstance("ChaCha20-Poly1305");

        var aliceIvParameterSpec = new IvParameterSpec(Arrays.copyOfRange(hashedAliceAgreement, 32, 44));
        var bobIvParameterSpec = new IvParameterSpec(Arrays.copyOfRange(hashedBobAgreement, 32, 44));

        // 暗号化
        aliceCipher.init(Cipher.ENCRYPT_MODE, aliceSecretKey, aliceIvParameterSpec);
        byte[] encryptedResult = aliceCipher.doFinal("Hello world! This is Alice!".getBytes());

        // 複合
        bobCipher.init(Cipher.DECRYPT_MODE, bobSecretKey, bobIvParameterSpec);
        try {
            byte[] clearText = bobCipher.doFinal(encryptedResult);

            System.out.println(new String(clearText));
        } catch (AEADBadTagException e) {
            e.printStackTrace();
            System.err.println("This message has been tampered with!");
        }
        var aliceIvParameterSpec2 = new IvParameterSpec(Arrays.copyOfRange(hashedAliceAgreement, 44, 56));
        aliceCipher.init(Cipher.ENCRYPT_MODE, aliceSecretKey, aliceIvParameterSpec2);
        SealedObject object = new SealedObject("おまんこ＾～", aliceCipher);
        var bobIvParameterSpec2 = new IvParameterSpec(Arrays.copyOfRange(hashedBobAgreement, 44, 56));
        bobCipher.init(Cipher.DECRYPT_MODE, bobSecretKey, bobIvParameterSpec2);
        var obj = object.getObject(bobCipher);
        if (obj instanceof String) {
            System.out.println("obj is String");
            System.out.println((String) obj);
        } else {
            System.out.println(obj);
        }
    }

}
