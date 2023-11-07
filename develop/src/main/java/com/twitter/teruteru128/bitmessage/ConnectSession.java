package com.twitter.teruteru128.bitmessage;

import java.net.SocketAddress;
import java.util.Optional;

import javax.net.ssl.SSLEngine;

/**
 * bitmessageでの接続のステータスを保持するクラス。sslengineとか
 * socketchannelのregisterメソッドに添付する用途。
 */
public class ConnectSession {
    private SocketAddress address;
    private Optional<SSLEngine> sslEngine = Optional.empty();
    private ConnectionType type;
    private boolean verackReceived = false;
    private boolean verackSent = false;

    public ConnectSession(SocketAddress channel, ConnectionType type) {
        this(channel, null, type);
    }

    public ConnectSession(SocketAddress address, SSLEngine engine, ConnectionType type) {
        super();
        this.address = address;
        this.sslEngine = Optional.ofNullable(engine);
    }

    public boolean isVerackReceived() {
        return verackReceived;
    }

    public boolean isVerackSent() {
        return verackSent;
    }

    public void setChannel(SocketAddress address) {
        this.address = address;
    }

    public SocketAddress getAddress() {
        return address;
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
