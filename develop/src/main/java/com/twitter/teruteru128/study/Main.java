package com.twitter.teruteru128.study;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.Security;
import java.util.HexFormat;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

/**
 * Main
 */
public class Main {

    static {
        if (Security.getProvider("BC") == null) {
            Security.addProvider(new BouncyCastleProvider());
        }
    }

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        long loadstart = System.nanoTime();
        var p = Paths.get("D:\\keys\\public\\publicKeys0.bin");
        ByteBuffer[] buffers = new ByteBuffer[16777216];
        int buffersLength = buffers.length;
        ByteBuffer direct = ByteBuffer.allocateDirect(1090519040);
        // TODO buffersの作成をスレッドごとにやったらマルチスレッドへの対応もしやすいかな……
        for (int i = 0, o = 0; i < buffersLength; i++, o += 65) {
            buffers[i] = direct.slice(o, 65);
        }
        var random = new SecureRandom();
        int index = 0;
        var sha512src = MessageDigest.getInstance("sha512");
        MessageDigest sha512 = null;
        var ripemd160 = MessageDigest.getInstance("ripemd160");
        var hash = new byte[64];
        var hashBuffer = ByteBuffer.wrap(hash);
        boolean con = true;
        var format = HexFormat.of();
        var work1 = new byte[65];
        var work2 = new byte[65];
        try (var c = FileChannel.open(p, StandardOpenOption.READ)) {
            long l = c.read(direct);
            System.out.printf("read buffers: %d%n", l);
        }
        long loadDone = System.nanoTime();
        System.err.printf("開幕 ここまで%f秒%n", (loadDone - loadstart) / 1e9);
        do {
            index = random.nextInt(buffersLength);
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
                    con = false;
                }
            }
            sha512src.reset();
        } while (con);
        System.err.printf("開幕からここまで%f秒%n", (System.nanoTime() - loadDone) / 1e9);
    }

}
