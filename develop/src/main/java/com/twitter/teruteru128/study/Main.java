package com.twitter.teruteru128.study;

import com.twitter.teruteru128.bitmessage.app.Spammer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Base64;
import java.util.Collections;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

import static java.lang.Math.min;

/**
 * Main
 */
public class Main {

    public static final RandomGenerator SECURE_RANDOM_GENERATOR = RandomGenerator.of("SecureRandom");
    private static final byte[] TEAM_SPEAK_KEY = "b9dfaa7bee6ac57ac7b65f1094a1c155e747327bc2fe5d51c512023fe54a280201004e90ad1daaae1075d53b7d571c30e063b5a62a4a017bb394833aa0983e6e".getBytes();

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
            // forName()した後になにかするならmap()を使うんだろうな
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
            Runtime.getRuntime().exit(1);
        }
        switch (args[0]) {
            case "clone" -> extracted1();
            case "getPubKeySpam" ->
                    Spammer.getPubKeySpam((SecureRandom) SECURE_RANDOM_GENERATOR, args.length >= 2 ? Integer.parseInt(args[1]) : 10000);
            case "random" -> doubleSample(ThreadLocalRandom.current());
            case "random2" -> extracted();
            case "ts1" -> {
                var decoder = Base64.getDecoder();
                ts1(decoder);
                // ここで秘密鍵を公開鍵に変換する
            }
            case "ts2" -> {
                var publicKey = Objects.requireNonNull(System.getenv("BM_PUBLIC_KEY")).getBytes();
                ts2(publicKey, args.length >= 2 ? Integer.parseInt(args[1]) : Runtime.getRuntime().availableProcessors());
            }
            case "unitSpam" -> {
                if (args.length >= 2) {
                    Spammer.unitSpam(Files.readAllLines(Path.of(args[1])), 2500, Duration.ofHours(12), args.length >= 3 ? Integer.parseInt(args[2]) : 0);
                }
            }
            case "unitSpam2" -> {
                if (args.length >= 2)
                    Spammer.unitSpam2(Files.readAllLines(Path.of(args[1])), 2500, args.length >= 3 ? Integer.parseInt(args[2]) : 0);
            }
            case "hash-base64" -> {
                if (args.length >= 2) {
                    var sha256 = MessageDigest.getInstance("SHA-256");
                    var hash = sha256.digest(Files.readAllBytes(Path.of(args[1])));
                    System.out.println(Base64.getEncoder().encodeToString(hash));
                }
            }
            case "search-tor" -> extracted(new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("localhost", 9150)));
            case "map" -> System.out.println("System.mapLibraryName(\"OpenCL\") = " + System.mapLibraryName("OpenCL"));
            default -> {
                System.err.println("unknown command");
                Runtime.getRuntime().exit(1);
            }
        }
    }

    private static void extracted(Proxy proxy) {
        var pattern1 = Pattern.compile("<title>(.*荒らし共栄圏.*)</title>");
        var pattern2 = Pattern.compile("<title>(.*)</title>");
        long counter = IntStream.range(4299, 20000).mapToObj(i -> {
            try {
                return new URI("http://jpchv3cnhonxxtzxiami4jojfnq3xvhccob5x3rchrmftrpbjjlh77qd.onion/tor/%d/l50".formatted(i));
            } catch (URISyntaxException e) {
                throw new RuntimeException(e);
            }
        }).map(uri -> {
            try {
                return uri.toURL();
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }).map(u -> {
            try {
                return (HttpURLConnection) u.openConnection(proxy);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }).filter(connection -> {
            try {
                var responseCode = connection.getResponseCode();
                var b = responseCode == HttpURLConnection.HTTP_OK;
                if (!b) {
                    System.err.printf("response code: %d%n", responseCode);
                }
                return b;
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }).map(c -> {
            try (var in = new BufferedReader(new InputStreamReader(c.getInputStream(), StandardCharsets.UTF_8))) {
                return in.lines().collect(() -> new StringJoiner(System.lineSeparator()), StringJoiner::add, StringJoiner::merge).toString();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }).filter(b -> {
            var b1 = pattern1.matcher(b).find();
            if (!b1) {
                var matcher = pattern2.matcher(b);
                if (matcher.find()) {
                    System.err.println(matcher.group(1));
                }
            }
            try {
                Thread.sleep(3000);
                return b1;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                System.err.println("ho!");
            }
        }).count();
        System.out.println("counter = " + counter);
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
                int level = 0;
                for (co = (current.nextInt() & 0xffffffffL) << 32; level < 48; co++) {
                    w.update(publicKey);
                    // teamspeakのカウンターは符号なし
                    // TODO toUnsignedString() -> getBytes で byte[]を取得とか絶対遅いからもっと早い実装にしたい
                    w.update(Long.toUnsignedString(co).getBytes());
                    w.digest(hash, 0, 20);
                    level = Long.numberOfTrailingZeros(buffer.getLong(0));
                    if (level >= 34) System.out.printf("%s: %d%n", Long.toUnsignedString(co), level);
                }
                return co;
            }));
            System.out.printf("%d: %d%n", counter, getSecurityLevel(publicKey, counter));
        }
        System.err.printf("閉幕: %s%n", LocalDateTime.now());
    }

    /**
     * @param decoder a
     * @throws NoSuchAlgorithmException a
     * @throws DigestException a
     */
    private static void ts1(Base64.Decoder decoder) throws NoSuchAlgorithmException, DigestException {
        var privateKey = decoder.decode(System.getenv("KEY"));
        deObfuscateInPlace(privateKey);
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

    private static void deObfuscateInPlace(byte[] data) throws NoSuchAlgorithmException, DigestException {
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
            data[i] ^= TEAM_SPEAK_KEY[i];
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
