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
    MemorySegment.copy(digest, JAVA_BYTE, 0, ripe, 0, RIPEMD160_DIGEST_LENGTH);
  }

  @Override
  public void close() {
    EVP_MD_CTX_free(ctx);
    EVP_MD_free(ripemd160md);
    EVP_MD_free(sha512md);
    arena.close();
  }
}
