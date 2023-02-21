package com.twitter.teruteru128.bitmessage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.time.Instant;
import java.util.Arrays;

import org.apache.commons.codec.binary.Base32;

public record NetworkAddress(Instant time, int stream, long services, InetSocketAddress address) {

    /**
     * 
     * @param a
     * @return
     */
    public static NetworkAddress newInstance(byte[] a) {
        return newInstance(a, 0, a.length);
    }

    public static NetworkAddress newInstance(byte[] a, int offset, int length) {
        var work = ByteBuffer.wrap(a, offset, length);
        var time = Instant.ofEpochSecond(work.getLong());
        var stream = work.getInt();
        var services = work.getLong();
        work.mark();
        var prefix = new byte[6];
        work.get(prefix);
        InetSocketAddress address = null;
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
        return new NetworkAddress(time, stream, services, address);
    }

}
