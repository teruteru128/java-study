package com.twitter.teruteru128.study.crypto;

import jakarta.xml.bind.DatatypeConverter;

public class DataPrinter {

    private static final char[] p = ("0123456789abcdef").toCharArray();

    /**
     * {@link jakarta.xml.bind.DatatypeConverter#printHexBinary(byte[])}
     */
    private static String printHexBinary1(byte[] data) {
        StringBuilder builder = new StringBuilder(data.length << 1);
        for (byte b : data) {
            builder.append(p[(b >> 4) & 0x0f]);
            builder.append(p[b & 0x0f]);
        }
        return builder.toString();
    }

    private static final char[] q = ("0000000000000000" + "1111111111111111" + "2222222222222222" + "3333333333333333"
            + "4444444444444444" + "5555555555555555" + "6666666666666666" + "7777777777777777" + "8888888888888888"
            + "9999999999999999" + "aaaaaaaaaaaaaaaa" + "bbbbbbbbbbbbbbbb" + "cccccccccccccccc" + "dddddddddddddddd"
            + "eeeeeeeeeeeeeeee" + "ffffffffffffffff").toCharArray();
    private static final char[] r = ("0123456789abcdef" + "0123456789abcdef" + "0123456789abcdef" + "0123456789abcdef"
            + "0123456789abcdef" + "0123456789abcdef" + "0123456789abcdef" + "0123456789abcdef" + "0123456789abcdef"
            + "0123456789abcdef" + "0123456789abcdef" + "0123456789abcdef" + "0123456789abcdef" + "0123456789abcdef"
            + "0123456789abcdef" + "0123456789abcdef").toCharArray();

    /**
     * {@link jakarta.xml.bind.DatatypeConverter#printHexBinary(byte[])}
     */
    private static String printHexBinary2(byte[] data) {
        StringBuilder builder = new StringBuilder(data.length << 1);

        for (byte b : data) {
            builder.append(q[b & 0xff]);
            builder.append(r[b & 0xff]);
        }
        return builder.toString();
    }

    public static String printHexBinary(byte[] data) {
        return printHexBinary1(data);
    }

    public static void printHexBinaryBench() {
        byte[] data = new byte[512];
        for (int i = 0; i < 512; i++) {
            data[i] = (byte) (i & 0xff);
        }
        long start = 0;
        long stop = 0;
        int count = 1000000;
        int loop = 1;
        long diff1 = 0;
        long diff2 = 0;
        long diff3 = 0;
        for (int j = 0; j < loop; j++) {
            start = System.nanoTime();
            for (int i = 0; i < count; i++) {
                printHexBinary1(data);
            }
            stop = System.nanoTime();
            diff1 += stop - start;
            start = System.nanoTime();
            for (int i = 0; i < count; i++) {
                printHexBinary2(data);
            }
            stop = System.nanoTime();
            diff2 += stop - start;
            start = System.nanoTime();
            for (int i = 0; i < count; i++) {
                DatatypeConverter.printHexBinary(data);
            }
            stop = System.nanoTime();
            diff3 += stop - start;
        }
        System.out.printf("printHexBinary1 : %f\n", diff1 / (1e9 * loop));
        System.out.printf("printHexBinary2 : %f\n", diff2 / (1e9 * loop));
        System.out.printf("DatatypeConverter.printHexBinary : %f\n", diff3 / (1e9 * loop));
    }

}
