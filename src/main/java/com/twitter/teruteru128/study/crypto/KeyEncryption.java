package com.twitter.teruteru128.study.crypto;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import jakarta.xml.bind.DatatypeConverter;

/**
 * 
 */
public class KeyEncryption {

    public KeyEncryption() {
    }

    /**
     * 共通鍵とIVは鍵共有による共有秘密から導出すべきでは？ PBE+KeyWrapping+ChaCha20-Poly1305 encryption
     * 
     * @param args
     * @throws NoSuchAlgorithmException
     * @throws NoSuchPaddingException
     * @throws InvalidKeySpecException
     * @throws InvalidKeyException
     * @throws InvalidAlgorithmParameterException
     * @throws IllegalBlockSizeException
     * @throws BadPaddingException
     */
    public static void main(String[] args)
            throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeySpecException, InvalidKeyException,
            InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
        // generate common encrypt key
        KeyGenerator generator = KeyGenerator.getInstance("ChaCha20");
        SecretKey key = generator.generateKey();

        // encrypt message
        Cipher cipher1 = Cipher.getInstance("ChaCha20-Poly1305/NONE/NoPadding");
        SecureRandom random = SecureRandom.getInstanceStrong();
        byte[] iv2 = random.generateSeed(12);
        var param1 = new IvParameterSpec(iv2);
        cipher1.init(Cipher.ENCRYPT_MODE, key, param1);
        byte[] encryptedmessage = cipher1.doFinal("test message".getBytes());

        // Deriving the key for encrypting the common key from the password
        byte[] salt = random.generateSeed(32);
        PBEParameterSpec spec2 = new PBEParameterSpec(salt, 1024);
        PBEKeySpec spec = new PBEKeySpec(
                "Security strength depends on your password. At least 12 digits are required.".toCharArray());
        String pbkalgo = "PBEwithHmacSHA512andAES_256";
        SecretKeyFactory factory = SecretKeyFactory.getInstance(pbkalgo);
        SecretKey key2 = factory.generateSecret(spec);

        // encrypt common encryption key by password base key
        Cipher cipher2 = Cipher.getInstance(pbkalgo);
        cipher2.init(Cipher.WRAP_MODE, key2, spec2);
        byte[] encryptedkey = cipher2.wrap(key);

        System.out.print("byte[] encryptedkey = DatatypeConverter.parseHexBinary(\"");
        System.out.print(DataPrinter.printHexBinary(encryptedkey));
        System.out.print("\");\nbyte[] salt = DatatypeConverter.parseHexBinary(\"");
        System.out.print(DatatypeConverter.printHexBinary(salt));
        System.out.print("\");\nbyte[] iv = DatatypeConverter.parseHexBinary(\"");
        System.out.print(DatatypeConverter.printHexBinary(cipher2.getIV()));
        System.out.print("\");\nbyte[] iv2 = DatatypeConverter.parseHexBinary(\"");
        System.out.print(DatatypeConverter.printHexBinary(iv2));
        System.out.print("\");\nbyte[] encryptedmessage = DatatypeConverter.parseHexBinary(\"");
        System.out.print(DatatypeConverter.printHexBinary(encryptedmessage));
        System.out.println("\");");
    }
}
