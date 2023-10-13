package com.twitter.teruteru128.bitmessage.protocol.payload;

import java.net.InetSocketAddress;

public record Version(int version, long services, long timestamp, InetSocketAddress recvAddr,
                InetSocketAddress fromAddr, long nonce, String userAgent, int[] streamNumbers)
                implements PacketPayload {

}
