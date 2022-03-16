package com.twitter.teruteru128.study;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.twitter.teruteru128.study.bitmessage.AddressKeyPairs;
import com.twitter.teruteru128.study.bitmessage.KeyPair;
import com.twitter.teruteru128.study.bitmessage.MultiThreadRipeGenerator;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws Exception {
        var service = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(12);
        // service.schedule(new Shangri_laFrontierCountDown(), 0, TimeUnit.NANOSECONDS);
        // service.schedule(new ServiceCallSample(), 0, TimeUnit.NANOSECONDS);
        // var study = args.length >= 1 ? new SwingStudy(Path.of(args[0])) : new
        // SwingStudy();
        // service.schedule(study, 0, TimeUnit.NANOSECONDS);
        // 普通こうやって時間のかかる処理を裏でやらせるための機能だよね……？
        var randomFuture = service.schedule(() -> {
            var random = SecureRandom.getInstance("NativePRNG");
            return new StringBuilder(4).append((char) random.nextInt('A', 'Z' + 1))
                    .append((char) random.nextInt('A', 'Z' + 1))
                    .append((char) random.nextInt('A', 'Z' + 1)).append((char) random.nextInt('A', 'Z' + 1)).toString();
        }, 0, TimeUnit.NANOSECONDS);
        var keysFuture = service.schedule(() -> {
            var list = new ArrayList<KeyPair>(16777216 * 8);
            byte[] pribuf = new byte[32];
            byte[] pubbuf = new byte[65];
            for (int i = 0; i < 8; i++) {
                try (RandomAccessFile pubfile = new RandomAccessFile(new File(String.format("publicKeys%d.bin", i)),
                        "r");
                        FileChannel pubchannel = pubfile.getChannel();
                        RandomAccessFile prifile = new RandomAccessFile(new File(String.format("privateKeys%d.bin", i)),
                                "r");
                        FileChannel prichannel = pubfile.getChannel()) {
                    MappedByteBuffer pubbuffer = pubchannel.map(MapMode.READ_ONLY, 0, pubfile.length());
                    MappedByteBuffer pribuffer = prichannel.map(MapMode.READ_ONLY, 0, prifile.length());
                    pubbuffer.get(pubbuf);
                    pribuffer.get(pribuf);
                    list.add(new KeyPair(pribuf, pubbuf));
                }
            }
            return list;
        }, 0, TimeUnit.NANOSECONDS);
        var keyPairList = keysFuture.get();
        // 2の27乗件(1億3000万件)のsecp256k1鍵があるので70兆件ぐらいのアドレスがフィルターを通過するはず
        keyPairList.parallelStream().flatMap(s -> keyPairList.stream().map(e -> new AddressKeyPairs(s, e)))
                .map(new MultiThreadRipeGenerator()).filter(a -> a.getRipe()[0] == 0);
        // service.schedule(new UTF8DecodeSample(), 0, TimeUnit.NANOSECONDS);
        System.out.println(randomFuture.get());
        service.schedule(() -> {
            System.out.println("シャットダウンします……");
            service.shutdown();
        }, 0, TimeUnit.SECONDS);
    }
}
