package com.github.teruteru128.study;

import static com.github.teruteru128.bitmessage.app.Spammer.requestBuilder;
import static com.github.teruteru128.gmp.gmp_h.gmp_randinit_default;
import static com.github.teruteru128.gmp.gmp_h.gmp_randseed;
import static com.github.teruteru128.gmp.gmp_h.mp_get_memory_functions;
import static com.github.teruteru128.gmp.gmp_h.mpz_add;
import static com.github.teruteru128.gmp.gmp_h.mpz_add_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_cmp;
import static com.github.teruteru128.gmp.gmp_h.mpz_cmp_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_divisible_p;
import static com.github.teruteru128.gmp.gmp_h.mpz_export;
import static com.github.teruteru128.gmp.gmp_h.mpz_gcd;
import static com.github.teruteru128.gmp.gmp_h.mpz_get_str;
import static com.github.teruteru128.gmp.gmp_h.mpz_import;
import static com.github.teruteru128.gmp.gmp_h.mpz_init;
import static com.github.teruteru128.gmp.gmp_h.mpz_init_set;
import static com.github.teruteru128.gmp.gmp_h.mpz_init_set_str;
import static com.github.teruteru128.gmp.gmp_h.mpz_init_set_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_mod;
import static com.github.teruteru128.gmp.gmp_h.mpz_mul;
import static com.github.teruteru128.gmp.gmp_h.mpz_mul_2exp;
import static com.github.teruteru128.gmp.gmp_h.mpz_mul_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_nextprime;
import static com.github.teruteru128.gmp.gmp_h.mpz_pow_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_powm;
import static com.github.teruteru128.gmp.gmp_h.mpz_prevprime;
import static com.github.teruteru128.gmp.gmp_h.mpz_probab_prime_p;
import static com.github.teruteru128.gmp.gmp_h.mpz_set;
import static com.github.teruteru128.gmp.gmp_h.mpz_set_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_sizeinbase;
import static com.github.teruteru128.gmp.gmp_h.mpz_sub;
import static com.github.teruteru128.gmp.gmp_h.mpz_sub_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_ui_pow_ui;
import static com.github.teruteru128.gmp.gmp_h.mpz_urandomm;
import static com.github.teruteru128.study.FactorDBSpamming.ID_ENDPOINT;
import static com.github.teruteru128.study.FactorDBSpamming.OBJECT_MAPPER;
import static com.github.teruteru128.study.FactorDBSpamming.QUERY_ENDPOINT;
import static com.github.teruteru128.study.FactorDatabase.FDB_USER_COOKIE;
import static com.github.teruteru128.util.gmp.mpz.Functions.mpz_fits_ulong_p;
import static com.github.teruteru128.util.gmp.mpz.Functions.mpz_get_u64;
import static com.github.teruteru128.util.gmp.mpz.Functions.mpz_set_u64;
import static java.lang.foreign.MemorySegment.NULL;
import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_BYTE;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
import static java.math.BigInteger.ONE;
import static java.math.BigInteger.TWO;
import static java.math.BigInteger.valueOf;
import static java.net.URI.create;
import static java.net.URLEncoder.encode;
import static java.nio.charset.StandardCharsets.UTF_8;

import com.github.teruteru128.bitmessage.Const;
import com.github.teruteru128.bitmessage.Message;
import com.github.teruteru128.encode.Base58;
import com.github.teruteru128.gmp.__gmp_get_memory_functions$x2;
import com.github.teruteru128.gmp.__gmp_randstate_struct;
import com.github.teruteru128.gmp.__mpz_struct;
import com.github.teruteru128.gmp.gmp_h;
import com.github.teruteru128.study.converters.MPZConverter;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.math.BigInteger;
import java.net.ConnectException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.security.spec.InvalidKeySpecException;
import java.sql.SQLException;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HexFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Semaphore;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.LongPredicate;
import java.util.function.Predicate;
import java.util.random.RandomGenerator;
import java.util.regex.Pattern;
import java.util.stream.Gatherers;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.net.ssl.HttpsURLConnection;
import org.apache.commons.rng.simple.JDKRandomWrapper;
import org.apache.commons.rng.simple.RandomSource;
import org.apache.commons.statistics.descriptive.DoubleStatistics;
import org.apache.commons.statistics.descriptive.Statistic;
import org.apache.commons.statistics.distribution.LogNormalDistribution;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlite.SQLiteDataSource;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.HelpCommand;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import tools.jackson.databind.JsonNode;

// FIXME サブコマンドをここに並べるのではなく、サービスローダーを使ってサービスとして読み込ませられないか？

@Command(subcommands = {AddressCalc4.class, AddressCalc5.class, CreateLargeSieveTask.class,
    ECIESSample.class, PrimeSearch.class, Updater.class, HelpCommand.class, SlimeSearch.class,
    OwnerCheck.class, CalcBustSize.class, Deterministic.class, CreateCandidateDB.class,
    SmallSievePrimeCounter.class, NewColorGenerator.class, InsertPrimeNumberVerifyTask.class,
    WindowsPathChecker.class, CreateSmallSieve.class}, mixinStandardHelpOptions = true)
public class Factory implements Callable<Integer> {

  public static final int ARRAY_ELEMENTS_MAX = 2147483645;
  public static final RandomGenerator SECURE_RANDOM_GENERATOR = RandomGenerator.of("SecureRandom");
  public static final LongPredicate LONG_PREDICATE = l -> !(l % 2 == 1 || l % 3 == 0 || l % 4 == 2
                                                            || l % 8 == 0 || l % 10 == 6
                                                            || l % 11 == 0 || l % 11 == 10
                                                            || l % 12 == 4 || l % 18 == 16
                                                            || l % 22 == 8 || l % 23 == 19
                                                            || l % 35 == 15 || l % 37 == 35
                                                            || l % 52 == 40 || l % 83 == 49
                                                            || l % 92 == 56 || l % 95 == 53
                                                            || l % 119 == 74 || l % 130 == 4
                                                            || l % 131 == 58 || l % 162 == 122
                                                            || l % 244 == 16 || l % 251 == 6
                                                            || l % 262 == 110 || l % 268 == 40
                                                            || l % 305 == 274 || l % 310 == 78
                                                            || l % 359 == 102 || l % 397 == 352
                                                            || l % 418 == 196 || l % 419 == 58
                                                            || l % 443 == 355 || l % 466 == 8
                                                            || l % 515 == 157 || l % 562 == 482
                                                            || l % 577 == 164 || l % 601 == 32
                                                            || l % 611 == 216 || l % 618 == 374
                                                            || l % 635 == 149 || l % 639 == 419
                                                            || l % 658 == 402 || l % 719 == 354
                                                            || l % 723 == 434 || l % 734 == 252
                                                            || l % 810 == 464 || l % 820 == 740
                                                            || l % 826 == 292 || l % 852 == 752
                                                            || l % 936 == 476 || l % 940 == 12
                                                            || l % 958 == 90 || l % 986 == 204
                                                            || l % 1044 == 596 || l % 1060 == 48
                                                            || l % 1060 == 1028 || l % 1076 == 448
                                                            || l % 1090 == 824 || l % 1119 == 326
                                                            || l % 1211 == 1083 || l % 1220 == 372
                                                            || l % 1251 == 692 || l % 1271 == 1156
                                                            || l % 1355 == 974 || l % 1359 == 1106
                                                            || l % 1400 == 988 || l % 1443 == 581
                                                            || l % 1522 == 1320 || l % 1539 == 149
                                                            || l % 1614 == 1532 || l % 1636 == 1408
                                                            || l % 1644 == 848 || l % 1664 == 172
                                                            || l % 1666 == 1478 || l % 1668 == 740
                                                            || l % 1679 == 1416 || l % 1700 == 1684
                                                            || l % 1746 == 248 || l % 1906 == 1362
                                                            || l % 1919 == 1769 || l % 1930 == 1120
                                                            || l % 1932 == 20 || l % 1948 == 232
                                                            || l % 1986 == 1256 || l % 2026 == 1990
                                                            || l % 2036 == 496 || l % 2042 == 36
                                                            || l % 2054 == 1160 || l % 2079 == 1160
                                                            || l % 2082 == 1394 || l % 2145 == 623
                                                            || l % 2163 == 707 || l % 2242 == 668
                                                            || l % 2266 == 1302 || l % 2291 == 397
                                                            || l % 2332 == 940 || l % 2344 == 380
                                                            || l % 2391 == 1790 || l % 2415 == 623
                                                            || l % 2559 == 1313 || l % 2620 == 88
                                                            || l % 2676 == 212 || l % 2709 == 122
                                                            || l % 2902 == 1428 || l % 2919 == 764
                                                            || l % 2939 == 2806 || l % 3018 == 2600
                                                            || l % 3036 == 1052 || l % 3174 == 1040
                                                            || l % 3272 == 596 || l % 3590 == 1398
                                                            || l % 3648 == 2540 || l % 3732 == 2936
                                                            || l % 3780 == 3092 || l % 3796 == 3100
                                                            || l % 3855 == 434 || l % 3879 == 377
                                                            || l % 3879 == 3749 || l % 3950 == 1880
                                                            || l % 3957 == 551 || l % 3968 == 2108
                                                            || l % 4012 == 2820 || l % 4132 == 140
                                                            || l % 4242 == 452 || l % 4282 == 1958
                                                            || l % 4362 == 3122 || l % 4406 == 4338
                                                            || l % 4876 == 2316 || l % 4972 == 216
                                                            || l % 5517 == 3170 || l % 5572 == 1300
                                                            || l % 5682 == 4298 || l % 5748 == 5144
                                                            || l % 5763 == 3164 || l % 5842 == 2924
                                                            || l % 6035 == 2300 || l % 6059 == 214
                                                            || l % 6084 == 1304 || l % 6100 == 1508
                                                            || l % 6172 == 4888 || l % 6348 == 1040
                                                            || l % 6352 == 2396 || l % 6579 == 3494
                                                            || l % 6848 == 5524 || l % 6868 == 636
                                                            || l % 7076 == 6776 || l % 7088 == 92
                                                            || l % 7284 == 6548 || l % 7374 == 1688
                                                            || l % 8532 == 5132 || l % 8660 == 6464
                                                            || l % 8970 == 8312 || l % 9356 == 2088
                                                            || l % 9732 == 6824 || l % 9959 == 1388
                                                            || l % 11130 == 1784
                                                            || l % 12748 == 4844
                                                            || l % 12990 == 4958
                                                            || l % 13044 == 1424
                                                            || l % 13177 == 11732
                                                            || l % 14326 == 10292
                                                            || l % 14388 == 980 || l % 14648 == 1244
                                                            || l % 14879 == 11732
                                                            || l % 15414 == 5492
                                                            || l % 16992 == 8468
                                                            || l % 17334 == 4940
                                                            || l % 17505 == 6113
                                                            || l % 18131 == 1292
                                                            || l % 19258 == 1124
                                                            || l % 20115 == 2372
                                                            || l % 21788 == 2852
                                                            || l % 23224 == 19760
                                                            || l % 23685 == 16037
                                                            || l % 24588 == 9056 || l % 25372 == 896
                                                            || l % 29428 == 6788
                                                            || l % 31258 == 3428
                                                            || l % 31532 == 13652
                                                            || l % 33584 == 13388
                                                            || l % 36778 == 8732 || l % 57802 == 188
                                                            || l % 61376 == 1004
                                                            || l % 62654 == 4940
                                                            || l % 63330 == 5732
                                                            || l % 67828 == 59558
                                                            || l % 69996 == 11684
                                                            || l % 70588 == 13460
                                                            || l % 90186 == 4052
                                                            || l % 95412 == 3380
                                                            || l % 191982 == 1820
                                                            || l % 216396 == 6260
                                                            || l % 342466 == 68
                                                            || l % 431428 == 60668
                                                            || l % 685460 == 500
                                                            || l % 756131 == 11732
                                                            || l % 888108 == 3404
                                                            || l % 1801669 == 6260
                                                            || l % 2084050 == 11684
                                                            || l % 2859431 == 2132
                                                            || l % 3236496 == 2060
                                                            || l % 3382146 == 5108
                                                            || l % 12549060 == 1844
                                                            || l % 13757948 == 3812
                                                            || l % 14429248 == 3548
                                                            || l % 21716962 == 6164
                                                            || l % 44564101 == 2324
                                                            || l % 49791324 == 2444
                                                            || l % 95330742 == 3140
                                                            || l % 110000116 == 644
                                                            || l % 234121386 == 2612
                                                            || l % 938070812 == 2828
                                                            || l % 1140196839 == 860
                                                            || l % 3234435810L == 3908
                                                            || l % 3303267723L == 3764
                                                            || l % 9145782796L == 620
                                                            || l % 22213917791L == 3980
                                                            || l % 40961148944L == 3980
                                                            || l % 182467288001L == 4028
                                                            || l % 17079842013412L == 2972
                                                            || l /*% 241601748305338693790*/
                                                               == 1772);
  public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(
      "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'nnnnnnnnn");
  private static final Logger logger = LoggerFactory.getLogger(Factory.class);
  private static final int EXIT_CODE_OK = ExitCode.OK;
  private static final int EXIT_CODE_SOFTWARE = ExitCode.SOFTWARE;
  private static final String ERROR_INVALID_FILE = "Error: File path is invalid or not a regular file";
  private static final String ERROR_TOO_MANY_ELEMENTS = "Error: Requested elements exceed file size: ";
  private static final String ERROR_BUFFER_TOO_LARGE = "Error: Requested elements (%d) cause buffer size overflow";
  private static final String ERROR_INCOMPLETE_READ = "Error: Failed to read requested bytes from file";
  private static final Semaphore SEMAPHORE = new Semaphore(4, true);
  private static final VarHandle LONG_HANDLE = MethodHandles.byteArrayViewVarHandle(long[].class,
      ByteOrder.BIG_ENDIAN);
  // byte配列をintとしてリトルエンディアンで読み込むためのVarHandleを取得
  // SHA-1ハッシュの長さ20バイトはint 5つ分に相当
  private static final VarHandle LITTLE_ENDIAN_INT_HANDLE = MethodHandles.byteArrayViewVarHandle(
      int[].class, ByteOrder.LITTLE_ENDIAN);
  private static final VarHandle LITTLE_ENDIAN_LONG_HANDLE = MethodHandles.byteArrayViewVarHandle(
      long[].class, ByteOrder.LITTLE_ENDIAN);

