package com.github.teruteru128.bitmessage.genaddress;

import com.github.teruteru128.bitmessage.spec.AddressFactory;
import com.github.teruteru128.bitmessage.Const;
import com.github.teruteru128.encode.Base58;

import java.io.PrintStream;
import java.lang.System.Logger;
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
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Producer-Consumerパターンを使い、プロデューサースレッドで鍵ペアを生成、コンシューマースレッドでサーバーへ送信
 */
public class BMAddressGenerator implements Runnable {

    private Logger logger = System.getLogger("BM");

    private String[] args;

    public BMAddressGenerator() {
        this(new String[0]);
    }

    public BMAddressGenerator(String[] args) {
        this.args = args;
    }

    /**
     * @param args
     * @see <a href="https://github.com/Bitmessage/PyBitmessage/blob/6f35da4096770a668c4944c3024cd7ddb34be092/src/class_addressGenerator.py#L131">class_addressGenerator.py</a>
     * @see <a href="https://en.bitcoin.it/wiki/Wallet_import_format">Wallet import format</a>
     * @see <a href="https://stackoverflow.com/questions/49204787/deriving-ecdsa-public-key-from-private-key">Deriving ECDSA Public Key from Private Key - stack overflow</a>
     */
    public static void main(String[] args) throws Exception {
        Path privateKeyPath = Paths.get("privateKeys.bin");
        Path publicKeyPath = Paths.get("publicKeys.bin");
        byte[] potentialPublicEncryptionKey = null;
        byte[] privateKeys = Files.readAllBytes(privateKeyPath);
        byte[] publicKeys = new byte[(1 << 24) * Const.PUBLIC_KEY_LENGTH];
        ByteBuffer buffer = ByteBuffer.allocateDirect((1 << 24) * Const.PUBLIC_KEY_LENGTH);
        for (int i = 0; i < 16777216; i++) {
            potentialPublicEncryptionKey = Const.SEC_P256_K1_G
                    .multiply(new BigInteger(1, privateKeys, i * Const.PRIVATE_KEY_LENGTH, Const.PRIVATE_KEY_LENGTH))
                    .normalize().getEncoded(false);
            buffer.put(potentialPublicEncryptionKey, 0, Const.PUBLIC_KEY_LENGTH);
            System.arraycopy(potentialPublicEncryptionKey, 0, publicKeys, i * Const.PUBLIC_KEY_LENGTH,
                    Const.PUBLIC_KEY_LENGTH);
        }
        Files.write(publicKeyPath, publicKeys);
    }

    // TODO: 秘密鍵２個渡せばbitmessageエクスポート形式まで一発になるようになりませんか？
    public static String exportAddress(Response component) {
        return exportAddress(component, System.out);
    }

    public static String exportAddress(Response component, PrintStream out) {
        byte[] ripe = component.getRipe();
        var address4 = AddressFactory.encodeAddress(4, 1, ripe);
        var privSigningKeyWIF = encodeWIF(component.getPrivateSigningKey());
        var privEncryptionKeyWIF = encodeWIF(component.getPrivateEncryptionKey());
        String key = new StringBuilder(305).append('[').append(address4).append("]\n")
                .append("label = ").append(address4.substring(3, 9)).append("\n")
                .append("enabled = true\n")
                .append("decoy = false\n")
                .append("noncetrialsperbyte = 1000\n")
                .append("payloadlengthextrabytes = 1000\n")
                .append("privsigningkey = ").append(privSigningKeyWIF).append("\n")
                .append("privencryptionkey = ").append(privEncryptionKeyWIF).append("\n")
                .toString();
        return key;
    }

    /**
     * TODO: Split to new class
     */
    public static String encodeWIF(byte[] key) {
        Objects.requireNonNull(key);
        // ???: support other key length?
        if (key.length != 32)
            throw new IllegalArgumentException("key length must be 32 bytes: " + key.length);
        byte[] checksum = new byte[Const.SHA256_DIGEST_LENGTH];
        // 37 = 1 + 32 + 4
        var buffer = ByteBuffer.allocate(37).put((byte) 0x80).put(key);

        try {
            MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
            sha256.update(buffer.array(), 0, 33);
            sha256.digest(checksum, 0, Const.SHA256_DIGEST_LENGTH);
            sha256.update(checksum, 0, Const.SHA256_DIGEST_LENGTH);
            sha256.digest(checksum, 0, Const.SHA256_DIGEST_LENGTH);
        } catch (NoSuchAlgorithmException | DigestException e) {
            // NONE
        }
        buffer.put(checksum, 0, 4);
        return Base58.encode(buffer.array());
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
                } catch (NumberFormatException e) {
                    tmp = Runtime.getRuntime().availableProcessors();
                }
            }
            if (tmp >= 1) {
                tasknum = tmp;
            }
            for (int i = 0; i < tasknum; i++) {
                Request request = new Request(requireNlz, i);
                request.setKeyCacheSize(65536);
                tasks.add(new Producer(request));
            }
        }
        try (ExecutorService service1 = Executors.newCachedThreadPool()) {
            // ScheduledExecutorService service2 = Executors.newScheduledThreadPool(1);
            logger.log(System.Logger.Level.INFO, "start : %s%n", LocalDateTime.now());
            try {
                service1.invokeAny(tasks);
            } catch (ExecutionException | InterruptedException e) {
                logger.log(System.Logger.Level.ERROR, "", e);
            } finally {
                logger.log(System.Logger.Level.INFO, "タスクの終了を待機しています。しばらくお待ち下さい...");

                if (!service1.isShutdown()) {
                    service1.shutdown();
                }
                // service2.shutdown();
                logger.log(System.Logger.Level.INFO, "タスクの終了が完了しました。シャットダウンします。");
            }
        }
    }
}
