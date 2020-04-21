package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.math.BigInteger;
import java.security.DigestException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.concurrent.Callable;

import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.math.ec.ECPoint;

class Producer implements Callable<Response> {

    private Request request;

    public Producer(Request request) {
        this.request = request;
    }

    /**
     *
     * @return
     * @throws NoSuchAlgorithmException
     * @throws DigestException
     * @see https://qiita.com/Syo_pr/items/92b3cf7d7fc5dab4a3a7#%E8%A1%8C%E5%88%97%E8%A1%8C%E5%88%97%E7%A9%8D%E3%81%AE%E6%9C%80%E9%81%A9%E5%8C%96
     */
    @Override
    public Response call() throws NoSuchAlgorithmException, DigestException {
        final SecureRandom random = new SecureRandom();
        final ECPoint g = CustomNamedCurves.getByName("secp256k1").getG();
        final byte[] potentialPrivEncryptionKey = new byte[32];
        byte[] potentialPublicEncryptionKey = null;
        final int requireNlz = request.getRequireNlz();
        final KeyPair[] pairs = new KeyPair[4096];
        KeyPair pairI = null;
        byte[] iPublicKey = null;
        final int pairsLen = pairs.length;
        final Ripe ripe1 = new Ripe();
        final byte[] ripe2 = ripe1.getRipe();
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
        /*
        BlockingQueue<Response> queue = Queues.getResponseQueue();
        ArrayList<Response> waitList = new ArrayList<>();
        */
        // TODO 一つのでかいテーブルを全スレッド協調して計算する
        while (true) {
            System.out.printf("uho        (%s) : %s%n", toString(), LocalDateTime.now());
            for (int i = 0; i < pairsLen; i++) {
                random.nextBytes(potentialPrivEncryptionKey);
                potentialPublicEncryptionKey = g.multiply(new BigInteger(1, potentialPrivEncryptionKey)).normalize().getEncoded(false);
                pairs[i] = new KeyPair(potentialPrivEncryptionKey, potentialPublicEncryptionKey);
            }
            System.out.printf("Nice guy...(%s) : %s%n", toString(), LocalDateTime.now());
            for (int i = 0; i < pairsLen; i++) {
                pairI = pairs[i];
                iPublicKey = pairI.getPublicKey();
                for (int j = 0; j < pairsLen; j++) {
                    ripe1.ripe(iPublicKey, pairs[j].getPublicKey());
                    for (nlz = 0; ripe2[nlz] == 0 && nlz < 20; nlz++) {
                    }
                    if (nlz >= requireNlz) {
                        var component = new Response(pairI, pairs[j], ripe2);
                        AddressGenerator.exportAddress(component);
                        /*
                        try {
                            queue.put(component);
                        } catch (InterruptedException e) {
                            waitList.add(component);
                        }
                        */
                        System.out.printf("aargh!     (%s) : %s%n", toString(), LocalDateTime.now());
                        return component;
                    }
                }
            }
            /*
            if(!waitList.isEmpty()){
                ListIterator<Response> responses = waitList.listIterator();
                while(responses.hasNext()){
                    Response response = responses.next();
                    try {
                        queue.put(response);
                        responses.remove();
                    } catch (InterruptedException e) {
                    }
                }
            }
            */
            System.out.printf("Yaranaika  (%s) : %s%n", toString(), LocalDateTime.now());
        }
    }

    @Override
    public String toString() {
        return new StringBuilder("Task-").append(request.getTaskID()).append(", require ").append(request.getRequireNlz()).append("byte NLZ").toString();
    }
}
