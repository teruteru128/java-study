package com.twitter.teruteru128.encode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.nio.ByteBuffer;
import java.util.UUID;

/**
 * com.twitter.teruteru128.encode.UuidEncodeTest
 */
public class UuidEncodeTest {

    public static final UUID UUID = java.util.UUID.fromString("c61c9854-2913-4024-bde6-f141745d1712");

    @Test
    public void toBytesTest() {
        var bytes = UUIDEncode.toBytes(UUID);
        assertArrayEquals(new byte[]{-58, 28, -104, 84, 41, 19, 64, 36, -67, -26, -15, 65, 116, 93, 23, 18}, bytes);
    }

    @Test
    public void toBufferTest(){
        var bytes = UUIDEncode.toBuffer(UUID);
        assertEquals(ByteBuffer.wrap(new byte[]{-58, 28, -104, 84, 41, 19, 64, 36, -67, -26, -15, 65, 116, 93, 23, 18}), bytes);
    }
}
