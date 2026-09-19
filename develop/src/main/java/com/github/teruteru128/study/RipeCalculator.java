package com.github.teruteru128.study;

import static com.github.teruteru128.bitmessage.Const.PUBLIC_KEY_LENGTH;
import static com.github.teruteru128.bitmessage.Const.RIPEMD160_DIGEST_LENGTH;
import static com.github.teruteru128.bitmessage.Const.SHA512_DIGEST_LENGTH;
import static com.github.teruteru128.foreign.openssl.evp_h.EVP_DigestFinal_ex;
import static com.github.teruteru128.foreign.openssl.evp_h.EVP_DigestInit_ex;
import static com.github.teruteru128.foreign.openssl.evp_h.EVP_DigestUpdate;
import static com.github.teruteru128.foreign.openssl.evp_h.EVP_MD_CTX_free;
import static com.github.teruteru128.foreign.openssl.evp_h.EVP_MD_CTX_new;
import static com.github.teruteru128.foreign.openssl.evp_h.EVP_MD_fetch;
import static com.github.teruteru128.foreign.openssl.evp_h.EVP_MD_free;
import static java.lang.foreign.MemorySegment.NULL;
import static java.lang.foreign.ValueLayout.JAVA_BYTE;

import com.github.teruteru128.foreign.bmhash.BmHash16;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

/**
 * bitmessageのripe({@code RIPEMD160(SHA512(署名用公開鍵 || 暗号化用公開鍵))})をOpenSSLで計算する。
 * <p>
 * BouncyCastleの純JavaのRIPEMD-160より約3.9倍速く、この2段のダイジェスト全体では約2.3倍になる。
 * SHA-512単体はJDK(SUNプロバイダ)とOpenSSLが互角だが、Java側に残すと中間の64バイトをヒープと
 * ネイティブの間で往復させることになるため、まとめてOpenSSLに渡している。
 * <p>
 * <strong>スレッドセーフではない。</strong>1スレッドにつき1インスタンスを用意すること。
 * ネイティブ資源を抱えるので、使い終わったら必ず{@link #close()}すること。
 */
public final class RipeCalculator implements AutoCloseable {

  private final Arena arena = Arena.ofConfined();
  private final MemorySegment sha512md;
  private final MemorySegment ripemd160md;
  private final MemorySegment ctx;
  /** 署名用公開鍵と暗号化用公開鍵を連結して置くバッファ */
  private final MemorySegment input;
  private final MemorySegment digest;
  /** バッチ用。16件ぶんの暗号化用公開鍵(65バイト×16)。ヒープから渡された場合の受け皿 */
  private final MemorySegment suffixes16;
  /** バッチ用。16件ぶんのSHA-512の出力 */
  private final MemorySegment digests16;
  /** バッチ用。16件ぶんのripe */
  private final MemorySegment ripes16;

  public RipeCalculator() {
    try {
      sha512md = EVP_MD_fetch(NULL, arena.allocateFrom("SHA512"), NULL);
      ripemd160md = EVP_MD_fetch(NULL, arena.allocateFrom("RIPEMD160"), NULL);
      if (sha512md.equals(NULL) || ripemd160md.equals(NULL)) {
        throw new IllegalStateException(
            "OpenSSLからダイジェストを取得できませんでした。RIPEMD160がlegacyプロバイダに"
            + "移されている環境かもしれません: openssl list -digest-algorithms で確認してください");
      }
      ctx = EVP_MD_CTX_new();
      if (ctx.equals(NULL)) {
        throw new IllegalStateException("EVP_MD_CTX_newに失敗しました");
      }
      input = arena.allocate(PUBLIC_KEY_LENGTH * 2L);
      digest = arena.allocate(SHA512_DIGEST_LENGTH);
      suffixes16 = arena.allocate((long) BmHash16.LANES * PUBLIC_KEY_LENGTH);
      digests16 = arena.allocate((long) BmHash16.LANES * BmHash16.SHA512_DIGEST_LENGTH);
      ripes16 = arena.allocate((long) BmHash16.LANES * BmHash16.RIPEMD160_DIGEST_LENGTH);
    } catch (RuntimeException e) {
      arena.close();
      throw e;
    }
  }

  /**
   * 署名用公開鍵を設定する。同じ鍵を使い続ける間は1回呼べばよい。
   *
   * @param key    署名用公開鍵を含む配列
   * @param offset 鍵の開始位置
   */
  public void setSignKey(byte[] key, int offset) {
    MemorySegment.copy(key, offset, input, JAVA_BYTE, 0, PUBLIC_KEY_LENGTH);
  }

  /**
   * 暗号化用公開鍵を与えてripeを計算する。
   *
   * @param key    暗号化用公開鍵を含む配列
   * @param offset 鍵の開始位置
   * @param ripe   結果の書き込み先。先頭{@value com.github.teruteru128.bitmessage.Const#RIPEMD160_DIGEST_LENGTH}バイトを上書きする
   */
  public void calcRipe(byte[] key, int offset, byte[] ripe) {
    calcRipeInto(key, offset);
    MemorySegment.copy(digest, JAVA_BYTE, 0, ripe, 0, RIPEMD160_DIGEST_LENGTH);
  }

