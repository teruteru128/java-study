package com.twitter.teruteru128.bitmessage;

import java.nio.ByteBuffer;

import com.twitter.teruteru128.bitmessage.protocol.Packet;
import com.twitter.teruteru128.bitmessage.protocol.PacketHeader;

public abstract class MessageFactory {
    public MessageFactory() {
        super();
    }

    public final Packet generatePacket(ByteBuffer buffer) {
        int magic = buffer.getInt();
        byte[] command = new byte[12];
        buffer.get(command);
        int commandlength = command.length;
        while ((0 < commandlength) && (command[commandlength - 1] & 0xff) < ' ') {
            commandlength--;
        }
        int payloadLength = buffer.getInt();
        byte[] checksum = new byte[4];
        buffer.get(checksum);
        return new Packet(new PacketHeader(magic, new String(command, 0, commandlength), payloadLength, checksum), null);
    }

}
