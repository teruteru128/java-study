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
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.spec.PKCS8EncodedKeySpec;
import java.time.Instant;
import java.util.Arrays;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManagerFactory;

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
        var address = new InetSocketAddress("localhost", 8444);
        var socket = new Socket();
        socket.connect(address);
        long nonce = java.util.concurrent.ThreadLocalRandom.current().nextLong();
        var out = socket.getOutputStream();
        out.write(assembleVersionMessage((InetSocketAddress) socket.getRemoteSocketAddress(), new int[] { 1 }, false,
                nonce));
        byte[] buf = new byte[8192];
        var in = new BufferedInputStream(socket.getInputStream());
        var r = in.read(buf);
        var b = ByteBuffer.wrap(buf, 0, r);
        var m = MessageDigest.getInstance("SHA-512");
        for (int i = 0; i < 2; i++) {
            var magic = b.getInt();
            System.out.printf("%08x%n", magic);
            var command = new byte[12];
            b.get(command, 0, 12);
            System.out.println(new String(command));
            var length = b.getInt();
            var checksum = new byte[4];
            b.get(checksum, 0, 4);
            var payload = new byte[length];
            b.get(payload);
            m.update(payload);
            var hash = m.digest();
            if (Arrays.equals(checksum, 0, 4, hash, 0, 4)) {
                System.out.println("checksum ok");
            } else {
                System.out.println("checksum ng");
            }
        }
        out.write(createPacket("verack".getBytes()));

        var cf = CertificateFactory.getInstance("X.509");
        var kf = KeyFactory.getInstance("RSA", "BC");
        var ks = KeyStore.getInstance("PKCS12");
        ks.load(null, null);
        var ts = KeyStore.getInstance("JKS");
        ts.load(null, null);

        try (var d = new BufferedInputStream(Protocol.class.getResourceAsStream("cert.pem"));
                var e = new BufferedInputStream(Protocol.class.getResourceAsStream("key.der"))) {
            var cert = cf.generateCertificate(d);
            var key = kf.generatePrivate(new PKCS8EncodedKeySpec(e.readAllBytes()));
            ks.setKeyEntry("A", key, new char[0], new Certificate[] { cert });
        }

        var kmf = KeyManagerFactory.getInstance("SunX509");
        kmf.init(ks, null);
        var tmf = TrustManagerFactory.getInstance("SunX509");
        tmf.init(ts);

        var ctx = SSLContext.getInstance("TLS");
        ctx.init(kmf.getKeyManagers(), tmf.getTrustManagers(), null);
        var factory = ctx.getSocketFactory();
        var sslSocket = (SSLSocket) factory.createSocket(socket,
                socket.getInetAddress().getHostAddress(),
                socket.getPort(), true);
        sslSocket.startHandshake();
        sslSocket.close();
    }

}
