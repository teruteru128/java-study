package com.twitter.teruteru128.twitter_bot;

import java.util.ArrayList;

import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;

/**
 * @author てるてる
 *
 */
public class Bot implements Runnable {
    public static AccountManager manager = null;
    // public static String screenName = null;
    // private TwitterStream stream;

    /**
     * 
     */
    public Bot() {
    }

    /**
     * (非 Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        System.err.println("During initialization...");
        System.err.println("AccountManager Creating...");
        manager = AccountManager.getInstance();
        System.err.println("AccountManager Created.");
        System.err.println("ConsumerKey loading...");
        ConsumerKey key = ConfigurationLodaer.loadConsumerKey("keys.xml");
        System.err.println("ConsumerKey loaded.");
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setOAuthConsumerKey(key.getConsumerKey());
        cb.setOAuthConsumerSecret(key.getConsumerSecret());
        cb.setGZIPEnabled(true);
        cb.setAsyncNumThreads(4);
        Configuration conf = cb.build();
        TwitterFactory tf = new TwitterFactory(conf);
        System.err.println("TwitterFactory created.");
        // AccountManager作成
        // accesstoken読み込み
        System.err.println("AccessToken loading...");
        ArrayList<AccessToken> keys = ConfigurationLodaer.loadAccessToken("keys.xml");
        System.err.println("AccessToken loaded.");
        System.err.println("OAuthAuthorization created.");
        System.err.println("twitter instnce creating...");
        // keys.stream().skip(1).forEach(e -> manager.add(tf.getInstance(e)));
        keys.stream().map(m -> {
            System.err.println("twitter instnce created.");
            return tf.getInstance(m);
        }).forEach(e -> {
            manager.add(e);
        });
        System.err.println("TwitterStreamFactory creating...");
    }

}
