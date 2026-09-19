package com.github.teruteru128.study;

import static com.github.teruteru128.bitmessage.Const.PUBLIC_KEY_LENGTH;

import com.github.teruteru128.bitmessage.Const;
import com.github.teruteru128.bitmessage.spec.AddressFactory;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
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
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

/**
 * マルチスレッド版。
 * <p>
 * 2つの公開鍵ファイルを取り、署名用公開鍵を片方からランダムに選んで、
 * <strong>両方のファイルの全鍵</strong>と総当たりする(A×AとA×Bの両方)。
 * 1ファイルあたり16,777,216鍵なので、1本の署名鍵につき33,554,432通りを試すことになる。
 * <p>
 * ファイルを2つともヒープに読み込むため約2.1GB必要。もっと軽い縮小版が要るなら
 * {@link AddressCalc5}が1024鍵ずつしか読まない。
 */
@Command(name = "addressSearch2")
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
  /**
   * 既定の判定。アドレスに"twitter"を含むものを探す。
   * ripeの先頭が0でないものは即座に捨てるので、アドレス生成は256回に1回しか走らない。
   */
  private static final Predicate<byte[]> DEFAULT_PREDICATE =
      ripe -> ripe[0] == 0 && pattern.matcher(AddressFactory.encodeAddress(ripe, 0, 20)).matches();

  /**
   * 既定の並列数。このワークロード(SHA-512とRIPEMD-160)は実行ポートを埋めきるので、
   * SMTの論理コアまで使っても速くならない。実測では8スレッド(物理コア数)で
   * 5,657,558件/秒・効率91.5%、16スレッドにしても5,677,596件/秒で頭打ちだった。
   * そのため論理コア数の半分、つまりおおよその物理コア数を既定とする。
   */
  private static final int DEFAULT_THREADS = Math.max(1,
      Runtime.getRuntime().availableProcessors() / 2);

  @Parameters(index = "0", description = "公開鍵ファイル1")
  private Path file0;
  @Parameters(index = "1", description = "公開鍵ファイル2")
  private Path file1;
  @Option(names = {"-t", "--threads"}, description = {
      "並列数 (既定: ${DEFAULT-VALUE} = このマシンのおおよその物理コア数)。",
      "物理コア数を超えても速くならないので、他の探索と併走させるときに絞る用途で使う。"})
  private int threads = DEFAULT_THREADS;

  private final Predicate<byte[]> predicate;

  /**
   * picocliから生成されるためのコンストラクタ。
   */
  public AddressCalc() {
    this.predicate = DEFAULT_PREDICATE;
  }

  public AddressCalc(Path file0, Path file1, Predicate<byte[]> predicate) {
    this(file0, file1, predicate, DEFAULT_THREADS);
  }

  public AddressCalc(Path file0, Path file1, Predicate<byte[]> predicate, int threads) {
    this.file0 = file0;
    this.file1 = file1;
    this.predicate = predicate;
    this.threads = threads;
  }

  public static void loadPublicKey(byte[] keys, Path file, int index) throws IOException {
    try (var raf = new RandomAccessFile(file.toFile(), "r")) {
      raf.seek(index * 65L);
      raf.readFully(keys);
    }
  }

  @Override
  public Void call() throws IOException {
    if (threads < 1) {
      throw new IllegalArgumentException("並列数が1未満です: " + threads);
    }
    var keys = new byte[][]{Files.readAllBytes(file0), Files.readAllBytes(file1)};
    logger.info("{}スレッドで探索します", threads);
    try (var service = Executors.newFixedThreadPool(threads)) {
      var tasks = getCallables(keys, threads, predicate);
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
        final var ripe = new byte[Const.SHA512_DIGEST_LENGTH];
        // ダイジェストはOpenSSLに任せる。スレッドごとに1つ持つ(共有不可)
        try (var calculator = new RipeCalculator()) {
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
            // 署名鍵はindexが変わらない限り同じなので、内側ループの外で設定する
            calculator.setSignKey(keysArray[blocki], signOffset);
            for (blockj = 0; blockj < 2; blockj++) {
              for (encryptOffset = 0; encryptOffset < PUBLIC_KEY_SIZE_PER_FILE;
                  encryptOffset += PUBLIC_KEY_LENGTH) {
                calculator.calcRipe(keysArray[blockj], encryptOffset, ripe);
                if (p.test(ripe)) {
                  var number = Long.numberOfLeadingZeros((long) LONG_HANDLE.get(ripe, 0));
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
        }
        return result;
      });
    }
    return tasks;
  }
}
