package com.twitter.teruteru128.study.tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main implements Runnable {

    private static ExecutorService service;

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
        this.serverPort = port;
    }

    volatile boolean stop;

    /**
     * 
     */
    @Override
    public void run() {
        try (ServerSocket server = new ServerSocket(serverPort)) {
            while (Status.shutdown == 0) {
                Socket socket = server.accept();
                service.submit(new AcceptedTask(socket));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            service.shutdown();
        }
    }

    private static final int DEFAULT_SERVER_PORT = 20007;
    private int serverPort;

    public static void main(String[] args) {
        service = Executors.newCachedThreadPool();
        service.submit(new Main());
    }

}
