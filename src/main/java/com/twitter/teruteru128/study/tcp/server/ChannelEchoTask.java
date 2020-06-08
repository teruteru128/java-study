package com.twitter.teruteru128.study.tcp.server;

import java.io.Serializable;
import java.nio.channels.SocketChannel;
import java.time.OffsetDateTime;
import java.util.concurrent.Callable;

import com.twitter.teruteru128.study.tcp.MessageBean;
import com.twitter.teruteru128.study.tcp.SerializableObjectDAO;

/**
 * @author teruteru
 * @see https://stackoverflow.com/questions/5862971/java-readobject-with-nio
 */
public class ChannelEchoTask implements Callable<Void> {
    private SocketChannel channel;
    private ServerConfig config;

    public ChannelEchoTask(SocketChannel channel, ServerConfig config) {
        this.channel = channel;
        this.config = config;
    }

    @Override
    public Void call() throws Exception {
        try {
            MessageBean bean = null;
            SerializableObjectDAO dao = new SerializableObjectDAO();
            while (true) {
                dao.recv(channel);
                Serializable serializable = dao.recv(channel);
                if (serializable instanceof MessageBean) {
                    bean = (MessageBean) serializable;
                    bean.getTimestamps().forEach(System.out::println);
                    System.out.println("---------------------------------------");
                    if (bean.isConnectionClose()) {
                        System.out.println("BREAK");
                        break;
                    }
                }
                bean.getTimestamps().add(OffsetDateTime.now(config.getClock()));
                SerializableObjectDAO.send(channel, bean);
            }
        } finally {
            channel.close();
        }
        return null;
    }
}