  /**
   * 暗号化用公開鍵を与えてripeを計算し、ネイティブ側の{@code digest}に置いたままにする。
   */
  private void calcRipeInto(byte[] key, int offset) {
    MemorySegment.copy(key, offset, input, JAVA_BYTE, PUBLIC_KEY_LENGTH, PUBLIC_KEY_LENGTH);
    // 全部1を返したときだけ成功。失敗を見逃すと出力バッファが更新されず、
    // 前回のripeや零値をそのまま判定してしまう
    var rc = EVP_DigestInit_ex(ctx, sha512md, NULL);
    rc &= EVP_DigestUpdate(ctx, input, PUBLIC_KEY_LENGTH * 2L);
    rc &= EVP_DigestFinal_ex(ctx, digest, NULL);
    rc &= EVP_DigestInit_ex(ctx, ripemd160md, NULL);
    rc &= EVP_DigestUpdate(ctx, digest, SHA512_DIGEST_LENGTH);
    rc &= EVP_DigestFinal_ex(ctx, digest, NULL);
    if (rc != 1) {
      throw new IllegalStateException("OpenSSLのダイジェスト計算に失敗しました");
    }
  }

  /**
   * まとめて{@value com.github.teruteru128.foreign.bmhash.BmHash16#LANES}件のripeを計算できるか。
   * falseなら{@link #calcRipeBatch}は1件ずつの経路へ自動的に落ちるので、呼び分けは不要。
   */
  public static boolean isBatchAccelerated() {
    return BmHash16.isAvailable();
  }

  /**
   * 連続して並んだ暗号化用公開鍵{@value com.github.teruteru128.foreign.bmhash.BmHash16#LANES}件から
   * ripeをまとめて計算する。署名用公開鍵は{@link #setSignKey}で設定したものを使う。
   * <p>
   * RIPEMD-160をAVX-512で16レーン同時に回すので、1件ずつ計算するより速い。SHA-512は
   * レーンごとに逐次計算する(単体ではJDKやOpenSSLの実装が既に十分速いため)。
   * AVX-512が無い環境では自動的に1件ずつの経路へ落ちる。
   *
   * @param keys   暗号化用公開鍵が{@value com.github.teruteru128.bitmessage.Const#PUBLIC_KEY_LENGTH}
   *               バイト刻みで連続して並んだ配列
   * @param offset 先頭の鍵の開始位置
   * @param ripes  結果の書き込み先。{@value com.github.teruteru128.foreign.bmhash.BmHash16#LANES} *
   *               {@value com.github.teruteru128.foreign.bmhash.BmHash16#RIPEMD160_DIGEST_LENGTH}バイト必要
   */
  public void calcRipeBatch(byte[] keys, int offset, byte[] ripes) {
    if (!BmHash16.isAvailable()) {
      fallbackBatch(keys, offset, ripes);
      return;
    }
    // 暗号化用公開鍵は元から連続して並んでいるので、まとめて1回で写せる
    MemorySegment.copy(keys, offset, suffixes16, JAVA_BYTE, 0,
        BmHash16.LANES * PUBLIC_KEY_LENGTH);
    hashBatch(suffixes16, ripes);
  }

  /**
   * {@link #calcRipeBatch(byte[], int, byte[])}の、鍵が既にネイティブメモリにある版。
   * <p>
   * 公開鍵ファイルをmmapしている場合はこちらを使うと入力側のコピーが完全に無くなる。
   *
   * @param keys   暗号化用公開鍵が{@value com.github.teruteru128.bitmessage.Const#PUBLIC_KEY_LENGTH}
   *               バイト刻みで連続して並んだネイティブメモリ
   * @param offset 先頭の鍵の開始位置
   * @param ripes  結果の書き込み先
   */
  public void calcRipeBatch(MemorySegment keys, long offset, byte[] ripes) {
    if (!BmHash16.isAvailable()) {
      // フォールバック経路はヒープ前提なので、いったん写してから回す
      var tmp = new byte[BmHash16.LANES * PUBLIC_KEY_LENGTH];
      MemorySegment.copy(keys, JAVA_BYTE, offset, tmp, 0, tmp.length);
      fallbackBatch(tmp, 0, ripes);
      return;
    }
    hashBatch(keys.asSlice(offset, (long) BmHash16.LANES * PUBLIC_KEY_LENGTH), ripes);
  }

  /** 署名鍵は{@link #setSignKey}で置いたものを使い、16件ぶんのripeを求める */
  private void hashBatch(MemorySegment suffixes, byte[] ripes) {
    BmHash16.sha512Prefixed(input, suffixes, digests16);
    BmHash16.ripemd160(digests16, ripes16);
    MemorySegment.copy(ripes16, JAVA_BYTE, 0, ripes, 0,
        BmHash16.LANES * BmHash16.RIPEMD160_DIGEST_LENGTH);
  }

  private void fallbackBatch(byte[] keys, int offset, byte[] ripes) {
    for (var lane = 0; lane < BmHash16.LANES; lane++) {
      calcRipe(keys, offset + lane * PUBLIC_KEY_LENGTH, ripes,
          lane * BmHash16.RIPEMD160_DIGEST_LENGTH);
    }
  }

  /**
   * {@link #calcRipe(byte[], int, byte[])}の書き込み位置を指定できる版。
   */
  public void calcRipe(byte[] key, int offset, byte[] ripe, int ripeOffset) {
    calcRipeInto(key, offset);
    MemorySegment.copy(digest, JAVA_BYTE, 0, ripe, ripeOffset, RIPEMD160_DIGEST_LENGTH);
  }

  @Override
  public void close() {
    EVP_MD_CTX_free(ctx);
    EVP_MD_free(ripemd160md);
    EVP_MD_free(sha512md);
    arena.close();
  }
}
