package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;

/**
 * レスポンス受け渡しキューでレスポンスを受け取ってサーバーへ転送
 */
public class ResponseConsumer implements Runnable {

    private final ArrayList<Response> responseShelter = new ArrayList<>();

    public ResponseConsumer() {
    }

    /**
     * 1時間おき程度に実行
     */
    @Override
    public void run() {
        // サーバーアドレス取得
        BlockingQueue<Response> queue = Queues.getResponseQueue();
        ArrayList<Response> responses = new ArrayList<>();
        while (true) {
            try {
                queue.take();
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            // キューから取り出したらとりあえずリストへ突っ込む
            // リストに取ったらサーバーへ接続して転送
            // 成功したらリストから削除
            // リストが空になるまで送信を無限ループ
            try {
                throw new IOException();
            } catch (IOException e) {
                responseShelter.addAll(responses);
            }
        }
    }
}
