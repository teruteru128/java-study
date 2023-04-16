package com.twitter.teruteru128.bitmessage;

import java.nio.channels.SocketChannel;

import javax.net.ssl.SSLEngine;

/**
 * bitmessageでの接続のステータスを保持するクラス。sslengineとか
 * socketchannelのregisterメソッドに添付する用途。
 */
public class ConnectSession {
    private SocketChannel channel;
    private SSLEngine sslEngine = null;
    private boolean verackReceived = false;
    private boolean verackSent = false;

    public ConnectSession(SocketChannel channel) {
        this(channel, null);
    }

    public ConnectSession(SocketChannel channel, SSLEngine engine) {
        super();
        this.channel = channel;
        this.sslEngine = engine;
    }

    public boolean isVerackReceived() {
        return verackReceived;
    }

    public boolean isVerackSent() {
        return verackSent;
    }

    public void setChannel(SocketChannel channel) {
        this.channel = channel;
    }

    public SocketChannel getChannel() {
        return channel;
    }

    public void setSSLEngine(SSLEngine engine) {
        this.sslEngine = engine;
    }

    public SSLEngine getSSLEngine() {
        return sslEngine;
    }

    public boolean isSSL() {
        return sslEngine != null;
    }
}
