package com.twitter.teruteru128.study.tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main implements Runnable {

    /**
     * 
     */
    public Main() {
        this(DEFAULT_SERVER_PORT);
    }

    /**
     * 
     */
    public Main(int port) {
        super();
        this.server_port = port;
    }

    volatile boolean stop;

    /**
     * 
     */
    @Override
    public void run() {
        ServerSocket server = null;
        Socket socket = null;
        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            server = new ServerSocket(server_port);
            while (!stop) {
            }
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        service.shutdown();
    }

    private static final int DEFAULT_SERVER_PORT = 20007;
    private int server_port;

    public static void main(String[] args) {
        var thread = new Thread(new Main());
        thread.start();
    }

}
