package com.twitter.teruteru128.study.twitter;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

import twitter4j.StatusUpdate;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.conf.ConfigurationBuilder;

public class Falcon {

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        List<String> falcon = Arrays.asList("フ", "ァ", "ル", "コ", "ン", "・", "パ", "ン", "チ");
        var random = SecureRandom.getInstanceStrong();
        Collections.shuffle(falcon, random);
        var tweetText = falcon.stream().collect(StringBuilder::new, (a, b) -> a.append(b), (a, b) -> a.append(b))
                .toString();
        System.out.println(tweetText);
        Properties systemProperties = System.getProperties();
        Properties properties = new Properties(systemProperties);
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
        try {
            var statusUpdate = new StatusUpdate(tweetText);
            var path = Paths.get("status.txt");
            var statusID = Long.valueOf(Files.readString(path, StandardCharsets.UTF_8), 10);
            statusUpdate.setInReplyToStatusId(statusID);
            var status2 = twitter.updateStatus(statusUpdate);
            var newStatusID = status2.getId();
            if (Files.exists(path))
                Files.delete(path);
            Files.writeString(path, Long.toString(newStatusID, 10));
        } catch (TwitterException | IOException e) {
            e.printStackTrace();
        }
    }
}
