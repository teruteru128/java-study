package com.twitter.teruteru128.study;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;

import com.twitter.teruteru128.bitmessage.Const;
import com.twitter.teruteru128.encode.Base58;

public class Search {

    public void sample() throws DigestException, IOException, NoSuchAlgorithmException {
        // 00000000cf12c86a, 4178976631
        var p1 = System.getenv("PK");
        if (p1 == null || p1.isEmpty()) {
            return;
        }
        var b1 = Base58.decode(p1);
        var encoded1 = ByteBuffer.wrap(Const.G.multiply(new BigInteger(1, b1, 1, 32)).getEncoded(false));
        var sha512 = MessageDigest.getInstance("SHA512");
        var ripemd160 = MessageDigest.getInstance("ripemd160");
        sha512.update(encoded1);
        encoded1.rewind();
        var hashBuffer = ByteBuffer.allocate(64);
        var hash = hashBuffer.array();
        sha512.digest(hash, 0, 64);
        ripemd160.update(hash, 0, 64);
        ripemd160.digest(hash, 0, 20);
        var rootBuffer = ByteBuffer.allocateDirect(16777216 * 65);
        var buffers = new ByteBuffer[16777216];
        for (int i = 0; i < 16777216; i++) {
            buffers[i] = rootBuffer.slice((i << 6) + i, 65);
        }
        long min = 0x00000000cf12c86aL;
        long hashhead = 0;
        long minindex = 4178976631L;

        for (long i = 0; i < 256; i++) {
            var path = Paths.get(String.format("D:\\keys\\public\\publicKeys%d.bin", i));
            try (var channel = FileChannel.open(path)) {
                channel.read(rootBuffer);
                rootBuffer.flip();
            }
            for (int j = 0; j < 16777216; j++) {
                sha512.update(encoded1);
                encoded1.rewind();
                sha512.update(buffers[j]);
                buffers[j].rewind();
                sha512.digest(hash, 0, 64);
                ripemd160.update(hash, 0, 64);
                ripemd160.digest(hash, 0, 20);
                hashhead = hashBuffer.getLong(0);
                if (Long.compareUnsigned(min, hashhead) > 0) {
                    min = hashhead;
                    minindex = (i << 24) | j;
                    System.out.printf("%016x, %d%n", min, minindex);
                }
            }
            rootBuffer.clear();
        }
    }

    private static void a(Path a, byte[] buf, int offset, int length) throws IOException {
        var buf2 = Files.readAllBytes(a);
        System.arraycopy(buf2, 0, buf, offset, length);
    }

    static void getExecutor(String[] args) throws IOException, InterruptedException, ExecutionException {
        int processors = Runtime.getRuntime().availableProcessors();
        int n = args.length > 0 ? Integer.parseInt(args[0]) : processors;
        int taskNum = (0 < n) ? n : processors;
        final var buf = new byte[1635778560];
        a(first.resolve("publicKeys0.bin"), buf, 0, 1090519040);
        a(first.resolve("publicKeys1.bin"), buf, 1090519040, 545259520);
        try (var executor = Executors.newWorkStealingPool()) {
            System.out.println(executor.invokeAny(Collections.nCopies(taskNum, (Callable<Result>) () -> {
                int index;
                var sha512 = MessageDigest.getInstance("SHA-512");
                var ripemd160 = MessageDigest.getInstance("RIPEMD160");
                var buffer = ByteBuffer.allocate(64);
                var hash = buffer.array();
                var cache = new byte[65];
                int i;
                while (true) {
                    // pow(1.5 files, 2)
                    index = ThreadLocalRandom.current().nextInt(25165824);
                    // index *= 65;
                    index = (index << 6) + index;
                    System.arraycopy(buf, index, cache, 0, 65);
                    for (i = 0; i < 1635778560; i += 65) {
                        sha512.update(cache, 0, 65);
                        sha512.update(buf, i, 65);
                        sha512.digest(hash, 0, 64);
                        ripemd160.update(hash, 0, 64);
                        ripemd160.digest(hash, 0, 20);
                        if (Long.compareUnsigned(buffer.getLong(0), 0x10000L) < 0) {
                            return new Result(buffer.getLong(0), index / 65, i / 65);
                        }
                    }
                }
            })));
        }
    }

    static final Path first = Paths.get("D:\\keys\\public");

}