  private Factory() {
  }

  /**
   * Callableをnewして返すファクトリにするはずだったんだけどなあ……
   *
   */
  public static Callable<Integer> createInstance() {
    return new Factory();
  }

  public static void seedRandomState(MemorySegment state) {
    var auto = Arena.ofAuto();
    var seed = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(seed);
    var elementCount = 2493;
    var seedNativeSegment = auto.allocate(JAVA_BYTE, elementCount);
    MemorySegment.copy(((SecureRandom) SECURE_RANDOM_GENERATOR).generateSeed(elementCount), 0,
        seedNativeSegment, JAVA_BYTE, 0, elementCount);
    mpz_import(seed, elementCount, 1, 1, 0, 0, seedNativeSegment);
    gmp_randseed(state, seed);
  }

  // FIXME Bitmessageクライアントクラスに分割してclientをメソッド引数から消す
  public static void post(HttpClient client, Message message)
      throws IOException, InterruptedException {
    var encoder = Base64.getEncoder();
    // FIXME シリアライズの責任の分割
    var body = "{\"jsonrpc\":\"2.0\",\"method\":\"sendMessage\",\"params\":[\"%s\",\"%s\",\"%s\",\"%s\",%d,%d],\"id\":1}".formatted(
        message.to(), message.from(), encoder.encodeToString(message.subject().getBytes(UTF_8)),
        encoder.encodeToString(message.message().getBytes(UTF_8)), message.encodingType(),
        message.ttl());
    client.send(requestBuilder.POST(BodyPublishers.ofString(body)).build(), BodyHandlers.ofString())
        .body();
  }

  private static TreeSet<String> filterBySentAddressSet(List<@NotNull String> addresses)
      throws SQLException {
    var addressTreeSet = new TreeSet<>(addresses);
    var source = new SQLiteDataSource();
    source.setUrl(Objects.requireNonNull(System.getenv("DB_URL")));
    try (var con = source.getConnection()) {
      try (var statement = con.createStatement()) {
        try (var resultSet = statement.executeQuery(
            "SELECT toAddress from sent where folder = 'sent' and datetime(senttime, 'unixepoch', 'localtime') >= '2025-09-21 18:00:00';")) {
          while (resultSet.next()) {
            addressTreeSet.remove(resultSet.getString("toAddress"));
          }
        }
      }
    }
    return addressTreeSet;
  }

  private static Optional<JsonNode> queryToFactorDB(URL url)
      throws IOException, InterruptedException {
    HttpsURLConnection connection;
    JsonNode root;
    int code;
    SEMAPHORE.acquire();
    try {
      int retryCount = 0;
      do {
        connection = (HttpsURLConnection) url.openConnection();
        connection.setRequestProperty("Cookie", FDB_USER_COOKIE);
        code = connection.getResponseCode();
        // see https://share.google/aimode/EhXggJ6d7Xl0tKvw4
        if (code == 429) {
          var retryAfterHeader = connection.getHeaderField("Retry-After");
          if (retryAfterHeader != null) {
            try {
              // 値が秒数の場合
              var seconds = Long.parseLong(retryAfterHeader);
              Thread.sleep(seconds * 1000);
            } catch (NumberFormatException e) {
              // 値がHTTP日付形式の場合
              try {
                DateTimeFormatter formatter = DateTimeFormatter.RFC_1123_DATE_TIME;
                Instant retryAfterInstant = Instant.from(formatter.parse(retryAfterHeader));
                long delay = Duration.between(Instant.now(), retryAfterInstant).toMillis();
                if (delay > 0) {
                  System.out.println(
                      "Waiting until " + retryAfterHeader + " as per Retry-After header.");
                  Thread.sleep(delay);
                }
              } catch (Exception dateException) {
                // 日付形式も解析できない場合は、デフォルトのバックオフに移行する
                handleExponentialBackoff(retryCount++);
              }
            }
            // 再試行
          } else {
            // ヘッダーがない場合は、デフォルトのバックオフに移行する
            handleExponentialBackoff(retryCount++);
          }
        }
      } while (code != HttpsURLConnection.HTTP_OK);
    } finally {
      SEMAPHORE.release();
    }
    if (!connection.getContentType().startsWith("application/json")) {
      logger.error("!Content-Type: {}", connection.getContentType());
      return Optional.empty();
    }
    try (var inputStream = connection.getInputStream()) {
      root = OBJECT_MAPPER.readTree(inputStream);
    }
    return Optional.of(root);
  }

  private static void handleExponentialBackoff(int retryCount) throws InterruptedException {
    final int MAX_RETRIES = 5;
    if (retryCount >= MAX_RETRIES) {
      throw new RuntimeException("Max retries exceeded");
    }

    // 2^retryCount * 1000ms をベースにランダムなジッターを加える
    long baseSleepTimeMs = (long) Math.pow(2, retryCount) * 1000;
    long jitter = new Random().nextInt(1000); // 0msから1000msのランダムな遅延
    long sleepTimeMs = baseSleepTimeMs + jitter;

    System.out.println(
        "No Retry-After header. Applying exponential backoff: Waiting for " + sleepTimeMs
        + " ms. Retry count: " + retryCount);

    // スレッドを安全にスリープさせる
    Thread.sleep(sleepTimeMs);
  }

  public static Optional<JsonNode> queryByID(String id) throws IOException, InterruptedException {
    var url = create(ID_ENDPOINT + id).toURL();
    return queryToFactorDB(url);
  }

  private static Optional<JsonNode> queryMPZ(MemorySegment p)
      throws IOException, InterruptedException {
    var auto = Arena.ofAuto();
    var string = mpzToString(auto, p, 10);
    var url = create(QUERY_ENDPOINT + encode(string, UTF_8)).toURL();
    var optional = queryToFactorDB(url);
    if (optional.isPresent()) {
      var root = optional.get();
      var id = root.get("id");
      var status = root.get("status");
      logger.info("https://factordb.com/index.php?id={} : {}", id.asText(), status.textValue());
    }
    return optional;
  }

  private static MemorySegment newMpzStr(Arena auto, String str, int base) {
    var b = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_str(b, auto.allocateFrom(str), base);
    return b;
  }

  private static MemorySegment newMpzUi(Arena auto, int op) {
    var b = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_ui(b, op);
    return b;
  }

  private static MemorySegment newMpzUi(Arena auto, long op) {
    var b = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(b);
    mpz_set_u64(b, op);
    return b;
  }

  public static String mpzToString(Arena auto, MemorySegment n2, int base) {
    var length2 = mpz_sizeinbase(n2, base) + 2;
    var buf2 = auto.allocate(length2);
    mpz_get_str(buf2, base, n2);
    return buf2.getString(0);
  }

  /**
   * C言語のオリジナルコードのロジック（メモリ上の最下位ビットからのゼロカウント）を速度優先で再現します。
   * @param hash SHA-1ハッシュバイト配列 (長さ20)
   * @return 末尾ゼロビット数
   * @see <a href="https://share.google/aimode/Q3yNgJ2awUH9xLlCh">Google AI</a>
   */
  public static int countTrailingZeroBits(byte[] hash) {
    long l1 = (long) LITTLE_ENDIAN_LONG_HANDLE.get(hash, 0);
    if (l1 != 0L) {
      return Long.numberOfTrailingZeros(l1);
    }
    long l2 = (long) LITTLE_ENDIAN_LONG_HANDLE.get(hash, 8);
    if (l2 != 0L) {
      return 64 + Long.numberOfTrailingZeros(l2);
    }
    int i3 = (int) LITTLE_ENDIAN_INT_HANDLE.get(hash, 16);
    if (i3 != 0) {
      return 128 + Integer.numberOfTrailingZeros(i3);
    }
    return 160;
  }

  /** 非効率な{@code String.valueOf()}を避けるための高速ASCIIエンコードヘルパー */
  private static int encodeUnsignedIntAscii(long value, byte[] buffer, int offset) {
    int len;
    if (value >= 0) {
      len = (value < 10) ? 1 : (value < 100) ? 2 : (value < 1000) ? 3 : (value < 10000) ? 4
          : (value < 100000) ? 5 : (value < 1000000) ? 6 : (value < 10000000) ? 7
              : (value < 100000000) ? 8 : (value < 1000000000) ? 9 : (value < 10000000000L) ? 10
                  : (value < 100000000000L) ? 11 : (value < 1000000000000L) ? 12
                      : (value < 10000000000000L) ? 13 : (value < 100000000000000L) ? 14
                          : (value < 1000000000000000L) ? 15 : (value < 10000000000000000L) ? 16
                              : (value < 100000000000000000L) ? 17
                                  : (value < 1000000000000000000L) ? 18 : 19;
      int pos = offset + len;
      long temp = value;
      do {
        buffer[--pos] = (byte) ('0' + (temp % 10));
        temp /= 10;
      } while (temp > 0);
    } else {
      // 負の値の場合（最大値付近の符号なしlongを意味する）は、
      // 効率的な除算と剰余のために特別な処理を行う
      // これは標準ライブラリの Long.toUnsignedString の手法を模倣している
      len = 0;
      // 10進数の除算を正しく行うためのビット演算トリック
      long temp = value;

      // 負の数に対する高速な符号なし除算・剰余演算
      // このループは最大で20回程度実行される
      while (temp != 0) {
        // q = temp / 10 (符号なし)
        long q = (temp >>> 1) / 5;
        // r = temp % 10 (符号なし)
        int r = (int) (temp - q * 10);

        buffer[offset + len++] = (byte) ('0' + r);
        temp = q;
      }

      // 結果は逆順になるため反転させる
      for (int i = 0; i < len / 2; i++) {
        byte t = buffer[offset + i];
        buffer[offset + i] = buffer[offset + len - 1 - i];
        buffer[offset + len - 1 - i] = t;
      }

      // longの最大値近辺の値 (value == -1 の場合 "18446744073709551615")
      // のエンコード長は20桁なので、バッファサイズに注意が必要
    }
    return len;
  }

