package com.twitter.teruteru128.test.twitter.test01;

import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;

/**
 * @author Teruteru
 *
 */
public class Test01 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ConfigurationBuilder cb=new ConfigurationBuilder();
        //cb.setOAuthAccessToken("");
        //cb.setOAuthAccessTokenSecret("");
        Configuration conf=cb.build();
        TwitterFactory tf=new TwitterFactory(conf);
        AccessToken at=new AccessToken("533912006-ynJc1I8iRnlCMaNtDv0NiIXdhyqF4ymjsGCJ8cop", "BxsQiJGD3ZXQ2zXEB5l2rH7zAI553UBIo7SBbt7a0");
        Twitter t=tf.getInstance(at);
        try {
            ResponseList<Status> rls= t.getFavorites();
            for(Status s : rls){
                System.out.print(s.getUser().getName());
                System.out.print(" : ");
                System.out.println(s.getText());
            }
        } catch (TwitterException e) {
            e.printStackTrace();
        }
        
    }

}
