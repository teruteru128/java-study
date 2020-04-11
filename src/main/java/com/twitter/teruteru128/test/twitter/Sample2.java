package com.twitter.teruteru128.test.twitter;

import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;

import com.twitter.teruteru128.modules.twitter.util.Util;
import com.twitter.teruteru128.util.Printer;

public class Sample2 {

    public static void main(String[] args) {
        Twitter twitter = Util.getTwitter();
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