  /**
   *
   * @param n mpz_t
   * @return n converted to a BigInteger.
   */
  private static BigInteger mpzToBigInteger(MemorySegment n) {
    var auto = Arena.ofAuto();
    var countP = auto.allocate(JAVA_LONG);
    var seg = auto.allocate((mpz_sizeinbase(n, 2) + 7) / 8);
    var pSegment = mpz_export(seg, countP, 0, JAVA_BYTE.byteSize(), 0, 0, n);
    pSegment = pSegment.reinterpret(countP.getAtIndex(JAVA_LONG, 0));
    var pA = pSegment.toArray(JAVA_BYTE);
    var sign = BigInteger.valueOf(Integer.compare(__mpz_struct._mp_size(n), 0));
    if ((pA[0] & 0x80) != 0) {
      var tmp = new byte[pA.length + 1];
      System.arraycopy(pA, 0, tmp, 1, pA.length);
      return new BigInteger(tmp).multiply(sign);
    }
    return new BigInteger(pA).multiply(sign);
  }

  @Command
  private int generatePenis(@Parameters(arity = "1") Path dir,
      @Option(names = {"--prefix", "-p"}, defaultValue = "out") String prefix,
      @Option(names = {"--exp-mu", "-m"}, defaultValue = "20") double expMu,
      @Option(names = {"--sigma", "-s"}, defaultValue = "1") double sigma) throws IOException {
    if (!Files.isDirectory(dir)) {
      logger.error("dir must be directory!");
      return ExitCode.SOFTWARE;
    }
    var distribution = LogNormalDistribution.of(Math.log(expMu), sigma);
    var sampler = distribution.createSampler(
        new JDKRandomWrapper((SecureRandom) SECURE_RANDOM_GENERATOR));
    logger.info("generate...");
    var array = sampler.samples(2000000000).parallel().toArray();
    logger.info("generated");
    var builder = DoubleStatistics.builder(Statistic.MAX, Statistic.MIN, Statistic.MEAN,
        Statistic.STANDARD_DEVIATION);
    var outTxtPath = dir.resolve(Path.of(prefix + ".txt"));
    logger.info("text output...");
    try (var writer3 = new PrintWriter(
        new BufferedWriter(new FileWriter(outTxtPath.toFile()), 0x7fffffff - 2), false)) {
      for (var v : array) {
        writer3.println(v);
      }
      writer3.flush();
    }
    logger.info("text output done");
    var outBinPath = dir.resolve(Path.of(prefix + ".bin"));
    logger.info("bin output...");
    try (var stream = new DataOutputStream(
        new BufferedOutputStream(new FileOutputStream(outBinPath.toFile()), 0x7fffffff - 2))) {
      for (var v : array) {
        stream.writeDouble(v);
      }
    }
    logger.info("bin output done");
    logger.info("sort");
    Arrays.parallelSort(array);
    logger.info("sort done");
    var outSortedBinPath = dir.resolve(Path.of(prefix + "-sorted.bin"));
    logger.info("sorted bin output");
    try (var stream = new DataOutputStream(
        new BufferedOutputStream(new FileOutputStream(outSortedBinPath.toFile()),
            0x7fffffff - 2))) {
      for (var v : array) {
        stream.writeDouble(v);
      }
    }
    logger.info("sorted bin output done");
    logger.info("statistics generate");
    var statistics = Arrays.stream(array).parallel()
        .collect(builder::build, DoubleConsumer::accept, DoubleStatistics::combine);
    var median = (array[999999999] + array[1000000000]) / 2;
    var max = statistics.getAsDouble(Statistic.MAX);
    var min = statistics.getAsDouble(Statistic.MIN);
    var mean = statistics.getAsDouble(Statistic.MEAN);
    var standardDeviation = statistics.getAsDouble(Statistic.STANDARD_DEVIATION);
    logger.info("statistics generated");
    var outConfigPath = dir.resolve(Path.of(prefix + "-config.txt"));
    logger.info("config output");
    try (var writer = new PrintWriter(
        Files.newBufferedWriter(outConfigPath, StandardOpenOption.CREATE,
            StandardOpenOption.WRITE))) {
      var line1 = String.format("μ=log(%s), σ=%s", expMu, sigma);
      var line2 = String.format("min=%s, max=%s, mean=%s, median=%s, standard deviation=%s", min,
          max, mean, median, standardDeviation);
      System.out.println(line1);
      System.out.println(line2);
      writer.println(line1);
      writer.println(line2);
    }
    logger.info("config output done");
    return ExitCode.OK;
  }

  @Command(name = "headDouble")
  public int headDouble(Path filePath, @Option(names = {"-n",
          "--elements"}, defaultValue = "20", description = "Number of double elements to read") long elements,
      @Option(names = {"-o", "--offset"}) long offset) throws IOException {
    return readDoubles(filePath, elements, offset, ReadMode.HEAD);
  }

  @Command(name = "tailDouble")
  public int tailDouble(Path filePath, @Option(names = {"-n",
          "--elements"}, defaultValue = "20", description = "Number of double elements to read") long elements,
      @Option(names = {"-o", "--offset"}) long offset) throws IOException {
    return readDoubles(filePath, elements, offset, ReadMode.TAIL);
  }

  @Command(name = "Format-Double")
  public int formatDouble(Path path, @Option(names = "--count") long count,
      @Option(names = "offset") long offset) {
    return ExitCode.OK;
  }

  private int readDoubles(Path filePath, long elements, long offset, ReadMode mode)
      throws IOException {
    // ファイルの検証
    if (!isValidFile(filePath)) {
      System.err.println(ERROR_INVALID_FILE);
      return EXIT_CODE_SOFTWARE;
    }

    // ファイルサイズの検証
    long fileSize = Files.size(filePath);
    long requiredBytes;
    try {
      requiredBytes = Math.multiplyExact(elements, Double.BYTES); // オーバーフロー検出
    } catch (ArithmeticException e) {
      System.err.printf(ERROR_BUFFER_TOO_LARGE, elements);
      System.err.println();
      return EXIT_CODE_SOFTWARE;
    }
    if (fileSize < requiredBytes + offset) {
      System.err.println(ERROR_TOO_MANY_ELEMENTS + fileSize);
      return EXIT_CODE_SOFTWARE;
    }

    // ファイルの読み込み
    try (var channel = (FileChannel) Files.newByteChannel(filePath,
        StandardOpenOption.READ); var arena = Arena.ofConfined()) {
      // 読み込み位置の設定
      if (mode == ReadMode.TAIL) {
        channel.position(fileSize - (requiredBytes + offset));
      } else if (mode == ReadMode.HEAD) {
        channel.position(offset);
      }

      // MemorySegment の割り当て
      var segment = arena.allocate(requiredBytes);
      // FileChannel から MemorySegment に直接読み込み
      if (channel.read(segment.asByteBuffer()) != requiredBytes) {
        System.err.println(ERROR_INCOMPLETE_READ);
        return EXIT_CODE_SOFTWARE;
      }

      // 結果の出力
      var layout = ValueLayout.JAVA_DOUBLE.withOrder(ByteOrder.BIG_ENDIAN);
      for (long i = 0; i < elements; i++) {
        var value = segment.get(layout, i * Double.BYTES);
        System.out.println(value);
      }
    }

    return EXIT_CODE_OK;
  }

  private boolean isValidFile(Path filePath) {
    return Files.exists(filePath) && Files.isRegularFile(filePath);
  }

  @Command
  private int sample(@Option(names = {"-n"}, defaultValue = "100") int n) {
    double expMu = 20;
    double sigma = 1.25;
    var distribution = LogNormalDistribution.of(Math.log(expMu), sigma);
    var sampler = distribution.createSampler(
        new JDKRandomWrapper((SecureRandom) SECURE_RANDOM_GENERATOR));
    IntStream.range(0, n).mapToDouble(_ -> sampler.sample()).sorted()
        .forEachOrdered(System.out::println);
    return ExitCode.OK;
  }

  @Command
  private int searchPrime() {
    var base = valueOf(107).pow(1000).multiply(TWO);
    var co = valueOf(10).pow(18);
    long count = 0;
    long num = 2;
    while (true) {
      var n = base.multiply(co);
      var nAdd1 = n.add(ONE);
      if (nAdd1.isProbablePrime(1)) {
        System.out.println("n * " + co + " + 1");
        count++;
      }
      var nSub1 = n.subtract(ONE);
      if (nSub1.isProbablePrime(1)) {
        System.out.println("n * " + co + " - 1");
        count++;
      }
      if (count >= num) {
        break;
      }
      co = co.add(ONE);
    }
    return ExitCode.OK;
  }

  @Override
  public Integer call() throws Exception {
    return ExitCode.USAGE;
  }

  /**
   * 22485桁で証明が容易な素数を探そう
   * @return s
   * @throws IOException s
   */
  @Command
  private int p22485() throws IOException {
    var primeArray = new BigInteger[25000];
    primeArray[0] = valueOf(2);
    int primeArrayLength = primeArray.length;
    for (int i = 1; i < primeArrayLength; i++) {
      primeArray[i] = primeArray[i - 1].nextProbablePrime();
    }
    var pMin = valueOf(10).pow(22484);
    var pMax = valueOf(10).pow(22485);
    var pSub1 = primeArray[0];
    var generator = RandomGenerator.getDefault();
    var p = primeArray[1];
    for (int i = 0; i < 10; i++) {
      outer:
      while (true) {
        while (p.compareTo(pMax) < 0) {
          if (p.compareTo(pMin) >= 0) {
            if (p.isProbablePrime(1)) {
              break outer;
            }
          }
          pSub1 = pSub1.multiply(primeArray[generator.nextInt(primeArrayLength)]);
          p = pSub1.add(ONE);
        }
        pSub1 = primeArray[0];
        p = primeArray[1];
      }
      var fileName = "prime-p22485-%d.txt".formatted(Instant.now().getEpochSecond());
      System.err.println(fileName);
      Files.writeString(Path.of(fileName), p + System.lineSeparator(), UTF_8,
          StandardOpenOption.CREATE, StandardOpenOption.WRITE);
    }
    return ExitCode.OK;
  }

  @Command
  public int exp() {
    var dist = LogNormalDistribution.of(Math.log(25), 1.442026886600883);
    var sampler = dist.createSampler(RandomSource.XO_RO_SHI_RO_128_PP.create());
    var array = sampler.samples(200).toArray();
    for (var ln : array) {
      System.out.println(Math.log(ln) + ", " + ln);
    }
    return ExitCode.OK;
  }

