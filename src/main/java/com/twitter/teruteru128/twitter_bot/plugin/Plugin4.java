package com.twitter.teruteru128.twitter_bot.plugin;

import twitter4j.DirectMessage;
import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.User;
import twitter4j.UserList;
import twitter4j.UserStreamListener;

/**
 * @author 
 *
 */
public class Plugin4 implements UserStreamListener {

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

    /** (非 Javadoc)
     * @see twitter4j.StreamListener#onException(java.lang.Exception)
     */
    @Override
    public void onException(Exception ex) {
        
    }

    /** (非 Javadoc)
     * @see twitter4j.UserStreamListener#onDeletionNotice(long, long)
     */
    @Override
    public void onDeletionNotice(long directMessageId, long userId) {
        
    }

    /** (非 Javadoc)
     * @see twitter4j.UserStreamListener#onFriendList(long[])
     */
    @Override
    public void onFriendList(long[] friendIds) {
        
    }

    /** (非 Javadoc)
     * @see twitter4j.UserStreamListener#onFavorite(twitter4j.User, twitter4j.User, twitter4j.Status)
     */
    @Override
    public void onFavorite(User source, User target, Status favoritedStatus) {
        
    }

    /** (非 Javadoc)
     * @see twitter4j.UserStreamListener#onUnfavorite(twitter4j.User, twitter4j.User, twitter4j.Status)
     */
    @Override
    public void onUnfavorite(User source, User target, Status unfavoritedStatus) {
        
    }

    /** (非 Javadoc)
     * @see twitter4j.UserStreamListener#onFollow(twitter4j.User, twitter4j.User)
     */
    @Override
    public void onFollow(User source, User followedUser) {
        
    }

    /** (非 Javadoc)
     * @see twitter4j.UserStreamListener#onUnfollow(twitter4j.User, twitter4j.User)
     */
    @Override
    public void onUnfollow(User source, User unfollowedUser) {
        
    }

    /** (非 Javadoc)
     * @see twitter4j.UserStreamListener#onDirectMessage(twitter4j.DirectMessage)
     */
    @Override
    public void onDirectMessage(DirectMessage directMessage) {
        
    }

    /** (非 Javadoc)
     * @see twitter4j.UserStreamListener#onUserListMemberAddition(twitter4j.User, twitter4j.User, twitter4j.UserList)
     */
    @Override
    public void onUserListMemberAddition(User addedMember, User listOwner,
            UserList list) {
        
    }

    /** (非 Javadoc)
     * @see twitter4j.UserStreamListener#onUserListMemberDeletion(twitter4j.User, twitter4j.User, twitter4j.UserList)
     */
    @Override
    public void onUserListMemberDeletion(User deletedMember, User listOwner,
            UserList list) {
        
    }

    /** (非 Javadoc)
     * @see twitter4j.UserStreamListener#onUserListSubscription(twitter4j.User, twitter4j.User, twitter4j.UserList)
     */
    @Override
    public void onUserListSubscription(User subscriber, User listOwner,
            UserList list) {
        
    }

    /** (非 Javadoc)
     * @see twitter4j.UserStreamListener#onUserListUnsubscription(twitter4j.User, twitter4j.User, twitter4j.UserList)
     */
    @Override
    public void onUserListUnsubscription(User subscriber, User listOwner,
            UserList list) {
        
    }

    /** (非 Javadoc)
     * @see twitter4j.UserStreamListener#onUserListCreation(twitter4j.User, twitter4j.UserList)
     */
    @Override
    public void onUserListCreation(User listOwner, UserList list) {
        
    }

    /** (非 Javadoc)
     * @see twitter4j.UserStreamListener#onUserListUpdate(twitter4j.User, twitter4j.UserList)
     */
    @Override
    public void onUserListUpdate(User listOwner, UserList list) {
        
    }

    /** (非 Javadoc)
     * @see twitter4j.UserStreamListener#onUserListDeletion(twitter4j.User, twitter4j.UserList)
     */
    @Override
    public void onUserListDeletion(User listOwner, UserList list) {
        
    }

    /** (非 Javadoc)
     * @see twitter4j.UserStreamListener#onUserProfileUpdate(twitter4j.User)
     */
    @Override
    public void onUserProfileUpdate(User updatedUser) {
        
    }

    /** (非 Javadoc)
     * @see twitter4j.UserStreamListener#onUserSuspension(long)
     */
    @Override
    public void onUserSuspension(long suspendedUser) {
        
    }

    /** (非 Javadoc)
     * @see twitter4j.UserStreamListener#onUserDeletion(long)
     */
    @Override
    public void onUserDeletion(long deletedUser) {
        
    }

    /** (非 Javadoc)
     * @see twitter4j.UserStreamListener#onBlock(twitter4j.User, twitter4j.User)
     */
    @Override
    public void onBlock(User source, User blockedUser) {
        
    }

    /** (非 Javadoc)
     * @see twitter4j.UserStreamListener#onUnblock(twitter4j.User, twitter4j.User)
     */
    @Override
    public void onUnblock(User source, User unblockedUser) {
        
    }

    /** (非 Javadoc)
     * @see twitter4j.UserStreamListener#onRetweetedRetweet(twitter4j.User, twitter4j.User, twitter4j.Status)
     */
    @Override
    public void onRetweetedRetweet(User source, User target,
            Status retweetedStatus) {
        
    }

    /** (非 Javadoc)
     * @see twitter4j.UserStreamListener#onFavoritedRetweet(twitter4j.User, twitter4j.User, twitter4j.Status)
     */
    @Override
    public void onFavoritedRetweet(User source, User target,
            Status favoritedRetweeet) {
        
    }

    /** (非 Javadoc)
     * @see twitter4j.UserStreamListener#onQuotedTweet(twitter4j.User, twitter4j.User, twitter4j.Status)
     */
    @Override
    public void onQuotedTweet(User source, User target, Status quotingTweet) {
        
    }

}
