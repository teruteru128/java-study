package com.twitter.teruteru128.bitmessage;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;

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
        var c = new byte[12];
        System.arraycopy(command, 0, c, 0, command.length);
        checksum = Arrays.copyOf(sha512.digest(payload), 4);
        var b = ByteBuffer.allocate(24 + payloadLength).putInt(0xE9BEB4D9).put(c)
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
            // version
            dos.writeInt(3);
            // service
            dos.writeLong(3);
            // timestamp
            dos.writeLong(Instant.now().getEpochSecond());
            // network service
            dos.writeLong(1);
            // network ip
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
            // network service
            dos.writeLong(1);
            // network ip
            dos.write(IPV4_MAPPED_IPV6_ADDRESS_PREFIX);
            dos.write(new byte[] { 127, 0, 0, 3 });
            dos.writeShort(8444);
            dos.writeLong(nodeid);
            var userAgent = "/SampleLib:1.0.0.0/".getBytes(StandardCharsets.UTF_8);
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
        var ctx = SSLContext.getDefault();
        var factory = ctx.getSocketFactory();

        var address = new InetSocketAddress("localhost", 8444);
        var socket = new Socket();
        socket.connect(address);
        long nonce = java.util.concurrent.ThreadLocalRandom.current().nextLong();
        var out = socket.getOutputStream();
        out.write(assembleVersionMessage((InetSocketAddress) socket.getRemoteSocketAddress(), new int[] { 1 }, false,
                nonce));
        var buffer = ByteBuffer.allocate(8192);
        var in = new BufferedInputStream(socket.getInputStream());
        {
            byte[] buf = buffer.array();
            var r = in.read(buf);
            buffer.limit(r);
        }
        var m = MessageDigest.getInstance("SHA-512");
        var command = new byte[12];
        var checksum = new byte[4];
        for (int i = 0; i < 2; i++) {
            var magic = buffer.getInt();
            System.out.printf("%08x%n", magic);
            buffer.get(command, 0, 12);
            System.out.println(new String(command));
            var length = buffer.getInt();
            buffer.get(checksum, 0, 4);
            var payload = new byte[length];
            buffer.get(payload);
            m.update(payload);
            var hash = m.digest();
            if (Arrays.equals(checksum, 0, 4, hash, 0, 4)) {
                System.out.println("checksum ok");
            } else {
                System.out.println("checksum ng");
            }
        }
        out.write(createPacket("verack".getBytes()));

        var remote = (InetSocketAddress) socket.getRemoteSocketAddress();
        var sslSocket = (SSLSocket) factory.createSocket(socket,
                remote.getHostName(),
                remote.getPort(), true);
        var parameters = sslSocket.getSSLParameters();
        var suites = new ArrayList<>(Arrays.asList(parameters.getCipherSuites()));
        // TLS_ECDH_anon_WITH_AES_256_CBC_SHA is usually disabled, so you need to change
        // your system settings.
        if (!suites.contains("TLS_ECDH_anon_WITH_AES_256_CBC_SHA")) {
            suites.add("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        }
        parameters.setCipherSuites(suites.toArray(String[]::new));
        sslSocket.setSSLParameters(parameters);
        sslSocket.startHandshake();
        out = sslSocket.getOutputStream();
        in = new BufferedInputStream(sslSocket.getInputStream());
        buffer.clear();
        int r = in.read(buffer.array());
        buffer.limit(r);
        buffer.getInt();
        buffer.get(command);
        System.out.println(new String(command));
        int length = buffer.getInt();
        System.out.printf("length: %d%n", length);
        buffer.get(checksum);
        var sha512 = MessageDigest.getInstance("sha512");
        var hash = new byte[64];
        {
            var payloadBuffer = ByteBuffer.allocate(length);
            var payload = payloadBuffer.array();
            var re = buffer.remaining();
            if (re < length) {
                buffer.get(payload, 0, re);
                in.read(payload, 0, length - re);
            } else {
                buffer.get(payload, 0, length);
            }
            sha512.update(payloadBuffer);
            sha512.digest(hash, 0, 64);
            if (Arrays.equals(checksum, 0, 4, hash, 0, 4)) {
                System.out.println("checksum ok!");
            } else {
                System.out.println("checksum NG!");
            }
            payloadBuffer.rewind();
            int count = payloadBuffer.get() & 0xff;
            if (count == 254) {
                count = payloadBuffer.getInt();
            }
            if (count == 253) {
                count = payloadBuffer.getShort();
            }
            System.out.printf("count: %d%n", count);
            var ad = new byte[38];
            NetworkAddress address2;
            var list = new ArrayList<NetworkAddress>(count);
            for (int i = 0; i < count; i++) {
                payloadBuffer.get(ad);
                for (int j = 0; j < 38; j++) {
                    System.out.printf("%02x", ad[j]);
                }
                System.out.println();
                address2 = new NetworkAddress(ad);
                list.add(address2);
                System.out.printf("%s:%d%n", address2.address.getHostString(), address2.address.getPort());
            }
        }
        // memmove
        {
            int pos = buffer.position();
            int ddddd = buffer.remaining() - buffer.position();
            var work = new byte[ddddd];
            System.arraycopy(buffer.array(), pos, work, 0, ddddd);
            System.arraycopy(work, 0, buffer.array(), 0, ddddd);
            in.read(buffer.array(), ddddd, buffer.capacity() - ddddd);
        }
        buffer.rewind();
        buffer.getInt();
        buffer.get(command);
        System.out.println(new String(command));
        length = buffer.getInt();
        System.out.printf("length: %d%n", length);
        buffer.get(checksum);
        buffer.mark();
        int count = buffer.get() & 0xff;
        if (count == 254) {
            count = buffer.getInt();
        }
        if (count == 253) {
            count = buffer.getShort();
        }
        buffer.reset();
        var payloadBuffer = ByteBuffer.allocate(length);
        var payload = payloadBuffer.array();
        int re = buffer.remaining();
        if (re < length) {
            buffer.get(payload, 0, re);
            int readlen = 0;
            int offset = re;
            int want = length - re;
            var buf = buffer.array();
            int w = 0;
            while (want > 0) {
                w = 8192;
                if(want < 8192){
                    w = want;
                }
                readlen = in.read(buf, 0, w);
                System.arraycopy(buf, 0, payload, offset, readlen);
                want -= readlen;
                offset += readlen;
                System.out.printf("loading... readlen: %d, want:%d%n", readlen, want);
            }
        } else {
            buffer.get(payload, 0, length);
        }
        sha512.update(payload);
        sha512.digest(hash, 0, 64);
        if (Arrays.equals(checksum, 0, 4, hash, 0, 4)) {
            System.out.println("checksum ok!");
        } else {
            System.out.println("checksum NG!");
        }
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < 32; j++) {
                System.out.printf("%02x", payload[i * 32 + j]);
            }
            System.out.println();
        }
        sslSocket.close();
    }

}
