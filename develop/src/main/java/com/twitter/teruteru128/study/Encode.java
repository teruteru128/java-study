package com.twitter.teruteru128.study;

import java.nio.ByteBuffer;
import java.util.UUID;

public class Encode {

    public static byte[] uuidToBytes(UUID uuid) {
        return ByteBuffer.allocate(16).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits())
                .array();
    }
    
}
