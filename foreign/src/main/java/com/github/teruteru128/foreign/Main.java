package com.github.teruteru128.foreign;

import static com.github.teruteru128.gmp.msys2.__mpz_struct.allocateArray;
import static com.github.teruteru128.gmp.msys2.__mpz_struct.asSlice;
import static com.github.teruteru128.gmp.msys2.__mpz_struct.layout;
import static com.github.teruteru128.gmp.msys2.gmp_h.mpz_add_ui;
import static com.github.teruteru128.gmp.msys2.gmp_h.mpz_cmp_ui;
import static com.github.teruteru128.gmp.msys2.gmp_h.mpz_export;
import static com.github.teruteru128.gmp.msys2.gmp_h.mpz_gcd;
import static com.github.teruteru128.gmp.msys2.gmp_h.mpz_get_str;
import static com.github.teruteru128.gmp.msys2.gmp_h.mpz_init;
import static com.github.teruteru128.gmp.msys2.gmp_h.mpz_init2;
import static com.github.teruteru128.gmp.msys2.gmp_h.mpz_init_set;
import static com.github.teruteru128.gmp.msys2.gmp_h.mpz_init_set_str;
import static com.github.teruteru128.gmp.msys2.gmp_h.mpz_init_set_ui;
import static com.github.teruteru128.gmp.msys2.gmp_h.mpz_invert;
import static com.github.teruteru128.gmp.msys2.gmp_h.mpz_mod;
import static com.github.teruteru128.gmp.msys2.gmp_h.mpz_mul;
import static com.github.teruteru128.gmp.msys2.gmp_h.mpz_probab_prime_p;
import static com.github.teruteru128.gmp.msys2.gmp_h.mpz_set_str;
import static com.github.teruteru128.gmp.msys2.gmp_h.mpz_sizeinbase;
import static com.github.teruteru128.gmp.msys2.gmp_h.mpz_sub_ui;
import static com.github.teruteru128.mpz_aprcl.mpz_aprcl_h.APRTCLE_VERBOSE2;
import static com.github.teruteru128.mpz_aprcl.mpz_aprcl_h.mpz_aprtcle;
import static java.lang.foreign.ValueLayout.JAVA_BYTE;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

import com.github.teruteru128.foreign.prime.search.PrimeSearch;
import com.github.teruteru128.gmp.msys2.__mpz_struct;
import com.github.teruteru128.gmp.msys2.gmp_h;
import java.io.IOException;
import java.lang.foreign.Arena;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.security.Provider;
import java.security.Security;
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

@Command(name = "foreign", subcommands = {CL.class, PrimeSearch.class, E.class,
    CommandLine.HelpCommand.class})
public class Main implements Callable<Integer> {

  private static final Logger logger = LoggerFactory.getLogger(Main.class);

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

  @Override
  public Integer call() {
    System.err.println("ナニモナイヨー");
    return ExitCode.USAGE;
  }

