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

    public static void main(String[] args) {
        try {
            String str = null;
            URL url = new URI("http://www.yahoo.co.jp/").toURL();
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:36.0) Gecko/20100101 Firefox/36.0");
            con.setRequestProperty("Cache-Control", "max-age=0");
            con.setRequestProperty("Accept-Language", "ja,en-US;q=0.7,en;q=0.3");
            con.setRequestProperty("Accept-Encoding", "gzip,deflate");
            con.connect();
            System.out.println(con.getHeaderField("Content-Encoding"));
            BufferedReader urlIn = new BufferedReader(new InputStreamReader(
                    new GZIPInputStream(con.getInputStream()),"UTF-8"));
            try {
                while ((str = urlIn.readLine()) != null) {
                    System.out.println(str);
                }
            } finally {
                urlIn.close();
            }
            con.disconnect();
        } catch (MalformedURLException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        } catch (URISyntaxException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        } catch (IOException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }
    }
}
