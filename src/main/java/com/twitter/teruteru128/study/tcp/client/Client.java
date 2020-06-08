package com.twitter.teruteru128.study.tcp.client;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Client implements Runnable {

    @Override
    public void run() {
        Proxy proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("localhost", 9050));
        try(Socket socket = new Socket(proxy)){
            socket.connect(new InetSocketAddress("2ayu6gqru3xzfzbvud64ezocamykp56kunmkzveqmuxvout2yubeeuad.onion", 50002), 30000);
            ByteBuffer buffer = ByteBuffer.allocate(8);
            buffer.putInt(1);
            buffer.putInt(2500);
            socket.getOutputStream().write(buffer.array());
            byte[] command = new byte[4];
            byte[] buf = new byte[2500];
            socket.getInputStream().read(command);
            socket.getInputStream().read(buf);
            Path out = Paths.get("/dev/random");
            Files.write(out, buf);
            System.out.println("ああ！");
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            System.out.println("CLOSED");
        }
    }

}
