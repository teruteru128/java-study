package com.twitter.teruteru128.nyanpass;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import jakarta.json.Json;

/**
 * Crawler
 */
public class NyanpassCrawler2 implements Runnable {

    public NyanpassCrawler2() {
        try {
            nyanpassUrl = new URL("https://nyanpass.com/api/get_count");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.JAPAN);

    URL nyanpassUrl = null;

    @Override
    public void run() {
        try {
            HttpURLConnection connection = (HttpURLConnection) nyanpassUrl.openConnection();
            connection.addRequestProperty("Connection", "close");
            connection.connect();
            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                try (var reader = Json
                        .createReader(new BufferedReader(new InputStreamReader(connection.getInputStream())))) {
                    var object = reader.readObject();
                    var time = LocalDateTime.parse(object.getString("time"), FORMATTER);
                    var count = Long.parseLong(object.getString("count"), 10);
                    System.out.printf("%s : %s%n", time, count);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        final var service = new ScheduledThreadPoolExecutor(2);
        System.out.println("にゃんぱすー。定期クロールを開始したのん！");
        service.scheduleAtFixedRate(new NyanpassCrawler2(), 0, 0, TimeUnit.NANOSECONDS);
    }

}
