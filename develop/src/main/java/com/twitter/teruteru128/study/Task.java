package com.twitter.teruteru128.study;

import java.nio.ByteBuffer;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HexFormat;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class Task implements Callable<AddressPublicKeySet> {
    private static final int MASK_LENGTH = 40;
    private static final long MASK = ((1l << MASK_LENGTH) - 1) << (64 - MASK_LENGTH);
    private ByteBuffer buffer;

    public Task(ByteBuffer buf) {
        super();
        this.buffer = buf;
    }

    @Override
    public AddressPublicKeySet call() {
        ByteBuffer[] buffers = new ByteBuffer[16777216];
        int buffersLength = buffers.length;
        for (int i = 0, o = 0; i < buffersLength; i++, o += 65) {
            buffers[i] = buffer.slice(o, 65);
        }
        int index = 0;
        long sectionStart = 0;
        try {
            var sha512src = MessageDigest.getInstance("sha512");
            MessageDigest sha512 = null;
            var ripemd160 = MessageDigest.getInstance("ripemd160");
            var hashBuffer = ByteBuffer.allocate(64);
            var hash = hashBuffer.array();
            do {
                sectionStart = System.nanoTime();
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
                    if ((hashBuffer.getLong(0) & MASK) == 0L) {
                        return new AddressPublicKeySet(buffers[index], b);
                    }
                }
                sha512src.reset();
                System.err.printf("%d,%f%n", index, (System.nanoTime() - sectionStart) / 1e9);
            } while (true);
        } catch (CloneNotSupportedException | DigestException | NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } finally {
            System.err.printf("%d,%f%n", index, (System.nanoTime() - sectionStart) / 1e9);
        }
    }
}
