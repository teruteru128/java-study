package com.github.teruteru128.study;

import static java.lang.Integer.parseInt;

import com.github.teruteru128.bitmessage.app.Spammer;
import com.github.teruteru128.fx.App;
import com.github.teruteru128.sample.awt.TrayIconDemo;
import com.github.teruteru128.sample.clone.CloneSample;
import com.github.teruteru128.sample.kdf.PBKDF2Sample;
import java.awt.AWTException;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
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
import java.sql.SQLException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Base64;
import java.util.HexFormat;
import java.util.function.Function;
import java.util.random.RandomGenerator;
import javafx.application.Application;

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
        FileChecker.extracted(Path.of(args[1]), args[2]);
      }
      case "sign" -> signSample();
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
        b.b();
      }
      case "c" -> {
        var d = new BigDecimal("1");
        var e = new BigDecimal(args.length >= 2 ? args[1] : "1.15");
        System.out.println(d);
        for (int i = 0; i < 25; i++) {
          d = d.multiply(e);
          System.out.println(d);
        }
      }
      case "f" -> {
        if (args.length < 2) {
          return;
        }
        var path = Path.of(args[1]);
        var owner = Files.getOwner(path);
        System.out.println(owner);
        var service = path.getFileSystem().getUserPrincipalLookupService();
        var p = service.lookupPrincipalByName("DESKTOP-S2SMNNQ\\terut");
        var p2 = service.lookupPrincipalByGroupName("BUILTIN\\Administrators");
        var p3 = service.lookupPrincipalByName("DESKTOP-S2SMNNQ\\Administrator");
      }
      case "p" -> {
        final var p = new BigInteger(90000000, (SecureRandom) SECURE_RANDOM_GENERATOR).setBit(0);
        System.out.printf("%x%n", p);
        var start = LocalDateTime.now();
        var b = p.isProbablePrime(10);
        var finish = LocalDateTime.now();
        System.out.printf("%s%n", b ? "prime" : "not prime");
        System.out.printf("diff: %s%n", Duration.between(start, finish));
      }
      case "ownerCheck" -> {
        if (args.length < 3) {
          return;
        }
        var arg = args[1];
        var targetOwnerName = args[2];
        FileChecker.extracted(arg, targetOwnerName);
      }
      case null, default -> {
        System.err.println("unknown command");
        Runtime.getRuntime().exit(1);
      }
    }
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

}