  @Command(name = "sha256")
  public Integer sha(String msg) {
    BCrypt.SHA256(msg);
    return 0;
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
  public int prime2(@Option(names = "--path", required = true) Path path,
      @Option(names = "--step", required = true) int step) throws IOException {
    var auto = Arena.ofAuto();
    var p = auto.allocate(layout()).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init_set_str(p, auto.allocateFrom(Files.readAllLines(path).getFirst()), 10);
    mpz_add_ui(p, p, step * 2 + 1);
    logger.info("primality test start");
    var ret = mpz_aprtcle(p, APRTCLE_VERBOSE2());
    logger.info("result: {}", ret);
    return ret == 1 || ret == 2 ? ExitCode.OK : ExitCode.SOFTWARE;
  }

  @Command
  public int createPrime(Path out, Path in, int step) {
    return ExitCode.OK;
  }

  /**
   * 素数2つをRSA Private CRT key に変換してファイルに書き出す
   *
   * @param privateKeyOutPath 秘密鍵出力ファイル
   * @param publicKeyOutPath 公開鍵出力ファイル
   * @param pPath             入力素数ファイルP
   * @param qPath             入力素数ファイルQ
   * @return 終了コード(if ( success) return 0; else 1)
   * @throws IOException file I/O Error
   */
  @Command(name = "rsaEncode")
  public int rsaEncode(@Parameters(description = "private key output path") Path privateKeyOutPath,
      @Parameters(description = "public key output path") Path publicKeyOutPath,
      @Parameters(description = "prime p input path") Path pPath,
      @Parameters(description = "prime p input path") Path qPath) throws IOException {
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

    mpz_init_set_str(p, auto.allocateFrom(Files.readAllLines(pPath).getFirst()), 10);
    mpz_init_set_str(q, auto.allocateFrom(Files.readAllLines(qPath).getFirst()), 10);
    if (gmp_h.mpz_cmp(p, q) < 0) {
      gmp_h.mpz_swap(p, q);
    }
    mpz_init(n);
    mpz_mul(n, p, q);
    mpz_init_set(pSub1, p);
    mpz_sub_ui(pSub1, pSub1, 1);
    mpz_init_set(qSub1, q);
    mpz_sub_ui(qSub1, qSub1, 1);
    mpz_init2(phi, (int) (mpz_sizeinbase(pSub1, 2) + mpz_sizeinbase(qSub1, 2) + 1));
    mpz_mul(phi, pSub1, qSub1);
    mpz_init_set_ui(e, 65537);
    mpz_init2(d, (int) mpz_sizeinbase(phi, 2));
    mpz_invert(d, e, phi);
    mpz_init2(exponent1, (int) mpz_sizeinbase(pSub1, 2));
    mpz_mod(exponent1, d, pSub1);
    mpz_init2(exponent2, (int) mpz_sizeinbase(qSub1, 2));
    mpz_mod(exponent2, d, qSub1);
    mpz_init2(coefficient, (int) mpz_sizeinbase(p, 2));
    mpz_invert(coefficient, q, p);

    var base = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(base);
    mpz_set_str(base, auto.allocateFrom(
        "8138e8a0fcf3a4e84a771d40fd305d7f4aa59306d7251de54d98af8fe95729a1f"
        + "73d893fa424cd2edc8636a6c3285e022b0e3866a565ae8108eed8591cd4fe8d2"
        + "ce86165a978d719ebf647f362d33fca29cd179fb42401cbaf3df0c614056f9c8"
        + "f3cfd51e474afb6bc6974f78db8aba8e9e517fded658591ab7502bd41849462f"), 16);
    var gcd2 = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    mpz_init(gcd2);
    mpz_gcd(gcd2, base, n);
    if (mpz_cmp_ui(gcd2, 1) != 0) {
      var len = mpz_sizeinbase(gcd2, 10) + 2;
      var b = auto.allocate(len);
      mpz_get_str(b, 10, gcd2);
      logger.error("divisible by {}", b.getString(0));
      return ExitCode.SOFTWARE;
    }

    var pSize = mpz_sizeinbase(p, 2);
    var qSize = mpz_sizeinbase(q, 2);
    var nSize = mpz_sizeinbase(n, 2);
    // eSize
    var dSize = mpz_sizeinbase(d, 2);
    var expo1Size = mpz_sizeinbase(exponent1, 2);
    var expo2Size = mpz_sizeinbase(exponent2, 2);
    var coefficientSize = mpz_sizeinbase(coefficient, 2);
    System.out.println("pSize = " + (pSize + 8) / 8);
    System.out.println("qSize = " + (qSize + 8) / 8);
    System.out.println("nSize = " + (nSize + 8) / 8);
    System.out.println("dSize = " + (dSize + 8) / 8);
    System.out.println("expo1Size = " + (expo1Size + 8) / 8);
    System.out.println("expo2Size = " + (expo2Size + 8) / 8);
    System.out.println("coefficientSize = " + (coefficientSize + 8) / 8);
    var buf = auto.allocate(1179700);
    long offset = 0;
    // SEQUENCE
    buf.set(JAVA_BYTE, offset, (byte) 0x30);
    buf.set(JAVA_BYTE, offset + 1, (byte) 0x83);
    buf.set(JAVA_BYTE, offset + 2, (byte) 0x12);
    buf.set(JAVA_BYTE, offset + 3, (byte) 0x00);
    buf.set(JAVA_BYTE, offset + 4, (byte) 0x2f);
    offset += 5;
    // version
    buf.set(JAVA_BYTE, offset, (byte) 0x02);
    buf.set(JAVA_BYTE, offset + 1, (byte) 0x01);
    buf.set(JAVA_BYTE, offset + 2, (byte) 0x00);
    offset += 3;
    // mod
    buf.set(JAVA_BYTE, offset, (byte) 0x02);
    buf.set(JAVA_BYTE, offset + 1, (byte) 0x83);
    buf.set(JAVA_BYTE, offset + 2, (byte) 0x04);
    buf.set(JAVA_BYTE, offset + 3, (byte) 0x00);
    buf.set(JAVA_BYTE, offset + 4, (byte) 0x01);
    offset += 5;
    var countP = auto.allocate(JAVA_LONG);
    mpz_export(buf.asSlice(offset + (nSize % 8 == 0 ? 1 : 0)), countP, 0, JAVA_BYTE.byteSize(), 0,
        0, n);
    System.out.printf("%02x%02x%02x%n", buf.get(JAVA_BYTE, offset) & 0xff,
        buf.get(JAVA_BYTE, offset + 1) & 0xff, buf.get(JAVA_BYTE, offset + 2) & 0xff);
    offset += (nSize + 8) / 8;
    // pub exp
    buf.set(JAVA_BYTE, offset, (byte) 0x02);
    buf.set(JAVA_BYTE, offset + 1, (byte) 0x03);
    buf.set(JAVA_BYTE, offset + 2, (byte) 0x01);
    buf.set(JAVA_BYTE, offset + 3, (byte) 0x00);
    buf.set(JAVA_BYTE, offset + 4, (byte) 0x01);
    offset += 5;
    // pri exp
    buf.set(JAVA_BYTE, offset, (byte) 0x02);
    buf.set(JAVA_BYTE, offset + 1, (byte) 0x83);
    buf.set(JAVA_BYTE, offset + 2, (byte) 0x04);
    buf.set(JAVA_BYTE, offset + 3, (byte) 0x00);
    buf.set(JAVA_BYTE, offset + 4, (byte) 0x00);
    offset += 5;
    mpz_export(buf.asSlice(offset + (dSize % 8 == 0 ? 1 : 0)), countP, 0, JAVA_BYTE.byteSize(), 0,
        0, d);
    System.out.printf("%02x%02x%02x%n", buf.get(JAVA_BYTE, offset) & 0xff,
        buf.get(JAVA_BYTE, offset + 1) & 0xff, buf.get(JAVA_BYTE, offset + 2) & 0xff);
    offset += (dSize + 8) / 8;
    // p
    buf.set(JAVA_BYTE, offset, (byte) 0x02);
    buf.set(JAVA_BYTE, offset + 1, (byte) 0x83);
    buf.set(JAVA_BYTE, offset + 2, (byte) 0x02);
    buf.set(JAVA_BYTE, offset + 3, (byte) 0x00);
    buf.set(JAVA_BYTE, offset + 4, (byte) 0x01);
    offset += 5;
    mpz_export(buf.asSlice(offset + (pSize % 8 == 0 ? 1 : 0)), countP, 0, JAVA_BYTE.byteSize(), 0,
        0, p);
    System.out.printf("%02x%02x%02x%n", buf.get(JAVA_BYTE, offset) & 0xff,
        buf.get(JAVA_BYTE, offset + 1) & 0xff, buf.get(JAVA_BYTE, offset + 2) & 0xff);
    offset += (pSize + 8) / 8;
    // q
    buf.set(JAVA_BYTE, offset, (byte) 0x02);
    buf.set(JAVA_BYTE, offset + 1, (byte) 0x83);
    buf.set(JAVA_BYTE, offset + 2, (byte) 0x02);
    buf.set(JAVA_BYTE, offset + 3, (byte) 0x00);
    buf.set(JAVA_BYTE, offset + 4, (byte) 0x01);
    offset += 5;
    mpz_export(buf.asSlice(offset + (qSize % 8 == 0 ? 1 : 0)), countP, 0, JAVA_BYTE.byteSize(), 0,
        0, q);
    System.out.printf("%02x%02x%02x%n", buf.get(JAVA_BYTE, offset) & 0xff,
        buf.get(JAVA_BYTE, offset + 1) & 0xff, buf.get(JAVA_BYTE, offset + 2) & 0xff);
    offset += (qSize + 8) / 8;
    // exp1
    buf.set(JAVA_BYTE, offset, (byte) 0x02);
    buf.set(JAVA_BYTE, offset + 1, (byte) 0x83);
    buf.set(JAVA_BYTE, offset + 2, (byte) 0x02);
    buf.set(JAVA_BYTE, offset + 3, (byte) 0x00);
    buf.set(JAVA_BYTE, offset + 4, (byte) 0x01);
    offset += 5;
    mpz_export(buf.asSlice(offset + (expo1Size % 8 == 0 ? 1 : 0)), countP, 0, JAVA_BYTE.byteSize(),
        0, 0, exponent1);
    offset += (expo1Size + 8) / 8;
    // exp2
    buf.set(JAVA_BYTE, offset, (byte) 0x02);
    buf.set(JAVA_BYTE, offset + 1, (byte) 0x83);
    buf.set(JAVA_BYTE, offset + 2, (byte) 0x02);
    buf.set(JAVA_BYTE, offset + 3, (byte) 0x00);
    buf.set(JAVA_BYTE, offset + 4, (byte) 0x00);
    offset += 5;
    mpz_export(buf.asSlice(offset + (expo2Size % 8 == 0 ? 1 : 0)), countP, 0, JAVA_BYTE.byteSize(),
        0, 0, exponent2);
    System.out.printf("%02x%02x%02x%n", buf.get(JAVA_BYTE, offset) & 0xff,
        buf.get(JAVA_BYTE, offset + 1) & 0xff, buf.get(JAVA_BYTE, offset + 2) & 0xff);
    offset += (expo2Size + 8) / 8;
    // coef
    buf.set(JAVA_BYTE, offset, (byte) 0x02);
    buf.set(JAVA_BYTE, offset + 1, (byte) 0x83);
    buf.set(JAVA_BYTE, offset + 2, (byte) 0x02);
    buf.set(JAVA_BYTE, offset + 3, (byte) 0x00);
    buf.set(JAVA_BYTE, offset + 4, (byte) 0x00);
    offset += 5;
    mpz_export(buf.asSlice(offset + (coefficientSize % 8 == 0 ? 1 : 0)), countP, 0,
        JAVA_BYTE.byteSize(), 0, 0, coefficient);
    System.out.printf("%02x%02x%02x%n", buf.get(JAVA_BYTE, offset) & 0xff,
        buf.get(JAVA_BYTE, offset + 1) & 0xff, buf.get(JAVA_BYTE, offset + 2) & 0xff);
    var array = buf.toArray(JAVA_BYTE);
    Files.write(privateKeyOutPath, array, StandardOpenOption.CREATE, StandardOpenOption.CREATE);
    return ExitCode.OK;
  }

}
