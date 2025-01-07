package com.github.teruteru128.study;

import static com.github.teruteru128.bitmessage.Const.SEC_P256_K1_G;
import static com.github.teruteru128.gmp.gmp_h.mpz_add_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_get_str;
import static com.github.teruteru128.gmp.gmp_h.mpz_init;
import static com.github.teruteru128.gmp.gmp_h.mpz_init_set;
import static com.github.teruteru128.gmp.gmp_h.mpz_init_set_str;
import static com.github.teruteru128.gmp.gmp_h.mpz_init_set_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_nextprime;
import static com.github.teruteru128.gmp.gmp_h.mpz_pow_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_probab_prime_p;
import static com.github.teruteru128.gmp.gmp_h.mpz_set;
import static com.github.teruteru128.gmp.gmp_h.mpz_set_str;
import static com.github.teruteru128.gmp.gmp_h.mpz_sizeinbase;
import static com.github.teruteru128.gmp.gmp_h.mpz_sub;
import static java.lang.Integer.parseInt;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.net.HttpURLConnection.HTTP_NOT_FOUND;
import static java.net.HttpURLConnection.HTTP_OK;
import static java.net.http.HttpRequest.BodyPublishers.ofString;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.github.teruteru128.bitmessage.Const;
import com.github.teruteru128.bitmessage.app.Spammer;
import com.github.teruteru128.bitmessage.app.Spammer.Address;
import com.github.teruteru128.bitmessage.genaddress.BMAddressGenerator;
import com.github.teruteru128.bitmessage.genaddress.Response;
import com.github.teruteru128.bitmessage.spec.AddressFactory;
import com.github.teruteru128.bitmessage.spec.KeyPair;
import com.github.teruteru128.color.ColorConverter;
import com.github.teruteru128.color.HLSColor;
import com.github.teruteru128.color.RGBColor;
import com.github.teruteru128.encode.Base58;
import com.github.teruteru128.foreign.converters.PathConverter;
import com.github.teruteru128.foreign.prime.search.PrimeSearch.LargeSieve;
import com.github.teruteru128.fx.App;
import com.github.teruteru128.gmp.__mpz_struct;
import com.github.teruteru128.gmp.gmp_h;
import com.github.teruteru128.ncv.xml.ListUp;
import com.github.teruteru128.ncv.xml.Transform;
import com.github.teruteru128.semen.CumShoot;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.io.UncheckedIOException;
import java.lang.foreign.Arena;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
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
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.ProviderNotFoundException;
import java.nio.file.StandardOpenOption;
import java.security.AlgorithmParameters;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.RSAPublicKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.sql.SQLException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.BitSet;
import java.util.HashSet;
import java.util.HexFormat;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.random.RandomGenerator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(subcommands = {AddressCalc4.class, AddressCalc5.class, CreateLargeSieveTask.class,
    ECIESSample.class, FileChecker.class, com.github.teruteru128.study.PrimeSearch.class,
    SiteChecker.class, Spam.class, TeamSpeak.class, Updater.class, CommandLine.HelpCommand.class,
    ListUp.class, Transform.class, CumShoot.class, SlimeSearch.class, Spam3.class, OwnerCheck.class,
    CalcBustSize.class, Deterministic.class, CreatePrimeNumberCandidateDB.class,
    SmallSievePrimeCounter.class})
public class Factory implements Callable<Integer> {

  public static final int ARRAY_ELEMENTS_MAX = 2147483645;
  private static final int WINDOW_SIZE = 1000;
  private static final RandomGenerator SECURE_RANDOM_GENERATOR = RandomGenerator.of("SecureRandom");
  private static final HexFormat FORMAT = HexFormat.of();
  private static final ECParameterSpec secp256k1Parameter;
  private static final KeyFactory factory;
  private static final Logger logger = LoggerFactory.getLogger(Factory.class);
  private static final Pattern pattern11 = Pattern.compile("\\d{11}");
  private static final Pattern pattern12 = Pattern.compile("\\d{12}");
  private static final int[] coefficient = new int[]{6, 5, 4, 3, 2, 7, 6, 5, 4, 3, 2};
  /**
   * UNITS is only a power of 2.
   * 32768にすると1時間ぐらいになる
   */
  private static final int UNITS = 2048;
  private static final int MASK = UNITS - 1;
  private static final int TRAILING_ZEROS = Long.numberOfTrailingZeros(UNITS);
  private static final int BOUND = 16777216 / UNITS;
  private static final int LENGTH = UNITS * Const.PUBLIC_KEY_LENGTH;

