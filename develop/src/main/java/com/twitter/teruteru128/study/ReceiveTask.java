package com.twitter.teruteru128.study;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.concurrent.Callable;

import com.twitter.teruteru128.bitmessage.ConnectSession;
import com.twitter.teruteru128.bitmessage.ConnectionType;

/**
 * データ受信/接続受け入れだけを担当するスレッド。
 *
 * ディスクIOとかは別スレッドの担当とする。
 */
public class ReceiveTask implements Callable<Void> {
    private Selector selector;

    public ReceiveTask(Selector s) {
        this.selector = s;
    }

    @Override
    public Void call() throws IOException {
        while (true) {
            selector.select(1000);
            for (var iterator = selector.selectedKeys().iterator(); iterator.hasNext();) {
                var key = iterator.next();
                iterator.remove();
                if (key.isAcceptable()) {
                    if (key.channel() instanceof ServerSocketChannel ssc) {
                        // 接続受け入れ
                        var newSocketChannel = ssc.accept();
                        // TODO セッションオブジェクトを登録
                        var remoteAddress = newSocketChannel.getRemoteAddress();
                        var att = new ConnectSession(remoteAddress, ConnectionType.INBOUND);
                        newSocketChannel.register(selector, SelectionKey.OP_READ | SelectionKey.OP_WRITE,
                                att);
                    }
                } else if (key.isReadable()) {
                    var session = (ConnectSession) key.attachment();
                    // TODO unix domain socket対応もしたい
                    if (key.channel() instanceof SocketChannel sc) {
                        if (session.getSSLEngine().isPresent()) {
                            var engine = session.getSSLEngine().get();
                            var sslSession = engine.getSession();
                            var appBufferMax = sslSession.getApplicationBufferSize();
                            var netBufferMax = sslSession.getPacketBufferSize();

                            var serverIn = ByteBuffer.allocate(appBufferMax + 50);
                        } else {
                            var header = ByteBuffer.allocate(24);

                            // チャンネルから読み取り
                            sc.read(header);

                            // このマジックナンバーを目印にシークするとかなんとか
                            var magic = header.getInt();

                            // コマンド
                            var commandBuffer = new byte[12];
                            header.get(commandBuffer);

                            //
                            var length = header.getInt();
                            var checksum = new byte[4];
                            header.get(checksum);

                            //
                            var payload = ByteBuffer.allocate(length);
                            sc.read(payload);
                            payload.flip();

                            // validate
                            if (!validatePayload(checksum, payload)) {
                                // fail
                                continue;
                            }
                            payload.rewind();

                            var command = trim(commandBuffer);
                            // そういえば受け取ったコマンドを他ノードに転送するってのがないのか？EPSPと違って？
                            // TODO キューに追加
                        }
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
        return new String(commandBuffer, 0, commandLength, StandardCharsets.UTF_8);
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
