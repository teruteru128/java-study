package com.twitter.teruteru128.twitter_bot.plugin;

import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.StatusListener;

/**
 * @author
 *
 */
public class Plugin3 implements StatusListener{

    /** (非 Javadoc)
     * @see twitter4j.StreamListener#onException(java.lang.Exception)
     */
    @Override
    public void onException(Exception ex) {
                
    }

    /** (非 Javadoc)
     * @see twitter4j.StatusListener#onStatus(twitter4j.Status)
     */
    @Override
    public void onStatus(Status status) {
                
    }

    /** (非 Javadoc)
     * @see twitter4j.StatusListener#onDeletionNotice(twitter4j.StatusDeletionNotice)
     */
    @Override
    public void onDeletionNotice(StatusDeletionNotice statusDeletionNotice) {
                
    }

    /** (非 Javadoc)
     * @see twitter4j.StatusListener#onTrackLimitationNotice(int)
     */
    @Override
    public void onTrackLimitationNotice(int numberOfLimitedStatuses) {
                
    }

    /** (非 Javadoc)
     * @see twitter4j.StatusListener#onScrubGeo(long, long)
     */
    @Override
    public void onScrubGeo(long userId, long upToStatusId) {
                
    }

    /** (非 Javadoc)
     * @see twitter4j.StatusListener#onStallWarning(twitter4j.StallWarning)
     */
    @Override
    public void onStallWarning(StallWarning warning) {
                
    }

}
