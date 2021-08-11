package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ResponseConsumerServer implements Runnable {

    private ExecutorService service;
    private ServerSocket serverSocket;

    public ResponseConsumerServer() {
        service = Executors.newCachedThreadPool();
        try {
            serverSocket = new ServerSocket(20001);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (State.shutdown == 0) {
            try {
                Socket socket = serverSocket.accept();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
