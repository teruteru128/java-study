package com.twitter.teruteru128.bitmessage;

public record MessageObject(long nonce, long expiresTime, int objectType, long version, long streamNumber, Object payloadObject) implements PacketPayload {

}
