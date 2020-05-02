package com.twitter.teruteru128.study.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.security.SecureRandom;

public class AcceptedTask implements Runnable {

    private Socket socket;

    public AcceptedTask(Socket socket) {
        super();
        this.socket = socket;
    }

    @Override
    public void run() {
        SecureRandom random = new SecureRandom();
        try (Socket socket = this.socket; InputStream is = socket.getInputStream(); OutputStream os = socket.getOutputStream()) {
            ByteBuffer buffer = ByteBuffer.allocate(32);
            byte[] array = buffer.array();
            int len = is.read(array, 0, 32);
            int command = buffer.getInt(0);
            byte[] largeBuffer = new byte[8192];
        } catch (IOException e) {
        }
    }
}
