package com.twitter.teruteru128.modules.twitter.util;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;

/**
 * 
 * */
public final class Util {

    private static final String CONSUMER_KEY = "GeogKDXsv92ARCFL0jNDmw";
    private static final String CONSUMER_SECRET = "9g2VHWumoigKOwieEB8gV4QGtyFHjdtwG4WmJMcDHQ8";
    private static final String ACCESS_TOKEN = "533912006-ynJc1I8iRnlCMaNtDv0NiIXdhyqF4ymjsGCJ8cop";
    private static final String ACCESS_SECRET = "BxsQiJGD3ZXQ2zXEB5l2rH7zAI553UBIo7SBbt7a0";

    private Util() {
    }

    public static String getConsumerKey() {
        return CONSUMER_KEY;
    }

    public static String getConsumerSecret() {
        return CONSUMER_SECRET;
    }

    public static String getAccessToken() {
        return ACCESS_TOKEN;
    }

    public static String getAccessSecret() {
        return ACCESS_SECRET;
    }

    public static Twitter getTwitter() {
        return TwitterFactory.getSingleton();
    }
}