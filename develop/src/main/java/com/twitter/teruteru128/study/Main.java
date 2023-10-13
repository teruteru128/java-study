package com.twitter.teruteru128.study;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
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
        if (args.length < 1) {
            System.exit(1);
        }
        // getOptionaledResult(Integer.parseInt(args[0], 10));
        // sampleECSignature(args[0]);
        // getOutput();
    }

    private static void getOutput() {
        var a = 74803317123181L;
        getRandom(a);
        getRandom(867677604900324654L);
        getRandom(164311266871034L);
        getRandom(102496288339266L);

        getSeed();

        int first = 0x80000000;
        int second = 0x00000001;
        long output = (((long)second) << 32) + (long) first;
        System.out.printf("%016x%n", output);
    }

    private static void getRandom(long a) {
        System.out.printf("seed is: %d%n", a);
        var random = new Random();
        random.setSeed(a);
        System.out.printf("%1$f, %1$a%n", random.nextDouble());
        System.out.printf("%1$f, %1$a%n", random.nextDouble());
        System.out.printf("%1$f, %1$a%n", random.nextDouble());
        System.out.printf("%1$f, %1$a%n", random.nextDouble());
        random.setSeed(a);
        System.out.printf("%1$f, %1$a%n", random.nextFloat());
        System.out.printf("%1$f, %1$a%n", random.nextFloat());
        System.out.printf("%1$f, %1$a%n", random.nextFloat());
        System.out.printf("%1$f, %1$a%n", random.nextFloat());
        random.setSeed(a);
        System.out.printf("%1$d, %1$016x%n", random.nextLong());
        System.out.printf("%1$d, %1$016x%n", random.nextLong());
        System.out.printf("%1$d, %1$016x%n", random.nextLong());
        System.out.printf("%1$d, %1$016x%n", random.nextLong());
        random.setSeed(a);
        System.out.printf("%1$d, %1$08x%n", random.nextInt());
        System.out.printf("%1$d, %1$08x%n", random.nextInt());
        System.out.printf("%1$d, %1$08x%n", random.nextInt());
        System.out.printf("%1$d, %1$08x%n", random.nextInt());
        random.setSeed(a);
        System.out.printf("%b%n", random.nextBoolean());
        System.out.printf("%b%n", random.nextBoolean());
        System.out.printf("%b%n", random.nextBoolean());
        System.out.printf("%b%n", random.nextBoolean());
        random.setSeed(a);
        System.out.printf("%1$f, %1$a%n", random.nextGaussian());
        System.out.printf("%1$f, %1$a%n", random.nextGaussian());
        System.out.printf("%1$f, %1$a%n", random.nextGaussian());
        System.out.printf("%1$f, %1$a%n", random.nextGaussian());
        System.out.println();
    }

    private static void getSeed() {
        long start = 0;
        long second = 0;
        long seed = 0;
        for(start = 0xffffffff0000L; start < 0x1000000000000L; start++) {
            second = (start - 0x0b) * 0xDFE05BCB1365L & 0xffffffffffffL;
            seed = ((second - 0x0b) * 0xDFE05BCB1365L & 0xffffffffffffL) ^ 0x5DEECE66DL;
            if((second & 0x0000ffff0000L) == 0) {
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
