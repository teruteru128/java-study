package com.twitter.teruteru128.study;

import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.HexFormat;
import java.util.List;
import java.util.StringJoiner;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;

import javax.crypto.SecretKeyFactory;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;

/**
 * Main
 */
public class Main {

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
        if (args.length < 1) {
            System.exit(1);
        }
        // コラッツ予想
        final var ONE = BigInteger.valueOf(1);

        final var random = SecureRandom.getInstanceStrong();
        var poll = Executors.newWorkStealingPool();
        var task = (Callable<R>) () -> {
            long steps2 = 0;
            BigInteger s = null;
            do {
                steps2 = 0;
                s = new BigInteger(1 << 19, random);
                var p = s;
                while (p.compareTo(ONE) != 0) {
                    if (p.testBit(0)) {
                        p = p.shiftLeft(1).add(p).add(ONE).shiftRight(1);
                    } else {
                        p = p.shiftRight(1);
                    }
                    steps2++;
                }
                System.out.println("長すぎるッピ！");
            } while (steps2 < 2560000);
            return new R(s, steps2);
        };
        var r = poll.invokeAny(List.<Callable<R>>of(task, task, task, task, task,
                task, task, task));
        System.out.printf("seed: %d%n", r.seed());
        System.out.printf("steps: %d%n", r.steps());

    }

    private static PBEKey getKey(char[] password, byte[] salt)
            throws NoSuchAlgorithmException, InvalidKeySpecException {
        var factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");
        // どうしてビット単位なんですか
        var inputSpec = new PBEKeySpec(password, salt, 16384, 512);
        var key = (PBEKey) factory.generateSecret(inputSpec);
        return key;
    }

    private static void showKey(PBEKey key) {
        System.out.printf("password: %s%n", key.getAlgorithm());
        System.out.printf("password: %s%n", key.getFormat());
        System.out.printf("password: %s%n", key.getIterationCount());
        System.out.printf("password: %s%n", new String(key.getPassword()));
        System.out.printf("hash: %s%n", HexFormat.of().formatHex(key.getEncoded()));
        System.out.printf("salt: %s%n", HexFormat.of().formatHex(key.getSalt()));
    }

    /**
     * スライムチャンク探索におけるシード開始位置抽選
     */
    public static void choice() {
        for (long seed : choiceSeeds(16, 0x100000000L)) {
            System.out.println(seed);
        }
    }

    private static long[] choiceSeeds(int seedNum, long minToExclude) {
        var seeds = new long[seedNum];
        for (int i = 0; i < seedNum; i++) {
            do {
                seeds[i] = (long) ThreadLocalRandom.current().nextInt(65536) << 32;
            } while (seeds[i] < minToExclude);
        }
        Arrays.sort(seeds);
        return seeds;
    }

    /**
     * @see {@link String#join(String, String, String, String[], int)}
     * @param num
     * @param faces
     * @return
     */
    public static void _3d6(int num, int faces) {
        var p = ThreadLocalRandom.current().nextLong((long) Math.pow(faces, num));
        var array = new long[num];
        var sum = 0;
        var joiner = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < num; i++) {
            array[i] = (p % faces) + 1;
            joiner.add(Long.toString(array[i]));
            p /= faces;
            sum += array[i];
        }
        System.out.printf("%s%n", joiner);
        System.out.printf("%d%n", sum);
    }
}
