package com.github.teruteru128.study;

import static com.github.teruteru128.bitmessage.Const.SEC_P256_K1_G;
import static com.github.teruteru128.gmp.gmp_h.C_CHAR;
import static com.github.teruteru128.gmp.gmp_h.mpz_get_str;
import static com.github.teruteru128.gmp.gmp_h.mpz_import;
import static com.github.teruteru128.gmp.gmp_h.mpz_init;
import static com.github.teruteru128.gmp.gmp_h.mpz_init2;
import static com.github.teruteru128.gmp.gmp_h.mpz_nextprime;
import static com.github.teruteru128.gmp.gmp_h.mpz_sizeinbase;
import static java.lang.Integer.parseInt;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.foreign.ValueLayout.JAVA_BYTE;
import static java.net.HttpURLConnection.HTTP_NOT_FOUND;
import static java.net.HttpURLConnection.HTTP_OK;
import static java.net.http.HttpRequest.BodyPublishers.ofString;

import com.github.teruteru128.bitmessage.app.DeterministicAddressGenerator;
import com.github.teruteru128.bitmessage.app.Spammer;
import com.github.teruteru128.bitmessage.genaddress.BMAddressGenerator;
import com.github.teruteru128.bitmessage.genaddress.Response;
import com.github.teruteru128.bitmessage.spec.AddressFactory;
import com.github.teruteru128.bitmessage.spec.KeyPair;
import com.github.teruteru128.color.ColorConverter;
import com.github.teruteru128.color.HLSColor;
import com.github.teruteru128.color.RGBColor;
import com.github.teruteru128.encode.Base58;
import com.github.teruteru128.foreign.converters.PathConverter;
import com.github.teruteru128.foreign.prime.search.PrimeSearch;
import com.github.teruteru128.fx.App;
import com.github.teruteru128.gmp.__mpz_struct;
import com.github.teruteru128.gmp.gmp_h;
import com.github.teruteru128.ncv.xml.ListUp;
import com.github.teruteru128.ncv.xml.Transform;
import com.github.teruteru128.semen.CumShoot;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.io.UncheckedIOException;
import java.lang.foreign.Arena;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
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
import org.apache.logging.log4j.util.InternalException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlite.SQLiteDataSource;
import org.sqlite.javax.SQLiteConnectionPoolDataSource;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(subcommands = {AddressCalc4.class, AddressCalc5.class, CreateLargeSieveTask.class,
    ECIESSample.class, FileChecker.class, com.github.teruteru128.study.PrimeSearch.class,
    SiteChecker.class, Spam.class, TeamSpeak.class, Updater.class, CommandLine.HelpCommand.class,
    ListUp.class, Transform.class, CumShoot.class, SlimeSearch.class})
public class Factory implements Callable<Integer> {

  public static final RandomGenerator SECURE_RANDOM_GENERATOR = RandomGenerator.of("SecureRandom");
  public static final HexFormat FORMAT = HexFormat.of();
  public static final BigInteger BASE = BigInteger.ONE.shiftLeft(48);
  private static final ECParameterSpec secp256k1Parameter;
  private static final KeyFactory factory;
  private static final Logger logger = LoggerFactory.getLogger(Factory.class);
  private static final Pattern pattern11 = Pattern.compile("\\d{11}");
  private static final Pattern pattern12 = Pattern.compile("\\d{12}");

