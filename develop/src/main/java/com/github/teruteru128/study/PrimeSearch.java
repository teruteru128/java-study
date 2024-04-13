package com.github.teruteru128.study;

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
import java.util.BitSet;

public class PrimeSearch {

    public static void getConvertedStep() throws IOException, ClassNotFoundException {
        BigInteger base = PrimeSearch.extracted2();
        BitSet sieve = PrimeSearch.extracted3();
        int step = sieve.nextClearBit(0);
        int convertedStep = (step * 2) + 1;
        while (true) {
            var p = base.add(BigInteger.valueOf(convertedStep));
            if (p.isProbablePrime(100)) {
                System.out.printf("prime: step is %d%n", step);
                break;
            }
            System.out.printf("not prime: step %d is not prime%n", step);
            step = sieve.nextClearBit(step + 1);
            convertedStep = (step * 2) + 1;
        }
    }

    public static void createBitSieve() throws IOException, ClassNotFoundException, FileNotFoundException {
        // 小さなふるいを使って大きなふるいから合成数を除外
        // 大きな篩の長さ->1048576 / 20 * 64 = 3355444
    
        long[] smallSieve = PrimeSearch.extracted1();
        BigInteger base = PrimeSearch.extracted2();
        int searchLen = base.bitLength() / 20 * 64;
        int length = searchLen;
        long[] bis = PrimeSearch.getBits(smallSieve, base, searchLen);
        var set = BitSet.valueOf(bis);
        int nextClearBit = set.nextClearBit(0);
        if (nextClearBit == searchLen || nextClearBit == -1) {
            System.out.println("失敗！");
            return;
        }
        try (var oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(
                String.format("largesieve-1048576bit-32ec7597-040b-4f0c-a081-062d4fa72ecd-%dbit-2.obj", searchLen))))) {
            oos.writeInt(length);
            oos.writeObject(bis);
        }
    }

    public static void getSieve() throws IOException {
        // 小さな既知素数ふるいを作成、もしくは読み込む
        int length = 1 << 30;
        var sieve = PrimeSearch.createSmallSieve(length);
        PrimeSearch.outputObj(Paths.get(String.format("%dbit-smallsieve.obj", length)), sieve);
    }

    public static void getS() throws NoSuchAlgorithmException, IOException {
        int bitLength = 1048576;
        Path path = Paths.get(".", "even-number-1048576.obj");
        var s = PrimeSearch.createEvenNumber(bitLength);
        PrimeSearch.outputObj(path, s);
    }

    static BitSet extracted3() throws IOException, ClassNotFoundException {
        long[] n = null;
        try (var ois = new ObjectInputStream(new ByteArrayInputStream(Files.readAllBytes(
                Paths.get("largesieve-1048576bit-32ec7597-040b-4f0c-a081-062d4fa72ecd-3355392bit-2.obj"))))) {
            ois.readInt();
            n = (long[]) ois.readObject();
        }
        return BitSet.valueOf(n);
    }

    static BigInteger extracted2() throws IOException, ClassNotFoundException {
        BigInteger base;
        try (var ois = new ObjectInputStream(new ByteArrayInputStream(
                Files.readAllBytes(Paths.get("even-number-1048576bit-32ec7597-040b-4f0c-a081-062d4fa72ecd.obj"))))) {
            base = (BigInteger) ois.readObject();
        }
        return base;
    }

    static long[] extracted1() throws IOException, ClassNotFoundException {
        long[] smallSieve;
        try (var ois = new ObjectInputStream(
                new ByteArrayInputStream(Files.readAllBytes(Paths.get("1073741824bit-smallsieve.obj"))))) {
            smallSieve = (long[]) ois.readObject();
        }
        return smallSieve;
    }

    static long[] getBits(long[] smallSieve, BigInteger base, int searchLen) {
        long[] bis = new long[unitIndex(searchLen - 1) + 1];
        int start = 0;
        int step = PrimeSearch.sieveSearch(smallSieve, smallSieve.length, start);
        int convertedStep = (step * 2) + 1;
        BigInteger b = base;
        do {
            start = b.mod(BigInteger.valueOf(convertedStep)).intValue();
    
            start = convertedStep - start;
            if (start % 2 == 0)
                start += convertedStep;
            PrimeSearch.sieveSingle(bis, searchLen, (start - 1) / 2, convertedStep);
    
            step = PrimeSearch.sieveSearch(smallSieve, smallSieve.length, step + 1);
            convertedStep = (step * 2) + 1;
        } while (step > 0);
        return bis;
    }

    static long[] createSmallSieve(int length) {
        var sieve = new long[(unitIndex(length - 1) + 1)];
        sieve[0] = 1;
        int nextIndex = 1;
        int nextPrime = 3;
    
        do {
            PrimeSearch.sieveSingle(sieve, length, nextIndex + nextPrime, nextPrime);
            nextIndex = PrimeSearch.sieveSearch(sieve, length, nextIndex + 1);
            nextPrime = 2 * nextIndex + 1;
        } while ((nextIndex > 0) && (nextPrime < length));
        return sieve;
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

    static int sieveSearch(long[] bits, int limit, int start) {
        if (start >= limit)
            return -1;
        int index = start;
        do {
            if (!get(bits, index))
                return index;
            index++;
        } while (index < limit - 1);
        return -1;
    }

    static void sieveSingle(long[] bits, int limit, int start, int step) {
        while (start < limit) {
            set(bits, start);
            start += step;
        }
    }

    static boolean get(long[] bits, int bitIndex) {
        int unitIndex = unitIndex(bitIndex);
        return ((bits[unitIndex] & bit(bitIndex)) != 0);
    }

    static void set(long[] bits, int bitIndex) {
        int unitIndex = unitIndex(bitIndex);
        bits[unitIndex] |= bit(bitIndex);
    }

    static int unitIndex(int bitIndex) {
        return bitIndex >>> 6;
    }

    static long bit(int bitIndex) {
        return 1L << (bitIndex & ((1 << 6) - 1));
    }

    static void outputObj(Path path, Serializable s) throws IOException {
        var baos = new ByteArrayOutputStream();
        try (var oos = new ObjectOutputStream(baos)) {
            oos.writeObject(s);
        }
        Files.write(path, baos.toByteArray(), StandardOpenOption.WRITE,
                StandardOpenOption.CREATE);
    }

    static BigInteger createEvenNumber(int bitLength) throws NoSuchAlgorithmException {
        return new BigInteger(bitLength, SecureRandom.getInstanceStrong()).setBit(bitLength - 1).clearBit(0);
    }

    private static final long ADDEND = 0xbL;
    private static final long MASK = 0xffffffffffffL;
    private static final long MULTIPLIER = 0x5deece66dL;
}
