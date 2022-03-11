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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
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
 * スレッド管理
 * ピア接続受付サーバー起動処理
 * ネットワーク参加処理
 * サーバーハートビート送信処理
 * ピアハートビート送信
 * 
 * クライアントの設定フォルダ : C:\Users\terut\AppData\Local\VirtualStore\Program Files
 * (x86)\P2PQuake
 * https://p2pquake.github.io/epsp-specifications/epsp-specifications.html
 * 
 * PacketFactory と PacketProcesser
 */
public class Main {

    private static final DateTimeFormatter P2P_DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy/MM/dd HH-mm-ss",
            Locale.JAPAN);
    private static final List<String> SERVER_ADDRESS_LIST = List.of("p2pquake.dyndns.info", "www.p2pquake.net",
            "p2pquake.dnsalias.net",
            "p2pquake.ddo.jp");

    private static SecureRandom random = new SecureRandom();

    private static Socket getServerSocket() {
        Socket socket;
        List<String> workList = new ArrayList<>(SERVER_ADDRESS_LIST);
        Collections.shuffle(workList, random);
        for (String serverAddress : workList) {
            try {
                InetSocketAddress address = new InetSocketAddress(InetAddress.getByName(serverAddress), 6910);
                socket = new Socket(Proxy.NO_PROXY);
                socket.connect(address, 5000);
                return socket;
            } catch (IOException e) {
                System.err.printf("%s : %sへの接続に失敗%n", LocalTime.now(), serverAddress);
                continue;
            }
        }
        throw new RuntimeException();
    }

    public static void main(String[] args) throws Exception {
        ScheduledThreadPoolExecutor executor = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(2);
        // ピアマネージャー -> タスクマネージャー？
        // ハートビート(エコー)を送信するピアのリスト
        // ソケットを開いて受け付けたピアに向いたソケットをワーカースレッドに渡すタスク
        // ピア向けハートビートタスク(ピア毎？)
        // p2pネットワークに接続するワンショットタスク
        // そういえばジョインタスクの中でピアに接続しに行かないといけないんだよな……
        // サーバー向けハートビート
        executor.scheduleAtFixedRate(new ClientHeartbeat(), 0, 3, TimeUnit.MINUTES);
        executor.schedule(() -> executor.shutdown(), 5, TimeUnit.MINUTES);
        // 設定ファイルから設定読み込み
        // サーバー立ち上げ
        Charset charset = Charset.forName("SJIS");
        /** 本割当ピアID */
        int peerID = 0;
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        var factory = new PacketFactory();
        try (Socket socket = getServerSocket();
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream(), charset));
                BufferedWriter writer = new BufferedWriter(
                        new OutputStreamWriter(socket.getOutputStream(), charset))) {
            // プロトコルバージョンリクエスト
            {
                var packet = factory.getInstance(reader.readLine());
                if (packet.getCode() == 211 && packet.getHop() == 1) {
                    System.out.println("211 ok");
                } else {
                }
                writer.write(String.format("131 1 0.35:%s:%s\r\n", Const.NAME, Const.VERSION));
                writer.flush();
            }
            {
                var packet = factory.getInstance(reader.readLine());
                if (!(packet.getCode() == 212 && packet.getHop() == 1)) {
                    System.err.printf("Client protocol version is old(%s)%n", packet.getData()[0]);
                    return;
                }
                System.out.println(packet);
                // ピアIDの暫定割り当て・ポート開放のチェック
                writer.write("113 1\r\n");
                writer.flush();
            }
            {
                var response = reader.readLine();
                System.out.println(response);
                var packet = factory.getInstance(response);
                /** 仮割当ピアID */
                int tempPeerID = Integer.parseInt(packet.getData()[0]);
                System.out.printf("temp peer id : %d%n", tempPeerID);
                // ポート開放する場合はここで114コマンドを送信
                // ピアデータ取得
                writer.write(String.format("115 1 %d\r\n", tempPeerID));
                writer.flush();
                response = reader.readLine();
                System.out.println(response);
                // ピアへ接続
                // 155 で接続したピアをサーバーへ通知する

                writer.write(String.format("116 1 %d:0:200:0:0\r\n", tempPeerID));
                writer.flush();
                response = reader.readLine();
                if (response.startsWith("236 1 ")) {
                    peerID = tempPeerID;
                }
                System.out.println(response);
            }

            // RSA鍵取得
            writer.write(String.format("117 1 %d\r\n", peerID));
            writer.flush();
            var packopt = factory.getInstance(reader.readLine());
            if (packopt.getCode() == 117) {
            } else if (packopt.getCode() == 295) {
            }
            System.out.println(packopt);

            // 各地域ピア数の取得
            writer.write("127 1\r\n");
            writer.flush();
            {
                var response = reader.readLine();
                System.out.println(response);
                var packet = factory.getInstance(response);
            }

            // プロトコル時刻の取得
            writer.write("118 1\r\n");
            writer.flush();
            {
                var response = factory.getInstance(reader.readLine());
                var protocolTimeString = response.getData()[0];
                var localDateTime = LocalDateTime.parse(protocolTimeString,
                        P2P_DATE_FORMATTER);
                var time = localDateTime.atZone(tokyo);
                System.out.println(time);
            }

            // サーバーとの接続終了
            writer.write("119 1\r\n");
            writer.flush();
            var response = reader.readLine();
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
        // part from network
        try (Socket socket = getServerSocket();
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream(), charset));
                BufferedWriter writer = new BufferedWriter(
                        new OutputStreamWriter(socket.getOutputStream(), charset))) {
            String a = reader.readLine();
            System.out.println(a.equals("211 1"));
            writer.write(String.format("131 1 0.20:%s:%s\r\n", Const.NAME, Const.VERSION));
            writer.flush();
            a = reader.readLine();
            System.out.println(a);
            writer.write(String.format("128 1 %d:Unknown\r\n", peerID));
            writer.flush();
            a = reader.readLine();
            System.out.println(a);
            writer.write("119 1\r\n");
            writer.flush();
            a = reader.readLine();
            System.out.println(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