  /**
   * <a href="https://x.com/Pajoca_/status/1967072048259494084">一般化ヴィーフェリッヒ素数</a>
   * @return return code
   */
  @Command
  public int wieferich() {
    var auto = Arena.ofAuto();
    var n = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(n);
    var base = newMpzUi(auto, 47);
    var p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(p);
    var pSub1 = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(pSub1);
    var pPow2 = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(pPow2);
    var state = __gmp_randstate_struct.allocate(auto).reinterpret(auto, gmp_h::gmp_randclear);
    gmp_randinit_default(state);
    seedRandomState(state);
    var min = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(min);
    mpz_set_u64(min, 200000000000000L);
    var window = newMpzUi(auto, 10);
    mpz_pow_ui(window, window, 32);
    mpz_sub(window, window, min);
    do {
      mpz_urandomm(p, state, window);
      mpz_add(p, p, min);
      mpz_nextprime(p, p);

      mpz_sub_ui(pSub1, p, 1);
      mpz_pow_ui(pPow2, p, 2);

      mpz_powm(n, base, pSub1, pPow2);
      if (mpz_cmp_ui(n, 10) <= 0) {
        var string = mpzToString(auto, p, 10);
        System.out.println("modが10以下: " + string);
      }
    } while (mpz_cmp_ui(n, 1) != 0);
    var string = mpzToString(auto, p, 10);
    System.out.println("modが1と等しい: " + string);

    return EXIT_CODE_OK;
  }

  /**
   * 今回のスパム
   * タイトル: 10の37乗未満の素数(2の122乗未満)
   * 本文: 72桁の素数*n
   * @return exit code
   */
  @Command
  public int spam(@Parameters(arity = "1", paramLabel = "toAddress") String toAddress,
      @Parameters(arity = "0..1", paramLabel = "fromAddress") String fromAddress,
      @Option(names = {"--num",
          "-n"}, arity = "0..1", paramLabel = "num", defaultValue = "24") int num, @Option(names = {
          "--interval"}, arity = "0..1", paramLabel = "interval", defaultValue = "15") int interval)
      throws IOException, InterruptedException {
    if (fromAddress == null) {
      logger.warn("fromAddress is not set, fromAddress has been set to toAddress.");
      fromAddress = toAddress;
    }
    var auto = Arena.ofAuto();
    var subjectMax = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    //mpz_init_set_ui(subjectMax, 2);
    //mpz_mul_2exp(subjectMax, subjectMax, 122);
    // Largest prime number less than 2^122
    mpz_init_set_str(subjectMax, auto.allocateFrom("5316911983139663491615228241121378301"), 10);
    var subjectP = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(subjectP);
    var messageMin = newMpzUi(auto, 10);
    mpz_pow_ui(messageMin, messageMin, 71);
    var messageMax = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_str(messageMax, auto.allocateFrom(
        "999999999999999999999999999999999999999999999999999999999999999999999883"), 10);
    var messageWindow = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(messageWindow);
    mpz_sub(messageWindow, messageMax, messageMin);
    var messageP = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(messageP);
    var state = __gmp_randstate_struct.allocate(auto).reinterpret(auto, gmp_h::gmp_randclear);
    gmp_randinit_default(state);
    seedRandomState(state);

    try (var client = HttpClient.newHttpClient()) {
      for (var i = 0L; i < num; i++) {
        mpz_urandomm(subjectP, state, subjectMax);
        mpz_nextprime(subjectP, subjectP);
        var string = mpzToString(auto, subjectP, 10);
        //
        mpz_urandomm(messageP, state, messageWindow);
        mpz_add(messageP, messageP, messageMin);
        mpz_nextprime(messageP, messageP);
        var string1 = mpzToString(auto, messageP, 10);
        var message = new Message(toAddress, fromAddress, string, string1, 5400);
        logger.info("sent");
        logger.debug("{}, {}, {}, {}", message.to(), message.from(), message.subject(),
            message.message());
        //messages.add(message);
        post(client, message);
        Thread.sleep(Duration.ofSeconds(interval));
      }
      //post(client, messages);
    }
    return EXIT_CODE_OK;
  }

  @Command
  public int spam2(Path toAddressFile, String fromAddress, @Option(names = {"--num",
          "-n"}, arity = "0..1", paramLabel = "num", defaultValue = "-1") long num,
      @Option(names = "--filter-sent-addresses", defaultValue = "false") boolean filterSentAddresses)
      throws IOException, InterruptedException, SQLException, ExecutionException {
    var auto = Arena.ofAuto();
    var subjectMax = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    //mpz_init_set_ui(subjectMax, 2);
    //mpz_mul_2exp(subjectMax, subjectMax, 122);
    // Largest prime number less than 2^122
    // usable to uuid v4
    mpz_init_set_str(subjectMax, auto.allocateFrom("5316911983139663491615228241121378301"), 10);
    var subjectP = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(subjectP);
    var messageMin = newMpzUi(auto, 10);
    mpz_pow_ui(messageMin, messageMin, 71);
    var messageMax = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_str(messageMax, auto.allocateFrom(
        "999999999999999999999999999999999999999999999999999999999999999999999883"), 10);
    var messageWindow = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(messageWindow);
    mpz_sub(messageWindow, messageMax, messageMin);
    var messageP = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(messageP);
    var state = __gmp_randstate_struct.allocate(auto).reinterpret(auto, gmp_h::gmp_randclear);
    gmp_randinit_default(state);
    seedRandomState(state);
    final var addresses = Files.readAllLines(toAddressFile);
    if (filterSentAddresses) {
      var beforeAddressesSize = addresses.size();
      var set = filterBySentAddressSet(addresses);
      addresses.clear();
      addresses.addAll(set);
      var afterAddressesSize = addresses.size();
      System.err.println("filtered");
      System.err.println("before: " + beforeAddressesSize + ", after: " + afterAddressesSize);
      System.err.println("diff: " + (beforeAddressesSize - afterAddressesSize));
    }
    Collections.shuffle(addresses, SECURE_RANDOM_GENERATOR);
    long i = 0;
    try (var client = HttpClient.newHttpClient()) {
      var size = addresses.size();
      var messages = new ArrayList<Message>((num > 0) ? (int) num : size);
      if (size < num) {
        System.err.println(
            "要求するメッセージ数を満たすことができませんでした。" + size + "件のみ送信します");
      }
      for (var address : addresses) {
        mpz_urandomm(subjectP, state, subjectMax);
        mpz_nextprime(subjectP, subjectP);
        var string = mpzToString(auto, subjectP, 10);
        mpz_urandomm(messageP, state, messageWindow);
        mpz_add(messageP, messageP, messageMin);
        mpz_nextprime(messageP, messageP);
        var string1 = mpzToString(auto, messageP, 10);
        var message = new Message(address, fromAddress, string, string1, 5400);
        messages.add(message);
        //post(client, message);
        i++;
        if (i % 1000 == 0) {
          System.err.println("create: " + i);
        }
        if (num > 0 && i >= num) {
          break;
        }
      }
      System.err.println("created");
      post(client, messages);
      System.err.println("posted");
    }
    return EXIT_CODE_OK;
  }

  @Command
  public int sierpinski(@Option(names = "-k", defaultValue = "21181") int k, int nMin, int nMax) {
    var auto = Arena.ofAuto();
    var pSub1 = newMpzUi(auto, k);
    var p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(p);
    mpz_mul_2exp(pSub1, pSub1, nMin);
    var startP = valueOf(53);
    var maxSmallP = valueOf(100000000);
    out:
    for (int i = nMin; i <= nMax; i++, mpz_mul_2exp(pSub1, pSub1, 1)) {
      mpz_add_ui(p, pSub1, 1);
      var start = System.nanoTime();
      if (i == 100000028) {
        for (var smallP = startP.nextProbablePrime(); smallP.compareTo(maxSmallP) < 0;
            smallP = smallP.nextProbablePrime()) {
          if (gmp_h.mpz_divisible_ui_p(p, smallP.intValue()) != 0) {
            System.err.println(i + " is divisible by " + smallP);
            continue out;
          }
        }
        System.err.println(i + ": 見つかりませんでした");
      }
      var result = mpz_probab_prime_p(p, 24);
      var finish = System.nanoTime();
      var seconds = (finish - start) / 1e9;
      if (seconds >= 3600.) {
        System.err.println(
            "[" + DATE_TIME_FORMATTER.format(LocalDateTime.now()) + "]" + i + ": " + result + "("
            + seconds + " seconds)");
      } else {
        System.err.println(i + ": " + result + "(" + seconds + " seconds)");
      }
      if (result != 0) {
        break;
      }
    }
    return EXIT_CODE_OK;
  }

  private void post(HttpClient client, List<Message> messages)
      throws InterruptedException, ExecutionException {
    var joiner = new StringJoiner(",", "[", "]");
    var encoder = Base64.getEncoder();
    var id = 0L;
    for (var message : messages) {
      var body = "{\"jsonrpc\":\"2.0\",\"method\":\"sendMessage\",\"params\":[\"%s\",\"%s\",\"%s\",\"%s\",%d,%d],\"id\":%d}".formatted(
          message.to(), message.from(), encoder.encodeToString(message.subject().getBytes(UTF_8)),
          encoder.encodeToString(message.message().getBytes(UTF_8)), message.encodingType(),
          message.ttl(), id++);
      joiner.add(body);
    }
    // FIXME BodyPublisherにInputStream使わないとダメかも
    var request = requestBuilder.POST(BodyPublishers.ofString(joiner.toString())).build();
    var handler = BodyHandlers.ofString();
    var future = client.sendAsync(request, handler);
    System.err.println("send async...");
    future.get().body();
  }

  @Command
  public int fictional(Path in) throws IOException, InterruptedException, ExecutionException {
    var encoder = Base64.getEncoder();
    var id = 0L;
    var addresses = Files.readAllLines(in);
    System.out.println("address list loaded");
    var body = new StringJoiner(",", "[", "]");
    for (var address : addresses) {
      var label = "fictional-" + address.substring(3, 9);
      var b = "{\"jsonrpc\":\"2.0\",\"method\":\"addAddressBookEntry\",\"params\":[\"%s\",\"%s\"],\"id\":%d}".formatted(
          address, encoder.encodeToString(label.getBytes(UTF_8)), id++);
      body.add(b);
    }
    System.out.println("request build done");
    try (var client = HttpClient.newHttpClient()) {
      var request = requestBuilder.POST(BodyPublishers.ofString(body.toString())).build();
      var handler = BodyHandlers.ofString();
      var future = client.sendAsync(request, handler);
      System.err.println("send async...");
      future.get().body();
    }
    return EXIT_CODE_OK;
  }

  @Command
  public int repl(Path in, Path out) throws IOException {
    var joiner = new StringJoiner("," + System.lineSeparator(), "BEGIN TRANSACTION;\n"
                                                                + "insert into pubkeys(address, addressversion, transmitdata, time, usedpersonally) values",
        ";\n" + "COMMIT;");
    try (var lines = Files.lines(in)) {
      lines.map(l -> "('" + (l.replaceAll("\\|", ",").replaceAll("(?=,4,)", "'")
          .replaceAll("(?=040100000000)", "x'").replaceAll("(?<=FD03E8FD03E8)", "'")
          .replaceAll("yes$", "'$0')"))).forEach(joiner::add);
    }
    Files.writeString(out, joiner.toString(), StandardOpenOption.WRITE, StandardOpenOption.CREATE);
    return EXIT_CODE_OK;
  }

