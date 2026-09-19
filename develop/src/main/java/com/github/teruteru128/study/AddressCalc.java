package com.github.teruteru128.study;

import static com.github.teruteru128.bitmessage.Const.PUBLIC_KEY_LENGTH;
import static com.github.teruteru128.foreign.openssl.evp_h.EVP_DigestFinal_ex;
import static com.github.teruteru128.foreign.openssl.evp_h.EVP_DigestInit_ex;
import static com.github.teruteru128.foreign.openssl.evp_h.EVP_DigestUpdate;
import static com.github.teruteru128.foreign.openssl.evp_h.EVP_MD_CTX_free;
import static com.github.teruteru128.foreign.openssl.evp_h.EVP_MD_CTX_new;
import static com.github.teruteru128.foreign.openssl.evp_h.EVP_MD_fetch;
import static com.github.teruteru128.foreign.openssl.evp_h.EVP_MD_free;
import static java.lang.foreign.MemorySegment.NULL;
import static java.lang.foreign.ValueLayout.JAVA_BYTE;

import com.github.teruteru128.bitmessage.Const;
import com.github.teruteru128.bitmessage.spec.AddressFactory;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine.Command;

/**
 * マルチスレッド版
 */
public class AddressCalc implements Callable<Void> {

  public static final int PUBLIC_KEY_NUM_PER_FILE = 16777216;
  public static final int BOUND = PUBLIC_KEY_NUM_PER_FILE * 2;
  /**
   * PUBLIC_KEY_SIZE_PER_FILE = 1090519040 = 16777216 * 65
   */
  public static final int PUBLIC_KEY_SIZE_PER_FILE = 1090519040;
  private static final Logger logger = LoggerFactory.getLogger(AddressCalc.class);
  private static final Pattern pattern = Pattern.compile(".*twitter.*", Pattern.CASE_INSENSITIVE);
  private static final VarHandle LONG_HANDLE = MethodHandles.byteArrayViewVarHandle(long[].class,
      ByteOrder.BIG_ENDIAN);

  private final String[] args;
  private final Predicate<byte[]> predicate;

  public AddressCalc(String[] args, Predicate<byte[]> predicate) {
    this.args = args;
    this.predicate = predicate;
  }

  public static void loadPublicKey(byte[] keys, Path file, int index) throws IOException {
    try (var raf = new RandomAccessFile(file.toFile(), "r")) {
      raf.seek(index * 65L);
      raf.readFully(keys);
    }
  }

  @Command(name = "addressSearch2")
  private static void addressSearch2(String[] args) throws IOException {
    new AddressCalc(args, hash -> hash[0] == 0 && pattern.matcher(
        AddressFactory.encodeAddress(hash, 0, 20)).matches()).call();
  }

  @Override
  public Void call() throws IOException {
    if (args.length < 3) {
      throw new RuntimeException("引数が足りませぬぞ");
    }
    var keys = new byte[2][];
    for (int i = 0; i < 2; i++) {
      keys[i] = Files.readAllBytes(Path.of(args[i + 1]));
    }
    var nThreads = 8;
    try (var service = Executors.newFixedThreadPool(nThreads)) {
      var tasks = getCallables(keys, nThreads, predicate);
      service.invokeAny(tasks);
      while (!service.awaitTermination(6, TimeUnit.HOURS)) {
        System.err.println("an hour!");
      }
    } catch (ExecutionException e) {
      throw new RuntimeException(e);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new RuntimeException(e);
    }
    return null;
  }

