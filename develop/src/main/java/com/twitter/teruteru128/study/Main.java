package com.twitter.teruteru128.study;

import java.util.random.RandomGenerator;

/**
 * Main
 */
public class Main {

    static final char[] HEAD_SUFFIX = "^o^)┐".toCharArray();
    static final char[] TAIL_PREFIX = "┌(".toCharArray();

    static {
        try {
            Class.forName("com.twitter.teruteru128.study.BCProviderLoader");
        } catch (ClassNotFoundException e) {
            throw new InternalError(e);
        }
    }

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        /* 
        var numOfLegs = args.length >= 1 ? Integer.parseInt(args[0]) : 2;
        var array = Homo.getHomo(numOfLegs);
        System.out.println(array);
        */
        var d = RandomGenerator.of("SecureRandom").nextDouble(100) + 350.;
        System.out.printf("%1$f ml(%1$a)%n", d);
    }
}
