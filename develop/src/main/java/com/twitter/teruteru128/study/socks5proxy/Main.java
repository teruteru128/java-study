package com.twitter.teruteru128.study.socks5proxy;

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
import java.nio.charset.Charset;

public class Main {

    public static void main(String[] args) throws UnknownHostException, IOException {
        URI uri = URI.create("http://xiwayy2kn32bo3ko.onion/tor/dat/1525034784.dat");
        Proxy proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(InetAddress.getLoopbackAddress(), 9050));
        URL url = uri.toURL();
        // 通信関係ってかなり厳重に隠蔽されてるんですね……
        HttpURLConnection connection = (HttpURLConnection) url.openConnection(proxy);
        connection.addRequestProperty("If-None-Match", "\"b7fd84d-50892-5e286b79\"");
        connection.connect();
        int responseCode = connection.getResponseCode();
        System.out.println(responseCode);
        switch (responseCode) {
            case HttpURLConnection.HTTP_OK:
                try (BufferedReader reader = new BufferedReader(
                        new InputStreamReader(connection.getInputStream(), Charset.forName("SJIS")))) {
                    reader.lines().forEach(System.out::println);
                }
                break;

            default:
                System.out.printf("%d : %s\n", responseCode, connection.getResponseMessage());
                for (var e : connection.getHeaderFields().entrySet()) {
                    var key = e.getKey();
                    var val = e.getValue();
                    if (key == null) {
                        System.out.printf("<%s> : %s%n", key, val);
                    } else {
                        System.out.printf("%s : %s%n", key, val);
                    }
                }
                break;
        }
    }

}
