package com.twitter.teruteru128.study.sntp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.SecureRandom;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

class SNTPTest {
    private static final String SERVER_NAME = "ntp.nict.jp";

    public static void main(String[] args) throws Exception {
        var localHost = InetAddress.getLocalHost();
        System.out.println(localHost.getHostName());
        System.out.println(localHost.getHostAddress());
        var loopback = InetAddress.getLoopbackAddress();
        System.out.println(loopback);
        var getByName = InetAddress.getByName("localhost");
        System.out.println(getByName);
        InetAddress src = null;
        var nics = NetworkInterface.getNetworkInterfaces();
        String[] inet4Prefix = { "192.168.1.", "172.16", "10." };
        while (nics.hasMoreElements()) {
            var nic = nics.nextElement();
            var addresses = nic.getInetAddresses();
            while (addresses.hasMoreElements()) {
                var address = addresses.nextElement();
                System.out.printf("selectlocalhost :%s : ", address);
                System.out.printf("%s %s %s %s %s %s %s %s %s %s", address.isAnyLocalAddress(), address.isLinkLocalAddress(),
                        address.isLoopbackAddress(),
                        address.isMCGlobal(),
                        address.isMCLinkLocal(),
                        address.isMCNodeLocal(),
                        address.isMCOrgLocal(),
                        address.isMCSiteLocal(),
                        address.isMulticastAddress(),
                        address.isSiteLocalAddress());
                if (address instanceof Inet4Address) {
                    for (String prefix : inet4Prefix) {
                        if (src == null && address.getHostAddress().startsWith(prefix)) {
                            src = address;
                        }
                    }
                } else if (address instanceof Inet6Address) {
                    System.out.printf(" %s",((Inet6Address)address).isIPv4CompatibleAddress());
                }
                System.out.println();
            }
        }
        if (src == null) {
            System.err.println("ちっぱい");
            return;
        } else {
            System.err.println("やったぜ。");
            System.out.println(src);
        }
        InetSocketAddress host = new InetSocketAddress(src, new SecureRandom().nextInt(64511) + 1024);
        InetSocketAddress address = new InetSocketAddress(InetAddress.getByName(SERVER_NAME), 123);
        byte[] sendBuf = new byte[48];
        sendBuf[0] = 0x0b;
        System.out.printf("send : LI : %d, VN : %d, Mode : %d%n", (sendBuf[0] >> 6) & 0x03, (sendBuf[0] >> 3) & 0x07,
                (sendBuf[0] >> 0) & 0x07);
        // sendBuf[0] = 0x0b;
        // System.out.printf("%d %d %d%n", (sendBuf[0]>>6) & 0x03, (sendBuf[0]>>3) &
        // 0x07, (sendBuf[0]>>0) & 0x07);
        DatagramPacket send = new DatagramPacket(sendBuf, 48, address);
        byte[] recvBuf = new byte[48];
        DatagramPacket recv = new DatagramPacket(recvBuf, 48, address);
        try (DatagramSocket socket = new DatagramSocket(host)) {
            socket.send(send);
            socket.receive(recv);
        }
        ByteBuffer a = ByteBuffer.wrap(recv.getData());
        a.order(ByteOrder.BIG_ENDIAN);
        byte first = a.get();
        byte stratum = a.get();
        byte poll = a.get();
        byte precision = a.get();
        int root_delay = a.getInt();
        int root_dispersion = a.getInt();
        int reference_identifier = a.getInt();
        long reference_timestamp = a.getLong();
        long originate_timestamp = a.getLong();
        long receive_timestamp = a.getLong();
        int transmit_timestamp_seconds = a.getInt();
        int transmit_timestamp_fractions = a.getInt();

        System.out.printf("recv : LI : %d, VN : %d, Mode : %d%n", (first >> 6) & 0x03, (first >> 3) & 0x07,
                (first >> 0) & 0x07);
        System.out.printf("stratum : %d%n", stratum);
        System.out.printf("poll : %d%n", poll);
        System.out.printf("precision : %d%n", precision);
        System.out.printf("root delay : %d%n", root_delay);
        System.out.printf("root dispersion : %d%n", root_dispersion);
        // (char *)&reference_identifier
        System.out.printf("reference_identifier : 0x%08x(%s)%n", reference_identifier,
                new String(ByteBuffer.allocate(4).putInt(0, reference_identifier).array(), "UTF-8"));
        System.out.printf("reference_timestamp %s%n", Long.toUnsignedString(reference_timestamp, 16));
        System.out.printf("originate_timestamp : %s%n", Long.toUnsignedString(originate_timestamp));
        System.out.printf("receive_timestamp : %s%n", Long.toUnsignedString(receive_timestamp, 16));
        System.out.printf("transmit_timestamp_seconds : %s(%d)%n", Integer.toUnsignedLong(transmit_timestamp_seconds),
                Integer.toUnsignedLong(transmit_timestamp_seconds) - 2208988800L);
        long unixtime = Integer.toUnsignedLong(transmit_timestamp_seconds) - 2208988800L;
        System.out.printf("time : %s%n",
                LocalDateTime.ofInstant((Instant.ofEpochSecond(unixtime)), ZoneId.systemDefault()));
        System.out.printf("transmit timestamp fractions : %d%n", transmit_timestamp_fractions);
    }
}
