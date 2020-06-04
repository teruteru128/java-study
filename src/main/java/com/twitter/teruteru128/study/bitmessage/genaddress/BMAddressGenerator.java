package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.io.PrintStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.twitter.teruteru128.study.Base58;
import com.twitter.teruteru128.study.bitmessage.Const;

/**
 * Producer-Consumerパターンを使い、プロデューサースレッドで鍵ペアを生成、コンシューマースレッドでサーバーへ送信
 */
public class BMAddressGenerator implements Runnable {

    private String[] args;
    private Args args2;

    public BMAddressGenerator() {
        this(new String[0], null);
    }

    public BMAddressGenerator(String[] args) {
        this(args, null);
    }

    public BMAddressGenerator(Args args) {
        this(null, args);
    }

    public BMAddressGenerator(String[] args1, Args args2) {
        this.args = args1;
        this.args2 = args2;
    }

    @Override
    public void run() {
        var tasks = new ArrayList<Producer>();
        int requireNlz = 3;
        Thread consumerThread1 = new Thread(new Consumer(), "consumerThread1");
        consumerThread1.setDaemon(true);
        consumerThread1.start();
        Thread consumerThread2 = new Thread(new Consumer(), "consumerThread2");
        consumerThread2.setDaemon(true);
        consumerThread2.start();
        {
            int tasknum = 1;
            int tmp = 2;
            for (var arg : args) {
                try {
                    tmp = Integer.parseInt(arg, 10);
                    if (tmp >= 1) {
                        tasknum = tmp;
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
            for (int i = 0; i < tasknum; i++) {
                Request request = new Request(requireNlz, i);
                request.setKeyCacheSize(65536);
                tasks.add(new Producer(request));
            }
        }
        ExecutorService service1 = Executors.newCachedThreadPool();
        // ScheduledExecutorService service2 = Executors.newScheduledThreadPool(1);
        System.err.printf("start : %s%n", LocalDateTime.now());
        try {
            service1.invokeAny(tasks);
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.err.println("タスクの終了を待機しています。しばらくお待ち下さい...");
            if (!service1.isShutdown()) {
                service1.shutdown();
            }
            // service2.shutdown();
            System.err.println("タスクの終了が完了しました。シャットダウンします。");
        }
    }

    /**
     * 
     * @see https://github.com/Bitmessage/PyBitmessage/blob/6f35da4096770a668c4944c3024cd7ddb34be092/src/class_addressGenerator.py#L131
     * @see https://en.bitcoin.it/wiki/Wallet_import_format
     * @see https://stackoverflow.com/questions/49204787/deriving-ecdsa-public-key-from-private-key
     * @param args
     */
    public static void main(String[] args) throws Exception {
        Path privateKeyPath = Paths.get("privateKeys.bin");
        Path publicKeyPath = Paths.get("publicKeys.bin");
        byte[] potentialPublicEncryptionKey = null;
        byte[] privateKeys = Files.readAllBytes(privateKeyPath);
        byte[] publicKeys = new byte[(1 << 24) * Const.PUBLIC_KEY_LENGTH];
        ByteBuffer buffer = ByteBuffer.allocateDirect((1 << 24) * Const.PUBLIC_KEY_LENGTH);
        for (int i = 0; i < 16777216; i++) {
            potentialPublicEncryptionKey = Const.G.multiply(new BigInteger(1, privateKeys, i * Const.PRIVATE_KEY_LENGTH, Const.PRIVATE_KEY_LENGTH)).normalize().getEncoded(false);
            buffer.put(potentialPublicEncryptionKey, 0, Const.PUBLIC_KEY_LENGTH);
            System.arraycopy(potentialPublicEncryptionKey, 0, publicKeys, i * Const.PUBLIC_KEY_LENGTH, Const.PUBLIC_KEY_LENGTH);
        }
        Files.write(publicKeyPath, publicKeys);
    }

    public static void exportAddress(Response component) {
        exportAddressTo(component, System.out);
    }

    public static void exportAddressTo(Response component, PrintStream out) {
        byte[] ripe = component.getRipe();
        var address4 = BMAddress.encodeAddress(4, 1, ripe);
        var privSigningKeyWIF = encodeWIF(component.getPrivateSigningKey());
        var privEncryptionKeyWIF = encodeWIF(component.getPrivateEncryptionKey());
        String key = new StringBuilder(305).append('[').append(address4).append(
                "]\nlabel = relpace this label\nenabled = true\ndecoy = false\nnoncetrialsperbyte = 1000\npayloadlengthextrabytes = 1000\nprivsigningkey = ")
                .append(privSigningKeyWIF).append("\nprivencryptionkey = ").append(privEncryptionKeyWIF).append("\n")
                .toString();
        synchronized (out) {
            out.println(key);
        }
    }

    /** TODO: Split to new class */
    public static String encodeWIF(byte[] key) {
        byte[] wrappedKey = new byte[37];
        byte[] checksum = new byte[Const.SHA256_DIGEST_LENGTH];

        wrappedKey[0] = (byte) 0x80;
        System.arraycopy(key, 0, wrappedKey, 1, key.length);
        try {
            MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
            sha256.update(wrappedKey, 0, 33);
            sha256.digest(checksum, 0, Const.SHA256_DIGEST_LENGTH);
            sha256.update(checksum, 0, Const.SHA256_DIGEST_LENGTH);
            sha256.digest(checksum, 0, Const.SHA256_DIGEST_LENGTH);
        } catch (NoSuchAlgorithmException e) {
        } catch (DigestException e) {
        }
        System.arraycopy(checksum, 0, wrappedKey, 33, 4);
        return Base58.encode(wrappedKey);
    }
}
