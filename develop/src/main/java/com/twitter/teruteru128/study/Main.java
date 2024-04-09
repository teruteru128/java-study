package com.twitter.teruteru128.study;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.security.*;
import java.util.*;

import static java.lang.Math.min;

/**
 * Main
 */
public class Main {

    static {
        try {
            if (Security.getProvider("BC") == null) {
                var clazz = Class.forName("org.bouncycastle.jce.provider.BouncyCastleProvider");
                var subclass = clazz.asSubclass(Provider.class);
                var constructor = subclass.getConstructor();
                var provider = constructor.newInstance();
                Security.addProvider(provider);
            }
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException |
                 IllegalArgumentException | InvocationTargetException | SecurityException e) {
            throw new InternalError(e);
        }
    }

    /**
     * @param args command line arguments
     * @throws Exception 何か起こるかもしれない
     */
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            Runtime.getRuntime().exit(1);
        }
        Factory.create(args);
    }

}
