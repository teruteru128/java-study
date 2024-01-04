package com.twitter.teruteru128.bitmessage;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.StandardProtocolFamily;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class Server implements Runnable {

    private Selector selector;

    public Server() {
    }

    @Override
    public void run() {
        try (var serverChannel = ServerSocketChannel.open(StandardProtocolFamily.INET6)) {
            serverChannel.configureBlocking(false);
            serverChannel.bind(new InetSocketAddress(0));
            var address = serverChannel.getLocalAddress();
            System.err.printf("起動しました: %s%n", address);
            selector = Selector.open();
            serverChannel.register(selector, serverChannel.validOps(), new ServerContext());
            while (selector.select() > 0) {
                for (var it = selector.selectedKeys().iterator(); it.hasNext();) {
                    var key = it.next();
                    it.remove();
                    if (key.isAcceptable()) {
                        doAccept((ServerSocketChannel) key.channel());
                    } else if (key.isReadable()) {
                        doRead((SocketChannel) key.channel());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void doAccept(ServerSocketChannel server) throws IOException {
        try {
            var channel = server.accept();
            System.err.printf("Accepted: %s%n", channel.getRemoteAddress());
            channel.configureBlocking(false);
            channel.register(selector, channel.validOps(), new ClientContext());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void doRead(SocketChannel channel) throws IOException {
        // 読み取り自体を新しいスレッドに投げるべきでは？
        // もしくは読み取りだけここで行って、処理そのものは別のスレッドに投げるとか
        // 別のスレッドに投げるとしたら、ソケットとデータとコンテキストを全部投げないと駄目だな？
    }

}
