package com.twitter.teruteru128.bitmessage;

public record UnknownPacketPayload(byte[] payload) implements PacketPayload {

}
