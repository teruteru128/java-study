package com.twitter.teruteru128.study.random.server;

import java.net.Socket;
import java.util.concurrent.Callable;

public class ServerTask implements Callable<Void> {

    private Socket socket;

    public ServerTask(Socket socket) {
        this.socket = socket;
    }

    @Override
    public Void call() throws Exception {
        try (Socket s = socket) {

        }
        return null;
    }
}
