package com.github.teruteru128.study;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.time.LocalDateTime;

public class Telnet {
    static void extracted(String hostname, int port) throws IOException, InterruptedException {
        boolean done = false;
        var endpoint = new InetSocketAddress(hostname, port);
        while (!done) {
            try (var channel = new Socket(SiteChecker.PROXY)) {
                channel.connect(endpoint, 5000);
                System.out.println("connected! " + LocalDateTime.now());
                done = true;
            } catch (SocketTimeoutException e) {
                System.err.printf("たいむあうと: %dbytes%n", e.bytesTransferred);
            } catch (SocketException ignored) {
                System.err.println("だめぽ");
            }
            Thread.sleep(1000 * 60 * 5);
        }
    }
}
