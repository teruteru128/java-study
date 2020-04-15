package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.concurrent.Callable;

import com.twitter.teruteru128.study.Base58;

import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.math.ec.ECPoint;

class Task implements Callable<ResponseComponent> {

    private RequestComponent components;

    public Task(RequestComponent components) {
        super();
        this.components = components;
    }

    @Override
    public ResponseComponent call() throws Exception {
        SecureRandom random = new SecureRandom();
        ECPoint g = CustomNamedCurves.getByName("secp256k1").getG();
        byte[] potentialPrivEncryptionKey = new byte[32];
        MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
        MessageDigest ripemd160 = MessageDigest.getInstance("RIPEMD160");
        final int requireNlz = components.getRequireNlz();
        byte[] publicSigningKey = components.getPublicSigningKey();
        byte[] potentialPubEncryptionKey;
        byte[] sha512hash = new byte[64];
        byte[] ripe = new byte[20];
        int nlz = 0;
        do {
            random.nextBytes(potentialPrivEncryptionKey);
            potentialPubEncryptionKey = g.multiply(new BigInteger(1, potentialPrivEncryptionKey)).normalize().getEncoded(false);
            sha512.update(publicSigningKey, 0, 65);
            sha512.update(potentialPubEncryptionKey, 0, 65);
            sha512.digest(sha512hash, 0, 64);
            ripemd160.update(sha512hash, 0, 64);
            ripemd160.digest(ripe, 0, 20);
            for (nlz = 0; ripe[nlz] == 0 && nlz < 20; nlz++) {
            }
        } while (nlz < requireNlz);
        MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
        var bmaddress = new BMAddress();
        var address4 = bmaddress.encodeAddress(4, 1, ripe);
        var privSigningKey = new byte[33];
        privSigningKey[0] = (byte) 0x80;
        System.arraycopy(privSigningKey, 0, privSigningKey, 1, 32);
        byte[] checksum = new byte[32];
        sha256.update(privSigningKey);
        sha256.digest(checksum, 0, 32);
        sha256.update(checksum);
        sha256.digest(checksum, 0, 32);
        var tmp = new byte[privSigningKey.length + 4];
        System.arraycopy(privSigningKey, 0, tmp, 0, privSigningKey.length);
        System.arraycopy(checksum, 0, tmp, privSigningKey.length, 4);
        // encode to base58
        var privSigningKeyWIF = Base58.encode(tmp);

        var privEncryptionKey = new byte[33];
        privEncryptionKey[0] = (byte) 0x80;
        System.arraycopy(potentialPrivEncryptionKey, 0, privEncryptionKey, 1, 32);
        sha256.update(privEncryptionKey);
        sha256.digest(checksum, 0, 32);
        sha256.update(checksum);
        sha256.digest(checksum, 0, 32);
        System.arraycopy(privEncryptionKey, 0, tmp, 0, privEncryptionKey.length);
        System.arraycopy(checksum, 0, tmp, privEncryptionKey.length, 4);
        var privEncryptionKeyWIF = Base58.encode(tmp);
        synchronized (System.out) {
            System.out.printf("[%s]%n", address4);
            System.out.println("label = relpace this label");
            System.out.println("enabled = true");
            System.out.println("decoy = false");
            System.out.println("noncetrialsperbyte = 1000");
            System.out.println("payloadlengthextrabytes = 1000");
            System.out.printf("privsigningkey = %s%n", privSigningKeyWIF);
            System.out.printf("privencryptionkey = %s%n", privEncryptionKeyWIF);
            System.out.println();
        }
        return new ResponseComponent(potentialPrivEncryptionKey, potentialPubEncryptionKey, ripe);
    }
}
