package com.twitter.teruteru128.test.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.zip.GZIPInputStream;

public class Test {

    public static void main(String[] args) throws MalformedURLException, URISyntaxException, IOException {
        String str = null;
        HttpURLConnection.setFollowRedirects(true);
        URL url = new URI("http://www.yahoo.co.jp/").toURL();
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestProperty("User-Agent",
                "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:36.0) Gecko/20100101 Firefox/36.0");
        con.setRequestProperty("Cache-Control", "max-age=0");
        con.setRequestProperty("Accept-Language", "ja,en-US;q=0.7,en;q=0.3");
        con.setRequestProperty("Accept-Encoding", "gzip,deflate");
        // https://mkyong.com/java/java-httpurlconnection-follow-redirect-example/
        con.setInstanceFollowRedirects(true);
        con.connect();
        int responseCode = con.getResponseCode();
        String responseMessage = con.getResponseMessage();
        System.out.println(responseCode);
        System.out.println(responseMessage);
        boolean redirect = false;
        if (responseCode != HttpURLConnection.HTTP_OK && (responseCode == HttpURLConnection.HTTP_MOVED_TEMP
                || responseCode == HttpURLConnection.HTTP_MOVED_PERM
                || responseCode == HttpURLConnection.HTTP_SEE_OTHER)) {
            redirect = true;
        }
        if (redirect) {
            String location = con.getHeaderField("Location");
            con = (HttpURLConnection) new URL(location).openConnection();
            con.setRequestProperty("User-Agent",
                    "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:36.0) Gecko/20100101 Firefox/36.0");
            con.setRequestProperty("Cache-Control", "max-age=0");
            con.setRequestProperty("Accept-Language", "ja,en-US;q=0.7,en;q=0.3");
            con.setRequestProperty("Accept-Encoding", "gzip,deflate");
            con.connect();
        }
        System.out.println(con.getHeaderField("Content-Encoding"));
        try (BufferedReader urlIn = new BufferedReader(new InputStreamReader(
                con.getHeaderField("Content-Encoding").contains("gzip") ? new GZIPInputStream(con.getInputStream())
                        : con.getInputStream(),
                "UTF-8"))) {
            while ((str = urlIn.readLine()) != null) {
                System.out.println(str);
            }
        }
        con.disconnect();
    }
}
