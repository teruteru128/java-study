package com.twitter.teruteru128.study.tcp.server;

import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.concurrent.Callable;

/**
 * @author teruteru
 * @see https://stackoverflow.com/questions/5862971/java-readobject-with-nio
 */
public class ChannelEchoTask implements Callable<Void> {
    private Socket socket;
    private ServerConfig config;

    public ChannelEchoTask(Socket socket, ServerConfig config) {
        this.socket = socket;
        this.config = config;
    }

    @Override
    public Void call() throws Exception {
        byte[] b = new byte[8];
        socket.getInputStream().read(b);
        var buffer = ByteBuffer.wrap(b);
        int command = buffer.getInt();
        int length = buffer.getInt();
        byte[] buf = new byte[8192];
        OutputStream os = socket.getOutputStream();
        int l = 0;
        buffer.clear().putInt(command + 128);
        os.write(b, 0, 4);
        SecureRandom random = SecureRandom.getInstanceStrong();
        for (int i = 0; i < length; i += 8192) {
            l = Math.min(length - i, 8192);
            random.nextBytes(buf);
            os.write(buf, 0, l);
        }
        socket.close();
        System.out.println("(*´ω`*)");
        return null;
    }
}