  static {
    try {
      var parameters = AlgorithmParameters.getInstance("EC");
      parameters.init(new ECGenParameterSpec("secp256k1"));
      secp256k1Parameter = parameters.getParameterSpec(ECParameterSpec.class);
      factory = KeyFactory.getInstance("EC");
    } catch (NoSuchAlgorithmException | InvalidParameterSpecException e) {
      throw new ExceptionInInitializerError(e);
    }
  }

  /**
   * Callableをnewして返すファクトリにするはずだったんだけどなあ……
   *
   */
  static Callable<Integer> create() {
    return new Factory();
  }

  @Command(name = "diffLargeSieves")
  private static void diffLargeSieves(Path inPath1, Path inPath2)
      throws IOException, ClassNotFoundException {
    LargeSieve result1;
    try (var ois1 = new ObjectInputStream(new BufferedInputStream(Files.newInputStream(inPath1)))) {
      var searchLength1 = ois1.readInt();
      var sieve1 = BitSet.valueOf((long[]) ois1.readObject());
      result1 = new LargeSieve(searchLength1, sieve1);
    }
    var a = result1;
    long[] array1 = a.sieve().toLongArray();
    LargeSieve result;
    try (var ois = new ObjectInputStream(new BufferedInputStream(Files.newInputStream(inPath2)))) {
      var searchLength = ois.readInt();
      var sieve = BitSet.valueOf((long[]) ois.readObject());
      result = new LargeSieve(searchLength, sieve);
    }
    var b = result;
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
  private static int fixColor(int[] color) {
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
      return ExitCode.SOFTWARE;
    }
    System.out.printf("input: R: %d, G: %d, B: %d(%d, %<08x)%n", r, g, b, p);
    var max = max(max(r, g), b);
    var min = min(min(r, g), b);
    // double型で==を使って比較したくなかった
    if (max == min && min >= 192) {
      System.out.println("Achromatic, but vivid enough. Does nothing.");
      return ExitCode.OK;
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
      return ExitCode.OK;
    }
    var newL = 0.5;
    var newS = (double) SECURE_RANDOM_GENERATOR.nextInt(192, 256) / 255;
    var newRGB = ColorConverter.HLSToRGB(new HLSColor(h, newL, newS));
    System.out.printf("new: R: %d, G: %d, B %d%n", newRGB.r(), newRGB.g(), newRGB.b());
    System.out.printf("new: Windows: H: %f, L: %f, S: %f%n", h * 40, newL * 240, newS * 240);
    System.out.printf("new: degrees: H: %f, L: %f, S: %f%n", h * 60, newL * 100, newS * 100);
    System.out.printf("color=%d, %<08x%n",
        0xff000000 | newRGB.r() << 16 | newRGB.g() << 8 | newRGB.b());
    return ExitCode.OK;
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

  @Command(name = "getSentMessageByAckData")
  private static void getSentMessageByAckData(String ackData)
      throws IOException, InterruptedException {
    try (var client = HttpClient.newHttpClient()) {
      System.out.println(client.send(Spammer.requestBuilder.POST(ofString(
          "{\"jsonrpc\":\"2.0\",\"method\":\"getSentMessageByAckData\", \"params\":[\"" + ackData
          + "\"], \"id\": 19}")).build(), BodyHandlers.ofString()).body());
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

  @Command(name = "list-encodings")
  private static void listEncodings() {
    System.err.printf("native.encoding=%s%n", System.getProperty("native.encoding"));
    System.err.printf("stderr.encoding=%s%n", System.getProperty("stderr.encoding"));
    System.err.printf("stdout.encoding=%s%n", System.getProperty("stdout.encoding"));
    System.err.printf("file.encoding=%s%n", Charset.defaultCharset().displayName());
  }

  @Command(name = "p2", description = {"30バイトの乱数を生成し、Base64に変換して出力する。",
      "何に使うんでしたっけ……？"})
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

  @Command(name = "jpeg", aliases = {"jpg"})
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

  @Command(name = "pk2")
  private static int pk2() throws IOException, InterruptedException, SQLException {
    var decoder = Base64.getDecoder();
    var s = Spammer.getFakeAddresses().stream().parallel().map(
        a -> new Address(new String(decoder.decode(a.label()), StandardCharsets.UTF_8),
            a.address())).filter(a -> a.label().startsWith("fake-")).toList();
    var dataSource = new SQLiteDataSource();
    var databaseUrl = System.getenv("DB_URL");
    if (databaseUrl == null || databaseUrl.isEmpty()) {
      System.err.println("$DB_URL NOT FOUND");
      return ExitCode.SOFTWARE;
    }
    dataSource.setUrl(databaseUrl);
    var date = LocalDateTime.now().plusDays(1).truncatedTo(ChronoUnit.DAYS);
    var timeZone = TimeZone.getDefault();
    var rules = timeZone.toZoneId().getRules();
    var u = date.toEpochSecond(rules.getOffset(date));
    try (var connection = dataSource.getConnection()) {
      connection.setAutoCommit(false);
      try (var statement = connection.createStatement()) {
        statement.execute(
            "CREATE TABLE IF NOT EXISTS TASK(toAddress text, label text, senttime integer, primary key (toaddress));");
      }
      connection.commit();
      try (var ps = connection.prepareStatement(
          "INSERT INTO TASK(toAddress, label, senttime) values (?, ?, ?);")) {
        long count = 0;
        for (var a : s) {
          ps.setString(1, a.address());
          ps.setString(2, a.label());
          ps.setLong(3, u + SECURE_RANDOM_GENERATOR.nextInt(86400));
          ps.addBatch();
          if (++count >= 100) {
            count = 0;
            u += 86400;
          }
        }
        logger.info("{}", Arrays.stream(ps.executeBatch()).asLongStream().sum());
      }
      connection.commit();
    }
    return ExitCode.OK;
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
    var ripemd160 = MessageDigest.getInstance("ripemd160");
    var mac = Mac.getInstance("HmacSHA256");
    var ecdsa = Signature.getInstance("ECDSA");
    try (var connection = source.getConnection(); var statement = connection.createStatement(); var set = statement.executeQuery(
        "select hash, payload from inventory where objecttype = 2;"); var prep = connection.prepareStatement(
        "insert into inventory(hash, objecttype, streamnumber, payload, expirestime, tag) values (?,?,?,?,?,?);")) {
      // 本来は新しいオブジェクトを受信する度にすべての秘密鍵についてループを回すんだろうな
      while (set.next()) {
        var payload = set.getBytes("payload");
        // オブジェクト解析
        var payloadBuffer = ByteBuffer.wrap(payload);
        // nonce
        payloadBuffer.getLong();
        int start = payloadBuffer.position();
        // expiresTime
        payloadBuffer.getLong();
        // object type
        payloadBuffer.getInt();
        // version
        decodeVarInt(payloadBuffer);
        // stream Number
        decodeVarInt(payloadBuffer);
        int headerLength = payloadBuffer.position() - start;
        if (payloadBuffer.remaining() == 32) {
          // non-stealth message ack data
          continue;
        }
        var ivParameterSpec = getIV(payloadBuffer);
        var curveType = payloadBuffer.getShort();
        assert curveType == 0x02CA;
        var xLength = payloadBuffer.getShort();
        var x = getBytes(new byte[xLength], payloadBuffer);
        var yLength = payloadBuffer.getShort();
        var y = getBytes(new byte[yLength], payloadBuffer);
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
        var aesKey = new SecretKeySpec(sharedSecret, 0, 32, "AES");
        cipher.init(Cipher.DECRYPT_MODE, aesKey, ivParameterSpec);
        var plaintext = cipher.doFinal(payload, ciphertextOffset, ciphertextLength);
        var unencryptedMessageDataBuffer = ByteBuffer.wrap(plaintext);
        var fromAddressVersionNumber = decodeVarInt(unencryptedMessageDataBuffer);
        // fromStreamNumber
        var fromStreamNumber = decodeVarInt(unencryptedMessageDataBuffer);
        // fromAddressBitfield
        var behavior = unencryptedMessageDataBuffer.getInt();
        var publicSignKey = getBytes(new byte[64], unencryptedMessageDataBuffer);
        // publicEncKey
        var publicEncKey = getBytes(new byte[64], unencryptedMessageDataBuffer);
        long nonceTrialsPerByte = 0;
        long extraBytes = 0;
        if (3 <= fromAddressVersionNumber) {
          nonceTrialsPerByte = decodeVarInt(unencryptedMessageDataBuffer);
          extraBytes = decodeVarInt(unencryptedMessageDataBuffer);
        }
        // encryptionKey が同じアドレスの場合、toRipeででしか宛て先を特定できない
        var toRipe = getBytes(new byte[20], unencryptedMessageDataBuffer);
        var encodingType = decodeVarInt(unencryptedMessageDataBuffer);
        var messageLength = (int) decodeVarInt(unencryptedMessageDataBuffer);
        var message = getBytes(new byte[messageLength], unencryptedMessageDataBuffer);
        var ackLength = (int) decodeVarInt(unencryptedMessageDataBuffer);
        byte[] ackData = null;
        if (ackLength != 0) {
          ackData = getBytes(new byte[ackLength], unencryptedMessageDataBuffer);
        }
        var messageBodyTailPosition = unencryptedMessageDataBuffer.position();
        var x1 = new BigInteger(1, publicSignKey, 0, 32);
        var y1 = new BigInteger(1, publicSignKey, 32, 32);
        var keySpec = new ECPublicKeySpec(new ECPoint(x1, y1), secp256k1Parameter);
        var publicKey1 = factory.generatePublic(keySpec);
        ecdsa.initVerify(publicKey1);
        //ecdsa.initVerify(signPublicKey);
        // expires time, object type, version, stream number
        ecdsa.update(payload, start, headerLength);
        /*
         * address version, stream, bitfield, public sign key, public enc key, nonce_trials_per_byte,
         * extra_bytes, destination ripe, encoding, message length, message, ack_length, ack_data
         */
        ecdsa.update(plaintext, 0, messageBodyTailPosition);
        int signLength = (int) decodeVarInt(unencryptedMessageDataBuffer);
        var signature = new byte[signLength];
        unencryptedMessageDataBuffer.get(signature);
        if (ecdsa.verify(signature)) {
          sha512.update((byte) 4);
          sha512.update(publicSignKey);
          sha512.update((byte) 4);
          sha512.update(publicEncKey);
          var fromRipe = ripemd160.digest(sha512.digest());
          var fromAddress = AddressFactory.encodeAddress((int) fromAddressVersionNumber,
              (int) fromStreamNumber, fromRipe);
          var toAddress3 = AddressFactory.encodeAddress(3, 1, toRipe);
          var toAddress4 = AddressFactory.encodeAddress(4, 1, toRipe);
          logger.info("toaddress:{}, {}", toAddress3, toAddress4);
          logger.info("from address: {}", fromAddress);
        }
      }
    }
  }

  private static byte[] getBytes(byte[] x, ByteBuffer buffer) {
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
      case -1 -> buffer.getLong();
      case -2 -> buffer.getInt() & 0xffffffffL;
      case -3 -> buffer.getShort() & 0xffffL;
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

  @Command(name = "fuck-prime-p")
  private static int fuckPrimeP(String prefixNumber, int initialRepeatCount, String suffixNumber) {
    var auto = Arena.ofAuto();
    var p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(p);
    int count = 0;
    int repeatCount1 = initialRepeatCount;
    int q = ((repeatCount1 - 1) / WINDOW_SIZE + 1) * WINDOW_SIZE;
    while (count < 4) {
      mpz_set_str(p, auto.allocateFrom(prefixNumber.repeat(repeatCount1) + suffixNumber), 10);
      long start = System.nanoTime();
      int prime = mpz_probab_prime_p(p, 25);
      long finish = System.nanoTime();
      if (prime != 0) {
        var length = mpz_sizeinbase(p, 10) + 2;
        var buffer = auto.allocate(length);
        mpz_get_str(buffer, 10, p);
        logger.info("p = {}", buffer.getString(0));
        logger.info("{}: {}({} seconds)", repeatCount1, prime, (finish - start) / 1e9);
        count++;
      }
      if (repeatCount1 >= q) {
        logger.info("done: {}", repeatCount1);
        q += WINDOW_SIZE;
      }
      repeatCount1++;
    }
    return ExitCode.OK;
  }

  @Command(name = "loadPem")
  private int loadPem(Path inPath)
      throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {
    var factory = KeyFactory.getInstance("RSA", Security.getProvider("BC"));
    var rsaPublicKey = factory.getKeySpec(factory.generatePublic(new X509EncodedKeySpec(
        Base64.getMimeDecoder().decode(
            Files.readString(inPath).replace("-----BEGIN PUBLIC KEY-----", "")
                .replace("-----END PUBLIC KEY-----", "")))), RSAPublicKeySpec.class);
    var publicExponent = rsaPublicKey.getPublicExponent();
    var modulus = rsaPublicKey.getModulus();
    logger.info("{}bits", modulus.bitLength());
    logger.info("{}", publicExponent);
    var outFileName = Path.of(inPath.getFileName().toString().replace("-pub.pem", "-oos.bin"));
    var parent = inPath.getParent();
    var outPath = parent.resolve(outFileName);
    try (var oos = new ObjectOutputStream(
        new BufferedOutputStream(Files.newOutputStream(outPath), UNITS * UNITS * 128))) {
      oos.writeObject(publicExponent);
      oos.writeObject(modulus);
    }
    return ExitCode.OK;
  }

  @Override
  public Integer call() throws Exception {
    return ExitCode.USAGE;
  }

  @Command(name = "unko", description = "keys.dat アドレス検証ツール")
  private int unko(Path inPath) throws IOException, NoSuchAlgorithmException {
    var inLines = Files.readAllLines(inPath);
    var address = "";
    var version = 0;
    var privateSigningKey = "";
    var privateEncryptionKey = "";
    final var privateSigningKeyPattern = Pattern.compile(
        "^privsigningkey = ([0-9A-HJ-NP-Za-km-z]{51})$");
    final var privateEncryptionKeyPattern = Pattern.compile(
        "^privencryptionkey = ([0-9A-HJ-NP-Za-km-z]{51})$");
    var set = new HashSet<AddressBlock>();
    var sha512 = MessageDigest.getInstance("SHA-512");
    var ripemd160 = MessageDigest.getInstance("RIPEMD160");
    for (var line : inLines) {
      if (line.isEmpty()) {
        var decoded = Base58.decode(address.replaceAll("BM-", ""));
        version = decoded[0];
        if (!set.add(new AddressBlock(version, privateSigningKey, privateEncryptionKey))) {
          System.err.println(
              "collision!: " + version + ", " + privateSigningKey + ", " + privateEncryptionKey);
        }
        var sig = Base58.decode(privateSigningKey);
        var enc = Base58.decode(privateEncryptionKey);
        var pubsig = SEC_P256_K1_G.multiply(new BigInteger(1, sig, 1, 32)).getEncoded(false);
        var pubenc = SEC_P256_K1_G.multiply(new BigInteger(1, enc, 1, 32)).getEncoded(false);
        sha512.update(pubsig);
        sha512.update(pubenc);
        var ripe = ripemd160.digest(sha512.digest());
        if (!MessageDigest.isEqual(Arrays.copyOfRange(decoded, 2, decoded.length - 4),
            Arrays.copyOfRange(ripe, 20 - decoded.length + 6, ripe.length))) {
          System.err.println(
              "not match!: " + version + ", " + privateSigningKey + ", " + privateEncryptionKey
              + "(" + (20 - decoded.length + 6) + ")" + FORMAT.formatHex(ripe));
        }
      } else if (line.startsWith("[")) {
        address = line.replace("[", "").replace("]", "");
      } else {
        var matcher1 = privateSigningKeyPattern.matcher(line);
        if (matcher1.matches()) {
          privateSigningKey = matcher1.group(1);
        } else {
          var matcher2 = privateEncryptionKeyPattern.matcher(line);
          if (matcher2.matches()) {
            privateEncryptionKey = matcher2.group(1);
          }
        }
      }
    }
    return ExitCode.OK;
  }

  @Command(name = "messageSign")
  private int sign(String message)
      throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
    KeyPairGenerator generator = null;
    try {
      generator = KeyPairGenerator.getInstance("EC", "BC");
    } catch (NoSuchProviderException e) {
      throw new RuntimeException(e);
    }
    var secureRandom = SecureRandom.getInstanceStrong();
    generator.initialize(new ECGenParameterSpec("SECP256k1"), secureRandom);
    System.out.println(generator.getAlgorithm());
    System.out.println(generator.getProvider());
    var pair = generator.generateKeyPair();
    var p1 = pair.getPrivate();
    if (p1 instanceof ECPrivateKey ep1) {
      System.out.println("instanceof java.security.interfaces.ECPrivateKey");
      System.out.println(ep1.getClass().getName());
      System.out.println(FORMAT.formatHex(ep1.getS().toByteArray()));
    }
    if (p1 instanceof org.bouncycastle.jce.interfaces.ECPrivateKey ep2) {
      System.out.println("instanceof org.bouncycastle.jce.interfaces.ECPrivateKey");
      System.out.println(ep2.getClass().getName());
      System.out.println(FORMAT.formatHex(ep2.getD().toByteArray()));
    }
    var p2 = pair.getPublic();
    if (p2 instanceof ECPublicKey ep3) {
      System.out.println("instanceof java.security.interfaces.ECPublicKey");
      System.out.println(ep3.getClass().getName());
      var w = ep3.getW();
      System.out.println(FORMAT.formatHex(w.getAffineX().toByteArray()) + ", " + FORMAT.formatHex(
          w.getAffineY().toByteArray()));
      System.out.println(FORMAT.formatHex(ep3.getEncoded()));
    }
    if (p2 instanceof org.bouncycastle.jce.interfaces.ECPublicKey ep4) {
      System.out.println("instanceof org.bouncycastle.jce.interfaces.ECPublicKey");
      System.out.println("[" + ep4.getClass().getName() + "]");
      var q = ep4.getQ();
      System.out.println(
          "[" + FORMAT.formatHex(q.getAffineXCoord().toBigInteger().toByteArray()) + ", "
          + FORMAT.formatHex(q.getAffineYCoord().toBigInteger().toByteArray()) + "]");
      System.out.println("[" + FORMAT.formatHex(ep4.getEncoded()) + "]");
      System.out.println("[" + FORMAT.formatHex(q.getEncoded(false)) + "]");
    }
    return ExitCode.OK;
  }

  @Command(name = "fuckp")
  private int fuckp() {
    var header = BigInteger.valueOf(19000L);
    var pro = BigInteger.valueOf(100L);
    var p = BigInteger.valueOf(419L);
    int count = 0;
    while (count < 10) {
      if (p.isProbablePrime(25)) {
        System.out.println("p = " + p);
        count++;
      }
      p = p.add(header);
      header = header.multiply(pro);
    }
    return ExitCode.OK;
  }

  @Command(name = "fuckPrime2")
  private int fuckPrime2() {
    return fuckPrimeP("19", 8000, "419");
  }

  @Command(name = "fuckPrime3")
  private int fuckPrime3() {
    return fuckPrimeP("4545", 0, "0721");
  }

  @Command(name = "fuckPrime4")
  private int fuckPrime4() {
    return fuckPrimeP("3", 1917, "1");
  }

  @Command(name = "calc")
  private int calc(Path in, long step, Path out) throws IOException {
    var str = Files.readString(in);
    var auto = Arena.ofAuto();
    var p2 = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_str(p2, auto.allocateFrom(str), 10);
    mpz_add_ui(p2, p2, step * 2 + 1);
    var length = mpz_sizeinbase(p2, 10) + 2;
    var res_str = auto.allocate(length);
    mpz_get_str(res_str, 10, p2);
    Files.writeString(out, res_str.getString(0), StandardOpenOption.CREATE,
        StandardOpenOption.WRITE);
    return ExitCode.OK;
  }

  @Command(name = "pine")
  private int pine() {
    var auto = Arena.ofAuto();
    var base = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(base, 10);
    mpz_pow_ui(base, base, 99999);
    var p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set(p, base);
    var rop = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(rop);
    var diff = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(diff);
    for (int i = 0; i < 10; i++) {
      mpz_nextprime(rop, p);
      mpz_sub(diff, rop, base);
      var length = mpz_sizeinbase(diff, 10) + 2;
      var str = auto.allocate(length);
      mpz_get_str(str, 10, diff);
      System.out.printf("prime found: base + %s%n", str.getString(0));
      mpz_set(p, rop);
    }
    return ExitCode.OK;
  }

  @Command(name = "pine2")
  private int pine2() {
    var auto = Arena.ofAuto();
    var base = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_str(base, auto.allocateFrom("3".repeat(29999) + "1"), 10);
    logger.info("bit length: {}", mpz_sizeinbase(base, 2));
    var p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(p);
    for (int count = 0; count < 20; count++, mpz_set(base, p)) {
      mpz_nextprime(p, base);
      var length = mpz_sizeinbase(p, 10) + 2;
      var res_str = auto.allocate(length);
      mpz_get_str(res_str, 10, p);
      logger.info("{}", res_str.getString(0));
    }
    return ExitCode.OK;
  }

  @Command(name = "sig")
  private int sig(Path path1) throws IOException {
    var mapper = new ObjectMapper(new YAMLFactory());
    record Keys(byte[] sigKey, byte[] encKey) {

    }
    var obj = mapper.readValue(path1.toUri().toURL(), Keys.class);
    System.out.printf("sig: %s%n", FORMAT.formatHex(obj.sigKey));
    System.out.printf("enc: %s%n", FORMAT.formatHex(obj.encKey));
    return ExitCode.OK;
  }

  @Command(name = "multi")
  private int multi() {
    var p = BigInteger.valueOf(3).pow(100).shiftLeft(100);
    var q = BigInteger.valueOf(1).shiftLeft(256);
    var d = p.divideAndRemainder(q);
    System.out.printf("p: %066x%n", p);
    System.out.printf("q: %066x%n", q);
    System.out.printf("%s, %x%n", d[0], d[1]);
    System.out.println(new BigDecimal(d[1]).multiply(BigDecimal.valueOf(100))
        .divide(new BigDecimal(p), MathContext.DECIMAL128));
    return ExitCode.OK;
  }

  @Command(name = "multi2", description = {
      "指定した署名鍵とファイルの暗号鍵からアドレスを計算する"})
  private int multi2(String signPrivateKey58)
      throws IOException, NoSuchAlgorithmException, DigestException {
    var sp = Base58.decode(signPrivateKey58);
    var sigPubKey = SEC_P256_K1_G.multiply(new BigInteger(1, sp, 1, 32)).normalize()
        .getEncoded(false);
    var index = SECURE_RANDOM_GENERATOR.nextInt();
    System.out.printf("index: %d%n", index);
    var fileNumber = (index >> 24) & 0xff;
    System.out.printf("file number: %d%n", fileNumber);
    final var initialOffset = (index & 0xffffff) * 65;
    System.out.printf("initial offset: %d%n", initialOffset);
    var publicDir = Path.of("D:\\keys\\public");
    var privateDir = Path.of("D:\\keys\\private");
    var sha512 = MessageDigest.getInstance("SHA-512");
    var ripemd160 = MessageDigest.getInstance("RIPEMD160");
    long privateKeyOffset;
    byte[] ripe;
    try (var file = new RandomAccessFile(
        publicDir.resolve("publicKeys" + fileNumber + ".bin").toFile(), "r")) {
      var publicKey = new byte[65];
      ripe = new byte[64];
      file.seek(initialOffset);
      do {
        file.readFully(publicKey);
        sha512.update(sigPubKey);
        sha512.update(publicKey);
        sha512.digest(ripe, 0, 64);
        ripemd160.update(ripe, 0, 64);
        ripemd160.digest(ripe, 0, 20);
      } while (ripe[0] != 0);
      System.out.printf("ripe: %s%n", FORMAT.formatHex(ripe, 0, 20));
      var currentOffset = file.getFilePointer() - 65;
      privateKeyOffset = (currentOffset / 65) * 32;
      System.out.printf("offset: %d -> %d%n", currentOffset, privateKeyOffset);
    }
    String p;
    try (var file = new RandomAccessFile(
        privateDir.resolve("privateKeys" + fileNumber + ".bin").toFile(), "r")) {
      file.seek(privateKeyOffset);
      var privateKey = new byte[32];
      file.readFully(privateKey);
      p = BMAddressGenerator.encodeWIF(privateKey);
    }
    System.out.printf("enc private key: %s%n", p);
    System.out.printf("address: %s%n", AddressFactory.encodeAddress(4, 1, ripe, 0, 20));
    return ExitCode.OK;
  }

  @Command(name = "validate")
  private int validate(String signPrivateKey58, String encPrivateKey58)
      throws NoSuchAlgorithmException, DigestException {
    var sp = Base58.decode(signPrivateKey58);
    var sigPubKey = SEC_P256_K1_G.multiply(new BigInteger(1, sp, 1, 32)).normalize()
        .getEncoded(false);
    var sp3 = Base58.decode(encPrivateKey58);
    var encPubKey = SEC_P256_K1_G.multiply(new BigInteger(1, sp3, 1, 32)).normalize()
        .getEncoded(false);
    var sha512 = MessageDigest.getInstance("SHA-512");
    var ripemd160 = MessageDigest.getInstance("RIPEMD160");
    var ripe = new byte[64];
    sha512.update(sigPubKey);
    sha512.update(encPubKey);
    sha512.digest(ripe, 0, 64);
    ripemd160.update(ripe, 0, 64);
    ripemd160.digest(ripe, 0, 20);
    System.out.printf("format: %s%n", FORMAT.formatHex(ripe, 0, 20));
    System.out.printf("address: %s%n", AddressFactory.encodeAddress(4, 1, ripe, 0, 20));
    return ExitCode.OK;
  }

  private static class KeyCache {

    private static final List<byte[]> sigKeys;

    static {
      try {
        var uri = Objects.requireNonNull(Factory.class.getResource("sign.txt")).toURI();
        List<byte[]> tmp;
        try {
          var fileSystem = FileSystems.getFileSystem(uri);
          List<byte[]> result;
          Path p = fileSystem.provider().getPath(uri);
          try (var lines = Files.lines(p)) {
            result = lines.map(FORMAT::parseHex).toList();
          }
          tmp = result;
        } catch (ProviderNotFoundException e) {
          throw new ExceptionInInitializerError("unknown scheme: " + uri.getScheme());
        }
        sigKeys = tmp;
      } catch (URISyntaxException | IOException e) {
        throw new ExceptionInInitializerError(e);
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
      if (o == null) {
        return false;
      }
      if (o == this) {
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
