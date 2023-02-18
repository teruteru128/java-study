package com.twitter.teruteru128.bitmessage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.time.Instant;
import java.util.Arrays;

import org.apache.commons.codec.binary.Base32;

public class NetworkAddress {

    Instant time;
    int stream;
    long services;
    InetSocketAddress address;

    public NetworkAddress(byte[] a) {
        var work = ByteBuffer.wrap(a);
        this.time = Instant.ofEpochSecond(work.getLong());
        this.stream = work.getInt();
        this.services = work.getLong();
        work.mark();
        var prefix = new byte[6];
        work.get(prefix);
        if (Arrays.equals(prefix, 0, 6, Protocol.ONION_DOMAIN_PREFIX, 0, 6)) {
            var host = new byte[10];
            work.get(host);
            address = InetSocketAddress.createUnresolved(
                    new Base32().encodeAsString(host).toLowerCase() + ".onion", stream);
        } else {
            work.reset();
            var addr = new byte[16];
            work.get(addr);
            int port = work.getShort() & 0xffff;
            try {
                address = new InetSocketAddress(InetAddress.getByAddress(addr), port);
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
        }
    }

}
