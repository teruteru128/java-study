package com.twitter.teruteru128.study.twitter.util;

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
        return new ConfigurationBuilder().setOAuthConsumerKey("gcuJV4HNAhbk1FfxoDcLUha8j")
                .setOAuthConsumerSecret("IxGTRgCgSW26rxS4MhCEK5jnEp18NjLHPpiAsHaZhetWUkdDNg").build();
    }

    public static Twitter createTwitter() {
        return createTwitter("533912006-2jVKx5NtsfgohUVj6jXh8m1FJWiJPlgQS3iOiaWp",
                "XSNc4KBY582beZG9dYB9rNmqKKCqCNstUPavvT2PYlagw");
    }

    public static Twitter createTwitter(String token, String tokenSecret) {
        return new TwitterFactory(buildConfiguration()).getInstance(new AccessToken(token, tokenSecret));
    }
}
