package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.util.Arrays;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.math.ec.rfc8032.Ed25519;

public class Main {

    /**
     * TODO WTF? bitmessageってed25519でしたっけ？
     * 
     * @see https://github.com/Bitmessage/PyBitmessage/blob/6f35da4096770a668c4944c3024cd7ddb34be092/src/class_addressGenerator.py#L131
     * @see https://en.bitcoin.it/wiki/Wallet_import_format
     * @param args
     */
    public static void main(String[] args) {
        Provider provider = Security.getProvider("BC");
        if (provider == null) {
            Security.addProvider(provider = new BouncyCastleProvider());
        }
        Ed25519.precompute();
        byte[] potentialPrivSigningKey = new byte[Ed25519.SECRET_KEY_SIZE];
        byte[] potentialPubSigningKey = new byte[Ed25519.PUBLIC_KEY_SIZE];
        SecureRandom random = new SecureRandom();
        random.nextBytes(potentialPrivSigningKey);
        Ed25519.generatePublicKey(potentialPrivSigningKey, 0, potentialPubSigningKey, 0);
        byte[] potentialPrivEncryptionKey = new byte[Ed25519.SECRET_KEY_SIZE];
        byte[] potentialPubEncryptionKey = new byte[Ed25519.PUBLIC_KEY_SIZE];
        byte[] nullbytes = new byte[2];
        try {
            MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
            MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
            MessageDigest ripemd160 = MessageDigest.getInstance("RIPEMD160");
            while (true) {
                random.nextBytes(potentialPrivEncryptionKey);
                Ed25519.generatePublicKey(potentialPrivEncryptionKey, 0, potentialPubEncryptionKey, 0);
                sha512.update(potentialPubSigningKey, 0, Ed25519.PUBLIC_KEY_SIZE);
                sha512.update(potentialPubSigningKey, 0, Ed25519.PUBLIC_KEY_SIZE);
                byte[] ripe = ripemd160.digest(sha512.digest());
                if (Arrays.equals(ripe, 0, 2, nullbytes, 0, 2)) {
                    break;
                }
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

}
