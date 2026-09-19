package com.github.teruteru128.study;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import java.util.HexFormat;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.math.ec.ECPoint;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * バッチ逆元で復元したアフィン座標が、素直に{@code normalize().getEncoded(false)}した場合と
 * 一致することを確かめる。{@link SequentialPublicKeys}はBouncyCastleの内部表現(Jacobian座標)に
 * 依存しているので、ここが崩れると偽アドレス生成が静かに壊れる。
 */
class SequentialPublicKeysTest {

  private static final ECPoint G = CustomNamedCurves.getByName("secp256k1").getG();

  private static ECPoint start(long k) {
    return G.multiply(BigInteger.valueOf(k)).normalize();
  }

  /**
   * バッチ境界をまたいでも正しいこと。バッチサイズを変えて、境界の前後がずれないか見る。
   */
  @ParameterizedTest
  @ValueSource(ints = {1, 2, 3, 7, 16, 256})
  void matchesNormalizeAcrossBatchBoundaries(int batchSize) {
    var expectedPoint = start(123456789L);
    var keys = new SequentialPublicKeys(start(123456789L), G, batchSize);
    // バッチ境界を必ず数回またぐ長さ
    var steps = batchSize * 3 + 5;
    for (var i = 0; i < steps; i++) {
      var expected = expectedPoint.normalize().getEncoded(false);
      var actual = keys.current();
      assertArrayEquals(expected, actual,
          () -> "batchSize=" + batchSize + " step=" + HexFormat.of().formatHex(expected));
      keys.advance();
      expectedPoint = expectedPoint.add(G);
    }
  }

  /**
   * {@link SequentialPublicKeys#index()}が起点からの通し番号になっていること。
   * バッチ補充のたびに余計に進むような実装だとここで落ちる。
   */
  @ParameterizedTest
  @ValueSource(ints = {1, 3, 16, 256})
  void indexCountsStepsFromStart(int batchSize) {
    var keys = new SequentialPublicKeys(start(1L), G, batchSize);
    for (var i = 0; i < batchSize * 3 + 5; i++) {
      assertEquals(i, keys.index(), "batchSize=" + batchSize);
      keys.current();
      assertEquals(i, keys.index(), "current()がindexを動かしている: batchSize=" + batchSize);
      keys.advance();
    }
  }

  /**
   * indexの位置の点が、起点にindex個だけGを足したものと一致すること。
   * つまりindexから秘密鍵を復元できる。
   */
  @Test
  void indexIdentifiesThePoint() {
    var startK = 987654321L;
    var keys = new SequentialPublicKeys(start(startK), G, 16);
    for (var i = 0; i < 50; i++) {
      var expected = G.multiply(BigInteger.valueOf(startK + keys.index())).normalize()
          .getEncoded(false);
      assertArrayEquals(expected, keys.current(), "index=" + keys.index());
      keys.advance();
    }
  }

  /**
   * current()を続けて呼んでも、advance()するまで同じ内容を返すこと。
   */
  @Test
  void currentIsStableUntilAdvance() {
    var keys = new SequentialPublicKeys(start(42L), G, 4);
    var first = keys.current().clone();
    assertArrayEquals(first, keys.current());
    assertArrayEquals(first, keys.current());
    keys.advance();
    assertEquals(1, keys.index());
  }
}
