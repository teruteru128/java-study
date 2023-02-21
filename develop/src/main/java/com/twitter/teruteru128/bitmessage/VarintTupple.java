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
        int firstByte = a.get() & 0xff;
        long value;
        switch (firstByte) {
            case 253:
                if (length < 3) {
                    throw new VarintDecodeException();
                }
                value = a.getShort() & 0xffff;
                if (value < 253) {
                    throw new VarintDecodeException();
                }
                return new VarintTupple(value, 3);
            case 254:
                if (length < 5) {
                    throw new VarintDecodeException();
                }
                value = a.getInt() & 0xffffffffL;
                if (value < 65536) {
                    throw new VarintDecodeException();
                }
                return new VarintTupple(value, 5);
            case 255:
                if (length < 9) {
                    throw new VarintDecodeException();
                }
                value = a.getLong();
                if (value < 4294967296L) {
                    throw new VarintDecodeException();
                }
                return new VarintTupple(value, 9);
            default:
                return new VarintTupple(firstByte, 1);
        }
    }
}
