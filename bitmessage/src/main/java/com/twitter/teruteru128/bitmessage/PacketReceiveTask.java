package com.twitter.teruteru128.bitmessage;

import java.io.DataInputStream;
import java.io.IOException;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.ForkJoinPool;

import com.twitter.teruteru128.bitmessage.protocol.Packet;
import com.twitter.teruteru128.bitmessage.protocol.PacketHeader;
import com.twitter.teruteru128.bitmessage.protocol.payload.UnknownPacketPayload;

public class PacketReceiveTask implements Runnable {

    private ForkJoinPool service;
    private TCPConnection connection;

    public PacketReceiveTask(ForkJoinPool service, TCPConnection connection) {
        super();
        this.service = service;
        this.connection = connection;
    }

    @Override
    public void run() {
        try {
            DataInputStream din = new DataInputStream(connection.getSocket().getInputStream());
            int magic = din.readInt();
            byte[] commandbuffer = new byte[12];
            din.read(commandbuffer, 0, 12);
            int len = commandbuffer.length;
            // 手動trim
            while ((0 < len) && (commandbuffer[len - 1] & 0xff) < ' ') {
                len--;
            }
            String command = new String(commandbuffer, 0, len);
            int length = din.readInt();
            byte[] checksum = new byte[4];
            din.read(checksum, 0, 4);
            byte[] payload = new byte[length];
            din.readNBytes(payload, 0, length);
            var m = MessageDigest.getInstance("SHA-512");
            var hash = new byte[64];
            m.update(payload);
            m.digest(hash, 0, 64);
            if (MessageDigest.isEqual(checksum, Arrays.copyOf(hash, 4))) {
                new Packet(new PacketHeader(magic, command, length, payload),
                        Optional.of(new UnknownPacketPayload(payload)));
                // add command(packet) process queue
            }
        } catch (IOException | NoSuchAlgorithmException | DigestException e) {
            e.printStackTrace();
        }
        if (State.shutdown == 0) {
            service.execute(this);
        }
    }
}
