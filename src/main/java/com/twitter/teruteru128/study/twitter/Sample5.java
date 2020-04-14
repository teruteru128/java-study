package com.twitter.teruteru128.study.twitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;
import java.util.TimerTask;

import twitter4j.StatusUpdate;

/**
 * @author Teruteru
 *
 */
public class Sample5 {

    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        ArrayList<StatusUpdate> al1 = new ArrayList<StatusUpdate>();
        al1.add(new StatusUpdate("なのです！"));
        al1.add(new StatusUpdate("やらないか"));
        al1.add(new StatusUpdate("hoge"));
        al1.add(new StatusUpdate("piyo"));
        al1.add(new StatusUpdate("デレデレデェェェェェェェェェェン"));
        al1.add(new StatusUpdate("@konton_freedom 混沌ガチャ"));
        al1.add(new StatusUpdate("@konton_freedom ご注文は混沌ガチャですか？"));
        Collections.shuffle(al1);
        ArrayList<StatusUpdate> al2 = new ArrayList<StatusUpdate>();
        TimerTask tt = new TimerTask() {
            synchronized private StatusUpdate get() {
                StatusUpdate su = null;
                su = al1.remove(0);
                al2.add(su);
                if (al1.isEmpty()) {
                    this.cancel();
                    // al1.addAll(al2);
                    // al2.clear();
                    // Collections.shuffle(al1);
                }

                return su;
            }

            @Override
            public void run() {
                    System.out.println(get().getStatus());
            }
        };
         Timer timer = new Timer();
        timer.schedule(tt, 0, 500);
        //ScheduledThreadPoolExecutor sche = new ScheduledThreadPoolExecutor(0);
        //sche.schedule(tt, 500, TimeUnit.MILLISECONDS);
        
    }
}
