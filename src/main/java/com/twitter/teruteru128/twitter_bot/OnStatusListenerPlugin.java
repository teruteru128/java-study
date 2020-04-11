package com.twitter.teruteru128.twitter_bot;

import twitter4j.Status;
import twitter4j.Twitter;


/**
 *  
 *
 */@FunctionalInterface
public interface OnStatusListenerPlugin  {
    public void onStatus(Twitter account, Status status);
}
