package com.twitter.teruteru128.study.bitmessage;

import java.math.BigInteger;
import java.nio.ByteBuffer;

/**
 * @see https://github.com/Bitmessage/PyBitmessage/blob/6f35da4096770a668c4944c3024cd7ddb34be092/src/addresses.py#L63
 *      d
 */
public class Structs {
    private static final BigInteger _253 = BigInteger.valueOf(253);
    private static final BigInteger _65536 = BigInteger.valueOf(65536);
    private static final BigInteger _4294967296 = BigInteger.valueOf(4294967296L);
    private static final BigInteger _18446744073709551616 = new BigInteger("18446744073709551616", 10);

    public static byte[] encodeVarint(BigInteger u) {
        if (u.compareTo(BigInteger.ZERO) < 0) {
            throw new RuntimeException("varint cannot be < 0");
        }
        if (u.compareTo(_253) < 0) {
            return ByteBuffer.allocate(1).put(u.toByteArray()).array();
        }
        if (_253.compareTo(u) <= 0 && u.compareTo(_65536) < 0) {
            return ByteBuffer.allocate(3).put((byte) 253).putShort(u.shortValue()).array();
        }
        if (_65536.compareTo(u) <= 0 && u.compareTo(_4294967296) < 0) {
            // 3バイトの数が4バイトに入ってくれるとは思えないんだよな
            return ByteBuffer.allocate(5).put((byte) 254).putInt(u.intValue()).array();
        }
        if (_4294967296.compareTo(u) <= 0 && u.compareTo(_18446744073709551616) < 0) {
            //  9223372036854775808以上は符号付き64ビットではマイナスになるためデッドコード
            return ByteBuffer.allocate(9).put((byte) 255).putLong(u.longValue()).array();
        }
        // alive code
        throw new RuntimeException("varint cannot be >= 18446744073709551616");
    }

    public static byte[] encodeVarint(long u) {
        if (u < 0) {
            throw new RuntimeException("varint cannot be < 0");
        }

        if (u < 253) {
            return ByteBuffer.allocate(1).put((byte) u).array();
        }
        if (253 <= u && u < 65536) {
            return ByteBuffer.allocate(3).put((byte) 253).putShort((short) u).array();
        }
        if (65536 <= u && u < 4294967296L) {
            return ByteBuffer.allocate(5).put((byte) 254).putInt((int) u).array();
        }
        if (4294967296L <= u && Long.compareUnsigned(u, -1) <= 0) {
            //  9223372036854775808以上は符号付き64ビットではマイナスになるためデッドコード
            return ByteBuffer.allocate(9).put((byte) 255).putLong(u).array();
        }
        // dead code
        throw new RuntimeException("varint cannot be >= 18446744073709551616");
    }
}
