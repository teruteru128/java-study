package com.twitter.teruteru128.study.crypto;

import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.xml.bind.DatatypeConverter;

class KeyDecryption {

    /**
     * PBE+KeyWrapping+ChaCha20-Poly1305 decryption
     * 
     * @param args
     * @throws NoSuchAlgorithmException
     * @throws NoSuchPaddingException
     * @throws InvalidKeySpecException
     * @throws InvalidKeyException
     * @throws InvalidAlgorithmParameterException
     * @throws IllegalBlockSizeException
     * @throws BadPaddingException
     * @throws IOException
     */
    public static void main(String[] args)
            throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeySpecException, InvalidKeyException,
            InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, IOException {
        byte[] encryptedkey = DatatypeConverter.parseHexBinary(
                "32c305e20c477bb7eaf610355bd3c2d3433cb9ffcc3630237ca6afd903214982431b099bd34fb8ed17ec9f5adcdbd523");
        byte[] salt = DatatypeConverter
                .parseHexBinary("CC0A998D5874D36598AE3B9A5BB121129172600869C9E1F7010DD9F8CFA53DAD");
        byte[] iv = DatatypeConverter.parseHexBinary("03A7018A5EED3E34B856B6BC19CB7AF7");
        byte[] iv2 = DatatypeConverter.parseHexBinary("3474CBC1ABF4DA38DD293160");
        byte[] encryptedmessage = DatatypeConverter
                .parseHexBinary("8C03C5FE9CEE8EF79AF0D65D10DCBAF6F3966B63E17088CF9167529A");
        PBEParameterSpec spec2 = new PBEParameterSpec(salt, 1024, new IvParameterSpec(iv));
        PBEKeySpec spec = new PBEKeySpec("Insert your password".toCharArray());
        String pbkalgo = "PBEwithHmacSHA512andAES_256";
        SecretKeyFactory factory = SecretKeyFactory.getInstance(pbkalgo);
        SecretKey key2 = factory.generateSecret(spec);
        Cipher cipher = Cipher.getInstance(pbkalgo);
        cipher.init(Cipher.UNWRAP_MODE, key2, spec2);
        SecretKey key = (SecretKey) cipher.unwrap(encryptedkey, "ChaCha20", Cipher.SECRET_KEY);
        System.out.println(DatatypeConverter.printHexBinary(key.getEncoded()));
        Cipher cipher2 = Cipher.getInstance("ChaCha20-Poly1305/NONE/NoPadding");
        cipher2.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(iv2));
        byte[] plaintext = cipher2.doFinal(encryptedmessage);
        System.out.println(new String(plaintext));
    }
}
