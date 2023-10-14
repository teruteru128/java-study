package com.twitter.teruteru128.study;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.util.ArrayList;
import java.util.HexFormat;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.function.Supplier;
import java.util.random.RandomGenerator;

import javax.security.auth.DestroyFailedException;

import org.apache.commons.math3.distribution.NormalDistribution;

/**
 * Main
 */
public class Main {

    static {
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
        if (args.length < 2) {
            System.exit(1);
        }
        // getOptionaledResult(Integer.parseInt(args[0], 10));
        // sampleECSignature(args[0]);
        // getMaskB(args);
    }

    private static void getMaskB(String[] args) {
        long maskA = Long.parseLong(args[0], 16);
        long maskB = Long.parseLong(args[1], 16);
        getOutput(maskA, maskB);
        getSeed2(maskA, maskB);
    }

    private static void getSeed2(long maskA, long maskB) {
        long p = 0;
        long seed = 0;
        for (long s = 0xffffffff0000L; s < 0x1000000000000L; s++) {
            p = ((s - 0x0b) * 0xDFE05BCB1365L) & 0xffffffffffffL;
            seed = ((p - 0x0b) * 0xDFE05BCB1365L & 0xffffffffffffL) ^ 0x5DEECE66DL;
            if ((p & maskA) == maskB) {
                System.out.printf("%d%n", seed);
            }
        }
    }

    private static void getOutput(long mask, long b) {
        var a = 74803317123181L;
        getRandom(a);
        getRandom(867677604900324654L);
        getRandom(164311266871034L);
        getRandom(102496288339266L);

        getSeed(mask, b);

        int first = 0x80000000;
        int second = 0x00000001;
        long output = (((long) second) << 32) + (long) first;
        System.out.printf("%016x%n", output);
    }

    private static void printA(Random random, long a, String format, Supplier<?> c) {
        random.setSeed(a);
        for (int i = 0; i < 4; i++) {
            System.out.printf(format, c.get());
        }
    }

    private static void printB(Random random, long a, String format, Method m) {
        random.setSeed(a);
        try {
            for (int i = 0; i < 4; i++) {
                System.out.printf(format, m.invoke(random));
            }
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    private static void getRandom(long a) {
        System.out.printf("seed is: %d%n", a);
        var random = new Random();
        extracted(a, random);
        getRandomClass(a, random);
        extracted2(a, random);
        System.out.println();
    }

    private static void extracted2(long a, Random random) {
        random.setSeed(a);
        for (int i = 0; i < 4; i++) {
            System.out.printf("%1$f, %1$a%n", random.nextDouble());
        }
        random.setSeed(a);
        for (int i = 0; i < 4; i++) {
            System.out.printf("%1$f, %1$a%n", random.nextFloat());
        }
        random.setSeed(a);
        for (int i = 0; i < 4; i++) {
            System.out.printf("%1$d, %1$016x%n", random.nextLong());
        }
        random.setSeed(a);
        for (int i = 0; i < 4; i++) {
            System.out.printf("%1$d, %1$08x%n", random.nextInt());
        }
        random.setSeed(a);
        for (int i = 0; i < 4; i++) {
            System.out.printf("%b%n", random.nextBoolean());
        }
        random.setSeed(a);
        for (int i = 0; i < 4; i++) {
            System.out.printf("%1$f, %1$a%n", random.nextGaussian());
        }
    }

    private static void getRandomClass(long a, Random random) {
        var randomClass = random.getClass();
        try {
            var nextDoubleMethod = randomClass.getMethod("nextDouble");
            var nextFloatMethod = randomClass.getMethod("nextFloat");
            var nextLongMethod = randomClass.getMethod("nextLong");
            var nextIntMethod = randomClass.getMethod("nextInt");
            var nextBooleanMethod = randomClass.getMethod("nextBoolean");
            var nextGaussianMethod = randomClass.getMethod("nextGaussian");
            printB(random, a, "%1$f, %1$a%n", nextDoubleMethod);
            printB(random, a, "%1$f, %1$a%n", nextFloatMethod);
            printB(random, a, "%1$d, %1$016x%n", nextLongMethod);
            printB(random, a, "%1$d, %1$08x%n", nextIntMethod);
            printB(random, a, "%b%n", nextBooleanMethod);
            printB(random, a, "%1$f, %1$a%n", nextGaussianMethod);
        } catch (NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
        }
    }

    private static void extracted(long a, Random random) {
        printA(random, a, "%1$f, %1$a%n", random::nextDouble);
        printA(random, a, "%1$f, %1$a%n", random::nextFloat);
        printA(random, a, "%1$d, %1$016x%n", random::nextLong);
        printA(random, a, "%1$d, %1$08x%n", random::nextInt);
        printA(random, a, "%b%n", random::nextBoolean);
        printA(random, a, "%1$f, %1$a%n", random::nextGaussian);
    }

    private static void getSeed(long mask, long a) {
        long start = 0;
        long second = 0;
        long seed = 0;
        for (start = 0xffffffff0000L; start < 0x1000000000000L; start++) {
            second = (start - 0x0b) * 0xDFE05BCB1365L & 0xffffffffffffL;
            seed = ((second - 0x0b) * 0xDFE05BCB1365L & 0xffffffffffffL) ^ 0x5DEECE66DL;
            if ((second & mask) == a) {
                System.out.printf("start: %016x, second: %016x, seed: %016x%n", start, second, seed);
            }
        }
    }

    private static void sampleECSignature(String message)
            throws NoSuchAlgorithmException, InvalidParameterSpecException,
            InvalidKeySpecException, InvalidKeyException, SignatureException, DestroyFailedException {
        var format = HexFormat.of();
        var params = AlgorithmParameters.getInstance("EC");
        params.init(new ECGenParameterSpec("secp256k1"));
        var parameterSpec = params.getParameterSpec(ECParameterSpec.class);
        var privateKeyStr = System.getenv("PRIVATE_KEY_STR");
        if (privateKeyStr == null || privateKeyStr.isEmpty()) {
            System.err.println("fail!");
            return;
        }
        var rawPrivateKey = format.parseHex(privateKeyStr);
        if (rawPrivateKey.length < 32) {
            System.err.println("fail!");
            return;
        }
        var spec = new ECPrivateKeySpec(new BigInteger(rawPrivateKey, 0, 32), parameterSpec);
        var factory = KeyFactory.getInstance("EC");
        // お前毎度毎度分かりにくいんだよ生データを鍵まで持ってくのがよぉ！
        var pri = factory.generatePrivate(spec);
        var messageBytes = message.getBytes(StandardCharsets.UTF_8);
        var signature = Signature.getInstance("SHA256withECDSA");
        signature.initSign(pri);
        signature.update(messageBytes);
        var s = signature.sign();
        System.out.println(format.formatHex(s));
    }

    private static void getOptionaledResult(int threads) throws InterruptedException, ExecutionException {
        var service = Executors.newCachedThreadPool();
        var list = new ArrayList<SearchTask>(threads);
        for (int i = 0; i < threads; i++) {
            list.add(new SearchTask());
        }
        var optionaledResult = service.invokeAny(list);
        optionaledResult.ifPresent(System.out::println);
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
