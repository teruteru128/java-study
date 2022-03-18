package com.twitter.teruteru128.study.crypto;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Security;
import java.security.spec.NamedParameterSpec;
import java.util.concurrent.Callable;

import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.SealedObject;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import jakarta.xml.bind.DatatypeConverter;

public class X25519ChaCha20Poly1305Sample implements Callable<Void> {

    public Void call() throws Exception {
        var b = Security.getProvider("BC");
        if (b == null) {
            Security.addProvider(new BouncyCastleProvider());
        }
        // X25519 鍵生成
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("XDH");
        NamedParameterSpec parameterSpec = new NamedParameterSpec("X25519");
        keyPairGenerator.initialize(parameterSpec);
        KeyPair aliceXKeypair = keyPairGenerator.generateKeyPair();
        KeyPair bobXKeypair = keyPairGenerator.generateKeyPair();

        // 鍵共有
        KeyAgreement aliceAgreement = KeyAgreement.getInstance("XDH", "BC");
        KeyAgreement bobAgreement = KeyAgreement.getInstance("XDH", "BC");

        aliceAgreement.init(aliceXKeypair.getPrivate());
        bobAgreement.init(bobXKeypair.getPrivate());

        aliceAgreement.doPhase(bobXKeypair.getPublic(), true);
        bobAgreement.doPhase(aliceXKeypair.getPublic(), true);

        // 共有秘密生成＆秘密鍵に変換
        // XXX KeyAgreement.generateSecret("ChaCha20") is not supported... fuck
        // SecretKey aliceSecretKey = aliceAgreement.generateSecret("ChaCha20");
        // SecretKey bobSecretKey = bobAgreement.generateSecret("ChaCha20");
        MessageDigest sha3_512 = MessageDigest.getInstance("SHA3-512");
        byte[] aliceSharedSecret = aliceAgreement.generateSecret();
        byte[] bobSharedSecret = bobAgreement.generateSecret();
        byte[] hashedAliceAgreement = sha3_512.digest(aliceSharedSecret);
        byte[] hashedBobAgreement = sha3_512.digest(bobSharedSecret);
        System.out.println(DatatypeConverter.printHexBinary(aliceSharedSecret).toLowerCase());
        System.out.println(DatatypeConverter.printHexBinary(bobSharedSecret).toLowerCase());
        System.out.println(DatatypeConverter.printHexBinary(hashedAliceAgreement).toLowerCase());
        System.out.println(DatatypeConverter.printHexBinary(hashedBobAgreement).toLowerCase());
        SecretKey aliceSecretKey = aliceAgreement.generateSecret("ChaCha20");
        SecretKey bobSecretKey = bobAgreement.generateSecret("ChaCha20");
        System.out.println(DatatypeConverter.printHexBinary(aliceSecretKey.getEncoded()).toLowerCase());
        System.out.println(DatatypeConverter.printHexBinary(bobSecretKey.getEncoded()).toLowerCase());

        // 暗号インスタンス生成
        Cipher aliceCipher = Cipher.getInstance("ChaCha20-Poly1305/None/NoPadding");
        Cipher bobCipher = Cipher.getInstance("ChaCha20-Poly1305/None/NoPadding");

        var aliceIvParameterSpec = new IvParameterSpec(hashedAliceAgreement, 32, 12);
        var bobIvParameterSpec = new IvParameterSpec(hashedBobAgreement, 32, 12);

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
        var aliceIvParameterSpec2 = new IvParameterSpec(hashedAliceAgreement, 44, 12);
        aliceCipher.init(Cipher.ENCRYPT_MODE, aliceSecretKey, aliceIvParameterSpec2);
        SealedObject object = new SealedObject("おまんこ＾～", aliceCipher);
        var obj = object.getObject(bobSecretKey);
        if (obj instanceof String) {
            String text = (String) obj;
            System.out.printf("string: %s%n", text);
        } else {
            System.out.printf("not string: %s%n", obj);
        }
        return null;
    }

}
