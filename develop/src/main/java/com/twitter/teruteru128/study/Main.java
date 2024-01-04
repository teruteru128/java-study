package com.twitter.teruteru128.study;

import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Main
 */
public class Main {

    private static final BigInteger F;

    static {
        byte[] array = new byte[157827];
        array[0] = (byte) '3';
        Arrays.fill(array, 1, 157827, (byte) '7');
        F = new BigInteger(new String(array), 10);
        try {
            Security.addProvider(Class.forName("org.bouncycastle.jce.provider.BouncyCastleProvider")
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
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.exit(1);
        }
        System.out.println("うんち！");
    }
}
