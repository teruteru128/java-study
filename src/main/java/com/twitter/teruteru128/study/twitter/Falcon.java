package com.twitter.teruteru128.study.twitter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.SecureRandom;

import twitter4j.StatusUpdate;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.conf.ConfigurationBuilder;

public class Falcon {

    public Falcon() {
        super();
    }

    private static final <T> void swap(T[] arr, int i, int j) {
        T tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        String[] falcon = { "フ", "ァ", "ル", "コ", "ン", "・", "パ", "ン", "チ" };
        var random = new SecureRandom();
        for (var i = falcon.length; i > 1; i--) {
            swap(falcon, i - 1, random.nextInt(i - 1));
        }
        var a = new StringBuilder(9);
        for (var string : falcon) {
            System.out.print(string);
            a.append(string);
        }
        System.out.println();
        var builder = new ConfigurationBuilder();
        builder.setOAuthConsumerKey("");
        builder.setOAuthConsumerSecret("");
        var factory = new TwitterFactory(builder.build());
        var twitter = factory.getInstance(new AccessToken("", ""));
        try {
            var statusUpdate = new StatusUpdate(a.toString());
            var path = Paths.get("status.txt");
            var statusID = Long.valueOf(Files.readString(path));
            statusUpdate.setInReplyToStatusId(statusID);
            var status2 = twitter.updateStatus(statusUpdate);
            var newStatusID = status2.getId();
            Files.delete(path);
            Files.writeString(path, Long.toString(newStatusID));
        } catch (TwitterException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
