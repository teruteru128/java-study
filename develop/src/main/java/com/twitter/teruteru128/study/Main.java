package com.twitter.teruteru128.study;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Random;

/**
 * Main
 */
public class Main {

    private static void print(long seed) {
        System.out.println(seed);
        Random random = new Random(seed);
        float f2 = random.nextFloat();
        System.out.printf("float1: %1$f, %1$a, %2$08x%n", f2, Float.floatToIntBits(f2));
        float f1 = random.nextFloat();
        System.out.printf("float2: %1$f, %1$a, %2$08x%n", f1, Float.floatToIntBits(f1));
        random.setSeed(seed);
        double d1 = random.nextDouble();
        double d2 = random.nextDouble();
        System.out.printf("double1: %1$f, %1$a, %2$016x%n", d1, Double.doubleToLongBits(d2));
        System.out.printf("double1: %1$f, %1$a, %2$016x%n", d2, Double.doubleToLongBits(d2));
        random.setSeed(seed);
        System.out.printf("int1: %016x%n", random.nextInt());
        System.out.printf("int1: %016x%n", random.nextInt());
    }

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        print(74803317123181L);
        System.out.println("--");
        print(125352706827826L);
        System.out.println("--");
        print(116229385253865L);
    }
}
