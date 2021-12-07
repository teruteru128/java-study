package com.twitter.teruteru128.study.bitmessage.genaddress2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;

import com.twitter.teruteru128.study.bitmessage.Const;
import com.twitter.teruteru128.study.bitmessage.KeyPair;
import com.twitter.teruteru128.study.bitmessage.genaddress.BMAddressGenerator;
import com.twitter.teruteru128.study.bitmessage.genaddress.Response;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class GenSample {

    private static final int PRIVATE_KEY_SIZE = 32;

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        long signindex = 1635801310 / 65;
        long encindex = 156729950 / 65;
        long signfileindex = signindex >> 24;
        long encfileindex = encindex >> 24;
        if (Security.getProvider("BC") == null)
            Security.addProvider(new BouncyCastleProvider());
        var signprivatekey = new byte[PRIVATE_KEY_SIZE];
        var encprivatekey = new byte[PRIVATE_KEY_SIZE];

        var sha512 = MessageDigest.getInstance("SHA-512");
        var ripemd160 = MessageDigest.getInstance("ripemd160");

        var file = new File(String.format("privateKeys%d.bin", signfileindex));
        try (var file2 = new RandomAccessFile(file, "r")) {
            file2.seek((signindex % 16777216L) * 32);
            file2.readFully(signprivatekey);
        }
        var file3 = new File(String.format("privateKeys%d.bin", encfileindex));
        try (var file2 = new RandomAccessFile(file3, "r")) {
            file2.seek((encindex % 16777216L) << 5);
            file2.readFully(encprivatekey);
        }
        var sk = Const.G.multiply(new BigInteger(1, signprivatekey)).normalize();
        byte[] potentialPubSigningKey = sk.getEncoded(false);
        var ek = Const.G.multiply(new BigInteger(1, encprivatekey)).normalize();
        byte[] potentialPubEncryptionKey = ek.getEncoded(false);

        sha512.update(potentialPubSigningKey);
        sha512.update(potentialPubEncryptionKey);
        var hash = ripemd160.digest(sha512.digest());
        for (byte b : hash) {
            System.out.printf("%02x", b & 0xff);
        }
        System.out.println();
        BMAddressGenerator.exportAddress(new Response(new KeyPair(signprivatekey, potentialPubSigningKey),
                new KeyPair(encprivatekey, potentialPubEncryptionKey), hash));
    }
}
