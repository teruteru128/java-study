package com.twitter.teruteru128.study;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.util.Arrays;

import com.twitter.teruteru128.bitmessage.Structs;

/**
 * Main
 * 秘密鍵かな？
 * ioxhJc1lIE2m+WFdBg3ieQb6rk8sSvg3wRv/ImJz2tc=
 * cm2E2vmE0Nd8aVP/4Ph2S1R6C5bkC1H7CiUBzbcDG3U=
 * BixgbLYk35GP+XHYdK/DgSWIUXyCTwCwEtY4h/G22dw=
 * BH4RDmdo0Yq0Ftiw0lm9ej5BmpZ35kEw2kaWZlZ0Do8=
 * lMhxDh6RPpWOsnJMeS12pTJ/j7EPn+ugpdbNQCGbiwc=
 * 9hZn+KDlwjgrbyFpaX5ibuaO4QfaFbIL79NUrwJlcRQ=
 * T+tDF4I700WFkFhGieYxWgQKPO/MDcntDYzMrqQSZjzwV2DzaI1OM/CsJWE30WBqMI1SxbEQHufR1A76I7ayWN==
 * nySkaCQxGErccmiqLznSQduXgFICpjnl2bo7n3FAhQMlku79plIeL85/etpN865GAnlUpErSppEYHvn4couGh3==
 * ns2bQQ4zlnfcCTSAxEH3gDDYHcBswKw92jQeEgm+9tse74XdX+LNwgfw7OsMUjOGtLMb7R/kXNRXYv1AHi71iV==
 * NxhJ5JwWhUtUccCfJNtVqzdpCMGOaAtknmcEKLyglZFNXE66EiFi9wPFekwekx3ln8m9v5wnfv7V8jSrpZ/SHQ==
 * +3n5qDbtpicXBy+Yyol/TJkg2IoQ01vZ/U2SvgpP+Fdm4DrIYngY7X0ZS53rc/KKIHT//jVqNwNBz1sGFyYUDg==
 * cLtHGFI7X/Xl6Ly03DczMzl2bsHJmI2BMQKKCckUek5vTIiltDPfT3PxdT6zxW1LzwVqJIsQEkxxPNTswgpSFg==
 * pMQBNF+F12AXT3T0mQq7S0l1VcCr/Dw2Q54zeuHH0/1ExLgbhHEsmAHf3WR9nK/Ku1Mc/eU3vaAO78yplJB76A==
 * QUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQQ==
 * D8BH6DLNJekZ5jiiIVSnyS5ziE9XJSRG5bA9OdiFdjee6HTxHxFQXyEQdhfN+E69RKToLYXGDxK2X9v9eEcbUxdSp9tbptXegxkNQgIxg97BAq9gtmxPm4Ebngl/Q/I4
 * cLJlMSoCYBgR0d/bg7zG1B77BBWy7f1KLiJG5b8mPmlD8dAJKCZSEFRdWLuxSyRjgFFeiMm4+l+2SNIhL/SBma7ABhg232DeJkbUcZJKqBfAI9taPQ5Y9bwIXrcjxqMx
 * clock_gettimeを使って取得した時刻からtv_nsecの下1バイトを集めたやつ
 * ojHbK3vBB70XXaPfJWun7TNvtfs3fcP/RYvHDXvLB2Gn7SlvtfE3fbn/RYHHDV2j6SVrsfczebX7QX3DCWOf5Q==
 * b4Ohtcnd8QUZLUtfc4ebr83h9QknRVltgZWzx9vvAxc1SV1xhaO3y9/9ESU5V2t/k7HF2e0LHzNHW2+DobXJ3Q==
 * KEZaboKWqr7S5voYLEBUaHyQpLjM6v4SJjpOYnaUqLzQ5PgMIDRIZnqOorbK3vIGGjhMYHSInLDE2PYKHjJGWg==
 * hZmtwdXp/RElOVdrf5Onu8/j9wspPVFleY2htcnd8Q8jN0tfc4ebr8PX9QkdMUVZbYGVqcfb7wMXKz9TZ3uPrQ==
 * btRLuN4FP1H9vF3/ES0LPL757PPmfNY5xuIJszbhRFbiyxC7ADqoNVFjFVFOvM5Qs+QUEUsVl5RywYzvFXE1og==
 * 1bit右シフトしてみた。そのままだと1byteが奇数しか出ないっぽい
 * pQicBD8LZAewO48VT8ZlBGwZcsaDIhDSZ+iCNL9jII1Y95v+deF7z0auNNddtiOBwR5y5H4TolDldaYh2UuVSA==
 * Ya/piNyZ969sH/qUEPDazlnQVgRnbyLGN6RI+4YvGZoHGdbPw3tgQDktJs9pXYhF+KZoFo0T/bBjZuxUAmCqWA==
 * mgbBWuOBHpn/wEm10SiPBZgiulzISK44ngU/m/14uzvTrIXrKlqeDnq5ONvwM6TyYsQwM2dP4wR5/shIxymU4g==
 */
public class Main {

