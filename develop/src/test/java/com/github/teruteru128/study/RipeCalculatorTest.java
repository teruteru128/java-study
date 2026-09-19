package com.github.teruteru128.study;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.github.teruteru128.bitmessage.Const;
import com.github.teruteru128.foreign.bmhash.BmHash16;
import java.security.MessageDigest;
import java.security.Security;
import java.util.Arrays;
import java.util.HexFormat;
import java.util.Random;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * {@link RipeCalculator}が、JDKのSHA-512とBouncyCastleのRIPEMD-160で計算した場合と
 * 同じripeを出すことを確かめる。
 * <p>
 * 1件ずつの経路と16件バッチの経路の両方を見る。バッチはAVX-512の有無で内部実装が
 * 変わるが、どちらでも同じ答えにならなければならない。
 */
class RipeCalculatorTest {

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

  /** 素直にJDK+BouncyCastleで計算した正解 */
  private static byte[] reference(byte[] signKey, byte[] encKeys, int offset) throws Exception {
    var sha512 = MessageDigest.getInstance("SHA-512");
    var ripemd160 = MessageDigest.getInstance("RIPEMD160");
    sha512.update(signKey, 0, Const.PUBLIC_KEY_LENGTH);
    sha512.update(encKeys, offset, Const.PUBLIC_KEY_LENGTH);
    return ripemd160.digest(sha512.digest());
  }

  @Test
  void singleMatchesReference() throws Exception {
    var random = new Random(20260920L);
    var signKey = new byte[Const.PUBLIC_KEY_LENGTH];
    var encKeys = new byte[Const.PUBLIC_KEY_LENGTH * 64];
    random.nextBytes(signKey);
    random.nextBytes(encKeys);
    var ripe = new byte[Const.RIPEMD160_DIGEST_LENGTH];
    try (var calculator = new RipeCalculator()) {
      calculator.setSignKey(signKey, 0);
      for (var i = 0; i < 64; i++) {
        var offset = i * Const.PUBLIC_KEY_LENGTH;
        calculator.calcRipe(encKeys, offset, ripe);
        assertArrayEquals(reference(signKey, encKeys, offset), ripe, "i=" + i);
      }
    }
  }

  /**
   * 16件バッチが1件ずつと同じ結果になること。AVX-512が有効な環境ではここが
   * ネイティブの16レーン実装を通る。
   */
  @Test
  void batchMatchesReference() throws Exception {
    System.out.println("16レーン実装: " + (RipeCalculator.isBatchAccelerated() ? "有効"
        : "無効(" + BmHash16.unavailableReason() + ")"));
    var random = new Random(~20260920L);
    var signKey = new byte[Const.PUBLIC_KEY_LENGTH];
    var encKeys = new byte[Const.PUBLIC_KEY_LENGTH * BmHash16.LANES * 8];
    var ripes = new byte[BmHash16.LANES * Const.RIPEMD160_DIGEST_LENGTH];
    try (var calculator = new RipeCalculator()) {
      for (var round = 0; round < 50; round++) {
        random.nextBytes(signKey);
        random.nextBytes(encKeys);
        calculator.setSignKey(signKey, 0);
        for (var batch = 0; batch < 8; batch++) {
          var base = batch * BmHash16.LANES * Const.PUBLIC_KEY_LENGTH;
          calculator.calcRipeBatch(encKeys, base, ripes);
          for (var lane = 0; lane < BmHash16.LANES; lane++) {
            var expected = reference(signKey, encKeys, base + lane * Const.PUBLIC_KEY_LENGTH);
            var actual = Arrays.copyOfRange(ripes, lane * Const.RIPEMD160_DIGEST_LENGTH,
                (lane + 1) * Const.RIPEMD160_DIGEST_LENGTH);
            var r = round;
            var l = lane;
            assertArrayEquals(expected, actual,
                () -> "round=" + r + " lane=" + l + " expected="
                    + HexFormat.of().formatHex(expected));
          }
        }
      }
    }
  }
}
