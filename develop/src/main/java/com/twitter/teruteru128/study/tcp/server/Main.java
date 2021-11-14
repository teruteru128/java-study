package com.twitter.teruteru128.study.tcp.server;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main implements Runnable {

    public Main() {
    }

    @Override
    public void run() {
    }

    /**
     * mainスレッドでコンフィグなりコマンドライン引数なりパースしてからサーバー起動
     * <ul>
     * <li>シグナル</li>
     * <li>ロギング</li>
     * </ul>
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.submit(new ServerAcceptTask(new ServerConfig("", 50002, service, null)));
    }

}
