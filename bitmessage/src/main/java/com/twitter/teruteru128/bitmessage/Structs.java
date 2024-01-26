package com.twitter.teruteru128.bitmessage;

import java.math.BigInteger;
import java.nio.ByteBuffer;

/**
 * Encode variable integer.
 * 参照実装を見るに多倍長整数をエンコードすることを意図していると思われる。
 *
 * @see <a href="https://github.com/Bitmessage/PyBitmessage/blob/6f35da4096770a668c4944c3024cd7ddb34be092/src/addresses.py#L63">addresses.py</a>
 */
public class Structs {
    private static final BigInteger _253 = BigInteger.valueOf(253);
    private static final BigInteger _65536 = BigInteger.valueOf(65536);
    private static final BigInteger _4294967296 = BigInteger.valueOf(4294967296L);
    private static final BigInteger _18446744073709551616 = new BigInteger("18446744073709551616", 10);

    /**
     * 
     * @param u
     * @return
     */
    public static byte[] encodeVarint(BigInteger u) {
        if (u.compareTo(BigInteger.ZERO) < 0) {
            throw new IllegalArgumentException("varint cannot be < 0");
        }
        if (u.compareTo(_253) < 0) {
            return ByteBuffer.allocate(1).put(u.byteValue()).array();
        }
        if (_253.compareTo(u) <= 0 && u.compareTo(_65536) < 0) {
            return ByteBuffer.allocate(3).put((byte) 253).putShort(u.shortValue()).array();
        }
        if (_65536.compareTo(u) <= 0 && u.compareTo(_4294967296) < 0) {
            return ByteBuffer.allocate(5).put((byte) 254).putInt(u.intValue()).array();
        }
        if (_4294967296.compareTo(u) <= 0 && u.compareTo(_18446744073709551616) < 0) {
            return ByteBuffer.allocate(9).put((byte) 255).putLong(u.longValue()).array();
        }
        // alive code
        throw new IllegalArgumentException("varint cannot be >= 18446744073709551616");
    }

    public static ByteBuffer encodeVarint(ByteBuffer buf, long u) {
        if (u < 0) {
            throw new IllegalArgumentException("varint cannot be < 0");
        }
        // buf.limit() - buf.limit();
        if (u < 253) {
            return buf.put((byte) u);
        }
        if (253 <= u && u < 65536) {
            return buf.put((byte) 253).putShort((short) u);
        }
        if (65536 <= u && u < 4294967296L) {
            return buf.put((byte) 254).putInt((int) u);
        }
        if (4294967296L <= u && Long.compareUnsigned(u, Long.MIN_VALUE) <= 0) {
            // 9223372036854775808以上18446744073709551616未満は符号付き64ビットでは0未満になるため意図した結果にならない。
            return buf.put((byte) 255).putLong(u);
        }
        // dead code
        throw new IllegalArgumentException("varint cannot be >= 9223372036854775808");
    }

    /**
     * 
     * 
     * @param u
     * @return
     */
    public static byte[] encodeVarint(long u) {
        if (u < 0) {
            throw new IllegalArgumentException("varint cannot be < 0");
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
        throw new IllegalArgumentException("varint cannot be >= 9223372036854775808");
    }

    /**
     * 
     * 
     * @param u
     * @return
     */
    public static byte[] encodeUnsignedVarint(long u) {

        if (Long.compareUnsigned(0, u) <= 0 && Long.compareUnsigned(u, 253) < 0) {
            return ByteBuffer.allocate(1).put((byte) u).array();
        }
        if (Long.compareUnsigned(253, u) <= 0 && Long.compareUnsigned(u, 65536) < 0) {
            return ByteBuffer.allocate(3).put((byte) 253).putShort((short) u).array();
        }
        if (Long.compareUnsigned(65536, u) <= 0 && Long.compareUnsigned(u, 4294967296L) < 0) {
            return ByteBuffer.allocate(5).put((byte) 254).putInt((int) u).array();
        }
        if (Long.compareUnsigned(4294967296L, u) <= 0 && Long.compareUnsigned(u, -1) <= 0) {
            return ByteBuffer.allocate(9).put((byte) 255).putLong(u).array();
        }
        // dead code
        throw new IllegalArgumentException("varint cannot be >= 18446744073709551616");
    }

    public static ByteBuffer encodeVarintList(long[] u) {
        int capacity = 0;
        int length = u.length;
        if (length < 253) {
            capacity = 1;
        } else if (length <= 65535) {
            capacity = 3;
        } else if (Integer.compareUnsigned(length, -1) <= 0) {
            capacity = 5;
        }
        for (long l : u) {
            if (l < 253) {
                capacity += 1;
            } else if (l <= 65535) {
                capacity += 3;
            } else if (l <= 0xffffffffL) {
                capacity += 5;
            } else if (Long.compareUnsigned(length, 0xffffffffffffffffL) <= 0) {
                capacity += 9;
            }
        }
        var buffer = ByteBuffer.allocate(capacity);
        if (length < 253) {
            buffer.put((byte) length);
        } else if (length <= 65535) {
            buffer.put((byte) 0xfd);
            buffer.putShort((short) length);
        } else if (Integer.compareUnsigned(length, -1) <= 0) {
            buffer.put((byte) 0xfe);
            buffer.putInt(length);
        }
        for (long l : u) {
            if (l < 253) {
                buffer.put((byte) l);
            } else if (l <= 65535) {
                buffer.put((byte) 0xfd);
                buffer.putShort((short) l);
            } else if (l <= 0xffffffffL) {
                buffer.put((byte) 0xfe);
                buffer.putInt((int) l);
            } else if (Long.compareUnsigned(length, 0xffffffffffffffffL) <= 0) {
                buffer.put((byte) 0xff);
                buffer.putLong(l);
            }
        }
        return buffer.flip();
    }

    public static ByteBuffer encodeVarintList(int[] entries) {
        long[] e = new long[entries.length];
        for (int i = 0; i < e.length; i++) {
            e[i] = (long) entries[i];
        }
        return encodeVarintList(e);
    }

    private Structs() {
    }

}
