
package com.twitter.teruteru128.encode;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.CharBuffer;
import java.util.Arrays;

/**
 * @author https://gist.github.com/vrotaru/1753908
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
    for (int i = 0; i < INDEXES.length; i++) {
      INDEXES[i] = -1;
    }
    for (int i = 0; i < ALPHABET.length; i++) {
      INDEXES[ALPHABET[i]] = i;
    }
  }

  public static <A extends Appendable> A encode(A out, byte[] input) {
    if (input.length == 0) {
      return out;
    }

    //
    // Make a copy of the input since we are going to modify it.
    //
    input = Arrays.copyOf(input, input.length);

    //
    // Count leading zeroes
    //
    int zeroCount = 0;
    while (zeroCount < input.length && input[zeroCount] == 0) {
      ++zeroCount;
    }

    //
    // The actual encoding
    //
    byte[] temp = new byte[input.length * 2];
    int j = temp.length;

    int startAt = zeroCount;
    while (startAt < input.length) {
      byte mod = divmod58(input, startAt);
      if (input[startAt] == 0) {
        ++startAt;
      }

      temp[--j] = (byte) ALPHABET[mod];
    }

    //
    // Strip extra '1' if any
    //
    while (j < temp.length && temp[j] == ALPHABET[0]) {
      ++j;
    }

    //
    // Add as many leading '1' as there were leading zeros.
    //
    while (--zeroCount >= 0) {
      temp[--j] = (byte) ALPHABET[0];
    }

    try {
    for (int i = j; i < temp.length; i++) {
        out.append((char) temp[i]);
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
    if (input.length() == 0) {
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
      if (c >= 0 && c < 128) {
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

  private static byte divmod58(byte[] number, int startAt) {
    int remainder = 0;
    for (int i = startAt; i < number.length; i++) {
      int digit256 = number[i] & 0xFF;
      int temp = (remainder << 8) + digit256;

      number[i] = (byte) (temp / BASE_58);

      remainder = temp % BASE_58;
    }

    return (byte) remainder;
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
