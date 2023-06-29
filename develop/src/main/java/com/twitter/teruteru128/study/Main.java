package com.twitter.teruteru128.study;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.MessageDigest;
import java.security.SecureRandom;
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
        long loadstart = System.nanoTime();
        var p = Paths.get("D:\\keys\\public\\publicKeys0.bin");
        ByteBuffer direct = ByteBuffer.allocateDirect(1090519040);
        try (var c = FileChannel.open(p, StandardOpenOption.READ)) {
            long l = c.read(direct);
            System.out.printf("read buffers: %d%n", l);
        }
        long loadDone = System.nanoTime();
        System.err.printf("開幕 ここまで%f秒%n", (loadDone - loadstart) / 1e9);
        var tasks = new ArrayList<Task>(16);
        var status = new Status();
        for (int i = 0; i < 16; i++) {
            tasks.add(new Task(direct, status));
        }
        var pool = Executors.newCachedThreadPool();
        pool.invokeAny(tasks);
        pool.shutdown();
        System.err.printf("開幕からここまで%f秒%n", (System.nanoTime() - loadDone) / 1e9);
    }

}
