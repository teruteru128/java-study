package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;

import javax.xml.bind.DatatypeConverter;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.math.ec.rfc8032.Ed25519;
import org.bouncycastle.util.Arrays;

public class Main {

    /**
     * TODO WTF? bitmessageってed25519でしたっけ？
     * 
     * @see https://github.com/Bitmessage/PyBitmessage/blob/6f35da4096770a668c4944c3024cd7ddb34be092/src/class_addressGenerator.py#L131
     * @see https://en.bitcoin.it/wiki/Wallet_import_format
     * @param args
     */
    public static void main(String[] args) throws Exception {
        Provider provider = Security.getProvider("BC");
        if (provider == null) {
            Security.addProvider(provider = new BouncyCastleProvider());
        }
        Ed25519.precompute();
        String address = "BM-NBJxKhQmidR2TBtD3H74yZhDHpzZ7TXM";
        String privSigningKeyWIF = "5KSKK9tJfuMrkUfwBqGS3ktfPix5zZBtgxAao2GtKeUgJNpEo6R";
        String privEncryptionKeyWIF = "5KUoQKDmcmAKpjaas3k9U6bGFN5Nz937zqLqDDo1sNUqeJCiMZn";
        Base58 base58 = new Base58();
        byte[] privSigningKey = base58.decode(privSigningKeyWIF);
        byte[] privEncryptionKey = base58.decode(privEncryptionKeyWIF);
        byte[] posPrivSigningKey = Arrays.copyOfRange(privSigningKey, 1, 33);
        byte[] posPrivEncryptionKey = Arrays.copyOfRange(privEncryptionKey, 1, 33);
        byte[] pubSigningKey = new byte[Ed25519.PUBLIC_KEY_SIZE];
        byte[] pubEncryptionKey = new byte[Ed25519.PUBLIC_KEY_SIZE];
        Ed25519.generatePublicKey(posPrivSigningKey, 0, pubSigningKey, 0);
        Ed25519.generatePublicKey(posPrivEncryptionKey, 0, pubEncryptionKey, 0);
        MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
        MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
        MessageDigest ripemd160 = MessageDigest.getInstance("RIPEMD160");
        sha512.update(pubSigningKey);
        sha512.update(pubEncryptionKey);
        byte[] ripe = ripemd160.digest(sha512.digest());
        System.out.println(DatatypeConverter.printHexBinary(ripe));
        BMAddress bmAddress = new BMAddress();
        String address2 = bmAddress.encodeAddress(4, 1, ripe);
        System.out.println(address2);
        System.out.println(address2.equals(address));
    }

}
