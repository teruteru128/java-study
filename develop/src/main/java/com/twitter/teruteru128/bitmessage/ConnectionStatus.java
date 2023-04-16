package com.twitter.teruteru128.bitmessage;

import javax.net.ssl.SSLEngine;

/**
 * bitmessageでの接続のステータスを保持するクラス。sslengineとか
 * socketchannelのregisterメソッドに添付する用途。
 */
public class ConnectionStatus {
    public ConnectionStatus() {
        super();
    }

    boolean ssl = false;
    SSLEngine engine = null;
    boolean verackSent = false;
    boolean verackReceived = false;
    long services = 0;

    boolean isServiceSupported(long mask) {
        return (services & mask) == mask;
    }

    public boolean supportNetwork() {
        return isServiceSupported(Service.NODE_NETWORK);
    }

    public boolean supportSSL() {
        return isServiceSupported(Service.NODE_SSL);
    }

    public boolean supportPOW() {
        return isServiceSupported(Service.NODE_POW);
    }

    public boolean supportDandelion() {
        return isServiceSupported(Service.NODE_DANDELION);
    }
}
