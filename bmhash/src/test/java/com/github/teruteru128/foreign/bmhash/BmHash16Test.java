package com.github.teruteru128.foreign.bmhash;

import static java.lang.foreign.ValueLayout.JAVA_BYTE;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

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
 * 16レーンのAVX-512実装が、1件ずつのSHA-512/RIPEMD-160と同じ値を出すことを確かめる。
 * ネイティブライブラリが無い環境ではスキップする。
 */
class BmHash16Test {

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
    assumeTrue(BmHash16.isAvailable(),
        () -> "ネイティブ実装が使えないためスキップします: " + BmHash16.unavailableReason());
  }

  /**
   * SHA-512とRIPEMD-160を連結した、ripe計算そのものの経路を検証する。
   */
  @Test
  void chainMatchesSingleHashes() throws Exception {
    requireNative();
    var sha512 = MessageDigest.getInstance("SHA-512");
    var ripemd160 = MessageDigest.getInstance("RIPEMD160");
    var random = new Random(20260920L);
    var messages = new byte[BmHash16.LANES][BmHash16.SHA512_INPUT_LENGTH];
    try (var arena = Arena.ofConfined()) {
      var in = arena.allocate((long) BmHash16.LANES * BmHash16.SHA512_INPUT_LENGTH);
      var digests = arena.allocate((long) BmHash16.LANES * BmHash16.SHA512_DIGEST_LENGTH);
      var ripes = arena.allocate((long) BmHash16.LANES * BmHash16.RIPEMD160_DIGEST_LENGTH);
      for (var round = 0; round < 300; round++) {
        for (var lane = 0; lane < BmHash16.LANES; lane++) {
          random.nextBytes(messages[lane]);
          MemorySegment.copy(messages[lane], 0, in, JAVA_BYTE,
              (long) lane * BmHash16.SHA512_INPUT_LENGTH, BmHash16.SHA512_INPUT_LENGTH);
        }
        BmHash16.sha512(in, digests);
        BmHash16.ripemd160(digests, ripes);
        for (var lane = 0; lane < BmHash16.LANES; lane++) {
          var expectedDigest = sha512.digest(messages[lane]);
          var actualDigest = new byte[BmHash16.SHA512_DIGEST_LENGTH];
          MemorySegment.copy(digests, JAVA_BYTE,
              (long) lane * BmHash16.SHA512_DIGEST_LENGTH, actualDigest, 0,
              BmHash16.SHA512_DIGEST_LENGTH);
          var l = lane;
          var r = round;
          assertArrayEquals(expectedDigest, actualDigest,
              () -> "SHA-512 round=" + r + " lane=" + l + " in="
                  + HexFormat.of().formatHex(messages[l]));

          var expectedRipe = ripemd160.digest(expectedDigest);
          var actualRipe = new byte[BmHash16.RIPEMD160_DIGEST_LENGTH];
          MemorySegment.copy(ripes, JAVA_BYTE,
              (long) lane * BmHash16.RIPEMD160_DIGEST_LENGTH, actualRipe, 0,
              BmHash16.RIPEMD160_DIGEST_LENGTH);
          assertArrayEquals(expectedRipe, actualRipe, () -> "ripe round=" + r + " lane=" + l);
        }
      }
    }
  }

  /**
   * 既知のテストベクタ。全レーンに同じ入力を入れて、どのレーンも同じ答えを出すこと。
   * 値はopensslとpython hashlibの2経路で確認したもの。
   */
  @Test
  void allLanesAgreeOnKnownVector() {
    requireNative();
    var expected = HexFormat.of().parseHex("9b8ccc2f374ae313a914763cc9cdfb47bfe1c229");
    try (var arena = Arena.ofConfined()) {
      var in = arena.allocate((long) BmHash16.LANES * BmHash16.SHA512_DIGEST_LENGTH);
      var out = arena.allocate((long) BmHash16.LANES * BmHash16.RIPEMD160_DIGEST_LENGTH);
      BmHash16.ripemd160(in, out);
      for (var lane = 0; lane < BmHash16.LANES; lane++) {
        var actual = new byte[BmHash16.RIPEMD160_DIGEST_LENGTH];
        MemorySegment.copy(out, JAVA_BYTE, (long) lane * BmHash16.RIPEMD160_DIGEST_LENGTH,
            actual, 0, BmHash16.RIPEMD160_DIGEST_LENGTH);
        assertArrayEquals(expected, actual, "lane=" + lane);
      }
    }
  }

  /**
   * 一体版が、1件ずつのSHA-512→RIPEMD-160と同じ値を出すこと。
   * 署名用公開鍵を固定したまま暗号化用公開鍵を何度も替える、実際の探索と同じ使い方で確かめる。
   * 暗号化用公開鍵のセグメントはちょうど65バイト×16にして、末尾の鍵まで正しく読めることも見る。
   */
  @Test
  void ripeMatchesSingleHashes() throws Exception {
    assumeTrue(BmHash16.isRipeAvailable(), "一体版が使えないためスキップします");
    var sha512 = MessageDigest.getInstance("SHA-512");
    var ripemd160 = MessageDigest.getInstance("RIPEMD160");
    var random = new Random(20261103L);
    var signKey = new byte[BmHash16.PUBLIC_KEY_LENGTH];
    var encKeys = new byte[BmHash16.LANES * BmHash16.PUBLIC_KEY_LENGTH];
    try (var arena = Arena.ofConfined()) {
      var ctx = BmHash16.allocateSignContext(arena);
      var sign = arena.allocate(BmHash16.PUBLIC_KEY_LENGTH);
      var enc = arena.allocate(encKeys.length);
      var ripes = arena.allocate((long) BmHash16.LANES * BmHash16.RIPEMD160_DIGEST_LENGTH);
      for (var signRound = 0; signRound < 20; signRound++) {
        random.nextBytes(signKey);
        MemorySegment.copy(signKey, 0, sign, JAVA_BYTE, 0, signKey.length);
        BmHash16.setSignKey(ctx, sign);
        for (var round = 0; round < 20; round++) {
          random.nextBytes(encKeys);
          MemorySegment.copy(encKeys, 0, enc, JAVA_BYTE, 0, encKeys.length);
          BmHash16.ripe(ctx, enc, ripes);
          for (var lane = 0; lane < BmHash16.LANES; lane++) {
            sha512.update(signKey);
            sha512.update(encKeys, lane * BmHash16.PUBLIC_KEY_LENGTH, BmHash16.PUBLIC_KEY_LENGTH);
            var expected = ripemd160.digest(sha512.digest());
            var actual = new byte[BmHash16.RIPEMD160_DIGEST_LENGTH];
            MemorySegment.copy(ripes, JAVA_BYTE, (long) lane * BmHash16.RIPEMD160_DIGEST_LENGTH,
                actual, 0, actual.length);
            var l = lane;
            var s = signRound;
            var r = round;
            assertArrayEquals(expected, actual,
                () -> "sign=" + s + " round=" + r + " lane=" + l);
          }
        }
      }
    }
  }

  /** ネイティブ側は範囲を確かめないので、短いセグメントはJava側で弾くこと */
  @Test
  void ripeRejectsShortSegments() {
    assumeTrue(BmHash16.isRipeAvailable(), "一体版が使えないためスキップします");
    try (var arena = Arena.ofConfined()) {
      var ctx = BmHash16.allocateSignContext(arena);
      var out = arena.allocate((long) BmHash16.LANES * BmHash16.RIPEMD160_DIGEST_LENGTH);
      var shortEnc = arena.allocate((long) BmHash16.LANES * BmHash16.PUBLIC_KEY_LENGTH - 1);
      assertThrows(IllegalArgumentException.class, () -> BmHash16.ripe(ctx, shortEnc, out));
      var shortSign = arena.allocate(BmHash16.PUBLIC_KEY_LENGTH - 1);
      assertThrows(IllegalArgumentException.class, () -> BmHash16.setSignKey(ctx, shortSign));
    }
  }

  @Test
  void availabilityIsConsistent() {
    if (BmHash16.isRipeAvailable()) {
      assertTrue(BmHash16.isAvailable());
    }
    if (BmHash16.isAvailable()) {
      assertNull(BmHash16.unavailableReason());
    }
  }
}
