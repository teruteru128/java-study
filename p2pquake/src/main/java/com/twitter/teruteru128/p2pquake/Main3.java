package com.twitter.teruteru128.p2pquake;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// TODO 設定ファイルの実装方法 Propaties XML JSON YAML
/**
 * サーバーへ定期エコー(キープアライブ、ハートビート)
 * 
 * @see https://p2pquake.github.io/epsp-specifications/epsp-specifications.html#echokey
 * @see https://github.com/p2pquake/epsp-peer-cs/blob/master/CUIClient/ClientRunner.cs#L24
 */
public class Main3 implements Runnable {

    public Main3() {
        this(-1);
    }

    public Main3(int port) {
    }

    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(2);
        service.scheduleAtFixedRate(new Main3(), 10, 10, TimeUnit.MINUTES);
    }

    @Override
    public void run() {
    }

}
