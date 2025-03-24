package com.github.teruteru128.study;

import static com.github.teruteru128.bitmessage.Const.SEC_P256_K1_G;
import static com.github.teruteru128.gmp.gmp_h.gmp_randinit_default;
import static com.github.teruteru128.gmp.gmp_h.mpz_add;
import static com.github.teruteru128.gmp.gmp_h.mpz_add_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_cmp;
import static com.github.teruteru128.gmp.gmp_h.mpz_cmp_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_fac_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_gcd;
import static com.github.teruteru128.gmp.gmp_h.mpz_get_str;
import static com.github.teruteru128.gmp.gmp_h.mpz_init;
import static com.github.teruteru128.gmp.gmp_h.mpz_init_set;
import static com.github.teruteru128.gmp.gmp_h.mpz_init_set_str;
import static com.github.teruteru128.gmp.gmp_h.mpz_init_set_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_mod;
import static com.github.teruteru128.gmp.gmp_h.mpz_mul;
import static com.github.teruteru128.gmp.gmp_h.mpz_mul_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_nextprime;
import static com.github.teruteru128.gmp.gmp_h.mpz_pow_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_powm;
import static com.github.teruteru128.gmp.gmp_h.mpz_prevprime;
import static com.github.teruteru128.gmp.gmp_h.mpz_probab_prime_p;
import static com.github.teruteru128.gmp.gmp_h.mpz_remove;
import static com.github.teruteru128.gmp.gmp_h.mpz_set;
import static com.github.teruteru128.gmp.gmp_h.mpz_set_str;
import static com.github.teruteru128.gmp.gmp_h.mpz_set_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_sizeinbase;
import static com.github.teruteru128.gmp.gmp_h.mpz_sub;
import static com.github.teruteru128.gmp.gmp_h.mpz_sub_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_urandomm;
import static com.github.teruteru128.study.FactorDatabase.FDB_USER_COOKIE;
import static com.github.teruteru128.util.gmp.mpz.Functions.mpz_get_u64;
import static com.github.teruteru128.util.gmp.mpz.Functions.mpz_set_u64;
import static java.lang.Integer.parseInt;
import static java.lang.Math.log10;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.net.HttpURLConnection.HTTP_NOT_FOUND;
import static java.net.HttpURLConnection.HTTP_OK;
import static java.net.http.HttpRequest.BodyPublishers.ofString;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.github.teruteru128.bitmessage.app.Spammer;
import com.github.teruteru128.bitmessage.app.Spammer.Address;
import com.github.teruteru128.color.ColorConverter;
import com.github.teruteru128.color.HLSColor;
import com.github.teruteru128.color.RGBColor;
import com.github.teruteru128.encode.Base58;
import com.github.teruteru128.foreign.prime.search.PrimeSearch.LargeSieve;
import com.github.teruteru128.fx.App;
import com.github.teruteru128.gmp.__gmp_randstate_struct;
import com.github.teruteru128.gmp.__mpz_struct;
import com.github.teruteru128.gmp.gmp_h;
import com.github.teruteru128.ncv.xml.ListUp;
import com.github.teruteru128.ncv.xml.Transform;
import com.github.teruteru128.semen.CumShoot;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.io.UncheckedIOException;
import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.SymbolLookup;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
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
import javax.net.ssl.HttpsURLConnection;
import org.apache.commons.rng.simple.JDKRandomWrapper;
import org.apache.commons.statistics.distribution.LogNormalDistribution;
import org.apache.logging.log4j.util.InternalException;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlite.SQLiteDataSource;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.HelpCommand;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(subcommands = {AddressCalc4.class, AddressCalc5.class, CreateLargeSieveTask.class,
    ECIESSample.class, FileChecker.class, PrimeSearch.class, SiteChecker.class, Spam.class,
    TeamSpeak.class, Updater.class, HelpCommand.class, ListUp.class, Transform.class,
    CumShoot.class, SlimeSearch.class, Spam3.class, OwnerCheck.class, CalcBustSize.class,
    Deterministic.class, CreatePrimeNumberCandidateDB.class, SmallSievePrimeCounter.class,
    NewColorGenerator.class, Multi2.class, Project5190.class, Project19.class, Project19F.class,
    Project19Sort.class, Project19Unique.class, Spammer.class, Spam2.class,
    FactorDistribution.class}, mixinStandardHelpOptions = true)
