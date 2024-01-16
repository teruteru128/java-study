package com.twitter.teruteru128.bitmessage;

import java.nio.ByteBuffer;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class Task implements Callable<AddressPublicKeySet> {
    private static final int MASK_LENGTH = 48;
    private static final long MASK = ((1l << MASK_LENGTH) - 1) << (64 - MASK_LENGTH);
    private ByteBuffer[] buffers;
    private Status status;

    public Task(ByteBuffer[] buf, Status status) {
        super();
        this.buffers = buf;
        this.status = status;
    }

    @Override
    public AddressPublicKeySet call() {
        var startTime = status.getStart();
        OffsetDateTime d = OffsetDateTime.now();
        System.err.printf("[%s, %s] バッファー分割開始なのね！%n", d, Duration.between(startTime, d));
        var counter = status.getCounter();
        ByteBuffer[] keys = new ByteBuffer[16777216 * buffers.length];
        int keysLength = keys.length;
        int largeoffset = 0;
        for (int i = 0; i < buffers.length; i++) {
            largeoffset = i << 24;
            for (int j = 0, offset = 0; j < 16777216; j++, offset += 65) {
                keys[largeoffset + j] = buffers[i].slice(offset, 65);
            }
        }
        int index = 0;
        try {
            d = OffsetDateTime.now();
            System.err.printf("[%s, %s] %d件のキーでスレッドをスタートしますた%n", d, Duration.between(startTime, d), keysLength);
            var sha512src = MessageDigest.getInstance("sha512");
            MessageDigest sha512 = null;
            var ripemd160 = MessageDigest.getInstance("ripemd160");
            var hashBuffer = ByteBuffer.allocate(64);
            var hash = hashBuffer.array();
            long c = 0;
            do {
                index = ThreadLocalRandom.current().nextInt(keysLength);
                sha512src.update(keys[index]);
                keys[index].rewind();
                for (var b : keys) {
                    sha512 = (MessageDigest) sha512src.clone();
                    sha512.update(b);
                    b.rewind();
                    sha512.digest(hash, 0, 64);
                    ripemd160.update(hash, 0, 64);
                    ripemd160.digest(hash, 0, 20);
                    if ((hashBuffer.getLong(0) & MASK) == 0L) {
                        return new AddressPublicKeySet(keys[index], b);
                    }
                    c = counter.incrementAndGet();
                    if ((c & 0x1ffffffffL) == 0) {
                        d = OffsetDateTime.now();
                        System.err.printf("[%s, %s] %d件終わりますた%n", d, Duration.between(startTime, d), c);
                    }
                }
                sha512src.reset();
            } while (true);
        } catch (CloneNotSupportedException | DigestException | NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
