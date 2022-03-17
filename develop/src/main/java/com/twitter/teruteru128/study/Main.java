package com.twitter.teruteru128.study;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.twitter.teruteru128.study.bitmessage.KeyPair;

/**
 * Main
 */
public class Main {

    private static final class CallableImplementation implements Callable<List<KeyPair>> {
        private int i;

        public CallableImplementation(int i) {
            this.i = i;
        }

        @Override
        public List<KeyPair> call() throws Exception {
            var list = new ArrayList<KeyPair>(16777216 * 8);
            byte[] pubkeysallbyte = Files.readAllBytes(new File(String.format("../publicKeys%d.bin", i)).toPath());
            byte[] prikeysallbyte = Files.readAllBytes(new File(String.format("../privateKeys%d.bin", i)).toPath());
            int pubkeyoffset = 0;
            int prikeyoffset = 0;
            for (var i = 0; i < 16777216; i++, pubkeyoffset += 65, prikeyoffset += 32) {
                list.add(new KeyPair(prikeysallbyte, prikeyoffset, 32, pubkeysallbyte, pubkeyoffset, 65));
            }
            Runtime.getRuntime().gc();
            return list;
        }
    }

    public static void main(String[] args) throws Exception {
        var service = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(12);
        // service.schedule(new Shangri_laFrontierCountDown(), 0, TimeUnit.NANOSECONDS);
        // service.schedule(new ServiceCallSample(), 0, TimeUnit.NANOSECONDS);
        // var study = args.length >= 1 ? new SwingStudy(Path.of(args[0])) : new
        // SwingStudy();
        // service.schedule(study, 0, TimeUnit.NANOSECONDS);
        // 普通こうやって時間のかかる処理を裏でやらせるための機能だよね……？
        /* var randomFuture = service.schedule(() -> {
            var random = SecureRandom.getInstance("NativePRNG");
            return new StringBuilder(4).append((char) random.nextInt('A', 'Z' + 1))
                    .append((char) random.nextInt('A', 'Z' + 1))
                    .append((char) random.nextInt('A', 'Z' + 1)).append((char) random.nextInt('A', 'Z' + 1)).toString();
        }, 0, TimeUnit.NANOSECONDS);
        System.out.println(randomFuture.get()); */
        List<KeyPair> keyPairList = null;
        var start = LocalDateTime.now();
        /* List<Callable<List<KeyPair>>> cList = new ArrayList<>();
        for (int k = 0; k < 8; k++) {
            cList.add(new CallableImplementation(k));
        }
        System.out.println("p");
        var keysFuture = service.invokeAll(cList);
        System.out.println("q");
        keyPairList = new ArrayList<KeyPair>();new ArrayList<KeyPair>();
        service.schedule(() -> {
            System.out.println("シャットダウンします……");
            service.shutdown();
        }, 0, TimeUnit.SECONDS);
        for (Future<List<KeyPair>> f : keysFuture) {
            keyPairList.addAll(f.get());
        } */
        var finish = LocalDateTime.now();
        try (ObjectInputStream oos = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("/mnt/g/Downloads/ooskeypairlist.bin")), 1024*1024*1024))) {
            keyPairList=(List<KeyPair>)oos.readObject();
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("/mnt/g/Downloads/ooskeypairlist2.bin")), 1024*1024*1024))) {
            for (KeyPair keyPair : keyPairList) {
                oos.writeObject(keyPair);
            }
        }
        System.out.printf("%d, %s%n", keyPairList.size(), start.until(finish, ChronoUnit.MILLIS));
        // 2の27乗件(1億3000万件)のsecp256k1鍵があるので1京8000兆件ぐらいのアドレスが生成されて70兆件ぐらいのアドレスがフィルターを通過するはず
        /*
         * keyPairList.parallelStream().flatMap(s -> keyPairList.stream().map(e -> new
         * AddressKeyPairs(s, e)))
         * .map(new MultiThreadRipeGenerator()).filter(a -> a.getRipe()[0] == 0);
         */
        // service.schedule(new UTF8DecodeSample(), 0, TimeUnit.NANOSECONDS);
    }
}
