package com.twitter.teruteru128.bitmessage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.Arrays;

import org.apache.commons.codec.binary.Base32;

public record NetworkAddress(Instant time, int stream, long services, InetSocketAddress address) {

}
