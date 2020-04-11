package com.twitter.teruteru128.test.twitter.util;

import twitter4j.StatusUpdate;
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
public final class Util {
    private Util() {
    }

    public static void tweet(String tweet) {
        StatusUpdate status = new StatusUpdate(tweet);
        tweet(status);
    }

    public static void tweet(StatusUpdate tweet) {
        Twitter tw = createTwitter();
        try {
            tw.updateStatus(tweet);
        } catch (TwitterException e) {
            e.printStackTrace();
        }

    }

    public static Configuration buildConfiguration() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setOAuthConsumerKey("GeogKDXsv92ARCFL0jNDmw");
        cb.setOAuthConsumerSecret("9g2VHWumoigKOwieEB8gV4QGtyFHjdtwG4WmJMcDHQ8");
        Configuration conf = cb.build();
        return conf;
    }

    public static Twitter createTwitter() {
        Twitter tw = createTwitter(
                "533912006-ynJc1I8iRnlCMaNtDv0NiIXdhyqF4ymjsGCJ8cop",
                "BxsQiJGD3ZXQ2zXEB5l2rH7zAI553UBIo7SBbt7a0");
        return tw;
    }

    public static Twitter createTwitter(String token, String tokenSecret) {
        Configuration conf = buildConfiguration();
        TwitterFactory tf = new TwitterFactory(conf);
        Twitter tw = tf.getInstance(new AccessToken(token, tokenSecret));
        return tw;
    }
}
