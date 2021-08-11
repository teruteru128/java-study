package com.twitter.teruteru128.study.twitter;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;

public class Sample1 {

    public static void main(String[] args) {
        Twitter twitter = TwitterFactory.getSingleton();
        try {
            User user = twitter.verifyCredentials();
            System.out.println(user);
            // ユーザ情報取得
            System.out.println("なまえ　　　：" + user.getName());
            System.out.println("ひょうじ名　：" + user.getScreenName());
            System.err.println("ふぉろー数　：" + user.getFriendsCount());
            System.out.println("ふぉろわー数：" + user.getFollowersCount());
            System.out.println("最終テキスト："+user.getStatus().getText());
        } catch (TwitterException e) {
            e.printStackTrace();
        }
    }

}
