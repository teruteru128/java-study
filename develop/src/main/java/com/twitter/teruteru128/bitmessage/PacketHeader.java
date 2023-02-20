package com.twitter.teruteru128.bitmessage;

import java.nio.ByteBuffer;

public record PacketHeader(int magic, byte[] command, int length, byte[] checksum) {

    public static PacketHeader newInstance(byte[] b) {
        if (b == null || b.length != 24) {
            return null;
        }
        var buffer = ByteBuffer.wrap(b);
        var magic = buffer.getInt();
        var command = new byte[12];
        buffer.get(command);
        var length = buffer.getInt();
        var checksum = new byte[4];
        buffer.get(checksum);
        return new PacketHeader(magic, command, length, checksum);
    }

    boolean isValid() {
        return magic == 0xE9BEB4D9;
    }
}
