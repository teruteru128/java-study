package com.twitter.teruteru128.nyanpass;

public class NyanpassDAOImpl implements NyanpassDAO {

    protected NyanpassConfig config;

    public NyanpassDAOImpl(NyanpassConfig config) {
        this.config = config;
    }

    @Override
    public NyanpassBean getNyanpassBean() throws NyanpassException {
        return null;
    }
}