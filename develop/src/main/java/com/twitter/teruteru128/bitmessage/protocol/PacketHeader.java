package com.twitter.teruteru128.bitmessage.protocol;

import java.nio.ByteBuffer;

public record PacketHeader(int magic, String command, int length, byte[] checksum) {

    public static PacketHeader newInstance(byte[] b) {
        if (b == null || b.length != 24) {
            return null;
        }
        var buffer = ByteBuffer.wrap(b);
        var magic = buffer.getInt();
        int offset = 4;
        int commandLength = 12;
        // 手動trim
        while ((0 < commandLength) && (b[offset + commandLength - 1] & 0xff) <= ' ') {
            commandLength--;
        }
        var command = new String(b, offset, commandLength);
        offset += 12;
        buffer.position(offset);
        var payloadLength = buffer.getInt();
        offset += 4;
        var checksum = new byte[4];
        System.arraycopy(b, offset, checksum, 0, 4);
        return new PacketHeader(magic, command, payloadLength, checksum);
    }

    boolean isValid() {
        return magic == 0xE9BEB4D9;
    }
}