  @Command
  public int searchAddress(Path[] in)
      throws IOException, NoSuchAlgorithmException, DigestException {
    for (var file : in) {
      if (!Files.exists(file)) {
        System.err.println("not found: " + file);
        return EXIT_CODE_SOFTWARE;
      }
    }
    var auto = Arena.ofAuto();
    var keys = auto.allocate(65L * 16777216 * in.length);
    long offset = 0;
    for (var file : in) {
      try (var channel = Files.newByteChannel(file, StandardOpenOption.READ)) {
        var size = channel.size();
        var slice = keys.asSlice(offset, size, 1);
        channel.read(slice.asByteBuffer());
        offset += size;
      }
    }
    final int blockMax = in.length * 16;
    long selectedSignKeyOffset;
    long selectedEncKeyOffset;
    var provider = Security.getProvider("BC");
    Objects.requireNonNull(provider);
    var sha512 = MessageDigest.getInstance("SHA-512", provider);
    var ripemd160 = MessageDigest.getInstance("Ripemd160", provider);
    long signIndex;
    long encIndex;
    var hash = new byte[64];

    long count = 0;
    var nlzArray = new long[65];
    found:
    while (true) {
      selectedSignKeyOffset = SECURE_RANDOM_GENERATOR.nextInt(blockMax) * 1048576L * 65;
      selectedEncKeyOffset = SECURE_RANDOM_GENERATOR.nextInt(blockMax) * 1048576L * 65;
      signIndex = selectedSignKeyOffset;
      for (int i = 0; i < 1048576; i++) {
        signIndex += 65;
        var signByteBuffer = keys.asSlice(signIndex, 65, 1).asByteBuffer();
        encIndex = selectedEncKeyOffset;
        for (int j = 0; j < 1048576; j++) {
          encIndex += 65;
          sha512.update(signByteBuffer);
          signByteBuffer.rewind();
          // FIXME これコンストラクタ呼びまくってて絶対遅いンゴ
          sha512.update(keys.asSlice(encIndex, 65, 1).asByteBuffer());
          sha512.digest(hash, 0, 64);
          ripemd160.update(hash, 0, 64);
          ripemd160.digest(hash, 0, 20);
          var nlz = Long.numberOfLeadingZeros((long) LONG_HANDLE.get(hash, 0));
          nlzArray[nlz]++;
          if (nlz >= 45) {
            logger.info("お前やー！！！！({}) sign: {}, enc: {}", nlz, signIndex, encIndex);
            count++;
            if (count >= 10) {
              break found;
            }
          }
        }
      }
      var sum = 0L;
      var num = 0L;
      for (int i = 0; i < 65; i++) {
        sum += nlzArray[i] * i;
        num += nlzArray[i];
      }
      logger.info("{}", (double) sum / num);
    }
    return EXIT_CODE_OK;
  }

  @Command
  public int h(BigInteger p) {
    var treeMap = new TreeMap<Long, Long>();
    Stream.iterate(p, n -> n.compareTo(ONE) > 0,
            n -> n.testBit(0) ? n.shiftLeft(1).add(n).add(ONE) : n.shiftRight(1))
        .forEach(n -> treeMap.compute((long) n.bitLength(), (k, l) -> l == null ? 1L : l + 1));
    treeMap.forEach((k, v) -> System.out.println("k = " + k + ", v = " + v));
    return EXIT_CODE_OK;
  }

  @Command
  public int epoch(long e) {
    var instant = Instant.ofEpochMilli(e);
    System.out.println(instant);
    return EXIT_CODE_OK;
  }

  @Command
  public int sex(String key, @Option(names = {"--public"}) boolean keyIsPublic, Path dir,
      @Option(names = {"--no-follow-links"}) boolean noFollowLinks)
      throws NoSuchAlgorithmException, IOException {
    var hexFormat = HexFormat.of();
    byte[] signaturePublicKey;
    if (keyIsPublic) {
      signaturePublicKey = hexFormat.parseHex(key);
    } else {
      var signaturePrivateKey = Base58.decode(key);
      signaturePublicKey = Const.SEC_P256_K1_G.multiply(
          new BigInteger(1, signaturePrivateKey, 1, 32)).getEncoded(false);
    }
    var bc = Security.getProvider("BC");
    var sha512_original = MessageDigest.getInstance("SHA-512", bc);
    sha512_original.update(signaturePublicKey, 0, 65);
    Path[] pathArray;
    try (var stream = Files.list(dir)) {
      var pattern = Pattern.compile("publicKeys\\d+\\.bin");
      // FIXME NOFOLLOW_LINKSを引数に加えるかどうかで三項演算子なんて使いたくない
      Predicate<Path> pathPredicate0 = path -> noFollowLinks ? Files.isRegularFile(path,
          LinkOption.NOFOLLOW_LINKS) : Files.isRegularFile(path);
      Predicate<Path> pathPredicate1 = path -> pattern.matcher(path.getFileName().toString())
          .matches();
      var comparator = Comparator.<Path>comparingInt(p -> p.getFileName().toString().length())
          .thenComparing(Function.identity());
      pathArray = stream.filter(pathPredicate0.and(pathPredicate1)).sorted(comparator)
          .toArray(Path[]::new);
    }
    System.out.println(pathArray.length);
    System.err.println("[" + DATE_TIME_FORMATTER.format(LocalDateTime.now()) + "] 開始します");
    for (var path : pathArray) {
      var k = Files.readAllBytes(path);
      int length = k.length;
      var result = IntStream.iterate(0, p -> p < length, p -> p + 65).parallel().filter(offset -> {
        var hash = new byte[64];
        MessageDigest sha512;
        try {
          sha512 = (MessageDigest) sha512_original.clone();
        } catch (CloneNotSupportedException e) {
          throw new RuntimeException(e);
        }
        sha512.update(k, offset, 65);
        try {
          sha512.digest(hash, 0, 64);
        } catch (DigestException e) {
          throw new RuntimeException(e);
        }
        MessageDigest ripemd160;
        try {
          ripemd160 = MessageDigest.getInstance("RIPEMD160", bc);
        } catch (NoSuchAlgorithmException e) {
          throw new RuntimeException(e);
        }
        ripemd160.update(hash, 0, 64);
        try {
          ripemd160.digest(hash, 0, 20);
        } catch (DigestException e) {
          throw new RuntimeException(e);
        }
        if (hash[0] == 0 && hash[1] == 0 && hash[2] == 0 && hash[3] == 0 && hash[4] == 0
            && hash[5] == 0) {
          System.out.println("[" + DATE_TIME_FORMATTER.format(LocalDateTime.now()) + "] found: "
                             + hexFormat.formatHex(hash, 0, 20));
          return true;
        }
        return false;
      }).findAny();
      if (result.isPresent()) {
        var offset = result.getAsInt();
        System.out.println("file is " + path);
        System.out.println("offset is " + offset);
        System.out.println("key number is " + (offset / 65));
      }
      System.err.println(
          "[" + DATE_TIME_FORMATTER.format(LocalDateTime.now()) + "] file " + path + " is done");
    }
    return EXIT_CODE_OK;
  }

  private BigInteger babyStepGiantStep(BigInteger base, BigInteger b, BigInteger m) {
    // base、b、m が有効な入力であることを確認
    if (m.compareTo(ONE) <= 0) {
      throw new IllegalArgumentException("Modulus m must be greater than 1.");
    }
    if (base.gcd(m).compareTo(ONE) != 0) {
      // baseとmが互いに素でない場合、このアルゴリズムは動作しません。
      // 別のアルゴリズム（例：Pohlig-Hellman）が必要になることがあります。
      return null;
    }

    // ステップサイズ n を計算 (n = ceil(sqrt(m)))
    BigInteger n = m.sqrt().add(ONE);

    // ベビー・ステップを計算し、HashMapに格納 (base^j, j)
    var babySteps = new HashMap<BigInteger, BigInteger>();
    BigInteger baby = ONE;
    for (var j = BigInteger.ZERO; j.compareTo(n) < 0; j = j.add(ONE)) {
      babySteps.put(baby, j);
      baby = baby.multiply(base).mod(m);
    }

    // ジャイアント・ステップを計算
    // giantStepInverse = base^(-n) (mod m)
    BigInteger giantStep = base.modPow(n, m);
    BigInteger giantStepInverse = giantStep.modInverse(m);

    BigInteger giant = b;
    for (var i = BigInteger.ZERO; i.compareTo(n) < 0; i = i.add(ONE)) {
      // 現在のジャイアント・ステップがベビー・ステップのテーブルに含まれているかチェック
      if (babySteps.containsKey(giant)) {
        BigInteger j = babySteps.get(giant);
        // 解 x = i * n + j を計算
        return i.multiply(n).add(j);
      }
      // 次のジャイアント・ステップを計算
      giant = giant.multiply(giantStepInverse).mod(m);
    }

    // 解が見つからない場合は null を返す
    return null;
  }

  @Command
  public int sierpinski2(BigInteger m) {
    var inv = valueOf(21181).modInverse(m);
    var target = inv.negate().mod(m);
    long start = System.nanoTime();
    var n = babyStepGiantStep(TWO, target, m);
    long finish = System.nanoTime();
    System.out.println("n : " + n);
    System.out.println((finish - start) / 3.6e12 + " 時間");
    return EXIT_CODE_OK;
  }

  @Command
  public int sierpinski2_5(Path in) throws IOException {
    try (var stream = Files.lines(in)) {
      var k = valueOf(21181);
      stream.map(l -> l.replaceAll(":.*", "")).mapToLong(Long::parseLong)
          .mapToObj(BigInteger::valueOf).forEach(p -> {
            var initialN = babyStepGiantStep(TWO, k.modInverse(p).negate().mod(p), p);
            System.out.println(p + ": " + initialN);
          });
    }
    return EXIT_CODE_OK;
  }

  @Command
  public int sierpinski3(@Parameters(converter = MPZConverter.class) MemorySegment exp,
      @Parameters(converter = MPZConverter.class) MemorySegment mod) {
    var auto = Arena.ofAuto();
    var rop = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(rop);
    var base = newMpzUi(auto, 2);
    mpz_powm(rop, base, exp, mod);
    var string = mpzToString(auto, rop, 10);
    System.out.println(string);
    return EXIT_CODE_OK;
  }

  @Command
  public int sierpinski4(@Option(names = {"--min"}, defaultValue = "0", paramLabel = "min") int min,
      @Option(names = {"--max"}, paramLabel = "max") int max,
      @Option(names = "--output-numbers", defaultValue = "false") boolean output) {
    var array = LongStream.rangeClosed(min, max).filter(LONG_PREDICATE).toArray();
    System.out.println("length: " + array.length);
    System.out.printf("%f %%%n", (double) array.length * 100 / (max - min));
    if (output) {
      Arrays.stream(array).forEach(System.out::println);
    }
    return EXIT_CODE_OK;
  }

  @Command
  public int fac() {
    var auto = Arena.ofAuto();
    var n = newMpzUi(auto, 1);
    var p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_set_ui(p, 10);
    mpz_pow_ui(p, p, 18);
    mpz_add_ui(p, p, 3);
    var max = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_set_ui(max, 10);
    mpz_pow_ui(max, max, 49999);
    while (mpz_cmp(n, max) < 0) {
      mpz_mul(n, n, p);
      var string = mpzToString(auto, p, 10);
      System.out.println(string);
      mpz_nextprime(p, p);
    }
    return EXIT_CODE_OK;
  }

  @Command
  public int simpleSierpinskiTest(long[] i) {
    StreamSupport.longStream(Arrays.spliterator(i, 0, i.length), false).filter(LONG_PREDICATE)
        .forEach(System.err::println);
    return EXIT_CODE_OK;
  }

  @Command
  public int sie() {
    var auto = Arena.ofAuto();
    var p = newMpzUi(auto, 1);
    mpz_mul_2exp(p, p, 45029252);
    mpz_mul_ui(p, p, 21181);
    mpz_add_ui(p, p, 1);
    var q = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(q);
    var r = newMpzUi(auto, 2);
    // powers = 1048576
    var powers = newMpzUi(auto, 1);
    var gcd = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(gcd);
    while (true) {
      mpz_gcd(gcd, p, r);
      if (mpz_cmp_ui(gcd, 1) != 0) {
        break;
      }
      mpz_nextprime(r, r);
    }
    var string = mpzToString(auto, gcd, 10);
    System.out.println(string);
    while (true) {
      // q =  21181
      mpz_set_ui(q, 21181);
      // q *= powers
      mpz_mul(q, q, powers);
      // q += 1
      mpz_add_ui(q, q, 1);
      mpz_gcd(gcd, p, q);
      if (mpz_cmp_ui(gcd, 1) != 0) {
        break;
      }
      // powers *= 16777216
      mpz_mul_2exp(powers, powers, 1);
    }
    var string1 = mpzToString(auto, gcd, 10);
    System.out.println(string1);
    return EXIT_CODE_OK;
  }