  private ArrayList<Callable<Void>> getCallables(final byte[][] keysArray, final int threads,
      Predicate<byte[]> p) {
    logger.info("start");
    final var tasks = new ArrayList<Callable<Void>>();
    for (int i = 0; i < threads; i++) {
      tasks.add(() -> {
        Void result = null;
        var finished = false;
        final var hash = new byte[Const.SHA512_DIGEST_LENGTH];
        // ダイジェストはOpenSSLに投げる。BouncyCastleの純JavaのRIPEMD-160より約3.9倍速く、
        // 内側ループ全体では2倍以上になる。SHA-512はJDKと互角だが、ここで一緒に計算しないと
        // 中間の64バイトをヒープとネイティブの間で往復させることになるので、まとめて任せる。
        // スレッドごとに完全に独立させる(共有するものは何も無い)。
        try (var arena = Arena.ofConfined()) {
          final var sha512md = EVP_MD_fetch(NULL, arena.allocateFrom("SHA512"), NULL);
          final var ripemd160md = EVP_MD_fetch(NULL, arena.allocateFrom("RIPEMD160"), NULL);
          if (sha512md.equals(NULL) || ripemd160md.equals(NULL)) {
            throw new IllegalStateException(
                "OpenSSLからダイジェストを取得できませんでした。RIPEMD160がlegacyプロバイダに"
                + "移されている環境かもしれません: openssl list -digest-algorithms で確認してください");
          }
          final var ctx = EVP_MD_CTX_new();
          if (ctx.equals(NULL)) {
            throw new IllegalStateException("EVP_MD_CTX_newに失敗しました");
          }
          try {
            // 公開鍵2本ぶんの入力バッファ。ヒープのkeysArrayからここへ写してから渡す
            final var input = arena.allocate(PUBLIC_KEY_LENGTH * 2L);
            final var digest = arena.allocate(Const.SHA512_DIGEST_LENGTH);
            int signOffset;
            int encryptOffset;
            int blocki;
            var index = ThreadLocalRandom.current().nextInt(BOUND);
            long start;
            int blockj;
            for (; ; index = ThreadLocalRandom.current().nextInt(BOUND)) {
              blocki = index >> 24;
              signOffset = (index & 0xffffff) * PUBLIC_KEY_LENGTH;
              start = System.nanoTime();
              MemorySegment.copy(keysArray[blocki], signOffset, input, JAVA_BYTE, 0,
                  PUBLIC_KEY_LENGTH);
              for (blockj = 0; blockj < 2; blockj++) {
                for (encryptOffset = 0; encryptOffset < PUBLIC_KEY_SIZE_PER_FILE;
                    encryptOffset += PUBLIC_KEY_LENGTH) {
                  MemorySegment.copy(keysArray[blockj], encryptOffset, input, JAVA_BYTE,
                      PUBLIC_KEY_LENGTH, PUBLIC_KEY_LENGTH);
                  // 全部1を返したときだけ成功。失敗を見逃すと出力バッファが更新されず、
                  // 前回のripeや零値をそのまま判定してしまう
                  var rc = EVP_DigestInit_ex(ctx, sha512md, NULL);
                  rc &= EVP_DigestUpdate(ctx, input, PUBLIC_KEY_LENGTH * 2L);
                  rc &= EVP_DigestFinal_ex(ctx, digest, NULL);
                  rc &= EVP_DigestInit_ex(ctx, ripemd160md, NULL);
                  rc &= EVP_DigestUpdate(ctx, digest, Const.SHA512_DIGEST_LENGTH);
                  rc &= EVP_DigestFinal_ex(ctx, digest, NULL);
                  if (rc != 1) {
                    throw new IllegalStateException("OpenSSLのダイジェスト計算に失敗しました");
                  }
                  MemorySegment.copy(digest, JAVA_BYTE, 0, hash, 0,
                      Const.RIPEMD160_DIGEST_LENGTH);
                  if (p.test(hash)) {
                    var number = Long.numberOfLeadingZeros((long) LONG_HANDLE.get(hash, 0));
                    logger.info("i found!:{}, {}({})", index,
                        (blockj << 24) | (encryptOffset / 65), number);
                    if (number == 64) {
                      logger.info("シャットダウン要件を達成しました。シャットダウンします");
                      finished = true;
                      break;
                    }
                  }
                }
                if (finished) {
                  break;
                }
              }
              if (finished) {
                break;
              }
              logger.debug("! {}, {}%n", index, (System.nanoTime() - start) / 1e9);
            }
          } finally {
            EVP_MD_CTX_free(ctx);
            EVP_MD_free(ripemd160md);
            EVP_MD_free(sha512md);
          }
        }
        return result;
      });
    }
    return tasks;
  }
}
