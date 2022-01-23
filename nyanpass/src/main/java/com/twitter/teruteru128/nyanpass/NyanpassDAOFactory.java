package com.twitter.teruteru128.nyanpass;

/**
 * */
public class NyanpassDAOFactory {
    protected NyanpassConfig config;

    public NyanpassDAOFactory(NyanpassConfig config) {
        this.config = config;
    }

    public NyanpassDAO getInstance() {
        return new NyanpassDAOImpl(config);
    }
}