  @Command
  public int sierpinski6(int n) {
    var num = valueOf(21181);
    var ONE = valueOf(1);
    var array = IntStream.rangeClosed(0, n).filter(LONG_PREDICATE::test)
        .mapToObj(l -> num.shiftLeft(l).add(ONE)).toArray(BigInteger[]::new);
    System.out.println(array.length + "件");
    for (var p : array) {
      for (var q : array) {
        if (p.compareTo(q) > 0) {
          var gcd = p.gcd(q);
          if (!gcd.equals(ONE)) {
            System.out.println(gcd);
          }
        }
      }
    }
    return EXIT_CODE_OK;
  }

  @Command
  public int sierpinski7(int start) {
    var any = IntStream.iterate(start, i -> i + 1).filter(LONG_PREDICATE::test).filter(i -> {
      var auto = Arena.ofAuto();
      var p = newMpzUi(auto, 21181);
      mpz_mul_2exp(p, p, i);
      mpz_add_ui(p, p, 1);
      var st = System.nanoTime();
      var probablePrime = mpz_probab_prime_p(p, 24);
      var fin = System.nanoTime();
      var diff = fin - st;
      System.err.println(
          "[" + OffsetDateTime.now() + "] 21181 * 2 ^ " + i + " + 1 is " + (probablePrime != 0 ? ""
              : "not ") + "prime, " + (diff >= 1800000000000L ? (diff / 3.6e12) + " hours"
              : (diff / 1e9) + " seconds"));
      return probablePrime != 0;
    }).findAny();
    if (any.isPresent()) {
      System.out.println("21181 * 2 ^ " + any.getAsInt() + " + 1 is prime!");
    }
    return EXIT_CODE_OK;
  }

  @Command
  public int sierpinski8() {
    var j = IntStream.iterate(33219284, k -> k + 1).filter(LONG_PREDICATE::test).findFirst();
    System.out.println("j is " + j);
    if (j.isEmpty()) {
      return EXIT_CODE_SOFTWARE;
    }
    int count = 0;
    for (int i = 33219284; count < 15; i++) {
      if (LONG_PREDICATE.test(i)) {
        System.out.println("match: " + i);
        count++;
      }
    }
    var op2 = 33219332;
    System.out.println(op2 + " を選択しました");
    var auto = Arena.ofAuto();
    var n = newMpzUi(auto, 21181);
    mpz_mul_2exp(n, n, op2);
    mpz_add_ui(n, n, 1);
    var p = newMpzUi(auto, 2);

    for (int i = 0; i < 1000000; i++) {
      if (mpz_divisible_p(n, p) != 0) {
        var string = mpzToString(auto, p, 10);
        System.out.println(string);
      }
      mpz_nextprime(p, p);
    }
    var string = mpzToString(auto, p, 10);
    System.out.println(string + "未満までの検査を終了しました");
    return EXIT_CODE_OK;
  }

  @Command
  public int proth(int i) {
    var auto = Arena.ofAuto();
    var exp = newMpzUi(auto, 21181);
    mpz_mul_2exp(exp, exp, i - 1);
    var n = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set(n, exp);
    mpz_mul_2exp(n, n, 1);
    mpz_add_ui(n, n, 1);
    var a = newMpzUi(auto, 2);
    var mod = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(mod);
    mpz_powm(mod, a, exp, n);
    mpz_add_ui(mod, mod, 1);
    if (mpz_cmp(mod, n) == 0) {
      System.out.println("素数");
    } else {
      System.out.println("非素数");
    }
    return EXIT_CODE_OK;
  }

  @Command
  public int addressSearch(Path in) throws IOException {
    var size = Files.size(in);
    if (size % 65 != 0) {
      throw new IllegalArgumentException("A");
    }
    var buf = Files.readAllBytes(in);
    var num = size / 65;
    System.err.println(num + " keys");
    var result = IntStream.iterate(0, i -> i < 1090519040, i -> i + 65).boxed().flatMap(
            i -> IntStream.iterate(0, j -> j < 1090519040, j -> j + 65).mapToObj(j -> new A(i, j)))
        .filter(new APredicate(buf)).parallel().findAny();
    if (result.isPresent()) {
      var a = result.get();
      System.out.println(
          "[" + OffsetDateTime.now() + "] offsetS = " + a.sign() + ", offsetE = " + a.enc());
    } else {
      System.out.println("[" + OffsetDateTime.now() + "] Not found");
    }
    return EXIT_CODE_OK;
  }

  @Command
  public int primesPost(int n) throws URISyntaxException, IOException {
    var auto = Arena.ofAuto();
    var max = newMpzUi(auto, 10);
    mpz_pow_ui(max, max, 4097);
    mpz_sub_ui(max, max, 2603);
    var min = newMpzUi(auto, 10);
    mpz_pow_ui(min, min, 4096);
    var window = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(window);
    mpz_sub(window, max, min);
    var state = __gmp_randstate_struct.allocate(auto).reinterpret(auto, gmp_h::gmp_randclear);
    gmp_randinit_default(state);
    seedRandomState(state);
    var p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(p);
    var primes = new LinkedList<String>();
    for (var i = 0; i < n; i++) {
      mpz_urandomm(p, state, window);
      mpz_add(p, p, min);
      var start = System.nanoTime();
      mpz_nextprime(p, p);
      var finish = System.nanoTime();
      System.err.println(
          "[" + DATE_TIME_FORMATTER.format(LocalDateTime.now()) + "] " + (finish - start) / 1e9
          + " sec");
      var string = mpzToString(auto, p, 10);
      primes.add(string);
      var primesListIterator = primes.listIterator();
      while (primesListIterator.hasNext()) {
        var url = QUERY_ENDPOINT + primesListIterator.next();
        var connection = (HttpsURLConnection) new URI(url).toURL().openConnection();
        connection.setRequestProperty("Cookie", FDB_USER_COOKIE);
        var code = connection.getResponseCode();
        if (code == HttpStatusCode.HTTP_TOO_MANY_REQUESTS) {
          System.err.println("TOO MANY REQUEST");
          break;
        } else if (code != HttpsURLConnection.HTTP_OK) {
          System.err.println("code " + code);
          continue;
        }
        JsonNode root;
        try (var inputStream = connection.getInputStream()) {
          root = OBJECT_MAPPER.readTree(inputStream);
        }
        var id = root.get("id");
        var status = root.get("status");
        System.err.println(
            "[" + DATE_TIME_FORMATTER.format(LocalDateTime.now()) + "] " + id.asText() + "(" + (
                id.isTextual() ? "textual" : "long") + "): " + status.textValue());
        primesListIterator.remove();
      }
    }

    return EXIT_CODE_OK;
  }

  @Command
  public int reportFactors(int start, int finish, int step, int factor)
      throws IOException, InterruptedException {
    var url = create(FactorDBSpamming.REPORT_FACTOR_ENDPOINT).toURL();
    var lock = new Object();
    for (int i = start; i < finish; i += step) {
      int responseCode;
      HttpsURLConnection connection;
      do {
        connection = (HttpsURLConnection) url.openConnection();
        connection.setDoOutput(true);
        connection.setRequestProperty("Cookie", FDB_USER_COOKIE);
        try (var stream = new PrintStream(connection.getOutputStream())) {
          var body = "number=" + encode("21181*2^" + i + "+1", UTF_8) + "&factor=" + factor;
          stream.println(body);
          stream.flush();
        }
        connection.connect();
        responseCode = connection.getResponseCode();
        if (responseCode != 200) {
          System.out.println(
              "[" + DATE_TIME_FORMATTER.format(LocalDateTime.now()) + "] " + i + ", " + responseCode
              + ": " + connection.getResponseMessage());
          if (responseCode == HttpStatusCode.HTTP_TOO_MANY_REQUESTS) {
            lock.wait(1000 * 60 * 5);
          }
        }
      } while (responseCode != HttpsURLConnection.HTTP_OK);
      try (var inputStream = new BufferedReader(
          new InputStreamReader(connection.getInputStream()))) {
        System.out.println(
            "[" + DATE_TIME_FORMATTER.format(LocalDateTime.now()) + "] " + i + ", " + responseCode
            + ": " + inputStream.readLine());
      }
    }
    return EXIT_CODE_OK;
  }

  @Command
  public int fabcn(@Parameters(defaultValue = "1", paramLabel = "start") int start,
      @Option(names = {"--max-exponent",
          "-m"}, defaultValue = "13607", paramLabel = "larger-exponent") int max,
      @Option(names = {"--init-exponent", "-i"}, defaultValue = "3", paramLabel = "init") int init,
      @Option(names = {"--base", "-b"}, defaultValue = "2", paramLabel = "base") int base)
      throws IOException, InterruptedException {
    var auto = Arena.ofAuto();
    var n = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(n);
    var a = newMpzUi(auto, base);
    mpz_pow_ui(a, a, init);
    var b = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(b);
    for (int i = init; i < max; i++) {
      // b = base
      mpz_set_ui(b, base);
      for (int j = 1; j < i; j++) {
        mpz_set_ui(n, 1);
        mpz_add(n, n, a);
        mpz_add(n, n, b);
        var result = mpz_probab_prime_p(n, 24);
        if (result != 0) {
          var p = base + "^" + i + "+" + base + "^" + j + "+1";
          logger.info("発見しました {} : {}", p, result);
          var url = create(QUERY_ENDPOINT + encode(p, UTF_8)).toURL();
          HttpsURLConnection connection = null;
          int code;
          do {
            try {
              connection = (HttpsURLConnection) url.openConnection();
              connection.setRequestProperty("Cookie", FDB_USER_COOKIE);
              code = connection.getResponseCode();
              if (code == HttpStatusCode.HTTP_TOO_MANY_REQUESTS) {
                Thread.sleep(1000 * 60 * 5);
              }
            } catch (ConnectException e) {
              logger.error("例外発生", e);
              code = 503;
            } catch (IOException e) {
              logger.error("例外発生", e);
              code = 500;
            }
            if (code != 200) {
              logger.warn("code: {}", code);
            }
          } while (code != HttpsURLConnection.HTTP_OK);
          JsonNode root;
          try (var inputStream = connection.getInputStream()) {
            root = OBJECT_MAPPER.readTree(inputStream);
          }
          var id = root.get("id");
          var status = root.get("status");
          logger.info("{} : {}, https://factordb.com/index.php?id={} : {}", p, result, id.asText(),
              status.textValue());
        }
        // b *= base
        mpz_mul_ui(b, b, base);
      }
      logger.debug("done: {}", i);
      // a *= base;
      mpz_mul_ui(a, a, base);
    }
    return EXIT_CODE_OK;
  }

