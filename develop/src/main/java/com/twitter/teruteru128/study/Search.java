package com.twitter.teruteru128.study;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.twitter.teruteru128.bitmessage.Const;
import com.twitter.teruteru128.sample.Sample;
import com.twitter.teruteru128.encode.Base58;

public class Search implements Sample {

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

}
