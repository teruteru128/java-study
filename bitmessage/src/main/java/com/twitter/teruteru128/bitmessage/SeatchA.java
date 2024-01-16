package com.twitter.teruteru128.bitmessage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HexFormat;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class SeatchA implements Runnable {

    private static HexFormat HEX_FORMAT = HexFormat.of();
    private int threadNum = 16;

    public int getThreadNum() {
        return threadNum;
    }

    public void setThreadNum(int threadNum) {
        this.threadNum = threadNum;
    }

    public SeatchA() {
        super();
    }

    @Override
    public void run() {
        System.err.printf("スレッド数: %d%n", threadNum);
        var loadstart = OffsetDateTime.now();
        System.err.printf("[%s] 読み込み開始%n", loadstart);
        int filenum = 4;
        var directs = new ByteBuffer[filenum];
        for (int i = 0; i < filenum; i++) {
            var direct1 = ByteBuffer.allocateDirect(1090519040);
            var p = Paths.get(String.format("D:\\keys\\public\\publicKeys%d.bin", i));
            try (var c = FileChannel.open(p, StandardOpenOption.READ)) {
                long l = c.read(direct1);
                System.err.printf("read buffer%d: %d%n", i, l);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            directs[i] = direct1;
        }
        var loadDone = OffsetDateTime.now();
        System.err.printf("[%s, %s] 読み込み完了%n", loadDone, Duration.between(loadstart, loadDone));
        var tasks = new ArrayList<Task>(threadNum);
        var status = Status.getInstance();
        for (int i = 0; i < threadNum; i++) {
            tasks.add(new Task(directs, status));
        }
        var pool = Executors.newCachedThreadPool();
        try {
            var a = pool.invokeAny(tasks);
            var calcDone = OffsetDateTime.now();
            System.err.printf("[%s, %s] 計算終了%n", calcDone, Duration.between(loadDone, calcDone));
            outputAddressKeys(a);
        } catch (InterruptedException | ExecutionException | NoSuchAlgorithmException | DigestException e) {
            throw new RuntimeException(e);
        } finally {
            pool.shutdown();
        }
    }

    private static void outputAddressKeys(AddressPublicKeySet a) throws NoSuchAlgorithmException, DigestException {
        var hashBuffer = ByteBuffer.allocate(64);
        var hash = hashBuffer.array();
        var sha512 = MessageDigest.getInstance("sha512");
        var ripemd160 = MessageDigest.getInstance("ripemd160");
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
                HEX_FORMAT.formatHex(hash, 0, 20),
                HEX_FORMAT.formatHex(work1), HEX_FORMAT.formatHex(work2));
    }
}
