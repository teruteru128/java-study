package com.twitter.teruteru128.study.sntp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

class SNTPTest {
    private static final String SERVER_NAME = "ntp.nict.jp";

    public SNTPTest() {
    }

    /**
     * TODO リファクタリング
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        InetSocketAddress dest = new InetSocketAddress(InetAddress.getByName(SERVER_NAME), 123);
        byte[] sendBuf = new byte[48];
        sendBuf[0] = 0x0b;
        System.out.print("send : LI : ");
        System.out.print((sendBuf[0] >> 6) & 0x03);
        System.out.print(", VN : ");
        System.out.print((sendBuf[0] >> 3) & 0x07);
        System.out.print(", Mode : ");
        System.out.println((sendBuf[0] >> 0) & 0x07);
        DatagramPacket send = new DatagramPacket(sendBuf, 48, dest);
        byte[] recvBuf = new byte[48];
        DatagramPacket recv = new DatagramPacket(recvBuf, 48, dest);
        try (DatagramSocket socket = new DatagramSocket()) {
            socket.send(send);
            socket.receive(recv);
        }
        ByteBuffer a = ByteBuffer.wrap(recv.getData()).order(ByteOrder.BIG_ENDIAN);
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
                first & 0x07);
        System.out.printf("stratum : %d%n", stratum);
        System.out.printf("poll : %d%n", poll);
        System.out.printf("precision : %d%n", precision);
        System.out.printf("root delay : %d%n", root_delay);
        System.out.printf("root dispersion : %d%n", root_dispersion);
        // (char *)&reference_identifier
        System.out.printf("reference_identifier : 0x%08x(%s)%n", reference_identifier,
                new String(ByteBuffer.allocate(4).putInt(reference_identifier).array(), "UTF-8"));
        System.out.printf("reference_timestamp %s%n", Long.toUnsignedString(reference_timestamp, 16));
        System.out.printf("originate_timestamp : %s%n", Long.toUnsignedString(originate_timestamp));
        System.out.printf("receive_timestamp : %s%n", Long.toUnsignedString(receive_timestamp, 16));
        long unixtime = Integer.toUnsignedLong(transmit_timestamp_seconds) - 2208988800L;
        System.out.printf("transmit_timestamp_seconds : %s(%d)%n", Integer.toUnsignedLong(transmit_timestamp_seconds),
                unixtime);
        var epoch = Instant.ofEpochSecond(unixtime);
        System.out.printf("time : %s, %s%n", epoch, ZonedDateTime.ofInstant(epoch, ZoneId.systemDefault()));
        System.out.printf("transmit timestamp fractions : %d%n", transmit_timestamp_fractions);
    }
}
