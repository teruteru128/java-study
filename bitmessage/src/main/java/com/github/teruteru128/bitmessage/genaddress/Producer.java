package com.github.teruteru128.bitmessage.genaddress;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.Callable;

import com.github.teruteru128.bitmessage.spec.KeyPair;
import com.github.teruteru128.bitmessage.Const;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Producer implements Callable<Void> {

    private static final Logger log = LoggerFactory.getLogger(Producer.class);
    private final Request request;
    private final String string;

    public Producer(Request request) {
        this.request = request;
        string = "Task-" + request.getTaskID();
    }

    /* random source */
    private final SecureRandom random = new SecureRandom();

    /**
     *
     * コマンド
     * generate
     * validate
     * version
     *
     * generate
     * コマンドラインオプション
     * スレッド数
     * 要求する短さ
     * キャッシュサイズ(鍵)
     * 出力先
     * 標準出力
     * ファイル
     * validate
     * address
     * signingPrivateKeyWIF
     * encryptionPrivateKeyWIF
     *
     * @return
     * @throws NoSuchAlgorithmException
     * @throws DigestException
     * @see <a href="https://qiita.com/Syo_pr/items/92b3cf7d7fc5dab4a3a7#%E8%A1%8C%E5%88%97%E8%A1%8C%E5%88%97%E7%A9%8D%E3%81%AE%E6%9C%80%E9%81%A9%E5%8C%96">行列行列積の高速化手法 - qiita</a>
     */
    @Override
    public Void call() throws NoSuchAlgorithmException, DigestException {

        /* instance const */
        final int taskId = request.getTaskID();
        final int keyCacheSize = request.getKeyCacheSize();
        final int requireNlz = request.getNlzToRequest();

        /* working area */
        byte[] potentialPublicEncryptionKey = null;
        // XXX 生の鍵データを一つの配列に詰め込むのは本当に早いのか？
        final byte[] privateKeys = new byte[keyCacheSize * Const.PRIVATE_KEY_LENGTH];
        var iPublicKeyBuffer = ByteBuffer.allocate(Const.PUBLIC_KEY_LENGTH);
        var jPublicKeyBuffer = ByteBuffer.allocate(Const.PUBLIC_KEY_LENGTH);
        final byte[] publicKeys = new byte[keyCacheSize * Const.PUBLIC_KEY_LENGTH];
        var buffer = ByteBuffer.allocate(Const.SHA512_DIGEST_LENGTH);
        var longView = buffer.asLongBuffer();
        final byte[] cache64 = buffer.array();
        int nlz = 0;

        /* hash objects */
        final MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
        final MessageDigest ripemd160 = MessageDigest.getInstance("RIPEMD160");

        /* consumer queues */
        final LinkedList<Response> enqueueTray = new LinkedList<>();
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
            privateKeyCacheGenStart = LocalDateTime.now();
            // 秘密鍵を生成する
            // System.err.printf("hoge (%d) %s%n", taskId, LocalDateTime.now());
            random.nextBytes(privateKeys);
            privateKeyCacheGenFinish = LocalDateTime.now();
            // System.err.printf("huga (%d) %s%n", taskId, LocalDateTime.now());
            // 秘密鍵から対応する公開鍵を導出する
            for (int i = 0; i < keyCacheSize; i++) {
                // 公開鍵の導出は重い処理のため、予め大量に導出しておいて組み合わせたほうが早い
                potentialPublicEncryptionKey = Const.SEC_P256_K1_G
                        .multiply(
                                new BigInteger(1, privateKeys, i * Const.PRIVATE_KEY_LENGTH, Const.PRIVATE_KEY_LENGTH))
                        .normalize().getEncoded(false);
                System.arraycopy(potentialPublicEncryptionKey, 0, publicKeys, i * Const.PUBLIC_KEY_LENGTH,
                        Const.PUBLIC_KEY_LENGTH);
            }
            publicKeyCacheGenFinish = LocalDateTime.now();
            cacheFinish = LocalDateTime.now();
            privateKeyCacheGenStart.until(privateKeyCacheGenFinish, ChronoUnit.SECONDS);
            privateKeyCacheGenFinish.until(publicKeyCacheGenFinish, ChronoUnit.SECONDS);
            publicKeyCacheGenFinish.until(cacheFinish, ChronoUnit.SECONDS);
            // System.err.printf("piyo (%d) %s%n", taskId, LocalDateTime.now());
            for (int i = 0; i < keyCacheSize; i++) {
                iPublicKeyBuffer.put(publicKeys, i * Const.PUBLIC_KEY_LENGTH, Const.PUBLIC_KEY_LENGTH);
                iPublicKeyBuffer.flip();
                // ここから
                // ripeを計算する
                sha512.update(iPublicKeyBuffer);
                iPublicKeyBuffer.rewind();
                sha512.update(iPublicKeyBuffer);
                sha512.digest(cache64, 0, Const.SHA512_DIGEST_LENGTH);
                ripemd160.update(cache64, 0, Const.SHA512_DIGEST_LENGTH);
                ripemd160.digest(cache64, 0, Const.RIPEMD160_DIGEST_LENGTH);
                // number of leading zeroを計算する
                nlz = Long.numberOfLeadingZeros(longView.get(0)) >> 3;
                // 計算したnlz結果が要求値より良好なら
                if (nlz >= requireNlz) {
                    // responseインスタンスを生成してエンキュー
                    KeyPair signingKeyPair = new KeyPair(privateKeys, i * Const.PRIVATE_KEY_LENGTH,
                            (i + 1) * Const.PRIVATE_KEY_LENGTH, iPublicKeyBuffer.array(), 0, 65);
                    var response = new Response(signingKeyPair, signingKeyPair,
                            Arrays.copyOf(cache64, Const.RIPEMD160_DIGEST_LENGTH));
                    // System.err.printf("keypair found!(%d) %s%n", taskId, LocalDateTime.now());
                    try {
                        Queues.getResponseQueue().put(response);
                    } catch (InterruptedException e) {
                        System.err.println("enqueue failed!");
                        log.error("", e);
                        // Save if failed
                        enqueueTray.add(response);
                    }
                }
                // ここまで
                for (int j = 0; j <= i; j++) {
                    jPublicKeyBuffer.put(publicKeys, j * Const.PUBLIC_KEY_LENGTH, Const.PUBLIC_KEY_LENGTH);
                    // XXX 変数生成処理をやらせないために1メソッドにベタ打ちしてるんだが、スタック領域に変数を生成/削除するのってそれなりに重い処理なのか？
                    // staticメソッドはメソッドをインライン展開してくれるらしい
                    // ここから
                    // ripeを計算する
                    iPublicKeyBuffer.rewind();
                    jPublicKeyBuffer.flip();
                    sha512.update(iPublicKeyBuffer);
                    sha512.update(jPublicKeyBuffer);
                    sha512.digest(cache64, 0, Const.SHA512_DIGEST_LENGTH);
                    ripemd160.update(cache64, 0, Const.SHA512_DIGEST_LENGTH);
                    ripemd160.digest(cache64, 0, Const.RIPEMD160_DIGEST_LENGTH);
                    // number of leading zeroを計算する
                    nlz = Long.numberOfLeadingZeros(longView.get(0)) >> 3;
                    // 計算したnlz結果が要求値より良好なら
                    if (nlz >= requireNlz) {
                        // responseインスタンスを生成してエンキュー
                        byte[] signingPrivateKey = Arrays.copyOfRange(privateKeys, i * Const.PRIVATE_KEY_LENGTH,
                                (i + 1) * Const.PRIVATE_KEY_LENGTH);
                        KeyPair signingKeyPair = new KeyPair(signingPrivateKey, iPublicKeyBuffer.array());
                        byte[] encryptionPrivateKey = Arrays.copyOfRange(privateKeys, j * Const.PRIVATE_KEY_LENGTH,
                                (j + 1) * Const.PRIVATE_KEY_LENGTH);
                        KeyPair encryptionKeyPair = new KeyPair(encryptionPrivateKey, jPublicKeyBuffer.array());
                        var response = new Response(signingKeyPair, encryptionKeyPair,
                                Arrays.copyOf(cache64, Const.RIPEMD160_DIGEST_LENGTH));
                        // System.err.printf("keypair found!(%d) %s%n", taskId, LocalDateTime.now());
                        try {
                            Queues.getResponseQueue().put(response);
                        } catch (InterruptedException e) {
                            System.err.println("enqueue failed!");
                            log.error("", e);
                            // Save if failed
                            enqueueTray.add(response);
                        }
                    }
                    // ここまで
                    // ここから
                    iPublicKeyBuffer.rewind();
                    jPublicKeyBuffer.rewind();
                    // ripeを計算する
                    sha512.update(jPublicKeyBuffer);
                    sha512.update(iPublicKeyBuffer);
                    sha512.digest(cache64, 0, Const.SHA512_DIGEST_LENGTH);
                    ripemd160.update(cache64, 0, Const.SHA512_DIGEST_LENGTH);
                    ripemd160.digest(cache64, 0, Const.RIPEMD160_DIGEST_LENGTH);
                    // number of leading zeroを計算する
                    // nlz = 0;
                    // while(hash[nlz] == 0 && nlz++ < 20){}
                    nlz = Long.numberOfLeadingZeros(longView.get(0)) >> 3;
                    // 計算したnlz結果が要求値より良好なら
                    if (nlz >= requireNlz) {
                        // responseインスタンスを生成してエンキュー
                        byte[] signingPrivateKey = Arrays.copyOfRange(privateKeys, j * Const.PRIVATE_KEY_LENGTH,
                                (j + 1) * Const.PRIVATE_KEY_LENGTH);
                        KeyPair signingKeyPair = new KeyPair(signingPrivateKey, jPublicKeyBuffer.array());
                        byte[] encryptionPrivateKey = Arrays.copyOfRange(privateKeys, i * Const.PRIVATE_KEY_LENGTH,
                                (i + 1) * Const.PRIVATE_KEY_LENGTH);
                        KeyPair encryptionKeyPair = new KeyPair(encryptionPrivateKey, iPublicKeyBuffer.array());
                        var response = new Response(signingKeyPair, encryptionKeyPair, Arrays.copyOf(cache64, 20));
                        // System.err.printf("keypair found!(%d) %s%n", taskId, LocalDateTime.now());
                        try {
                            Queues.getResponseQueue().put(response);
                        } catch (InterruptedException e) {
                            System.err.println("enqueue failed!");
                            log.error("", e);
                            enqueueTray.add(response);
                        }
                    }
                    // ここまで
                }
            }
            if (!enqueueTray.isEmpty()) {
                ListIterator<Response> responses = enqueueTray.listIterator();
                while (responses.hasNext()) {
                    Response response = responses.next();
                    try {
                        Queues.getResponseQueue().put(response);
                        // remove after enqueue
                        responses.remove();
                    } catch (InterruptedException e) {
                        // skip
                    }
                }
            }
            System.err.printf("hogera (%d) %s%n", taskId, LocalDateTime.now());
        }
    }

    @Override
    public String toString() {
        return string;
    }
}
