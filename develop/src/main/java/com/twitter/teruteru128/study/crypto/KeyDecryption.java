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
import jakarta.xml.bind.DatatypeConverter;

public class KeyDecryption {

    public KeyDecryption() {
    }

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
                "fbd74ac97dc44e84aaf8c8032e5606e6c3f23bc7ecae3b454ecdc57bc0a770db2bf3d730d17434d461c7039e2c882bbc");
        byte[] salt = DatatypeConverter
                .parseHexBinary("2DB7888F305E88092266F60FCCDC011339677C6949DA07F850819A566695E8B5");
        byte[] iv = DatatypeConverter.parseHexBinary("43219559BCF8521593A315A27AA61CCE");
        byte[] iv2 = DatatypeConverter.parseHexBinary("B438A7E5EDC89CFAC14B18EE");
        byte[] encryptedmessage = DatatypeConverter.parseHexBinary(
                "DFDA2E427E81EE03CC401B8D3DD1A193C1717022B4419364C280A7FC0F8F19A51EC47F43463381C444124A706D5BD3435C3B721FA57801E8F24906C01986EC0139753E82D791B5E6D2FC47B355");
        PBEParameterSpec spec2 = new PBEParameterSpec(salt, 1024, new IvParameterSpec(iv));
        PBEKeySpec spec = new PBEKeySpec(
                "Security strength depends on your password. At least 12 digits are required.".toCharArray());
        String pbealgo = "PBEwithHmacSHA512andAES_256";
        SecretKeyFactory factory = SecretKeyFactory.getInstance(pbealgo);
        SecretKey key2 = factory.generateSecret(spec);
        Cipher cipher = Cipher.getInstance(pbealgo);
        cipher.init(Cipher.UNWRAP_MODE, key2, spec2);
        SecretKey key = (SecretKey) cipher.unwrap(encryptedkey, "ChaCha20", Cipher.SECRET_KEY);
        System.out.println(DatatypeConverter.printHexBinary(key.getEncoded()));
        Cipher cipher2 = Cipher.getInstance("ChaCha20-Poly1305/NONE/NoPadding");
        cipher2.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(iv2));
        byte[] plaintext = cipher2.doFinal(encryptedmessage);
        System.out.println(new String(plaintext));
    }
}
