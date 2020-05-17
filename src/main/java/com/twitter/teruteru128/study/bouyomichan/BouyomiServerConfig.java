package com.twitter.teruteru128.study.bouyomichan;

import java.io.Serializable;
import java.net.Proxy;

public class BouyomiServerConfig implements Serializable {
    private static final long serialVersionUID = 114514;
    String address;
    int port;
    Proxy proxy;

    public BouyomiServerConfig() {
        super();
    }
}
