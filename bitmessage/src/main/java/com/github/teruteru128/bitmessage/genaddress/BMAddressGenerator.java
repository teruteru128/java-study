package com.github.teruteru128.bitmessage.genaddress;

import com.github.teruteru128.bitmessage.Const;
import com.github.teruteru128.bitmessage.spec.AddressFactory;
import com.github.teruteru128.encode.Base58;
import java.io.IOException;
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

  // TODO: 秘密鍵２個渡せばbitmessageエクスポート形式まで一発になるようになりませんか？
  public static String exportAddress(Response component) {
    return exportAddress(component, System.out);
  }

  public static String exportAddress(Response component, PrintStream out) {
    byte[] ripe = component.getRipe();
    var address4 = AddressFactory.encodeAddress(4, 1, ripe);
    var privSigningKeyWIF = encodeWIF(component.getPrivateSigningKey());
    var privEncryptionKeyWIF = encodeWIF(component.getPrivateEncryptionKey());
    return '[' + address4 + "]\n"
           + "label = " + address4.substring(3, 9) + "\n"
           + "enabled = true\n"
           + "decoy = false\n"
           + "noncetrialsperbyte = 1000\n"
           + "payloadlengthextrabytes = 1000\n"
           + "privsigningkey = " + privSigningKeyWIF + "\n"
           + "privencryptionkey = " + privEncryptionKeyWIF + "\n";
  }

  /**
   * TODO: Split to new class
   */
  public static String encodeWIF(byte[] key) {
    return encodeWIF(key, 0);
  }

  public static String encodeWIF(byte[] key, int offset) {
    Objects.requireNonNull(key);
    if (key.length - offset < 32) {
      throw new IllegalArgumentException("key length must be 32 bytes: " + key.length);
    }
    byte[] checksum = new byte[Const.SHA256_DIGEST_LENGTH];
    // 37 = 1 + 32 + 4
    var buffer1 = new byte[37];
    buffer1[0] = -128;
    System.arraycopy(key, offset, buffer1, 1, 32);

    try {
      MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
      sha256.update(buffer1, 0, 33);
      sha256.digest(checksum, 0, Const.SHA256_DIGEST_LENGTH);
      sha256.update(checksum, 0, Const.SHA256_DIGEST_LENGTH);
      sha256.digest(checksum, 0, Const.SHA256_DIGEST_LENGTH);
    } catch (NoSuchAlgorithmException | DigestException e) {
      // NONE
    }
    System.arraycopy(checksum, 0, buffer1, 33, 4);
    return Base58.encode(buffer1);
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
        logger.log(System.Logger.Level.INFO,
            "タスクの終了を待機しています。しばらくお待ち下さい...");

        if (!service1.isShutdown()) {
          service1.shutdown();
        }
        // service2.shutdown();
        logger.log(System.Logger.Level.INFO, "タスクの終了が完了しました。シャットダウンします。");
      }
    }
  }
}