    final static byte[] PREFIX_MAGIC_NUMBER = { -23, -66, -76, -39 };
    private static byte[] IPV4_MAPPED_IPV6_ADDRESS_PREFIX = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -128, -128 };

    public static byte[] networkAddress(long services, InetSocketAddress address) {
        var ad = address.getAddress();
        var buffer = ByteBuffer.allocate(26).putLong(services);
        if (ad instanceof Inet4Address) {
            buffer.put(IPV4_MAPPED_IPV6_ADDRESS_PREFIX).put(ad.getAddress());
        } else if (ad instanceof Inet6Address) {
            buffer.put(ad.getAddress());
        }
        buffer.putShort((short) address.getPort());
        return buffer.array();
    }

    public static byte[] networkAddress(long epoch, int stream, long service, InetSocketAddress address) {
        var ad = address.getAddress();
        var buffer = ByteBuffer.allocate(38).putLong(epoch).putInt(stream).putLong(service);
        if (ad instanceof Inet4Address) {
            buffer.put(IPV4_MAPPED_IPV6_ADDRESS_PREFIX).put(ad.getAddress());
        } else if (ad instanceof Inet6Address) {
            buffer.put(ad.getAddress());
        }
        buffer.putShort((short) address.getPort());
        return buffer.array();
    }

    public static byte[] encodeVarStr(String string) {
        var s = string.getBytes();
        var length = Structs.encodeVarint(s.length);
        var ret = new byte[s.length + length.length];
        System.arraycopy(length, 0, ret, 0, length.length);
        System.arraycopy(s, 0, ret, length.length, s.length);
        return ret;
    }

    public static byte[] encodeVarIntList(int[] entries) {
        long[] e = new long[entries.length];
        for (int i = 0; i < e.length; i++) {
            e[i] = (long) entries[i];
        }
        return encodeVarIntList(e);
    }

    public static byte[] encodeVarIntList(long[] entries) {
        var count = Structs.encodeVarint(entries.length);
        var e = new byte[entries.length][];
        int sumoflength = count.length;
        for (int i = 0; i < entries.length; i++) {
            e[i] = Structs.encodeVarint(entries[i]);
            sumoflength += e[i].length;
        }
        var ret = new byte[sumoflength];
        System.arraycopy(count, 0, ret, 0, e.length);
        int subtotal = e.length;
        for (int i = 0; i < entries.length; i++) {
            System.arraycopy(e[i], 0, ret, subtotal, e[i].length);
            subtotal += e[i].length;
        }
        return ret;
    }

    public static byte[] createPacket(byte[] command) {
        return createPacket(command, new byte[0]);
    }

    public static byte[] createPacket(byte[] command, byte[] payload) {
        int payloadLength = payload.length;
        byte[] checksum = null;
        MessageDigest sha512 = null;
        try {
            sha512 = MessageDigest.getInstance("SHA-512");
        } catch (NoSuchAlgorithmException e) {
            throw new InternalError(e);
        }
        checksum = Arrays.copyOf(sha512.digest(payload), 4);
        var b = ByteBuffer.allocate(24 + payloadLength).putInt(0xE9BEB4D9).put(command).position(16)
                .putInt(payloadLength).put(checksum).put(payload).array();

        return b;
    }

    private static final byte[] ONION_DOMAIN_PREFIX = new byte[] { -3, -121, -40, 126, -21, 67 };

    public static byte[] encodeHost(InetSocketAddress host) {
        var hostname = host.getHostString();
        if (hostname.endsWith(".onion")) {
            // base32.decode(host)
            return ONION_DOMAIN_PREFIX;
        }
        if (hostname.indexOf(":") == -1) {
            var b = new byte[16];
            System.arraycopy(IPV4_MAPPED_IPV6_ADDRESS_PREFIX, 0, b, 0, 12);
            System.arraycopy(host.getAddress().getAddress(), 0, b, 12, 4);
            return b;
        }
        return host.getAddress().getAddress();
    }

    public static byte[] assembleVersionMessage(InetSocketAddress remote) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream(0);
        try (DataOutputStream dos = new DataOutputStream(baos)) {
            dos.writeInt(3);
            dos.writeLong(3);
            dos.writeLong(Instant.now().getEpochSecond());
            dos.writeLong(1);
            dos.write(encodeHost(remote));
        } catch (IOException e) {
        }
        return baos.toByteArray();
    }

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        /*
         * var address = InetSocketAddress.createUnresolved("localhost", 8444);
         * var socket = new Socket();
         * socket.connect(address);
         * int protocolVersion = 3;
         * int services = 0x3;
         * long timestamp = Instant.now().getEpochSecond();
         * var recvaddr = networkAddress(services, (InetSocketAddress)
         * socket.getRemoteSocketAddress());
         * var fromaddr = networkAddress(services, (InetSocketAddress)
         * socket.getLocalSocketAddress());
         * long nonce = ThreadLocalRandom.current().nextLong();
         * byte[] userAgent = encodeVarStr("/Sample-lib:1.0.0/");
         * byte[] streamNumbers = encodeVarIntList(new long[] { 1 });
         * var messagePayload = ByteBuffer.allocate(72 + userAgent.length +
         * streamNumbers.length).putInt(protocolVersion)
         * .putLong(0x3)
         * .putLong(timestamp).put(recvaddr).put(fromaddr).putLong(nonce).put(userAgent)
         * .put(streamNumbers)
         * .array();
         * MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
         * var hash = sha512.digest(messagePayload);
         * byte[] command = new byte[12];
         * var v = "version".getBytes();
         * System.arraycopy(command, 0, v, 0, v.length);
         * var msg = ByteBuffer.allocate(24 +
         * messagePayload.length).put(PREFIX_MAGIC_NUMBER).put(v).put(hash, 0, 4)
         * .put(messagePayload).array();
         * var out = socket.getOutputStream();
         * out.write(msg);
         * byte[] buf = new byte[8192];
         * var in = new BufferedInputStream(socket.getInputStream());
         * var r = in.read(buf);
         * var factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
         * var sslSocket = (SSLSocket) factory.createSocket(socket,
         * socket.getInetAddress().getHostAddress(),
         * socket.getPort(), true);
         * sslSocket.startHandshake();
         */
    }

}
