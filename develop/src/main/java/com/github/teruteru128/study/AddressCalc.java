package com.github.teruteru128.study;

import static com.github.teruteru128.bitmessage.Const.PUBLIC_KEY_LENGTH;

import com.github.teruteru128.bitmessage.Const;
import com.github.teruteru128.bitmessage.spec.AddressFactory;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
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
        AddressFactory.encodeAddress(Arrays.copyOf(hash, 20))).matches()).call();
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
    } catch (ExecutionException | InterruptedException e) {
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
        final var sha512 = MessageDigest.getInstance("SHA-512");
        final var ripemd160 = MessageDigest.getInstance("RIPEMD160");
        final var buffer = ByteBuffer.allocate(Const.SHA512_DIGEST_LENGTH);
        final var hash = buffer.array();
        int signOffset;
        int encryptOffset;
        // FIXME 毎回65バイトupdateするのとcloneするのはどっちが早いんだろうか
        int blocki;
        var index = ThreadLocalRandom.current().nextInt(BOUND);
        long start;
        int blockj;
        for (; ; index = ThreadLocalRandom.current().nextInt(BOUND)) {
          blocki = index >> 24;
          signOffset = (index & 0xffffff) * PUBLIC_KEY_LENGTH;
          start = System.nanoTime();
          for (blockj = 0; blockj < 2; blockj++) {
            for (encryptOffset = 0; encryptOffset < PUBLIC_KEY_SIZE_PER_FILE;
                encryptOffset += PUBLIC_KEY_LENGTH) {
              sha512.update(keysArray[blocki], signOffset, PUBLIC_KEY_LENGTH);
              sha512.update(keysArray[blockj], encryptOffset, PUBLIC_KEY_LENGTH);
              sha512.digest(hash, 0, Const.SHA512_DIGEST_LENGTH);
              ripemd160.update(hash, 0, Const.SHA512_DIGEST_LENGTH);
              ripemd160.digest(hash, 0, Const.RIPEMD160_DIGEST_LENGTH);
              if (p.test(hash)) {
                var number = Long.numberOfLeadingZeros(buffer.getLong(0));
                logger.info("i found!:{}, {}({})", index, (blockj << 24) | (encryptOffset / 65),
                    number);
                if (number == 64) {
                  logger.info("シャットダウン要件を達成しました。シャットダウンします");
                  finished = true;
                  break;
                }
              }
            }
            if (finished)
              break;
          }
          if (finished)
            break;
          logger.debug("! {}, {}%n", index, (System.nanoTime() - start) / 1e9);
        }
        return result;
      });
    }
    return tasks;
  }
}
