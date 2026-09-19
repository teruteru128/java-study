package com.github.teruteru128.bitmessage.spec;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.ByteBuffer;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;

import com.github.teruteru128.bitmessage.Structs;
import com.github.teruteru128.encode.Base58;

/**
 * bitmessageアドレスのエンコーダ本体。
 * <p>
 * {@link MessageDigest}と作業バッファを保持して使い回すので、アドレスを大量に生成する場合は
 * {@link AddressFactory}のstaticメソッドより速い。かわりに<strong>スレッドセーフではない</strong>ため、
 * 1スレッドにつき1インスタンスを用意すること。1回しかエンコードしないなら{@link AddressFactory}でよい。
 *
 * @see AddressFactory
 * @see <a href="https://github.com/Bitmessage/PyBitmessage/blob/6f35da4096770a668c4944c3024cd7ddb34be092/src/addresses.py">addresses.py</a>
 */
public final class AddressEncoder {

    /**
     * ripeのバイト長。RIPEMD-160なのでアドレスバージョン2以降は20バイト固定。
     */
    public static final int RIPE_LENGTH = 20;

    /**
     * アドレス文字列のおおよその長さ。{@link StringBuilder}の初期容量に使う。
     */
    static final int ADDRESS_LENGTH_HINT = 38;

    private static final int CHECKSUM_LENGTH = 4;
    private static final int SHA512_DIGEST_LENGTH = 64;

    private final MessageDigest sha512;
    private final byte[] hash = new byte[SHA512_DIGEST_LENGTH];
    private final StringBuilder work = new StringBuilder(ADDRESS_LENGTH_HINT);

    public AddressEncoder() {
        try {
            sha512 = MessageDigest.getInstance("SHA-512");
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /**
     * 先頭ゼロを何バイト削るか決める。
     * <p>
     * バージョン2/3は最大2バイトまでしか削ってはならない。{@code decodeAddress}が
     * 埋め込みripeの長さを18〜20バイトしか受け付けず、17バイト以下は{@code ripetooshort}で
     * 拒否するためである。逆にバージョン4は非可鍛性(non-malleability)のため、先頭ゼロが
     * 1バイトでも残っていると{@code encodingproblem}になるので全部削る必要がある。
     *
     * @param version      アドレスバージョン
     * @param leadingZeros 20バイトripeの先頭に並ぶゼロの数
     * @return 削るバイト数
     * @see <a href="https://github.com/Bitmessage/PyBitmessage/blob/6f35da4096770a668c4944c3024cd7ddb34be092/src/addresses.py">addresses.py decodeAddress</a>
     */
    private static int zerosToStrip(int version, int leadingZeros) {
        return switch (version) {
            case 2, 3 -> Math.min(leadingZeros, 2);
            case 4 -> leadingZeros;
            default -> 0;
        };
    }

    /**
     * bitmessageアドレスをエンコードする。
     * <p>
     * {@code ripe}の{@code offset}から{@code length}バイトを、20バイトripeの<strong>下位</strong>
     * {@code length}バイトとして扱う。配列に含まれない先頭{@code 20 - length}バイトはゼロとみなすので、
     * 先頭ゼロを切り詰め済みのripeを{@code byte[20]}へ詰め直さずそのまま渡せる。
     * これは{@code decodeAddress}が短いripeをゼロで左詰めして復元するのとちょうど逆の関係にある。
     * <p>
     * 先頭ゼロの切り詰めはバージョンに応じて内部で行うので、呼び出し側での前処理は不要。
     *
     * @param out     出力先
     * @param version アドレスバージョン
     * @param stream  ストリーム番号
     * @param ripe    ripeハッシュを含む配列
     * @param offset  ripeの開始位置
     * @param length  配列に入っているripeのバイト数({@value #RIPE_LENGTH}以下)
     * @return {@code out}
     * @throws IndexOutOfBoundsException {@code offset}と{@code length}が{@code ripe}の範囲外の場合
     * @throws IllegalArgumentException  {@code length}が{@value #RIPE_LENGTH}を超える場合
     */
    public <A extends Appendable> A encode(A out, int version, int stream, byte[] ripe, int offset, int length) {
        Objects.checkFromIndexSize(offset, length, ripe.length);
        if (length > RIPE_LENGTH) {
            throw new IllegalArgumentException(
                    "Programming error in encodeAddress: The length of a given ripe hash was greater than "
                            + RIPE_LENGTH + ": " + length);
        }
        // 配列に入っていない先頭バイトはゼロとみなす
        var implicitZeros = RIPE_LENGTH - length;
        var explicitZeros = 0;
        while (explicitZeros < length && ripe[offset + explicitZeros] == 0) {
            explicitZeros++;
        }
        var skip = zerosToStrip(version, implicitZeros + explicitZeros);

        // 削った残りを組み立てる。バージョン4向けに切り詰めたripeをバージョン3で
        // エンコードし直す場合など、配列側が足りなければゼロを書き戻す必要がある
        var ripeLength = RIPE_LENGTH - skip;
        var padding = Math.max(0, implicitZeros - skip);
        var fromArray = ripeLength - padding;

        var varintVersion = Structs.encodeVarint(version);
        var varintStream = Structs.encodeVarint(stream);
        var buffer = ByteBuffer
                .allocate(varintVersion.length + varintStream.length + ripeLength + CHECKSUM_LENGTH)
                .put(varintVersion).put(varintStream);
        // allocateしたバッファはゼロ初期化されているのでpositionを進めるだけでよい
        buffer.position(buffer.position() + padding).put(ripe, offset + length - fromArray, fromArray);
        var array = buffer.array();
        try {
            // 前回のencodeが出力中に失敗していた場合に備える
            sha512.reset();
            sha512.update(array, 0, array.length - CHECKSUM_LENGTH);
            sha512.digest(hash, 0, SHA512_DIGEST_LENGTH);
            sha512.update(hash, 0, SHA512_DIGEST_LENGTH);
            sha512.digest(hash, 0, SHA512_DIGEST_LENGTH);
            buffer.put(hash, 0, CHECKSUM_LENGTH);
            out.append("BM-");
            return Base58.encode(out, array);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        } catch (DigestException e) {
            throw new AssertionError(e);
        }
    }

    /**
     * @return encoded bitmessage address
     * @see #encode(Appendable, int, int, byte[], int, int)
     */
    public String encode(int version, int stream, byte[] ripe, int offset, int length) {
        // toStringがコピーを作るので、作業用のStringBuilderは使い回して問題ない
        work.setLength(0);
        return encode(work, version, stream, ripe, offset, length).toString();
    }

    /**
     * @return encoded bitmessage address
     * @see #encode(Appendable, int, int, byte[], int, int)
     */
    public String encode(int version, int stream, byte[] ripe) {
        return encode(version, stream, ripe, 0, ripe.length);
    }

    /**
     * @return encoded bitmessage address
     * @see #encode(Appendable, int, int, byte[], int, int)
     */
    public String encode(byte[] ripe, int offset, int length) {
        return encode(4, 1, ripe, offset, length);
    }

    /**
     * @return encoded bitmessage address
     * @see #encode(Appendable, int, int, byte[], int, int)
     */
    public String encode(byte[] ripe) {
        return encode(4, 1, ripe, 0, ripe.length);
    }
}
