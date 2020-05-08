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
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Mainクラスは実装クラスを叩くだけで可能な限り何もしない
 * 
 * peer
 * node
 * client
 * server
 * clientrunner
 *  スレッド管理
 *  サーバー起動処理
 *  ネットワーク参加処理
 *  サーバーハートビート送信処理
 *  ピアハートビート送信
 * 
 * クライアントの設定フォルダ : C:\Users\terut\AppData\Local\VirtualStore\Program Files (x86)\P2PQuake
 * https://p2pquake.github.io/epsp-specifications/epsp-specifications.html
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(new ClientTask(6910));
        // 設定ファイルから設定読み込み
        // サーバー立ち上げ
        List<String> serverAddressList = Arrays.asList("p2pquake.dyndns.info", "www.p2pquake.net", "p2pquake.dnsalias.net",
                "p2pquake.ddo.jp");
        SecureRandom random = new SecureRandom();
        Collections.shuffle(serverAddressList, random);
        Socket socket = null;
        Socket socket2 = null;
        Charset charset = Charset.forName("SJIS");
        int tempPeerID = 0;
        int peerID = 0;
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH-mm-ss", Locale.JAPAN);
        try {
            for (String serverAddress : serverAddressList) {
                try {
                    InetSocketAddress address = new InetSocketAddress(InetAddress.getByName(serverAddress), 6910);
                    socket = new Socket(Proxy.NO_PROXY);
                    socket.connect(address, 5000);
                    break;
                } catch (IOException e) {
                    System.err.printf("%s : %sへの接続に失敗%n", LocalTime.now(), serverAddress);
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
                // プロトコルバージョンリクエスト
                String a = reader.readLine();
                System.out.println(a.equals("211 1"));
                writer.write(String.format("131 1 0.34:%s:%s\r\n", Const.NAME, Const.VERSION));
                writer.flush();
                a = reader.readLine();
                if (!a.startsWith("212 1 ") && a.startsWith("292 1 ")) {
                    System.err.println("Client protocol version is old");
                    return;
                }
                System.out.println(a);
                // ピアIDの暫定割り当て・ポート開放のチェック
                writer.write("113 1\r\n");
                writer.flush();
                a = reader.readLine();
                System.out.println(a);
                Pattern peerIdPattern = Pattern.compile("^(\\d+) (\\d+) (\\d+)$");
                Matcher peerIdMatcher = peerIdPattern.matcher(a);
                peerIdMatcher.matches();
                tempPeerID = Integer.parseInt(peerIdMatcher.group(3));
                System.out.printf("temp peer id : %d%n", tempPeerID);
                writer.write(String.format("115 1 %d\r\n", tempPeerID));
                writer.flush();
                a = reader.readLine();
                System.out.println(a);
                // ピアへ接続
                // 155 で接続したピアをサーバーへ通知する
                /*
                writer.write(String.format("116 1 %d:0:200:0:0\r\n"));
                writer.flush();
                a = reader.readLine();
                System.out.println(a);
                writer.write("127 1\r\n");
                writer.flush();
                a = reader.readLine();
                System.out.println(a);
                writer.write("118 1\r\n");
                writer.flush();
                Pattern timeFormatPattern = Pattern.compile("^(\\d+) (\\d+) (.+)$");
                a = reader.readLine();
                System.out.println(a);
                Matcher timeMatcher = timeFormatPattern.matcher(a);
                timeMatcher.matches();
                System.out.println(timeMatcher.group(3));
                LocalDateTime localDateTime = LocalDateTime.parse(timeMatcher.group(3), formatter);
                ZonedDateTime time = localDateTime.atZone(tokyo);
                System.out.println(time);
                */
                writer.write("119 1\r\n");
                writer.flush();
                a = reader.readLine();
                System.out.println(a);
            }
            if(!socket.isClosed()){socket.close();System.out.println("closeされました1");}
            socket = null;
            Thread.sleep(5000);
            Collections.shuffle(serverAddressList, random);
            for (String server : serverAddressList) {
                try {
                    InetSocketAddress address = new InetSocketAddress(InetAddress.getByName(server), 6910);
                    socket2 = new Socket(Proxy.NO_PROXY);
                    socket2.connect(address, 5000);
                    break;
                } catch (IOException e) {
                    System.err.printf("%s : %sへの接続に失敗%n", LocalTime.now(), server);
                    if(socket2 != null && !socket2.isClosed())socket2.close();
                    socket2 = null;
                    continue;
                }
            }
            if(socket2 == null){
                System.err.println("socket2 is null");
                return;
            }
            if (!socket2.isConnected()) {
                System.err.println("socket2 is not connected");
                return;
            }
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(socket2.getInputStream(), charset));
                    BufferedWriter writer = new BufferedWriter(
                            new OutputStreamWriter(socket2.getOutputStream(), charset))) {
                String a = reader.readLine();
                System.out.println(a.equals("211 1"));
                writer.write(String.format("131 1 0.20:%s:%s\r\n", Const.NAME, Const.VERSION));
                writer.flush();
                a = reader.readLine();
                System.out.println(a);
                writer.write(String.format("128 1 %d:Unknown\r\n", tempPeerID));
                writer.flush();
                a = reader.readLine();
                System.out.println(a);
                writer.write("119 1\r\n");
                writer.flush();
                a = reader.readLine();
                System.out.println(a);
            }
        } finally {
            if (socket != null) {
                socket.close();
            }
            if (socket2 != null) {
                socket2.close();
            }
        }
    }
}
