package com.twitter.teruteru128.study.twitter.test02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jakarta.xml.bind.JAXB;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;

/**
 * @author Teruteru
 *
 */
public class Main {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws Exception {
        Twitter twitter = TwitterFactory.getSingleton();
        twitter.setOAuthConsumer("GeogKDXsv92ARCFL0jNDmw",
                "9g2VHWumoigKOwieEB8gV4QGtyFHjdtwG4WmJMcDHQ8");
        RequestToken requestToken = twitter.getOAuthRequestToken();
        AccessToken accessToken = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out
                .println("Open the following URL and grant access to your account:");
        System.out.println(requestToken.getAuthorizationURL());
        // com.twitter.teruteru128.test.browser.Main.openBrowser(requestToken.getAuthorizationURL());

        System.out
                .print("Enter the PIN(if aviailable) or just hit enter.[PIN]:");
        String pin = br.readLine();
        try {
            if (pin.length() > 0) {
                accessToken = twitter.getOAuthAccessToken(requestToken, pin);
            } else {
                accessToken = twitter.getOAuthAccessToken();
            }
            br.close();
        } catch (TwitterException te) {
            if (401 == te.getStatusCode()) {
                System.out.println("Unable to get the access token.");
            } else {
                te.printStackTrace();
            }
        }
        JAXB.marshal(accessToken, System.out);
    }

}
