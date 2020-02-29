package com.twitter.teruteru128.study.nyanpass;

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
import java.util.function.Function;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

/**
 *
 * */
public class Main2 implements Runnable {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.JAPAN);
    private static final Gson gson = new Gson();

    private Runnable get(final URL url) {
        return () -> {
            try {
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.addRequestProperty("Connection", "close");
                connection.connect();
                if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                    try (BufferedReader reader = new BufferedReader(
                            new InputStreamReader(connection.getInputStream()))) {
                        String a = reader.readLine();
                        var obj = gson.fromJson(a, JsonObject.class);
                        var time = LocalDateTime.parse(obj.get("time").getAsString(), FORMATTER);
                        var count = Long.parseLong(obj.get("count").getAsString());
                        System.out.printf("%s : %s\n", time, count);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
    }

    @Override
    public void run() {
        URL NYANPASS_URL = null;
        try {
            NYANPASS_URL = new URL("https://nyanpass.com/api/get_count");
            service.scheduleAtFixedRate(get(NYANPASS_URL), 0, 5, TimeUnit.SECONDS);
            Thread.sleep(1000 * 60);
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

    private static final ScheduledExecutorService service = new ScheduledThreadPoolExecutor(2);

    public static void main(String[] args) throws Exception {
        System.out.println("にゃんぱすー。定期クロールを開始したのん！");
        service.execute(new Main2());
    }

}
