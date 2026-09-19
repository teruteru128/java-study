package com.github.teruteru128.foreign.openssl;

import static com.github.teruteru128.foreign.openssl.evp_h.EVP_DigestFinal_ex;
import static com.github.teruteru128.foreign.openssl.evp_h.EVP_DigestInit_ex;
import static com.github.teruteru128.foreign.openssl.evp_h.EVP_DigestUpdate;
import static com.github.teruteru128.foreign.openssl.evp_h.EVP_MD_CTX_free;
import static com.github.teruteru128.foreign.openssl.evp_h.EVP_MD_CTX_new;
import static com.github.teruteru128.foreign.openssl.evp_h.EVP_MD_fetch;
import static com.github.teruteru128.foreign.openssl.evp_h.EVP_MD_free;
import static com.github.teruteru128.foreign.openssl.evp_h.EVP_MD_get_size;
import static java.lang.foreign.MemorySegment.NULL;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.nio.charset.StandardCharsets;
import java.util.HexFormat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class EvpTest {

  private static final HexFormat HEX = HexFormat.of();

  /** 指定アルゴリズムでダイジェストを計算する。バインディングが実際に動くことの確認用。 */
  private static byte[] digest(String algorithm, byte[] input) {
    try (var arena = Arena.ofConfined()) {
      var md = EVP_MD_fetch(NULL, arena.allocateFrom(algorithm), NULL);
      assertNotEquals(NULL, md, algorithm + " が引けない。OpenSSLのプロバイダ構成を確認すること");
      try {
        var size = EVP_MD_get_size(md);
        assertTrue(size > 0, "ダイジェスト長が不正: " + size);
        var ctx = EVP_MD_CTX_new();
        assertNotEquals(NULL, ctx);
        try {
          var in = arena.allocateFrom(java.lang.foreign.ValueLayout.JAVA_BYTE, input);
          var out = arena.allocate(size);
          assertEquals(1, EVP_DigestInit_ex(ctx, md, NULL));
          assertEquals(1, EVP_DigestUpdate(ctx, in, input.length));
          assertEquals(1, EVP_DigestFinal_ex(ctx, out, NULL));
          return out.toArray(java.lang.foreign.ValueLayout.JAVA_BYTE);
        } finally {
          EVP_MD_CTX_free(ctx);
        }
      } finally {
        EVP_MD_free(md);
      }
    }
  }

  /**
   * RIPEMD-160の既知のテストベクタ。
   * このアルゴリズムはOpenSSL 3でlegacy providerへ移された環境があるため、
   * 引けること自体がこのテストの主眼でもある。
   */
  @ParameterizedTest
  @CsvSource({
      "'', 9c1185a5c5e9fc54612808977ee8f548b2258d31",
      "abc, 8eb208f7e05d987a9b044a8e98c6b087f15a0bfc",
      "message digest, 5d0689ef49d2fae572b881b123a85ffa21595f36",
      "abcdefghijklmnopqrstuvwxyz, f71c27109c692c1b56bbdceb5b9d2865b3708dbc",
  })
  void ripemd160KnownVectors(String input, String expected) {
    assertEquals(expected, HEX.formatHex(digest("RIPEMD160", input.getBytes(StandardCharsets.UTF_8))));
  }

  @ParameterizedTest
  @CsvSource({
      "abc, ddaf35a193617abacc417349ae20413112e6fa4e89a97ea20a9eeee64b55d39a2192992a274fc1a836ba3c23a3feebbd454d4423643ce80e2a9ac94fa54ca49f",
  })
  void sha512KnownVector(String input, String expected) {
    assertEquals(expected, HEX.formatHex(digest("SHA512", input.getBytes(StandardCharsets.UTF_8))));
  }

  /**
   * JDKのMessageDigestと同じ結果になること。差し替えても値が変わらないことの確認。
   */
  @Test
  void agreesWithJdkForSha512() throws Exception {
    var input = "The quick brown fox jumps over the lazy dog".getBytes(StandardCharsets.UTF_8);
    var jdk = java.security.MessageDigest.getInstance("SHA-512").digest(input);
    assertEquals(HEX.formatHex(jdk), HEX.formatHex(digest("SHA512", input)));
  }
}
