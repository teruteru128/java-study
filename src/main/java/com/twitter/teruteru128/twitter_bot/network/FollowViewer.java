package com.twitter.teruteru128.twitter_bot.network;

import java.util.ArrayList;
import java.util.List;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.auth.AccessToken;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;

import com.twitter.teruteru128.twitter_bot.AccountManager;
import com.twitter.teruteru128.twitter_bot.ConfigurationLodaer;
import com.twitter.teruteru128.twitter_bot.ConsumerKey;

/**
 * @author Teruteru
 *
 */
public class FollowViewer implements Runnable {
    private AccountManager manager = null;

    @Override
    public void run() {
        manager = AccountManager.getInstance();
        ConsumerKey key = ConfigurationLodaer
                .loadConsumerKey(".\\data\\keys.xml");
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setOAuthConsumerKey(key.getConsumerKey());
        cb.setOAuthConsumerSecret(key.getConsumerSecret());
        cb.setGZIPEnabled(true);
        cb.setAsyncNumThreads(4);
        Configuration conf = cb.build();
        TwitterFactory tf = new TwitterFactory(conf);
        ArrayList<AccessToken> keys = ConfigurationLodaer
                .loadAccessToken(".\\data\\keys.xml");
        Twitter twitter = tf.getInstance(keys.get(0));
        try {
            User target = twitter.verifyCredentials();
            NetWork network = new NetWork(twitter);
            List<User> follows_L = network.getFollows(target);
            String[] follows = follows_L
                    .stream()
                    .<String> map(
                            (v) -> String.format("%s@%s(%d)",
                                    v.getScreenName(), v.getName(), v.getId()))
                    .toArray(String[]::new);
            for (String id : follows) {
                System.out.println(id);
            }
        } catch (TwitterException e) {
            e.printStackTrace();
        }

    }
}
