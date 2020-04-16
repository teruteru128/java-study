package com.twitter.teruteru128.study.logger;

import java.util.logging.Logger;

/**
 * @author Teruteru
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("com.twitter.teruteru128.test.logger"); 
        logger.info("test");
    }

}
