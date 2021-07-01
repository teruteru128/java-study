package com.twitter.teruteru128.study.bitmessage.genaddress2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.List;

import com.twitter.teruteru128.study.bitmessage.Const;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class GenSample {

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        long singindex = args.length >= 2 ? Long.parseLong(args[0], 10) : 88L;
        long encindex = args.length >= 2 ? Long.parseLong(args[1], 10) : 101L;
        if (Security.getProvider("BC") == null)
            Security.addProvider(new BouncyCastleProvider());
        var privatekey1 = new byte[32];
        var privatekey2 = new byte[32];
        var file = new File("privateKeys0.bin");
        try (var file2 = new RandomAccessFile(file, "r")) {
            file2.seek(singindex * 32);
            file2.readFully(privatekey1);
            file2.seek(encindex * 32);
            file2.readFully(privatekey2);
        }
        var sk = Const.G.multiply(new BigInteger(1, privatekey1)).normalize();
        byte[] potentialPubSigningKey = sk.getEncoded(false);
        var ek = Const.G.multiply(new BigInteger(1, privatekey2)).normalize();
        byte[] potentialPubEncryptionKey = ek.getEncoded(false);

        var sha512 = MessageDigest.getInstance("SHA-512");
        var ripemd160 = MessageDigest.getInstance("ripemd160");

        sha512.update(potentialPubSigningKey);
        sha512.update(potentialPubEncryptionKey);
        var hash = ripemd160.digest(sha512.digest());
        for (byte b : hash) {
            System.out.printf("%02x", b & 0xff);
        }
        System.out.println();
    }
}