public class Factory implements Callable<Integer> {

  public static final int ARRAY_ELEMENTS_MAX = 2147483645;
  public static final RandomGenerator SECURE_RANDOM_GENERATOR = RandomGenerator.of("SecureRandom");
  public static final String ENDPOINT = "https://factordb.com/api?query=";
  public static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
  private static final HexFormat FORMAT = HexFormat.of();
  private static final ECParameterSpec secp256k1Parameter;
  private static final KeyFactory factory;
  private static final Logger logger = LoggerFactory.getLogger(Factory.class);

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

  private Factory() {
  }

  /**
   * Callableをnewして返すファクトリにするはずだったんだけどなあ……
   *
   */
  static Callable<Integer> createInstance() {
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
              Thread.currentThread().interrupt();
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
  private static void extracted2(@Parameters Path inPath, @Parameters Path outPath)
      throws IOException {
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

  @Command(name = "loadPem")
  private int loadPem(Path inPath)
      throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {
    var factory = KeyFactory.getInstance("RSA",
        Security.getProvider(BouncyCastleProvider.PROVIDER_NAME));
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
        new BufferedOutputStream(Files.newOutputStream(outPath), 536870912))) {
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

  /**
   * even number textファイルとstep番号から数値を計算してファイルに書き出すコマンド
   * @param in
   * @param step
   * @param out
   * @return
   * @throws IOException
   */
  @Command(name = "derivation")
  private int derivation(Path in, int step, Path out) throws IOException {
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

  @Command(name = "p")
  private int p(Path smallSievePath,
      @Option(names = {"--initial", "-i"}, defaultValue = "0") long initialPrime)
      throws IOException, ClassNotFoundException {
    var auto = Arena.ofAuto();
    var n = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(n);
    mpz_fac_ui(n, 96127);
    mpz_mul_ui(n, n, 10000);
    mpz_add_ui(n, n, 1);
    long[] smallSieve;
    try (var oin = new ObjectInputStream(
        new BufferedInputStream(Files.newInputStream(smallSievePath)))) {
      oin.readLong();
      smallSieve = (long[]) oin.readObject();
    }
    logger.debug("ロードしたでー");
    var max = smallSieve.length * 64L;
    var p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(p, 1);
    var mod = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(mod, 1);
    var showPoint = 10000000L;
    long step;
    for (var index = (initialPrime - 1) / 2;
        (step = PrimeSearch.nextClearBit(smallSieve, index)) < max; index = step + 1) {
      mpz_set_u64(p, step * 2 + 1);
      mpz_mod(mod, n, p);
      if (mpz_cmp_ui(mod, 0) == 0) {
        logger.info("found: {}", step * 2 + 1);
      }
      if (step > showPoint) {
        logger.info("check point: {}", step * 2L + 1L);
        while (step > showPoint) {
          showPoint += 10000000L;
        }
      }
    }
    return ExitCode.OK;
  }

  @Command
  private int prime3bits(@Option(names = {"--length"}, defaultValue = "26575") int length) {
    var auto = Arena.ofAuto();

    var arrayLength = length + 1;

    var powers = __mpz_struct.allocateArray(arrayLength, auto);
    mpz_init_set_ui(powers.getAtIndex(ADDRESS, 0).reinterpret(auto, gmp_h::mpz_clear), 1);
    mpz_init_set_ui(powers.getAtIndex(ADDRESS, 1).reinterpret(auto, gmp_h::mpz_clear), 10);
    var p2 = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(p2);

    int j;
    for (int i = 2; i < arrayLength; i++) {
      mpz_init(powers.getAtIndex(ADDRESS, i));
      mpz_mul_ui(powers.getAtIndex(ADDRESS, i),
          powers.getAtIndex(ADDRESS, i - 1).reinterpret(auto, gmp_h::mpz_clear), 10);
      for (j = 1; j < i; j++) {
        mpz_add(p2, powers.getAtIndex(ADDRESS, i), powers.getAtIndex(ADDRESS, j));
      }
    }
    return ExitCode.OK;
  }

  @Command(name = "convert2")
  private int convert(Path in, Path out) throws IOException {
    try (var lines = Files.lines(in); var stream = new DataOutputStream(new BufferedOutputStream(
        Files.newOutputStream(out, StandardOpenOption.CREATE, StandardOpenOption.WRITE),
        0x7ffffffd))) {
      lines.mapToDouble(Double::parseDouble).forEach(d -> {
        try {
          stream.writeDouble(d);
        } catch (IOException e) {
          throw new UncheckedIOException(e);
        }
      });
    }
    return ExitCode.OK;
  }

  @Command(name = "prime8")
  private int prime8() {
    for (int i = 100; i <= 200; i++) {
      var p = new BigInteger("8".repeat(i) + "3".repeat(i) + "1", 10);
      if (p.isProbablePrime(25)) {
        System.out.printf("(%d)%d is prp.%n", i, p);
      }
    }
    return ExitCode.OK;
  }

  @Command(name = "primegap")
  private int primegap() {
    var auto = Arena.ofAuto();
    var state = __gmp_randstate_struct.allocate(auto).reinterpret(auto, gmp_h::gmp_randclear);
    gmp_randinit_default(state);
    Project19.initRandomState(state);
    var min = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(min, 10);
    mpz_pow_ui(min, min, 299);
    var window = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(window);
    mpz_mul_ui(window, min, 9);
    // 素数の間隔を探索する
    // nは乱数で選ぶ
    var n = __mpz_struct.allocate(auto);
    var prevP = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    var nextP = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    var diff = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    var showDiff10 = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    var showDiff20 = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    var showDiff30 = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    var showDiff35 = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    var targetDiff = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(n);
    mpz_init(prevP);
    mpz_init(nextP);
    mpz_init(diff);
    mpz_init_set_ui(showDiff10, 6884);
    mpz_init_set_ui(showDiff20, 13769);
    mpz_init_set_ui(showDiff30, 20654);
    mpz_init_set_ui(showDiff35, 24096);
    mpz_init_set_ui(targetDiff, 27538);
    do {
      mpz_urandomm(n, state, window);
      mpz_add(n, n, min);
      // nの次の素数と前の素数を探索する
      mpz_prevprime(prevP, n);
      mpz_nextprime(nextP, n);
      mpz_sub(diff, nextP, prevP);
      if (mpz_cmp(diff, showDiff10) >= 0) {
        if (mpz_cmp(diff, showDiff20) >= 0) {
          if (mpz_cmp(diff, showDiff30) >= 0) {
            if (mpz_cmp(diff, showDiff35) >= 0) {
              System.err.println("merit 35");
            } else {
              System.err.println("merit 30");
            }
          } else {
            System.err.println("merit 20");
          }
        } else {
          System.err.println("merit 10");
        }
      }
    } while (mpz_cmp(diff, targetDiff) < 0);
    var length = mpz_sizeinbase(prevP, 10) + 2;
    var seg = auto.allocate(length);
    mpz_get_str(seg, 10, prevP);
    logger.info("found: gap:{} prime: {}", mpz_get_u64(diff), seg.getString(0));
    // 感覚が小さかったらやり直す
    return ExitCode.OK;
  }

  @Command(name = "gcmFactor")
  private int gcmFactor(Path in) throws IOException {
    var lines = Files.readAllLines(in);
    var auto = Arena.ofAuto();
    var n = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(n, 1);
    var composite = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(composite);
    var gcd = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(gcd);
    for (var line : lines) {
      mpz_set_str(composite, auto.allocateFrom(line), 10);
      mpz_gcd(gcd, n, composite);
      if (mpz_cmp_ui(gcd, 1) != 0) {
        var len1 = mpz_sizeinbase(composite, 10) + 2;
        var bufOfComposite = auto.allocate(len1);
        mpz_get_str(bufOfComposite, 10, composite);
        var len2 = mpz_sizeinbase(gcd, 10) + 2;
        var bufOfGcd = auto.allocate(len2);
        mpz_get_str(bufOfGcd, 10, composite);
        System.out.printf("! %s, %s%n", bufOfGcd.getString(0), bufOfComposite.getString(0));
        mpz_remove(composite, composite, gcd);
      }
      mpz_mul(n, n, composite);
    }
    System.out.printf("%d digits%n", mpz_sizeinbase(n, 10));
    return ExitCode.OK;
  }

  @Command
  private int findP() {
    var auto = Arena.ofAuto();
    var min = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(min, 10);
    mpz_pow_ui(min, min, 799);
    var window = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set(window, min);
    mpz_mul_ui(window, window, 9);
    var state = __gmp_randstate_struct.allocate(auto).reinterpret(auto, gmp_h::gmp_randclear);
    gmp_randinit_default(state);
    Project19.initRandomState(state);
    var p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(p);
    var p2 = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(p2);
    mpz_urandomm(p, state, window);
    mpz_add(p, p, min);
    do {
      mpz_nextprime(p, p);
      mpz_mul_ui(p2, p, 2);
      mpz_add_ui(p2, p2, 1);
    } while (mpz_probab_prime_p(p2, 25) == 0);
    var length = mpz_sizeinbase(p, 10) + 2;
    var buf = auto.allocate(length);
    mpz_get_str(buf, 10, p);
    System.out.printf("%s%n", buf.getString(0));
    var length2 = mpz_sizeinbase(p, 10) + 2;
    var buf2 = auto.allocate(length2);
    mpz_get_str(buf2, 10, p2);
    System.out.printf("%s%n", buf2.getString(0));
    return ExitCode.OK;
  }

  @Command(name = "generate")
  private int generate(Path in, Path out) throws IOException {
    var pattern = Pattern.compile("\t");
    var lines = Files.readAllLines(in);
    var p = BigInteger.ONE;
    for (var line : lines) {
      var split = pattern.split(line);
      p = p.multiply(new BigInteger(split[0]).pow(parseInt(split[1])));
    }
    var string = p.toString();
    System.out.println(string.length());
    Files.writeString(out, string + System.lineSeparator(), StandardOpenOption.CREATE_NEW,
        StandardOpenOption.WRITE);
    return ExitCode.OK;
  }

  @Command()
  private int fu() {
    var auto = Arena.ofAuto();
    var n = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(n);
    mpz_fac_ui(n, 96127);
    mpz_mul_ui(n, n, 10000);
    mpz_add_ui(n, n, 1);
    var a = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(a, 2);
    var p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(p);
    var Mp = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(Mp, 1);
    var aM = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(aM, 2);
    var aMSub1 = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(aMSub1);
    var g = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(g);
    var l = 65536;
    int mpTmp;
    for (int i = 2; i < 96127; i++) {
      mpz_set_u64(p, i);
      if (mpz_probab_prime_p(p, 25) == 0) {
        continue;
      }
      mpTmp = i;
      while (mpTmp * i <= l) {
        mpTmp *= i;
      }
      mpz_set_u64(Mp, mpTmp);
      mpz_powm(aM, aM, Mp, n);
      logger.info("{}", i);
    }
    mpz_sub_ui(aMSub1, aM, 1);
    logger.info("sub1終わり");
    mpz_gcd(g, aMSub1, n);
    logger.info("gcd終わり");
    if (mpz_cmp_ui(g, 1) == 0) {
      System.err.println("失敗！");
    } else {
      var length = mpz_sizeinbase(g, 10) + 2;
      var str = auto.allocate(length);
      mpz_get_str(str, 10, g);
      System.out.printf("%s%n", str.getString(0));
    }
    return ExitCode.OK;
  }

  @Command(name = "func64")
  private int func64(Path out) throws IOException {
    var auto = Arena.ofAuto();
    var n = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(n);
    var n1 = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(n1, 2);
    var n2 = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(n2, 3);
    var list = new ArrayList<String>();
    for (int i = 0; i < 100000; i++) {
      mpz_add(n, n1, n2);
      var length = mpz_sizeinbase(n, 10) + 2;
      if (length >= 2000 && mpz_probab_prime_p(n, 25) != 0) {
        var str = auto.allocate(length);
        mpz_get_str(str, 10, n);
        var string = str.getString(0);
        var digits = string.length();
        list.add(string);
        System.out.printf("found!: %d digits%n", digits);
      }
      mpz_set(n2, n1);
      mpz_set(n1, n);
    }
    Files.write(out, list, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
    return ExitCode.OK;
  }

  @Command
  private int factor10000() throws IOException, URISyntaxException {
    var str = "63529558055459718210391058799874345232783234192120118276312232446566517401551249602339305319372117036603519718772378093500083747384812167149125168170717999213640668053797792662716000512954843521760617338947764172481677130521431589885724261746560364886780629044704172341435383508992974538866504256360733856403561579794360855546282196276539211737198620768157116228439356792847423415989^41*15327058301332340016287814609565616926273744053943566590099944603730582892019627075587812437053520204863172592158727025072630605392375609329569197783388053801993077119727527778108549415469001469425833324258043514956926966012618722695174942112853494623463134469300482746206479721454308901091751207192010934017957239^42*3070015446655583962789178454782208623133099199687276628796294396536365534382638004080603586373634270724284704600247833958054308593920308643319253463112892159243299895986796629714596777696220971430205318142574940735221967677^43*371142952202004908520742456558671208113785047358603270996506951511688598073250410155273923770465341572789494610149745896313767301924109997945371844300967154150261087059622618407748759554315255003926453^44*672691656368135675039411225973562845113976699070816604085312130820587314553489232229487051712048681066355460990047333043501811914977486373909871714326823^45*5617760887041950660449107030941037321523547184514366729840091380310345107988868041952180379105516333435168258910774341^47*353187935722947762590775691614798857957252493944286561815882108025284954810881805438231011975529646020911805693^46*607543361583156856290828978502117222343204592535401589350129608976281294741501^48*11886250544808306781680499932959251187702298004393538241078332933057^49*712263992451816173657734377094326023734472998209120238003^50*69096121608483640052548810110682893100063491703637^51*5374613548349518083717018769882844241928287862810231^40*1046903967016023902539776572542665641^54*24060581762701535131589025916732266917^52*7214781776474735698818470387701001^53*1037793702558212145395617^56*2370246348458581727^57*10301733639591235493^55*1711914026665907^59*3068689788020071^58*697641334361^63*1749079041013^61*4563676729^62*9473323417^60*6188209^66*7566179^65*22499^69*9797^75*11021^74*16637^71*19043^70*25591^68*47053^64*3599^84*12317^73*28891^67*43^92*53^87*89^77*2^497*3^313*5^214*7^177*11^144*13^134*19^117*23^110*29^102*31^100*41^93*67^82*71^81*73^80*79^79*83^78*17^121*37^95*47^89+";
    var encoded = URLEncoder.encode(str, StandardCharsets.UTF_8);
    var reportUrlBase = "https://factordb.com/reportfactor.php";
    for (int i = 2489; i <= 5000; i++) {
      var requestUrl = new URI(ENDPOINT + encoded + i).toURL();
      var requestConnection = (HttpsURLConnection) requestUrl.openConnection();
      if (FactorDatabase.FDB_USER_ID != null) {
        requestConnection.setRequestProperty("Cookie", FDB_USER_COOKIE);
      }
      JsonNode root;
      try (var in = new BufferedReader(
          new InputStreamReader(new BufferedInputStream(requestConnection.getInputStream())))) {
        var line = in.readLine();
        root = OBJECT_MAPPER.readTree(line);
      }
      var id = root.get("id").longValue();
      var status = root.get("status").textValue();
      System.err.printf("request offset %4d: id: %d, status: %s%n", i, id, status);
      if (status.equals("C") || status.equals("U")) {
        var reportConnection = (HttpsURLConnection) URI.create(reportUrlBase).toURL()
            .openConnection();
        reportConnection.setRequestMethod("POST");
        if (FactorDatabase.FDB_USER_ID != null) {
          reportConnection.setRequestProperty("Cookie", FDB_USER_COOKIE);
        }
        reportConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        reportConnection.setDoOutput(true);
        try (var writer = new BufferedWriter(
            new OutputStreamWriter(reportConnection.getOutputStream()))) {
          writer.write("id=" + id + "&factor=" + i);
        }

        reportConnection.getResponseCode();
        try (var in2 = new BufferedReader(
            new InputStreamReader(new BufferedInputStream(reportConnection.getInputStream())))) {
          var line = in2.readLine();
          System.err.println(line);
          System.err.printf(" report offset %4d%n", i);
        }
      }
    }
    return ExitCode.OK;
  }

  @Command
  private int split100000() {
    IntStream.range(2, 15000).filter(i -> BigInteger.valueOf(i).isProbablePrime(1)).forEach(i -> {
      var l = ((int) Math.round((100000 / 1773.) / log10(i)));
      System.out.printf("%d^%d*%n", i, l);
    });
    return ExitCode.OK;
  }

  @Command(name = "func642")
  private int func642(@Option(names = {"--offset"}, defaultValue = "0") int offset,
      @Option(names = {"--max"}, defaultValue = "100000") int max)
      throws IOException, InterruptedException {
    logger.info("GO!!!");
    for (int i = offset; i < max; i++) {
      var url = URI.create(
          ENDPOINT + URLEncoder.encode(String.format("(7*I(%1$d)-Lucas(%1$d))/2", i),
              StandardCharsets.UTF_8)).toURL();
      HttpsURLConnection connection;
      int responseCode;
      do {
        connection = (HttpsURLConnection) url.openConnection();
        if (FactorDatabase.FDB_USER_ID != null) {
          connection.setRequestProperty("Cookie", FDB_USER_COOKIE);
        }
        responseCode = connection.getResponseCode();
        if (responseCode == 429) {
          logger.info("Too many requests, sleeping...");
          Thread.sleep(300000);
        }
      } while (responseCode != 200);
      JsonNode root;
      try (var in = new BufferedInputStream(connection.getInputStream())) {
        root = OBJECT_MAPPER.readTree(in);
      }
      var idNode = root.get("id");
      var statusNode = root.get("status");
      if (idNode.isNull()) {
        logger.info("{}: id is null, status: {}", i,
            statusNode.isNull() ? "null" : statusNode.textValue());
      } else {
        logger.info("{}: id: {}, status: {}", i,
            idNode.getNodeType() == JsonNodeType.STRING ? idNode.asText() : idNode.asLong(),
            statusNode.textValue());
      }
      connection.disconnect();
    }
    return ExitCode.OK;
  }

  @Command
  private int libraryLoadSample(String path) {
    System.load(path);
    var libs = SymbolLookup.loaderLookup();
    var linker = Linker.nativeLinker();
    var msieveObjNew = linker.downcallHandle(libs.find("msieve_obj_new").orElseThrow(),
        FunctionDescriptor.of(ADDRESS, ADDRESS, JAVA_INT, ADDRESS, ADDRESS, ADDRESS, JAVA_INT,
            JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
    System.out.printf("done! %s%n", msieveObjNew);
    return ExitCode.OK;
  }

  @Command
  private int composite(Path inPath,
      @Option(names = {"--primes", "-p"}, defaultValue = "16") int primes) throws IOException {
    var randomGenerator = RandomGenerator.of("SecureRandom");
    var auto = Arena.ofAuto();
    List<Path> paths;
    try (var lines = Files.lines(inPath, StandardCharsets.UTF_8)) {
      paths = lines.filter(l -> !l.startsWith("#")).map(Path::of).toList();
    }
    long[] sizeArray = new long[paths.size()];
    long sumOfSize = 0L;
    // TODO 素数リソースを分離して依存性注入可能にする
    for (int i = 0, pathsSize = paths.size(); i < pathsSize; i++) {
      var path = paths.get(i);
      sizeArray[i] = path.getFileSystem().provider()
          .getFileAttributeView(path, BasicFileAttributeView.class).readAttributes().size();
      sumOfSize += sizeArray[i];
    }
    var numOfElements = sumOfSize / 8L;
    var n = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(n, 1);
    var p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(p);
    for (int i = 0; i < primes; i++) {
      var pickUpIndex = randomGenerator.nextLong(numOfElements);
      var offset = pickUpIndex * 8L;
      int fileID = 0;
      while (offset >= sizeArray[fileID]) {
        offset -= sizeArray[fileID];
        fileID++;
      }
      long prime;
      try (var file = new RandomAccessFile(paths.get(fileID).toFile(), "r")) {
        file.seek(offset);
        prime = file.readLong();
      }
      mpz_set_u64(p, prime);
      mpz_mul(n, n, p);
      System.out.println(Long.toUnsignedString(prime));
    }
    var length = mpz_sizeinbase(n, 10) + 2;
    var str = auto.allocate(length);
    mpz_get_str(str, 10, n);
    System.out.println(str.getString(0));
    return ExitCode.OK;
  }

  @Command
  private int lookup(Path inPath,
      @Option(names = {"--primes", "-p"}, defaultValue = "1") int primes,
      @Option(names = {"--num", "-n"}, defaultValue = "16") int num) throws IOException {
    var randomGenerator = RandomGenerator.of("SecureRandom");
    var auto = Arena.ofAuto();
    List<Path> paths;
    try (var lines = Files.lines(inPath, StandardCharsets.UTF_8)) {
      paths = lines.map(String::trim).filter(l -> !l.startsWith("#")).map(Path::of).toList();
    }
    long[] sizeArray = new long[paths.size()];
    long sumOfSize = 0L;
    // TODO 素数リソースを分離して依存性注入可能にする
    for (int i = 0, pathsSize = paths.size(); i < pathsSize; i++) {
      var path = paths.get(i);
      sizeArray[i] = path.getFileSystem().provider()
          .getFileAttributeView(path, BasicFileAttributeView.class).readAttributes().size();
      sumOfSize += sizeArray[i];
    }
    var numOfElements = sumOfSize / 8L;
    var n = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(n);
    var p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(p);
    for (int i = 0; i < num; i++) {
      mpz_set_ui(n, 1);

      for (int j = 0; j < primes; j++) {
        var pickUpIndex = randomGenerator.nextLong(numOfElements);
        var offset = pickUpIndex * 8L;
        int fileID = 0;
        while (offset >= sizeArray[fileID]) {
          offset -= sizeArray[fileID];
          fileID++;
        }
        long prime;
        try (var file = new RandomAccessFile(paths.get(fileID).toFile(), "r")) {
          file.seek(offset);
          prime = file.readLong();
        }
        // TODO 使用済みの素数を0で塗りつぶす機能
        mpz_set_u64(p, prime);
        mpz_mul(n, n, p);
      }
      var length = mpz_sizeinbase(n, 10) + 2;
      var str = auto.allocate(length);
      mpz_get_str(str, 10, n);
      System.out.println(str.getString(0));
    }
    return ExitCode.OK;
  }

  @Command
  private int logNormal() {
    var distribution = LogNormalDistribution.of(Math.log(Math.sqrt(1.1)), 114. / 514);
    var sampler = distribution.createSampler(
        new JDKRandomWrapper((Random) RandomGenerator.of("SecureRandom")));
    for (int i = 0; i < 16; i++) {
      var sample = sampler.sample();
      System.out.printf("%f, %016x%n", sample, Double.doubleToLongBits(sample));
    }
    return ExitCode.OK;
  }

  @Command
  private int distributionRandomDigitsPrime() throws IOException {
    var auto = Arena.ofAuto();
    var min = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(min);
    var window = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(window);

    var state = __gmp_randstate_struct.allocate(auto).reinterpret(auto, gmp_h::gmp_randclear);
    gmp_randinit_default(state);
    Project19.initRandomState(state);

    var p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(p);
    int exponent;
    for (int i = 0; i < 2000; i++) {
      mpz_set_ui(min, 10);
      exponent = SECURE_RANDOM_GENERATOR.nextInt(18, 150);
      mpz_pow_ui(min, min, exponent);
      mpz_mul_ui(window, min, 9);

      mpz_urandomm(p, state, window);
      mpz_add(p, p, min);
      mpz_nextprime(p, p);

      var length = mpz_sizeinbase(p, 10) + 2;
      var str = auto.allocate(length);
      mpz_get_str(str, 10, p);

      var primeString = str.getString(0);
      var url = URI.create(ENDPOINT + primeString).toURL();
      var root = OBJECT_MAPPER.readTree(url);
      var id = root.get("id");
      var status = root.get("status");
      System.out.printf("%s<%d>: %s%n", id.isTextual() ? id.textValue() : id.longValue(),
          primeString.length(), status.textValue());
    }
    return ExitCode.OK;
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
