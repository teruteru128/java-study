package com.github.teruteru128.study;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.parseInt;

import com.github.teruteru128.bitmessage.app.Spammer;
import com.github.teruteru128.fx.App;
import com.github.teruteru128.sample.awt.TrayIconDemo;
import com.github.teruteru128.sample.clone.CloneSample;
import com.github.teruteru128.sample.kdf.PBKDF2Sample;
import java.awt.AWTException;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.io.UncheckedIOException;
import java.math.BigInteger;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.security.AlgorithmParameters;
import java.security.DigestException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.SignedObject;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Base64;
import java.util.EnumSet;
import java.util.HexFormat;
import java.util.function.Function;
import java.util.random.RandomGenerator;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import javafx.application.Application;
import javax.crypto.SecretKeyFactory;

public class Factory {

  public static final RandomGenerator SECURE_RANDOM_GENERATOR = RandomGenerator.of("SecureRandom");

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
      case "getPubKeySpam" -> Spammer.getPubKeySpam((SecureRandom) SECURE_RANDOM_GENERATOR,
          args.length >= 2 ? parseInt(args[1]) : 10000);
      case "random" -> Random.doubleSample(RandomGenerator.getDefault());
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
      case "check-tor" -> SiteChecker.siteCheck();
      case "map" -> System.out.println(
          "System.mapLibraryName(\"OpenCL\") = " + System.mapLibraryName("OpenCL"));
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
        if (args.length >= 5) {
          Lottery.pattern2(new int[]{parseInt(args[1]), parseInt(args[2]), parseInt(args[3])},
              parseInt(args[4]));
        } else {
          System.err.println("引数不足");
          System.exit(1);
        }
      }
      case "tray" -> new TrayIconDemo().sample();
      case "zgrep" -> {
        if (args.length < 3) {
          return;
        }
        extracted(Path.of(args[1]), args[2]);
      }
      case "sign" -> signSample();
      case "fx" -> Application.launch(App.class, args);
      case "pbkdf2" -> {
        if (args.length >= 2) {
          byte[] salt;
          if (args.length == 2) {
            salt = new byte[16];
            SECURE_RANDOM_GENERATOR.nextBytes(salt);
          } else {
            salt = HexFormat.of().parseHex(args[2]);
          }
          PBKDF2Sample.getFormatName(args[1].toCharArray(), salt);
        }
      }
      case "pbkdf2-2" -> {
        var factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA3-512");
        System.out.printf("algo: %s(%s)%n", factory.getAlgorithm(), factory.getProvider());
        System.out.println(factory);
      }
      case "list-encodings" -> {
        System.err.printf("native.encoding=%s%n", System.getProperty("native.encoding"));
        System.err.printf("stderr.encoding=%s%n", System.getProperty("stderr.encoding"));
        System.err.printf("stdout.encoding=%s%n", System.getProperty("stdout.encoding"));
        System.err.printf("file.encoding=%s%n", Charset.defaultCharset().displayName());
      }
      case "ssl" -> {
        var factory = KeyFactory.getInstance("Ed25519");
        var p = factory.generatePrivate(
            new PKCS8EncodedKeySpec(Files.readAllBytes(Path.of(args[1]))));
        System.out.println(HexFormat.of().formatHex(p.getEncoded()));
      }
      case "nbt" -> {
        var b = HexFormat.of().parseHex(System.getenv("TXT"));
        try (var in = new GZIPInputStream(new ByteArrayInputStream(b))) {
          var d = in.readAllBytes();
          System.out.println(HexFormat.of().formatHex(d));
        }
      }
      case "2038" -> {
        var e = Instant.ofEpochSecond(2147483647L);
        var t = OffsetDateTime.ofInstant(e, ZoneId.systemDefault());
        var d = Period.between(LocalDate.now(), t.toLocalDate());
        System.out.println(d.getDays());
      }
      case "r" -> {
        var builder = new StringBuilder(":".repeat(20));
        var rate = 20;
        builder.insert(rate, 'A');
        System.out.println(builder);
      }
      case "round" -> {
        var f = new DecimalFormat("0.0#");
        System.out.println(f.format(0.2041446));
      }
      case null, default -> {
        System.err.println("unknown command");
        Runtime.getRuntime().exit(1);
      }
    }
  }

  private static void extracted(Path p, String patternArg) throws IOException {
    var pattern = Pattern.compile(patternArg);
    var options = EnumSet.noneOf(FileVisitOption.class);
    var visitor = new PathSimpleFileVisitor(pattern);
    Files.walkFileTree(p, options, MAX_VALUE, visitor);
  }

  static void signSample()
      throws NoSuchAlgorithmException, InvalidParameterSpecException, InvalidKeySpecException, IOException, InvalidKeyException, SignatureException {
    // 処理をシリアライズするなら普通にクラスをシリアライズしろってなｗ
    AlgorithmParameters parameters = AlgorithmParameters.getInstance("EC");
    parameters.init(new ECGenParameterSpec("secp256k1"));
    var params = parameters.getParameterSpec(ECParameterSpec.class);
    var factory = KeyFactory.getInstance("ECDSA");

    var hexFormat = HexFormat.of();
    var sign = Signature.getInstance("ECDSA");
    var signObject = new SignedObject(
        (Function<String, String> & Serializable) i -> i.repeat(3) + "って？",
        factory.generatePrivate(new ECPrivateKeySpec(new BigInteger(1,
            hexFormat.parseHex("2071778BC323CE82095CB4D26C8B62F94DB4748CE5A9F61C6D2DDFFADE2BB446")),
            params)), sign);
    if (signObject.verify(factory.generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1,
            hexFormat.parseHex("F166D9114137A496AE1BEDE6B6CA6EAB19B84D34984897183B7426650C33ED8A")),
            new BigInteger(1,
                hexFormat.parseHex(
                    "A8E145E1A671C4C4D40EDA5CF858273798E5746EB277A568C1B710ABB440E46F"))), params)),
        sign)) {
      System.out.println("check ok");
    } else {
      System.out.println("check ng");
    }
  }

  private static class PathSimpleFileVisitor extends SimpleFileVisitor<Path> {

    private final Pattern pattern;

    public PathSimpleFileVisitor(Pattern pattern) {
      this.pattern = pattern;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
      var fileName = file.getFileName().toString();
      if (fileName.endsWith(".gz")) {
        try (var s = new BufferedReader(new InputStreamReader(
            new GZIPInputStream(Files.newInputStream(file, StandardOpenOption.READ)),
            StandardCharsets.UTF_8))) {
          s.lines().filter(l -> pattern.matcher(l).find()).forEach(System.out::println);
        } catch (UncheckedIOException e) {
          System.err.println("ERROR: " + file);
          return FileVisitResult.CONTINUE;
        }
      }
      return FileVisitResult.CONTINUE;
    }
  }
}
