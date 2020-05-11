package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.math.BigInteger;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;

import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.math.ec.ECPoint;

class Producer implements Callable<Void> {

    private Request request;
    private final String string;

    public Producer(Request request) {
        this.request = request;
        string = "Task-" + request.getTaskID();
    }

    /**
     *
     * @return
     * @throws NoSuchAlgorithmException
     * @throws DigestException
     * @see https://qiita.com/Syo_pr/items/92b3cf7d7fc5dab4a3a7#%E8%A1%8C%E5%88%97%E8%A1%8C%E5%88%97%E7%A9%8D%E3%81%AE%E6%9C%80%E9%81%A9%E5%8C%96
     */
    @Override
    public Void call() throws NoSuchAlgorithmException, DigestException {
        final SecureRandom random = new SecureRandom();
        final ECPoint g = CustomNamedCurves.getByName("secp256k1").getG();
        final byte[] potentialPrivEncryptionKey = new byte[32];
        byte[] potentialPublicEncryptionKey = null;
        final int requireNlz = request.getRequireNlz();
        // XXX インスタンスから鍵を取り出すのと二次元配列から鍵を取り出すのはどちらが重い？
        // final byte[][] privateKeys = new byte[65536][];
        // final byte[][] publicKeys = new byte[65536][];
        final KeyPair[] pairs = new KeyPair[65536];
        KeyPair pairI = null;
        byte[] iPublicKey = null;
        KeyPair pairJ = null;
        byte[] jPublicKey = null;
        final int pairsLen = pairs.length;
        final MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
        final MessageDigest ripemd160 = MessageDigest.getInstance("RIPEMD160");
        final byte[] cache64 = new byte[64];
        int nlz = 0;
        final BlockingQueue<Response> queue = Queues.getResponseQueue();
        final ArrayList<Response> waitList = new ArrayList<>();
        // TODO 一つのでかいテーブルを全スレッド協調して計算する
        // テーブルサイズを20万ぐらいにしてiをスレッドで分割する？
        // スレッド0 : 0 <= i < 5万
        // スレッド1 : 5万 <= i < 10万
        // スレッド2 : 10万 <= i < 15万
        // スレッド3 : 15万 <= i < 20万
        // 変なことやらせずに1スレッドに巨大テーブル処理させたほうが早い？
        while (true) {
            for (int i = 0; i < pairsLen; i++) {
                random.nextBytes(potentialPrivEncryptionKey);
                potentialPublicEncryptionKey = g.multiply(new BigInteger(1, potentialPrivEncryptionKey)).normalize()
                        .getEncoded(false);
                pairs[i] = new KeyPair(potentialPrivEncryptionKey, potentialPublicEncryptionKey);
            }
            for (int i = 0; i < pairsLen; i++) {
                pairI = pairs[i];
                iPublicKey = pairI.getPublicKey();
                for (int j = 0; j <= i; j++) {
                    pairJ = pairs[j];
                    // XXX 変数生成処理をやらせないために1メソッドにベタ打ちしてるんだが、スタック領域に変数を生成/削除するのってそれなりに重い処理なのか？
                    // staticメソッドはメソッドをインライン展開してくれるらしい
                    jPublicKey = pairJ.getPublicKey();
                    sha512.update(iPublicKey, 0, 65);
                    sha512.update(jPublicKey, 0, 65);
                    sha512.digest(cache64, 0, 64);
                    ripemd160.update(cache64, 0, 64);
                    ripemd160.digest(cache64, 0, 20);
                    for (nlz = 0; cache64[nlz] == 0 && nlz < 20; nlz++) {
                    }
                    if (nlz >= requireNlz) {
                        var response = new Response(pairI, pairJ, Arrays.copyOf(cache64, 20));
                        System.err.printf("keypair found! : %s%n", LocalDateTime.now());
                        try {
                            queue.put(response);
                        } catch (InterruptedException e) {
                            System.err.println("queue append failed!");
                            e.printStackTrace();
                            waitList.add(response);
                        }
                    }
                    sha512.update(jPublicKey, 0, 65);
                    sha512.update(iPublicKey, 0, 65);
                    sha512.digest(cache64, 0, 64);
                    ripemd160.update(cache64, 0, 64);
                    ripemd160.digest(cache64, 0, 20);
                    for (nlz = 0; cache64[nlz] == 0 && nlz < 20; nlz++) {
                    }
                    if (nlz >= requireNlz) {
                        var response = new Response(pairJ, pairI, Arrays.copyOf(cache64, 20));
                        System.err.printf("keypair found! : %s%n", LocalDateTime.now());
                        try {
                            queue.put(response);
                        } catch (InterruptedException e) {
                            System.err.println("queue append failed!");
                            e.printStackTrace();
                            waitList.add(response);
                        }
                    }
                }
            }
            if (!waitList.isEmpty()) {
                ListIterator<Response> responses = waitList.listIterator();
                while (responses.hasNext()) {
                    Response response = responses.next();
                    try {
                        queue.put(response);
                        responses.remove();
                    } catch (InterruptedException e) {
                        // skip
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return string;
    }
}
