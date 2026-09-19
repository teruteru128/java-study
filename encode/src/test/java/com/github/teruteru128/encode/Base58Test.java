package com.github.teruteru128.encode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HexFormat;
import java.util.Random;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class Base58Test {

  private static final String ALPHABET = "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz";
  private static final BigInteger FIFTY_EIGHT = BigInteger.valueOf(58);

  /**
   * {@link BigInteger}による独立した参照実装。{@link Base58#encode(byte[])}の高速化が
   * 挙動を変えていないことを確かめるためのオラクルなので、実装を共有してはならない。
   */
  private static String reference(byte[] input) {
    var zeroCount = 0;
    while (zeroCount < input.length && input[zeroCount] == 0) {
      zeroCount++;
    }
    var value = new BigInteger(1, input);
    var digits = new StringBuilder();
    while (value.signum() > 0) {
      var quotientAndRemainder = value.divideAndRemainder(FIFTY_EIGHT);
      digits.append(ALPHABET.charAt(quotientAndRemainder[1].intValue()));
      value = quotientAndRemainder[0];
    }
    return String.valueOf(ALPHABET.charAt(0)).repeat(zeroCount) + digits.reverse();
  }

  @Test
  void matchesReferenceForSpecificShapes() {
    assertEquals(reference(new byte[0]), Base58.encode(new byte[0]));
    for (var length = 1; length <= 40; length++) {
      for (var zeros = 0; zeros <= length; zeros++) {
        var input = new byte[length];
        Arrays.fill(input, zeros, length, (byte) 0xff);
        assertEquals(reference(input), Base58.encode(input),
            "length=" + length + " zeros=" + zeros + " " + HexFormat.of().formatHex(input));
      }
    }
  }

  @ParameterizedTest
  @ValueSource(ints = {1, 2, 3, 4, 5, 7, 8, 9, 16, 20, 24, 25, 32, 33, 64, 65})
  void matchesReferenceForRandomInput(int length) {
    var random = new Random(length * 31L);
    var input = new byte[length];
    for (var i = 0; i < 2000; i++) {
      random.nextBytes(input);
      // 先頭ゼロの数もばらけさせる
      Arrays.fill(input, 0, i % (length + 1), (byte) 0);
      assertEquals(reference(input), Base58.encode(input),
          HexFormat.of().formatHex(input));
    }
  }

  @ParameterizedTest
  @ValueSource(ints = {1, 2, 3, 4, 5, 20, 24, 25, 33, 64})
  void roundTrip(int length) {
    var random = new Random(~(length * 31L));
    var input = new byte[length];
    for (var i = 0; i < 2000; i++) {
      random.nextBytes(input);
      Arrays.fill(input, 0, i % (length + 1), (byte) 0);
      assertArrayEquals(input, Base58.decode(Base58.encode(input)),
          HexFormat.of().formatHex(input));
    }
  }

  /**
   * Appendable版とString版が一致すること。
   */
  @Test
  void appendableAndStringOverloadsAgree() {
    var random = new Random(1234);
    var input = new byte[25];
    for (var i = 0; i < 2000; i++) {
      random.nextBytes(input);
      assertEquals(Base58.encode(input),
          Base58.encode(new StringBuilder(), input).toString());
    }
  }
}
