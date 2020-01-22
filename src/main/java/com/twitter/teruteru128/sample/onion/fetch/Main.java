package com.twitter.teruteru128.sample.onion.fetch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.regex.Matcher;

public class Main {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://xiwayy2kn32bo3ko.onion/tor/subject.txt");
		Proxy proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(InetAddress.getLoopbackAddress(), 9050));
		var connection = (HttpURLConnection) url.openConnection(proxy);
		connection.connect();
		int rescode = connection.getResponseCode();
		if (rescode == 200) {
			try (BufferedReader reader = new BufferedReader(
					new InputStreamReader(connection.getInputStream(), "SJIS"))) {
				reader.lines().map(l -> BBSThread.pattern.matcher(l)).filter(Matcher::matches)
						.map(m -> new BBSThread(Long.valueOf(m.group(2), 10), m.group(1), m.group(3),
								Integer.valueOf(m.group(4), 10))).forEach(System.out::println);
			}
		} else {
			System.out.printf("response code : %d%n", rescode);
		}
	}

}
