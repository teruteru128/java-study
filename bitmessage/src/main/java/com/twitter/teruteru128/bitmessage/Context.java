package com.twitter.teruteru128.bitmessage;

import javax.net.ssl.SSLEngine;

public class Context {

    public Context() {
    }

    private SSLEngine engine = null;

    public SSLEngine getEngine() {
        return engine;
    }

    public void setEngine(SSLEngine engine) {
        this.engine = engine;
    }

}
