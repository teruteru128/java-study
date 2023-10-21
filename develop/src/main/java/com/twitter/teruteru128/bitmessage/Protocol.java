package com.twitter.teruteru128.bitmessage;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
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
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

import org.apache.commons.codec.binary.Base32;
import org.bouncycastle.jce.interfaces.ECPublicKey;

import com.twitter.teruteru128.bitmessage.inventory.InventoryVector;
import com.twitter.teruteru128.bitmessage.protocol.Packet;
import com.twitter.teruteru128.bitmessage.protocol.PacketHeader;
import com.twitter.teruteru128.bitmessage.protocol.payload.Addr;
import com.twitter.teruteru128.bitmessage.protocol.payload.Inv;
import com.twitter.teruteru128.bitmessage.protocol.payload.Version;
import com.twitter.teruteru128.study.DecodedAddress;
import com.twitter.teruteru128.util.Base58;

/**
 * TODO もう接続の管理はSelectorでよくねえ……？
 */
public class Protocol {

    private static final int PACKET_MAGIC_NUMBER = 0xE9BEB4D9;
    private static final byte[] PREFIX_MAGIC_NUMBER = { -23, -66, -76, -39 };
    private static final byte[] IPV4_MAPPED_IPV6_ADDRESS_PREFIX = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -128, -128 };

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

    public static ByteBuffer createPacket(byte[] command) {
        return Protocol.createPacket(command, ByteBuffer.allocate(0));
    }

    public static ByteBuffer createPacket(byte[] command, ByteBuffer payload) {
        int payloadLength = payload.remaining();
        byte[] checksum = null;
        MessageDigest sha512 = null;
        try {
            sha512 = MessageDigest.getInstance("SHA-512");
        } catch (NoSuchAlgorithmException e) {
            throw new InternalError(e);
        }
        var c = Arrays.copyOf(command, 12);
        sha512.update(payload);
        payload.rewind();
        checksum = Arrays.copyOf(sha512.digest(), 4);

        return ByteBuffer.allocate(24 + payloadLength).putInt(PACKET_MAGIC_NUMBER).put(c)
                .putInt(payloadLength).put(checksum).put(payload).flip();
    }

    public static final byte[] ONION_DOMAIN_PREFIX = new byte[] { -3, -121, -40, 126, -21, 67 };
    public static final Base32 base32 = new Base32();

    public static ByteBuffer encodeHost(ByteBuffer buffer, InetSocketAddress host) {
        var hostname = host.getHostString();
        if (hostname.endsWith(".onion")) {
            // second level domain
            var decodedsld = base32.decode(hostname.split(".")[0]);
            return buffer.put(ONION_DOMAIN_PREFIX).put(decodedsld);
        }
        if (host.getAddress() instanceof Inet4Address) {
            return buffer.put(IPV4_MAPPED_IPV6_ADDRESS_PREFIX).put(host.getAddress().getAddress());
        }
        // host.getAddress() instanceof Inet6Address
        return buffer.put(host.getAddress().getAddress());
    }

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

    public static ByteBuffer assembleVersionMessage(InetSocketAddress remote, int[] participatingStreams,
            boolean server, long nodeid, byte[] userAgent) {
        int userAgentLength = userAgent.length;
        int userAgentVarintLength = 0;
        if (userAgentLength < 253) {
            userAgentVarintLength = 1;
        } else if (userAgentLength <= 65535) {
            userAgentVarintLength = 3;
        } else if (Integer.compareUnsigned(userAgentLength, -1) <= 0) {
            userAgentVarintLength = 5;
        }
        var streamNumbers = Structs.encodeVarintList(participatingStreams);
        var buffer = ByteBuffer.allocate(80 + userAgentVarintLength + userAgent.length + streamNumbers.remaining());
        // version
        buffer.putInt(3);
        // service
        buffer.putLong(Service.NODE_NETWORK | Service.NODE_SSL);
        // timestamp
        buffer.putLong(Instant.now().getEpochSecond());

        // addr_recv
        // network service
        buffer.putLong(1);
        // network ip
        if (checkSocksIP(remote) && server) {
            var localhost = InetSocketAddress.createUnresolved("127.0.0.1", 8444);
            encodeHost(buffer, localhost);
            buffer.putShort((short) 8444);
        } else {
            encodeHost(buffer, remote);
            buffer.putShort((short) remote.getPort());
        }

        // addr_from
        // network service
        buffer.putLong(1);
        // network ip
        buffer.put(IPV4_MAPPED_IPV6_ADDRESS_PREFIX);
        buffer.put(new byte[] { 127, 0, 0, 1 });
        buffer.putShort((short) 8444);
        buffer.putLong(nodeid);
        buffer.put(Structs.encodeVarint(userAgent.length));
        buffer.put(userAgent);
        buffer.put(streamNumbers);
        return createPacket("version".getBytes(), buffer.flip());
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
    public static void connect(SocketAddress address) throws Exception {
        var ctx = SSLContext.getDefault();
        var factory = ctx.getSocketFactory();
        SSLEngine engine = null;

        var socket = new Socket();
        socket.connect(address);
        var channel = SocketChannel.open(address);
        long nonce = ThreadLocalRandom.current().nextLong();
        var sha512 = MessageDigest.getInstance("SHA-512");
        // C言語の場合だと13バイト確保しておかないと危険ってことか？
        int magic = 0;
        var command = new byte[12];
        var checksum = new byte[4];
        var hash = new byte[64];
        Version themVersion;
        // handshake(send version, receive verack and version, send verack)
        {
            var out = socket.getOutputStream();
            var in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            String userAgent = "/SampleLib:1.0.0.0/";
            byte[] userAgentBytes = userAgent.getBytes(StandardCharsets.UTF_8);
            // version送信
            out.write(
                    assembleVersionMessage((InetSocketAddress) socket.getRemoteSocketAddress(), new int[] { 1 }, false,
                            nonce, userAgentBytes).array());
            channel.write(
                    assembleVersionMessage((InetSocketAddress) socket.getRemoteSocketAddress(), new int[] { 1 }, false,
                            nonce, userAgentBytes));
            var buffer = ByteBuffer.allocate(24);
            recvVerack(channel, sha512, command, checksum, hash, in, buffer);

            themVersion = recvVersion(channel, sha512, command, checksum, hash, in, buffer);
            // verack送信
            out.write(createPacket("verack".getBytes()).array());
        }
        // Use SSL if supported
        if ((themVersion.services() & 0x02) == 0x02) {
            socket = getSuites2(ctx, factory, socket);
        }
        {
            // var out = socket.getOutputStream();
            var in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            String cv;
            int length;
            getAddrp(sha512, command, checksum, hash, in);
            getInvp(sha512, command, checksum, hash, in);
        }
        socket.close();
    }

    private static void getInvp(MessageDigest sha512, byte[] command, byte[] checksum, byte[] hash, DataInputStream in)
            throws IOException, DigestException {
        int magic;
        String cv;
        int length;
        // inv
        magic = in.readInt();
        in.read(command);
        cv = new String(command).trim();
        length = in.readInt();
        System.out.printf("length: %d%n", length);
        in.read(checksum);
        var vectors = new ArrayList<InventoryVector>();
        {
            getSize2(sha512, checksum, hash, in, length, vectors);
        }
        var invp = new Packet(new PacketHeader(magic, cv, length, checksum), Optional.of(new Inv(vectors)));
    }

    private static Packet getAddrp(MessageDigest sha512, byte[] command, byte[] checksum, byte[] hash, DataInputStream in)
            throws IOException, DigestException {
        int magic;
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
        getSize(sha512, checksum, hash, in, length, addresses);
        return new Packet(new PacketHeader(magic, cv, length, checksum.clone()),
                Optional.of(new Addr(addresses)));
    }

    private static void getSize2(MessageDigest sha512, byte[] checksum, byte[] hash, DataInputStream in, int length,
            ArrayList<InventoryVector> vectors) throws IOException, DigestException {
        var payloadBuffer = ByteBuffer.allocate(length);
        var payload = payloadBuffer.array();
        in.readNBytes(payload, 0, length);
        sha512.update(payload);
        sha512.digest(hash, 0, 64);
        if (MessageDigest.isEqual(checksum, Arrays.copyOf(hash, 4))) {
            System.out.println("checksum ok!");
        } else {
            System.out.println("checksum NG! skippning...");
            return;
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

    private static void getSize(MessageDigest sha512, byte[] checksum, byte[] hash, DataInputStream in, int length,
            ArrayList<NetworkAddress> addresses) throws IOException, DigestException {
        var payloadBuffer = ByteBuffer.allocate(length);
        var payload = payloadBuffer.array();
        in.readNBytes(payload, 0, length);
        sha512.update(payload);
        sha512.digest(hash, 0, 64);
        if (MessageDigest.isEqual(checksum, Arrays.copyOf(hash, 4))) {
            System.out.println("checksum ok!");
        } else {
            System.out.println("checksum NG! skippning...");
            return;
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

    private static Socket getSuites2(SSLContext ctx, SSLSocketFactory factory, Socket socket) throws IOException {
        SSLEngine engine;
        long start = 0;
        long finish = 0;
        var remote = (InetSocketAddress) socket.getRemoteSocketAddress();
        var sslSocket = (SSLSocket) factory.createSocket(socket,
                remote.getHostName(),
                remote.getPort(), true);
        var suites = Set.of(sslSocket.getEnabledCipherSuites());
        // TLS_ECDH_anon_WITH_AES_256_CBC_SHA is usually disabled, so you need to change
        // your system settings.
        if (!suites.contains("TLS_ECDH_anon_WITH_AES_256_CBC_SHA")) {
            suites.add("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
            sslSocket.setEnabledCipherSuites(suites.toArray(String[]::new));
        }
        start = System.nanoTime();
        sslSocket.startHandshake();
        finish = System.nanoTime();
        System.out.printf("ssl handshake: %s%n", Duration.ofNanos(finish - start));
        socket = sslSocket;
        // if he supports ssl
        engine = ctx.createSSLEngine();
        var suites2 = Set.of(engine.getEnabledCipherSuites());
        if (!suites.contains("TLS_ECDH_anon_WITH_AES_256_CBC_SHA")) {
            suites2.add("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
            engine.setEnabledCipherSuites(suites.toArray(String[]::new));
        }
        engine.setUseClientMode(true);
        return socket;
    }

    private static Version recvVersion(SocketChannel channel, MessageDigest sha512, byte[] command, byte[] checksum,
            byte[] hash, DataInputStream in, ByteBuffer buffer) throws IOException, DigestException {
        int magic;
        int commandlen;
        int payloadLength;
        byte[] payload;
        ByteBuffer payloadBuffer;
        // version受信
        magic = in.readInt();
        System.out.printf("%08x%n", magic);
        Arrays.fill(command, (byte) 0);
        in.read(command, 0, 12);
        commandlen = command.length;
        // 手動trim
        while ((0 < commandlen) && (command[commandlen - 1] & 0xff) < ' ') {
            commandlen--;
        }
        System.out.println(new String(command, 0, commandlen).trim());
        payloadLength = in.readInt();
        in.read(checksum, 0, 4);
        payload = new byte[payloadLength];
        in.readNBytes(payload, 0, payloadLength);
        sha512.update(payload);
        sha512.digest(hash, 0, 64);
        if (MessageDigest.isEqual(checksum, Arrays.copyOf(hash, 4))) {
            System.out.println("checksum ok");
        } else {
            System.out.println("checksum ng");
        }
        ////////////////////////////////////////////////////////////////////
        channel.read(buffer);
        magic = buffer.getInt();
        Arrays.fill(command, (byte) 0);
        buffer.get(command);
        commandlen = command.length;
        // 手動trim
        while ((0 < commandlen) && (command[commandlen - 1] & 0xff) < ' ') {
            commandlen--;
        }
        System.out.println(new String(command, 0, commandlen).trim());
        payloadLength = buffer.getInt();
        buffer.get(checksum);
        payloadBuffer = ByteBuffer.allocate(payloadLength);
        channel.read(payloadBuffer);
        payloadBuffer.flip();
        sha512.update(payloadBuffer);
        sha512.digest(hash, 0, 64);
        if (MessageDigest.isEqual(checksum, Arrays.copyOf(hash, 4))) {
            System.out.println("checksum ok");
        } else {
            System.out.println("checksum ng");
        }
        int them_version = payloadBuffer.getInt();
        long them_services = payloadBuffer.getLong();
        long themTimeStamp = payloadBuffer.getLong();
        payloadBuffer.position(payloadBuffer.position() + 26);
        payloadBuffer.position(payloadBuffer.position() + 26);
        long themNonce = payloadBuffer.getLong();
        // String userAgent = null;
        // int[] streamNumbers = null;
        return new Version(them_version, them_services, themTimeStamp, null, null, themNonce, null, null);
    }

    /** verack受信 */
    private static void recvVerack(SocketChannel channel, MessageDigest sha512, byte[] command, byte[] checksum,
            byte[] hash, DataInputStream in, ByteBuffer buffer) throws IOException, DigestException {
        int magic;
        int commandlen;
        int payloadLength;
        byte[] payload;
        ByteBuffer payloadBuffer;
        magic = in.readInt();
        System.out.printf("%08x%n", magic);
        Arrays.fill(command, (byte) 0);
        in.read(command, 0, 12);
        commandlen = command.length;
        // 手動trim
        while ((0 < commandlen) && (command[commandlen - 1] & 0xff) < ' ') {
            commandlen--;
        }
        System.out.println(new String(command, 0, commandlen).trim());
        payloadLength = in.readInt();
        in.read(checksum, 0, 4);
        payload = new byte[payloadLength];
        in.readNBytes(payload, 0, payloadLength);
        sha512.update(payload);
        sha512.digest(hash, 0, 64);
        if (MessageDigest.isEqual(checksum, Arrays.copyOf(hash, 4))) {
            System.out.println("checksum ok");
        } else {
            System.out.println("checksum ng");
        }
        ////////////////////////////////////////////////////////////////////
        channel.read(buffer);
        magic = buffer.getInt();
        Arrays.fill(command, (byte) 0);
        buffer.get(command);
        commandlen = command.length;
        // 手動trim
        while ((0 < commandlen) && (command[commandlen - 1] & 0xff) < ' ') {
            commandlen--;
        }
        System.out.println(new String(command, 0, commandlen).trim());
        payloadLength = buffer.getInt();
        buffer.get(checksum);
        payloadBuffer = ByteBuffer.allocate(payloadLength);
        channel.read(payloadBuffer);
        payloadBuffer.flip();
        sha512.update(payloadBuffer);
        sha512.digest(hash, 0, 64);
        if (MessageDigest.isEqual(checksum, Arrays.copyOf(hash, 4))) {
            System.out.println("checksum ok");
        } else {
            System.out.println("checksum ng");
        }
    }

    public static void connect2(SocketAddress address) throws NoSuchAlgorithmException, IOException {
        var context = SSLContext.getDefault();
        var engine = context.createSSLEngine();
        var suites = Set.of(engine.getEnabledCipherSuites());
        // TODO CipherSuitesの設定は毎回しなくてもいいようにしたい
        if (!suites.contains("TLS_ECDH_anon_WITH_AES_256_CBC_SHA")) {
            suites.add("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
            engine.setEnabledCipherSuites(suites.toArray(String[]::new));
        }
        var channel = SocketChannel.open(address);
        // register to selector
        final long nodeid = ThreadLocalRandom.current().nextLong();
        boolean server = false;
        var remoteAddress = (InetSocketAddress) channel.getRemoteAddress();
        var userAgent = "/SampleLib with SocketChannel:0.0.0.1/".getBytes(StandardCharsets.UTF_8);
        // TODO 送信と受信を完全に別スレッドに分ける、受信したデータを処理するスレッドも分ける
        // TODO listen socketからacceptするスレッドと外部へconnectするスレッドとデータをやり取りするスレッドを別にしたい
        // ホントのこと言うと受信の度に仮想スレッドを立ち上げたい
        channel.write(assembleVersionMessage(remoteAddress, new int[] { 1 }, server, nodeid, userAgent));
        var header = ByteBuffer.allocate(24);
        channel.read(header);
        header.flip();
        header.getInt();
        byte[] command = new byte[12];
        header.get(command);
        int length = header.getInt();
        byte[] checksum = new byte[4];
        header.get(checksum);
        var payload = ByteBuffer.allocate(length);
        channel.read(payload);
    }

    public static boolean verify(byte[] data, byte[] sign, byte[] pubkey) {
        return false;
    }

    public static final int OBJECT_GETPUBKEY = 0;
    public static final int OBJECT_PUBKEY = 1;
    public static final int OBJECT_MSG = 2;
    public static final int OBJECT_BROADCAST = 3;
    /**
     * "tor"
     */
    public static final int OBJECT_ONIONPEER = 0x746f72;
    /**
     * "I2P"
     */
    public static final int OBJECT_I2P = 0x493250;
    /**
     * "ADDR"
     */
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
    public static long calcTarget(int length, int ttl, int proofOfWorkNonceTrialsPerByte,
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
