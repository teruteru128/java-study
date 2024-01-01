package com.twitter.teruteru128.bitmessage.protocol.payload;

public record UnknownPacketPayload(byte[] payload) implements PacketPayload {

}
