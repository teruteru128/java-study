package com.twitter.teruteru128.study.tcp.server;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerAcceptTask implements Callable<Void> {
    private ServerConfig config;

    public ServerAcceptTask(ServerConfig config) {
        this.config = config;
    }

    @Override
    public Void call() throws Exception {
        ExecutorService service = Executors.newWorkStealingPool();
        try (ServerSocket server = new ServerSocket(50002)) {
            while (true) {
                Socket socket = server.accept();
                service.submit(new ChannelEchoTask(socket, config));
            }
        } finally {
            service.shutdown();
        }
    }
}
