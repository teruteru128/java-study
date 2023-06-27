package com.twitter.teruteru128.bitmessage.protocol.payload;

import java.util.List;

import com.twitter.teruteru128.bitmessage.NetworkAddress;

public record Addr(List<NetworkAddress> addrList) implements PacketPayload {

}
