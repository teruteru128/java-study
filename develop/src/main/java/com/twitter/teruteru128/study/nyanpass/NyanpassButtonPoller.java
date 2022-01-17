package com.twitter.teruteru128.study.nyanpass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.json.JSONObject;
import org.json.JSONTokener;

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
            try (InputStream in = NYANPASS_URI.toURL().openStream();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
                JSONObject object = new JSONObject(new JSONTokener(reader));
                LocalDateTime time = LocalDateTime.parse(object.getString("time"), FORMATTER);
                long count = object.getLong("count");
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
