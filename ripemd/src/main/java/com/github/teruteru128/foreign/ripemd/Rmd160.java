package com.github.teruteru128.foreign.ripemd;

import java.lang.foreign.MemorySegment;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * 64バイト入力専用のRIPEMD-160を16メッセージ同時に計算するネイティブ実装への入口。
 * <p>
 * ネイティブライブラリはシステムパスに入れていないので、次のいずれかで場所を教える必要がある。
 * <ol>
 *   <li>システムプロパティ{@value #LIBRARY_PATH_PROPERTY}に{@code .so}の絶対パス</li>
 *   <li>{@code java.library.path}に置いてライブラリ名{@value #LIBRARY_NAME}で解決させる</li>
 * </ol>
 * 見つからない場合やAVX-512の無いCPUでは{@link #isAvailable()}がfalseを返す。
 * 呼び出し側はOpenSSLの1件ずつの経路へフォールバックすること。
 */
public final class Rmd160 {

  /**
   * ネイティブライブラリの絶対パスを指定するシステムプロパティ。
   */
  public static final String LIBRARY_PATH_PROPERTY = "com.github.teruteru.rmd160.library";
  public static final String LIBRARY_NAME = "rmd160avx512";
  /**
   * 一度に処理するメッセージ数。
   */
  public static final int LANES = 16;
  /**
   * 入力1件のバイト数。SHA-512の出力をそのまま食わせる前提。
   */
  public static final int MESSAGE_LENGTH = 64;
  /**
   * 出力1件のバイト数。
   */
  public static final int DIGEST_LENGTH = 20;

  private static final boolean AVAILABLE;
  private static final String UNAVAILABLE_REASON;

  static {
    String reason = null;
    var loaded = false;
    try {
      var path = System.getProperty(LIBRARY_PATH_PROPERTY);
      if (path != null) {
        if (!Files.isRegularFile(Path.of(path))) {
          throw new UnsatisfiedLinkError(
              LIBRARY_PATH_PROPERTY + "が指すファイルがありません: " + path);
        }
        System.load(path);
      } else {
        System.loadLibrary(LIBRARY_NAME);
      }
      loaded = true;
    } catch (UnsatisfiedLinkError | RuntimeException e) {
      reason = "ネイティブライブラリを読み込めませんでした: " + e;
    }
    var available = false;
    if (loaded) {
      try {
        available = ripemd_h.rmd160_16way_available() != 0;
        if (!available) {
          reason = "このCPUはAVX-512に対応していません";
        }
      } catch (Throwable e) {
        reason = "rmd160_16way_availableの呼び出しに失敗しました: " + e;
      }
    }
    AVAILABLE = available;
    UNAVAILABLE_REASON = reason;
  }

  private Rmd160() {
  }

  /**
   * {@link #hash16}を呼べるか。
   */
  public static boolean isAvailable() {
    return AVAILABLE;
  }

  /**
   * 使えない理由。使える場合はnull。
   */
  public static String unavailableReason() {
    return UNAVAILABLE_REASON;
  }

  /**
   * 64バイトのメッセージ16本から20バイトのダイジェスト16本を計算する。
   *
   * @param in  {@value #LANES} * {@value #MESSAGE_LENGTH} バイト以上のネイティブメモリ
   * @param out {@value #LANES} * {@value #DIGEST_LENGTH} バイト以上のネイティブメモリ
   * @throws IllegalStateException 使えない環境で呼んだ場合
   */
  public static void hash16(MemorySegment in, MemorySegment out) {
    if (!AVAILABLE) {
      throw new IllegalStateException("rmd160_16wayは使えません: " + UNAVAILABLE_REASON);
    }
    ripemd_h.rmd160_16way(in, out);
  }
}
