package com.twitter.teruteru128.twitter_bot.plugin;

import twitter4j.DirectMessage;
import twitter4j.SiteStreamsListener;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.User;
import twitter4j.UserList;

/**
 * @author
 *
 */
public class Plugin2 implements SiteStreamsListener {

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.SiteStreamsListener#onStatus(long, twitter4j.Status)
     * 
     * @param forUser
     * @param status
     */
    @Override
    public void onStatus(long forUser, Status status) {
    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.SiteStreamsListener#onDeletionNotice(long,
     *      twitter4j.StatusDeletionNotice)
     */
    @Override
    public void onDeletionNotice(long forUser,
            StatusDeletionNotice statusDeletionNotice) {
    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.SiteStreamsListener#onFriendList(long, long[])
     */
    @Override
    public void onFriendList(long forUser, long[] friendIds) {

    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.SiteStreamsListener#onFavorite(long, twitter4j.User,
     *      twitter4j.User, twitter4j.Status)
     */
    @Override
    public void onFavorite(long forUser, User source, User target,
            Status favoritedStatus) {

    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.SiteStreamsListener#onUnfavorite(long, twitter4j.User,
     *      twitter4j.User, twitter4j.Status)
     */
    @Override
    public void onUnfavorite(long forUser, User source, User target,
            Status unfavoritedStatus) {

    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.SiteStreamsListener#onFollow(long, twitter4j.User,
     *      twitter4j.User)
     */
    @Override
    public void onFollow(long forUser, User source, User followedUser) {
    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.SiteStreamsListener#onUnfollow(long, twitter4j.User,
     *      twitter4j.User)
     */
    @Override
    public void onUnfollow(long forUser, User source, User unfollowedUser) {

    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.SiteStreamsListener#onDirectMessage(long,
     *      twitter4j.DirectMessage)
     */
    @Override
    public void onDirectMessage(long forUser, DirectMessage directMessage) {

    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.SiteStreamsListener#onDeletionNotice(long, long, long)
     */
    @Override
    public void onDeletionNotice(long forUser, long directMessageId, long userId) {

    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.SiteStreamsListener#onUserListMemberAddition(long,
     *      twitter4j.User, twitter4j.User, twitter4j.UserList)
     */
    @Override
    public void onUserListMemberAddition(long forUser, User addedMember,
            User listOwner, UserList list) {

    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.SiteStreamsListener#onUserListMemberDeletion(long,
     *      twitter4j.User, twitter4j.User, twitter4j.UserList)
     */
    @Override
    public void onUserListMemberDeletion(long forUser, User deletedMember,
            User listOwner, UserList list) {

    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.SiteStreamsListener#onUserListSubscription(long,
     *      twitter4j.User, twitter4j.User, twitter4j.UserList)
     */
    @Override
    public void onUserListSubscription(long forUser, User subscriber,
            User listOwner, UserList list) {

    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.SiteStreamsListener#onUserListUnsubscription(long,
     *      twitter4j.User, twitter4j.User, twitter4j.UserList)
     */
    @Override
    public void onUserListUnsubscription(long forUser, User subscriber,
            User listOwner, UserList list) {
    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.SiteStreamsListener#onUserListCreation(long,
     *      twitter4j.User, twitter4j.UserList)
     */
    @Override
    public void onUserListCreation(long forUser, User listOwner, UserList list) {

    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.SiteStreamsListener#onUserListUpdate(long, twitter4j.User,
     *      twitter4j.UserList)
     */
    @Override
    public void onUserListUpdate(long forUser, User listOwner, UserList list) {

    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.SiteStreamsListener#onUserListDeletion(long,
     *      twitter4j.User, twitter4j.UserList)
     */
    @Override
    public void onUserListDeletion(long forUser, User listOwner, UserList list) {

    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.SiteStreamsListener#onUserProfileUpdate(long,
     *      twitter4j.User)
     */
    @Override
    public void onUserProfileUpdate(long forUser, User updatedUser) {

    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.SiteStreamsListener#onUserSuspension(long, long)
     */
    @Override
    public void onUserSuspension(long forUser, long suspendedUser) {

    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.SiteStreamsListener#onUserDeletion(long, long)
     */
    @Override
    public void onUserDeletion(long forUser, long deletedUser) {

    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.SiteStreamsListener#onBlock(long, twitter4j.User,
     *      twitter4j.User)
     */
    @Override
    public void onBlock(long forUser, User source, User blockedUser) {

    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.SiteStreamsListener#onUnblock(long, twitter4j.User,
     *      twitter4j.User)
     */
    @Override
    public void onUnblock(long forUser, User source, User unblockedUser) {

    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.SiteStreamsListener#onRetweetedRetweet(twitter4j.User,
     *      twitter4j.User, twitter4j.Status)
     */
    @Override
    public void onRetweetedRetweet(User source, User target,
            Status retweetedStatus) {

    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.SiteStreamsListener#onFavoritedRetweet(twitter4j.User,
     *      twitter4j.User, twitter4j.Status)
     */
    @Override
    public void onFavoritedRetweet(User source, User target,
            Status favoritedStatus) {

    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.SiteStreamsListener#onDisconnectionNotice(java.lang.String)
     */
    @Override
    public void onDisconnectionNotice(String line) {

    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.SiteStreamsListener#onException(java.lang.Exception)
     */
    @Override
    public void onException(Exception ex) {

    }

}
