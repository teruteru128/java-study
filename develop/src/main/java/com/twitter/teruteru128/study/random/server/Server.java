package com.twitter.teruteru128.study.random.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class Server implements Callable<Void> {

    protected ExecutorService service;

    public Server(ExecutorService service) {
        super();
        this.service = service;
    }

    ServerSocket server;

    /**
     * 
     * 符号なし32bit整数 コマンド 符号なし64bit整数 長さ 0x00000001:乱数要求 長さ
     * windows-prngから乱数を指定された容量取得して返す。 0x000000ff:切断要求
     */
    @Override
    public Void call() {
        try {
            server = new ServerSocket(8123);
            while (true) {
                Socket socket = server.accept();
                service.submit(new ServerTask(socket));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
