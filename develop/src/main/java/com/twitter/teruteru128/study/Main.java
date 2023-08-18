package com.twitter.teruteru128.study;

import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
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
        var generator = RandomGenerator.of("SecureRandom");
        double takina_penis = generator.nextDouble(40, 60);
        double chisato_penis = takina_penis + generator.nextDouble(20);
        System.out.printf("takina: %f%n", takina_penis);
        System.out.printf("chisato: %f%n", chisato_penis);
    }

}
