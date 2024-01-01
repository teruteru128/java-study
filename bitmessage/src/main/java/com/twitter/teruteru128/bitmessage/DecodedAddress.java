package com.twitter.teruteru128.bitmessage;

public record DecodedAddress(int addressVersionNumber, int streamNumber, byte[] ripe) {
}
