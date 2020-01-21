package com.twitter.teruteru128.sample2.socks5proxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URI;
import java.net.URL;
import java.net.UnknownHostException;

public class Main {

	public static void main(String[] args) throws UnknownHostException, IOException {
		URI uri = URI.create("http://mepsoo7dhu3ylzd4.onion/onel/");
		Proxy proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(InetAddress.getLoopbackAddress(), 9050));
		URL url = uri.toURL();
		// 通信関係ってかなり厳重に隠蔽されてるんですね……
		HttpURLConnection connection = (HttpURLConnection) url.openConnection(proxy);

		try(BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))){
			reader.lines().forEach(System.out::println);
		}
	}

}
