package com.twitter.teruteru128.sample;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HexFormat;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class AESedeSample {

    public static void doAESedeSample() throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException,
            IllegalBlockSizeException, BadPaddingException {
        var cipher = Cipher.getInstance("AES/ECB/NoPadding");
        var key = new byte[96];
        new SecureRandom().nextBytes(key);
        var keySpec1 = new SecretKeySpec(key, 0, 32, "AES");
        var keySpec2 = new SecretKeySpec(key, 32, 32, "AES");
        var keySpec3 = new SecretKeySpec(key, 64, 32, "AES");
        var message = new byte[16];
        var format = HexFormat.of();
        cipher.init(Cipher.ENCRYPT_MODE, keySpec1);
        var work = cipher.doFinal(message);
        cipher.init(Cipher.DECRYPT_MODE, keySpec2);
        work = cipher.doFinal(work);
        cipher.init(Cipher.ENCRYPT_MODE, keySpec3);
        work = cipher.doFinal(work);
        System.out.println(format.formatHex(work));
    }

}
