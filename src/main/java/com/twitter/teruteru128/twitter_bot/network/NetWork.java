package com.twitter.teruteru128.twitter_bot.network;

import java.util.ArrayList;
import java.util.List;

import twitter4j.PagableResponseList;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.User;

/**
 * @author Teruteru
 *
 */
public class NetWork {
    private static int ID_COUNT_PER_REQUEST = 5000;
    private Twitter twitter = null;

    /**
     * 
     */
    public NetWork(Twitter twitter) {
        this.twitter = twitter;
    }

    /***/
    /* package */List<User> getFollows(User target) throws TwitterException {
        String targetScreenName;
        if (target == null
                || (targetScreenName = target.getScreenName()).equals("")) {
            return new ArrayList<User>(0);
        }
        List<User> followerIDs = new ArrayList<>();
        long cursor = -1L;
        //cursor = 1515740640068558178L;
        //cursor=1515050489896100203L;
        /** 一時的にIDを格納するオブジェクト */
        PagableResponseList<User> ids;
        long page = 1L;
        // フォロワーが多いユーザだと無反応で寂しい＆不安なので状況表示
        System.out.println(String.format("%dページ目取得中。。(%d <= %d)", page,
                ID_COUNT_PER_REQUEST * (page - 1), ID_COUNT_PER_REQUEST
                        * page++));
        ids = twitter.getFriendsList(targetScreenName, cursor);
        // 取得したIDをストックする
        followerIDs.addAll(ids);
        System.out.println("listsize : " + followerIDs.size());
        // 次のページへのカーソル取得。ない場合は0のようだが、念のためループ条件はhasNextで見る
        cursor = ids.getNextCursor();/* 次のページ番号を取得 */
        System.out.println("cursor : " + cursor);
        return followerIDs;
    }
}
