package com.twitter.teruteru128.encode;

import java.nio.ByteBuffer;
import java.util.UUID;

public class UUIDEncode {

    public static byte[] toBytes(UUID uuid) {
        return toBuffer(uuid).array();
    }

    // FIXME 抽象化のやり方を間違ってる気がする
    private static ByteBuffer toBuffer(UUID uuid) {
        return ByteBuffer.allocate(16).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).flip();
    }

}
