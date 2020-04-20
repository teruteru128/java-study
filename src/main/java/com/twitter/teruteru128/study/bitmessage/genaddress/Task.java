package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.math.BigInteger;
import java.security.DigestException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.LocalDateTime;
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
        byte[] potentialPublicEncryptionKey = null;
        final int requireNlz = components.getRequireNlz();
        KeyPair[] pairs = new KeyPair[8192];
        int pairsLen = pairs.length;
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
        // 予め署名鍵を作っておく必要すらなくない？
        final int blockSize = 8;
        int nextI = 0;
        int nextJ = 0;
        while(true) {
            System.out.printf("ウホッ(%s) : %s%n", toString(), LocalDateTime.now());
            for (int i = 0; i < pairsLen; i++) {
                random.nextBytes(potentialPrivEncryptionKey);
                potentialPublicEncryptionKey = g.multiply(new BigInteger(1, potentialPrivEncryptionKey)).normalize().getEncoded(false);
                pairs[i] = new KeyPair(potentialPrivEncryptionKey, potentialPublicEncryptionKey);
            }
            System.out.printf("いい男(%s) : %s%n", toString(), LocalDateTime.now());
            for (int i = 0; i < pairsLen; i += blockSize) {
                for (int j = 0; j < pairsLen; j += blockSize) {
                    nextI = i + blockSize;
                    for (int ii = i; ii < nextI; ii++) {
                        nextJ = j + blockSize;
                        for (int jj = j; jj < nextJ; jj++) {
                            ripe1.ripe(pairs[ii].getPublicKey(), pairs[jj].getPublicKey());
                            for (nlz = 0; ripe2[nlz] == 0 && nlz < 20; nlz++) {
                            }
                            if(nlz >= requireNlz) {
                                var component = new ResponseComponent(pairs[ii], pairs[jj], ripe2);
                                AddressGenerator.exportAddress(component);
                                System.out.printf("foundアッー！(%s) : %s%n", toString(), LocalDateTime.now());
                                return component;
                            }
                        }
                    }
                }
            }
            System.out.printf("やらないか(%s) : %s%n", toString(), LocalDateTime.now());
        }
    }

    @Override
    public String toString() {
        return "Task-" + components.getTaskID() + ", require " + components.getRequireNlz() + "byte NLZ";
    }
}
