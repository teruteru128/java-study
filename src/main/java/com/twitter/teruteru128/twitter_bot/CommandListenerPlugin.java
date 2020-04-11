package com.twitter.teruteru128.twitter_bot;

import twitter4j.Status;
import twitter4j.Twitter;


/**
 * @author 
 *
 */
public interface CommandListenerPlugin {
    String getCommand();
    void onCommand(Twitter account, Status status);
}
