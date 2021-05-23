package com.twitter.teruteru128.util;

import jakarta.xml.bind.DatatypeConverter;

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

    private static final char[] hexCode = "0123456789ABCDEF".toCharArray();

    /**
     * Call {@link jakarta.xml.bind.DatatypeConverter#printHexBinary(byte[])}
     * 
     * @see jakarta.xml.bind.DatatypeConverter#printHexBinary(byte[])
     * @param array
     * @return
     */
    public static String toHexString(byte[] array) {
        var r2 = new char[array.length * 2];
        var index = 0;
        for (byte c : array) {
            r2[index] = Character.forDigit((c >>> 4) & 0xf, 16);
            r2[index + 1] = Character.forDigit((c >>> 0) & 0xf, 16);
            index += 2;
        }
        return String.valueOf(r2);
    }

    public static byte[] parseHexBinary(String hexString) {
        return DatatypeConverter.parseHexBinary(hexString);
    }

    public static String toHexString(short[] array) {
        var r = new StringBuilder(array.length * 4);
        for (short b : array) {
            r.append(hexCode[(b >> 12) & 0xF]);
            r.append(hexCode[(b >> 8) & 0xF]);
            r.append(hexCode[(b >> 4) & 0xF]);
            r.append(hexCode[(b & 0xF)]);
        }
        return r.toString();
    }

    public static String toHexString(int[] array) {
        var r = new StringBuilder(array.length * 8);
        for (int b : array) {
            r.append(hexCode[(b >> 28) & 0xF]);
            r.append(hexCode[(b >> 24) & 0xF]);
            r.append(hexCode[(b >> 20) & 0xF]);
            r.append(hexCode[(b >> 16) & 0xF]);
            r.append(hexCode[(b >> 12) & 0xF]);
            r.append(hexCode[(b >> 8) & 0xF]);
            r.append(hexCode[(b >> 4) & 0xF]);
            r.append(hexCode[(b & 0xF)]);
        }
        return r.toString();
    }

    public static String toHexString(long[] array) {
        StringBuilder r = new StringBuilder(array.length * 16);
        for (long b : array) {
            r.append(hexCode[(int) ((b >> 60) & 0xF)]);
            r.append(hexCode[(int) ((b >> 56) & 0xF)]);
            r.append(hexCode[(int) ((b >> 52) & 0xF)]);
            r.append(hexCode[(int) ((b >> 48) & 0xF)]);
            r.append(hexCode[(int) ((b >> 44) & 0xF)]);
            r.append(hexCode[(int) ((b >> 40) & 0xF)]);
            r.append(hexCode[(int) ((b >> 36) & 0xF)]);
            r.append(hexCode[(int) ((b >> 32) & 0xF)]);
            r.append(hexCode[(int) ((b >> 28) & 0xF)]);
            r.append(hexCode[(int) ((b >> 24) & 0xF)]);
            r.append(hexCode[(int) ((b >> 20) & 0xF)]);
            r.append(hexCode[(int) ((b >> 16) & 0xF)]);
            r.append(hexCode[(int) ((b >> 12) & 0xF)]);
            r.append(hexCode[(int) ((b >> 8) & 0xF)]);
            r.append(hexCode[(int) ((b >> 4) & 0xF)]);
            r.append(hexCode[(int) (b & 0xF)]);
        }
        return r.toString();
    }

    public static String toHexString(float[] array) {
        StringBuilder r = new StringBuilder(array.length * 8);
        for (float buf : array) {
            int b = Float.floatToRawIntBits(buf);
            r.append(hexCode[(b >> 28) & 0xF]);
            r.append(hexCode[(b >> 24) & 0xF]);
            r.append(hexCode[(b >> 20) & 0xF]);
            r.append(hexCode[(b >> 16) & 0xF]);
            r.append(hexCode[(b >> 12) & 0xF]);
            r.append(hexCode[(b >> 8) & 0xF]);
            r.append(hexCode[(b >> 4) & 0xF]);
            r.append(hexCode[(b & 0xF)]);
        }
        return r.toString();
    }

    public static String toHexString(double[] array) {
        StringBuilder r = new StringBuilder(array.length * 16);
        for (double buf : array) {
            long b = Double.doubleToRawLongBits(buf);
            r.append(hexCode[(int) ((b >> 60) & 0xF)]);
            r.append(hexCode[(int) ((b >> 56) & 0xF)]);
            r.append(hexCode[(int) ((b >> 52) & 0xF)]);
            r.append(hexCode[(int) ((b >> 48) & 0xF)]);
            r.append(hexCode[(int) ((b >> 44) & 0xF)]);
            r.append(hexCode[(int) ((b >> 40) & 0xF)]);
            r.append(hexCode[(int) ((b >> 36) & 0xF)]);
            r.append(hexCode[(int) ((b >> 32) & 0xF)]);
            r.append(hexCode[(int) ((b >> 28) & 0xF)]);
            r.append(hexCode[(int) ((b >> 24) & 0xF)]);
            r.append(hexCode[(int) ((b >> 20) & 0xF)]);
            r.append(hexCode[(int) ((b >> 16) & 0xF)]);
            r.append(hexCode[(int) ((b >> 12) & 0xF)]);
            r.append(hexCode[(int) ((b >> 8) & 0xF)]);
            r.append(hexCode[(int) ((b >> 4) & 0xF)]);
            r.append(hexCode[(int) (b & 0xF)]);
        }
        return r.toString();
    }

    /**
     */
    public static String toHexString(char[] array) {
        var r = new char[array.length * 4];
        var index = 0;
        for (char b : array) {
            r[index + 0] = Character.forDigit((b >>> 12) & 0xf, 16);
            r[index + 1] = Character.forDigit((b >>> 8) & 0xf, 16);
            r[index + 2] = Character.forDigit((b >>> 4) & 0xf, 16);
            r[index + 3] = Character.forDigit((b >>> 0) & 0xf, 16);
            index += 4;
        }
        return String.valueOf(r);
    }

}
