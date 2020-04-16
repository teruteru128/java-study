package com.twitter.teruteru128.study.tcp;

public class GlobalConfig {

    private GlobalConfig() {
    }

    private static GlobalConfig INSTANCE = new GlobalConfig();

    /**
     * @return the iNSTANCE
     */
    public static GlobalConfig getInstance() {
        return INSTANCE;
    }
}
