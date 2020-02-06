package com.twitter.teruteru128.study.bouyomichan;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class BouyomiTalker {

    public BouyomiTalker() {
        super();
    }

    /**
     * ←優先度高 コマンドライン引数 ユーザー設定ファイル システム設定ファイル →優先度低
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        LocalDateTime dateTime = LocalDateTime.now(Clock.systemDefaultZone());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日 ah時m分s秒", Locale.JAPAN);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("Gy年M月d日", Locale.JAPAN);
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("ah時m分s秒", Locale.JAPAN);
        JapaneseDate date = JapaneseDate.from(dateTime);
        LocalTime time = LocalTime.from(dateTime);
        var main = new BouyomiTalker();
        // for (;;) {
        main.readText(String.format("今は %s %s ですよー", date.format(formatter2), time.format(formatter3)));
        // readText("hakatanoshio");
        // main.readText("何時？？");
        // Thread.sleep(1000 * 30);
        // }
    }

    private void readText(String text) throws UnknownHostException {
        byte[] messageData = text.getBytes();
        short command = 1;
        short speed = -1;
        short tone = -1;
        short volume = -1;
        short voice = 0;
        byte encode = 0;
        int length = messageData.length;
        int capacity = 15 + length;
        ByteBuffer buffer = ByteBuffer.allocate(capacity).order(ByteOrder.LITTLE_ENDIAN);
        buffer.putShort(command);
        buffer.putShort(speed);
        buffer.putShort(tone);
        buffer.putShort(volume);
        buffer.putShort(voice);
        buffer.put(encode);
        buffer.putInt(length);
        buffer.put(messageData);
        System.out.printf("command : %d\n", buffer.getShort(0));
        System.out.printf("speed : %d\n", buffer.getShort(2));
        System.out.printf("tone : %d\n", buffer.getShort(4));
        System.out.printf("volume : %d\n", buffer.getShort(6));
        System.out.printf("voice : %d\n", buffer.getShort(8));
        System.out.printf("encode : %d\n", buffer.get(10));
        System.out.printf("length : %d\n", buffer.getInt(11));
        buffer.flip();
        byte[] array = buffer.array();
        for (int i = 0; i < 15; i++) {
            System.out.printf("%02x", array[i]);
        }
        System.out.println();
        for (int i = 15; i < array.length; i++) {
            System.out.printf("%02x", array[i]);
            if (i % 16 == 14) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.printf("fulllength : %dbytes\n", buffer.capacity());
        System.out.printf("datalength : %dbytes\n", messageData.length);
        assert (messageData.length + 15) == buffer.capacity();
        boolean useProxy = true;
        String host = useProxy ? "2ayu6gqru3xzfzbvud64ezocamykp56kunmkzveqmuxvout2yubeeuad.onion" : "localhost";
        int port = 50001;
        var proxy = useProxy ? new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("localhost", 9050)) : Proxy.NO_PROXY;
        try (Socket socket = new Socket(proxy)) {
            socket.connect(new InetSocketAddress(host, port));
            socket.getOutputStream().write(array);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
