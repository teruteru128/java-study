package com.twitter.teruteru128.sample.nyanpass;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * */
public class Main {

	public static void main(String[] args) throws Exception {
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor(Executors.defaultThreadFactory());
		System.out.println("start : " + Main.class.getName());
		service.scheduleAtFixedRate(new Runnable() {
			@Override
		public void run() {
				System.out.println("start : runnable");
				final URI NYANPASS_URI = URI.create("http://nyanpass.com/api/get_count");
				try(InputStream in= NYANPASS_URI.toURL().openStream(); BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
					System.out.println(reader.readLine());
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
				}
		}},0, 29, TimeUnit.MINUTES);
		/*
		NyanpassConfigBuilder builder = new NyanpassConfigBuilder();
		NyanpassConfig config = builder.build();
		service.scheduleAtFixedRate(new NyanpassButtonPoller(config), 0, 5, TimeUnit.MINUTES);
		service.execute(new StdoutTask(config));
		*/
	}

}