  static {
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
   */
  static Callable<Integer> create() {
    return new Factory();
  }

  @Command(name = "countKnownPrimeNumbersFromSmallSieve")
  private static void countKnownPrimeNumbersFromSmallSieve()
      throws IOException, ClassNotFoundException {
    var sieve = com.github.teruteru128.study.PrimeSearch.loadSmallSieve(
        Path.of("137438953280bit-small-sieve.obj"));
    var primeCount = Arrays.stream(sieve).parallel().map(l -> Long.bitCount(~l)).sum();
    System.out.printf("%d primes%n", primeCount);
  }

  @Command(name = "diffLargeSieves")
  private static void diffLargeSieves(Path inPath1, Path inPath2)
      throws IOException, ClassNotFoundException {
    var a = PrimeSearch.loadLargeSieve(inPath1);
    long[] array1 = a.sieve().toLongArray();
    var b = PrimeSearch.loadLargeSieve(inPath2);
    long[] array2 = b.sieve().toLongArray();
    var minLength = min(array1.length, array2.length);
    for (int i = 0; i < minLength; i++) {
      if (array1[i] != array2[i]) {
        System.err.printf("%016x: %016x, %016x, %016x%n", i, ~array1[i], ~array2[i],
            array1[i] ^ array2[i]);
      }
    }
  }

  @Command(name = "generateNewColor")
  private static void generateNewColor(@Option(names = {"--fix-saturation-to-1",
      "-S"}, defaultValue = "false") boolean fixSaturationTo1) {
    var h = MyRandom.nextDouble(SECURE_RANDOM_GENERATOR) * 6;
    var l = 0.5;
    double s;
    if (fixSaturationTo1) {
      s = 1;
    } else {
      s = (double) SECURE_RANDOM_GENERATOR.nextInt(192, 256) / 255;
    }
    var rgb = ColorConverter.HLSToRGB(new HLSColor(h, l, s));
    var r = rgb.r();
    var g = rgb.g();
    var b = rgb.b();
    var v = 0xff000000 | r << 16 | g << 8 | b;
    System.out.printf("%d, %d, %d(%d, %<08x)%n", r, g, b, v);
  }

  @Command(name = "fixColor")
  private static void fixColor(int[] color) {
    // RGB color fixer
    // HLS color space
    int p;
    int r;
    int g;
    int b;
    if (color.length == 1) {
      p = color[0];
      r = p >> 16 & 0xff;
      g = p >> 8 & 0xff;
      b = p & 0xff;
    } else if (color.length == 4) {
      r = color[0] & 0xff;
      g = color[1] & 0xff;
      b = color[2] & 0xff;
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
    var hls = ColorConverter.RGBToHLS(new RGBColor(r, g, b));
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
    var newRGB = ColorConverter.HLSToRGB(new HLSColor(h, newL, newS));
    System.out.printf("new: R: %d, G: %d, B %d%n", newRGB.r(), newRGB.g(), newRGB.b());
    System.out.printf("new: Windows: H: %f, L: %f, S: %f%n", h * 40, newL * 240, newS * 240);
    System.out.printf("new: degrees: H: %f, L: %f, S: %f%n", h * 60, newL * 100, newS * 100);
    System.out.printf("color=%d, %<08x%n",
        0xff000000 | newRGB.r() << 16 | newRGB.g() << 8 | newRGB.b());
  }

  @Command(name = "sizeInBase")
  private static void sizeInBase(Path path, int base) throws IOException, ClassNotFoundException {
    var even = com.github.teruteru128.study.PrimeSearch.loadEvenNumber(path);
    var auto = Arena.ofAuto();
    var a = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(a);
    var b = even.toByteArray();
    mpz_import(a, b.length, 1, C_CHAR.byteSize(), 0, 0, auto.allocateFrom(C_CHAR, b));
    assert base >= 2;
    System.out.println("mpz_sizeinbase(a, 10) = " + mpz_sizeinbase(a, base));
  }

  /**
   * Create a database of prime number candidates
   * @param args
   * @throws SQLException
   * @throws IOException
   * @throws ClassNotFoundException
   */
  @Command(name = "createPrimeNumberCandidateDB")
  private static void createPrimeNumberCandidateDB(String[] args)
      throws SQLException, IOException, ClassNotFoundException {
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
          var largeSieve = PrimeSearch.loadLargeSieve2(Path.of(args[2]));
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

  /**
   * doubleを指数部も含めて乱数で生成するテスト
   */
  @Command(name = "randomExpDoubleTest")
  private static void randomExpDoubleTest() {
    long a;
    double b;
    for (int i = 0; i < 10; i++) {
      a = RandomGenerator.getDefault().nextLong() & 0x7fffffffffffffffL;
      b = Double.longBitsToDouble(a);
      System.out.printf("%016x, %a, exp: %d%n", a, b, ((a >> 52) & 0x7ff) - 1023);
    }
  }

  @Command(name = "temporaryDirectoriesAndFilesSample")
  private static void temporaryDirectoriesAndFilesSample() throws IOException {
    var path = Path.of(System.getenv("TEMP"));
    var tempDir = Files.createTempDirectory(path, "java-tmp-");
    var tempPath = Files.createTempFile(tempDir, "work", null);
    System.out.println(tempDir);
    System.out.println(tempPath);
    try (var channel = FileChannel.open(tempPath, StandardOpenOption.CREATE,
        StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.DELETE_ON_CLOSE)) {
      // NONE
      var segment = channel.map(MapMode.READ_WRITE, 0, 1 << 30);
      System.out.println(segment.capacity());
    }
  }

  @Command(name = "exportBigIntegerAsDecimalText")
  private static void exportBigIntegerAsDecimalText(Path inPath, Path outPath)
      throws IOException, ClassNotFoundException {
    var p = com.github.teruteru128.study.PrimeSearch.loadEvenNumber(inPath);
    Files.write(outPath, List.of(p.toString()), StandardOpenOption.CREATE,
        StandardOpenOption.WRITE);
  }

  @Command(name = "generateLargeEvenNumber")
  private static void generateLargeEven(int bitLength)
      throws NoSuchAlgorithmException, IOException {
    final var instanceStrong = SecureRandom.getInstanceStrong();
    BigInteger evenNumber;
    final var th = BigInteger.TEN.pow(99999999);
    do {
      evenNumber = new BigInteger(bitLength, instanceStrong).setBit(bitLength - 1).clearBit(0);
    } while (evenNumber.compareTo(th) < 0);
    var path = Path.of("even-number-" + bitLength + "bit-" + UUID.randomUUID() + ".obj");
    com.github.teruteru128.study.PrimeSearch.exportEvenNumberObj(path, evenNumber);
  }

  /**
   * [int,long[]]形式のオブジェクト出力をフォーマットする。
   * @param args
   * @throws IOException
   * @throws ClassNotFoundException
   */
  @Command(name = "formatSieve", description = "[int,long[]]形式のオブジェクト出力をフォーマットする。")
  private static void formatSieve(String[] args) throws IOException, ClassNotFoundException {
    long[] array1;
    try (var a = new ObjectInputStream(
        new ByteArrayInputStream(Files.readAllBytes(Path.of(args[1]))))) {
      a.readInt();
      Object obj = a.readObject();
      if (obj instanceof long[]) {
        array1 = (long[]) obj;
      } else {
        throw new ClassCastException(
            "only supported for long[], not supported object type: " + obj.getClass().getName());
      }
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

  @Command(name = "createSmallSieve", description = "既知素数リストを作成する")
  private static void createSmallSieve(
      @Parameters(description = "素数リストのビット長。(0x7ffffffdL << 6)ビットまで。") long bitLength)
      throws IOException {
    logger.info("create {}bit small sieve...", bitLength);
    // 小さな既知素数ふるいを作成、もしくは読み込む
    var sieve = com.github.teruteru128.study.PrimeSearch.createSmallSieve(bitLength);
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

  @Command(name = "getSentMessageByAckData")
  private static void getSentMessageByAckData(String[] args)
      throws IOException, InterruptedException {
    try (var client = HttpClient.newHttpClient()) {
      System.out.println(client.send(Spammer.requestBuilder.POST(ofString(
          "{\"jsonrpc\":\"2.0\",\"method\":\"getSentMessageByAckData\", \"params\":[\"" + args[1]
          + "\"], \"id\": 19}")).build(), BodyHandlers.ofString()).body());
    }
  }

  @Command(name = "D")
  private static void D(String[] args) throws IOException {
    try (var reader = new BufferedReader(new InputStreamReader(new GZIPInputStream(
        new BufferedInputStream(Files.newInputStream(Path.of(args[1])), 0x70000000), 0x70000000)),
        0x70000000)) {
      System.out.println(reader.lines().count() + "件");
    }
  }

  @Command(name = "addressSearch2")
  private static void addressSearch2(String[] args) throws IOException {
    var pattern = Pattern.compile(".*twitter.*", Pattern.CASE_INSENSITIVE);
    new AddressCalc(args, hash -> hash[0] == 0 && pattern.matcher(
        AddressFactory.encodeAddress(Arrays.copyOf(hash, 20))).matches()).call();
  }

  @Command(name = "addressSearch")
  private static Void getCall(String[] args) throws IOException {
    return new AddressCalc(args,
        hash -> (hash[0] | hash[1] | hash[2] | hash[3] | hash[4] | (hash[5] & 0xf8))
                == 0x00).call();
  }

  @Command(name = "gz")
  private static void gz(@Parameters(converter = PathConverter.class) Path path)
      throws IOException {
    try (var s = new BufferedReader(new InputStreamReader(new GZIPInputStream(
        new BufferedInputStream(Files.newInputStream(path), 1024 * 1024 * 1024))),
        1024 * 1024 * 1024)) {
      System.out.println(s.lines().count());
    }
  }

  @Command(name = "curve25519")
  private static void curve25519()
      throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    var clazz = Class.forName("org.bouncycastle.crypto.ec.CustomNamedCurves");
    var method = clazz.getMethod("getByName", String.class);
    var curve = method.invoke(null, "curve25519");
    var x9Clazz = Class.forName("org.bouncycastle.asn1.x9.X9ECParameters");
    var getGMethod = x9Clazz.getMethod("getG");
    var g = getGMethod.invoke(curve);
    System.out.println(g);
  }

  @Command(name = "bomb", description = "zip bomb base generator")
  private static void bomb() throws IOException {
    var d = new byte[1024 * 1024];
    SECURE_RANDOM_GENERATOR.nextBytes(d);
    try (var f = new BufferedOutputStream(
        Files.newOutputStream(Path.of("bomb-" + UUID.randomUUID() + ".txt")))) {
      f.write(Base64.getMimeEncoder().encode(d));
      f.write("\r\n".getBytes());
    }
  }

  @Command(name = "de")
  private static void de(String[] args) {
    var a = new DeterministicAddressGenerator().apply(args[1]);
    a.addresses().forEach(System.out::println);
    System.out.println(a.signingKey());
    System.out.println(a.encryptingKey());
  }

  @Command(name = "ownerCheck")
  private static void ownerCheck(@Parameters(converter = PathConverter.class) Path arg,
      @Parameters String targetOwnerName) throws IOException {
    FileChecker.extracted3(arg, targetOwnerName);
  }

  @Command(name = "list-encodings")
  private static void listEncodings() {
    System.err.printf("native.encoding=%s%n", System.getProperty("native.encoding"));
    System.err.printf("stderr.encoding=%s%n", System.getProperty("stderr.encoding"));
    System.err.printf("stdout.encoding=%s%n", System.getProperty("stdout.encoding"));
    System.err.printf("file.encoding=%s%n", Charset.defaultCharset().displayName());
  }

  @Command(name = "p2", description = "30バイトの乱数を生成し、Base64に変換して出力する。何に使うんでしたっけ……？")
  private static void p2() {
    var n = new byte[30];
    SECURE_RANDOM_GENERATOR.nextBytes(n);
    var encoder = Base64.getEncoder();
    var encode = encoder.encode(n);
    System.out.write(encode, 0, encode.length);
    System.out.println();
  }

  @Command(name = "prime1")
  private static void prime1() {
    // 素数生成ベンチマーク
    // TODO 10秒以内に素数を生成できる限界のビット数を探索する
    var start = LocalDateTime.now();
    var p = BigInteger.probablePrime(2048, (Random) SECURE_RANDOM_GENERATOR);
    var finish = LocalDateTime.now();
    System.out.printf("%x%n", p);
    var b = p.isProbablePrime(10);
    System.out.printf("%s%n", b ? "prime" : "not prime");
    System.out.printf("diff: %s%n", Duration.between(start, finish));
  }

  @Command(name = "f", aliases = {"head"})
  private static void file(String[] args) throws IOException {
    // javaで(Linuxの)headコマンドを実装しようとした名残
    var n = SECURE_RANDOM_GENERATOR.nextLong(60000000);
    System.err.printf("skipped: %d%n", n);
    Files.readAllLines(Path.of(args[1])).stream().skip(n).limit(Long.parseLong(args[2]))
        .forEach(System.out::println);
  }

  @Command(name = "calcBustSize")
  private static void calcBustSize() {
    // バストサイズのカップ数計算
    // Mカップの3つ下と6つ下は何だったかなってアホかな？
    var m = 'm';
    System.out.printf("%c, %c, %c%n", m, m - 3, m - 6);
  }

  @Command(name = "jpeg", aliases = {" jpg "})
  private static void jpeg(String[] args) throws IOException {
    if (args.length >= 2) {
      var arg = args[1];
      FileChecker.extracted(arg);
    }
  }

  @Command(name = "fx")
  private static void getLaunch(String[] args) {
    Application.launch(App.class, args);
  }

  @Command(name = "lotto7-p2")
  private static void lotto7p2(String[] args) {
    if (args.length < 5) {
      System.err.println("引数不足");
      System.exit(1);
    }
    Lottery.pattern2(new int[]{parseInt(args[1]), parseInt(args[2]), parseInt(args[3])},
        parseInt(args[4]));
  }

  @Command(name = "lotto7-p1")
  private static void lotto7p1(String[] args) {
    if (args.length >= 2) {
      Lottery.pattern1(parseInt(args[1]));
    } else {
      Lottery.pattern1(1);
    }
  }

  @Command(name = "lotto7")
  private static void lotto7(String[] args) {
    if (args.length >= 2) {
      Lottery.getLotto7Numbers(parseInt(args[1]));
    } else {
      Lottery.getLotto7Numbers(1);
    }
  }

  @Command(name = "telnet-tor")
  private static void telnetTor(String[] args) throws IOException, InterruptedException {
    var hostname = args[1];
    var port = parseInt(args[2]);
    Telnet.extracted(hostname, port);
  }

  @Command(name = "map")
  private static PrintStream getOpenCL() {
    return System.out.printf("System.mapLibraryName(\"OpenCL\") = %s%n",
        System.mapLibraryName("OpenCL"));
  }

  @Command(name = "hash-base64")
  private static void hashBase64(String[] args) throws NoSuchAlgorithmException, IOException {
    if (args.length >= 2) {
      System.out.println(Base64.getEncoder().encodeToString(
          MessageDigest.getInstance("SHA-256").digest(Files.readAllBytes(Path.of(args[1])))));
    }
  }

  @Command(name = "spam2")
  private static void spam2(String[] args) throws IOException, InterruptedException {
    var spam2 = new Spam2(args[1]);
    if (args.length >= 3) {
      spam2.setSkip(Long.parseLong(args[2]));
    }
    spam2.call();
  }

  @Command(name = "unitSpam2")
  private static void unitSpam2(String[] args) throws SQLException, IOException {
    if (args.length >= 2) {
      Spammer.unitSpam2(Files.readAllLines(Path.of(args[1])), 2500,
          args.length >= 3 ? parseInt(args[2]) : 0);
    }
  }

  @Command(name = "unitSpam")
  private static void unitSpam(String[] args) throws IOException, InterruptedException {
    if (args.length >= 2) {
      Spammer.unitSpam(Files.readAllLines(Path.of(args[1])), 2500, Duration.ofHours(12),
          args.length >= 3 ? parseInt(args[2]) : 0);
    }
  }

  @Command(name = "db2")
  private static void db2() throws SQLException {
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

  @Command(name = "DB1")
  private static void db1(String[] args) throws SQLException {
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

  @Command(name = "check-")
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

  @Command(name = "sort")
  private static void extracted2(@Parameters(converter = PathConverter.class) Path inPath,
      @Parameters(converter = PathConverter.class) Path outPath) throws IOException {
    var lines = (ArrayList<String>) Files.readAllLines(inPath, StandardCharsets.UTF_8);
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
    try (var writer = Files.newBufferedWriter(outPath, StandardCharsets.UTF_8)) {
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
  @Command(name = "bitmessageDecryptTest")
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
    final byte[] generalRipe = new byte[]{-92, 6, 83, 41, -112, -51, -47, 106, 52, 14, 94, 93, 1,
        -126, -85, 50, 59};
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

  @Command(name = "addressEncode")
  private static void addressEncode(String[] args) throws IOException, NoSuchAlgorithmException {
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

  @Command(name = "calcCheckDigit")
  private int checkDigit(String code) {
    if (!pattern11.matcher(code).matches()) {
      return ExitCode.SOFTWARE;
    }
    var charArray = code.toCharArray();
    var coefficient = new int[]{6, 5, 4, 3, 2, 7, 6, 5, 4, 3, 2};
    int sum = 0;
    for (int i = 0, charArrayLength = charArray.length; i < charArrayLength; i++) {
      sum += coefficient[i] * (charArray[i] - '0');
    }
    var mods = sum % 11;
    int d;
    if (mods <= 1) {
      d = 0;
    } else {
      d = 11 - mods;
    }
    System.out.println(d);
    return ExitCode.OK;
  }

  @Command(name = "pam")
  private Integer pam(int bitLength) throws IOException {
    var auto = Arena.ofAuto();
    var mpzArray = __mpz_struct.allocateArray(2, auto);
    var n = __mpz_struct.asSlice(mpzArray, 0).reinterpret(auto, gmp_h::mpz_clear);
    var p = __mpz_struct.asSlice(mpzArray, 1).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init2(n, bitLength);
    mpz_init2(p, bitLength);
    var n2 = new BigInteger(bitLength, (Random) SECURE_RANDOM_GENERATOR).setBit(bitLength - 1)
        .clearBit(0);
    var byteArray = n2.toByteArray();
    mpz_import(mpzArray, byteArray.length, 1, JAVA_BYTE.byteSize(), 0, 0,
        auto.allocateFrom(JAVA_BYTE, byteArray));
    mpz_nextprime(p, n);
    var sizeInBase10 = mpz_sizeinbase(p, 10);
    System.out.println(sizeInBase10);
    var str = auto.allocate(sizeInBase10 + 1, 1);
    mpz_get_str(str, 10, p);
    var a = str.getString(0).replaceAll("\\d{5}", "$0 ")
        .replaceAll("((\\d{5} ){9}\\d{5}) ", "$1" + System.lineSeparator());
    var uuid = UUID.randomUUID();
    var path = Path.of(
        bitLength + "bit-" + uuid.toString().replaceAll("-", "").toUpperCase() + ".txt");
    Files.writeString(path, a, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
        StandardOpenOption.WRITE);
    return ExitCode.OK;
  }



  @Override
  public Integer call() throws Exception {
    return ExitCode.USAGE;
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
      if (o == null) {
        return false;
      }
      if (this == o) {
        return true;
      }
      if (!(o instanceof Key(byte[] key1))) {
        return false;
      }

      return Arrays.equals(key, key1);
    }

    @Override
    public int hashCode() {
      return Arrays.hashCode(key);
    }
  }

}
