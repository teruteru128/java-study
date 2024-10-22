package com.github.teruteru128.foreign;

import static com.github.teruteru.gmp.__mpz_struct.allocateArray;
import static com.github.teruteru.gmp.__mpz_struct.asSlice;
import static com.github.teruteru.gmp.__mpz_struct.layout;
import static com.github.teruteru.gmp.gmp_h.mp_get_memory_functions;
import static com.github.teruteru.gmp.gmp_h.mpz_add_ui;
import static com.github.teruteru.gmp.gmp_h.mpz_export;
import static com.github.teruteru.gmp.gmp_h.mpz_init2;
import static com.github.teruteru.gmp.gmp_h.mpz_init_set;
import static com.github.teruteru.gmp.gmp_h.mpz_init_set_str;
import static com.github.teruteru.gmp.gmp_h.mpz_init_set_ui;
import static com.github.teruteru.gmp.gmp_h.mpz_invert;
import static com.github.teruteru.gmp.gmp_h.mpz_mod;
import static com.github.teruteru.gmp.gmp_h.mpz_mul;
import static com.github.teruteru.gmp.gmp_h.mpz_probab_prime_p;
import static com.github.teruteru.gmp.gmp_h.mpz_sizeinbase;
import static com.github.teruteru.gmp.gmp_h.mpz_sub_ui;
import static com.github.teruteru.mpz_aprcl.mpz_aprcl_h.APRTCLE_VERBOSE2;
import static com.github.teruteru.mpz_aprcl.mpz_aprcl_h.mpz_aprtcle;
import static com.github.teruteru128.foreign.windows.Windows_h.CreateMutexExA;
import static com.github.teruteru128.foreign.windows.Windows_h.strlen;
import static java.lang.foreign.MemoryLayout.sequenceLayout;
import static java.lang.foreign.MemoryLayout.structLayout;
import static java.lang.foreign.MemoryLayout.unionLayout;
import static java.lang.foreign.MemorySegment.NULL;
import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_BYTE;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

import com.github.teruteru.gmp.__mpz_struct;
import com.github.teruteru.gmp.gmp_h;
import com.github.teruteru128.foreign.converters.PathConverter;
import com.github.teruteru128.foreign.windows.Windows_h;
import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.util.Random;
import java.util.ServiceLoader;
import java.util.concurrent.Callable;
import java.util.random.RandomGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "foreign", subcommands = {CL.class, GMP.class, E.class})
public class Main implements Callable<Integer> {

  private static final Logger log = LoggerFactory.getLogger(Main.class);

  static {
    for (var provider : ServiceLoader.load(Provider.class)) {
      if (Security.getProvider(provider.getName()) == null) {
        Security.addProvider(provider);
      }
    }
  }

  private final Arena arena = Arena.ofConfined();
  @Parameters
  private String[] msg = {"\uD83D\uDCA9"};

  public Main() {
  }

  public static void main(String[] args) {
    int exitCode = new CommandLine(new Main()).execute(args);
    Runtime.getRuntime().exit(exitCode);
  }

  /**
   *
   * @param x0 mpz_t
   * @return x0 converted to a BigInteger.
   */
  private static BigInteger mpzToBigInteger(MemorySegment x0) {
    var auto = Arena.ofAuto();
    var countP = auto.allocate(JAVA_LONG);
    var seg = auto.allocate((mpz_sizeinbase(x0, 2) + 7) / 8);
    var pSegment = mpz_export(seg, countP, 0, JAVA_BYTE.byteSize(), 0, 0, x0);
    pSegment = pSegment.reinterpret(countP.getAtIndex(JAVA_LONG, 0));
    var pA = pSegment.toArray(JAVA_BYTE);
    if ((pA[0] & 0x80) != 0) {
      var tmp = new byte[pA.length + 1];
      System.arraycopy(pA, 0, tmp, 1, pA.length);
      return new BigInteger(tmp).multiply(BigInteger.valueOf(
          Integer.compare(__mpz_struct._mp_size(x0), 0)));
    } else {
      return new BigInteger(pA).multiply(BigInteger.valueOf(
          Integer.compare(__mpz_struct._mp_size(x0), 0)));
    }
  }

