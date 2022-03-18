package com.twitter.teruteru128.study;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
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
import java.util.function.IntFunction;

import com.twitter.teruteru128.study.utf8.UTF8DecodeSample;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws Exception {
        var service = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(12);
        // 普通こうやって時間のかかる処理を裏でやらせるための機能だよね……？
        var start = LocalDateTime.now();
        var randomFuture = service.schedule(() -> {
            var random = SecureRandom.getInstance("NativePRNG");
            return new StringBuilder(4).append((char) random.nextInt('A', 'Z' + 1))
                    .append((char) random.nextInt('A', 'Z' + 1))
                    .append((char) random.nextInt('A', 'Z' + 1)).append((char) random.nextInt('A', 'Z' + 1)).toString();
        }, 0, TimeUnit.NANOSECONDS);
        var token = randomFuture.get();
        var finish = LocalDateTime.now();
        var nanos = start.until(finish, ChronoUnit.NANOS);
        var seconds = nanos / 1000000000L;
        nanos = nanos % 1000000000L;
        System.out.printf("%s, %d.%09d%n", token, seconds, nanos);
        service.schedule(new UTF8DecodeSample(), 0, TimeUnit.NANOSECONDS);
        List<Callable<String>> list = new ArrayList<>(16);
        // 1つのint値引数を受け取って「結果を返し、例外をスローすることがあるシリアライズ可能なタスク」を生成する関数
        @SuppressWarnings("unchecked")
        var intfunction = (IntFunction<Callable<String>>) i -> (Callable<String> & Serializable) () -> Integer
                .toString(i);
        // Listにタスクを詰める
        for (int i = 0; i < 16; i++) {
            var callable = intfunction.apply(i);
            list.add(callable);
        }
        // listごとシリアライズ&デシリアライズ
        var serializedList = serialize(list);
        var deserializedList = deserialize(serializedList);
        // そのままスレッドプールに渡す
        var futures = service.invokeAll(deserializedList);
        // 結果を出力する
        for (Future<String> future : futures) {
            System.out.println(future.get());
        }
        service.schedule(() -> {
            System.out.println("シャットダウンします……");
            service.shutdown();
        }, 0, TimeUnit.SECONDS);
    }

    // シリアライズ
    static byte[] serialize(List<Callable<String>> object) throws IOException {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            try (ObjectOutputStream oos = new ObjectOutputStream(bos)) {
                oos.writeObject(object);
            }
            return bos.toByteArray();
        }
    }

    // デシリアライズ
    static List<Callable<String>> deserialize(byte[] bytes) throws IOException, ClassNotFoundException {
        try (ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
                ObjectInputStream ois = new ObjectInputStream(bis)) {
            @SuppressWarnings("unchecked")
            List<Callable<String>> supplier = (List<Callable<String>>) ois.readObject();
            return supplier;
        }
    }
}
