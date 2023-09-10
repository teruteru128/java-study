package com.twitter.teruteru128.study;

import java.lang.reflect.InvocationTargetException;
import java.security.Provider;
import java.security.Security;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * Main
 */
public class Main {

    private static final String ORG_BOUNCYCASTLE_JCE_PROVIDER_BOUNCY_CASTLE_PROVIDER = "org.bouncycastle.jce.provider.BouncyCastleProvider";

    static {
        try {
            var bcpc = Class.forName(ORG_BOUNCYCASTLE_JCE_PROVIDER_BOUNCY_CASTLE_PROVIDER);
            var p = Provider.class;
            if (p.isAssignableFrom(bcpc) && Security.getProvider("BC") == null) {
                Security.addProvider(bcpc.asSubclass(p).getConstructor().newInstance());
            }
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException
                | IllegalArgumentException | InvocationTargetException | SecurityException e) {
            throw new InternalError(e);
        }
    }

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        var url = "jdbc:postgresql://localhost/";
        String user = "postgres";
        String password = "postgres";
        var props = new Properties();
        props.setProperty("user", user);
        props.setProperty("password", password);
        try (var con = DriverManager.getConnection(url, props)) {
            System.out.println("Connected!");
        }
    }

}
