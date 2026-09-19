package com.github.teruteru128.foreign.openssl;

import static com.github.teruteru128.foreign.openssl.evp_h.EVP_DigestFinal_ex;
import static com.github.teruteru128.foreign.openssl.evp_h.EVP_DigestInit_ex;
import static com.github.teruteru128.foreign.openssl.evp_h.EVP_DigestUpdate;
import static com.github.teruteru128.foreign.openssl.evp_h.EVP_MD_CTX_free;
import static com.github.teruteru128.foreign.openssl.evp_h.EVP_MD_CTX_new;
import static com.github.teruteru128.foreign.openssl.evp_h.EVP_MD_fetch;
import static com.github.teruteru128.foreign.openssl.evp_h.EVP_MD_free;
import static java.lang.foreign.MemorySegment.NULL;
import static java.lang.foreign.ValueLayout.JAVA_BYTE;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.lang.foreign.Arena;
import java.security.MessageDigest;
import java.security.Security;
import java.util.HexFormat;
import java.util.Random;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * bitmessageのripe計算({@code RIPEMD160(SHA512(署名用公開鍵 || 暗号化用公開鍵))})を
 * OpenSSL経由で行った結果が、JDKとBouncyCastleで計算した場合と一致することを確かめる。
 * <p>
 * {@code AddressCalc}の内側ループがこの等価性に依存している。ここが崩れると、探索が
 * 何も見つけられなくなるか、あるいは誤ったアドレスを報告する。
 */
class CalcRipeTest {

  private static final int PUBLIC_KEY_LENGTH = 65;

