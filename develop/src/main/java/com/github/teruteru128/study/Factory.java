package com.github.teruteru128.study;

import static com.github.teruteru128.gmp.gmp_h.C_CHAR;
import static com.github.teruteru128.gmp.gmp_h.mpz_import;
import static com.github.teruteru128.gmp.gmp_h.mpz_init;
import static com.github.teruteru128.gmp.gmp_h.mpz_sizeinbase;
import static com.github.teruteru128.bitmessage.Const.SEC_P256_K1_G;
import static java.lang.Integer.parseInt;
import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.net.HttpURLConnection.HTTP_NOT_FOUND;
import static java.net.HttpURLConnection.HTTP_OK;
import static java.net.http.HttpRequest.BodyPublishers.ofString;

import com.github.teruteru128.gmp.__mpz_struct;
import com.github.teruteru128.gmp.gmp_h;
import com.github.teruteru128.bitmessage.app.DeterministicAddressGenerator;
import com.github.teruteru128.bitmessage.app.Spammer;
import com.github.teruteru128.bitmessage.genaddress.BMAddressGenerator;
import com.github.teruteru128.bitmessage.genaddress.Response;
import com.github.teruteru128.bitmessage.spec.AddressFactory;
import com.github.teruteru128.bitmessage.spec.KeyPair;
import com.github.teruteru128.encode.Base58;
import com.github.teruteru128.foreign.GMP;
import com.github.teruteru128.fx.App;
import com.github.teruteru128.ncv.xml.Transform;
import java.awt.AWTException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.io.UncheckedIOException;
import java.lang.foreign.Arena;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.AlgorithmParameters;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
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
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.BitSet;
import java.util.HexFormat;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.random.RandomGenerator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.apache.logging.log4j.util.InternalException;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlite.SQLiteDataSource;
import org.sqlite.javax.SQLiteConnectionPoolDataSource;
import org.xml.sax.SAXException;

public class Factory implements Callable<Void> {

  public static final RandomGenerator SECURE_RANDOM_GENERATOR = RandomGenerator.of("SecureRandom");
  public static final HexFormat FORMAT = HexFormat.of();
  private static final ECParameterSpec secp256k1Parameter;
  private static final KeyFactory factory;
  private static final Logger logger = LoggerFactory.getLogger(Factory.class);
  private static final byte[] generalRipe = new byte[20];

