package com.twitter.teruteru128.study;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.reflect.InvocationTargetException;
import java.security.Provider;
import java.security.Security;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Main
 */
public class Main {

    private static final byte[] BUF = new byte[] { 0x07 };
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
        var service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(() -> {
            try {
                System.out.write(BUF);
                System.out.flush();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }, 180, 180, TimeUnit.SECONDS);
    }

}