  @Override
  public Integer call() {
    System.err.println("ナニモナイヨー");
    return ExitCode.USAGE;
  }

  @Command(name = "locale")
  public int locale() {
    try (var arena = Arena.ofConfined()) {
      var locale = Locale.setlocale(0, arena.allocateFrom("Japanese_Japan.65001"));
      var len = strlen(locale);
      var loc = locale.reinterpret(len + 1);
      System.out.println(loc.getString(0));
    }
    return ExitCode.OK;
  }

  @Command(name = "mutex")
  public int mutexSample() {
    System.loadLibrary("Kernel32");
    var name = arena.allocateFrom("munchie");
    var mutexHandle = CreateMutexExA(NULL, name, 0, 0).reinterpret(arena, Windows_h::CloseHandle);
    if (mutexHandle.equals(NULL)) {
      throw new RuntimeException("mutexSample: mutex is null");
    }
    System.out.println("mutex create test:ok");
    return ExitCode.OK;
  }

  @Command(name = "foreign")
  public int foreign() {
    // でも本当にほしいのはSocketとかファイルとかMessageDigestとかの連携なんだよね……
    // もしかしてネイティブライブラリにアクセスできるならOpenSSLにアクセスもできる……？
    // OpenCLもアクセスできるっぽい
    var sequenceLayout = sequenceLayout(32, JAVA_BYTE);
    var structLayout = structLayout(JAVA_BYTE.withName("prefix"), sequenceLayout.withName("x"),
        sequenceLayout.withName("y")).withName("b");
    var publicKeyLayout = unionLayout(sequenceLayout(65, JAVA_BYTE).withName("a"), structLayout);
    System.out.println(publicKeyLayout);
    System.loadLibrary("BCrypt");
    ADDRESS.targetLayout()
        .ifPresent(memoryLayout -> System.out.printf("address value layout: %s%n", memoryLayout));
    // TODO ConfinedとAutoを使い分ける
    // Confined: malloc
    // Auto: alloca
    var length = msg.length;
    for (int i = 0; i < length; i++) {
      System.out.printf("strlen(args[%d]) = %s%n", i, strlen(arena.allocateFrom(msg[i])));
    }
    if (msg.length >= 1) {
      BCrypt.SHA256(msg[0]);
    }
    return ExitCode.OK;
  }

  @Command(name = "prime")
  public void prime() {
    var random = RandomGenerator.of("SecureRandom");
    var p = new BigInteger(8192, 25, (Random) random);
    var auto = Arena.ofAuto();
    var pM = auto.allocate(layout());
    var string = p.toString(16);
    System.out.println(string);
    mpz_init_set_str(pM, auto.allocateFrom(string), 16);
    var a = mpz_probab_prime_p(pM, 25);
    System.out.printf("probab_prime: %d%n", a);
  }

  @Command(name = "primeTest")
  public int prime2(
      @Option(names = "--path", required = true, converter = PathConverter.class) Path path,
      @Option(names = "--step", required = true) long step) throws IOException {
    var auto = Arena.ofAuto();
    var p = auto.allocate(layout()).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_str(p, auto.allocateFrom(Files.readAllLines(path).getFirst()), 10);
    mpz_add_ui(p, p, step * 2 + 1);
    log.info("primality test start");
    var ret = mpz_aprtcle(p, APRTCLE_VERBOSE2());
    log.info("result: {}", ret);
    return ret == 1 || ret == 2 ? ExitCode.OK : ExitCode.SOFTWARE;
  }

