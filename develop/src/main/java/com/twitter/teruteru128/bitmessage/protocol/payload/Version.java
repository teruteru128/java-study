package com.twitter.teruteru128.bitmessage.protocol.payload;

public record Version(int version, long services, long timestamp, Object recvAddr, Object fromAddr, long nonce,
        String userAgent, long[] streamNumbers) implements PacketPayload {

}
