package com.github.teruteru128.foreign;

import static com.github.teruteru128.foreign.windows.Windows_h.CreateMutexExA;
import static com.github.teruteru128.foreign.windows.Windows_h.strlen;
import static java.lang.foreign.MemoryLayout.sequenceLayout;
import static java.lang.foreign.MemoryLayout.structLayout;
import static java.lang.foreign.MemoryLayout.unionLayout;
import static java.lang.foreign.MemorySegment.NULL;
import static java.lang.foreign.ValueLayout.JAVA_BYTE;

import com.github.teruteru.gmp.__mpz_struct;
import com.github.teruteru.gmp.gmp_h;
import com.github.teruteru128.foreign.windows.Windows_h;
import java.lang.foreign.Arena;
import java.lang.foreign.ValueLayout;
import java.math.BigInteger;
import java.security.Provider;
import java.security.Security;
import java.util.Random;
import java.util.ServiceLoader;
import java.util.concurrent.Callable;
import java.util.random.RandomGenerator;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name = "foreign", subcommands = {CL.class, GMP.class, E.class})
public class Main implements Callable<Integer> {

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
    return 1;
  }

  @Command(name = "locale")
  int locale() {
    try (var arena = Arena.ofConfined()) {
      var locale = Locale.setlocale(0, arena.allocateFrom("Japanese_Japan.65001"));
      var len = strlen(locale);
      var loc = locale.reinterpret(len + 1);
      System.out.println(loc.getString(0));
    }
    return 0;
  }

  @Command(name = "mutex")
  public void mutexSample() {
    System.loadLibrary("Kernel32");
    var name = arena.allocateFrom("munchie");
    var mutexHandle = CreateMutexExA(NULL, name, 0, 0).reinterpret(arena, Windows_h::CloseHandle);
    if (mutexHandle.equals(NULL)) {
      throw new RuntimeException("mutexSample: mutex is null");
    }
    System.out.println("mutex create test:ok");
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
    ValueLayout.ADDRESS.targetLayout()
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
    return 0;
  }

  @Command(name = "prime")
  public void prime() {
    var random = RandomGenerator.of("SecureRandom");
    var p = new BigInteger(8192, 25, (Random) random);
    var auto = Arena.ofAuto();
    var pM = auto.allocate(__mpz_struct.layout());
    var string = p.toString(16);
    System.out.println(string);
    gmp_h.__gmpz_init_set_str(pM, auto.allocateFrom(string), 16);
    var a = gmp_h.__gmpz_probab_prime_p(pM, 25);
    System.out.printf("probab_prime: %d%n", a);
  }

}
