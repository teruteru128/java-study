package com.twitter.teruteru128.bitmessage;

import org.apache.commons.codec.binary.Base32;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.Arrays;

public class NetworkAddressFactory {

    private static final Logger logger = LoggerFactory.getLogger(NetworkAddressFactory.class);

    /**
     * @param a
     * @return
     */
    public static NetworkAddress newInstance(byte[] a) {
        return newInstance(a, 0, a.length);
    }

    // TODO ファクトリーメソッドに移動する
    public static NetworkAddress newInstance(byte[] a, int offset, int length) {
        var work = ByteBuffer.wrap(a, offset, length);
        var time = Instant.ofEpochSecond(work.getLong());
        var stream = work.getInt();
        var services = work.getLong();
        var addr = new byte[16];
        work.get(addr);
        InetSocketAddress address = null;
        int port = work.getShort() & 0xffff;
        if (Arrays.equals(addr, 0, 6, Protocol.ONION_DOMAIN_PREFIX, 0, 6)) {
            String onionAddress = new String(new Base32().encode(addr, 6, 10), StandardCharsets.UTF_8).toLowerCase()
                    + ".onion";
            address = InetSocketAddress.createUnresolved(onionAddress, port);
        } else {
            try {
                address = new InetSocketAddress(InetAddress.getByAddress(addr), port);
            } catch (UnknownHostException e) {
                logger.error("", e);
            }
        }
        return new NetworkAddress(time, stream, services, address);
    }

}
