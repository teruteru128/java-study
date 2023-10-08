package com.twitter.teruteru128.study;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.security.Provider;
import java.security.Security;
import java.util.random.RandomGenerator;

import org.apache.commons.math3.distribution.NormalDistribution;

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
        // getCum1();
        getCum2(Integer.parseInt(args[0]));
    }

    private static void getCum2(int size) throws FileNotFoundException {
        var dist = new NormalDistribution(3, 0.5);
        var expos = dist.sample(size);
        try (var f = new PrintStream("cumshoots.tsv")) {
            System.setOut(f);
            for (double expo : expos) {
                double cum = Math.pow(10, expo);
                System.out.printf("%1$f\t%1$a\t%2$f\t%2$a\t%3$f\t%3$a%n", expo, 0., cum);
            }
        }
    }

    private static void getCum1() {
        // 射精量
        var random = RandomGenerator.of("SecureRandom");
        // 100ml - 10000ml
        double expo = random.nextDouble(2, 4);
        double delta = random.nextDouble(-0.05, 0.05);
        double cum = Math.pow(10, expo + delta);
        System.out.printf("%1$f, %1$a%n", expo);
        System.out.printf("%1$f, %1$a%n", delta);
        System.out.printf("%1$f, %1$a%n", cum);
    }

}
