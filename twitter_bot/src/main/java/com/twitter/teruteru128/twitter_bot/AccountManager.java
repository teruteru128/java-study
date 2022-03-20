package com.twitter.teruteru128.twitter_bot;

import java.util.ArrayList;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.User;

/**
 * 
 *
 */
public class AccountManager {
    private static AccountManager accountManager = new AccountManager();
    private ArrayList<Twitter> twitters = new ArrayList<>();
    private ArrayList<Twitter> account = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();
    int limited = 0;
    private boolean locked = false;

    private AccountManager() {
        Thread thread = new Thread(() -> {
            while (true) {
                try {
                    // 10分待つ
                Thread.sleep(60 * 10 * 1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            limited = 0;
        }
    }    );
        thread.setName("AccountManager Reseter");
        thread.setDaemon(true);
        thread.start();
    }

    public static AccountManager getInstance() {
        return accountManager;
    }

    public ArrayList<Twitter> getAccounts() {
        return twitters;
    }

    public void setAccounts(ArrayList<Twitter> accounts) {
        this.twitters = accounts;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public void add(Twitter twitter) {
        twitters.add(twitter);
        User user = null;
        try {
            user = twitter.verifyCredentials();
        } catch (TwitterException e) {
            e.printStackTrace();
        }
        users.add(user);
        this.account.add(twitter);
    }

    /**
     * 
     */
    public void fallback() {
        limited += 1;
        limited = limited > getAccounts().size() ? 0 : limited;
    }

    public Twitter cursor() {
        return account.get(limited);
    }

    public Twitter get(int index) {
        return getAccounts().get(index);
    }

    public Twitter set(int index, Twitter account) {
        return getAccounts().set(index, account);
    }

    public void lock() {
        setLocked(true);
    }

    public void unlock() {
        setLocked(false);
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
