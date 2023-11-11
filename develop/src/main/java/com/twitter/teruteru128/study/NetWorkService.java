package com.twitter.teruteru128.study;

import java.nio.channels.Selector;

public class NetWorkService implements Runnable {

    private Selector selector;

    public NetWorkService(Selector selector) {
        this.selector = selector;
    }

    @Override
    public void run() {
        selector.selectedKeys();
    }

}
