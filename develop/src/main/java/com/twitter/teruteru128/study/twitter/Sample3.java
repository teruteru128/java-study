package com.twitter.teruteru128.study.twitter;

import java.util.Timer;

public class Sample3 {

    public static void main(String[] args) {
        Timer timer = new Timer("sample1", false);
        //Calendar cal = new GregorianCalendar(2015, 3, 19, 23, 35, 0);
        timer.schedule(new TwitterTask(6), (20*60)*1000, 1920000);
    }

}