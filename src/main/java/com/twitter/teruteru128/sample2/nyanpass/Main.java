package com.twitter.teruteru128.sample2.nyanpass;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * */
public class Main {

	public static void main(String[] args) throws Exception {
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor(Executors.defaultThreadFactory());
		service.scheduleAtFixedRate(() -> {
			try{
				final URL NYANPASS_URL = new URL("https://nyanpass.com/api/get_count");
				HttpURLConnection connection= (HttpURLConnection) NYANPASS_URL.openConnection();
				try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
					reader.lines().forEach(System.out::println);
				}} catch (Exception e) {
					e.printStackTrace();
				}
			}
		, 0, 5, TimeUnit.SECONDS);
		/*
		NyanpassConfigBuilder builder = new NyanpassConfigBuilder();
		NyanpassConfig config = builder.build();
		service.scheduleAtFixedRate(new NyanpassButtonPoller(config), 0, 5, TimeUnit.MINUTES);
		service.execute(new StdoutTask(config));
		*/
	}

}
