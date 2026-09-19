
package com.github.teruteru128.encode;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.CharBuffer;
import java.util.Arrays;

/**
 * TODO ライブラリに置き換える
 * @author <a href="https://gist.github.com/vrotaru/1753908">Base58.java - vrotaru</a>
 */
public class Base58 {

  private Base58() {
    // NONE
  }

  private static final char[] ALPHABET = "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz".toCharArray();
  private static final int BASE_58 = ALPHABET.length;
  private static final int BASE_256 = 256;

  private static final int[] INDEXES = new int[128];
  static {
      Arrays.fill(INDEXES, -1);
    for (int i = 0; i < ALPHABET.length; i++) {
      INDEXES[ALPHABET[i]] = i;
    }
  }

  /**
   * 58^5。{@code 2^31}未満なので、{@code (remainder << 32) | limb}が符号付きlongに収まる。
   * おかげで128bit除算もunsigned演算も要らずに、1リムあたりlong除算1回で処理できる。
   */
  private static final int BASE_58_POW_5 = 656356768;
  private static final int DIGITS_PER_STEP = 5;
  private static final int LIMB_BYTES = 4;

  public static <A extends Appendable> A encode(A out, byte[] input) {
    if (input.length == 0) {
      return out;
    }

    //
    // Count leading zeroes
    //
    int zeroCount = 0;
    while (zeroCount < input.length && input[zeroCount] == 0) {
      ++zeroCount;
    }

    //
    // 有効部を32bitリムのビッグエンディアン配列に詰め直す。
    // inputを破壊しないので防御的コピーは要らない。
    //
    int significant = input.length - zeroCount;
    int limbCount = (significant + LIMB_BYTES - 1) / LIMB_BYTES;
    int[] limbs = new int[limbCount];
    int cursor = zeroCount;
    // 最上位リムだけは端数になるので先に詰める
    int headBytes = significant - (limbCount - 1) * LIMB_BYTES;
    for (int i = 0; i < limbCount; i++) {
      int limb = 0;
      for (int k = i == 0 ? headBytes : LIMB_BYTES; k > 0; k--) {
        limb = (limb << 8) | (input[cursor++] & 0xFF);
      }
      limbs[i] = limb;
    }

    //
    // 58^5で割って5桁ずつ取り出す。1バイトずつ58で割る場合に比べて除算の回数が桁違いに少ない
    //
    char[] digits = new char[significant * 2 + DIGITS_PER_STEP];
    int j = digits.length;
    int first = 0;
    while (first < limbCount) {
      long remainder = 0;
      for (int i = first; i < limbCount; i++) {
        // remainder < 58^5 なので cur < 58^5 * 2^32 < 2^62、商は必ず32bitに収まる
        long cur = (remainder << 32) | (limbs[i] & 0xFFFFFFFFL);
        limbs[i] = (int) (cur / BASE_58_POW_5);
        remainder = cur % BASE_58_POW_5;
      }
      while (first < limbCount && limbs[first] == 0) {
        ++first;
      }
      for (int k = 0; k < DIGITS_PER_STEP; k++) {
        digits[--j] = ALPHABET[(int) (remainder % BASE_58)];
        remainder /= BASE_58;
      }
    }

    //
    // Strip extra '1' if any
    //
    while (j < digits.length && digits[j] == ALPHABET[0]) {
      ++j;
    }

    try {
      //
      // Add as many leading '1' as there were leading zeros.
      //
      for (int i = 0; i < zeroCount; i++) {
        out.append(ALPHABET[0]);
      }
      for (int i = j; i < digits.length; i++) {
        out.append(digits[i]);
      }
    } catch (IOException e) {
      throw new UncheckedIOException(e.getMessage(), e);
    }
    return out;
  }

  public static String encode(byte[] input) {
    return encode(CharBuffer.allocate(input.length * 2), input).flip().toString();
  }

  public static byte[] decode(String input) {
    if (input.isEmpty()) {
      // paying with the same coin
      return new byte[0];
    }

    byte[] input58 = new byte[input.length()];
    //
    // Transform the String to a base58 byte sequence
    //
    for (int i = 0; i < input.length(); ++i) {
      char c = input.charAt(i);

      int digit58 = -1;
      if (c < 128) {
        digit58 = INDEXES[c];
      }
      if (digit58 < 0) {
        throw new RuntimeException("Not a Base58 input: " + input);
      }

      input58[i] = (byte) digit58;
    }

    //
    // Count leading zeroes
    //
    int zeroCount = 0;
    while (zeroCount < input58.length && input58[zeroCount] == 0) {
      ++zeroCount;
    }

    //
    // The encoding
    //
    byte[] temp = new byte[input.length()];
    int j = temp.length;

    int startAt = zeroCount;
    while (startAt < input58.length) {
      byte mod = divmod256(input58, startAt);
      if (input58[startAt] == 0) {
        ++startAt;
      }

      temp[--j] = mod;
    }

    //
    // Do no add extra leading zeroes, move j to first non null byte.
    //
    while (j < temp.length && temp[j] == 0) {
      ++j;
    }

    return Arrays.copyOfRange(temp, j - zeroCount, temp.length);
  }

  private static byte divmod256(byte[] number58, int startAt) {
    int remainder = 0;
    for (int i = startAt; i < number58.length; i++) {
      int digit58 = (int) number58[i] & 0xFF;
      int temp = remainder * BASE_58 + digit58;

      number58[i] = (byte) (temp / BASE_256);

      remainder = temp % BASE_256;
    }

    return (byte) remainder;
  }

}
