package com.twitter.teruteru128.bitmessage.protocol;

import java.io.Serializable;
import java.util.Optional;

import com.twitter.teruteru128.bitmessage.protocol.payload.PacketPayload;

public record Packet(PacketHeader header, Optional<? extends PacketPayload> payload) implements Serializable {

}
