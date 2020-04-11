package com.twitter.teruteru128.twitter_bot;

import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import twitter4j.DirectMessage;
import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.User;
import twitter4j.UserList;
import twitter4j.UserStreamListener;

/**
 * @author Teruteru
 *
 */
class LocalPlugin implements UserStreamListener {
    private static LocalPlugin plugin = null;
    /** 改行文字の正規表現 */
    static final Pattern NEW_LINE = Pattern.compile("\\R");
    private static final Pattern 友利奈緒 = Pattern.compile("友利奈緒");
    private static final Pattern NULLPO = Pattern.compile("ぬるぽ");
    private static final Pattern YATTAZE = Pattern.compile("やったぜ。");

    /**
     * 
     */
    private LocalPlugin() {
        Twitter twitter = AccountManager.getInstance().get(0);
        try {
            selfId = twitter.getId();// 自己ツイ避け
        } catch (IllegalStateException e1) {
            e1.printStackTrace();
        } catch (TwitterException e1) {
            e1.printStackTrace();
        }
    }

    public static LocalPlugin getInstance() {
        if (plugin == null) {
            plugin = new LocalPlugin();
        }
        return plugin;
    }

    private StringBuffer buf = new StringBuffer(160);
    private long selfId = -1;
    private static SimpleDateFormat eewDateFormat = null;

