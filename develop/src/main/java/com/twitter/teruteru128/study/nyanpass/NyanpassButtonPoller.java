package com.twitter.teruteru128.study.nyanpass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import jakarta.json.Json;
import jakarta.json.JsonReader;

/**
 * nyanpass.com からカウントを取得して標準出力へ表示します.
 * 
 * TODO ポーリングと表示の分離
 */
public class NyanpassButtonPoller implements Runnable {
    private static final URI NYANPASS_URI = URI.create("http://nyanpass.com/api/get_count");
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.JAPAN);
    private NyanpassConfig config;
    private NyanpassDAO dao;

    public NyanpassButtonPoller(NyanpassConfig config) {
        this.config = config;
        NyanpassDAOFactory factory = new NyanpassDAOFactory(config);
        this.dao = factory.getInstance();
    }

    @Override
    public void run() {
        try {
            dao.getNyanpassBean();
            try (JsonReader reader = Json.createReader( new BufferedReader(new InputStreamReader(NYANPASS_URI.toURL().openStream())))) {
                var object = reader.readObject();
                LocalDateTime time = LocalDateTime.parse(object.getString("time"), FORMATTER);
                long count = object.getJsonNumber("count").longValue();
                config.getQueue().put(new NyanpassBean(time, count));
            }
        } catch (NyanpassException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
