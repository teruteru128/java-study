package com.twitter.teruteru128.study;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HexFormat;
import java.util.List;
import java.util.StringJoiner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.LongStream;

import javax.crypto.SecretKeyFactory;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;

/**
 * Main
 */
public class Main {

    private static final BigInteger F;

    static {
        byte[] array = new byte[157827];
        array[0] = (byte)'3';
        Arrays.fill(array, 1, 157827, (byte)'7');
        F = new BigInteger(new String(array), 10);
    }

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
        final var func1 = (TriPredicate) (seed, x, z) -> {
            long a = seed + (int) (x * 0x5ac0db) + (int) (x * x * 0x4c1906) + (int) (z * 0x5f24f)
                    + (int) (z * z) * 0x4307a7L ^ 0x5E434E432L;
            int bits;
            int val;
            do {
                a = (a * 0x5deece66dL + 0xb) & 0xffffffffffffL;
                bits = (int) (a >>> 17);
                val = bits % 10;
            } while (bits - val + 9 < 0);
            return val == 0;
        };
        var r = LongStream.range(10000000000L, 0x1000000000000L).parallel().filter(seed -> func1.test(seed, 128, -49))
                .filter(seed -> func1.test(seed, 128, -48)).filter(seed -> func1.test(seed, 128, -47))
                .filter(seed -> func1.test(seed, 128, -46)).filter(seed -> func1.test(seed, 128, -45))
                .filter(seed -> func1.test(seed, 129, -49)).filter(seed -> func1.test(seed, 129, -48))
                .filter(seed -> func1.test(seed, 129, -47)).filter(seed -> func1.test(seed, 129, -46))
                .filter(seed -> func1.test(seed, 129, -45))
                .filter(seed -> func1.test(seed, 130, -49)).filter(seed -> func1.test(seed, 130, -48)).peek(s->System.out.printf("peek: %d%n", s))
                .filter(seed -> func1.test(seed, 130, -47)).filter(seed -> func1.test(seed, 130, -46))
                .filter(seed -> func1.test(seed, 130, -45))
                .filter(seed -> func1.test(seed, 131, -49)).filter(seed -> func1.test(seed, 131, -48))
                .filter(seed -> func1.test(seed, 131, -47)).filter(seed -> func1.test(seed, 131, -46))
                .filter(seed -> func1.test(seed, 131, -45))
                .filter(seed -> func1.test(seed, 132, -49)).filter(seed -> func1.test(seed, 132, -48))
                .filter(seed -> func1.test(seed, 132, -47)).filter(seed -> func1.test(seed, 132, -46))
                .filter(seed -> func1.test(seed, 132, -45)).findAny();
        r.ifPresentOrElse(s->System.out.printf("seed: %d%n", s), ()->System.out.println("not found"));
    }

    private static void getMax(String first) throws IOException, ClassNotFoundException {
        var list = new ArrayList<BigInteger>(20);
        var max = BigInteger.ONE.shiftLeft(1048576);
        for (int i = 1; i < 6; i++) {
            try (var oos = new ObjectInputStream(
                    new ByteArrayInputStream(
                            Files.readAllBytes(Paths.get(first, String.format("524290bit-%d.obj", i)))))) {
                var o = oos.readObject();
                if (o instanceof BigInteger r) {
                    list.add(r);
                } else if (o instanceof BigInteger[] r) {
                    list.addAll(List.of(r));
                }
            }
        }
        Collections.sort(list);
        int size = list.size();
        var baos = new ByteArrayOutputStream();
        try (var oos = new ObjectOutputStream(baos)) {
            oos.writeObject(list.get(size - 1));
        }
        Files.write(Paths.get(first, String.format("%dbit-6.obj", list.get(size - 1).bitLength())),
                baos.toByteArray(), StandardOpenOption.CREATE, StandardOpenOption.WRITE);
    }

    private static void getQ(BigInteger p) throws NoSuchAlgorithmException, IOException, FileNotFoundException {
        BigInteger[] q = new BigInteger[512];
        for (int i = 0; i < 512; i++) {
            do {
                q[i] = new BigInteger(524289, SecureRandom.getInstanceStrong());
            } while (q[i].bitLength() < 524288 || p.multiply(q[i]).bitLength() != 1048576);
        }
        Arrays.sort(q);
        System.out.println(q[511].bitLength());
        System.out.println(p.multiply(q[511]).bitLength());
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream("524290bit-6.obj")))) {
            oos.writeObject(q);
        }
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

    private static long[] choiceSeeds(int seedNum, long exclude) {
        var seeds = new long[seedNum];
        for (int i = 0; i < seedNum; i++) {
            do {
                seeds[i] = (long) ThreadLocalRandom.current().nextInt(65536) << 32;
            } while (seeds[i] < exclude);
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

    public static BigInteger parseDice(char[] faces) {
        char[] a = new char[faces.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = (char) (faces[i] - '1');
        }
        return new BigInteger(new String(a), 6);
    }
}
