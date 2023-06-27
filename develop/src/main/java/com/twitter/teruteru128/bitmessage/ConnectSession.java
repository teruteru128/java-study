package com.twitter.teruteru128.bitmessage;

import java.nio.channels.SocketChannel;
import java.util.Optional;

import javax.net.ssl.SSLEngine;

/**
 * bitmessageでの接続のステータスを保持するクラス。sslengineとか
 * socketchannelのregisterメソッドに添付する用途。
 */
public class ConnectSession {
    private SocketChannel channel;
    private Optional<SSLEngine> sslEngine = Optional.empty();
    private ConnectionType type;
    private boolean verackReceived = false;
    private boolean verackSent = false;

    public ConnectSession(SocketChannel channel, ConnectionType type) {
        this(channel, null, type);
    }

    public ConnectSession(SocketChannel channel, SSLEngine engine, ConnectionType type) {
        super();
        this.channel = channel;
        this.sslEngine = Optional.ofNullable(engine);
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
        this.sslEngine = Optional.ofNullable(engine);
    }

    public Optional<SSLEngine> getSSLEngine() {
        return sslEngine;
    }

    public boolean isSSL() {
        return sslEngine.isPresent();
    }

    public ConnectionType getType() {
        return type;
    }
}
