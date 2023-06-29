package com.twitter.teruteru128.study;

import java.nio.ByteBuffer;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HexFormat;
import java.util.concurrent.ThreadLocalRandom;

public class Task implements Runnable {
    private ByteBuffer buffer;
    private Status status;

    public Task(ByteBuffer buf, Status status) {
        super();
        this.buffer = buf;
        this.status = status;
    }

    @Override
    public void run() {
        ByteBuffer[] buffers = new ByteBuffer[16777216];
        int buffersLength = buffers.length;
        for (int i = 0, o = 0; i < buffersLength; i++, o += 65) {
            buffers[i] = buffer.slice(o, 65);
        }
        int index = 0;
        try {
            var sha512src = MessageDigest.getInstance("sha512");
            MessageDigest sha512 = null;
            var ripemd160 = MessageDigest.getInstance("ripemd160");
            var hash = new byte[64];
            var hashBuffer = ByteBuffer.wrap(hash);
            var format = HexFormat.of();
            var work1 = new byte[65];
            var work2 = new byte[65];

            do {
                index = ThreadLocalRandom.current().nextInt(buffersLength);
                sha512src.update(buffers[index]);
                buffers[index].rewind();
                for (var b : buffers) {
                    sha512 = (MessageDigest) sha512src.clone();
                    sha512.update(b);
                    b.rewind();
                    sha512.digest(hash, 0, 64);
                    ripemd160.update(hash, 0, 64);
                    ripemd160.digest(hash, 0, 20);
                    if ((hashBuffer.getLong(0) & 0xffffffffffff0000L) == 0L) {
                        buffers[index].get(work1);
                        buffers[index].rewind();
                        b.get(work2);
                        b.rewind();
                        System.out.printf("%d: %s,%s,%s%n", Long.numberOfLeadingZeros(hashBuffer.getLong(0)),
                                format.formatHex(hash, 0, 20),
                                format.formatHex(work1), format.formatHex(work2));
                    }
                }
                sha512src.reset();
            } while (status.isRunning());
        } catch (CloneNotSupportedException | DigestException | NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