  static {
    var tmp = Base58.decode("2cW67GEKkHGonXKZLCzouLLxnLym3azS8r");
    System.arraycopy(tmp, 2, generalRipe, 20 - (tmp.length - 6), tmp.length - 6);
    try {
      final var parameters = AlgorithmParameters.getInstance("EC");
      parameters.init(new ECGenParameterSpec("secp256k1"));
      secp256k1Parameter = parameters.getParameterSpec(ECParameterSpec.class);
      factory = KeyFactory.getInstance("EC");
    } catch (NoSuchAlgorithmException | InvalidParameterSpecException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Callableをnewして返すファクトリにするはずだったんだけどなあ……
   *
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
      throws IOException, InterruptedException, NoSuchAlgorithmException, DigestException, SQLException, URISyntaxException, AWTException, InvalidParameterSpecException, InvalidKeySpecException, SignatureException, InvalidKeyException, NoSuchPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, ClassNotFoundException, ExecutionException, ParserConfigurationException, SAXException, TransformerException {
    switch (args[0]) {
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
      case "spam2" -> {
        var spam2 = new Spam2(args[1]);
        if (args.length >= 3) {
          spam2.setSkip(Long.parseLong(args[2]));
        }
        spam2.call();
      }
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
      case "check-" -> extracted3(args);
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
      case "zgrep" -> {
        if (args.length < 3) {
          return;
        }
        FileChecker.extracted(Path.of(args[1]), args[2]);
      }
      case "sign" -> SerializeSample.signSample();
      case "fx" -> Application.launch(App.class, args);
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
        // バストサイズのカップ数計算
        // Mカップの3つ下と6つ下は何だったかなってアホかな？
        var m = 'm';
        System.out.printf("%c, %c, %c%n", m, m - 3, m - 6);
      }
      case "f" -> {
        if (args.length < 2) {
          return;
        }
        // pathのプリンシパルを確認する
        FileChecker.extracted1(args[1]);
      }
      case "file" -> {
        // javaで(Linuxの)headコマンドを実装しようとした名残
        var n = SECURE_RANDOM_GENERATOR.nextLong(60000000);
        System.err.printf("skipped: %d%n", n);
        Files.readAllLines(Path.of(args[1])).stream().skip(n).limit(Long.parseLong(args[2]))
            .forEach(System.out::println);
      }
      case "p" -> {
        // 素数生成ベンチマーク
        var start = LocalDateTime.now();
        var p = BigInteger.probablePrime(2048, (Random) SECURE_RANDOM_GENERATOR);
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
        FileChecker.extracted3(Path.of(arg), targetOwnerName);
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
      case "bitmessageDecryptTest" -> bitmessageDecryptTest();
      case "D" -> {
        try (var reader = new BufferedReader(new InputStreamReader(new GZIPInputStream(
            new BufferedInputStream(Files.newInputStream(Path.of(args[1])), 0x70000000),
            0x70000000)), 0x70000000)) {
          System.out.println(reader.lines().count() + "件");
        }
      }
      case "sort" -> extracted2(args);
      case "search" -> {
        try (var client = HttpClient.newHttpClient()) {
          System.out.println(client.send(Spammer.requestBuilder.POST(ofString(
                  "{\"jsonrpc\":\"2.0\",\"method\":\"getSentMessageByAckData\", \"params\":[\""
                  + args[1] + "\"], \"id\": 19}")).build(), BodyHandlers.ofString())
              .body());
        }
      }
      case "DB" -> extracted1(args);
      case "DB2" -> extracted4();
      case "eciessample" -> ECIESSample.ecIesSample();
      case "primecheck" -> {
      }
      case "createSmallSieve" -> {
        var bitLength = 2147483645L << 6;
        logger.info("create {}bit small sieve...", bitLength);
        // 小さな既知素数ふるいを作成、もしくは読み込む
        var sieve = PrimeSearch.createSmallSieve(bitLength);
        var primeCount = Arrays.stream(sieve).parallel().map(l -> Long.bitCount(~l)).sum();
        logger.info("{} primes", primeCount);
        var path = Paths.get(bitLength + "bit-small-sieve.obj");
        logger.info("write to {}", path);
        try (var oos = new ObjectOutputStream(new BufferedOutputStream(
            Files.newOutputStream(path, StandardOpenOption.WRITE, StandardOpenOption.CREATE),
            2147483645))) {
          oos.writeLong(bitLength);
          var length = sieve.length;
          if (length == 2147483645) {
            for (long l : sieve) {
              oos.writeLong(l);
            }
          } else {
            oos.writeObject(sieve);
          }
          logger.info("done. 1");
        }
        logger.info("done. 2");
      }
      case "check" -> {
        var sieve = PrimeSearch.loadSmallSieve(Path.of("137438953280bit-small-sieve.obj"));
        var primeCount = Arrays.stream(sieve).parallel().map(l -> Long.bitCount(~l)).sum();
        System.out.printf("%d primes%n", primeCount);
      }
      case "attack" -> {
        if (args.length == 1) {
          PrimeSearch.getConvertedStep();
        } else {
          PrimeSearch.getConvertedStep(parseInt(args[1]));
        }
      }
      case "createLargeSieve" -> new CreateLargeSieveTask(Paths.get(args[1]), args[2],
          Path.of(args.length >= 4 ? args[3] : "8589934592bit-smallsieve.obj"),
          args.length >= 5 ? Path.of(args[4]) : null).call();
      case "diff" -> {
        if (args.length < 3) {
          return;
        }
        var a = GMP.loadLargeSieve(Path.of(args[1]));
        long[] array1 = a.sieve().toLongArray();
        var b = GMP.loadLargeSieve(Path.of(args[2]));
        long[] array2 = b.sieve().toLongArray();
        var minLength = min(array1.length, array2.length);
        var format = HexFormat.of();
        for (int i = 0; i < minLength; i++) {
          if (array1[i] != array2[i]) {
            logger.info("{}, {}, {}, {}", format.toHexDigits(i), format.toHexDigits(~array1[i]),
                format.toHexDigits(~array2[i]), format.toHexDigits(array1[i] ^ array2[i]));
          }
        }
      }
      case "out" -> {
        long[] array1;
        try (var a = new ObjectInputStream(
            new ByteArrayInputStream(Files.readAllBytes(Path.of(args[1]))))) {
          a.readInt();
          array1 = (long[]) a.readObject();
        }
        for (int i = 0; i < array1.length; i++) {
          System.out.printf("%016x", ~array1[i]);
          switch (i % 8) {
            case 7:
              System.out.println();
              break;
            case 3:
              System.out.print("  ");
              break;
            default:
              System.out.print(' ');
              break;
          }
        }
      }
      case "generate" -> {
        if (args.length < 2) {
          return;
        }
        final var bitLength = parseInt(args[1]);
        final var instanceStrong = SecureRandom.getInstanceStrong();
        BigInteger evenNumber;
        final var th = BigInteger.TEN.pow(99999999);
        do {
          evenNumber = new BigInteger(bitLength, instanceStrong).setBit(bitLength - 1).clearBit(0);
        } while (evenNumber.compareTo(th) < 0);
        var path = Path.of("even-number-" + bitLength + "bit-" + UUID.randomUUID() + ".obj");
        PrimeSearch.exportEvenNumberObj(path, evenNumber);
      }
      case "export" -> {
        var p = PrimeSearch.loadEvenNumber(
            Paths.get("even-number-1048576bit-85c53395-9d78-44d2-9c95-9c53ff90f30a.obj"));
        Files.write(Path.of("even-number-1048576bit-85c53395-9d78-44d2-9c95-9c53ff90f30a.txt"),
            List.of(p.toString()), StandardOpenOption.CREATE, StandardOpenOption.WRITE);
      }
      case "temp" -> {
        var path = Path.of(System.getenv("TEMP"));
        var tempDir = Files.createTempDirectory(path, "java-tmp-");
        var tempPath = Files.createTempFile(tempDir, "work", null);
        System.out.println(tempDir);
        System.out.println(tempPath);
        try (var channel = FileChannel.open(tempPath, StandardOpenOption.CREATE,
            StandardOpenOption.WRITE, StandardOpenOption.READ,
            StandardOpenOption.DELETE_ON_CLOSE)) {
          // NONE
          var segment = channel.map(MapMode.READ_WRITE, 0, 1 << 30);
          System.out.println(segment.capacity());
        }
      }
      case "randomDouble" -> {
        long a;
        double b;
        for (int i = 0; i < 10; i++) {
          a = RandomGenerator.getDefault().nextLong() & 0x7fffffffffffffffL;
          b = Double.longBitsToDouble(a);
          System.out.printf("%016x, %a, exp: %d%n", a, b, ((a >> 52) & 0x7ff) - 1023);
        }
      }
      case "createDB" -> {
        var source = new SQLiteConnectionPoolDataSource();
        source.setUrl(args[1]);
        try (var con = source.getConnection()) {
          try (var st = con.createStatement()) {
            st.execute(
                "create table if not exists candidates(id long, step int, composite int, probably_prime int, definitely_prime int, primary key(id, step));");
          }

          try (var prep = con.prepareStatement(
              "insert into candidates(id, step, composite, probably_prime, definitely_prime) values(?, ?, 0, 0, 0);")) {
            prep.setLong(1, 0x32ec7597040b4f0cL);
            BitSet p;
            {
              var largeSieve = GMP.loadLargeSieve2(Path.of(args[2]));
              p = new BitSet(largeSieve.length());
              p.set(0, largeSieve.length());
              p.andNot(largeSieve);
            }
            p.clear(0, args.length >= 4 ? parseInt(args[3]) : 0);
            p.stream().forEach(s -> {
              try {
                prep.setInt(2, s);
                prep.addBatch();
              } catch (SQLException e) {
                throw new RuntimeException(e);
              }
            });
            prep.executeBatch();
          }
        }
      }
      case "sizeInBase" -> {
        var even = PrimeSearch.loadEvenNumber(Path.of(args[1]));
        var auto = Arena.ofAuto();
        var a = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
        mpz_init(a);
        var b = even.toByteArray();
        mpz_import(a, b.length, 1, C_CHAR.byteSize(), 0, 0, auto.allocateFrom(C_CHAR, b));
        var base = args.length < 3 ? 10 : parseInt(args[2]);
        assert base >= 2;
        System.out.println("mpz_sizeinbase(a, 10) = " + mpz_sizeinbase(a, base));
      }
      case "trans" ->
          new Transform(Path.of(args[1]), args.length >= 3 ? Path.of(args[2]) : null).call();
      case "colorFix" -> {
        // RGB color fixer
        // HLS color space
        int p;
        int r;
        int g;
        int b;
        if (args.length == 2) {
          p = parseInt(args[1]);
          r = p >> 16 & 0xff;
          g = p >> 8 & 0xff;
          b = p & 0xff;
        } else if (args.length == 4) {
          r = parseInt(args[1]) & 0xff;
          g = parseInt(args[2]) & 0xff;
          b = parseInt(args[3]) & 0xff;
          p = 0xff000000 | r << 16 | g << 8 | b;
        } else {
          System.err.println("err! args is 2 or 4");
          return;
        }
        System.out.printf("input: R: %d, G: %d, B: %d(%d, %<08x)%n", r, g, b, p);
        var max = max(max(r, g), b);
        var min = min(min(r, g), b);
        // double型で==を使って比較したくなかった
        if (max == min && min >= 192) {
          System.out.println("Achromatic, but vivid enough. Does nothing.");
          return;
        }
        while (max == min) {
          System.err.println("Achromatic!");
          p = SECURE_RANDOM_GENERATOR.nextInt(0x1000000);
          r = p >> 16 & 0xff;
          g = p >> 8 & 0xff;
          b = p & 0xff;
          max = max(max(r, g), b);
          min = min(min(r, g), b);
        }
        var hls = RGBToHLS(new RGBColor(r, g, b));
        var h = hls.h();
        var l = hls.l();
        var s = hls.s();
        System.out.printf("old: Windows: H: %f, L: %f, S: %f%n", h * 40, l * 240, s * 240);
        System.out.printf("old: degrees: H: %f, L: %f, S: %f%n", h * 60, l * 100, s * 100);
        if (s >= 0.75) {
          System.out.println("Vivid enough. Does nothing.");
          return;
        }
        var newL = 0.5;
        var newS = (double) SECURE_RANDOM_GENERATOR.nextInt(192, 256) / 255;
        var newRGB = HLSToRGB(new HLSColor(h, newL, newS));
        System.out.printf("new: R: %d, G: %d, B %d%n", newRGB.r(), newRGB.g(), newRGB.b());
        System.out.printf("new: Windows: H: %f, L: %f, S: %f%n", h * 40, newL * 240, newS * 240);
        System.out.printf("new: degrees: H: %f, L: %f, S: %f%n", h * 60, newL * 100, newS * 100);
        System.out.printf("color=%d, %<08x%n", 0xff000000 | newRGB.r() << 16 | newRGB.g() << 8 | newRGB.b());
      }
      case "newColor" -> {
        var h = MyRandom.nextDouble(SECURE_RANDOM_GENERATOR) * 6;
        var l = 0.5;
        double s;
        if (args.length >= 2 && Boolean.parseBoolean(args[1])) {
          s = 1;
        } else {
          s = (double) SECURE_RANDOM_GENERATOR.nextInt(192, 256) / 255;
        }
        var rgb = HLSToRGB(new HLSColor(h, l, s));
        var r = rgb.r();
        var g = rgb.g();
        var b = rgb.b();
        var v = 0xff000000 | r << 16 | g << 8 | b;
        System.out.printf("%d, %d, %d(%d, %<08x)%n", r, g, b, v);
      }
      case null -> {
        System.err.println("command required");
        Runtime.getRuntime().exit(2);
      }
      default -> {
        System.err.println("unknown command");
        Runtime.getRuntime().exit(1);
      }
    }
  }

  private static RGBColor HLSToRGB(HLSColor HLSColor) {
    var h = HLSColor.h();
    var l = HLSColor.l();
    var s = HLSColor.s();
    var v = (s * (1 - abs(2 * l - 1))) / 2;
    double dMax = l + v;
    double dMin = l - v;
    double dMaxSubMin = dMax - dMin;
    double dr, dg, db;
    switch ((int) h) {
      case 0 -> {
        dr = dMax;
        dg = dMin + dMaxSubMin * h;
        db = dMin;
      }
      case 1 -> {
        dr = dMin + dMaxSubMin * (2 - h);
        dg = dMax;
        db = dMin;
      }
      case 2 -> {
        dr = dMin;
        dg = dMax;
        db = dMin + dMaxSubMin * (h - 2);
      }
      case 3 -> {
        dr = dMin;
        dg = dMin + dMaxSubMin * (4 - h);
        db = dMax;
      }
      case 4 -> {
        dr = dMin + dMaxSubMin * (h - 4);
        dg = dMin;
        db = dMax;
      }
      case 5 -> {
        dr = dMax;
        dg = dMin;
        db = dMin + dMaxSubMin * (6 - h);
      }
      default -> throw new IllegalStateException("Unexpected value: " + (int) h);
    }
    return new RGBColor((int) (dr * 255), (int) (dg * 255), (int) (db * 255));
  }

  private static HLSColor RGBToHLS(RGBColor RGBColor) {
    var dr = (double) RGBColor.r() / 255;
    var dg = (double) RGBColor.g() / 255;
    var db = (double) RGBColor.b() / 255;
    var dMax = max(max(dr, dg), db);
    var dMin = min(min(dr, dg), db);
    var dMaxSubMin = dMax - dMin;
    var dMaxAddMin = dMax + dMin;
    double h;
    if (dMin == db) {
      h = (dg - dr) / dMaxSubMin + 1;
    } else if (dMin == dr) {
      h = (db - dg) / dMaxSubMin + 3;
    } else {
      h = (dr - db) / dMaxSubMin + 5;
    }

    var l = dMaxAddMin / 2;
    // 円柱モデル
    var s = dMaxSubMin / (1 - abs(dMaxAddMin - 1));
    return new HLSColor(h, l, s);
  }

  private static void extracted4() throws SQLException {
    var source = new SQLiteDataSource();
    source.setUrl(Objects.requireNonNull(System.getenv("DB_URL")));
    try (var connect = source.getConnection(); var statement = connect.createStatement(); var resultSet = statement.executeQuery(
        "SELECT address, transmitdata from pubkeys;")) {
      var signKeyAddressMap = new TreeMap<Key, String>();
      var encryptKeyAddressMap = new TreeMap<Key, String>();
      while (resultSet.next()) {
        var address = resultSet.getString("address");
        var transmitData = resultSet.getBytes("transmitdata");
        signKeyAddressMap.put(new Key(Arrays.copyOfRange(transmitData, 6, 70)), address);
        encryptKeyAddressMap.put(new Key(Arrays.copyOfRange(transmitData, 70, 134)), address);
      }
      System.out.println(signKeyAddressMap.size());
      System.out.println(encryptKeyAddressMap.size());
    }
  }

  private static void extracted1(String[] args) throws SQLException {
    var source = new SQLiteDataSource();
    source.setUrl(Objects.requireNonNull(System.getenv("DB_URL")));
    var msgid = getUUIDBytes(new byte[16]);
    var result5 = decodeAddress(args[1]);
    var fromAddress = "BM-NBJxKhQmidR2TBtD3H74yZhDHpzZ7TXM";
    var subject = "";
    var message = "";
    try (var connect = source.getConnection(); var ps = connect.prepareStatement(
        "insert into sent(msgid, toaddress, toripe, fromaddress, subject, message, ackdata, senttime, lastactiontime, sleeptill, status, retrynumber, folder, encodingtype, ttl) "
        + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);")) {
      ps.setBytes(1, msgid);
      ps.setString(2, result5.toAddress());
      ps.setBytes(3, result5.toripe());
      ps.setString(4, fromAddress);
      ps.setString(5, subject);
      ps.setString(6, message);
    }
  }

  private static DecodedAddress decodeAddress(String toAddress) {
    var rawData = Base58.decode(toAddress.startsWith("BM-") ? toAddress.substring(3) : toAddress);
    if (!verifyAddress(rawData)) {
      throw new IllegalArgumentException("checksum failed");
    }
    var toRipe = new byte[20];
    var trimmedRipeLength = rawData.length - 6;
    System.arraycopy(rawData, 2, toRipe, 20 - trimmedRipeLength, trimmedRipeLength);
    return new DecodedAddress(toAddress, toRipe);
  }

  private static boolean verifyAddress(byte[] rawData) {
    var length = rawData.length;
    var checksumLength = length - 4;
    var checksum = Arrays.copyOfRange(rawData, checksumLength, length);
    byte[] hash = doubleSha512(Arrays.copyOf(rawData, checksumLength));
    return MessageDigest.isEqual(Arrays.copyOf(hash, 4), checksum);
  }

  private static byte[] doubleSha512(byte[] rawdata) {
    try {
      var sha512 = MessageDigest.getInstance("SHA-512");
      sha512.update(rawdata, 0, rawdata.length);
      return sha512.digest(sha512.digest());
    } catch (NoSuchAlgorithmException e) {
      throw new InternalException(e);
    }
  }

  private static byte[] getUUIDBytes(byte[] msgid) {
    var buffer = ByteBuffer.wrap(msgid);
    var uuid = UUID.randomUUID();
    buffer.putLong(uuid.getMostSignificantBits());
    buffer.putLong(uuid.getLeastSignificantBits());
    return msgid;
  }

  private static void extracted3(String[] args) throws URISyntaxException, IOException {
    var map = new TreeMap<Integer, String>();
    var path = Path.of(args[1]);
    try (var lines = Files.lines(path)) {
      var pattern = Pattern.compile("<>");
      lines.map(l -> pattern.split(l, 0)).filter(l -> l.length >= 2)
          .forEach(l -> map.put(Integer.valueOf(l[0]), l[1].intern()));
    }
    System.err.println("map size: " + map.size());
    var indexes = IntStream.range(10000, 25960).boxed()
        .collect(Collectors.toCollection(ArrayList<Integer>::new));
    indexes.removeAll(map.keySet());
    System.err.println("indexes size: " + indexes.size());
    int responseCode;
    HttpURLConnection connection = null;
    long start;
    for (var i : indexes) {
      System.err.println("start: " + i);
      start = System.nanoTime();
      var url = new URI(
          "http://jpchv3cnhonxxtzxiami4jojfnq3xvhccob5x3rchrmftrpbjjlh77qd.onion/tor/%d/l50".formatted(
              i)).toURL();
      do {
        try {
          connection = (HttpURLConnection) url.openConnection(SiteChecker.PROXY);
          responseCode = connection.getResponseCode();
          System.err.println(responseCode);
          if (responseCode != HTTP_OK) {
            System.err.println("sleep a little...");
            try {
              Thread.sleep(3000);
            } catch (InterruptedException e) {
              throw new RuntimeException(e);
            }
          }
        } catch (IOException e) {
          e.printStackTrace(System.err);
          responseCode = -1;
        }
      } while (responseCode != HTTP_OK && responseCode != HTTP_NOT_FOUND);
      if (responseCode == HTTP_NOT_FOUND) {
        System.err.println("not found: " + i);
        continue;
      }
      try (var in = new BufferedReader(
          new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8))) {
        var matcher = in.lines().map(SiteChecker.PATTERN_2::matcher).filter(Matcher::find).toList()
            .getFirst();
        var title = matcher.group(1);
        map.put(i, title);
        System.err.write((i + "<>" + title).getBytes(StandardCharsets.UTF_8));
        System.err.println();
      }
      connection.disconnect();
      System.err.println((System.nanoTime() - start) / 1e9 + "秒");
    }
    var lines = map.entrySet().stream().map(e -> e.getKey() + "<>" + e.getValue()).toList();
    Files.write(path, lines, StandardCharsets.UTF_8, StandardOpenOption.WRITE,
        StandardOpenOption.TRUNCATE_EXISTING);
  }

  private static void extracted2(String[] args) throws IOException {
    var lines = (ArrayList<String>) Files.readAllLines(Path.of(args[1]), StandardCharsets.UTF_8);
    int i = 0;
    for (var line : lines) {
      if (line.startsWith("[BM-")) {
        break;
      }
      i++;
    }
    var subLines = lines.subList(i, lines.size());
    var addressPattern = Pattern.compile("\\[(BM-.*)]");
    var labelPattern = Pattern.compile("^label = (.*)$");
    var map = new TreeMap<Label, String>();
    String address = "";
    Label label = new Label("", 0);
    StringBuilder block = new StringBuilder();
    Matcher matcher;

    var str = System.lineSeparator();
    for (var line : subLines) {
      if (line.isEmpty()) {
        var collidedBlock = map.put(label, block.append(str).toString());
        if (collidedBlock != null) {
          System.err.printf("collision!: %s%n", collidedBlock);
        }
        label = new Label("", 0);
        block.setLength(0);
      } else {
        block.append(line).append(str);
        if ((matcher = addressPattern.matcher(line)).matches()) {
          address = matcher.group(1);
        } else if ((matcher = labelPattern.matcher(line)).matches()) {
          var de = Base58.decode(address.replaceAll("^BM-", ""));
          label = new Label(matcher.group(1), de[0] & 0xff);
        }
      }
    }
    try (var writer = Files.newBufferedWriter(Path.of(args[2]), StandardCharsets.UTF_8)) {
      map.forEach((k, v) -> {
        try {
          writer.write(v);
        } catch (IOException e) {
          throw new UncheckedIOException(e);
        }
      });
    }
  }

  /**
   * FIXME ベタ書きを構造化するにはどうしたら良いのか
   *
   * @throws SQLException b
   * @throws NoSuchAlgorithmException c
   * @throws InvalidKeySpecException e
   * @throws InvalidKeyException f
   * @throws NoSuchPaddingException g
   * @throws InvalidAlgorithmParameterException h
   */
  private static void bitmessageDecryptTest()
      throws SQLException, NoSuchAlgorithmException, InvalidKeySpecException, InvalidKeyException, NoSuchPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, SignatureException {
    var source = new SQLiteDataSource();
    source.setUrl(Objects.requireNonNull(System.getenv("DB_URL")));
    var agreement = KeyAgreement.getInstance("ECDH");
    var privateKey = Base58.decode(System.getenv("KEY"));
    var key = factory.generatePrivate(
        new ECPrivateKeySpec(new BigInteger(1, privateKey, 1, 32), secp256k1Parameter));
    long okCount = 0;
    long ngCount = 0;
    long verified = 0;
    var sha512 = MessageDigest.getInstance("SHA-512");
    var mac = Mac.getInstance("HmacSHA256");
    var peek = true;
    var generalCount = 0L;
    try (var connection = source.getConnection(); var statement = connection.createStatement(); var set = statement.executeQuery(
        "select hash, payload from inventory where objecttype = 2;")) {
      // 本来は新しいオブジェクトを受信する度にすべての秘密鍵についてループを回すんだろうな
      while (set.next()) {
        var payload = set.getBytes("payload");
        // オブジェクト解析
        var buffer = ByteBuffer.wrap(payload);
        // nonce
        buffer.getLong();
        // expiresTime
        buffer.getLong();
        // object type
        buffer.getInt();
        // version
        var version = decodeVarInt(buffer);
        // stream Number
        var streamNumber = decodeVarInt(buffer);
        int headerLength = buffer.position() - 8;
        if (buffer.remaining() == 32) {
          // non-stealth message ack data
          continue;
        }
        var ivParameterSpec = getIV(buffer);
        var curveType = buffer.getShort();
        assert curveType == 0x02CA;
        var xLength = buffer.getShort();
        var x = getBytes(new byte[xLength], buffer);
        var yLength = buffer.getShort();
        var y = getBytes(new byte[yLength], buffer);
        // 公開鍵組み立て
        var w = new ECPoint(new BigInteger(1, x), new BigInteger(1, y));
        var publicKey = factory.generatePublic(new ECPublicKeySpec(w, secp256k1Parameter));
        // 宛先特定
        // すべての鍵について、成功するまでループ。すべて失敗なら無視
        // 共有秘密導出
        agreement.init(key);
        agreement.doPhase(publicKey, true);
        var sharedSecret = sha512.digest(agreement.generateSecret());
        // destination verifyメッセージ認証符号を用いて宛先を特定
        mac.init(new SecretKeySpec(sharedSecret, 32, 32, "MAC"));
        mac.update(payload, 22, payload.length - (22 + 32));
        if (MessageDigest.isEqual(mac.doFinal(),
            Arrays.copyOfRange(payload, payload.length - 32, payload.length))) {
          // OK, 宛先特定
          okCount++;
        } else {
          // NG, 宛先不一致
          ngCount++;
          continue;
        }
        // メッセージ復号
        var ciphertextOffset = 44 + xLength + yLength;
        var ciphertextLength = payload.length - (ciphertextOffset + 32);
        var cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(sharedSecret, 0, 32, "AES"),
            ivParameterSpec);
        var plaintext = cipher.doFinal(payload, ciphertextOffset, ciphertextLength);
        var buffer1 = ByteBuffer.wrap(plaintext);
        var fromAddressVersionNumber = decodeVarInt(buffer1);
        var fromStreamNumber = decodeVarInt(buffer1);
        // bitfield
        var fromAddressBitfield = buffer1.getInt();
        var publicSignKey = getBytes(new byte[64], buffer1);
        var publicEncKey = getBytes(new byte[64], buffer1);
        long nonceTrialsPerByte = 0;
        long extraBytes = 0;
        if (3 <= fromAddressVersionNumber) {
          nonceTrialsPerByte = decodeVarInt(buffer1);
          extraBytes = decodeVarInt(buffer1);
        }
        // encryptionKey が同じアドレスの場合、toRipeででしか宛て先を特定できない
        var toRipe = getBytes(new byte[20], buffer1);
        var encodingType = decodeVarInt(buffer1);
        var messageLength = (int) decodeVarInt(buffer1);
        var message = getBytes(new byte[messageLength], buffer1);
        var ackLength = (int) decodeVarInt(buffer1);
        byte[] ackData = null;
        if (ackLength != 0) {
          ackData = getBytes(new byte[ackLength], buffer1);
        }
        var finalPosition = buffer1.position();
        var ecdsa = Signature.getInstance("ECDSA");
        var x1 = new BigInteger(1, publicSignKey, 0, 32);
        var y1 = new BigInteger(1, publicSignKey, 32, 32);
        var keySpec = new ECPublicKeySpec(new ECPoint(x1, y1), secp256k1Parameter);
        var publicKey1 = factory.generatePublic(keySpec);
        ecdsa.initVerify(publicKey1);
        //ecdsa.initVerify(signPublicKey);
        // expires time, object type, version, stream number
        ecdsa.update(payload, 8, headerLength);
        /*
         * address version, stream, bitfield, public sign key, public enc key, nonce_trials_per_byte,
         * extra_bytes, destination ripe, encoding, message length, message, ack_length, ack_data
         */
        ecdsa.update(plaintext, 0, finalPosition);
        int signLength = (int) decodeVarInt(buffer1);
        if (ecdsa.verify(plaintext, buffer1.position(), signLength)) {
          verified++;
        } else {
          if (Arrays.equals(generalRipe, toRipe)) {
            generalCount++;
          }
          if (peek) {
            peek = false;
            ecdsa.initVerify(publicKey1);
            ecdsa.update((byte) 3);
            ecdsa.update(plaintext, 1, finalPosition);
            System.out.println(ecdsa.verify(plaintext, buffer1.position(), signLength));
          }
        }
      }
      System.out.printf("OK: %d(verified: %d), NG: %d%n", okCount, verified, ngCount);
      System.out.println("is general: " + generalCount);
    }
  }

