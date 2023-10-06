package com.twitter.teruteru128.study;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.Provider;
import java.security.Security;
import java.util.random.RandomGenerator;

/**
 * Main
 */
public class Main {

    private static final String ORG_BOUNCYCASTLE_JCE_PROVIDER_BOUNCY_CASTLE_PROVIDER = "org.bouncycastle.jce.provider.BouncyCastleProvider";

    static {
        try {
            Security.addProvider(Class.forName(ORG_BOUNCYCASTLE_JCE_PROVIDER_BOUNCY_CASTLE_PROVIDER)
                    .asSubclass(Provider.class).getConstructor().newInstance());
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
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.exit(1);
        }
        // 射精量
        var random = RandomGenerator.of("SecureRandom");
        // 100ml - 10000ml
        double expo = random.nextDouble(3, 5);
        double delta = random.nextDouble(-0.05, 0.05);
        double cum = Math.pow(10, expo + delta);
        System.out.printf("%1$f, %1$a%n", expo);
        System.out.printf("%1$f, %1$a%n", delta);
        System.out.printf("%1$f, %1$a%n", cum);
    }

}
