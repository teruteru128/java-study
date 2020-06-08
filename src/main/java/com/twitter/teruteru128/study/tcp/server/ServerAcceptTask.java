package com.twitter.teruteru128.study.tcp.server;

import java.util.concurrent.Callable;

public class ServerAcceptTask implements Callable<Void> {
    private ServerConfig config;

    public ServerAcceptTask(ServerConfig config) {
        this.config = config;
    }

    @Override
    public Void call() throws Exception {
        return null;
    }
}
