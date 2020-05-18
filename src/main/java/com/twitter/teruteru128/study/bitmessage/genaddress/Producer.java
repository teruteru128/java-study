package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.math.BigInteger;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;

import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.math.ec.ECPoint;

public class Producer implements Callable<Void> {

    private Request request;
    private final String string;

    public Producer(Request request) {
        this.request = request;
        string = "Task-" + request.getTaskID();
    }

    /**
     * 
     * コマンド
     * generate
     * validate
     * version
     * 
     * generate
     *  コマンドラインオプション
     *  スレッド数
     *  要求する短さ
     *  キャッシュサイズ(鍵)
     *  出力先
     *   標準出力
     *   ファイル
     * validate
     *  address
     *  signingPrivateKeyWIF
     *  encryptionPrivateKeyWIF
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
        final int taskId = request.getTaskID();

        /* working area */
        byte[] potentialPublicEncryptionKey = null;
        // XXX 生の鍵データを一つの配列に詰め込むのは本当に早いのか？
        final byte[] privateKeys = new byte[pairsLen * privateKeyLen];
        final byte[] iPublicKey = new byte[publicKeyLen];
        final byte[] jPublicKey = new byte[publicKeyLen];
        final byte[] publicKeys = new byte[pairsLen * publicKeyLen];
        final byte[] cache64 = new byte[sha512HashLen];
        int nlz = 0;

        /* hash objects */
        final MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
        final MessageDigest ripemd160 = MessageDigest.getInstance("RIPEMD160");

        /* consumer queues */
        final BlockingQueue<Response> queue = Queues.getResponseQueue();
        final LinkedList<Response> waitList = new LinkedList<>();
        // TODO 一つのでかいテーブルを全スレッド協調して計算する -> ？
        // テーブルサイズを20万ぐらいにしてiをスレッドで分割する？
        // スレッド0 : 0 <= i < 5万
        // スレッド1 : 5万 <= i < 10万
        // スレッド2 : 10万 <= i < 15万
        // スレッド3 : 15万 <= i < 20万
        // 変なことやらせずに1スレッドに巨大テーブル処理させたほうが早い？
        LocalDateTime privateKeyCacheGenStart;
        LocalDateTime privateKeyCacheGenFinish;
        LocalDateTime publicKeyCacheGenFinish;
        LocalDateTime cacheFinish;
        while (true) {
            // 鍵を生成
            privateKeyCacheGenStart = LocalDateTime.now();
            random.nextBytes(privateKeys);
            privateKeyCacheGenFinish = LocalDateTime.now();
            //System.err.printf("private cache gen finish(%d) : %f%n", taskId, privateKeyCacheGenStart.until(privateKeyCacheGenFinish, ChronoUnit.NANOS)/1000000000d);
            for (int i = 0; i < pairsLen; i++) {
                potentialPublicEncryptionKey = g.multiply(new BigInteger(1, privateKeys, i * privateKeyLen, privateKeyLen)).normalize().getEncoded(false);
                System.arraycopy(potentialPublicEncryptionKey, 0, publicKeys, i * publicKeyLen, publicKeyLen);
            }
            publicKeyCacheGenFinish = LocalDateTime.now();
            //System.err.printf("public cache gen finish(%d) : %f%n", taskId, privateKeyCacheGenFinish.until(publicKeyCacheGenFinish, ChronoUnit.NANOS)/1000000000d);
            for (int i = 0; i < pairsLen; i++) {
                System.arraycopy(publicKeys, i * publicKeyLen, iPublicKey, 0, publicKeyLen);
                for (int j = 0; j <= i; j++) {
                    System.arraycopy(publicKeys, j * publicKeyLen, jPublicKey, 0, publicKeyLen);
                    // XXX 変数生成処理をやらせないために1メソッドにベタ打ちしてるんだが、スタック領域に変数を生成/削除するのってそれなりに重い処理なのか？
                    // staticメソッドはメソッドをインライン展開してくれるらしい
                    // ここから
                    // ripeを計算する
                    sha512.update(iPublicKey, 0, publicKeyLen);
                    sha512.update(jPublicKey, 0, publicKeyLen);
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
                        KeyPair signingKeyPair = new KeyPair(signingPrivateKey, iPublicKey);
                        byte[] encryptionPrivateKey = Arrays.copyOfRange(privateKeys, j * privateKeyLen, (j + 1) * privateKeyLen);
                        KeyPair encryptionKeyPair = new KeyPair(encryptionPrivateKey, jPublicKey);
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
                    sha512.update(jPublicKey, 0, publicKeyLen);
                    sha512.update(iPublicKey, 0, publicKeyLen);
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
                        KeyPair signingKeyPair = new KeyPair(signingPrivateKey, jPublicKey);
                        byte[] encryptionPrivateKey = Arrays.copyOfRange(privateKeys, i * privateKeyLen, (i + 1) * privateKeyLen);
                        KeyPair encryptionKeyPair = new KeyPair(encryptionPrivateKey, iPublicKey);
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
            cacheFinish = LocalDateTime.now();
            //System.err.printf("cache finish(%d) : %f%n", taskId, publicKeyCacheGenFinish.until(cacheFinish, ChronoUnit.NANOS)/1000000000d);
        }
    }

    @Override
    public String toString() {
        return string;
    }
}
