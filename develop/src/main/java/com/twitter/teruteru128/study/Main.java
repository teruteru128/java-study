package com.twitter.teruteru128.study;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.MessageDigest;
import java.security.Security;
import java.util.ArrayList;
import java.util.HexFormat;
import java.util.concurrent.Executors;

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
        int th = args.length >= 1 ? Integer.parseInt(args[0], 10): 16;
        System.err.printf("スレッド数: %d%n", th);
        long loadstart = System.nanoTime();
        var p = Paths.get("D:\\keys\\public\\publicKeys0.bin");
        ByteBuffer direct = ByteBuffer.allocateDirect(1090519040);
        try (var c = FileChannel.open(p, StandardOpenOption.READ)) {
            long l = c.read(direct);
            System.out.printf("read buffers: %d%n", l);
        }
        long loadDone = System.nanoTime();
        System.err.printf("開幕 ここまで%f秒%n", (loadDone - loadstart) / 1e9);
        var tasks = new ArrayList<Task>(th);
        for (int i = 0; i < th; i++) {
            tasks.add(new Task(direct));
        }
        var pool = Executors.newCachedThreadPool();
        var a = pool.invokeAny(tasks);
        pool.shutdown();
        var format = HexFormat.of();
        MessageDigest sha512 = MessageDigest.getInstance("sha512");
        var ripemd160 = MessageDigest.getInstance("ripemd160");
        var hashBuffer = ByteBuffer.allocate(64);
        var hash = hashBuffer.array();
        var work1 = new byte[65];
        var work2 = new byte[65];
        a.signingPublicKey().get(0, work1);
        a.encryptionPublicKey().get(0, work2);
        sha512.update(work1);
        sha512.update(work2);
        sha512.digest(hash, 0, 64);
        ripemd160.update(hashBuffer);
        hashBuffer.rewind();
        ripemd160.digest(hash, 0, 20);
        System.out.printf("%d: %s,%s,%s%n", Long.numberOfLeadingZeros(hashBuffer.getLong(0)),
                format.formatHex(hash, 0, 20),
                format.formatHex(work1), format.formatHex(work2));
        System.err.printf("開幕からここまで%f秒%n", (System.nanoTime() - loadDone) / 1e9);
    }

}
