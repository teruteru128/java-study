package com.twitter.teruteru128.study.twitter.test01;

import java.io.IOException;
import java.util.Properties;

import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;

/**
 * @author Teruteru
 *
 */
public class Test01 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Properties systemProperties = System.getProperties();
        Properties properties = new Properties(systemProperties);
        try (var in = ClassLoader.getSystemResourceAsStream("twitter4j.properties")) {
            properties.load(in);
        } catch (IOException e) {
        }
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setOAuthConsumerKey(properties.getProperty("oauth.consumerKey"));
        cb.setOAuthConsumerSecret(properties.getProperty("oauth.consumerSecret"));
        Configuration conf = cb.build();
        TwitterFactory tf = new TwitterFactory(conf);
        AccessToken at = new AccessToken(properties.getProperty("oauth.accessToken"),
                properties.getProperty("oauth.accessTokenSecret"));
        Twitter t = tf.getInstance(at);
        try {
            ResponseList<Status> rls = t.getFavorites();
            for (Status s : rls) {
                System.out.print(s.getUser().getName());
                System.out.print(" : ");
                System.out.println(s.getText());
            }
        } catch (TwitterException e) {
            e.printStackTrace();
        }

    }

}
