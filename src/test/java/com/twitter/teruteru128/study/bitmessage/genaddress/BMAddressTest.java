package com.twitter.teruteru128.study.bitmessage.genaddress;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.util.Arrays;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.math.ec.rfc8032.Ed25519;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BMAddressTest {

    @BeforeAll
    void initAll(){
        Ed25519.precompute();
    }

    @BeforeEach
    void init() {
        Provider provider = Security.getProvider("BC");
        if (provider == null) {
            Security.addProvider(provider = new BouncyCastleProvider());
        }
    }

    @Test
    public void encodeAddressTest() throws Exception {
        String address = "BM-NBJxKhQmidR2TBtD3H74yZhDHpzZ7TXM";
        String privSigningKeyWIF = "5KSKK9tJfuMrkUfwBqGS3ktfPix5zZBtgxAao2GtKeUgJNpEo6R";
        String privEncryptionKeyWIF = "5KUoQKDmcmAKpjaas3k9U6bGFN5Nz937zqLqDDo1sNUqeJCiMZn";
        Base58 base58 = new Base58();
        byte[] privSigningKey = base58.decode(privSigningKeyWIF);
        byte[] privEncryptionKey = base58.decode(privEncryptionKeyWIF);
        byte[] pubSigningKey = new byte[Ed25519.PUBLIC_KEY_SIZE];
        byte[] pubEncryptionKey = new byte[Ed25519.PUBLIC_KEY_SIZE];
        Ed25519.generatePublicKey(privSigningKey, 0, pubSigningKey, 0);
        Ed25519.generatePublicKey(privEncryptionKey, 0, pubEncryptionKey, 0);
        MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
        MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
        MessageDigest ripemd160 = MessageDigest.getInstance("RIPEMD160");
        sha512.update(pubSigningKey);
        sha512.update(pubEncryptionKey);
        byte[] ripe = ripemd160.digest(sha512.digest());
        byte[] nullbytes = new byte[2];
        assertTrue(Arrays.equals(nullbytes, 0, 2, ripe, 0, 2));
        BMAddress bmAddress = new BMAddress();
        assertTrue(bmAddress.encodeAddress(3, 1, ripe).equals(address));
    }

}
