package com.twitter.teruteru128.bitmessage;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
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
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

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
        var varintLength = Structs.encodeVarint(s.length);
        return ByteBuffer.allocate(s.length + varintLength.length).put(varintLength).put(s).array();
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
        var entriesArray = new byte[entries.length][];
        int sumoflength = count.length;
        for (int i = 0; i < entries.length; i++) {
            entriesArray[i] = Structs.encodeVarint(entries[i]);
            sumoflength += entriesArray[i].length;
        }
        var buffer = ByteBuffer.allocate(sumoflength).put(count);
        for (var entry : entriesArray) {
            buffer.put(entry);
        }
        return buffer.array();
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
        var c = Arrays.copyOf(command, 12);
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
            return ByteBuffer.allocate(ONION_DOMAIN_PREFIX.length + decodedsld.length).put(ONION_DOMAIN_PREFIX).put(decodedsld).array();
        }
        if (host.getAddress() instanceof Inet4Address) {
            return ByteBuffer.allocate(16).put(IPV4_MAPPED_IPV6_ADDRESS_PREFIX).put(host.getAddress().getAddress())
                    .array();
        }
        // host.getAddress() instanceof Inet6Address
        return host.getAddress().getAddress();
    }

    public static boolean checkSocksIP(InetSocketAddress remote) {
        return false;
    }

    public static final long NODE_NETWORK = 1;
    public static final long NODE_SSL = 2;
    public static final long NODE_POW = 4;
    public static final long NODE_DANDELION = 8;

    public static byte[] assembleVersionMessage(InetSocketAddress remote, int[] participatingStreams, boolean server,
            long nodeid) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream(0);
        try (DataOutputStream dos = new DataOutputStream(baos)) {
            // version
            dos.writeInt(3);
            // service
            dos.writeLong(NODE_NETWORK | NODE_SSL);
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
            dos.write(new byte[] { 127, 0, 0, 1 });
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
        long nonce = ThreadLocalRandom.current().nextLong();
        var m = MessageDigest.getInstance("SHA-512");
        // C言語の場合だと13バイト確保しておかないと危険ってことか？
        var command = new byte[12];
        var checksum = new byte[4];
        var hash = new byte[64];
        {
            var out = socket.getOutputStream();
            var in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            out.write(
                    assembleVersionMessage((InetSocketAddress) socket.getRemoteSocketAddress(), new int[] { 1 }, false,
                            nonce));

            for (int i = 0; i < 2; i++) {
                var magic = in.readInt();
                System.out.printf("%08x%n", magic);
                Arrays.fill(command, (byte) 0);
                in.read(command, 0, 12);
                var len = command.length;
                while ((0 < len) && (command[len - 1] & 0xff) < ' ') {
                    len--;
                }
                System.out.println(new String(command, 0, len).trim());
                var length = in.readInt();
                in.read(checksum, 0, 4);
                var payload = new byte[length];
                in.readNBytes(payload, 0, length);
                m.update(payload);
                m.digest(hash, 0, 64);
                if (MessageDigest.isEqual(checksum, Arrays.copyOf(hash, 4))) {
                    System.out.println("checksum ok");
                } else {
                    System.out.println("checksum ng");
                }
            }
            // verack送信
            out.write(createPacket("verack".getBytes()));
        }
        {
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
            var start = Instant.now();
            sslSocket.startHandshake();
            var finish = Instant.now();
            System.out.printf("ssl handshake: %s%n", Duration.between(start, finish));
            socket = sslSocket;
        }
        {
            // var out = socket.getOutputStream();
            var in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            // addr
            int magic = in.readInt();
            in.read(command, 0, 12);
            System.out.println(new String(command).trim());
            int length = in.readInt();
            System.out.printf("length: %d%n", length);
            in.read(checksum);
            ArrayList<NetworkAddress> addresses = new ArrayList<NetworkAddress>();
            {
                var payloadBuffer = ByteBuffer.allocate(length);
                var payload = payloadBuffer.array();
                in.readNBytes(payload, 0, length);
                m.update(payload);
                m.digest(hash, 0, 64);
                if (MessageDigest.isEqual(checksum, Arrays.copyOf(hash, 4))) {
                    System.out.println("checksum ok!");
                } else {
                    System.out.println("checksum NG!");
                }
                payloadBuffer.rewind();
                int offset = 1;
                int count = payloadBuffer.get() & 0xff;
                if (count == 254) {
                    count = payloadBuffer.getInt();
                    offset += 4;
                }
                if (count == 253) {
                    count = payloadBuffer.getShort();
                    offset += 2;
                }
                System.out.printf("count: %d%n", count);
                NetworkAddress address2;
                addresses.ensureCapacity(count);
                for (int i = 0; i < count; i++) {
                    address2 = NetworkAddress.newInstance(payload, offset + i * 38, 38);
                    addresses.add(address2);
                }
                int size = addresses.size();
                System.out.printf("count: %d, list size: %d, %s%n", count, size, count == size ? "OK" : "NG");
            }
            var addrp = new Packet(new PacketHeader(magic, command.clone(), length, checksum.clone()),
                    Optional.of(new Addr(addresses)));
            // inv
            magic = in.readInt();
            in.read(command);
            length = in.readInt();
            System.out.printf("length: %d%n", length);
            in.read(checksum);
            var vectors = new ArrayList<InventoryVector>();
            {
                var payloadBuffer = ByteBuffer.allocate(length);
                var payload = payloadBuffer.array();
                in.readNBytes(payload, 0, length);
                m.update(payload);
                m.digest(hash, 0, 64);
                if (MessageDigest.isEqual(checksum, Arrays.copyOf(hash, 4))) {
                    System.out.println("checksum ok!");
                } else {
                    System.out.println("checksum NG!");
                }
                int count = payloadBuffer.get() & 0xff;
                int offset = 1;
                if (count == 254) {
                    count = payloadBuffer.getInt();
                    offset += 4;
                }
                if (count == 253) {
                    count = payloadBuffer.getShort();
                    offset += 2;
                }
                System.out.printf("count: %d%n", count);
                byte[] inv_vect = new byte[32];
                vectors.ensureCapacity(count);
                for (int i = 0; i < count; i++) {
                    System.arraycopy(payload, offset + i * 32, inv_vect, 0, 32);
                    vectors.add(new InventoryVector(inv_vect.clone()));
                }
                int size = vectors.size();
                System.out.printf("count: %d, list size: %d, %s%n", count, size, count == size ? "OK" : "NG");
            }
            var invp = new Packet(new PacketHeader(magic, command, length, checksum), Optional.of(new Inv(vectors)));
        }
        socket.close();
    }

    public static boolean verify(byte[] data, byte[] sign, byte[] pubkey) {
        return false;
    }

    public static final int OBJECT_GETPUBKEY = 0;
    public static final int OBJECT_PUBKEY = 1;
    public static final int OBJECT_MSG = 2;
    public static final int OBJECT_BROADCAST = 3;
    public static final int OBJECT_ONIONPEER = 0x746f72;
    public static final int OBJECT_I2P = 0x493250;
    public static final int OBJECT_ADDR = 0x61646472;

}