    /**
     * TLのイベント
     * */
    public void onStatus(Status status) {
        AccountManager accountManager = AccountManager.getInstance();
        Twitter twitter = accountManager.get(0);
        User user = status.getUser();
        try {

            // 藤原竜也botのツイートを自動RT
            // TODO プラグイン化
            if ((user.getId() == 1536680640) && !status.isRetweetedByMe()) {
                // System.err.println("藤原竜也bot");
                showStatus(status, System.err);
                User naaaatatsuya = user;
                long statusId = status.getId();
                twitter.retweetStatus(statusId);
                StatusUpdate tweet = null;

                tweet = new StatusUpdate(new StringBuilder().append("@")
                        .append(naaaatatsuya.getScreenName()).append(" うるさい")
                        .toString());
                tweet.setInReplyToStatusId(status.getId());

                if (status.getText().contains("゛") && status.isRetweeted()) {// 濁点を含む場合のみ送る
                    System.err.println("濁点を検知しました。");
                    twitter.updateStatus(tweet);
                }
            }
            // eewbotのツイートに反応
            if ((user.getId() == 214358709) && !status.isRetweet()) {
                String eewText = status.getText();
                String[] eewDataArray = eewText.split(",");
                /** 電文種別 */
                int telegramType = Integer.parseInt(eewDataArray[0], 10);
                /** 訓練識別符 */
                int trainingIdentificationMarks = Integer.parseInt(
                        eewDataArray[1], 10);
                /** 発表時刻 */
                Date announcementTime = null;
                try {
                    announcementTime = getFormat().parse(eewDataArray[2]);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                /** 発表状況 */
                int announcementSituation = Integer.parseInt(eewDataArray[3]);
                if (announcementSituation == 7) {
                    // キャンセル取り消し
                } else {// 通常、最終報
                    /** 電文番号 */
                    int number = Integer.parseInt(eewDataArray[4], 10);
                    /** 地震ID */
                    String earthquakeID = eewDataArray[5];
                    /** 地震発生時刻 */
                    Date earthquakeOccurrenceTime = null;
                    if (!eewDataArray[6].equals("不明")) {
                        try {
                            earthquakeOccurrenceTime = getFormat().parse(
                                    eewDataArray[6]);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    }
                    /** 震源の北緯 */
                    double northLatitudeOfEpicenter = Double
                            .parseDouble(eewDataArray[7]);
                    /** 震源の東経 */
                    double eastOfTheEpicenter = Double
                            .parseDouble(eewDataArray[8]);
                    /** 震央地名 */
                    String epicenterPlaceName = eewDataArray[9];
                    /** 震源の深さ */
                    double depthOfHypocenter = Double
                            .parseDouble(eewDataArray[10]);
                    /** マグニチュード */
                    double magnitude = Double.parseDouble(eewDataArray[11]);
                    /** 最大震度 */
                    int maximumSeismicIntensity = -1;
                    if (!eewDataArray[12].equals("不明")) {
                        maximumSeismicIntensity = Integer.parseInt(
                                eewDataArray[12], 10);
                    }
                    /** 震源海陸判定 */
                    int landAndSeaJudgmentOfEpicenter = Integer.parseInt(
                            eewDataArray[13], 10);
                    /** 警報の有無 */
                    int hasAlarm = Integer.parseInt(eewDataArray[14], 10);
                    synchronized (buf) {
                        String txt;
                        if (hasAlarm == 1) {
                            buf.append("【警報】");
                        }
                        buf.append("【BOT】:");
                        buf.append(epicenterPlaceName);
                        buf.append("で地震？");
                        txt = buf.toString();
                        if (number == 1) {
                            twitter.updateStatus(txt);
                        }
                        buf.delete(0, buf.length());
                    }
                }
            }
            if (user.getId() == 345477198) {
                System.err.println("ニャンちゅうbot");
                long statusId = status.getId();
                twitter.retweetStatus(statusId);
            }
            if (status.getUser().getId() != selfId) {// 自分自身のステータス以外
                if ((status.getText()).contains("友利奈緒")) {
                    showStatus(status);
                    if (!status.isFavorited() || status.isRetweeted()
                            && !status.getRetweetedStatus().isFavorited()) {
                        twitter.createFavorite(status.getId());
                    }
                }
                if ((status.getText()).contains("ぬるぽ")
                        && !status.isRetweetedByMe()) {
                    StatusUpdate latestStatus = null;
                    synchronized (buf) {
                        latestStatus = new StatusUpdate(buf.append("@")
                                .append(status.getUser().getScreenName())
                                .append(" ｶﾞｯ").toString());
                        latestStatus.setInReplyToStatusId(status.getId());
                        buf.delete(0, buf.length());
                    }
                    // accountManager.cursor().updateStatus(latestStatus);
                }
                if ((status.getText()).contains("やったぜ。")) {
                    // twitter.updateStatus("やったねたえちゃん！");
                    showStatus(status);
                }
            }
        } catch (TwitterException e) {
            e.printStackTrace();
            System.err.println("err!");
            showStatus(status);
            System.err.println("err!");
            // accountManager.fallback();
        }
    }

    private static SimpleDateFormat getFormat() {
        if (eewDateFormat == null) {
            eewDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss",
                    java.util.Locale.JAPAN);
        }

        return eewDateFormat;
    }

    private void showStatus(Status status) {
        showStatus(status, System.err);
    }

    private void showStatus(Status status, PrintStream ps) {
        User user = status.getUser();
        String txt;
        synchronized (buf) {
            buf.append(user.getName());
            buf.append("@");
            buf.append(user.getScreenName());
            buf.append("(");
            buf.append(user.getId());
            buf.append(",");
            buf.append(status.getId());
            buf.append("):");
            buf.append(System.lineSeparator());
            buf.append("\t");
            buf.append(NEW_LINE.matcher(status.getText()).replaceAll("$0\t"));// インデント
            txt = buf.toString();
            buf.delete(0, buf.length());
        }
        ps.println(txt);
    }

    /**
     * (非 Javadoc) ステータス削除通知
     * 
     * @see twitter4j.StatusListener#onDeletionNotice(twitter4j.StatusDeletionNotice)
     */
    @Override
    public void onDeletionNotice(StatusDeletionNotice statusDeletionNotice) {
    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.StatusListener#onTrackLimitationNotice(int)
     */
    @Override
    public void onTrackLimitationNotice(int numberOfLimitedStatuses) {
        System.out
                .printf("LocalPlugin.onTrackLimitationNotice(numberOfLimitedStatuses=%d)%n",
                        numberOfLimitedStatuses);
    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.StatusListener#onScrubGeo(long, long)
     */
    @Override
    public void onScrubGeo(long userId, long upToStatusId) {
        System.out.printf(
                "LocalPlugin.onScrubGeo(userId=%d,upToStatusId=%d)%n", userId,
                upToStatusId);
    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.StatusListener#onStallWarning(twitter4j.StallWarning)
     */
    @Override
    public void onStallWarning(StallWarning warning) {
        System.err.println(warning.getMessage());
    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.StreamListener#onException(java.lang.Exception)
     */
    @Override
    public void onException(Exception ex) {
        ex.printStackTrace();
    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.UserStreamListener#onDeletionNotice(long, long)
     */
    @Override
    public void onDeletionNotice(long directMessageId, long userId) {
    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.UserStreamListener#onFriendList(long[])
     */
    @Override
    public void onFriendList(long[] friendIds) {
    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.UserStreamListener#onFavorite(twitter4j.User,
     *      twitter4j.User, twitter4j.Status)
     */
    @Override
    public void onFavorite(User source, User target, Status favoritedStatus) {
    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.UserStreamListener#onUnfavorite(twitter4j.User,
     *      twitter4j.User, twitter4j.Status)
     */
    @Override
    public void onUnfavorite(User source, User target, Status unfavoritedStatus) {
    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.UserStreamListener#onFollow(twitter4j.User,
     *      twitter4j.User)
     */
    @Override
    public void onFollow(User source, User followedUser) {
    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.UserStreamListener#onUnfollow(twitter4j.User,
     *      twitter4j.User)
     */
    @Override
    public void onUnfollow(User source, User unfollowedUser) {
    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.UserStreamListener#onDirectMessage(twitter4j.DirectMessage)
     */
    @Override
    public void onDirectMessage(DirectMessage directMessage) {
    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.UserStreamListener#onUserListMemberAddition(twitter4j.User,
     *      twitter4j.User, twitter4j.UserList)
     */
    @Override
    public void onUserListMemberAddition(User addedMember, User listOwner,
            UserList list) {
    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.UserStreamListener#onUserListMemberDeletion(twitter4j.User,
     *      twitter4j.User, twitter4j.UserList)
     */
    @Override
    public void onUserListMemberDeletion(User deletedMember, User listOwner,
            UserList list) {
    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.UserStreamListener#onUserListSubscription(twitter4j.User,
     *      twitter4j.User, twitter4j.UserList)
     */
    @Override
    public void onUserListSubscription(User subscriber, User listOwner,
            UserList list) {
    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.UserStreamListener#onUserListUnsubscription(twitter4j.User,
     *      twitter4j.User, twitter4j.UserList)
     */
    @Override
    public void onUserListUnsubscription(User subscriber, User listOwner,
            UserList list) {
    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.UserStreamListener#onUserListCreation(twitter4j.User,
     *      twitter4j.UserList)
     */
    @Override
    public void onUserListCreation(User listOwner, UserList list) {
    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.UserStreamListener#onUserListUpdate(twitter4j.User,
     *      twitter4j.UserList)
     */
    @Override
    public void onUserListUpdate(User listOwner, UserList list) {
    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.UserStreamListener#onUserListDeletion(twitter4j.User,
     *      twitter4j.UserList)
     */
    @Override
    public void onUserListDeletion(User listOwner, UserList list) {
    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.UserStreamListener#onUserProfileUpdate(twitter4j.User)
     */
    @Override
    public void onUserProfileUpdate(User updatedUser) {
    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.UserStreamListener#onUserSuspension(long)
     */
    @Override
    public void onUserSuspension(long suspendedUser) {
    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.UserStreamListener#onUserDeletion(long)
     */
    @Override
    public void onUserDeletion(long deletedUser) {
    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.UserStreamListener#onBlock(twitter4j.User, twitter4j.User)
     */
    @Override
    public void onBlock(User source, User blockedUser) {
    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.UserStreamListener#onUnblock(twitter4j.User,
     *      twitter4j.User)
     */
    @Override
    public void onUnblock(User source, User unblockedUser) {
    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.UserStreamListener#onRetweetedRetweet(twitter4j.User,
     *      twitter4j.User, twitter4j.Status)
     */
    @Override
    public void onRetweetedRetweet(User source, User target,
            Status retweetedStatus) {
    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.UserStreamListener#onFavoritedRetweet(twitter4j.User,
     *      twitter4j.User, twitter4j.Status)
     */
    @Override
    public void onFavoritedRetweet(User source, User target,
            Status favoritedRetweeet) {
    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.UserStreamListener#onQuotedTweet(twitter4j.User,
     *      twitter4j.User, twitter4j.Status)
     */
    @Override
    public void onQuotedTweet(User source, User target, Status quotingTweet) {
        System.err.println("LocalPlugin.onQuotedTweet()");
        showStatus(quotingTweet);
    }

}
