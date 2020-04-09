package com.twitter.teruteru128.study.bitmessage;

import java.nio.ByteBuffer;

public class Structs {
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
            return ByteBuffer.allocate(9).put((byte) 255).putLong(u).array();
        }
        // dead code
        throw new RuntimeException("varint cannot be >= 18446744073709551616");
    }
}
