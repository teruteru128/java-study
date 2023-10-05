package com.twitter.teruteru128.study;

import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.security.DigestException;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

class A implements Callable<byte[]> {

    private MappedByteBuffer[] buffers;

    public A(MappedByteBuffer[] buffers) {
        this.buffers = buffers;
    }

    @Override
    public byte[] call() throws Exception {
        var sha512 = MessageDigest.getInstance("SHA-512");
        var ripemd160 = MessageDigest.getInstance("RIPEMD160");
        var digest = new byte[64];
        var wrappedBuffer = ByteBuffer.wrap(digest, 0, 64);
        long l = 0;
        while (true) {
            int sigIndex = ThreadLocalRandom.current().nextInt(16777216);
            for (int j = 0; j < 16777216; j++) {
                l = A.extracted(buffers, sha512, ripemd160, digest, wrappedBuffer, sigIndex, j);
                // TODO Searching for better judgment methods
                // 大小比較、もしくはビットマスク比較
                if ((l & 0xffffffffffff0000L) == 0) {
                    return null;
                }
                l = A.extracted(buffers, sha512, ripemd160, digest, wrappedBuffer, j, sigIndex);
                if ((l & 0xffffffffffff0000L) == 0) {
                    return null;
                }
            }
        }
    }

    public static long extracted(MappedByteBuffer[] buffers, MessageDigest sha512, MessageDigest ripemd160,
            byte[] digest, ByteBuffer wrappedBuffer, int sigIndex, int encIndex) throws DigestException {
        // assert digest.length >= 64;
        synchronized (buffers[sigIndex]) {
            sha512.update(buffers[sigIndex]);
            buffers[sigIndex].rewind();
        }
        synchronized (buffers[encIndex]) {
            sha512.update(buffers[encIndex]);
            buffers[encIndex].rewind();
        }
        sha512.digest(digest, 0, 64);
        ripemd160.update(digest, 0, 64);
        ripemd160.digest(digest, 0, 20);
        return wrappedBuffer.getLong(0);
    }

}
