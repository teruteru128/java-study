package com.twitter.teruteru128.study.p2pquake;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main2 {

    private static final String NAME = "P2PQ_Java";
    private static final String VERSION = "1.0.0-SNAPSHOT";

    public static void main(String[] args) throws Exception {
        List<String> serverList = Arrays.asList("p2pquake.dyndns.info", "www.p2pquake.net", "p2pquake.dnsalias.net",
                "p2pquake.ddo.jp");
        {
            SecureRandom random = new SecureRandom();
            Collections.shuffle(serverList, random);
        }

        Socket socket = null;
        Charset charset = Charset.forName("SJIS");
        int tempPeerID = 469;
        int peerID = 0;
        try {
            for (String server : serverList) {
                try {
                    InetSocketAddress address = new InetSocketAddress(InetAddress.getByName(server), 6910);
                    socket = new Socket(Proxy.NO_PROXY);
                    socket.connect(address, 5000);
                    break;
                } catch (IOException e) {
                    System.err.printf("%s : %sへの接続に失敗%n", LocalTime.now(), server);
                    continue;
                }
            }
            if (socket == null || !socket.isConnected()) {
                System.err.println("失敗");
                return;
            }
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream(), charset));
                    BufferedWriter writer = new BufferedWriter(
                            new OutputStreamWriter(socket.getOutputStream(), charset))) {
                String response = reader.readLine();
                if (response.equals("211 1")) {

                }
                writer.write(String.format("131 1 0.35:%s:%s\r\n", NAME, VERSION));
                writer.flush();
                response = reader.readLine();
                if (response.startsWith("212 1 ")) {

                }
                writer.write(String.format("128 1 %d:Unknown\r\n", tempPeerID));
                writer.flush();
                response = reader.readLine();
                System.out.println(response);
                writer.write("119 1\r\n");
                writer.flush();
                response = reader.readLine();
                System.out.println(response);
            }
        } finally {
            if (socket != null) {
                socket.close();
            }
        }
    }
}