  /**
   * 素数2つをRSA Private CRT key に変換してファイルに書き出す
   * @param outPath 出力ファイル
   * @param pPath 入力素数ファイルP
   * @param qPath 入力素数ファイルQ
   * @return 終了コード(if ( success) return 0; else 1)
   * @throws IOException file I/O Error
   */
  @Command(name = "rsaEncode")
  public int rsaEncode(@Parameters(converter = PathConverter.class) Path outPath,
      @Parameters(converter = PathConverter.class) Path pPath,
      @Parameters(converter = PathConverter.class) Path qPath) throws IOException {
    var auto = Arena.ofAuto();
    var variables = allocateArray(11, auto);
    // asSliceメソッドはcleanupアクションを受け継ぐんだろうか？
    var p = asSlice(variables, 0).reinterpret(auto, gmp_h::mpz_clear);
    var q = asSlice(variables, 1).reinterpret(auto, gmp_h::mpz_clear);
    var n = asSlice(variables, 2).reinterpret(auto, gmp_h::mpz_clear);
    var pSub1 = asSlice(variables, 3).reinterpret(auto, gmp_h::mpz_clear);
    var qSub1 = asSlice(variables, 4).reinterpret(auto, gmp_h::mpz_clear);
    var phi = asSlice(variables, 5).reinterpret(auto, gmp_h::mpz_clear);
    var e = asSlice(variables, 6).reinterpret(auto, gmp_h::mpz_clear);
    var d = asSlice(variables, 7).reinterpret(auto, gmp_h::mpz_clear);
    var exponent1 = asSlice(variables, 8).reinterpret(auto, gmp_h::mpz_clear);
    var exponent2 = asSlice(variables, 9).reinterpret(auto, gmp_h::mpz_clear);
    var coefficient = asSlice(variables, 10).reinterpret(auto, gmp_h::mpz_clear);

    mpz_init_set_str(p, arena.allocateFrom(Files.readAllLines(pPath).getFirst()), 16);
    mpz_init_set_str(q, arena.allocateFrom(Files.readAllLines(qPath).getFirst()), 16);
    mpz_init2(n, mpz_sizeinbase(p, 2) + mpz_sizeinbase(q, 2) + 1);
    mpz_mul(n, p, q);
    mpz_init_set(pSub1, p);
    mpz_sub_ui(pSub1, pSub1, 1);
    mpz_init_set(qSub1, q);
    mpz_sub_ui(qSub1, qSub1, 1);
    mpz_init2(phi, mpz_sizeinbase(pSub1, 2) + mpz_sizeinbase(qSub1, 2) + 1);
    mpz_mul(phi, pSub1, qSub1);
    mpz_init_set_ui(e, 65537);
    mpz_init2(d, mpz_sizeinbase(phi, 2));
    mpz_invert(d, e, phi);
    mpz_init2(exponent1, mpz_sizeinbase(pSub1, 2));
    mpz_mod(exponent1, d, pSub1);
    mpz_init2(exponent2, mpz_sizeinbase(qSub1, 2));
    mpz_mod(exponent2, d, qSub1);
    mpz_init2(coefficient, mpz_sizeinbase(p, 2));
    mpz_invert(coefficient, q, p);

    var freeFuncPtr = auto.allocate(ADDRESS);
    mp_get_memory_functions(NULL, NULL, freeFuncPtr);

    // こんな面倒くさいことするんだったら普通に10進数なり16進数なりにエンコードして読み込ませたほうがいいような
    var pBI = mpzToBigInteger(p);
    var qBI = mpzToBigInteger(q);
    var nBI = mpzToBigInteger(n);
    var eBI = BigInteger.valueOf(65537);
    var dBI = mpzToBigInteger(d);
    var exponent1BI = mpzToBigInteger(exponent1);
    var exponent2BI = mpzToBigInteger(exponent2);
    var coefficientBI = mpzToBigInteger(coefficient);
    var spec = new RSAPrivateCrtKeySpec(nBI, eBI, dBI, pBI, qBI, exponent1BI, exponent2BI,
        coefficientBI);
    try {
      var f = KeyFactory.getInstance("RSA");
      var spec2 = f.getKeySpec(f.generatePrivate(spec), PKCS8EncodedKeySpec.class);
      Files.write(outPath, spec2.getEncoded(), StandardOpenOption.CREATE,
          StandardOpenOption.CREATE);
    } catch (NoSuchAlgorithmException | InvalidKeySpecException ex) {
      throw new RuntimeException(ex);
    }
    return ExitCode.OK;
  }

}
