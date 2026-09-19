package com.github.teruteru128.bitmessage.genaddress;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.github.teruteru128.bitmessage.Const;
import com.github.teruteru128.bitmessage.spec.AddressEncoder;
import com.github.teruteru128.bitmessage.spec.AddressFactory;
import com.github.teruteru128.encode.Base58;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.Security;
import java.util.Arrays;
import java.util.HexFormat;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class AddressFactoryTest {

  private static final HexFormat HEX = HexFormat.of();

  /**
   * 先頭ゼロの数が異なるripeのテストベクタ。先頭ゼロの切り詰めはバージョンによって挙動が変わるので、
   * 0個から20個まで散らしてある。
   */
  private static final String[] RIPE_VECTORS = {
      "00005757482ea4aa7c4e243da76ac4cc977f3204", // 先頭2ゼロ
      "00000057482ea4aa7c4e243da76ac4cc977f3204", // 先頭3ゼロ
      "00000000482ea4aa7c4e243da76ac4cc977f3204", // 先頭4ゼロ
      "005757482ea4aa7c4e243da76ac4cc977f320411", // 先頭1ゼロ
      "5757482ea4aa7c4e243da76ac4cc977f32041122", // 先頭ゼロなし
      "00000000000000000000000000000000000000ff", // 先頭19ゼロ
      "0000000000000000000000000000000000000000", // 全ゼロ
  };

  /**
   * @see <a href="https://udzuki.jp/public/junit5-user-guide-ja/#writing-tests">JUnit 5 ユーザガイド 第3章
   * テストを書く - qiita</a>
   */
  @BeforeAll
  public static void initBeforeEach() {
    if (Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) == null) {
      Security.addProvider(new BouncyCastleProvider());
    }
  }

  @AfterAll
  public static void clearBCProvider() {
    Security.removeProvider(BouncyCastleProvider.PROVIDER_NAME);
  }

  private static int leadingZeros(byte[] ripe) {
    int i = 0;
    while (i < ripe.length && ripe[i] == 0) {
      i++;
    }
    return i;
  }

  @Test
  void encodeAddressTest() throws Exception {
    String address = "BM-NBJxKhQmidR2TBtD3H74yZhDHpzZ7TXM";
    String privSigningKeyWIF = "5KSKK9tJfuMrkUfwBqGS3ktfPix5zZBtgxAao2GtKeUgJNpEo6R";
    String privEncryptionKeyWIF = "5KUoQKDmcmAKpjaas3k9U6bGFN5Nz937zqLqDDo1sNUqeJCiMZn";
    byte[] wrappedPrivSigningKey = Base58.decode(privSigningKeyWIF);
    byte[] wrappedPrivEncryptionKey = Base58.decode(privEncryptionKeyWIF);
    byte[] pubSigningKey = Const.SEC_P256_K1_G.multiply(
            new BigInteger(1, wrappedPrivSigningKey, 1, Const.PRIVATE_KEY_LENGTH)).normalize()
        .getEncoded(false);
    byte[] pubEncryptionKey = Const.SEC_P256_K1_G.multiply(
            new BigInteger(1, wrappedPrivEncryptionKey, 1, Const.PRIVATE_KEY_LENGTH)).normalize()
        .getEncoded(false);
    MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
    MessageDigest ripemd160 = MessageDigest.getInstance("RIPEMD160");
    sha512.update(pubSigningKey);
    sha512.update(pubEncryptionKey);
    byte[] ripe = ripemd160.digest(sha512.digest());
    assertArrayEquals(HEX.parseHex("00005757482ea4aa7c4e243da76ac4cc977f3204"), ripe);
    Assertions.assertEquals(AddressFactory.encodeAddress(4, 1, ripe), address);
  }

  /**
   * PyBitmessageの{@code addresses.encodeAddress}が生成したアドレスと一致すること。
   * <p>
   * 特に「先頭3ゼロ」「先頭4ゼロ」のバージョン2/3の行が重要で、先頭ゼロを2バイトより多く削ると
   * ここで落ちる。PyBitmessageの{@code decodeAddress}は埋め込みripeが18バイト未満のアドレスを
   * {@code ripetooshort}で拒否するので、削りすぎたアドレスは本体で復号できなくなる。
   */
  @ParameterizedTest
  @CsvSource({
      "00005757482ea4aa7c4e243da76ac4cc977f3204, 2, BM-Bbxa54aRFEMwGhkVcfAUUtpdXktCwsea",
      "00005757482ea4aa7c4e243da76ac4cc977f3204, 3, BM-GtdmCNzbUvtUrwpMKy8mjEFvQntMMuBC",
      "00005757482ea4aa7c4e243da76ac4cc977f3204, 4, BM-NBJxKhQmidR2TBtD3H74yZhDHpzZ7TXM",
      "00000057482ea4aa7c4e243da76ac4cc977f3204, 2, BM-BbYxXkCFWDZkSYwPcFQ9Zs4wHwomsbMD",
      "00000057482ea4aa7c4e243da76ac4cc977f3204, 3, BM-GtE9f4cRjv6J2o1FKZNSpCWEAypLnA2R",
      "00000057482ea4aa7c4e243da76ac4cc977f3204, 4, BM-5oHkbBB92DaKghMwvBMbGMuCdNsUkfE",
      "00000000482ea4aa7c4e243da76ac4cc977f3204, 2, BM-BbYsBTapYYNEwpJxSH7tYJD9bZbHr491",
      "00000000482ea4aa7c4e243da76ac4cc977f3204, 3, BM-GtE4JmzznEtnY4Np9b6BndeSUbiVAAE1",
      "00000000482ea4aa7c4e243da76ac4cc977f3204, 4, BM-263gMzornqQBotZvKkmNduox8x1utA",
      "005757482ea4aa7c4e243da76ac4cc977f320411, 2, BM-ooJGxvnW1oyQYJryJPSpJ7jEEkYRvX9co",
      "005757482ea4aa7c4e243da76ac4cc977f320411, 3, BM-2D8uG5E5DCGrDySwziimJRPWrk1V9amGGn",
      "005757482ea4aa7c4e243da76ac4cc977f320411, 4, BM-2cUWFBXMvNjj3Qb32945nYfJVFGRv5jZQC",
      "5757482ea4aa7c4e243da76ac4cc977f32041122, 2, BM-4ZZMFTrPq4aKxuBqZVk4wkYhPRhBaj5b7Dn",
      "5757482ea4aa7c4e243da76ac4cc977f32041122, 3, BM-6LZsfXehapkxGG9Xjm9LXteNnYq94jQGfCm",
      "5757482ea4aa7c4e243da76ac4cc977f32041122, 4, BM-87aQ5bT1LawaZd7Dv2Yc82k4Bfy6Yj3wH1V",
      "00000000000000000000000000000000000000ff, 2, BM-BbYsATFv8y4fPB4emVY2V3hVAspTDZMq",
      "00000000000000000000000000000000000000ff, 3, BM-GtE4Hmg6NfbCyR8WUoWKjP8n3urKCrtm",
      "00000000000000000000000000000000000000ff, 4, BM-9ovA3XUfM",
      "0000000000000000000000000000000000000000, 2, BM-BbYsATFv8y4fPB4emVY2V3hVAP4jTLbi",
      "0000000000000000000000000000000000000000, 3, BM-GtE4Hmg6NfbCyR8WUoWKjP8n3R5ZYmKx",
      "0000000000000000000000000000000000000000, 4, BM-2zghFbFP",
  })
  void matchesPyBitmessage(String hexRipe, int version, String expected) {
    assertEquals(expected, AddressFactory.encodeAddress(version, 1, HEX.parseHex(hexRipe)));
  }

  /**
   * 先頭ゼロを切り詰め済みの短い配列を渡しても、{@code byte[20]}を渡したときと同じアドレスになること。
   * 呼び出し側が{@code byte[20]}へ詰め直す必要がないことの確認。
   */
  @ParameterizedTest
  @ValueSource(ints = {2, 3, 4})
  void strippedRipeIsEquivalentToFullRipe(int version) {
    for (var hexRipe : RIPE_VECTORS) {
      var full = HEX.parseHex(hexRipe);
      var expected = AddressFactory.encodeAddress(version, 1, full);
      // 先頭ゼロの範囲内でなら何バイト削った状態で渡しても同じ値を表す
      for (var strip = 1; strip <= leadingZeros(full); strip++) {
        var stripped = Arrays.copyOfRange(full, strip, full.length);
        assertEquals(expected, AddressFactory.encodeAddress(version, 1, stripped),
            () -> hexRipe + " をv" + version + "で、" + stripped.length + "バイトに切り詰めて渡した場合");
      }
    }
  }

  /**
   * バージョン4向けに切り詰めたripeをバージョン3でエンコードし直す場合、削りすぎた分のゼロを
   * 書き戻す必要がある。同一の鍵からv3とv4のアドレスを両方生成するときに通る経路。
   */
  @Test
  void reEncodingVersion4StrippedRipeAsVersion3RestoresZeros() {
    // 先頭3ゼロのripeをv4用に切り詰めると17バイトになる
    var stripped = HEX.parseHex("57482ea4aa7c4e243da76ac4cc977f3204");
    assertEquals(17, stripped.length);
    // v3では先頭ゼロを2バイトしか削れないので、18バイトへ戻してからエンコードされる
    assertEquals("BM-GtE9f4cRjv6J2o1FKZNSpCWEAypLnA2R",
        AddressFactory.encodeAddress(3, 1, stripped));
  }

  /**
   * 大きな配列の一部をoffset/lengthで指定できること。SHA-512ダイジェストの先頭20バイトを
   * {@code Arrays.copyOf}せずに渡す使い方。
   */
  @Test
  void encodesSliceOfLargerArray() {
    var ripe = HEX.parseHex("00005757482ea4aa7c4e243da76ac4cc977f3204");
    var embedded = new byte[64];
    Arrays.fill(embedded, (byte) 0xcc);
    System.arraycopy(ripe, 0, embedded, 11, ripe.length);
    assertEquals("BM-NBJxKhQmidR2TBtD3H74yZhDHpzZ7TXM",
        AddressFactory.encodeAddress(4, 1, embedded, 11, ripe.length));
    assertEquals("BM-NBJxKhQmidR2TBtD3H74yZhDHpzZ7TXM",
        AddressFactory.encodeAddress(embedded, 11, ripe.length));
  }

  /**
   * 全ゼロのripeで例外を投げないこと。旧実装は境界チェックの順序が逆で
   * {@link ArrayIndexOutOfBoundsException}になっていた。
   */
  @Test
  void allZeroRipeDoesNotThrow() {
    assertDoesNotThrow(() -> AddressFactory.encodeAddress(4, 1, new byte[20]));
    assertDoesNotThrow(() -> AddressFactory.encodeAddress(4, 1, new byte[0]));
  }

  @Test
  void rejectsRipeLongerThan20Bytes() {
    var digest = new byte[64];
    assertThrows(IllegalArgumentException.class,
        () -> AddressFactory.encodeAddress(4, 1, digest));
    assertThrows(IllegalArgumentException.class,
        () -> AddressFactory.encodeAddress(4, 1, digest, 0, 21));
  }

  @Test
  void rejectsOutOfRangeSlice() {
    var ripe = new byte[20];
    assertThrows(IndexOutOfBoundsException.class,
        () -> AddressFactory.encodeAddress(4, 1, ripe, 1, 20));
    assertThrows(IndexOutOfBoundsException.class,
        () -> AddressFactory.encodeAddress(4, 1, ripe, -1, 20));
    assertThrows(IndexOutOfBoundsException.class,
        () -> AddressFactory.encodeAddress(4, 1, ripe, 0, -1));
  }

  /**
   * Appendable版は渡した出力先へ追記し、その出力先自身を返すこと。
   */
  @Test
  void appendableOverloadAppendsAndReturnsSameInstance() {
    var ripe = HEX.parseHex("00005757482ea4aa7c4e243da76ac4cc977f3204");
    var out = new StringBuilder("address: ");
    var returned = AddressFactory.encodeAddress(out, 4, 1, ripe);
    assertSame(out, returned);
    assertEquals("address: BM-NBJxKhQmidR2TBtD3H74yZhDHpzZ7TXM", out.toString());
  }

  /**
   * 同一の{@link AddressEncoder}インスタンスを、バージョンもripeの長さも変えながら繰り返し使っても
   * {@link AddressFactory}経由と同じ結果になること。エンコーダが持ち回る{@link MessageDigest}や
   * 作業用{@link StringBuilder}に前回の状態が残っていればここで落ちる。
   */
  @Test
  void reusedEncoderMatchesFactory() {
    var encoder = new AddressEncoder();
    for (var round = 0; round < 3; round++) {
      for (var hexRipe : RIPE_VECTORS) {
        var full = HEX.parseHex(hexRipe);
        for (var version = 2; version <= 4; version++) {
          for (var strip = 0; strip <= leadingZeros(full); strip++) {
            var ripe = Arrays.copyOfRange(full, strip, full.length);
            var v = version;
            var r = round;
            assertEquals(AddressFactory.encodeAddress(version, 1, ripe),
                encoder.encode(version, 1, ripe, 0, ripe.length),
                () -> "round=" + r + " " + hexRipe + " v" + v + " length=" + ripe.length);
          }
        }
      }
    }
  }

  /**
   * エンコーダのAppendable版も渡した出力先へ追記し、その出力先自身を返すこと。
   * 作業用のStringBuilderを返してしまっていないことの確認でもある。
   */
  @Test
  void encoderAppendableOverloadAppendsAndReturnsSameInstance() {
    var ripe = HEX.parseHex("00005757482ea4aa7c4e243da76ac4cc977f3204");
    var encoder = new AddressEncoder();
    // 先にString版を呼んで作業用バッファを使わせておく
    assertEquals("BM-NBJxKhQmidR2TBtD3H74yZhDHpzZ7TXM", encoder.encode(ripe));
    var out = new StringBuilder("address: ");
    var returned = encoder.encode(out, 4, 1, ripe, 0, ripe.length);
    assertSame(out, returned);
    assertEquals("address: BM-NBJxKhQmidR2TBtD3H74yZhDHpzZ7TXM", out.toString());
  }
}
