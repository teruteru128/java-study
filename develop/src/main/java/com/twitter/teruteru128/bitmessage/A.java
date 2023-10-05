package com.twitter.teruteru128.bitmessage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;

import com.twitter.teruteru128.bitmessage.app.DeterministicAddressesGenerator;
import com.twitter.teruteru128.bitmessage.genaddress.BMAddressGenerator;
import com.twitter.teruteru128.bitmessage.spec.BMAddress;

public class A implements Callable<IndexPair> {

    private MappedByteBuffer[] buffers;

    public A(MappedByteBuffer[] buffers) {
        this.buffers = buffers;
    }

    @Override
    public IndexPair call() throws Exception {
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
                    return new IndexPair(sigIndex, j);
                }
                l = A.extracted(buffers, sha512, ripemd160, digest, wrappedBuffer, j, sigIndex);
                if ((l & 0xffffffffffff0000L) == 0) {
                    return new IndexPair(j, sigIndex);
                }
            }
        }
    }

    public static ByteBuffer getKey(Path path, int offset, int length) throws IOException {
        try (var channel = FileChannel.open(path)) {
            var buffer = ByteBuffer.allocate(length);
            channel.position(offset);
            channel.read(buffer);
            return buffer.flip();
        }
    }

    public static void getWif2() throws IOException {
        var path1 = Paths.get("");
        var offset1 = 390319104;
    
        var path2 = Paths.get("");
        var offset2 = 523366656;
    
        var length = 32;
    
        var buffer1 = A.getKey(path1, offset1, length);
        var buffer2 = A.getKey(path2, offset2, length);
    
        // TODO bitmessage API整理(鍵変換関連)
        var public1 = DeterministicAddressesGenerator.deriviedPublicKey(buffer1.array());
        var public2 = DeterministicAddressesGenerator.deriviedPublicKey(buffer2.array());
    
        // calc ripe
        var ripe = new byte[20];
        DeterministicAddressesGenerator.deriviedRipeHash(ripe, public1, public2);
        // encode address
        var address = BMAddress.encodeAddress(ripe);
        var wif1 = BMAddressGenerator.encodeWIF(buffer1.array());
        var wif2 = BMAddressGenerator.encodeWIF(buffer2.array());
        System.out.printf("[%s]%n%s%n%s%n", address, wif2, wif1);
    }

    public static MappedByteBuffer getBuffer(Path path) throws IOException {
        try (var channel = FileChannel.open(path)) {
            var size = channel.size();
            return channel.map(FileChannel.MapMode.READ_ONLY, 0, size);
        }
    }

    public static void getL(String path) throws IOException {
        var buffer = A.getBuffer(Paths.get(path));
        var buffers = new MappedByteBuffer[16777216];
        for (int i = 0, index = 0; i < 16777216; i++, index += 65) {
            buffers[i] = buffer.slice(index, 65);
        }
        var random = RandomGenerator.of("SecureRandom");
        long l = 0;
        try {
            var sha512 = MessageDigest.getInstance("SHA-512");
            var ripemd160 = MessageDigest.getInstance("RIPEMD160");
            var digest = new byte[64];
            var wrappedBuffer = ByteBuffer.wrap(digest, 0, 64);
            while (true) {
                int sigIndex = random.nextInt(16777216);
                for (int j = 0; j < 16777216; j++) {
                    l = extracted(buffers, sha512, ripemd160, digest, wrappedBuffer, sigIndex, j);
                    // TODO Searching for better judgment methods
                    // 大小比較、もしくはビットマスク比較
                    if ((l & 0xffffffffffff0000L) == 0) {
                        System.out.printf("%d, %d%n", sigIndex, j);
                    }
                    l = extracted(buffers, sha512, ripemd160, digest, wrappedBuffer, j, sigIndex);
                    if ((l & 0xffffffffffff0000L) == 0) {
                        System.out.printf("%d, %d%n", j, sigIndex);
                    }
                }
            }
        } catch (NoSuchAlgorithmException | DigestException e) {
            e.printStackTrace();
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
