package com.twitter.teruteru128.twitter_bot.plugin;

import twitter4j.RawStreamListener;

/**
 * @author 
 *
 */
public class Plugin1 implements RawStreamListener {

    /** (非 Javadoc)
     * @see twitter4j.StreamListener#onException(java.lang.Exception)
     */
    @Override
    public void onException(Exception ex) {
        
    }

    /** (非 Javadoc)
     * @see twitter4j.RawStreamListener#onMessage(java.lang.String)
     */
    @Override
    public void onMessage(String rawString) {
        System.out.println(rawString);
    }

}
