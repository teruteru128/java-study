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
     * --host ホスト名(default: localhost) --port ポート番号(default: 50001)
     * 
     * サブコマンド talk getpause setpause resume skip clear getnowplaying gettaskcount
     * 
     * --command --speed --tone --volume --voice --encode
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
        System.out.println(uri);
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
    public void doTalk(String text) throws IOException {
        byte[] messageData = text.getBytes();
        short command = 1;
        short speed = -1;
        short tone = -1;
        short volume = -1;
        short voice = 0;
        byte encode = 0;
        int length = messageData.length;
        var capacity = 15;
        ByteBuffer buffer = ByteBuffer.allocate(capacity).order(ByteOrder.LITTLE_ENDIAN);
        buffer.putShort(command);
        buffer.putShort(speed);
        buffer.putShort(tone);
        buffer.putShort(volume);
        buffer.putShort(voice);
        buffer.put(encode);
        buffer.putInt(length);
        byte[] array = buffer.array();

        System.out.printf("fulllength : %dbytes%n", buffer.capacity());
        System.out.printf("datalength : %dbytes%n", messageData.length);

        try (var socket = new Socket(proxy)) {
            socket.connect(new InetSocketAddress(hostname, hostport));
            try (var o = socket.getOutputStream()) {
                o.write(array);
                o.write(messageData);
            }
        }
    }

    public byte getPause() {
        ByteBuffer buf = ByteBuffer.allocate(2).order(ByteOrder.LITTLE_ENDIAN);
        short command = 0x0110;
        buf.putShort(command);
        buf.flip();
        byte[] array = buf.array();
        var in = new byte[1];
        try (var socket = new Socket(proxy)) {
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
        try (var socket = new Socket(proxy)) {
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
        try (var socket = new Socket(proxy)) {
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
        try (var socket = new Socket(proxy)) {
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
        try (var socket = new Socket(proxy)) {
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
        var in = new byte[1];
        try (var socket = new Socket(proxy)) {
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
