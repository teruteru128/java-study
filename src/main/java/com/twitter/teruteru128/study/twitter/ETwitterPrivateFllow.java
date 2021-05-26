package com.twitter.teruteru128.study.twitter;

import java.io.IOException;
import java.util.Properties;

import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.auth.AccessToken;
import twitter4j.conf.ConfigurationBuilder;

public class ETwitterPrivateFllow {
    public static void main(String[] args) throws IOException, TwitterException {
        final var systemProperties = System.getProperties();
        final var properties = new Properties(systemProperties);
        try (var in = ClassLoader.getSystemResourceAsStream("twitter4j.properties")) {
            properties.load(in);
        }
        var builder = new ConfigurationBuilder();
        builder.setOAuthConsumerKey(properties.getProperty("oauth.consumerKey"));
        builder.setOAuthConsumerSecret(properties.getProperty("oauth.consumerSecret"));
        var factory = new TwitterFactory(builder.build());
        var token = new AccessToken(properties.getProperty("oauth.accessToken"),
                properties.getProperty("oauth.accessTokenSecret"));
        var twitter = factory.getInstance(token);
        var page = 1655046613472739561L;
        var list = twitter.getFriendsList("teruteru128", page);
        try {
            while (true) {
                for (User user : list) {
                    if (user.isProtected()) {
                        System.out.printf("%s(@%s)%n", user.getName(), user.getScreenName());
                    }
                }
                if (!list.hasNext()) {
                    break;
                }
                page = list.getNextCursor();
                list = twitter.getFriendsList("teruteru128", page);
            }
        } catch (TwitterException e) {
            System.out.printf("page : %d%n", page);
            throw e;
        }
    }
}
