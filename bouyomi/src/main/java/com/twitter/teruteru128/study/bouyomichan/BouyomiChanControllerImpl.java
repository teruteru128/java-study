package com.twitter.teruteru128.study.bouyomichan;

import java.net.Proxy;

public class BouyomiChanControllerImpl implements BouyomiChanController {

    private String host;
    private int port;
    private Proxy proxy;

    public BouyomiChanControllerImpl(String host, int port) {
        this(host, port, Proxy.NO_PROXY);
    }

    public BouyomiChanControllerImpl(String host, int port, Proxy proxy) {
        this.host = host;
        this.port = port;
        this.proxy = proxy;
        System.out.printf("%s %d %s%n", this.host, this.port, this.proxy);
    }

    @Override
    public void setServerInfo() {
        // 
    }

    @Override
    public Proxy getProxy() {
        return null;
    }

    @Override
    public void setProxy(Proxy proxy) {
        //
    }

    @Override
    public void doTalk(String text) {
        //
    }

    @Override
    public void doPause() {
        //
    }

    @Override
    public void doResume() {
        //
    }

    @Override
    public void doSkip() {
        //
    }

    @Override
    public void doClear() {
        //
    }

    @Override
    public byte getPause() {
        return 0;
    }

    @Override
    public byte getNowPlaying() {
        return 0;
    }

    @Override
    public int getTaskCount() {
        return 0;
    }
    
}