  @Command
  public int searchBigPrime(
      @Option(names = "--min-digits", paramLabel = "Minimum number of digits", defaultValue = "299") int minimumNumberOfDigits,
      @Option(names = "--num", paramLabel = "num", defaultValue = "5") int num) {
    var auto = Arena.ofAuto();
    var threshold = newMpzUi(auto, 10);
    mpz_pow_ui(threshold, threshold, minimumNumberOfDigits - 1);
    var smallPrimeMin = newMpzUi(auto, 10);
    mpz_pow_ui(smallPrimeMin, smallPrimeMin, 18);
    var smallPrimeMax = newMpzUi(auto, 10);
    mpz_pow_ui(smallPrimeMax, smallPrimeMax, 19);
    mpz_sub_ui(smallPrimeMax, smallPrimeMax, 39);
    var smallPrimeWindow = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set(smallPrimeWindow, smallPrimeMax);
    mpz_sub(smallPrimeWindow, smallPrimeWindow, smallPrimeMin);
    var state = __gmp_randstate_struct.allocate(auto).reinterpret(auto, gmp_h::gmp_randclear);
    gmp_randinit_default(state);
    seedRandomState(state);
    var addr = auto.allocate(ADDRESS);
    mp_get_memory_functions(NULL, NULL, addr);
    var freeFuncPtr = addr.get(ADDRESS, 0);
    record NAndFactors(MemorySegment n, Set<MemorySegment> factors) {

    }
    record PrimeRecord(MemorySegment p, State state, Set<MemorySegment> factors) {

    }
    var bls = new BrillhartLehmerSelfridge();
    Stream.generate(() -> {
          var n = newMpzUi(auto, 2);
          var smallPrime = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
          mpz_init(smallPrime);
          var set = new TreeSet<MemorySegment>(gmp_h::mpz_cmp);
          var countP = auto.allocate(JAVA_LONG);
          MemorySegment p;
          while (mpz_cmp(n, threshold) < 0) {
            // [10^18, 10^19-39)で乱数を生成して素数探索
            // 一応同期を取る
            synchronized (state) {
              mpz_urandomm(smallPrime, state, smallPrimeWindow);
            }
            mpz_add(smallPrime, smallPrime, smallPrimeMin);
            mpz_nextprime(smallPrime, smallPrime);
            // 発見した素数をnに掛け合わせる
            mpz_mul(n, n, smallPrime);
            p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
            mpz_init_set(p, smallPrime);
            var allocatedSmallPrime = mpz_export(NULL, countP, 0, JAVA_BYTE.byteSize(), 0, 0,
                smallPrime);
            set.add(p);
            __gmp_get_memory_functions$x2.invoke(freeFuncPtr, allocatedSmallPrime, 0);
          }
          return new NAndFactors(n, set);
        }).parallel().<PrimeRecord>mapMulti((n, consumer) -> {
          var nAdd1 = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
          mpz_init(nAdd1);
          mpz_add_ui(nAdd1, n.n(), 1);
          consumer.accept(new PrimeRecord(nAdd1, State.N_ADD_1, n.factors()));
          var nSub1 = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
          mpz_init(nSub1);
          mpz_sub_ui(nSub1, n.n(), 1);
          consumer.accept(new PrimeRecord(nSub1, State.N_SUB_1, n.factors()));
        }).filter(p -> mpz_probab_prime_p(p.p(), 24) != 0 && bls.isPrime(p.p(), p.factors())).limit(num)
        .forEach(p1 -> {
          try {
            var optional = queryMPZ(p1.p());
            if (optional.isPresent()) {
              var root = optional.get();
              var id = root.get("id").asText();
              logger.info("{}: {}", id, p1.state());
              var joiner = new StringJoiner(", ");
              p1.factors().forEach(p -> {
                var string = mpzToString(auto, p, 10);
                joiner.add(string);
              });
              logger.info("{}: {}", id, joiner);
            }
          } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
          }
        });
    return EXIT_CODE_OK;
  }

  @Command
  public int fu(String id) throws IOException, InterruptedException {
    var optional = queryByID(id);
    if (optional.isEmpty()) {
      return EXIT_CODE_SOFTWARE;
    }
    var root = optional.get();
    var id2 = root.get("id");
    var status = root.get("status");
    var factors = root.get("factors");
    System.out.println(id2);
    System.out.println(status);
    var x = factors.get(0);
    var y = x.get(0);
    var auto = Arena.ofAuto();
    var n = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_str(n, auto.allocateFrom(y.asText()), 10);
    var p = newMpzUi(auto, 1);
    var q = newMpzUi(auto, 1);
    var diff = newMpzUi(auto, 1);
    var gcd = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(gcd);
    do {
      mpz_mul_2exp(p, p, 1);
      mpz_add_ui(p, p, 1);
      mpz_mod(p, p, n);
      mpz_mul_2exp(q, q, 2);
      mpz_add_ui(q, q, 3);
      mpz_mod(q, q, n);
      mpz_sub(diff, p, q);
      if (__mpz_struct._mp_size(diff) < 0) {
        __mpz_struct._mp_size(diff, -__mpz_struct._mp_size(diff));
      }
      mpz_gcd(gcd, n, diff);
    } while (mpz_cmp_ui(gcd, 1) == 0);
    if (mpz_cmp(gcd, n) != 0) {
      var string = mpzToString(auto, gcd, 10);
      System.out.println(string);
    } else {
      System.out.println("失敗！");
    }
    return EXIT_CODE_OK;
  }

  @Command
  public int crazy(String s)
      throws NoSuchAlgorithmException, DigestException, CloneNotSupportedException {
    var string = s.getBytes(UTF_8);
    var length = string.length;
    MessageDigest backup = MessageDigest.getInstance("SHA-256");
    MessageDigest sha256;
    var hash = new byte[32];
    long i = 0;
    do {
      sha256 = backup;
      sha256.update(string, 0, length);
      backup = (MessageDigest) sha256.clone();
      sha256.digest(hash, 0, 32);
      i++;
    } while (hash[0] != 0 || hash[1] != 0 || hash[2] != 0 || hash[3] != 0);
    System.out.println("i = " + i + ", hash = " + HexFormat.of().formatHex(hash, 0, 32));
    return EXIT_CODE_OK;
  }

  @Command
  public int crazy2(String s, long num) throws NoSuchAlgorithmException, DigestException {
    var string = s.getBytes(UTF_8);
    var length = string.length;
    MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
    var hash = new byte[32];
    for (long i = 0; i < num; i++) {
      sha256.update(string, 0, length);
    }
    sha256.digest(hash, 0, 32);
    System.out.println("hash: " + HexFormat.of().formatHex(hash, 0, 32));
    return EXIT_CODE_OK;
  }

  @Command
  public int createPrime(Path out, Path in, int step) throws IOException {
    var auto = Arena.ofAuto();
    var p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_str(p, auto.allocateFrom(Files.readAllLines(in).getFirst()), 10);
    try {
      mpz_add_ui(p, p, Math.addExact(Math.multiplyExact(step, 2), 1));
    } catch (ArithmeticException e) {
      // step * 2 + 1がオーバーフローを起こすときにだけgmpを経由する
      var diff = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
      mpz_init(diff);
      mpz_set_u64(diff, step);
      mpz_mul_2exp(diff, diff, 1);
      mpz_add_ui(diff, diff, 1);
      mpz_add(p, p, diff);
    }
    System.out.println(mpz_probab_prime_p(p, 24));
    var string = mpzToString(auto, p, 10);
    Files.writeString(out, string, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
    return EXIT_CODE_OK;
  }

  @Command
  public int bls() {
    BrillhartLehmerSelfridge bls = new BrillhartLehmerSelfridge();

    // 例1: N = 17 (素数)
    // N-1 = 16 = 2^4。Fとして{2}のセットを提供
    BigInteger n1 = new BigInteger("17");
    Set<BigInteger> factors1 = Set.of(new BigInteger("2"));
    System.out.println("Is " + n1 + " prime? " + bls.isPrime(n1, factors1)); // true

    // 例2: N = 13 (素数)
    // N-1 = 12 = 2^2 * 3。Fとして{2, 3}のセットを提供
    BigInteger n2 = new BigInteger("13");
    Set<BigInteger> factors2 = Set.of(new BigInteger("2"), new BigInteger("3"));
    System.out.println("Is " + n2 + " prime? " + bls.isPrime(n2, factors2)); // true

    // 例3: N = 9 (合成数)
    // N-1 = 8 = 2^3。Fとして{2}のセットを提供 (F=2, sqrt(N)=3より条件F>sqrt(N)を満たさない)
    BigInteger n3 = new BigInteger("9");
    Set<BigInteger> factors3 = Set.of(new BigInteger("2"));
    // この場合、F > sqrt(N)のチェックで引っかかるため、適切に判定できない
    System.out.println("Is " + n3 + " prime? " + bls.isPrime(n3, factors3));
    // Note: isPrimeメソッド内のエラーメッセージも確認してください

    BigInteger n4 = BigInteger.valueOf(3).pow(5279).add(BigInteger.valueOf(3).pow(1593)).add(ONE);
    Set<BigInteger> factors4 = Set.of(new BigInteger("2"), new BigInteger("3"), new BigInteger("5"),
        new BigInteger("389"), new BigInteger("5301533"), new BigInteger("63074833"),
        new BigInteger("25480398173"), new BigInteger("474892892339377"),
        new BigInteger("572015250148299277216508617"),
        new BigInteger("1209361321548310091770485682269470852086753"),
        new BigInteger("77449343291186907889503299808279247610860106861"));
    System.out.println("Is " + n4 + " prime? " + bls.isPrime(n4, factors4)); // true
    return EXIT_CODE_OK;
  }

  @Command
  public int blsMpz() {
    BrillhartLehmerSelfridge bls = new BrillhartLehmerSelfridge();
    var auto = Arena.ofAuto();
    var n2 = newMpzUi(auto, 13);
    Set<MemorySegment> factors2 = new TreeSet<>(gmp_h::mpz_cmp);
    factors2.add(newMpzUi(auto, 2));
    factors2.add(newMpzUi(auto, 2));
    var string = mpzToString(auto, n2, 10);
    System.out.println("Is " + string + " prime? " + bls.isPrime(n2, factors2)); // true
    var n3 = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(n3);
    var d = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(d);
    mpz_ui_pow_ui(d, 3, 5279);
    mpz_set(n3, d);
    mpz_ui_pow_ui(d, 3, 1593);
    mpz_add(n3, n3, d);
    mpz_add_ui(n3, n3, 1);
    Set<MemorySegment> factors3 = new TreeSet<>(gmp_h::mpz_cmp);
    factors3.add(newMpzUi(auto, 2));
    factors3.add(newMpzUi(auto, 3));
    factors3.add(newMpzUi(auto, 5));
    factors3.add(newMpzUi(auto, 389));
    factors3.add(newMpzUi(auto, 5301533));
    factors3.add(newMpzUi(auto, 63074833));
    factors3.add(newMpzUi(auto, 25480398173L));
    factors3.add(newMpzStr(auto, "474892892339377", 10));
    factors3.add(newMpzStr(auto, "572015250148299277216508617", 10));
    factors3.add(newMpzStr(auto, "1209361321548310091770485682269470852086753", 10));
    factors3.add(newMpzStr(auto, "77449343291186907889503299808279247610860106861", 10));
    System.out.println(
        "Is " + mpzToString(auto, n3, 10) + " prime? " + bls.isPrime(n3, factors3)); // true
    return EXIT_CODE_OK;
  }

  @Command
  public int facO(@Option(names = {"--parallelism",
          "-t"}, defaultValue = "1", paramLabel = "parallelism") int parallelism,
      @Option(names = {"--offset"}, defaultValue = "0", paramLabel = "offset") int offset,
      @Option(names = {"--num",
          "-n"}, defaultValue = "1", paramLabel = "num for testing even number") int num) {
    if (num < 1) {
      throw new IllegalArgumentException("num >= 1");
    }
    var auto = Arena.ofAuto();
    record Pack(BigInteger p, List<BigInteger> factors, State state) {

    }
    final var windowSize = 6072;
    try (var pool = new ForkJoinPool(parallelism)) {
      pool.submit(() -> Stream.iterate(new BigInteger("1000000000000040813", 10),
              BigInteger::nextProbablePrime).limit(windowSize + num - 1).parallel()
          .gather(Gatherers.windowSliding(windowSize)).<Pack>mapMulti((list2, consumer) -> {
            var a = TWO;
            for (var bigInteger : list2) {
              a = a.multiply(bigInteger);
            }
            consumer.accept(new Pack(a.add(ONE), list2, State.N_ADD_1));
            consumer.accept(new Pack(a.subtract(ONE), list2, State.N_SUB_1));
          }).filter(pack -> {
            var a = newMpzStr(auto, pack.p().toString(10), 10);
            var i = mpz_probab_prime_p(a, 1);
            if (i == 0) {
              System.err.println("m9(^Д^)ﾌﾟｷﾞｬｰ");
            }
            return i != 0;
          }).findAny().ifPresent(pack -> {
            System.out.println(pack.p());
            System.out.println("--");
            pack.factors().forEach(System.out::println);
            System.out.println("--");
            System.out.println("pack.factors().size() = " + pack.factors().size());
            System.out.println("pack.state() = " + pack.state());
          }));
    }
    return EXIT_CODE_OK;
  }

  @Command
  public int primeSpam(int startDigits, int finishDigits, int numPerDigits) {
    var auto = Arena.ofAuto();
    var min = newMpzUi(auto, 10);
    mpz_pow_ui(min, min, startDigits);
    var max = newMpzUi(auto, 10);
    mpz_pow_ui(max, max, startDigits + 1);
    var window = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set(window, max);
    var state = __gmp_randstate_struct.allocate(auto).reinterpret(auto, gmp_h::gmp_randclear);
    gmp_randinit_default(state);
    seedRandomState(state);
    var p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(p);
    for (int currentDigits = startDigits; currentDigits <= finishDigits; currentDigits++) {
      for (int i = 0; i < numPerDigits; i++) {
        mpz_urandomm(p, state, window);
        mpz_add(p, p, min);
        mpz_nextprime(p, p);
      }
      mpz_mul_ui(min, min, 10);
      mpz_mul_ui(max, max, 10);
      mpz_sub(window, max, min);
    }
    return EXIT_CODE_OK;
  }

  @Command
  public int ts3(String id)
      throws NoSuchAlgorithmException, InvalidKeySpecException, NoSuchProviderException, DigestException, IOException {
    var index = id.indexOf('V');
    var counter = id.substring(0, index).getBytes(UTF_8);
    var decoder = Base64.getDecoder();
    var base64base64 = id.substring(index + 1);
    var base64 = decoder.decode(base64base64);
    var hash = new byte[20];
    var sha1 = MessageDigest.getInstance("SHA-1");
    // strlenなんて使ってんじゃねえよボケがよお……
    int zero = 0;
    while ((zero + 20) < base64.length && base64[20 + zero] != 0) {
      zero++;
    }
    sha1.update(base64, 20, zero);
    sha1.digest(hash, 0, 20);
    for (var i = 0; i < 20; i++) {
      base64[i] ^= hash[i];
    }
    var TSKEY = ("b9dfaa7bee6ac57ac7b65f1094a1c155" + "e747327bc2fe5d51c512023fe54a2802"
                 + "01004e90ad1daaae1075d53b7d571c30"
                 + "e063b5a62a4a017bb394833aa0983e6e").getBytes(UTF_8);
    int dataSize = Math.min(100, base64.length);
    for (var i = 0; i < dataSize; i++) {
      base64[i] ^= TSKEY[i];
    }
    var asn1String = decoder.decode(base64);
    ASN1Integer x;
    ASN1Integer y;
    ASN1Integer s;
    try (var in = new ASN1InputStream(asn1String)) {
      var sequence = (ASN1Sequence) in.readObject();
      x = ((ASN1Integer) sequence.getObjectAt(2));
      y = ((ASN1Integer) sequence.getObjectAt(3));
      s = (ASN1Integer) sequence.getObjectAt(4);
    }
    var encoder = Base64.getEncoder();
    var encode = encoder.encode(new DERSequence(
        new ASN1Encodable[]{new DERBitString(new byte[]{0}, 7), new ASN1Integer(32L), x,
            y}).getEncoded("der"));
    System.out.println(new String(encode));
    sha1.update(encode);
    sha1.update(counter);
    var digest = sha1.digest();
    System.out.println(countTrailingZeroBits(digest));
    System.out.println(HexFormat.of().formatHex(digest));
    return EXIT_CODE_OK;
  }

  @Command
  public int mineTS3(String publicKey,
      @Option(names = "--desiredSecurityLevel", paramLabel = "desiredSecurityLevel", defaultValue = "46") int desiredSecurityLevel)
      throws NoSuchAlgorithmException, NoSuchProviderException {
    var mine = mine(publicKey, desiredSecurityLevel);
    System.out.println(mine);
    return EXIT_CODE_OK;
  }

  /**
   * マイニング実行メソッド
   * @param fixedText 104文字の固定ASCIIテキスト（公開鍵など）
   * @param desiredSecurityLevel 目標セキュリティレベル
   * @return 見つかったNonce（セキュリティレベルが十分な場合）
   */
  public long mine(String fixedText, int desiredSecurityLevel)
      throws NoSuchAlgorithmException, NoSuchProviderException {
    byte[] fixedTextBytes = fixedText.getBytes(StandardCharsets.US_ASCII);

    var bc = LongStream.rangeClosed(0, Long.MAX_VALUE).parallel().filter(new LongPredicate() {
      final ThreadLocal<byte[]> bufferThreadLocal = ThreadLocal.withInitial(() -> {
        // ハッシュ計算に使う全体のバッファを用意
        // 104バイト (固定テキスト) + 19バイト (カウンター最大値のASCIIエンコード長)
        var b = new byte[123];
        System.arraycopy(fixedTextBytes, 0, b, 0, fixedTextBytes.length);
        return b;
      });
      final ThreadLocal<MessageDigest> sha1ThreadLocal = ThreadLocal.withInitial(() -> {
        try {
          return MessageDigest.getInstance("SHA-1", "BC"); // BCプロバイダを使用
        } catch (NoSuchAlgorithmException | NoSuchProviderException e) {
          throw new RuntimeException(e);
        }
      });
      final ThreadLocal<byte[]> hashThreadLocal = ThreadLocal.withInitial(() -> new byte[20]);

      @Override
      public boolean test(long nonce) {
        var buffer = bufferThreadLocal.get();
        var sha1 = sha1ThreadLocal.get();
        var hash = hashThreadLocal.get();

        // 符号なし整数を10進数ASCII文字列としてバッファにエンコード（最も遅い部分、最適化が必要）
        int nonceLength = encodeUnsignedIntAscii(nonce, buffer, fixedTextBytes.length);

        // SHA-1ハッシュ計算
        sha1.update(buffer, 0, fixedTextBytes.length + nonceLength);
        try {
          sha1.digest(hash, 0, 20);
        } catch (DigestException e) {
          throw new RuntimeException(e);
        }

        // 末尾ゼロビット数を高速カウント
        var currentSecurityLevel = countTrailingZeroBits(hash);

        if ((nonce & 68719476735L) == 0) {
          logger.info("Nonce: {}, Level: {}", nonce, currentSecurityLevel);
        }
        return currentSecurityLevel >= desiredSecurityLevel;
      }
    }).findAny();

    if (bc.isPresent()) {
      return bc.getAsLong();
    } else {
      return -1;
    }
  }

  @Command
  public int encodeEvenNumberObj(@Parameters(paramLabel = "out") Path out,
      @Parameters(paramLabel = "in") Path in, @Option(names = {"--dry-run"}) boolean dryRun,
      @Option(names = {"--show-bit-length"}) boolean showBitLength,
      @Option(names = {"--show-digit-length"}) boolean showDigitLength)
      throws IOException, ClassNotFoundException {
    BigInteger num;
    try (var stream = new ObjectInputStream(new BufferedInputStream(Files.newInputStream(in)))) {
      var o = stream.readObject();
      if (!(o instanceof BigInteger)) {
        return EXIT_CODE_SOFTWARE;
      }
      num = (BigInteger) o;
    }
    if (showBitLength) {
      System.out.println(num.bitLength());
    }
    if (showDigitLength) {
      var factor = Math.log(2) / Math.log(10);
      var digitCount = (int) (factor * num.bitLength() + 1);

      System.out.println(digitCount);
    }
    if (!dryRun) {

    }
    return EXIT_CODE_OK;
  }

  @Command
  public int createLargeSieve2(Path outPath, Path inPath, Path smallSieve) throws IOException {
    // 332,192,807bit number -> 460,517,015 bit sieve
    var arrayLength = (460517015 + 63) / 64;
    //var buffer = new long[arrayLength];
    try (var stream = new ObjectInputStream(
        new BufferedInputStream(Files.newInputStream(smallSieve), 2147483645))) {
      System.out.println(stream.readLong());
      var l = stream.readLong();
      System.out.printf("%016x%n", l);
      for (int i = 0; i < 64; i++) {
        if (((l >> i) & 1) == 0) {
          System.out.println(i + ", " + valueOf(i).shiftLeft(1).add(ONE).isProbablePrime(1));
        }
      }
    }
    return EXIT_CODE_OK;
  }

  @Command
  public int largestPrimeInDigits(int initDigits, int maxDigits, Path out) throws IOException {
    var auto = Arena.ofAuto();
    var n = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(n);
    var p = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(p);
    var diff = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(diff);
    var list = new ArrayList<String>(maxDigits - initDigits);
    for (int i = initDigits; i < maxDigits; i++) {
      mpz_set_ui(n, 10);
      mpz_pow_ui(n, n, i);
      mpz_prevprime(p, n);
      mpz_sub(diff, n, p);
      if (mpz_fits_ulong_p(diff)) {
        list.add("https://factordb.com/index.php?query=" + URLEncoder.encode(
            "10^" + i + "-" + mpz_get_u64(diff), UTF_8));
      }
      System.err.println(i);
    }
    Files.write(out, list, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
    return EXIT_CODE_OK;
  }

  @Command
  public int medalist() {
    // 現在の日時を取得
    var now = LocalDate.now();

    // 同じ月の25日のLocalDateを生成
    var specificDateTime = now.withDayOfMonth(25); // 月の25日に設定

    var formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd(E)", Locale.JAPANESE);
    List<LocalDate> weekendDates = new ArrayList<>();

    // 過去100ヶ月分ループ
    for (int i = 0; i < 100; i++) {
      var target = specificDateTime.minusMonths(i);
      DayOfWeek dow = target.getDayOfWeek();

      // 土曜日(SATURDAY)または日曜日(SUNDAY)か判定
      if (dow == DayOfWeek.SATURDAY || dow == DayOfWeek.SUNDAY) {
        weekendDates.add(target);
      }
    }

    // 結果の出力
    weekendDates.forEach(x -> System.out.println(x.format(formatter)));
    System.out.println("該当件数: " + weekendDates.size() + "件");
    return EXIT_CODE_OK;
  }

  enum ReadMode {
    HEAD, TAIL
  }

  private enum State {
    N_ADD_1, N_SUB_1
  }

  private record APredicate(byte[] buf) implements Predicate<A> {

    private static final Provider provider = Security.getProvider("BC");

    @Override
    public boolean test(A a) {
      try {
        var hash = new byte[64];
        var sha512 = MessageDigest.getInstance("SHA-512", provider);
        var ripemd160 = MessageDigest.getInstance("RIPEMD160", provider);
        sha512.update(buf, a.sign(), 65);
        sha512.update(buf, a.enc(), 65);
        sha512.digest(hash, 0, 64);
        ripemd160.update(hash, 0, 64);
        ripemd160.digest(hash, 0, 20);
        return hash[0] == 0 && hash[1] == 0 && hash[2] == 0 && hash[3] == 0 && hash[4] == 0
               && hash[5] == 0;
      } catch (NoSuchAlgorithmException | DigestException e) {
        throw new RuntimeException(e);
      }
    }
  }

  private record A(int sign, int enc) {

  }
}
