package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.concurrent.Callable;

import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.math.ec.ECPoint;

class Task implements Callable<ResponseComponents> {

    private RequestComponents components;

    public Task(RequestComponents components) {
        super();
        this.components = components;
    }

    @Override
    public ResponseComponents call() throws Exception {
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
            potentialPubEncryptionKey = g.multiply(new BigInteger(1, potentialPrivEncryptionKey)).normalize()
                    .getEncoded(false);
            sha512.update(publicSigningKey, 0, 65);
            sha512.update(potentialPubEncryptionKey, 0, 65);
            sha512.digest(sha512hash, 0, 64);
            ripemd160.update(sha512hash);
            ripemd160.digest(ripe, 0, 20);
            for (nlz = 0; ripe[nlz] == 0 && nlz < 20; nlz++) {
            }
        } while (nlz < requireNlz);
        return new ResponseComponents(potentialPrivEncryptionKey, potentialPrivEncryptionKey, ripe);
    }
}
