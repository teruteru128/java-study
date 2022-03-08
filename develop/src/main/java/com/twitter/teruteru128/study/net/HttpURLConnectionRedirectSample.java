package com.twitter.teruteru128.study.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.zip.GZIPInputStream;

public class HttpURLConnectionRedirectSample {

    private static final String DEFAULT_USER_AGENT = "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:36.0) Gecko/20100101 Firefox/36.0";

    public static void main(String[] args) throws MalformedURLException, IOException {
        HttpURLConnection.setFollowRedirects(true);
        URL url = new URL("http://www.yahoo.co.jp/");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestProperty("User-Agent", DEFAULT_USER_AGENT);
        con.setRequestProperty("Cache-Control", "max-age=0");
        con.setRequestProperty("Accept-Language", "ja,en-US;q=0.7,en;q=0.3");
        con.setRequestProperty("Accept-Encoding", "gzip,deflate");
        // https://mkyong.com/java/java-httpurlconnection-follow-redirect-example/
        con.setInstanceFollowRedirects(true);
        con.connect();
        boolean redirect = false;
        switch (con.getResponseCode()) {
            case HttpURLConnection.HTTP_MOVED_PERM:
            case HttpURLConnection.HTTP_MOVED_TEMP:
            case HttpURLConnection.HTTP_SEE_OTHER:
                redirect = true;
                break;

            default:
                // NONE
                break;
        }
        if (redirect) {
            String location = con.getHeaderField("Location");
            con = (HttpURLConnection) new URL(location).openConnection();
            con.setRequestProperty("User-Agent", DEFAULT_USER_AGENT);
            con.setRequestProperty("Cache-Control", "max-age=0");
            con.setRequestProperty("Accept-Language", "ja,en-US;q=0.7,en;q=0.3");
            con.setRequestProperty("Accept-Encoding", "gzip,deflate");
            System.out.println(con.getClass());
            con.connect();
        }
        String contentEncoding = con.getHeaderField("Content-Encoding");
        try (BufferedReader urlIn = new BufferedReader(new InputStreamReader(
                contentEncoding.contains("gzip") ? new GZIPInputStream(con.getInputStream()) : con.getInputStream(),
                "UTF-8"))) {
            urlIn.lines().forEach(System.out::println);
        }
        con.disconnect();
    }
}
