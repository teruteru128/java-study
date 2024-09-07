package com.github.teruteru128.foreign;

import static com.github.teruteru128.foreign.windows.Windows_h.CreateMutexExA;
import static com.github.teruteru128.foreign.windows.Windows_h.strlen;
import static java.lang.foreign.MemoryLayout.sequenceLayout;
import static java.lang.foreign.MemoryLayout.structLayout;
import static java.lang.foreign.MemoryLayout.unionLayout;
import static java.lang.foreign.MemorySegment.NULL;
import static java.lang.foreign.ValueLayout.JAVA_BYTE;

import com.github.teruteru128.foreign.windows.Windows_h;
import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.ValueLayout;
import java.security.Provider;
import java.security.Security;
import java.util.ServiceLoader;
import java.util.concurrent.Callable;

public class Main implements Callable<Void> {

  private final String[] args;

  public Main(String[] args) {
    this.args = args;
  }

  public static void main(String[] args)
      throws NoSuchMethodException, IllegalAccessException, IOException {
    for (var provider : ServiceLoader.load(Provider.class)) {
      if (Security.getProvider(provider.getName()) == null) {
        Security.addProvider(provider);
      }
    }
    var main = new Main(args);
    main.call();
  }

  @Override
  public Void call() throws NoSuchMethodException, IllegalAccessException, IOException {
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
    try (var arena = Arena.ofConfined(); var cl = new CL()) {
      var length = args.length;
      for (int i = 0; i < length; i++) {
        System.out.printf("strlen(args[%d]) = %s%n", i, strlen(arena.allocateFrom(args[i])));
      }
      cl.cl();
      var locale = Locale.setlocale(0, arena.allocateFrom("Japanese_Japan.65001"));
      var len = strlen(locale);
      var loc = locale.reinterpret(len + 1);
      System.out.println(loc.getString(0));
      BCrypt.SHA256(args.length >= 1 ? args[0] : "\uD83D\uDCA9");
      mutexSample(arena);
    }
    return null;
  }

  public void mutexSample(Arena arena) {
    System.loadLibrary("Kernel32");
    var name = arena.allocateFrom("munchie");
    var mutexHandle = CreateMutexExA(NULL, name, 0, 0).reinterpret(arena, Windows_h::CloseHandle);
    if (mutexHandle.equals(NULL)) {
      throw new RuntimeException("mutexSample: mutex is null");
    }
    System.out.println("mutex create test:ok");
  }

}
