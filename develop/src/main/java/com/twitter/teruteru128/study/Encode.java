package com.twitter.teruteru128.study;

import java.nio.ByteBuffer;
import java.util.UUID;

public class Encode {

    public static byte[] uuidToBytes(UUID uuid) {
        return uuidToBuffer(uuid).array();
    }

    // FIXME 抽象化のやり方を間違ってる気がする
    private static ByteBuffer uuidToBuffer(UUID uuid) {
        return ByteBuffer.allocate(16).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).flip();
    }

}
