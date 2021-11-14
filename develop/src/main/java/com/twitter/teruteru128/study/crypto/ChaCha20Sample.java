package com.twitter.teruteru128.study.crypto;

import java.security.Key;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.ChaCha20ParameterSpec;

public class ChaCha20Sample {

    public static void main(String[] args) throws Exception {
        Cipher alice = Cipher.getInstance("ChaCha20");
        byte[] nonce = new byte[12];
        {
            SecureRandom random = SecureRandom.getInstanceStrong();
            random.nextBytes(nonce);
        }
        int counter = 1;
        var spec = new ChaCha20ParameterSpec(nonce, counter);

        KeyGenerator keyGenerator = KeyGenerator.getInstance("ChaCha20");
        keyGenerator.init(256);
        Key key = keyGenerator.generateKey();
        alice.init(Cipher.ENCRYPT_MODE, key, spec);
        byte[] encryptedResult = alice.doFinal("Hello world! This is Alice!".getBytes());

        Cipher bob = Cipher.getInstance("ChaCha20");
        bob.init(Cipher.DECRYPT_MODE, key, spec);
        byte[] clearText = bob.doFinal(encryptedResult);
        System.out.println(new String(clearText));
    }

}
