package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * このクラスはマルチスレッドに対応していません。
 */
public class Ripe {

    private MessageDigest sha512;
    private MessageDigest ripemd160;
    private byte[] cache64 = new byte[64];
    private byte[] cache20 = new byte[20];

    public Ripe() {
        try {
            sha512 = MessageDigest.getInstance("SHA-512");
            ripemd160 = MessageDigest.getInstance("RIPEMD160");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    /**
     * このメソッドはマルチスレッドに対応していません。
     */
    public byte[] ripe(byte[] publicSigningKey, byte[] publicEncryptionKey) {
        try {
            sha512.update(publicSigningKey, 0, 65);
            sha512.update(publicEncryptionKey, 0, 65);
            sha512.digest(cache64, 0, 64);
            ripemd160.update(cache64, 0, 64);
            ripemd160.digest(cache20, 0, 20);
        } catch (DigestException e) {
        }
        return cache20;
    }
}
