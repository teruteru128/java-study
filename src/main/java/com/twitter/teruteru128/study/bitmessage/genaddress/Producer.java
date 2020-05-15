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
        /* random source */
        final SecureRandom random = new SecureRandom();

        /* const */
        final ECPoint g = CustomNamedCurves.getByName("secp256k1").getG();
        final int requireNlz = request.getRequireNlz();
        final int pairsLen = 65536;
        final int privateKeyLen = 32;
        final int publicKeyLen = 65;
        final int sha512HashLen = 64;
        final int ripemd160HashLen = 20;

        /* working area */
        final byte[] potentialPrivEncryptionKey = new byte[32];
        byte[] potentialPublicEncryptionKey = null;
        // XXX インスタンスから鍵を取り出すのと二次元配列から鍵を取り出すのはどちらが重い？ -> 1次元配列にしてしまえば無問題
        final byte[] privateKeys = new byte[pairsLen * privateKeyLen];
        final byte[] publicKeys = new byte[pairsLen * publicKeyLen];
        final byte[] cache64 = new byte[sha512HashLen];
        int nlz = 0;

        /* hash objects */
        final MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
        final MessageDigest ripemd160 = MessageDigest.getInstance("RIPEMD160");

        /* consumer queues */
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
            // 鍵を生成
            for (int i = 0; i < pairsLen; i++) {
                random.nextBytes(potentialPrivEncryptionKey);
                potentialPublicEncryptionKey = g.multiply(new BigInteger(1, potentialPrivEncryptionKey)).normalize()
                        .getEncoded(false);
                System.arraycopy(potentialPrivEncryptionKey, 0, privateKeys, i * privateKeyLen, privateKeyLen);
                System.arraycopy(potentialPublicEncryptionKey, 0, publicKeys, i * publicKeyLen, publicKeyLen);
            }
            for (int i = 0; i < pairsLen; i++) {
                for (int j = 0; j <= i; j++) {
                    // XXX 変数生成処理をやらせないために1メソッドにベタ打ちしてるんだが、スタック領域に変数を生成/削除するのってそれなりに重い処理なのか？
                    // staticメソッドはメソッドをインライン展開してくれるらしい
                    sha512.update(publicKeys, i * publicKeyLen, publicKeyLen);
                    sha512.update(publicKeys, j * publicKeyLen, publicKeyLen);
                    sha512.digest(cache64, 0, sha512HashLen);
                    ripemd160.update(cache64, 0, sha512HashLen);
                    ripemd160.digest(cache64, 0, ripemd160HashLen);
                    for (nlz = 0; cache64[nlz] == 0 && nlz < ripemd160HashLen; nlz++) {
                    }
                    if (nlz >= requireNlz) {
                        byte[] signingPrivateKey = Arrays.copyOfRange(privateKeys, i * privateKeyLen, (i + 1) * privateKeyLen);
                        byte[] signingPublicKey = Arrays.copyOfRange(publicKeys, i * publicKeyLen, (i + 1) * publicKeyLen);
                        KeyPair signingKeyPair = new KeyPair(signingPrivateKey, signingPublicKey);
                        byte[] encryptionPrivateKey = Arrays.copyOfRange(privateKeys, j * privateKeyLen, (j + 1) * privateKeyLen);
                        byte[] encryptionPublicKey = Arrays.copyOfRange(publicKeys, j * publicKeyLen, (j + 1) * publicKeyLen);
                        KeyPair encryptionKeyPair = new KeyPair(encryptionPrivateKey, encryptionPublicKey);
                        var response = new Response(signingKeyPair, encryptionKeyPair,
                                Arrays.copyOf(cache64, ripemd160HashLen));
                        System.err.printf("keypair found! : %s%n", LocalDateTime.now());
                        try {
                            queue.put(response);
                        } catch (InterruptedException e) {
                            System.err.println("queue append failed!");
                            e.printStackTrace();
                            waitList.add(response);
                        }
                    }
                    sha512.update(publicKeys, j * publicKeyLen, publicKeyLen);
                    sha512.update(publicKeys, i * publicKeyLen, publicKeyLen);
                    sha512.digest(cache64, 0, sha512HashLen);
                    ripemd160.update(cache64, 0, sha512HashLen);
                    ripemd160.digest(cache64, 0, ripemd160HashLen);
                    for (nlz = 0; cache64[nlz] == 0 && nlz < ripemd160HashLen; nlz++) {
                    }
                    if (nlz >= requireNlz) {
                        byte[] signingPrivateKey = Arrays.copyOfRange(privateKeys, j * privateKeyLen, (j + 1) * privateKeyLen);
                        byte[] signingPublicKey = Arrays.copyOfRange(publicKeys, j * publicKeyLen, (j + 1) * publicKeyLen);
                        KeyPair signingKeyPair = new KeyPair(signingPrivateKey, signingPublicKey);
                        byte[] encryptionPrivateKey = Arrays.copyOfRange(privateKeys, i * privateKeyLen, (i + 1) * privateKeyLen);
                        byte[] encryptionPublicKey = Arrays.copyOfRange(publicKeys, i * publicKeyLen, (i + 1) * publicKeyLen);
                        KeyPair encryptionKeyPair = new KeyPair(encryptionPrivateKey, encryptionPublicKey);
                        var response = new Response(signingKeyPair, encryptionKeyPair, Arrays.copyOf(cache64, 20));
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
