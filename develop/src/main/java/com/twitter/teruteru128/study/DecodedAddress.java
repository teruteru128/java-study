package com.twitter.teruteru128.study;

public record DecodedAddress(int addressVersionNumber, int streamNumber, byte[] ripe) {
}
