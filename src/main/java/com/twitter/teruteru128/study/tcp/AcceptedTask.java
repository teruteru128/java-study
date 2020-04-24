package com.twitter.teruteru128.study.tcp;

import java.net.Socket;

public class AcceptedTask implements Runnable {

    private Socket socket;

    public AcceptedTask(Socket socket) {
        super();
        this.socket = socket;
    }

    @Override
    public void run() {

    }
}
