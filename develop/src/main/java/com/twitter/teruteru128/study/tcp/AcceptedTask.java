package com.twitter.teruteru128.study.tcp;

import java.io.IOException;
import java.io.UncheckedIOException;
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
        var random = new SecureRandom();
        try (var s = this.socket; var is = s.getInputStream(); var os = s.getOutputStream()) {
            var buffer = ByteBuffer.allocate(32);
            byte[] array = buffer.array();
            int len = is.read(array, 0, 32);
            if (len < 32) {
                throw new IOException(String.format("データ量不足 : %d", len));
            }
            var command = buffer.getInt(0);
            var largeBuffer = new byte[8192];
            var requestedLength = buffer.getLong();
            var sent = 0;
            if (command == 1) {
                while (sent < requestedLength) {
                    random.nextBytes(largeBuffer);
                    os.write(largeBuffer);
                    sent += 8192;
                }
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
