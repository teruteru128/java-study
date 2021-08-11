package com.twitter.teruteru128.study.nyanpass;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.System.Logger.Level;
import java.net.URI;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * TODO nyanpass.com 関連で何かサービス作る
 */
public class Main {
    private static final URI NYANPASS_API_URI = URI.create("https://nyanpass.com/api/get_count");

    public static void main(String[] args) throws Exception {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor(Executors.defaultThreadFactory());
        var logger = System.getLogger("nyanpass observer");
        logger.log(Level.DEBUG, "start : Main.main()");
        service.scheduleAtFixedRate(() -> {

            try (InputStream in = NYANPASS_API_URI.toURL().openStream();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
                logger.log(Level.INFO, "%s", reader.readLine());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, 0, 5, TimeUnit.SECONDS);
        Thread.sleep(300000L); // 5mins
        service.shutdown();
    }

}
