package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.math.BigInteger;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.LinkedList;
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
     * コマンドラインオプション
     * スレッド数
     * 要求
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

        /* static const */
        final ECPoint g = CustomNamedCurves.getByName("secp256k1").getG();
        final int pairsLen = 65536;
        final int privateKeyLen = 32;
        final int publicKeyLen = 65;
        final int sha512HashLen = 64;
        final int ripemd160HashLen = 20;

        /* instance const */
        final int requireNlz = request.getRequireNlz();

        /* working area */
        byte[] potentialPublicEncryptionKey = null;
        // XXX すべての生の鍵データを一つの配列に詰め込むのは本当に早いのか？
        final byte[] privateKeys = new byte[pairsLen * privateKeyLen];
        final byte[] iPublicKey = new byte[publicKeyLen];
        final byte[] publicKeys = new byte[pairsLen * publicKeyLen];
        final byte[] cache64 = new byte[sha512HashLen];
        int nlz = 0;
        int iPublicKeyOffset;
        int jPublicKeyOffset;

        /* hash objects */
        final MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
        final MessageDigest ripemd160 = MessageDigest.getInstance("RIPEMD160");

        /* consumer queues */
        final BlockingQueue<Response> queue = Queues.getResponseQueue();
        final LinkedList<Response> waitList = new LinkedList<>();
        // TODO 一つのでかいテーブルを全スレッド協調して計算する
        // テーブルサイズを20万ぐらいにしてiをスレッドで分割する？
        // スレッド0 : 0 <= i < 5万
        // スレッド1 : 5万 <= i < 10万
        // スレッド2 : 10万 <= i < 15万
        // スレッド3 : 15万 <= i < 20万
        // 変なことやらせずに1スレッドに巨大テーブル処理させたほうが早い？
        while (true) {
            // 鍵を生成
            System.err.printf("hoge (%d) %s%n", request.getTaskID(), LocalDateTime.now());
            random.nextBytes(privateKeys);
            System.err.printf("huga (%d) %s%n", request.getTaskID(), LocalDateTime.now());
            for (int i = 0; i < pairsLen; i++) {
                potentialPublicEncryptionKey = g.multiply(new BigInteger(1, privateKeys, i * privateKeyLen, privateKeyLen)).normalize()
                        .getEncoded(false);
                System.arraycopy(potentialPublicEncryptionKey, 0, publicKeys, i * publicKeyLen, publicKeyLen);
            }
            System.err.printf("piyo (%d) %s%n", request.getTaskID(), LocalDateTime.now());
            for (int i = 0; i < pairsLen; i++) {
                iPublicKeyOffset = i * publicKeyLen;
                System.arraycopy(publicKeys, iPublicKeyOffset, iPublicKey, 0, publicKeyLen);
                for (int j = 0; j <= i; j++) {
                    jPublicKeyOffset = j * publicKeyLen;
                    // XXX 変数生成処理をやらせないために1メソッドにベタ打ちしてるんだが、スタック領域に変数を生成/削除するのってそれなりに重い処理なのか？
                    // staticメソッドはメソッドをインライン展開してくれるらしい
                    // ここから
                    // ripeを計算する
                    sha512.update(publicKeys, iPublicKeyOffset, publicKeyLen);
                    sha512.update(publicKeys, jPublicKeyOffset, publicKeyLen);
                    sha512.digest(cache64, 0, sha512HashLen);
                    ripemd160.update(cache64, 0, sha512HashLen);
                    ripemd160.digest(cache64, 0, ripemd160HashLen);
                    // number of leading zeroを計算する
                    for (nlz = 0; cache64[nlz] == 0 && nlz < ripemd160HashLen; nlz++) {
                    }
                    // 計算したnlz結果が要求値より良好なら
                    if (nlz >= requireNlz) {
                        // responseインスタンスを生成してエンキュー
                        byte[] signingPrivateKey = Arrays.copyOfRange(privateKeys, i * privateKeyLen, (i + 1) * privateKeyLen);
                        byte[] signingPublicKey = Arrays.copyOfRange(publicKeys, iPublicKeyOffset, iPublicKeyOffset + publicKeyLen);
                        KeyPair signingKeyPair = new KeyPair(signingPrivateKey, signingPublicKey);
                        byte[] encryptionPrivateKey = Arrays.copyOfRange(privateKeys, j * privateKeyLen, (j + 1) * privateKeyLen);
                        byte[] encryptionPublicKey = Arrays.copyOfRange(publicKeys, jPublicKeyOffset, jPublicKeyOffset + publicKeyLen);
                        KeyPair encryptionKeyPair = new KeyPair(encryptionPrivateKey, encryptionPublicKey);
                        var response = new Response(signingKeyPair, encryptionKeyPair,
                                Arrays.copyOf(cache64, ripemd160HashLen));
                        System.err.printf("keypair found!(%d) %s%n", request.getTaskID(), LocalDateTime.now());
                        try {
                            queue.put(response);
                        } catch (InterruptedException e) {
                            System.err.println("enqueue failed!");
                            e.printStackTrace();
                            // Save if failed
                            waitList.add(response);
                        }
                    }
                    // ここまで
                    // ここから
                    // ripeを計算する
                    sha512.update(publicKeys, jPublicKeyOffset, publicKeyLen);
                    sha512.update(publicKeys, iPublicKeyOffset, publicKeyLen);
                    sha512.digest(cache64, 0, sha512HashLen);
                    ripemd160.update(cache64, 0, sha512HashLen);
                    ripemd160.digest(cache64, 0, ripemd160HashLen);
                    // number of leading zeroを計算する
                    for (nlz = 0; cache64[nlz] == 0 && nlz < ripemd160HashLen; nlz++) {
                    }
                    // 計算したnlz結果が要求値より良好なら
                    if (nlz >= requireNlz) {
                        // responseインスタンスを生成してエンキュー
                        byte[] signingPrivateKey = Arrays.copyOfRange(privateKeys, j * privateKeyLen, (j + 1) * privateKeyLen);
                        byte[] signingPublicKey = Arrays.copyOfRange(publicKeys, jPublicKeyOffset, jPublicKeyOffset + publicKeyLen);
                        KeyPair signingKeyPair = new KeyPair(signingPrivateKey, signingPublicKey);
                        byte[] encryptionPrivateKey = Arrays.copyOfRange(privateKeys, i * privateKeyLen, (i + 1) * privateKeyLen);
                        byte[] encryptionPublicKey = Arrays.copyOfRange(publicKeys, iPublicKeyOffset, iPublicKeyOffset + publicKeyLen);
                        KeyPair encryptionKeyPair = new KeyPair(encryptionPrivateKey, encryptionPublicKey);
                        var response = new Response(signingKeyPair, encryptionKeyPair, Arrays.copyOf(cache64, 20));
                        System.err.printf("keypair found!(%d) %s%n", request.getTaskID(), LocalDateTime.now());
                        try {
                            queue.put(response);
                        } catch (InterruptedException e) {
                            System.err.println("enqueue failed!");
                            e.printStackTrace();
                            waitList.add(response);
                        }
                    }
                    // ここまで
                }
            }
            if (!waitList.isEmpty()) {
                ListIterator<Response> responses = waitList.listIterator();
                while (responses.hasNext()) {
                    Response response = responses.next();
                    try {
                        queue.put(response);
                        // remove after enqueue
                        responses.remove();
                    } catch (InterruptedException e) {
                        // skip
                    }
                }
            }
            System.err.printf("hogera (%d) %s%n", request.getTaskID(), LocalDateTime.now());
        }
    }

    @Override
    public String toString() {
        return string;
    }
}
