package com.twitter.teruteru128.study.pixiv;

import java.io.IOException;
import java.io.PrintStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

/**
 * @author Teruteru
 *
 */
public class TokenTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            URL pixivLoginURL = new URI(
                    "https://www.secure.pixiv.net/login.php").toURL();
            HttpURLConnection con = (HttpURLConnection) pixivLoginURL
                    .openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Referer", "http://www.pixiv.net/");
            // con.setRequestProperty("User-Agent", "");
            con.setRequestProperty("Connection", "close");
            con.setDoOutput(true);
            String data = "username=meganezaru1024&password=ku61tsur10t0k0&grant_type=password";
            PrintStream ps = new PrintStream(con.getOutputStream());
            ps.print(data);
            ps.close();
            con.connect();
            
            int response = con.getResponseCode();
            System.out.println("Response: " + response);
            CookieManager cm=new CookieManager();
            CookieHandler.setDefault(cm);
            CookieStore store = cm.getCookieStore();
            List<HttpCookie> cookies = store.getCookies();
            cookies.stream().forEach(e->{System.out.printf("name : %s, value : %s%n",e.getName(),e.getValue());});
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }
    }

}
