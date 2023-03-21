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
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;

import org.apache.commons.codec.binary.Base32;
import org.bouncycastle.jce.interfaces.ECPublicKey;

import com.twitter.teruteru128.encode.Base58;
import com.twitter.teruteru128.study.DecodedAddress;

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
            return ByteBuffer.allocate(ONION_DOMAIN_PREFIX.length + decodedsld.length).put(ONION_DOMAIN_PREFIX)
                    .put(decodedsld).array();
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

    public static byte[] assembleVersionMessage(InetSocketAddress remote, int[] participatingStreams, boolean server,
            long nodeid) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream(0);
        try (DataOutputStream dos = new DataOutputStream(baos)) {
            // version
            dos.writeInt(3);
            // service
            dos.writeLong(Service.NODE_NETWORK | Service.NODE_SSL);
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

    /**
     * 「コマンドを1件受信してチェックサムをチェックして処理キューに追加するタスク」とそれを発行するタスク？
     * 
     * run() {
     * コネクションオブジェクトからdatainputstreamを取得
     * パケットのヘッダーを読み取り
     * ペイロード読み取り
     * チェックサムチェック
     * パケット処理キューに追加
     * 自分自身をexecutorservice(newworkstealingpool)に追加
     * }
     * 
     * @throws Exception
     */
    public static void connect() throws Exception {
        var ctx = SSLContext.getDefault();
        var factory = ctx.getSocketFactory();

        var address = new InetSocketAddress("localhost", 8444);
        var socket = new Socket();
        socket.connect(address);
        long nonce = ThreadLocalRandom.current().nextLong();
        var m = MessageDigest.getInstance("SHA-512");
        // C言語の場合だと13バイト確保しておかないと危険ってことか？
        int magic = 0;
        var command = new byte[12];
        var checksum = new byte[4];
        var hash = new byte[64];
        {
            var out = socket.getOutputStream();
            var in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            // addr送信
            out.write(
                    assembleVersionMessage((InetSocketAddress) socket.getRemoteSocketAddress(), new int[] { 1 }, false,
                            nonce));

            for (int i = 0; i < 2; i++) {
                // verackとaddr受信
                magic = in.readInt();
                System.out.printf("%08x%n", magic);
                Arrays.fill(command, (byte) 0);
                in.read(command, 0, 12);
                var len = command.length;
                // 手動trim
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
            var suites = parameters.getCipherSuites();
            // TLS_ECDH_anon_WITH_AES_256_CBC_SHA is usually disabled, so you need to change
            // your system settings.
            if (!com.twitter.teruteru128.util.Arrays.contains(suites, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA")) {
                int newLength = suites.length + 1;
                suites = Arrays.copyOf(suites, newLength);
                suites[newLength - 1] = "TLS_ECDH_anon_WITH_AES_256_CBC_SHA";
                parameters.setCipherSuites(suites);
                sslSocket.setSSLParameters(parameters);
            }
            var start = System.currentTimeMillis();
            sslSocket.startHandshake();
            var finish = System.currentTimeMillis();
            System.out.printf("ssl handshake: %s%n", Duration.ofMillis(finish - start));
            socket = sslSocket;
        }
        {
            // var out = socket.getOutputStream();
            var in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            // addr
            magic = in.readInt();
            Arrays.fill(command, (byte) 0);
            in.read(command, 0, 12);
            var cv = new String(command).trim();
            System.out.println(new String(command).trim());
            int length = in.readInt();
            System.out.printf("length: %d%n", length);
            in.read(checksum);
            ArrayList<NetworkAddress> addresses = new ArrayList<NetworkAddress>();
            addrprocess: {
                var payloadBuffer = ByteBuffer.allocate(length);
                var payload = payloadBuffer.array();
                in.readNBytes(payload, 0, length);
                m.update(payload);
                m.digest(hash, 0, 64);
                if (MessageDigest.isEqual(checksum, Arrays.copyOf(hash, 4))) {
                    System.out.println("checksum ok!");
                } else {
                    System.out.println("checksum NG! skippning...");
                    break addrprocess;
                }
                payloadBuffer.rewind();
                // decode varint
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
                addresses.ensureCapacity(count);
                for (int i = 0; i < count; i++) {
                    addresses.add(NetworkAddress.newInstance(payload, offset + i * 38, 38));
                }
                int size = addresses.size();
                System.out.printf("count: %d, list size: %d, %s%n", count, size, count == size ? "OK" : "NG");
            }
            var addrp = new Packet(new PacketHeader(magic, cv, length, checksum.clone()),
                    Optional.of(new Addr(addresses)));
            // inv
            magic = in.readInt();
            in.read(command);
            cv = new String(command).trim();
            length = in.readInt();
            System.out.printf("length: %d%n", length);
            in.read(checksum);
            var vectors = new ArrayList<InventoryVector>();
            invprocess: {
                var payloadBuffer = ByteBuffer.allocate(length);
                var payload = payloadBuffer.array();
                in.readNBytes(payload, 0, length);
                m.update(payload);
                m.digest(hash, 0, 64);
                if (MessageDigest.isEqual(checksum, Arrays.copyOf(hash, 4))) {
                    System.out.println("checksum ok!");
                } else {
                    System.out.println("checksum NG! skippning...");
                    break invprocess;
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
            var invp = new Packet(new PacketHeader(magic, cv, length, checksum), Optional.of(new Inv(vectors)));
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

    /**
     * BMのPoWで使う
     * 
     * @param length
     * @param ttl
     * @param proofOfWorkNonceTrialsPerByte
     * @param payloadLengthExtraBytes
     * @return
     */
    private static long calcTarget(int length, int ttl, int proofOfWorkNonceTrialsPerByte,
            int payloadLengthExtraBytes) {
        return (long) (0x1p64 / (proofOfWorkNonceTrialsPerByte
                * (length + 8 + payloadLengthExtraBytes + ((ttl * (length + 8 + payloadLengthExtraBytes)) / 0x1p16))));
    }

    /**
     * @see {@link https://github.com/Bitmessage/PyBitmessage/blob/3d19c3f23fad2c7a26e8606cd95c6b3df417cfbc/src/helper_ackPayload.py#L13}
     * @param streamNumber
     * @param stealthLevel
     * @return
     */
    public static byte[] genAckPayload(int streamNumber, int stealthLevel) {
        byte[] ackdata = null;
        int acktype = 0;
        int version = 0;
        Random random = (Random) RandomGenerator.of("SecureRandom");
        switch (stealthLevel) {
            case 1:
                ackdata = new byte[32];
                random.nextBytes(ackdata);
                acktype = 0; // getpubkey
                version = 4;
                break;

            case 2:
                ECPublicKey key = ECIES.generateEcPublicKey();
                int len = ThreadLocalRandom.current().nextInt(234, 801);
                byte[] dummyMessage = new byte[len];
                random.nextBytes(dummyMessage);
                ackdata = ECIES.encrypt(dummyMessage, key);
                acktype = 2; // message
                version = 1;
                break;

            default:
                ackdata = new byte[32];
                random.nextBytes(ackdata);
                acktype = 2; // message
                version = 1;
                break;
        }
        byte[] ackTypeBuffer = new byte[4];
        ackTypeBuffer[0] = (byte) (acktype >>> 24);
        ackTypeBuffer[1] = (byte) (acktype >>> 16);
        ackTypeBuffer[2] = (byte) (acktype >>> 8);
        ackTypeBuffer[3] = (byte) (acktype >>> 0);
        byte[] versionBuffer = Structs.encodeVarint(version);
        byte[] streamNumberBuffer = Structs.encodeVarint(streamNumber);
        byte[] result = new byte[ackTypeBuffer.length + versionBuffer.length + streamNumberBuffer.length
                + ackdata.length];
        int resultOffset = 0;
        System.arraycopy(ackTypeBuffer, 0, result, resultOffset, ackTypeBuffer.length);
        resultOffset += ackTypeBuffer.length;
        System.arraycopy(versionBuffer, 0, result, resultOffset, versionBuffer.length);
        resultOffset += versionBuffer.length;
        System.arraycopy(streamNumberBuffer, 0, result, resultOffset, streamNumberBuffer.length);
        resultOffset += streamNumberBuffer.length;
        System.arraycopy(ackdata, 0, result, resultOffset, ackdata.length);
        resultOffset += ackdata.length;
        return result;
    }

    public static DecodedAddress decodeAddress(String address) {
        address = address.strip();
        byte[] data = null;
        if (address.substring(0, 3).equals("BM-")) {
            data = Base58.decode(address.substring(3));
        } else {
            data = Base58.decode(address);
        }
        byte[] checksum = Arrays.copyOfRange(data, data.length - 4, data.length);
        byte[] hash = new byte[64];
        try {
            MessageDigest sha512 = MessageDigest.getInstance("sha-512");
            sha512.update(data, 0, data.length - 4);
            sha512.digest(hash, 0, 64);
            sha512.update(hash, 0, 64);
            sha512.digest(hash, 0, 64);
        } catch (NoSuchAlgorithmException | DigestException e) {
            throw new InternalError(e);
        }
        if (!MessageDigest.isEqual(checksum, Arrays.copyOf(hash, 4))) {
            return null;
        }
        VarintTupple addressVersionNumnerTupple = null;
        try {
            addressVersionNumnerTupple = VarintTupple.newInstance(data, 0, 9);
        } catch (VarintDecodeException e) {
            return null;
        }
        int addressVersionNumner = (int) addressVersionNumnerTupple.value();
        if (addressVersionNumner > 4) {
            return null;
        } else if (addressVersionNumner == 0) {
            return null;
        }
        VarintTupple streamNumberTupple = null;
        try {
            streamNumberTupple = VarintTupple.newInstance(data, addressVersionNumnerTupple.length(), 9);
        } catch (VarintDecodeException e) {
            return null;
        }
        int streamNumber = (int) streamNumberTupple.value();
        if (addressVersionNumner == 1) {
        } else if (addressVersionNumner == 2 || addressVersionNumner == 3) {
            var trimedripe = Arrays.copyOfRange(data,
                    addressVersionNumnerTupple.length() + streamNumberTupple.length(),
                    data.length - 4);
            var ripe = new byte[20];
            System.arraycopy(trimedripe, 0, ripe, 20 - trimedripe.length, trimedripe.length);
            return new DecodedAddress(addressVersionNumner, streamNumber, ripe);
        } else if (addressVersionNumner == 4) {
            var trimedripe = Arrays.copyOfRange(data,
                    addressVersionNumnerTupple.length() + streamNumberTupple.length(),
                    data.length - 4);
            var ripe = new byte[20];
            System.arraycopy(trimedripe, 0, ripe, 20 - trimedripe.length, trimedripe.length);
            return new DecodedAddress(addressVersionNumner, streamNumber, ripe);
        }
        return null;
    }

}
