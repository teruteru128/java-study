package com.twitter.teruteru128.nyanpass;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import jakarta.json.Json;

/**
 *
 * */
public class Main2 implements Runnable {

    public Main2(ScheduledExecutorService service) {
        super();
        this.service = service;
    }

    private ScheduledExecutorService service;

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.JAPAN);

    private Runnable get(final URL url) {
        return () -> {
            try {
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.addRequestProperty("Connection", "close");
                connection.connect();
                if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                    try (var reader = Json.createReader(new BufferedReader(new InputStreamReader(connection.getInputStream())))) {
                        var object = reader.readObject();
                        var time = LocalDateTime.parse(object.getString("time"), FORMATTER);
                        var count = Long.parseLong(object.getString("count"), 10);
                        System.out.printf("%s : %s%n", time, count);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
    }

    @Override
    public void run() {
        URL nyanpassUrl;
        try {
            nyanpassUrl = new URL("https://nyanpass.com/api/get_count");
            service.scheduleAtFixedRate(get(nyanpassUrl), 0, 5, TimeUnit.SECONDS);
            Thread.sleep(1000L * 60);
        } catch (MalformedURLException e1) {
            e1.printStackTrace();
            System.exit(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        } finally {
            System.out.println("シャットダウンするのん");
            service.shutdown();
        }
    }

    public static void main(String[] args) {
        final ScheduledThreadPoolExecutor service = new ScheduledThreadPoolExecutor(2);
        System.out.println("にゃんぱすー。定期クロールを開始したのん！");
        service.schedule(new Main2(service), 0, TimeUnit.NANOSECONDS);
    }

}