  @BeforeAll
  static void addBouncyCastle() {
    if (Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) == null) {
      Security.addProvider(new BouncyCastleProvider());
    }
  }

  @AfterAll
  static void removeBouncyCastle() {
    Security.removeProvider(BouncyCastleProvider.PROVIDER_NAME);
  }

  /** JDKのSHA-512 + BouncyCastleのRIPEMD-160。差し替え前の経路。 */
  private static byte[] ripeByJava(byte[] signKey, byte[] encKey) throws Exception {
    var sha512 = MessageDigest.getInstance("SHA-512");
    var ripemd160 = MessageDigest.getInstance("RIPEMD160");
    sha512.update(signKey, 0, PUBLIC_KEY_LENGTH);
    sha512.update(encKey, 0, PUBLIC_KEY_LENGTH);
    var hash = new byte[64];
    sha512.digest(hash, 0, 64);
    ripemd160.update(hash, 0, 64);
    var ripe = new byte[20];
    ripemd160.digest(ripe, 0, 20);
    return ripe;
  }

  /** OpenSSL経由。差し替え後の経路(AddressCalcと同じ手順)。 */
  private static byte[] ripeByOpenSsl(byte[] signKey, byte[] encKey) {
    try (var arena = Arena.ofConfined()) {
      var sha512md = EVP_MD_fetch(NULL, arena.allocateFrom("SHA512"), NULL);
      var ripemd160md = EVP_MD_fetch(NULL, arena.allocateFrom("RIPEMD160"), NULL);
      assertNotEquals(NULL, sha512md);
      assertNotEquals(NULL, ripemd160md);
      var ctx = EVP_MD_CTX_new();
      assertNotEquals(NULL, ctx);
      try {
        var input = arena.allocate(PUBLIC_KEY_LENGTH * 2L);
        var digest = arena.allocate(64);
        java.lang.foreign.MemorySegment.copy(signKey, 0, input, JAVA_BYTE, 0, PUBLIC_KEY_LENGTH);
        java.lang.foreign.MemorySegment.copy(encKey, 0, input, JAVA_BYTE, PUBLIC_KEY_LENGTH,
            PUBLIC_KEY_LENGTH);
        var rc = EVP_DigestInit_ex(ctx, sha512md, NULL);
        rc &= EVP_DigestUpdate(ctx, input, PUBLIC_KEY_LENGTH * 2L);
        rc &= EVP_DigestFinal_ex(ctx, digest, NULL);
        rc &= EVP_DigestInit_ex(ctx, ripemd160md, NULL);
        rc &= EVP_DigestUpdate(ctx, digest, 64);
        rc &= EVP_DigestFinal_ex(ctx, digest, NULL);
        assertEquals(1, rc, "OpenSSLのダイジェスト計算に失敗した");
        var ripe = new byte[20];
        java.lang.foreign.MemorySegment.copy(digest, JAVA_BYTE, 0, ripe, 0, 20);
        return ripe;
      } finally {
        EVP_MD_CTX_free(ctx);
        EVP_MD_free(ripemd160md);
        EVP_MD_free(sha512md);
      }
    }
  }

  @Test
  void openSslAgreesWithJavaOnRandomKeys() throws Exception {
    var random = new Random(20260919L);
    var signKey = new byte[PUBLIC_KEY_LENGTH];
    var encKey = new byte[PUBLIC_KEY_LENGTH];
    for (var i = 0; i < 2000; i++) {
      random.nextBytes(signKey);
      random.nextBytes(encKey);
      signKey[0] = 4;   // 非圧縮公開鍵の先頭バイト
      encKey[0] = 4;
      assertArrayEquals(ripeByJava(signKey, encKey), ripeByOpenSsl(signKey, encKey),
          () -> "sign=" + HexFormat.of().formatHex(signKey) + " enc="
              + HexFormat.of().formatHex(encKey));
    }
  }

  /**
   * 同じcontextを使い回しても結果が変わらないこと。AddressCalcは1つのEVP_MD_CTXを
   * ループ中ずっと使い回すので、状態の持ち越しがあるとここで落ちる。
   */
  @Test
  void reusedContextGivesSameResult() throws Exception {
    var random = new Random(42L);
    var signKey = new byte[PUBLIC_KEY_LENGTH];
    var encKey = new byte[PUBLIC_KEY_LENGTH];
    random.nextBytes(signKey);
    random.nextBytes(encKey);
    var expected = ripeByJava(signKey, encKey);

    try (var arena = Arena.ofConfined()) {
      var sha512md = EVP_MD_fetch(NULL, arena.allocateFrom("SHA512"), NULL);
      var ripemd160md = EVP_MD_fetch(NULL, arena.allocateFrom("RIPEMD160"), NULL);
      var ctx = EVP_MD_CTX_new();
      try {
        var input = arena.allocate(PUBLIC_KEY_LENGTH * 2L);
        var digest = arena.allocate(64);
        java.lang.foreign.MemorySegment.copy(signKey, 0, input, JAVA_BYTE, 0, PUBLIC_KEY_LENGTH);
        java.lang.foreign.MemorySegment.copy(encKey, 0, input, JAVA_BYTE, PUBLIC_KEY_LENGTH,
            PUBLIC_KEY_LENGTH);
        for (var i = 0; i < 1000; i++) {
          var rc = EVP_DigestInit_ex(ctx, sha512md, NULL);
          rc &= EVP_DigestUpdate(ctx, input, PUBLIC_KEY_LENGTH * 2L);
          rc &= EVP_DigestFinal_ex(ctx, digest, NULL);
          rc &= EVP_DigestInit_ex(ctx, ripemd160md, NULL);
          rc &= EVP_DigestUpdate(ctx, digest, 64);
          rc &= EVP_DigestFinal_ex(ctx, digest, NULL);
          assertEquals(1, rc);
          var ripe = new byte[20];
          java.lang.foreign.MemorySegment.copy(digest, JAVA_BYTE, 0, ripe, 0, 20);
          var round = i;
          assertArrayEquals(expected, ripe, () -> "使い回し" + round + "回目で結果が変わった");
        }
      } finally {
        EVP_MD_CTX_free(ctx);
        EVP_MD_free(ripemd160md);
        EVP_MD_free(sha512md);
      }
    }
  }
}
