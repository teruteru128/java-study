package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.math.BigInteger;
import java.security.DigestException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.concurrent.Callable;

import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.math.ec.ECPoint;

class Task implements Callable<ResponseComponent> {

    private RequestComponent components;

    public Task(RequestComponent components) {
        this.components = components;
    }

    /**
     *
     * @return
     * @throws NoSuchAlgorithmException
     * @throws DigestException
     * @see https://qiita.com/Syo_pr/items/92b3cf7d7fc5dab4a3a7#%E8%A1%8C%E5%88%97%E8%A1%8C%E5%88%97%E7%A9%8D%E3%81%AE%E6%9C%80%E9%81%A9%E5%8C%96
     */
    @Override
    public ResponseComponent call() throws NoSuchAlgorithmException, DigestException {
        SecureRandom random = new SecureRandom();
        ECPoint g = CustomNamedCurves.getByName("secp256k1").getG();
        byte[] potentialPrivEncryptionKey = new byte[32];
        final int requireNlz = components.getRequireNlz();
        byte[] publicSigningKey = components.getList().get(0).getPublicKey();
        byte[] potentialPublicEncryptionKey = null;
        byte[] ripe = new byte[20];
        KeyPair[] sigKeys = components.getList().stream().map(KeyPair::clone).toArray(KeyPair[]::new);
        int sigKeysLen = sigKeys.length;
        KeyPair[] encKeys = new KeyPair[2500];
        int encKeysLen = encKeys.length;
        Ripe ripe1 = new Ripe();
        byte[] ripe2 = ripe1.getRipe();
        int nlz = 0;
        /*
        do {
            random.nextBytes(potentialPrivEncryptionKey);
            potentialPublicEncryptionKey = g.multiply(new BigInteger(1, potentialPrivEncryptionKey)).normalize().getEncoded(false);
            ripe1.ripe(publicSigningKey, potentialPublicEncryptionKey);
            for (nlz = 0; ripe[nlz] == 0 && nlz < 20; nlz++) {
            }
        } while (nlz < requireNlz);
        return new ResponseComponent(potentialPrivEncryptionKey, potentialPublicEncryptionKey, ripe);
        */
        // int blockSize = 5;
        while(true) {
            for (int i = 0; i < 2500; i++) {
                random.nextBytes(potentialPrivEncryptionKey);
                potentialPublicEncryptionKey = g.multiply(new BigInteger(1, potentialPrivEncryptionKey)).normalize().getEncoded(false);
                encKeys[i] = new KeyPair(potentialPrivEncryptionKey, potentialPublicEncryptionKey);
            }
            for (int i = 0; i < sigKeysLen; i++) {
                for (int j = 0; j < encKeysLen; j++) {
                    ripe1.ripe(sigKeys[i].getPublicKey(), encKeys[j].getPublicKey());
                    for (nlz = 0; ripe2[nlz] == 0 && nlz < 20; nlz++) {
                    }
                    if(nlz >= requireNlz) {
                        return new ResponseComponent(sigKeys[i], encKeys[j], ripe2);
                    }
                }
            }
            System.out.println("アッー！");
        }
    }
}
