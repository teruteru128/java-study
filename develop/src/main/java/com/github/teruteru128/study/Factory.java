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
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.DigestException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.sql.SQLException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Base64;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.random.RandomGenerator;
import java.util.zip.GZIPInputStream;
import javafx.application.Application;
import org.bouncycastle.crypto.ec.CustomNamedCurves;

public class Factory {

  public static final RandomGenerator SECURE_RANDOM_GENERATOR = RandomGenerator.of("SecureRandom");
  public static final int PUBLIC_KEY_LENGTH = Const.PUBLIC_KEY_LENGTH;
  public static final int PUBLIC_KEY_NUM_PER_FILE = 16777216;
  /** PUBLIC_KEY_SIZE_PER_FILE = 1090519040 = 16777216 * 65 */
  public static final int PUBLIC_KEY_SIZE_PER_FILE = 1090519040;

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
        if (args.length < 2) {
          System.err.println("引数が足りませぬぞ");
          return;
        }
        var keys = new byte[PUBLIC_KEY_SIZE_PER_FILE + (PUBLIC_KEY_SIZE_PER_FILE / 2)];
        {
          var keys1 = Files.readAllBytes(Path.of(args[1]));
          System.arraycopy(keys1, 0, keys, 0, PUBLIC_KEY_SIZE_PER_FILE);
        }
        {
          var keys2 = Files.readAllBytes(Path.of(args[1]));
          System.arraycopy(keys2, 0, keys, PUBLIC_KEY_SIZE_PER_FILE, PUBLIC_KEY_SIZE_PER_FILE / 2);
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
      case null, default -> {
        System.err.println("unknown command");
        Runtime.getRuntime().exit(1);
      }
    }
  }

  private static ArrayList<Callable<Void>> getCallables(final byte[] keys, final int threads) {
    final var tasks = new ArrayList<Callable<Void>>();
    for (int i = 0; i < threads; i++) {
      tasks.add(() -> {
        final var sha512 = MessageDigest.getInstance("SHA-512");
        final var ripemd160 = MessageDigest.getInstance("RIPEMD160");
        final var sha512DigestLength = sha512.getDigestLength();
        final var ripemd160DigestLength = ripemd160.getDigestLength();
        final var buffer = ByteBuffer.allocate(sha512DigestLength);
        final var hash = buffer.array();
        final var report_threshold = 45;
        final var exit_threshold = 64;
        int level;
        int offset;
        int encIndex;
        // FIXME 毎回65バイトupdateするのとcloneするのはどっちが早いんだろうか
        final var sIndex = PUBLIC_KEY_NUM_PER_FILE + (PUBLIC_KEY_NUM_PER_FILE / 2);
        int index = ThreadLocalRandom.current().nextInt(sIndex);
        final var MAX = PUBLIC_KEY_SIZE_PER_FILE + (PUBLIC_KEY_SIZE_PER_FILE / 2);
        for (; ; index = ThreadLocalRandom.current().nextInt(sIndex)) {
          offset = index * PUBLIC_KEY_LENGTH;
          for (encIndex = 0; encIndex < MAX; encIndex += PUBLIC_KEY_LENGTH) {
            sha512.update(keys, offset, PUBLIC_KEY_LENGTH);
            sha512.update(keys, encIndex, PUBLIC_KEY_LENGTH);
            sha512.digest(hash, 0, sha512DigestLength);
            ripemd160.update(hash, 0, sha512DigestLength);
            ripemd160.digest(hash, 0, ripemd160DigestLength);
            if (hash[0] == 0 && hash[1] == 0 && hash[2] == 0
                && (level = Long.numberOfLeadingZeros(buffer.getLong(0))) >= report_threshold) {
              System.out.printf("i found!:%d, %d(%d)%n", index, encIndex / 65, level);
              if (level == exit_threshold) {
                return null;
              }
            }
          }
        }
      });
    }
    return tasks;
  }

}
