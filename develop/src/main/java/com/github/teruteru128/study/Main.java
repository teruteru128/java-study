package com.github.teruteru128.study;

import java.lang.reflect.InvocationTargetException;
import java.security.Provider;
import java.security.Security;
import picocli.CommandLine;

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
     */
    public static void main(String[] args) {
        var exitCode = new CommandLine(Factory.createInstance()).execute(args);
        Runtime.getRuntime().exit(exitCode);
    }

}
