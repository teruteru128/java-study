package com.twitter.teruteru128.study;

import java.io.FileNotFoundException;
import java.io.IOException;
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
     * @throws ExecutionException
     * @throws InterruptedException
     * @throws InvalidKeyException
     * @throws SignatureException
     * @throws InvalidParameterSpecException
     * @throws InvalidKeySpecException
     * @throws DestroyFailedException
     * @throws Exception
     */
    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException,
            NoSuchAlgorithmException, InvalidKeyException, SignatureException, InvalidParameterSpecException,
            InvalidKeySpecException, DestroyFailedException {
        if (args.length < 1) {
            System.exit(1);
        }
        // getOptionaledResult(Integer.parseInt(args[0], 10));
        sampleECSignature(args[0]);
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
        var signature = Signature.getInstance("ECDSA");
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
