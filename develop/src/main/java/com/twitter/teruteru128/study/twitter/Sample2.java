package com.twitter.teruteru128.study.twitter;

import com.twitter.teruteru128.util.Printer;

import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class Sample2 {

    public static void main(String[] args) {
        Twitter twitter = TwitterFactory.getSingleton();
        try {
            ResponseList<Status> statuses = twitter.getHomeTimeline();
            Printer.println("Showing home timeline.");
            for (Status status : statuses) {
                Printer.println(status.getUser().getName() + ":"
                        + status.getText());
            }
        } catch (TwitterException e) {
            e.printStackTrace();
        }
    }

}