  public static byte[] getBytes(byte[] x, ByteBuffer buffer) {
    buffer.get(x);
    return x;
  }

  private static IvParameterSpec getIV(ByteBuffer buffer) {
    var iv = getBytes(new byte[16], buffer);
    return new IvParameterSpec(iv);
  }

  private static long decodeVarInt(ByteBuffer buffer) {
    var first = buffer.get();
    return switch (first) {
      case (byte) 0xff -> buffer.getLong();
      case (byte) 0xfe -> buffer.getInt() & 0xffffffffL;
      case (byte) 0xfd -> buffer.getShort() & 0xffffL;
      default -> first & 0xffL;
    };
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

  @Override
  public Void call() throws Exception {
    return null;
  }

  /**
   *
   * @param r Red, [0, 255]
   * @param g Green, [0, 255]
   * @param b Blue, [0, 255]
   */
  private record RGBColor(int r, int g, int b) {

    RGBColor {
      if (r < 0 || 255 < r) {
        throw new IllegalArgumentException("");
      }
      if (g < 0 || 255 < g) {
        throw new IllegalArgumentException("");
      }
      if (b < 0 || 255 < b) {
        throw new IllegalArgumentException("");
      }
    }
  }

  private record DecodedAddress(String toAddress, byte[] toripe) {

  }

  private record Key(byte[] key) implements Comparable<Key> {

    @Override
    public String toString() {
      return "Key{key=" + FORMAT.formatHex(key) + '}';
    }

    @Override
    public int compareTo(Key o) {
      return Arrays.compare(this.key, o.key);
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (!(o instanceof Key key1)) {
        return false;
      }

      return Arrays.equals(key, key1.key);
    }

    @Override
    public int hashCode() {
      return Arrays.hashCode(key);
    }
  }

  /**
   *
   * @param h Hue, [0, 6)
   * @param l Lightness, [0, 1]
   * @param s Saturation, [0, 1]
   */
  private record HLSColor(double h, double l, double s) {

    HLSColor {
      if (h < 0 || 6 <= h) {
        throw new IllegalArgumentException("");
      }
      if (l < 0 || 1 < l) {
        throw new IllegalArgumentException("");
      }
      if (s < 0 || 1 < s) {
        throw new IllegalArgumentException("");
      }
    }
  }
}
