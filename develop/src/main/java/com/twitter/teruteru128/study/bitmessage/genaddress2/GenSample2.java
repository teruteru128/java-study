package com.twitter.teruteru128.study.bitmessage.genaddress2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class GenSample2 {

    private static final int PUBLIC_KEY_SIZE = 65;

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        long signindex = 1635800400L + 16 * 0;
        long encindex = 156729040L + 16 * 0;
        if (Security.getProvider("BC") == null)
            Security.addProvider(new BouncyCastleProvider());
        var signprivatekey = new byte[PUBLIC_KEY_SIZE];
        var encprivatekey = new byte[PUBLIC_KEY_SIZE];

        var sha512 = MessageDigest.getInstance("SHA-512");
        var ripemd160 = MessageDigest.getInstance("ripemd160");

        var file = new File("publicKeys.bin");
        try (var file2 = new RandomAccessFile(file, "r")) {
            for (long i = 0; i < 16; i++) {
                for (long j = 0; j < 16; j++) {
                    file2.seek(1635800400L + 65 * i);
                    file2.readFully(signprivatekey);
                    file2.seek(156729040L + 65 * j);
                    file2.readFully(encprivatekey);

                    sha512.update(signprivatekey);
                    sha512.update(encprivatekey);
                    var hash = ripemd160.digest(sha512.digest());
                    System.out.printf("%d, %d : ", 1635800400L + 65 * i, 156729040L + 65 * j);
                    for (byte b : hash) {
                        System.out.printf("%02x", b & 0xff);
                    }
                    System.out.println();
                }
            }
        }
    }
}
