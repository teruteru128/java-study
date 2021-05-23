package com.twitter.teruteru128.study.bouyomichan;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Properties;
import java.util.StringJoiner;

/**
 * 
 */
public class BouyomiChanClient {

    private static final String DEFAULT_HOSTNAME = "localhost";
    private static final int DEFALUT_PORT = 50001;

    public BouyomiChanClient() {
        this(DEFAULT_HOSTNAME, DEFALUT_PORT, Proxy.NO_PROXY);
    }

    public BouyomiChanClient(String host, int port) {
        this(host, port, Proxy.NO_PROXY);
    }

    public BouyomiChanClient(String host, int port, Proxy proxy) {
        super();
        this.hostname = host;
        this.hostport = port;
        this.proxy = proxy;
    }

    private String hostname;
    private int hostport;
    private Proxy proxy;

    /**
     * ←優先度高 コマンドライン引数 ユーザー設定ファイル システム設定ファイル →優先度低
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        var p = new Properties();
        try (InputStream in = BouyomiChanClient.class.getResourceAsStream("config.properties")) {
            p.load(in);
        }
        // TCP281
        var uri = new URI(p.getProperty("bouyomi.uri"));
        final var arglen = args.length;
        var useTor = false;
        var argi = 0;
        var readtextJ = new StringJoiner("\n");
        readtextJ.setEmptyValue("やったぜ。");
        var hasmoreargs = true;
        String arg;
        while (argi < arglen) {
            hasmoreargs = true;
            arg = args[argi];
            if (arg.equals("--proxy")) {
                // TODO
            } else if (arg.equals("--use-tor")) {
                useTor = true;
                hasmoreargs = false;
            } else if (arg.equals("--host")) {
                //
            } else if (arg.equals("--port")) {
                //
            } else {
                readtextJ.add(arg);
            }
            argi += hasmoreargs ? 2 : 1;
        }
        var readText = readtextJ.toString();
        // TODO host port proxy の設定を動的に設定できるようにする 2020-05-01T09:13:33.071237200+09:00
        String host = useTor ? "2ayu6gqru3xzfzbvud64ezocamykp56kunmkzveqmuxvout2yubeeuad.onion" : DEFAULT_HOSTNAME;
        var port = DEFALUT_PORT;
        var proxy = useTor ? new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(DEFAULT_HOSTNAME, 9050))
                : Proxy.NO_PROXY;
        var client = new BouyomiChanClient(host, port, proxy);
        if (readText.length() > 0) {
            client.doTalk(readText);
            System.out.println("読み上げました");
        }
    }

    /**
     * TODO リファクタリング
     * 
     * @param text
     * @throws UnknownHostException
     */
    public void doTalk(String text) throws UnknownHostException, IOException {
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
        /*
         * System.out.printf("command : %d\n", buffer.getShort(0));
         * System.out.printf("speed : %d\n", buffer.getShort(2));
         * System.out.printf("tone : %d\n", buffer.getShort(4));
         * System.out.printf("volume : %d\n", buffer.getShort(6));
         * System.out.printf("voice : %d\n", buffer.getShort(8));
         * System.out.printf("encode : %d\n", buffer.get(10));
         * System.out.printf("length : %d\n", buffer.getInt(11)); buffer.flip();
         */
        byte[] array = buffer.array();
        /*
         * for (int i = 0; i < 15; i++) { System.out.printf("%02x", array[i]); }
         * System.out.println(); for (int i = 15; i < array.length; i++) {
         * System.out.printf("%02x", array[i]); if (i % 16 == 14) {
         * System.out.println(); } } System.out.println();
         * System.out.printf("fulllength : %dbytes\n", buffer.capacity());
         * System.out.printf("datalength : %dbytes\n", messageData.length);
         */
        assert (messageData.length + 15) == buffer.capacity();
        try (Socket socket = new Socket(proxy)) {
            socket.connect(new InetSocketAddress(hostname, hostport));
            socket.getOutputStream().write(array);
        }
    }

    public byte getPause() {
        ByteBuffer buf = ByteBuffer.allocate(2).order(ByteOrder.LITTLE_ENDIAN);
        short command = 0x0110;
        buf.putShort(command);
        buf.flip();
        byte[] array = buf.array();
        byte[] in = new byte[1];
        try (Socket socket = new Socket(proxy)) {
            socket.connect(new InetSocketAddress(hostname, hostport));
            socket.getOutputStream().write(array);
            socket.getInputStream().read(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return in[0];
    }

    public void doPause() {
        ByteBuffer buf = ByteBuffer.allocate(2).order(ByteOrder.LITTLE_ENDIAN);
        short command = 0x0010;
        buf.putShort(command);
        buf.flip();
        byte[] array = buf.array();
        try (Socket socket = new Socket(proxy)) {
            socket.connect(new InetSocketAddress(hostname, hostport));
            socket.getOutputStream().write(array);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void doResume() {
        ByteBuffer buf = ByteBuffer.allocate(2).order(ByteOrder.LITTLE_ENDIAN);
        short command = 0x0020;
        buf.putShort(command);
        buf.flip();
        byte[] array = buf.array();
        try (Socket socket = new Socket(proxy)) {
            socket.connect(new InetSocketAddress(hostname, hostport));
            socket.getOutputStream().write(array);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void doSkip() {
        ByteBuffer buf = ByteBuffer.allocate(2).order(ByteOrder.LITTLE_ENDIAN);
        short command = 0x0030;
        buf.putShort(command);
        buf.flip();
        byte[] array = buf.array();
        try (Socket socket = new Socket(proxy)) {
            socket.connect(new InetSocketAddress(hostname, hostport));
            socket.getOutputStream().write(array);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void doClear() {
        ByteBuffer buf = ByteBuffer.allocate(2).order(ByteOrder.LITTLE_ENDIAN);
        short command = 0x0040;
        buf.putShort(command);
        buf.flip();
        byte[] array = buf.array();
        try (Socket socket = new Socket(proxy)) {
            socket.connect(new InetSocketAddress(hostname, hostport));
            socket.getOutputStream().write(array);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public byte getNowPlaying() {
        ByteBuffer buf = ByteBuffer.allocate(2).order(ByteOrder.LITTLE_ENDIAN);
        short command = 0x0120;
        buf.putShort(command);
        buf.flip();
        byte[] array = buf.array();
        byte[] in = new byte[1];
        try (Socket socket = new Socket(proxy)) {
            socket.connect(new InetSocketAddress(hostname, hostport));
            socket.getOutputStream().write(array);
            socket.getInputStream().read(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return in[0];
    }

    public int getTaskCount() throws IOException {
        var buf = ByteBuffer.allocate(2).order(ByteOrder.LITTLE_ENDIAN);
        short command = 0x0130;
        buf.putShort(command);
        buf.flip();
        var array = buf.array();
        var in = new byte[4];
        try (var socket = new Socket(proxy)) {
            socket.connect(new InetSocketAddress(hostname, hostport));
            socket.getOutputStream().write(array);
            int length = socket.getInputStream().read(in);
            if (length != in.length) {
                throw new IOException("responce recv failed!");
            }
        }
        ByteBuffer inbuf = ByteBuffer.wrap(in).order(ByteOrder.LITTLE_ENDIAN);
        return inbuf.getInt();
    }

}
