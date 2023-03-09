package com.twitter.teruteru128.bitmessage;

import java.io.Serializable;
import java.nio.ByteBuffer;

public record PacketHeader(int magic, String command, int length, byte[] checksum) implements Serializable {

    public static PacketHeader newInstance(byte[] b) {
        if (b == null || b.length != 24) {
            return null;
        }
        var buffer = ByteBuffer.wrap(b);
        var magic = buffer.getInt();
        var commandbuffer = new byte[12];
        buffer.get(commandbuffer);
        int len = commandbuffer.length;
        // 手動trim
        while ((0 < len) && (commandbuffer[len - 1] & 0xff) < ' ') {
            len--;
        }
        var command = new String(commandbuffer, 0, len);
        var length = buffer.getInt();
        var checksum = new byte[4];
        buffer.get(checksum);
        return new PacketHeader(magic, command, length, checksum);
    }

    boolean isValid() {
        return magic == 0xE9BEB4D9;
    }
}
