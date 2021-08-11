package com.twitter.teruteru128.study.twitter;

import java.util.TimerTask;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class TwitterTask extends TimerTask {
    private Twitter twitter = null;
    private int count = 0;
    private int maxCount = 0;

    public TwitterTask(int maxCount) {
        super();
        this.maxCount = maxCount;
    }

    @Override
    public void run() {
        if (twitter == null) {
            twitter = TwitterFactory.getSingleton();
        }
        try {
            twitter.updateStatus("@konton_freedom 混沌ガチャbot:" + count);
            count++;
            if (count >= maxCount) {
                this.cancel();
            }
        } catch (TwitterException e) {
            e.printStackTrace();
        }

    }
}