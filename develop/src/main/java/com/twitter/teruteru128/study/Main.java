package com.twitter.teruteru128.study;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
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
        /* int bitLength = 1048576;
        BigInteger.probablePrime(bitLength, null);
        Path path = Paths.get(".", "even-number-1048576.obj");
        var s = createEvenNumber(bitLength);
        outputObj(path, s); */
        //BigInteger.probablePrime(0, null);
        // 小さな既知素数ふるいを作成、もしくは読み込む
        /* 
        int length = 16777216;
        var sieve = createSmallSieve(length);
        outputObj(Paths.get(String.format("%dbit-smallsieve.obj", length)), sieve);
        */
        // 小さなふるいを使って大きなふるいから合成数を除外
        // 大きな篩の長さ->1048576 / 20 * 64 = 3355444
        //int searchLen = 3355444;
        //long[] bis = new long[unitIndex(searchLen -1) + 1];
        //int length = searchLen;
        //int start = 0;
        // 大きなふるいに残った素数候補を素数判定
        //
        // var f = new BigInteger("3" + "7".repeat(157826), 10);
        // getQ(f);
        // getMax(args[0]);
        // randomSample();
    }

    private static void randomSample() throws NoSuchAlgorithmException {
        var start = new BigInteger(1024, SecureRandom.getInstanceStrong());
        var startBitLength = start.bitLength();
        var fixed = new BigInteger(new BigInteger(start.toString(13), 16).toString(15), 17);
        var fixedBitLength = fixed.bitLength();
        var done = fixed.shiftRight(fixedBitLength - startBitLength);
        int doneBitLength = done.bitLength();
        System.out.printf("%dbit: %0256x%n", startBitLength, start);
        System.out.printf("%dbit: %0256x%n", fixedBitLength, fixed);
        System.out.printf("%dbit: %0256x%n", doneBitLength, done);
    }

    private static long[] createSmallSieve(int length) {
        var sieve = new long[(unitIndex(length -1) + 1)];
        sieve[0] = 1;
        int nextIndex = 1;
        int nextPrime = 3;

        do {
            sieveSingle(sieve, length, nextIndex + nextPrime, nextPrime);
            nextIndex = sieveSearch(sieve, length, nextIndex + 1);
            nextPrime = 2 * nextIndex + 1;
        } while ((nextIndex > 0) && (nextPrime < length));
        return sieve;
    }

    private static int sieveSearch(long[] bits, int limit, int start){
        if(start >= limit)
            return -1;
        int index = start;
        do {
            if(get(bits, index))
            return index;
            index++;
        } while (index < limit -1);
        return 0;
    }

    private static void sieveSingle(long[] bits, int limit, int start, int step) {
        while(start < limit){
            set(bits, start);
            start += step;
        }
    }

    private static boolean get(long[] bits, int bitIndex){
        int unitIndex = unitIndex(bitIndex);
        return ((bits[unitIndex] & bit(bitIndex)) != 0);
    }

    private static void set(long[] bits, int bitIndex) {
        int unitIndex = unitIndex(bitIndex);
        bits[unitIndex] |= bit(bitIndex);
    }

    private static int unitIndex(int bitIndex){
        return bitIndex >>> 6;
    }

    private static long bit(int bitIndex) {
        return 1L << (bitIndex & ((1<<6) - 1));
    }

    private static void outputObj(Path path, Serializable s) throws IOException {
        var baos = new ByteArrayOutputStream();
        try (var oos = new ObjectOutputStream(baos)) {
            oos.writeObject(s);
        }
        Files.write(path, baos.toByteArray(), StandardOpenOption.WRITE,
                StandardOpenOption.CREATE);
    }

    private static BigInteger createEvenNumber(int bitLength) throws NoSuchAlgorithmException {
        return new BigInteger(bitLength, SecureRandom.getInstanceStrong()).setBit(bitLength - 1).clearBit(0);
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
