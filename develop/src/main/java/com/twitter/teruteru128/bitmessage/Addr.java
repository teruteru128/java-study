package com.twitter.teruteru128.bitmessage;

import java.util.List;

public record Addr(List<Object> addrList) implements PacketPayload {

}
