package com.github.teruteru128.study;

import static java.lang.Integer.parseInt;

import com.github.teruteru128.bitmessage.Const;
import com.github.teruteru128.bitmessage.app.DeterministicAddressGenerator;
import com.github.teruteru128.bitmessage.app.Spammer;
import com.github.teruteru128.fx.App;
import com.github.teruteru128.sample.awt.TrayIconDemo;
import com.github.teruteru128.sample.clone.CloneSample;
import com.github.teruteru128.sample.dist.LogNormalDistributionSample;
import com.github.teruteru128.sample.dist.LogNormalDistributionSample2;
import com.github.teruteru128.sample.kdf.PBKDF2Sample;
import java.awt.AWTException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.DigestException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.Security;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.sql.SQLException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HexFormat;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.random.RandomGenerator;
import java.util.zip.GZIPInputStream;
import javafx.application.Application;
import org.apache.commons.rng.simple.JDKRandomWrapper;
import org.apache.commons.statistics.distribution.LogNormalDistribution;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Factory {

  public static final RandomGenerator SECURE_RANDOM_GENERATOR = RandomGenerator.of("SecureRandom");
  public static final int PUBLIC_KEY_LENGTH = Const.PUBLIC_KEY_LENGTH;
  public static final int PUBLIC_KEY_NUM_PER_FILE = 16777216;
  public static final int BOUND = PUBLIC_KEY_NUM_PER_FILE * 2;
  /**
   * PUBLIC_KEY_SIZE_PER_FILE = 1090519040 = 16777216 * 65
   */
  public static final int PUBLIC_KEY_SIZE_PER_FILE = 1090519040;
  private static final Logger logger = LoggerFactory.getLogger(Factory.class);

  /**
   * @param args コマンドライン引数
   * @throws IOException                   F
   * @throws InterruptedException          割り込み
   * @throws NoSuchAlgorithmException      アルゴリズム
   * @throws DigestException               ダイジェスト
   * @throws SQLException                  SQL
   * @throws URISyntaxException            URI
   * @throws AWTException                  AWT
   * @throws InvalidParameterSpecException param
   * @throws InvalidKeySpecException       key spec
   * @throws SignatureException            sign
   * @throws InvalidKeyException           key
   */
  static void create(String[] args)
      throws IOException, InterruptedException, NoSuchAlgorithmException, DigestException, SQLException, URISyntaxException, AWTException, InvalidParameterSpecException, InvalidKeySpecException, SignatureException, InvalidKeyException {
    switch (args[0]) {
      case "clone" -> CloneSample.cloneSample();
      case "random" -> Random.doubleSample(RandomGenerator.getDefault());
      case "logNormal" -> new LogNormalDistributionSample().sample();
      case "logNormal2" -> new LogNormalDistributionSample2().sample();
      case "random2" -> Random.random2();
      case "random3" -> Random.random3();
      case "random4" -> Random.random4();
      case "ts1" -> TeamSpeak.ts1();
      case "ts2" -> TeamSpeak.ts2();
      case "ts3" -> TeamSpeak.ts3();
      case "unitSpam" -> {
        if (args.length >= 2) {
          Spammer.unitSpam(Files.readAllLines(Path.of(args[1])), 2500, Duration.ofHours(12),
              args.length >= 3 ? parseInt(args[2]) : 0);
        }
      }
      case "unitSpam2" -> {
        if (args.length >= 2) {
          Spammer.unitSpam2(Files.readAllLines(Path.of(args[1])), 2500,
              args.length >= 3 ? parseInt(args[2]) : 0);
        }
      }
      case "spam" -> new Spam(args[1]).call();
      case "update" -> new Updater(args[1]).call();
      case "hash-base64" -> {
        if (args.length >= 2) {
          System.out.println(Base64.getEncoder().encodeToString(
              MessageDigest.getInstance("SHA-256").digest(Files.readAllBytes(Path.of(args[1])))));
        }
      }
      case "search-tor" -> {
        var min = args.length >= 2 ? parseInt(args[1]) : (4299 + 9473);
        var max = args.length >= 3 ? parseInt(args[2]) : 23000;
        SiteChecker.searchTor(min, max);
      }
      case "check-tor" -> SiteChecker.siteCheck(args[1]);
      case "map" -> System.out.printf("System.mapLibraryName(\"OpenCL\") = %s%n",
          System.mapLibraryName("OpenCL"));
      case "telnet-tor" -> {
        var hostname = args[1];
        var port = parseInt(args[2]);
        Telnet.extracted(hostname, port);
      }
      case "lotto7" -> {
        if (args.length >= 2) {
          Lottery.getLotto7Numbers(parseInt(args[1]));
        } else {
          Lottery.getLotto7Numbers(1);
        }
      }
      case "lotto7-p1" -> {
        if (args.length >= 2) {
          Lottery.pattern1(parseInt(args[1]));
        } else {
          Lottery.pattern1(1);
        }
      }
      case "lotto7-p2" -> {
        if (args.length < 5) {
          System.err.println("引数不足");
          System.exit(1);
        }
        Lottery.pattern2(new int[]{parseInt(args[1]), parseInt(args[2]), parseInt(args[3])},
            parseInt(args[4]));
      }
      case "tray" -> new TrayIconDemo().sample();
      case "zgrep" -> {
        if (args.length < 3) {
          return;
        }
        FileChecker.extracted(Path.of(args[1]), args[2]);
      }
      case "sign" -> SerializeSample.signSample();
      case "fx" -> Application.launch(App.class, args);
      case "pbkdf2" -> PBKDF2Sample.extracted1(args);
      case "pbkdf2-2" -> PBKDF2Sample.extracted2();
      case "list-encodings" -> {
        System.err.printf("native.encoding=%s%n", System.getProperty("native.encoding"));
        System.err.printf("stderr.encoding=%s%n", System.getProperty("stderr.encoding"));
        System.err.printf("stdout.encoding=%s%n", System.getProperty("stdout.encoding"));
        System.err.printf("file.encoding=%s%n", Charset.defaultCharset().displayName());
      }
      case "jpg", "jpeg" -> {
        if (args.length >= 2) {
          var arg = args[1];
          FileChecker.extracted(arg);
        }
      }
      case "b" -> {
        var b = new B();
        b.b(args[1]);
      }
      case "c" -> {
        var m = 'm';
        System.out.printf("%c, %c, %c%n", m, m - 3, m - 6);
      }
      case "f" -> {
        if (args.length < 2) {
          return;
        }
        FileChecker.extracted1(args[1]);
      }
      case "file" -> {
        var n = SECURE_RANDOM_GENERATOR.nextLong(60000000);
        System.err.printf("skipped: %d%n", n);
        Files.readAllLines(Path.of(args[1])).stream().skip(n).limit(Long.parseLong(args[2]))
            .forEach(System.out::println);
      }
      case "p" -> {
        var start = LocalDateTime.now();
        var p = BigInteger.probablePrime(2048, (java.util.Random) SECURE_RANDOM_GENERATOR);
        var finish = LocalDateTime.now();
        System.out.printf("%x%n", p);
        var b = p.isProbablePrime(10);
        System.out.printf("%s%n", b ? "prime" : "not prime");
        System.out.printf("diff: %s%n", Duration.between(start, finish));
      }
      case "p2" -> {
        var n = new byte[30];
        SECURE_RANDOM_GENERATOR.nextBytes(n);
        System.out.println(Base64.getEncoder().encodeToString(n));
      }
      case "ownerCheck" -> {
        if (args.length < 3) {
          return;
        }
        var arg = args[1];
        var targetOwnerName = args[2];
        FileChecker.extracted(arg, targetOwnerName);
      }
      case "de" -> {
        var a = new DeterministicAddressGenerator().apply(args[1]);
        a.addresses().forEach(System.out::println);
        System.out.println(a.signingKey());
        System.out.println(a.encryptingKey());
      }
      case "bomb" -> {
        var d = new byte[1024 * 1024];
        SECURE_RANDOM_GENERATOR.nextBytes(d);
        try (var f = new BufferedOutputStream(
            Files.newOutputStream(Path.of("bomb-" + UUID.randomUUID() + ".txt")))) {
          f.write(Base64.getMimeEncoder().encode(d));
          f.write("\r\n".getBytes());
        }
      }
      case "x" -> {
        var curve = CustomNamedCurves.getByName("curve25519");
        var g = curve.getG();
        System.out.println(g);
      }
      case "gz" -> {
        if (args.length < 2) {
          System.err.println("引数が足りませぬぞ");
          return;
        }
        try (var s = new BufferedReader(new InputStreamReader(new GZIPInputStream(
            new BufferedInputStream(Files.newInputStream(Path.of(args[1])), 1024 * 1024 * 1024))),
            1024 * 1024 * 1024)) {
          System.out.println(s.lines().count());
        }
      }
      case "addressSearch" -> {
        if (args.length < 3) {
          System.err.println("引数が足りませぬぞ");
          return;
        }
        var keys = new byte[2][];
        for (int i = 0; i < 2; i++) {
          keys[i] = Files.readAllBytes(Path.of(args[i + 1]));
        }
        var nThreads = 8;
        try (var service = Executors.newFixedThreadPool(nThreads)) {
          var tasks = getCallables(keys, nThreads);
          service.invokeAny(tasks);
          while (!service.awaitTermination(6, TimeUnit.HOURS)) {
            System.err.println("an hour!");
          }
        } catch (ExecutionException e) {
          throw new RuntimeException(e);
        }
      }
      case "i want to cum1" -> cum1();
      case "i want to cum2" -> cum2((SecureRandom) SECURE_RANDOM_GENERATOR);
      case "providers" -> {
        var map = new TreeMap<>();
        for (var provider : Security.getProviders()) {
          var name = provider.getName();
          for (var entry : provider.entrySet()) {
            map.put(name + "." + entry.getKey(), entry.getValue());
          }
        }
        map.forEach((k, v) -> System.out.println(k + "=" + v));
        System.out.println(((SecureRandom) SECURE_RANDOM_GENERATOR).getAlgorithm());
      }
      case "8192" -> {
        long a = ThreadLocalRandom.current().nextInt(8192);
        System.out.printf("%04x%n", a & 0x1fff);
        while ((a & 0x1fff) != 0x1fff) {
          a = (a << 1) | ThreadLocalRandom.current().nextInt(2);
          System.out.printf("%04x%n", a & 0x1fff);
          if ((a & 0x1fff) == 0) {
            System.out.println("逆1/8192!");
          }
        }
        System.out.println("終わり！");
      }
      case "sum" -> {
        var r = new byte[32];
        SECURE_RANDOM_GENERATOR.nextBytes(r);
        System.out.print(HexFormat.of().formatHex(r));
        System.out.print(":");
        byte sum = 0;
        for (byte b : r) {
          sum ^= b;
        }
        System.out.printf("%02x%n", sum);
      }
      case null, default -> {
        System.err.println("unknown command");
        Runtime.getRuntime().exit(1);
      }
    }
  }

  private static ArrayList<Callable<Void>> getCallables(final byte[][] keysArray,
      final int threads) {
    logger.info("start");
    final var tasks = new ArrayList<Callable<Void>>();
    for (int i = 0; i < threads; i++) {
      tasks.add(() -> {
        final var sha512 = MessageDigest.getInstance("SHA-512");
        final var ripemd160 = MessageDigest.getInstance("RIPEMD160");
        final var buffer = ByteBuffer.allocate(Const.SHA512_DIGEST_LENGTH);
        final var hash = buffer.array();
        int signOffset;
        int encryptOffset;
        // FIXME 毎回65バイトupdateするのとcloneするのはどっちが早いんだろうか
        int blocki;
        int index = ThreadLocalRandom.current().nextInt(BOUND);
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
              if (hash[0] == 0 && hash[1] == 0 && hash[2] == 0 && hash[3] == 0 && hash[4] == 0
                  && (hash[5] & 0xe0) == 0x00) {
                logger.info("i found!:{}, {}({})", index, (blockj << 24) | (encryptOffset / 65),
                    Long.numberOfLeadingZeros(buffer.getLong(0)));
                if (hash[5] == 0 && hash[6] == 0 && hash[7] == 0) {
                  logger.info("シャットダウン要件を達成しました。シャットダウンします");
                  return null;
                }
              }
            }
          }
          logger.debug("! {}, {}%n", index, (System.nanoTime() - start) / 1e9);
        }
      });
    }
    return tasks;
  }

  private static void cum1() throws NoSuchAlgorithmException, DigestException {
    final var bufSize = 1024 * 1024 * 1024;
    final var buf = new byte[bufSize];
    final var msg = "射精したい".getBytes(StandardCharsets.UTF_8);
    final var msgLength = msg.length;
    var i = 0;
    for (; (i + msgLength) < bufSize; i += msgLength) {
      System.arraycopy(msg, 0, buf, i, msgLength);
    }
    System.out.println("msgLength = " + msgLength);
    System.out.println("i = " + i);
    var sha256 = MessageDigest.getInstance("SHA256");
    sha256.update(buf, 0, i);
    var hash = new byte[sha256.getDigestLength()];
    sha256.digest(hash, 0, sha256.getDigestLength());
    System.out.println(HexFormat.of().formatHex(hash));
  }

  private static void cum2(SecureRandom instanceStrong) {
    System.out.println(LogNormalDistribution.of(Math.log(1145141919.0), 1)
        .createSampler(new JDKRandomWrapper(instanceStrong)).sample());
  }
}
