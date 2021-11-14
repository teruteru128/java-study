package com.twitter.teruteru128.study.nyanpass;

import java.util.concurrent.BlockingQueue;

public class StdoutTask implements Runnable {
    private NyanpassConfig config;

    public StdoutTask(NyanpassConfig config) {
        this.config = config;
    }

    @Override
    public void run() {
        BlockingQueue<NyanpassBean> beans = config.getQueue();
        while (true) {
            try {
                printBean(beans.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void printBean(NyanpassBean bean) {
        long _1000000000 = 10_0000_0000;
        long diff = _1000000000 - bean.getCount();
        System.out.printf("[%s] count : %d(%d まであと %d)%n", bean.getTime(), bean.getCount(),
                _1000000000, diff);
    }
}
