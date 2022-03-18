package com.twitter.teruteru128.study.crypto;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class ChaCha20Poly1305Sample implements Callable<Void>{

    public Void call() throws Exception {

        KeyGenerator keyGenerator = KeyGenerator.getInstance("ChaCha20");

        SecretKey secretKey = keyGenerator.generateKey();

        Cipher aliceCipher = Cipher.getInstance("ChaCha20-Poly1305/NONE/NOPADDING");
        Cipher bobCipher = Cipher.getInstance("ChaCha20-Poly1305/NONE/NOPADDING");

        byte[] nonce = new byte[12];
        {
            SecureRandom random = SecureRandom.getInstanceStrong();
            random.nextBytes(nonce);
        }
        var parameterSpec2 = new IvParameterSpec(nonce);

        aliceCipher.init(Cipher.ENCRYPT_MODE, secretKey, parameterSpec2);

        byte[] encryptedResult = aliceCipher.doFinal("Hello world! This is Alice!".getBytes());

        bobCipher.init(Cipher.DECRYPT_MODE, secretKey, parameterSpec2);
        byte[] clearText = bobCipher.doFinal(encryptedResult);
        System.out.println(new String(clearText));
        return null;
    }

}
