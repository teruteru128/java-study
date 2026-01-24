package com.github.teruteru128.study;

import java.util.random.RandomGenerator;

public class MyRandom {

  /**
   * FIXME 乱数系ユーティリティクラス的な？ものに移動する
   *
   * @param random 乱数生成源
   * @return double
   * @see <a href="https://speakerdeck.com/hole/rand01">[0.0, 1.0) の乱数を得るための“本当の”方法 </a>
   */
  public static double nextDouble(RandomGenerator random) {
    // random Double
    var bits = random.nextLong();
    long exp = -Long.numberOfTrailingZeros(~(bits >>> 52));
    if (exp == -12) {
      long expBits;
      do {
        expBits = random.nextLong();
        exp -= Long.numberOfTrailingZeros(~expBits);
        // doubleの最小指数(バイアス込みで0)を下回らないようにする
        if (exp < -1022) {
          exp = -1022;
          break;
        }
      } while (expBits == -1);
    }
    var mantissa = bits & 0xfffffffffffffL;
    // mantissa == 0 && exp == 0 の場合結果が 1.0 になってしまうのを避ける
    if (mantissa == 0 && exp < 0 && random.nextBoolean()) {
      exp++;
    }
    return Double.longBitsToDouble(((exp + 1022) << 52) | mantissa);
  }

}
