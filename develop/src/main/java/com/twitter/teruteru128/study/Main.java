package com.twitter.teruteru128.study;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.MessageDigest;
import java.security.Security;
import java.time.Duration;
import java.time.OffsetDateTime;
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
        int th = args.length >= 1 ? Integer.parseInt(args[0], 10) : 16;
        System.err.printf("スレッド数: %d%n", th);
        var loadstart = OffsetDateTime.now();
        System.err.printf("[%s] 読み込み開始%n", loadstart);
        var directs = new ByteBuffer[32];
        for (int i = 0; i < 32; i++) {
            var direct1 = ByteBuffer.allocateDirect(1090519040);
            var p = Paths.get(String.format("D:\\keys\\public\\publicKeys%d.bin", i));
            try (var c = FileChannel.open(p, StandardOpenOption.READ)) {
                long l = c.read(direct1);
                System.err.printf("read buffer%d: %d%n", i, l);
            }
            directs[i] = direct1;
        }
        var loadDone = OffsetDateTime.now();
        System.err.printf("[%s, %s] 読み込み完了%n", loadDone, Duration.between(loadstart, loadDone));
        var tasks = new ArrayList<Task>(th);
        var status = Status.getInstance();
        for (int i = 0; i < th; i++) {
            tasks.add(new Task(directs, status));
        }
        var pool = Executors.newCachedThreadPool();
        var a = pool.invokeAny(tasks);
        var calcDone = OffsetDateTime.now();
        System.err.printf("[%s, %s] 計算終了%n", calcDone, Duration.between(loadDone, calcDone));
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
    }

}
