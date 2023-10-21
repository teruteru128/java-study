package com.twitter.teruteru128.study;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.concurrent.Callable;

/**
 * データ受信/接続受け入れだけを担当するスレッド。ディスクIOとかは別スレッドの担当とする。
 */
public class ReceiveTask implements Callable<Void> {
    private Selector selector;

    public ReceiveTask(Selector s) {
        this.selector = s;
    }

    @Override
    public Void call() throws IOException {
        while (true) {
            int numberOfKeys = selector.select(1000);
            for (var key : selector.selectedKeys()) {
                var c = key.channel();
                if (key.isAcceptable()) {
                    if (c instanceof ServerSocketChannel ssc) {
                        // 接続受け入れ
                        var newSocketChannel = ssc.accept();
                        // TODO セッションオブジェクトを登録
                        newSocketChannel.register(selector, SelectionKey.OP_READ | SelectionKey.OP_WRITE, null);
                    }
                } else if (key.isReadable()) {
                    // TODO unix domain socket対応もしたい
                    if (c instanceof SocketChannel sc) {
                        var header = ByteBuffer.allocate(24);
                        sc.read(header);
                        var magic = header.getInt();
                        var commandBuffer = new byte[12];
                        header.get(commandBuffer);
                        var length = header.getInt();
                        var checksum = new byte[4];
                        header.get(checksum);

                        var payload = ByteBuffer.allocate(length);
                        sc.read(payload);
                        payload.flip();
                        validatePayload(checksum, payload);
                        payload.rewind();
                        var command = trim(commandBuffer);
                        // そういえば受け取ったコマンドを他ノードに転送するってのがないのか？EPSPと違って？
                    }
                }
            }
        }
    }

    private static String trim(byte[] commandBuffer) {
        int commandLength = commandBuffer.length;
        while ((0 < commandLength) && (commandBuffer[commandLength - 1] & 0xff) < ' ') {
            commandLength--;
        }
        return new String(commandBuffer, 0, commandLength);
    }

    /**
     * payloadを読み取ってSHA-512ハッシュを計算し、冒頭4バイトとchecksumを比較した結果を返します。
     */
    private static boolean validatePayload(byte[] checksum, ByteBuffer payload) {
        var hash = new byte[64];
        try {
            var sha512 = MessageDigest.getInstance("SHA-512");
            sha512.update(payload);
            sha512.digest(hash, 0, 64);
        } catch (NoSuchAlgorithmException | DigestException e) {
            e.printStackTrace();
        }
        return MessageDigest.isEqual(checksum, Arrays.copyOf(hash, 4));
    }

}
