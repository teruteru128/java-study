package com.twitter.teruteru128.study;

import com.twitter.teruteru128.study.bitmessage.genaddress.BMAddressValidator;

/**
 * Main
 */
public class Main {

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        if (args.length < 3) {
            System.err.println("address sigwif encwif");
            System.exit(1);
        }
        // アドレスと鍵
        var validator = new BMAddressValidator();
        validator.validate(args[0], args[1], args[2]);
    }
}
