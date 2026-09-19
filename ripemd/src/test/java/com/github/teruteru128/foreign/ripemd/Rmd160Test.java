package com.github.teruteru128.foreign.ripemd;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static java.lang.foreign.ValueLayout.JAVA_BYTE;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.security.MessageDigest;
import java.security.Security;
import java.util.HexFormat;
import java.util.Random;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * 16レーンのAVX-512実装が、1件ずつのRIPEMD-160と同じ値を出すことを確かめる。
 * <p>
 * ネイティブライブラリが見つからない環境ではテストごとスキップする。場所の指定方法は
 * {@link Rmd160}のjavadocを参照。
 */
class Rmd160Test {

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

  private static void requireNative() {
    assumeTrue(Rmd160.isAvailable(),
        () -> "ネイティブ実装が使えないためスキップします: " + Rmd160.unavailableReason());
  }

  @Test
  void matchesSingleHashOnRandomInput() throws Exception {
    requireNative();
    var ripemd160 = MessageDigest.getInstance("RIPEMD160");
    var random = new Random(20260920L);
    var messages = new byte[Rmd160.LANES][Rmd160.MESSAGE_LENGTH];
    try (var arena = Arena.ofConfined()) {
      var in = arena.allocate((long) Rmd160.LANES * Rmd160.MESSAGE_LENGTH);
      var out = arena.allocate((long) Rmd160.LANES * Rmd160.DIGEST_LENGTH);
      for (var round = 0; round < 500; round++) {
        for (var lane = 0; lane < Rmd160.LANES; lane++) {
          random.nextBytes(messages[lane]);
          MemorySegment.copy(messages[lane], 0, in, JAVA_BYTE,
              (long) lane * Rmd160.MESSAGE_LENGTH, Rmd160.MESSAGE_LENGTH);
        }
        Rmd160.hash16(in, out);
        for (var lane = 0; lane < Rmd160.LANES; lane++) {
          var expected = ripemd160.digest(messages[lane]);
          var actual = new byte[Rmd160.DIGEST_LENGTH];
          MemorySegment.copy(out, JAVA_BYTE, (long) lane * Rmd160.DIGEST_LENGTH, actual, 0,
              Rmd160.DIGEST_LENGTH);
          var r = round;
          var l = lane;
          assertArrayEquals(expected, actual,
              () -> "round=" + r + " lane=" + l + " in="
                  + HexFormat.of().formatHex(messages[l]));
        }
      }
    }
  }

  /**
   * 既知のテストベクタ。全レーンに同じ入力を入れて、どのレーンも同じ答えを出すこと。
   */
  @Test
  void allLanesAgreeOnKnownVector() {
    requireNative();
    // RIPEMD160(64バイトのゼロ)。opensslとpython hashlibの2経路で確認した値
    var expected = HexFormat.of().parseHex("9b8ccc2f374ae313a914763cc9cdfb47bfe1c229");
    try (var arena = Arena.ofConfined()) {
      var in = arena.allocate((long) Rmd160.LANES * Rmd160.MESSAGE_LENGTH);
      var out = arena.allocate((long) Rmd160.LANES * Rmd160.DIGEST_LENGTH);
      Rmd160.hash16(in, out);
      for (var lane = 0; lane < Rmd160.LANES; lane++) {
        var actual = new byte[Rmd160.DIGEST_LENGTH];
        MemorySegment.copy(out, JAVA_BYTE, (long) lane * Rmd160.DIGEST_LENGTH, actual, 0,
            Rmd160.DIGEST_LENGTH);
        assertArrayEquals(expected, actual, "lane=" + lane);
      }
    }
  }

  @Test
  void reportsReasonWhenUnavailable() {
    if (Rmd160.isAvailable()) {
      assertEquals(null, Rmd160.unavailableReason());
    } else {
      assertThrows(IllegalStateException.class,
          () -> Rmd160.hash16(MemorySegment.NULL, MemorySegment.NULL));
    }
  }
}
