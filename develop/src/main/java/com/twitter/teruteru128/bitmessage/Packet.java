package com.twitter.teruteru128.bitmessage;

import java.io.Serializable;
import java.util.Optional;

public record Packet(PacketHeader header, Optional<? extends PacketPayload> payload) implements Serializable {

}
