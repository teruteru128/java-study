package com.github.teruteru128.foreign.bmhash;

import java.lang.foreign.MemorySegment;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * bitmessageのripe計算 {@code RIPEMD160(SHA512(署名鍵 || 暗号化鍵))} を16メッセージ同時に
 * 計算するネイティブ実装(AVX-512)への入口。
 * <p>
 * どちらの段も入力長が固定である前提に特化している。
 * <ul>
 *   <li>{@link #sha512(MemorySegment, MemorySegment)} 130バイト×16 → 64バイト×16</li>
 *   <li>{@link #ripemd160(MemorySegment, MemorySegment)} 64バイト×16 → 20バイト×16</li>
 * </ul>
 * ネイティブライブラリはシステムパスに入れていないので、次のいずれかで場所を教える必要がある。
 * <ol>
 *   <li>システムプロパティ{@value #LIBRARY_PATH_PROPERTY}に{@code .so}の絶対パス</li>
 *   <li>{@code java.library.path}に置いてライブラリ名{@value #LIBRARY_NAME}で解決させる</li>
 * </ol>
 * 見つからない場合やAVX-512の無いCPUでは{@link #isAvailable()}がfalseを返す。
 * 呼び出し側はOpenSSLの1件ずつの経路へフォールバックすること。
 */
public final class BmHash16 {

  /** ネイティブライブラリの絶対パスを指定するシステムプロパティ。 */
  public static final String LIBRARY_PATH_PROPERTY = "com.github.teruteru.bmhash16.library";
  public static final String LIBRARY_NAME = "bmhash16";
  /** 一度に処理するメッセージ数。 */
  public static final int LANES = 16;
  /** SHA-512への入力1件のバイト数。公開鍵65バイト×2。 */
  public static final int SHA512_INPUT_LENGTH = 130;
  /** SHA-512の出力1件のバイト数。そのままRIPEMD-160の入力になる。 */
  public static final int SHA512_DIGEST_LENGTH = 64;
  /** RIPEMD-160の出力1件のバイト数。 */
  public static final int RIPEMD160_DIGEST_LENGTH = 20;
  /** 公開鍵1本のバイト数。 */
  public static final int PUBLIC_KEY_LENGTH = 65;

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
        available = bmhash16_h.rmd160_16way_available() != 0
                    && bmhash16_h.sha512_16way_available() != 0;
        if (!available) {
          reason = "このCPUはAVX-512に対応していません";
        }
      } catch (Throwable e) {
        reason = "可用性の判定に失敗しました: " + e;
      }
    }
    AVAILABLE = available;
    UNAVAILABLE_REASON = reason;
  }

  private BmHash16() {
  }

  /** {@link #sha512}と{@link #ripemd160}を呼べるか。 */
  public static boolean isAvailable() {
    return AVAILABLE;
  }

  /** 使えない理由。使える場合はnull。 */
  public static String unavailableReason() {
    return UNAVAILABLE_REASON;
  }

  /**
   * 130バイトのメッセージ16本から64バイトのダイジェスト16本を計算する。
   *
   * @param in  {@value #LANES} * {@value #SHA512_INPUT_LENGTH} バイト以上のネイティブメモリ
   * @param out {@value #LANES} * {@value #SHA512_DIGEST_LENGTH} バイト以上のネイティブメモリ
   */
  public static void sha512(MemorySegment in, MemorySegment out) {
    requireAvailable();
    bmhash16_h.sha512_16way(in, out);
  }

  /**
   * 全レーン共通の前半{@value #PUBLIC_KEY_LENGTH}バイトと、レーンごとに違う後半
   * {@value #PUBLIC_KEY_LENGTH}バイトからSHA-512を計算する。
   * <p>
   * 呼び出し側が{@value #SHA512_INPUT_LENGTH}バイト×{@value #LANES}を組み立て直さずに済む。
   * 署名用公開鍵を固定して暗号化用公開鍵だけを変える探索では、こちらを使うとコピーが
   * ほぼ無くなる。
   *
   * @param prefix   {@value #PUBLIC_KEY_LENGTH}バイト以上のネイティブメモリ。全レーン共通
   * @param suffixes {@value #PUBLIC_KEY_LENGTH} * {@value #LANES} バイト以上のネイティブメモリ
   * @param out      {@value #LANES} * {@value #SHA512_DIGEST_LENGTH} バイト以上のネイティブメモリ
   */
  public static void sha512Prefixed(MemorySegment prefix, MemorySegment suffixes,
      MemorySegment out) {
    requireAvailable();
    bmhash16_h.sha512_16way_prefixed(prefix, suffixes, out);
  }

  /**
   * 64バイトのメッセージ16本から20バイトのダイジェスト16本を計算する。
   *
   * @param in  {@value #LANES} * {@value #SHA512_DIGEST_LENGTH} バイト以上のネイティブメモリ
   * @param out {@value #LANES} * {@value #RIPEMD160_DIGEST_LENGTH} バイト以上のネイティブメモリ
   */
  public static void ripemd160(MemorySegment in, MemorySegment out) {
    requireAvailable();
    bmhash16_h.rmd160_16way(in, out);
  }

  private static void requireAvailable() {
    if (!AVAILABLE) {
      throw new IllegalStateException("16レーン実装は使えません: " + UNAVAILABLE_REASON);
    }
  }
}
