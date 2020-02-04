package com.twitter.teruteru128.study.chacha20.poly1305;

import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class ChaCha20Poly1305Sample {

    public static void main(final String[] args) throws Exception {

        final KeyGenerator keyGenerator = KeyGenerator.getInstance("ChaCha20");

        final SecretKey secretKey = keyGenerator.generateKey();
        System.out.println(secretKey.getAlgorithm());
        System.out.println(secretKey.getFormat());
        final byte[] nonce = new byte[12];
        {
            final SecureRandom random = SecureRandom.getInstance("nativeprngnonblocking");
            random.nextBytes(nonce);
        }

        final Cipher aliceCipher = Cipher.getInstance("ChaCha20-Poly1305");
        final Cipher bobCipher = Cipher.getInstance("ChaCha20-Poly1305");

        final var parameterSpec2 = new IvParameterSpec(nonce);

        aliceCipher.init(Cipher.ENCRYPT_MODE, secretKey, parameterSpec2);

        final byte[] encryptedResult = aliceCipher.doFinal("Hello world! This is Alice!".getBytes());

        bobCipher.init(Cipher.DECRYPT_MODE, secretKey, parameterSpec2);
        final byte[] clearText = bobCipher.doFinal(encryptedResult);
        System.out.println(new String(clearText));
    }

}
