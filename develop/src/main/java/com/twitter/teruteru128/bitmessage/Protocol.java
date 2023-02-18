package com.twitter.teruteru128.bitmessage;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.util.Arrays;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

import org.apache.commons.codec.binary.Base32;

public class Protocol {

    public final static byte[] PREFIX_MAGIC_NUMBER = { -23, -66, -76, -39 };
    public static byte[] IPV4_MAPPED_IPV6_ADDRESS_PREFIX = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -128, -128 };

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
        return Protocol.encodeVarIntList(e);
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
        return Protocol.createPacket(command, new byte[0]);
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

    public static final byte[] ONION_DOMAIN_PREFIX = new byte[] { -3, -121, -40, 126, -21, 67 };
    public static final Base32 base32 = new Base32();

    public static byte[] encodeHost(InetSocketAddress host) {
        var hostname = host.getHostString();
        if (hostname.endsWith(".onion")) {
            // second level domain
            var decodedsld = base32.decode(hostname.split(".")[0]);
            var ret = new byte[ONION_DOMAIN_PREFIX.length + decodedsld.length];
            System.arraycopy(ONION_DOMAIN_PREFIX, 0, ret, 0, ONION_DOMAIN_PREFIX.length);
            System.arraycopy(decodedsld, 0, ret, ONION_DOMAIN_PREFIX.length, decodedsld.length);
            return ret;
        }
        if (host.getAddress() instanceof Inet4Address) {
            var b = new byte[16];
            System.arraycopy(IPV4_MAPPED_IPV6_ADDRESS_PREFIX, 0, b, 0, 12);
            System.arraycopy(host.getAddress().getAddress(), 0, b, 12, 4);
            return b;
        }
        // host.getAddress() instanceof Inet6Address
        return host.getAddress().getAddress();
    }

    public static boolean checkSocksIP(InetSocketAddress remote) {
        return false;
    }

    public static byte[] assembleVersionMessage(InetSocketAddress remote, int[] participatingStreams, boolean server,
            long nodeid) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream(0);
        try (DataOutputStream dos = new DataOutputStream(baos)) {
            dos.writeInt(3);
            dos.writeLong(3);
            dos.writeLong(Instant.now().getEpochSecond());
            dos.writeLong(1);
            if (checkSocksIP(remote) && server) {
                var localhost = InetSocketAddress.createUnresolved("127.0.0.1", 8444);
                dos.write(encodeHost(localhost));
                dos.writeShort(localhost.getPort());
            } else {
                try {
                    dos.write(Arrays.copyOf(encodeHost(remote), 16));
                } catch (Exception e) {
                    var localhost = InetSocketAddress.createUnresolved("127.0.0.1", 8444);
                    dos.write(encodeHost(localhost));
                }
                dos.writeShort(remote.getPort());
            }
            dos.write(IPV4_MAPPED_IPV6_ADDRESS_PREFIX);
            dos.write(new byte[] { 127, 0, 0, 1 });
            dos.writeInt(8444);
            dos.writeLong(nodeid);
            var userAgent = "/Sample-lib:1.0.0/".getBytes(StandardCharsets.UTF_8);
            dos.write(Structs.encodeVarint(userAgent.length));
            dos.write(userAgent);
            dos.write(Structs.encodeVarint(participatingStreams.length));
            int count = 0;
            for (int b : participatingStreams) {
                dos.write(Structs.encodeVarint(b));
                count++;
                if (count >= 160000) {
                    break;
                }
            }
        } catch (IOException e) {
        }
        return createPacket("version".getBytes(), baos.toByteArray());
    }

    public static void connect() throws Exception {
        var address = InetSocketAddress.createUnresolved("localhost", 8444);
        var socket = new Socket();
        socket.connect(address);
        int protocolVersion = 3;
        int services = 0x3;
        long timestamp = Instant.now().getEpochSecond();
        var recvaddr = Protocol.networkAddress(services, (InetSocketAddress) socket.getRemoteSocketAddress());
        var fromaddr = Protocol.networkAddress(services, (InetSocketAddress) socket.getLocalSocketAddress());
        long nonce = java.util.concurrent.ThreadLocalRandom.current().nextLong();
        byte[] userAgent = Protocol.encodeVarStr("/Sample-lib:1.0.0/");
        byte[] streamNumbers = Protocol.encodeVarIntList(new long[] { 1 });
        var messagePayload = ByteBuffer.allocate(72 + userAgent.length +
                streamNumbers.length).putInt(protocolVersion)
                .putLong(0x3)
                .putLong(timestamp).put(recvaddr).put(fromaddr).putLong(nonce).put(userAgent)
                .put(streamNumbers)
                .array();
        var sha512 = MessageDigest.getInstance("SHA-512");
        var hash = sha512.digest(messagePayload);
        byte[] command = new byte[12];
        var v = "version".getBytes();
        System.arraycopy(command, 0, v, 0, v.length);
        var msg = ByteBuffer.allocate(24 +
                messagePayload.length).put(Protocol.PREFIX_MAGIC_NUMBER).put(v).put(hash, 0, 4)
                .put(messagePayload).array();
        var out = socket.getOutputStream();
        out.write(msg);
        byte[] buf = new byte[8192];
        var in = new BufferedInputStream(socket.getInputStream());
        var r = in.read(buf);
        var factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
        var sslSocket = (SSLSocket) factory.createSocket(socket,
                socket.getInetAddress().getHostAddress(),
                socket.getPort(), true);
        sslSocket.startHandshake();
    }

}
