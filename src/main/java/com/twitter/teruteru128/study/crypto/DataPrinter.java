package com.twitter.teruteru128.study.crypto;

import java.io.OutputStream;
import java.io.PrintStream;

public class DataPrinter {

    private static final char[] p = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

    /**
     * {@link javax.xml.bind.DatatypeConverter#printHexBinary(byte[])}
     */
    private static String printHexBinary1(byte[] data) {
        StringBuffer buffer = new StringBuffer(data.length * 2);
        for (byte b : data) {
            // TODO どっちが早いんでしょうね？
            buffer.append(p[(b >> 4) & 0x0f]);
            buffer.append(p[(b >> 0) & 0x0f]);
            //buffer.append(q[b & 0xff]);
            //buffer.append(r[b & 0xff]);
        }
        return buffer.toString();
    }

    private static final char[] q = { '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0',
        '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1',
        '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2',
        '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3',
        '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4',
        '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5',
        '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6',
        '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7',
        '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8',
        '9', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9',
        'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a',
        'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b',
        'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c',
        'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd',
        'e', 'e', 'e', 'e', 'e', 'e', 'e', 'e', 'e', 'e', 'e', 'e', 'e', 'e', 'e', 'e',
        'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f'
    };
    private static final char[] r = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f',
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f',
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f',
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f',
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f',
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f',
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f',
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f',
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f',
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f',
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f',
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f',
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f',
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f',
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f',
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
    };
    /**
     * {@link javax.xml.bind.DatatypeConverter#printHexBinary(byte[])}
     */
    private static String printHexBinary2(byte[] data) {

        StringBuffer buffer = new StringBuffer(data.length * 2);

        for (byte b : data) {
            // TODO どっちが早いんでしょうね？
            //buffer.append(p[(b >> 4) & 0x0f]);
            //buffer.append(p[(b >> 0) & 0x0f]);
            buffer.append(q[b & 0xff]);
            buffer.append(r[b & 0xff]);
        }
        return buffer.toString();
    }

    public static String printHexBinary(byte[] data) {
        return printHexBinary2(data);
    }

    public static void printHexBinaryBench() {
        byte[] data = new byte[512];
        for (int i = 0; i < 512; i++) {
            data[i] = (byte) (i & 0xff);
        }
        long start = 0;
        long stop = 0;
        int count = 100000;
        int loop = 1000;
        long diff1 = 0;
        long diff2 = 0;
        try (PrintStream ps = new PrintStream(OutputStream.nullOutputStream());) {
            for (int j = 0; j < loop; j++) {
                start = System.nanoTime();
                for (int i = 0; i < count; i++) {
                    ps.print(printHexBinary1(data));
                }
                stop = System.nanoTime();
                diff1 += stop - start;
                start = System.nanoTime();
                for (int i = 0; i < count; i++) {
                    ps.print(printHexBinary2(data));
                }
                stop = System.nanoTime();
                diff2 += stop - start;
            }
        }
        System.out.printf("%f\n", diff1 / (1000000000.0 * loop));
        System.out.printf("%f\n", diff2 / (1000000000.0 * loop));
    }

}