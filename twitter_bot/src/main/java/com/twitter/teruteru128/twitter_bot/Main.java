package com.twitter.teruteru128.twitter_bot;

import com.twitter.teruteru128.twitter_bot.network.FollowViewer;

/**
 * 
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        Thread main = Thread.currentThread();
        // main.setName("main");
        System.out.println(main.getName());
        int mode = 3;
        switch (mode) {
            case 1:
                Bot bot = new Bot();
                Thread thread = new Thread(bot);
                thread.setName("twitterbot init thread");
                thread.setDaemon(false);
                thread.start();
                break;
            case 2:
                FollowViewer viewer = new FollowViewer();
                Thread thread2 = new Thread(viewer, "view");
                thread2.setDaemon(false);
                thread2.start();
                break;
            default:
                break;
        }
    }
}
