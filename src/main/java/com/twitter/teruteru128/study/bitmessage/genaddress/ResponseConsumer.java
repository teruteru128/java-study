package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;

/**
 * レスポンス受け渡しキューでレスポンスを受け取ってサーバーへ転送
 */
public class ResponseConsumer implements Runnable {

    private final ArrayList<Response> resonseShelter = new ArrayList<>();

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
        // キューの中身をチェック
        // キューが空ならなにもしない
        if (!queue.isEmpty()) {
            // キューに中身があるなら全て取り出して一時的にリストに取る
            queue.drainTo(responses);
        }
        // 避難リストの中身をチェックして取り出す
        if (!resonseShelter.isEmpty()) {
            responses.addAll(resonseShelter);
            resonseShelter.clear();
        }
        // リストに取ったらサーバーへ接続して転送
        try {
            throw new IOException();
        } catch (IOException e) {
            resonseShelter.addAll(responses);
        }
        // 送信に失敗したらインスタンスのリストへ退避
    }
}
