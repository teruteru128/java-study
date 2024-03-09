package com.twitter.teruteru128.study;

import com.twitter.teruteru128.bitmessage.app.Spammer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.SelectorProvider;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Base64;
import java.util.Collections;
import java.util.HexFormat;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;

import static java.lang.Math.min;

/**
 * Main
 */
public class Main {

    public static final RandomGenerator SECURE_RANDOM_GENERATOR = RandomGenerator.of("SecureRandom");
    private static final byte[] TSKEY = "b9dfaa7bee6ac57ac7b65f1094a1c155e747327bc2fe5d51c512023fe54a280201004e90ad1daaae1075d53b7d571c30e063b5a62a4a017bb394833aa0983e6e".getBytes();
    private static final HexFormat hexFormat = HexFormat.of();

    static {
        try {
            if (Security.getProvider("BC") == null) {
                var clazz = Class.forName("org.bouncycastle.jce.provider.BouncyCastleProvider");
                var subclass = clazz.asSubclass(Provider.class);
                var constructor = subclass.getConstructor();
                var provider = constructor.newInstance();
                Security.addProvider(provider);
            }
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException |
                 IllegalArgumentException | InvocationTargetException | SecurityException e) {
            throw new InternalError(e);
        }
        try (var s = new BufferedReader(new InputStreamReader(Objects.requireNonNull(Main.class.getResource("class-list.txt")).openStream()))) {
            s.lines().forEach(className -> {
                try {
                    Class.forName(className);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @param args command line arguments
     * @throws Exception 何か起こるかもしれない
     */
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            return;
        }
        switch (args[0]) {
            case "bmg" -> extracted2();
            case "clone" -> extracted1();
            case "getPubKeySpam" ->
                    Spammer.getPubKeySpam((SecureRandom) SECURE_RANDOM_GENERATOR, args.length >= 2 ? Integer.parseInt(args[1]) : 10000);
            case "random" -> doubleSample(ThreadLocalRandom.current());
            case "random2" -> extracted();
            case "ts" -> {
                var decoder = Base64.getDecoder();
                ts1(decoder);
                // ここで秘密鍵を公開鍵に変換する
                var publicKey = "MEwDAgcAAgEgAiEA7Vo1+Orf2xuuu6hTPAPldSfrUZZ7WYAzpRcO5DoYFLoCIF1JKVBctOGvMOy495O/BWFuFEYH4i1f6vU0b9+a64RD".getBytes();
                ts2(publicKey, args.length >= 2 ? Integer.parseInt(args[1]) : Runtime.getRuntime().availableProcessors());
            }
            case "unitSpam" -> {
                if (args.length >= 2) {
                    if (args.length >= 3) {
                        Spammer.unitSpam(Files.readAllLines(Path.of(args[1])), 2500, Duration.ofHours(12), Integer.parseInt(args[2]));
                    } else Spammer.unitSpam(Files.readAllLines(Path.of(args[1])), 2500, Duration.ofHours(12), 0);
                }
            }
            default -> System.err.println("unknown command");
        }
    }

    private static void ts2(byte[] publicKey, int n) throws NoSuchAlgorithmException, DigestException, InterruptedException, ExecutionException {
        System.out.println("n = " + n);
        System.out.println(new String(publicKey));
        System.out.println(getSecurityLevel(publicKey, 16689509343190L));
        System.err.printf("開幕: %s%n", LocalDateTime.now());
        try (var service = Executors.newCachedThreadPool()) {
            var counter = (Long) service.invokeAny(Collections.nCopies(n, () -> {
                long co;
                var buffer = ByteBuffer.allocate(20).order(ByteOrder.LITTLE_ENDIAN);
                var hash = buffer.array();
                var current = RandomGenerator.getDefault();
                var w = MessageDigest.getInstance("SHA-1");
                int i;
                do {
                    do {
                        w.update(publicKey);
                        co = current.nextLong();
                        // teamspeakのカウンターは符号なし
                        // TODO toUnsignedString() -> getBytes で byte[]を取得とか絶対遅いからもっと早い実装にしたい
                        w.update(Long.toUnsignedString(co).getBytes());
                        w.digest(hash, 0, 20);
                        i = Long.numberOfTrailingZeros(buffer.getLong(0));
                    } while (i < 45);
                    System.out.printf("%d: %d%n", co, i);
                } while (i < 48);
                return co;
            }));
            System.out.printf("%d: %d%n", counter, getSecurityLevel(publicKey, counter));
        }
        System.err.printf("閉幕: %s%n", LocalDateTime.now());
    }

    /**
     * @param decoder
     * @throws NoSuchAlgorithmException
     * @throws DigestException
     */
    private static void ts1(Base64.Decoder decoder) throws NoSuchAlgorithmException, DigestException {
        var privateKey = decoder.decode(System.getenv("KEY"));
        deObfuscateInplace(privateKey);
        System.out.println(new String(privateKey));
    }

    private static int getSecurityLevel(byte[] key, long counter) throws NoSuchAlgorithmException, DigestException {
        var sha1 = MessageDigest.getInstance("SHA-1");
        sha1.update(key);
        sha1.update(Long.toString(counter).getBytes());
        var hash = new byte[20];
        sha1.digest(hash, 0, 20);
        return Long.numberOfTrailingZeros(ByteBuffer.wrap(hash).order(ByteOrder.LITTLE_ENDIAN).getLong(0));
    }

    private static void deObfuscateInplace(byte[] data) throws NoSuchAlgorithmException, DigestException {
        var sha1 = MessageDigest.getInstance("SHA-1");
        int strlen = 0;
        while (data[strlen + 20] != 0) strlen++;
        sha1.update(data, 20, strlen);
        var hash = new byte[20];
        sha1.digest(hash, 0, 20);
        for (int i = 0; i < 20; i++) {
            data[i] ^= hash[i];
        }
        int dataSize = min(100, data.length);
        for (int i = 0; i < dataSize; i++) {
            data[i] ^= TSKEY[i];
        }
    }

    private static void extracted2() throws Exception {
        var a = new InetSocketAddress("localhost", 8444);
        try (var socket = SocketChannel.open(a); var selector = SelectorProvider.provider().openSelector()) {
            var key = socket.register(selector, SelectionKey.OP_READ);
        }
    }

    private static void extracted1() {
        var signNumber = 0;
        var magnitude = new byte[0];
        var myZero = new MyB(signNumber, magnitude);
        var zero = BigInteger.ZERO;
        System.out.println(zero.equals(myZero));
        System.out.println(zero.getClass() == myZero.getClass());
    }

    private static void extracted() {
        var feats = (101. / 64) * nextDouble(SECURE_RANDOM_GENERATOR) + 1;
        System.out.printf("%f feats, %f cm%n", feats, feats * 30.48);
        var milk = Math.pow(10, 4 + nextDouble(SECURE_RANDOM_GENERATOR));
        System.out.printf("%f ml, %f L%n", milk, milk / 1000);
    }

    /**
     * @param random 乱数生成源
     * @see <a href="https://speakerdeck.com/hole/rand01">[0.0, 1.0) の乱数を得るための“本当の”方法 - speakerdeck</a>
     */
    private static void doubleSample(RandomGenerator random) {
        long start = System.nanoTime();
        for (int i = 0; i < 100000000; i++)
            nextDouble(random);
        long finish = System.nanoTime();
        System.out.printf("%f seconds%n", (finish - start) / 1e9);
        System.out.println(nextDouble(random));
    }

    /**
     * FIXME 乱数系ユーティリティクラス的な？ものに移動する
     *
     * @param random 乱数生成源
     * @return double
     * @see <a href="https://speakerdeck.com/hole/rand01">[0.0, 1.0) の乱数を得るための“本当の”方法 </a>
     */
    public static double nextDouble(RandomGenerator random) {
        // random Double
        long bits = random.nextLong();
        int exp = -Long.numberOfTrailingZeros(~(bits >>> 52));
        if (exp == -12) {
            long randomBits;
            do {
                randomBits = random.nextLong();
                exp -= Long.numberOfTrailingZeros(~randomBits);
            } while (randomBits == -1);
        }
        if ((bits & 0xfffffffffffffL) == 0 && random.nextBoolean()) {
            exp++;
        }
        return Double.longBitsToDouble(((long) (exp + 1022) << 52) | bits & 0xfffffffffffffL);
    }

}
