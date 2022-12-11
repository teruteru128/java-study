package com.twitter.teruteru128.study.bitmessage;

import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import com.twitter.teruteru128.encode.Base58;

public class AddressValidator {

    public static boolean validate(String address) {
        if (!address.startsWith("BM-")) {
            return false;
        }
        byte[] b = Base58.decode(address.replaceAll("^BM-", ""));
        for (int i = 0; i < b.length; i++) {
            System.out.printf("%02x", b[i] & 0xff);
        }
        MessageDigest sha512;
        byte[] cache64 = new byte[64];
        try {
            sha512 = MessageDigest.getInstance("sha-512");
            sha512.update(b, 0, b.length - 4);
            sha512.digest(cache64, 0, 64);
            sha512.update(cache64, 0, 64);
            sha512.digest(cache64, 0, 64);
        } catch (NoSuchAlgorithmException | DigestException e) {
            throw new InternalError(e);
        }
        return Arrays.equals(cache64, 0, 4, b, b.length - 4, b.length);
    }
}
