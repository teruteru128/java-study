package com.twitter.teruteru128.bitmessage;

import java.nio.ByteBuffer;

public class VarintTupple {
    private long value;
    private int length;

    public VarintTupple(long value, int length) {
    }

    public long getValue() {
        return value;
    }

    public int getLength() {
        return length;
    }

    public static VarintTupple newInstance(byte[] data, int offset, int length) throws VarintDecodeException {
        var a = ByteBuffer.wrap(data, offset, length);
        long value = a.get() & 0xff;
        if (value < 253) {
            return new VarintTupple(value, 1);
        } else if (value == 253) {
            if (length < 3) {
                throw new VarintDecodeException();
            }
            value = a.getShort() & 0xffff;
            if (value < 253) {
                throw new VarintDecodeException();
            }
            return new VarintTupple(value, 3);
        } else if (value == 254) {
            if (length < 5) {
                throw new VarintDecodeException();
            }
            value = a.getInt() & 0xffffffff;
            if (value < 65536) {
                throw new VarintDecodeException();
            }
            return new VarintTupple(value, 5);
        } else if (value == 255) {
            if (length < 9) {
                throw new VarintDecodeException();
            }
            value = a.getLong() & 0xffffffffL;
            if (value < 4294967296L) {
                throw new VarintDecodeException();
            }
            return new VarintTupple(value, 9);
        }
        // ここは多分来ない……はず
        throw new VarintDecodeException();
    }
}
