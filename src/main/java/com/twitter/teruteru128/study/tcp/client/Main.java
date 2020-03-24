package com.twitter.teruteru128.study.tcp.client;

import java.io.Serializable;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;
import java.time.OffsetDateTime;

import com.twitter.teruteru128.study.tcp.MessageBean;
import com.twitter.teruteru128.study.tcp.SerializableObjectDAO;

public class Main {

    public static void main(String[] args) throws Exception {
        try (SocketChannel channel = SocketChannel.open(new InetSocketAddress("localhost", 50000))) {
            MessageBean bean = new MessageBean();
            bean.getTimestamps().add(OffsetDateTime.now());
            SerializableObjectDAO dao = new SerializableObjectDAO();
            for (int i = 0; i < 10; i++) {
                if (i == 9) {
                    bean.setConnectionClose(true);
                }
                SerializableObjectDAO.send(channel, bean);
                dao.recv(channel);
                Serializable serializable = dao.recv(channel);
                if (serializable instanceof MessageBean) {
                    bean = (MessageBean) serializable;
                    bean.getTimestamps().forEach(System.out::println);
                    System.out.println("---------------------------------------");
                }
            }
        } finally {
            System.out.println("CLOSED");
        }
    }

}
