package com.twitter.teruteru128.util;

import jakarta.xml.bind.DatatypeConverter;

/**
 * プリミティブ型配列を16進数文字列に変換します。
 * 
 * @see <a
 *      href="http://blog.repy.info/article/309433098.html">Javaでbyte配列を16進文字列にする時の速度比較</a>
 *      実装における参照元
 * @see <a
 *      href="http://weblabo.oscasierra.net/java-hex-convert-1/">Javaにおけるbyte配列⇔16進数文字列の変換方法</a>
 *      16進数文字列からbyte愛列に戻す際について
 * @see jakarta.xml.bind.DatatypeConverter#parseHexBinary(String)
 *      DatatypeConverter#parseHexBinary(String)
 * */
public final class Arrays {
    private Arrays() {
    }

    private static final char[] hexCode = "0123456789ABCDEF".toCharArray();

    /**
     * 
     * @see jakarta.xml.bind.DatatypeConverter#printHexBinary(byte[])
     * @see jakarta.xml.bind.DatatypeConverter#printHexBinary(byte[])
     * */
    public static String toHexString(byte[] array) {
        StringBuilder r = new StringBuilder(array.length * 2);
        for (byte b : array) {
            r.append(hexCode[(b >> 4) & 0xF]);
            r.append(hexCode[(b & 0xF)]);
        }
        return r.toString();
    }

    public static byte[] parseHexBinary(String hexString) {
        return DatatypeConverter.parseHexBinary(hexString);
    }

    public static String toHexString(short[] array) {
        StringBuilder r = new StringBuilder(array.length * 4);
        for (short b : array) {
            r.append(hexCode[(b >> 12) & 0xF]);
            r.append(hexCode[(b >> 8) & 0xF]);
            r.append(hexCode[(b >> 4) & 0xF]);
            r.append(hexCode[(b & 0xF)]);
        }
        return r.toString();
    }

    public static String toHexString(int[] array) {
        StringBuilder r = new StringBuilder(array.length * 8);
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
     * @deprecated この実装は不完全で、使用されるではありません。
     * */
    @Deprecated
    public static String toHexString(char[] array) {
        StringBuilder r = new StringBuilder(array.length * 8);
        for (char b : array) {
            r.append(Character.forDigit(b >> 28 & 0xF, 16));
            r.append(Character.forDigit(b >> 24 & 0xF, 16));
            r.append(Character.forDigit(b >> 20 & 0xF, 16));
            r.append(Character.forDigit(b >> 16 & 0xF, 16));
            r.append(Character.forDigit(b >> 12 & 0xF, 16));
            r.append(Character.forDigit(b >> 8 & 0xF, 16));
            r.append(Character.forDigit(b >> 4 & 0xF, 16));
            r.append(Character.forDigit(b & 0xF, 16));
        }
        return r.toString();
    }

}
