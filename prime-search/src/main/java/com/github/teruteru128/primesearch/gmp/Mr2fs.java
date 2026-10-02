package com.github.teruteru128.primesearch.gmp;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * FLINT fft_smallによる底2のMiller-Rabin(src/mr2fs.c)への入口。
 * <p>
 * 2,097,152bitの判定でGMPの{@code mpz_probab_prime_p}内の底2判定の約2倍速い。
 * ネイティブライブラリはシステムパスに入れていないので、システムプロパティ
 * {@value #LIBRARY_PATH_PROPERTY}に{@code .so}の絶対パスを渡すか、{@code java.library.path}に置く。
 * 見つからない場合やAVX2の無いCPUでは{@link #isAvailable()}がfalseを返すので、
 * 呼び出し側はGMPの経路へフォールバックすること(壊れはしない)。
 */
public final class Mr2fs {

  /** ネイティブライブラリの絶対パスを指定するシステムプロパティ。 */
  public static final String LIBRARY_PATH_PROPERTY = "com.github.teruteru.mr2fs.library";
  public static final String LIBRARY_NAME = "mr2fs";

  private static final MethodHandle STRONG_BASE2;
  private static final boolean AVAILABLE;
  private static final String UNAVAILABLE_REASON;

  static {
    String reason = null;
    MethodHandle strong = null;
    var available = false;
    try {
      var path = System.getProperty(LIBRARY_PATH_PROPERTY);
      if (path != null) {
        if (!Files.isRegularFile(Path.of(path))) {
          throw new UnsatisfiedLinkError(LIBRARY_PATH_PROPERTY + "が指すファイルがありません: " + path);
        }
        System.load(path);
      } else {
        System.loadLibrary(LIBRARY_NAME);
      }
      var lookup = SymbolLookup.loaderLookup();
      var linker = Linker.nativeLinker();
      var availableHandle = linker.downcallHandle(
          lookup.find("mr2fs_available").orElseThrow(),
          FunctionDescriptor.of(ValueLayout.JAVA_INT));
      strong = linker.downcallHandle(
          lookup.find("mr2fs_strong_base2").orElseThrow(),
          FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
      available = (int) availableHandle.invokeExact() != 0;
      if (!available) {
        reason = "このCPUはAVX2/FMAに対応していません";
      }
    } catch (Throwable e) {
      reason = "ネイティブライブラリを使えません: " + e;
    }
    STRONG_BASE2 = strong;
    AVAILABLE = available;
    UNAVAILABLE_REASON = reason;
  }

  private Mr2fs() {
  }

  /** {@link #strongBase2}を呼べるか。 */
  public static boolean isAvailable() {
    return AVAILABLE;
  }

  /** 使えない理由。使える場合はnull。 */
  public static String unavailableReason() {
    return UNAVAILABLE_REASON;
  }

  /**
   * nが底2の強い確率的素数かを判定する。
   *
   * @param n 初期化済みのmpz_t
   * @return 1:強い確率的素数, 0:合成数, -1:この実装では判定できない(偶数、16リム未満、
   * 最上位ビットがリム境界に揃っていない、ライブラリが使えない)。-1のときは
   * {@link Gmp#probabPrimeP}に任せること
   */
  public static int strongBase2(MemorySegment n) {
    if (!AVAILABLE) {
      return -1;
    }
    try {
      return (int) STRONG_BASE2.invokeExact(n);
    } catch (Throwable e) {
      throw new IllegalStateException("mr2fs_strong_base2の呼び出しに失敗しました", e);
    }
  }
}
