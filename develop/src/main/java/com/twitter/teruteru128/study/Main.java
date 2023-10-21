package com.twitter.teruteru128.study;

import java.nio.channels.Selector;
import java.nio.channels.spi.SelectorProvider;

/**
 * Main
 */
public class Main {

    static {
        try {
            Class.forName("com.twitter.teruteru128.study.BCProviderLoader");
        } catch (ClassNotFoundException e) {
            throw new InternalError(e);
        }
    }

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            return;
        }
        var provider = SelectorProvider.provider();
        // sun.nio.ch.WEPollSelectorImpl
        var selector = provider.openSelector();
    }
}
