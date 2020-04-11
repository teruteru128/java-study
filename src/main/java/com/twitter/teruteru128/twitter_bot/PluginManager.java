package com.twitter.teruteru128.twitter_bot;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.regex.Pattern;

import twitter4j.DirectMessage;
import twitter4j.MediaEntity;
import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.User;
import twitter4j.UserList;
import twitter4j.UserStreamListener;

/**
 * @author
 *
 */
public class PluginManager implements UserStreamListener {
    HashMap<String, ArrayList<OnStatusListenerPlugin>> events = new HashMap<>(0);
    private static PluginManager pluginManager = new PluginManager();
    private HashMap<String, CommandListenerPlugin> commands = new HashMap<>(0);
    private HashSet<Pattern> cmd_list = new HashSet<>(0);
    private String screenName;

    private PluginManager() {
        try {
            screenName = AccountManager.getInstance().get(0).getScreenName();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (TwitterException e) {
            e.printStackTrace();
        }
    }

    public static PluginManager getInstance() {
        return pluginManager;
    }

    public void onEvent(String event, OnStatusListenerPlugin blk) {
        if (events.get(event) == null) {
            events.put(event, new ArrayList<>());
        }
        events.get(event).add(blk);
    }

    /**
     * pluginsフォルダに格納されたjarファイルからプラグインを読み込みまつ。
     * */
    public void loadPlugins() {
        String cpath = System.getProperty("user.dir") + File.separator
                + "plugins";
        try {
            File f = new File(cpath);
            File[] files = f.listFiles((dir, name) -> name.endsWith(".jar"));
            for (File file : files) {
                JarFile jar = new JarFile(file);
                // マニフェスト取得
                Manifest mf = jar.getManifest();
                // Jarファイルクローズ（リソースを閉じる）
                jar.close();
                // アトリビュート（属性）取得
                Attributes att = mf.getMainAttributes();
                // プラグインクラスを取得
                String cname = att.getValue("Plugin-Class");
                // ファイルからURLを生成
                URL url = file.getCanonicalFile().toURI().toURL();
                // クラスローダー作成
                URLClassLoader loader = new URLClassLoader(new URL[] { url });
                // クラス読み込み
                Class<?> cobj = loader.loadClass(cname);
                loader.close();
                // クラスローダーを閉じる
                Class<?>[] ifnames = cobj.getInterfaces();
                for (int j = 0; j < ifnames.length; j++) {
                    /* implementsされたクラスの中にCommandListenerPluginが含まれていないかチェック */
                    if (ifnames[j] == CommandListenerPlugin.class
                            || ifnames[j] == OnStatusListenerPlugin.class
                            || ifnames[j] == Runnable.class) {
                        Object o = cobj.newInstance();
                        if (ifnames[j] == CommandListenerPlugin.class) {
                            // 含まれている場合はインスタンスを生成してArrayListに追加
                            CommandListenerPlugin plugin = (CommandListenerPlugin) o;
                            command(plugin.getCommand(), plugin);
                        }
                        if (ifnames[j] == OnStatusListenerPlugin.class) {
                            OnStatusListenerPlugin plugin = (OnStatusListenerPlugin) o;
                            onEvent("status", plugin);
                        }
                        if (ifnames[j] == Runnable.class) {
                            Thread t = new Thread((Runnable) o);
                            t.setDaemon(true);
                            t.start();
                        }
                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isCommand(String text) {
        return cmd_list.stream().anyMatch(e -> e.matcher(text).matches());
    }

    public void command(String cmd, CommandListenerPlugin b) {
        commands.put(cmd, b);
        cmd_list.add(Pattern.compile("^(?!RT)@" + screenName + "\\s+" + cmd));
    }

    public void onStatus(Status status) {
        if (status.getUser().getScreenName().equals(screenName)) {
            return;
        }
        callback("status", status);
        command_callback(status);
    }

    public void callback(String event, Status status) {
        if (events.get(event) == null) {
            return;
        }
        AccountManager manager = AccountManager.getInstance();
        Twitter a = manager.cursor();
        try {
            events.get(event).forEach(c -> c.onStatus(a, (status)));
        } catch (Exception e) {
            manager.fallback();
        }
    }

    public void command_callback(Status status) {
        AccountManager manager = AccountManager.getInstance();
        Twitter account = manager.cursor();
        for (String cmd : commands.keySet()) {
            if (Pattern.matches("^(?!RT)@" + screenName + "\\s+" + cmd,
                    status.getText())) {
                commands.get(cmd).onCommand(account, (status));
            }
        }
    }

    /**
     * (非 Javadoc)
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
    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.StatusListener#onScrubGeo(long, long)
     */
    @Override
    public void onScrubGeo(long userId, long upToStatusId) {

    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.StatusListener#onStallWarning(twitter4j.StallWarning)
     */
    @Override
    public void onStallWarning(StallWarning warning) {

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
        System.out.println("PluginManager.onFavorite()");
        System.out.printf(
                "Tweets %s was registered as a favorite by %s.\n",
                target.getScreenName(), source.getScreenName());
        System.out.print("\t");
        System.out.println(LocalPlugin.NEW_LINE.matcher(
                favoritedStatus.getText()).replaceAll("$0\t"));
        MediaEntity[] entities= favoritedStatus.getMediaEntities();
        if(entities.length!=0){
            for (MediaEntity mediaEntity : entities) {
                System.out.println(mediaEntity.getMediaURLHttps());
            }
        }
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
        System.out.println("PluginManager.onFavoritedRetweet()");
        System.out.println(favoritedRetweeet.getText());
    }

    /**
     * (非 Javadoc)
     * 
     * @see twitter4j.UserStreamListener#onQuotedTweet(twitter4j.User,
     *      twitter4j.User, twitter4j.Status)
     */
    @Override
    public void onQuotedTweet(User source, User target, Status quotingTweet) {

    }
}
