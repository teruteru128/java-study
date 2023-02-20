package com.twitter.teruteru128.util;

import java.nio.ByteBuffer;
import java.util.HexFormat;

/**
 * プリミティブ型配列を16進数文字列に変換します。
 * 
 * @see <a href=
 *      "http://blog.repy.info/article/309433098.html">Javaでbyte配列を16進文字列にする時の速度比較</a>
 *      実装における参照元
 * @see <a href=
 *      "http://weblabo.oscasierra.net/java-hex-convert-1/">Javaにおけるbyte配列⇔16進数文字列の変換方法</a>
 *      16進数文字列からbyte配列に戻す際について
 * @see jakarta.xml.bind.DatatypeConverter#parseHexBinary(String)
 *      DatatypeConverter#parseHexBinary(String)
 */
public final class Arrays {
    private Arrays() {
    }

    /**
     * Call {@link jakarta.xml.bind.DatatypeConverter#printHexBinary(byte[])}
     * 
     * @see jakarta.xml.bind.DatatypeConverter#printHexBinary(byte[])
     * @param array
     * @return
     */
    public static String toHexString(byte[] array) {
        return HexFormat.of().formatHex(array).toString();
    }

    public static byte[] parseHexBinary(String hexString) {
        return HexFormat.of().parseHex(hexString);
    }

    public static String toHexString(short[] array) {
        var buffer = ByteBuffer.allocate(array.length * 2);
        for (short b : array) {
            buffer.putShort(b);
        }
        return HexFormat.of().formatHex(buffer.array());
    }

    public static String toHexString(int[] array) {
        var buffer = ByteBuffer.allocate(array.length * 4);
        for (int b : array) {
            buffer.putInt(b);
        }
        return HexFormat.of().formatHex(buffer.array());
    }

    public static String toHexString(long[] array) {
        var buffer = ByteBuffer.allocate(array.length * 8);
        for (long b : array) {
            buffer.putLong(b);
        }
        return HexFormat.of().formatHex(buffer.array());
    }

    public static String toHexString(float[] array) {
        var buffer = ByteBuffer.allocate(array.length * 4);
        for (float buf : array) {
            buffer.putFloat(buf);
        }
        return HexFormat.of().formatHex(buffer.array());
    }

    public static String toHexString(double[] array) {
        var buffer = ByteBuffer.allocate(array.length * 8);
        for (double buf : array) {
            buffer.putDouble(buf);
        }
        return HexFormat.of().formatHex(buffer.array());
    }

    /**
     */
    public static String toHexString(char[] array) {
        var buffer = ByteBuffer.allocate(array.length * 2);
        for (char b : array) {
            buffer.putChar(b);
        }
        return HexFormat.of().formatHex(buffer.array());
    }

}
