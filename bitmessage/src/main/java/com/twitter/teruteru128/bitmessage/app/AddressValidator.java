package com.twitter.teruteru128.bitmessage.app;

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
        byte[] b = Base58.decode(address.substring(3));
        byte[] cache64 = new byte[64];
        try {
            MessageDigest sha512;
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
