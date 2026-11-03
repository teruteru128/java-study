package com.github.teruteru128.foreign.bmhash;

import java.lang.foreign.Arena;
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
 *   <li>{@link #ripe(MemorySegment, MemorySegment, MemorySegment)} 上の2段を一体で計算する。
 *       署名用公開鍵を固定する探索向けで、約1.4倍速い</li>
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
  private static final boolean RIPE_AVAILABLE;

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
    // 一体版はAVX-512BWも要る。古いライブラリには関数自体が無いので、その場合も使わない
    var ripeAvailable = false;
    if (available) {
      try {
        ripeAvailable = bmhash16_h.ripe16_available() != 0;
      } catch (Throwable e) {
        ripeAvailable = false;
      }
    }
    RIPE_AVAILABLE = ripeAvailable;
  }

  private BmHash16() {
  }

  /** {@link #sha512}と{@link #ripemd160}を呼べるか。 */
  public static boolean isAvailable() {
    return AVAILABLE;
  }

  /**
   * {@link #ripe}と{@link #setSignKey}を呼べるか。{@link #isAvailable()}がtrueでも、
   * AVX-512BWの無いCPUや古いライブラリではfalseになる。そのときは
   * {@link #sha512Prefixed}と{@link #ripemd160}を使うこと。
   */
  public static boolean isRipeAvailable() {
    return RIPE_AVAILABLE;
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

  /**
   * {@link #setSignKey}と{@link #ripe}が使う、署名用公開鍵ごとの事前計算の置き場を確保する。
   * 中身は実装の都合で変わるので、直接読み書きしないこと。
   */
  public static MemorySegment allocateSignContext(Arena arena) {
    return arena.allocate(ripe16_sign_ctx.layout());
  }

  /**
   * 署名用公開鍵を設定する。同じ鍵を使い続ける間は1回呼べばよい。
   *
   * @param ctx     {@link #allocateSignContext}で確保したもの
   * @param signKey {@value #PUBLIC_KEY_LENGTH}バイト以上のネイティブメモリ
   */
  public static void setSignKey(MemorySegment ctx, MemorySegment signKey) {
    requireRipeAvailable();
    checkSize(ctx, ripe16_sign_ctx.sizeof());
    checkSize(signKey, PUBLIC_KEY_LENGTH);
    bmhash16_h.ripe16_set_sign_key(ctx, signKey);
  }

  /**
   * {@code RIPEMD160(SHA512(署名用公開鍵 || 暗号化用公開鍵))}を16本まとめて計算する。
   * {@link #sha512Prefixed}と{@link #ripemd160}を続けて呼ぶのと同じ値を返す。
   *
   * @param ctx     {@link #setSignKey}で署名用公開鍵を設定したもの
   * @param encKeys {@value #PUBLIC_KEY_LENGTH} * {@value #LANES} バイト以上のネイティブメモリ。
   *                この範囲の外は読まない
   * @param out     {@value #LANES} * {@value #RIPEMD160_DIGEST_LENGTH} バイト以上のネイティブメモリ
   */
  public static void ripe(MemorySegment ctx, MemorySegment encKeys, MemorySegment out) {
    requireRipeAvailable();
    // ネイティブ側は範囲を確かめないので、短いセグメントを渡すと範囲外を読み書きする
    checkSize(ctx, ripe16_sign_ctx.sizeof());
    checkSize(encKeys, (long) PUBLIC_KEY_LENGTH * LANES);
    checkSize(out, (long) RIPEMD160_DIGEST_LENGTH * LANES);
    bmhash16_h.ripe16(ctx, encKeys, out);
  }

  private static void checkSize(MemorySegment segment, long required) {
    if (segment.byteSize() < required) {
      throw new IllegalArgumentException(
          "セグメントが短すぎます: " + segment.byteSize() + " < " + required);
    }
  }

  private static void requireRipeAvailable() {
    if (!RIPE_AVAILABLE) {
      throw new IllegalStateException("一体版(ripe16)は使えません");
    }
  }

  private static void requireAvailable() {
    if (!AVAILABLE) {
      throw new IllegalStateException("16レーン実装は使えません: " + UNAVAILABLE_REASON);
    }
  }
}
