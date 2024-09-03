package com.github.teruteru128.study;

import static com.github.teruteru128.bitmessage.Const.SEC_P256_K1_G;
import static java.lang.Integer.parseInt;

import com.github.teruteru128.bitmessage.app.DeterministicAddressGenerator;
import com.github.teruteru128.bitmessage.app.Spammer;
import com.github.teruteru128.bitmessage.genaddress.BMAddressGenerator;
import com.github.teruteru128.bitmessage.genaddress.Response;
import com.github.teruteru128.bitmessage.spec.AddressFactory;
import com.github.teruteru128.bitmessage.spec.KeyPair;
import com.github.teruteru128.encode.Base58;
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
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.AlgorithmParameters;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.sql.SQLException;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.Base64;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import javafx.application.Application;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.sqlite.SQLiteDataSource;

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
      throws IOException, InterruptedException, NoSuchAlgorithmException, DigestException, SQLException, URISyntaxException, AWTException, InvalidParameterSpecException, InvalidKeySpecException, SignatureException, InvalidKeyException, NoSuchPaddingException, NoSuchProviderException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
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
      case "addressSearch" -> new AddressCalc(args,
          hash -> (hash[0] | hash[1] | hash[2] | hash[3] | hash[4] | (hash[5] & 0xf8))
                  == 0x00).call();
      case "addressSearch2" -> {
        var pattern = Pattern.compile(".*twitter.*", Pattern.CASE_INSENSITIVE);
        new AddressCalc(args, hash -> hash[0] == 0 && pattern.matcher(
            AddressFactory.encodeAddress(Arrays.copyOf(hash, 20))).matches()).call();
      }
      case "addressSearch4" -> new AddressCalc4(args[1]).call();
      case "addressSearch5" -> new AddressCalc5(args[1]).call();
      case "addressEncode" -> extracted(args);
      case "bitmessageDecryptTest" -> extracted1(args);
      case "D" -> {
        try (var reader = new BufferedReader(new InputStreamReader(new GZIPInputStream(
            new BufferedInputStream(Files.newInputStream(Path.of(args[1])), 0x70000000),
            0x70000000)), 0x70000000)) {
          System.out.println(reader.lines().count() + "件");
        }
      }
      case "sample" -> {
        var id = ZoneId.of("Asia/Tokyo");
        var start = LocalDateTime.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY))
            .truncatedTo(ChronoUnit.DAYS);
        var rules = id.getRules();
        var startI = start.toInstant(rules.getOffset(start)).getEpochSecond();
        var end = start.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        var endI = end.toInstant(rules.getOffset(end)).getEpochSecond();
        for (int i = 0; i < 10; i++) {
          System.out.println(LocalDateTime.ofInstant(
              Instant.ofEpochSecond(ThreadLocalRandom.current().nextLong(startI, endI)), id));
        }
      }
      case null, default -> {
        System.err.println("unknown command");
        Runtime.getRuntime().exit(1);
      }
    }
  }


  /**
   * FIXME ベタ書きを構造化するにはどうしたら良いのか
   *
   * @param args
   * @throws SQLException
   * @throws NoSuchAlgorithmException
   * @throws InvalidParameterSpecException
   * @throws InvalidKeySpecException
   * @throws InvalidKeyException
   * @throws NoSuchPaddingException
   * @throws InvalidAlgorithmParameterException
   */
  private static void extracted1(String[] args)
      throws SQLException, NoSuchAlgorithmException, InvalidParameterSpecException, InvalidKeySpecException, InvalidKeyException, NoSuchPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, SignatureException {
    var source = new SQLiteDataSource();
    source.setUrl(args[1]);
    var factory = KeyFactory.getInstance("EC");
    final var parameters = AlgorithmParameters.getInstance("EC");
    parameters.init(new ECGenParameterSpec("secp256k1"));
    final var secp256k1Parameter = parameters.getParameterSpec(ECParameterSpec.class);
    KeyAgreement agreement = KeyAgreement.getInstance("ECDH");
    var privateKey = Base58.decode("5HwugVWm31gnxtoYcvcK7oywH2ezYTh6Y4tzRxsndAeMi6NHqpA");
    var key = factory.generatePrivate(
        new ECPrivateKeySpec(new BigInteger(1, privateKey, 1, 32), secp256k1Parameter));
    long[] counts = new long[4];
    var sha512 = MessageDigest.getInstance("SHA-512");
    var mac = Mac.getInstance("HmacSHA256");
    try (var connection = source.getConnection(); var statement = connection.createStatement()) {
      var set = statement.executeQuery("select payload from inventory where objecttype = 2;");
      // 本来は新しいオブジェクトを受信する度にすべての秘密鍵についてループを回すんだろうな
      while (set.next()) {
        byte[] payload = set.getBytes("payload");
        // オブジェクト解析
        ByteBuffer buffer = ByteBuffer.wrap(payload);
        long nonce = buffer.getLong();
        long expiresTime = buffer.getLong();
        int objecttype = buffer.getInt();
        byte version = buffer.get();
        byte streamNumber = buffer.get();
        if (buffer.remaining() == 32) {
          // non stealth message ackdata
          continue;
        }
        var iv = new byte[16];
        buffer.get(iv);
        var ivParameterSpec = new IvParameterSpec(iv);
        var curveType = buffer.getShort();
        //System.out.println(format.formatHex(payload, 0, 50));
        assert curveType == 0x02CA;
        var xLength = buffer.getShort();
        var x = new byte[xLength];
        buffer.get(x);
        var yLength = buffer.getShort();
        var y = new byte[yLength];
        buffer.get(y);
        // 公開鍵組み立て
        var publicKey = factory.generatePublic(
            new ECPublicKeySpec(new ECPoint(new BigInteger(1, x), new BigInteger(1, y)),
                secp256k1Parameter));
        // すべての鍵について、成功するまでループ。すべて失敗なら無視
        // ここ推定ボトルネック
        // 共有秘密導出
        agreement.init(key);
        agreement.doPhase(publicKey, true);
        var hash = sha512.digest(agreement.generateSecret());
        // destination verifyメッセージ認証符号を用いて宛先を特定
        mac.init(new SecretKeySpec(hash, 32, 32, "MAC"));
        mac.update(payload, 22, payload.length - (22 + 32));
        if (MessageDigest.isEqual(mac.doFinal(),
            Arrays.copyOfRange(payload, payload.length - 32, payload.length))) {
          // OK, 宛先特定
          counts[0]++;
        } else {
          // NG, 宛先不一致
          counts[1]++;
          continue;
        }
        // メッセージ復号
        var ciphertextOffset = 44 + xLength + yLength;
        var ciphertextLength = payload.length - (ciphertextOffset + 32);
        var cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(hash, 0, 32, "AES"), ivParameterSpec);
        var plaintext = cipher.doFinal(payload, ciphertextOffset, ciphertextLength);
        var buffer1 = ByteBuffer.wrap(plaintext);
        buffer1.position(161);
        int messageLength = buffer1.get() & 0xff;
        if (messageLength == 0xfe) {
          messageLength = buffer1.getInt();
        } else if (messageLength == 0xfd) {
          messageLength = buffer1.getShort();
        }
        var message = new byte[messageLength];
        buffer1.get(message);
        int ackLength = buffer1.get() & 0xff;
        if (ackLength == 0xfe) {
          ackLength = buffer1.getInt();
        } else if (ackLength == 0xfd) {
          ackLength = buffer1.getShort();
        }
        buffer1.position(buffer1.position() + ackLength);
        int finalPosition = buffer1.position();
        var ecdsa = Signature.getInstance("ECDSA");
        ecdsa.initVerify(factory.generatePublic(new ECPublicKeySpec(
            new ECPoint(new BigInteger(1, plaintext, 6, 32), new BigInteger(1, plaintext, 38, 32)),
            secp256k1Parameter)));
        // expires time, object type, version, stream number
        ecdsa.update(payload, 8, 14);
        /*
         * address version, stream, bitfield, public sign key, public enc key, nonce_trials_per_byte,
         * extra_bytes, destination ripe, encoding, message length, message, ack_length, ack_data
         */
        ecdsa.update(plaintext, 0, finalPosition);
        int signOffset = finalPosition + 1;
        int signLength = buffer1.get() & 0xff;
        if (signLength == 0xfd) {
          signLength = buffer1.getShort() & 0xffff;
          signOffset += 2;
        }
        if (ecdsa.verify(plaintext, signOffset, signLength)) {
          counts[2]++;
        }else{
          counts[3]++;
        }
      }
      System.out.printf("OK: %d(verified: %d, %d, %d), NG: %d%n", counts[0], counts[2], counts[3], counts[2] + counts[3], counts[1]);
    }
  }

  private static void extracted(String[] args) throws IOException, NoSuchAlgorithmException {
    var signKey = new byte[32];
    var encKey = new byte[32];
    try (var file = new RandomAccessFile(args[1], "r")) {
      file.seek(Long.parseLong(args[3]) * 32);
      file.readFully(signKey);
    }
    try (var file = new RandomAccessFile(args[2], "r")) {
      file.seek(Long.parseLong(args[4]) * 32);
      file.readFully(encKey);
    }
    var signPublicKey = SEC_P256_K1_G.multiply(new BigInteger(1, signKey)).getEncoded(false);
    var encryptionPublicKey = SEC_P256_K1_G.multiply(new BigInteger(1, encKey)).getEncoded(false);
    var sha512 = MessageDigest.getInstance("SHA-512");
    var ripemd160 = MessageDigest.getInstance("RIPEMD160");
    sha512.update(signPublicKey);
    sha512.update(encryptionPublicKey);
    System.out.println(BMAddressGenerator.exportAddress(
        new Response(new KeyPair(signKey, signPublicKey), new KeyPair(encKey, encryptionPublicKey),
            ripemd160.digest(sha512.digest()))));
  }
}
