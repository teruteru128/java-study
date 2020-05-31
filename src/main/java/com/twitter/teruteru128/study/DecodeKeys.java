package com.twitter.teruteru128.study;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import jakarta.xml.bind.DatatypeConverter;

class DecodeKeys {
    public static void decode() throws Exception {
        var factory = KeyFactory.getInstance("X25519");
        var privateKey = factory.generatePrivate(new PKCS8EncodedKeySpec(DatatypeConverter.parseHexBinary("")));
        var publicKey = factory.generatePublic(new X509EncodedKeySpec(DatatypeConverter.parseHexBinary("302C300706032B656E0500032100C3635BB5DDC5EFDEAE9C1791659AAB97AA265B05D184945AF28C8FA813C3933F")));

        var agreement = KeyAgreement.getInstance("X25519");
        agreement.init(privateKey);
        agreement.doPhase(publicKey, true);
        var sha3_512 = MessageDigest.getInstance("sha3-512");
        sha3_512.update(agreement.generateSecret());
        var hashedSecret = sha3_512.digest();

        var secretKey = new SecretKeySpec(hashedSecret, 0, 32, "ChaCha20");
        var parameterSpec = new IvParameterSpec(hashedSecret, 32, 12);

        var cipher = Cipher.getInstance("ChaCha20-Poly1305/NONE/NoPadding");
        cipher.init(Cipher.DECRYPT_MODE, secretKey, parameterSpec);

        var privateKeyPath = Paths.get("privateKeys.bin");
        var decodedKeys = cipher.doFinal(Files.readAllBytes(privateKeyPath));

        var decodedPrivateKeyPath = Paths.get("decodedPrivateKeys.bin");
        Files.write(decodedPrivateKeyPath, decodedKeys);
    }
}
