package com.twitter.teruteru128.study.twitter;

import java.security.SecureRandom;

import com.twitter.teruteru128.modules.twitter.util.Util;
import com.twitter.teruteru128.twitter_bot.TwitterBotException;

import twitter4j.Twitter;
import twitter4j.TwitterException;

public class FalconPunch implements Runnable {

    private SecureRandom rnd;
    private Twitter twitter;

    public FalconPunch() {
        twitter = Util.getTwitter();
        rnd = new SecureRandom();
    }

    @Override
    public void run() {
        var msg = shuffleStr("ファルコン・パンチ");
        try {
            tweet(msg);
        } catch (TwitterException e) {
            e.printStackTrace();
            throw new TwitterBotException(e);
        }
    }

    private void tweet(String msg) throws TwitterException {
        twitter.updateStatus(msg);
    }

    private String shuffleStr(String string) {
        var chars = string.toCharArray();
        char c = 0;
        int index;
        for (int i = chars.length - 1; i > 0; i--) {
            index = rnd.nextInt(i);
            c = chars[i];
            chars[i] = chars[index];
            chars[index] = c;
        }
        return String.valueOf(chars);
    }
}
