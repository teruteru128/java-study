package com.twitter.teruteru128.study.ts;

/**
 * @author Teruteru
 */
public class TSIdentityFactory {
    private static final TSIdentityFactory INSTANCE = new TSIdentityFactory();

    /**
     * 
     */
    private TSIdentityFactory() {
    }

    /**
     * @return instance
     */
    public static TSIdentityFactory getInstance() {
        return INSTANCE;
    }
}
