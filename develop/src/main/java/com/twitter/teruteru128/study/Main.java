package com.twitter.teruteru128.study;

import com.twitter.teruteru128.bitmessage.app.Spammer;
import org.bouncycastle.crypto.ec.CustomNamedCurves;

import java.io.*;
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
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

import static java.lang.Math.min;

/**
 * Main
 */
public class Main {

    public static final RandomGenerator SECURE_RANDOM_GENERATOR = RandomGenerator.of("SecureRandom");
    public static final Pattern PATTERN_1 = Pattern.compile("<title>(.*(?:荒らし共栄圏|園田亮平).*)</title>");
    public static final Pattern PATTERN_2 = Pattern.compile("<title>Tor板 v3 - (.*)</title>");
    public static final Pattern PATTERN_3 = Pattern.compile("http://jpchv3cnhonxxtzxiami4jojfnq3xvhccob5x3rchrmftrpbjjlh77qd.onion/tor/(\\d+)/l50");
    public static final Proxy PROXY = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("localhost", 9150));
    public static final int PK_PRIVATE = 1;
    public static final int PK_PUBLIC = 0;
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
            case "random" -> doubleSample(RandomGenerator.getDefault());
            case "random2" -> random2();
            case "random4" -> {
                // SecureRandom has MAX_VALUE stateBits.
                RandomGeneratorFactory<RandomGenerator> best = RandomGeneratorFactory.all().filter(rgf -> !rgf.name().equals("SecureRandom")).max(Comparator.comparingInt(RandomGeneratorFactory<RandomGenerator>::stateBits)).orElse(RandomGeneratorFactory.of("Random"));
                System.out.println(best.name() + " in " + best.group() + " was selected");

                RandomGenerator rng = best.create();
                System.out.println(rng.nextLong());
            }
            case "ts1" -> {
                var decoder = Base64.getDecoder();
                var keys = decoder.decode(System.getenv("KEY"));
                var b = ts1(keys);
                // ここで秘密鍵を公開鍵に変換する
                System.out.println(Base64.getEncoder().encodeToString(b));
                System.out.println(HexFormat.of().formatHex(b));
            }
            case "ts2" -> {
                var decoder = Base64.getDecoder();
                var privateKey = decoder.decode(System.getenv("KEY"));
                var publicKey = Objects.requireNonNull(System.getenv("BM_PUBLIC_KEY")).getBytes();
                ts2(privateKey, publicKey);
            }
            case "ts3" -> {
                var decoder = Base64.getDecoder();
                var privateKey = decoder.decode(System.getenv("KEY"));
                deObfuscateInPlace(privateKey);
                var decodedKey = decoder.decode(privateKey);
                var key = ecc_import(decodedKey);
                var ecc256 = CustomNamedCurves.getByName("secp256r1");
                var g = ecc256.getG();
                var point = g.multiply(new BigInteger(key.k()));
                var curve = ecc256.getCurve();
                var point1 = curve.createPoint(new BigInteger(key.point.x), new BigInteger(key.point.y));
                System.out.println("point.equals(point1) = " + point.equals(point1));
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
            case "search-tor" -> {
                var min = args.length >= 2 ? Integer.parseInt(args[1]) : (4299 + 9473);
                var max = args.length >= 3 ? Integer.parseInt(args[2]) : 23000;
                searchTor(min, max);
            }
            case "check-tor" -> extracted2();
            case "map" -> System.out.println("System.mapLibraryName(\"OpenCL\") = " + System.mapLibraryName("OpenCL"));
            case "telnet-tor" -> {
                var hostname = args[1];
                var port = Integer.parseInt(args[2]);
                extracted(hostname, port);
            }
            case null, default -> {
                System.err.println("unknown command");
                Runtime.getRuntime().exit(1);
            }
        }
    }

    private static void extracted(String hostname, int port) throws IOException, InterruptedException {
        boolean done = false;
        var endpoint = new InetSocketAddress(hostname, port);
        while (!done) {
            try (var channel = new Socket(PROXY)) {
                channel.connect(endpoint, 5000);
                System.out.println("connected! " + LocalDateTime.now());
                done = true;
            } catch (SocketTimeoutException e) {
                System.err.printf("たいむあうと: %dbytes%n", e.bytesTransferred);
            } catch (SocketException ignored) {
                System.err.println("だめぽ");
            }
            Thread.sleep(1000 * 60 * 5);
        }
    }

    private static void extracted2() throws IOException, URISyntaxException {
        var d = Duration.ofMinutes(5);
        try (var service = Executors.newSingleThreadExecutor()) {
            var uri = new URI("http://jpchv3cnhonxxtzxiami4jojfnq3xvhccob5x3rchrmftrpbjjlh77qd.onion/");
            var target = uri.toURL();
            var scheduledFuture = service.submit(() -> {
                while (true) {
                    try {
                        var connection = (HttpURLConnection) target.openConnection(PROXY);
                        connection.connect();
                        if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                            connection.disconnect();
                            return;
                        }
                    } catch (SocketException e) {
                        e.printStackTrace(System.err);
                    } catch (IOException ignored) {
                    }
                    try {
                        Thread.sleep(d);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
            scheduledFuture.get();
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void searchTor(int min, int max) throws IOException {
        // TODO スレッド名をDBかなにかにまとめる
        System.err.printf("min: %d, max: %d%n", min, max);
        try (var bos = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("subjects-old.txt", true), StandardCharsets.UTF_8), 16384)) {
            // 4299
            IntStream.range(min, max).mapToObj(i -> {
                try {
                    return (HttpURLConnection) new URI("http://jpchv3cnhonxxtzxiami4jojfnq3xvhccob5x3rchrmftrpbjjlh77qd.onion/tor/%d/l50".formatted(i)).toURL().openConnection(PROXY);
                } catch (URISyntaxException | IOException e) {
                    throw new RuntimeException(e);
                }
            }).filter(connection -> {
                try {
                    var responseCode = connection.getResponseCode();
                    var b = responseCode == HttpURLConnection.HTTP_OK;
                    if (!b) {
                        System.err.printf("response code: %d%n", responseCode);
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    return b;
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }).map(c -> {
                var map = new HashMap<String, Serializable>();
                try (var in = new BufferedReader(new InputStreamReader(c.getInputStream(), StandardCharsets.UTF_8))) {
                    var string = in.lines().collect(() -> new StringJoiner(System.lineSeparator()), StringJoiner::add, StringJoiner::merge).toString();
                    map.put("body", string);
                    map.put("url", c.getURL());
                    return map;
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                } finally {
                    c.disconnect();
                }
            }).forEach(b -> {
                var matcher2 = PATTERN_2.matcher((String) b.get("body"));
                var matcher3 = PATTERN_3.matcher(b.get("url").toString());
                if (matcher2.find() && matcher3.matches()) {
                    var line = matcher3.group(1) + "<>" + matcher2.group(1);
                    try {
                        bos.write(line);
                        bos.newLine();
                        bos.flush();
                    } catch (IOException e) {
                        throw new UncheckedIOException(e);
                    }
                    System.out.println(line);
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
        }
    }

    private static void ts2(byte[] key, byte[] publicKey) throws NoSuchAlgorithmException, DigestException {
        deObfuscateInPlace(key);
        var decoder = Base64.getDecoder();
        var k = ecc_import(decoder.decode(key));
        var k2 = ecc_export(PK_PUBLIC, k);
        var x = new String(publicKey);
        System.out.println(x);
        System.out.println(getSecurityLevel(publicKey, 16689509343190L));
        var encoder = Base64.getEncoder();
        var k3 = encoder.encode(k2);
        System.out.printf("ts2 check: %b%n", Arrays.equals(k3, publicKey));
        System.out.println(HexFormat.of().formatHex(decoder.decode(publicKey)));
    }

    /**
     * @param privateKey a
     * @return a
     * @throws NoSuchAlgorithmException a
     * @throws DigestException          a
     */
    private static byte[] ts1(byte[] privateKey) throws NoSuchAlgorithmException, DigestException {
        deObfuscateInPlace(privateKey);
        System.out.println(new String(privateKey));
        var decoder = Base64.getDecoder();
        var decodedKey = decoder.decode(privateKey);
        var key = ecc_import(decodedKey);
        return ecc_export(PK_PRIVATE, key);
    }

    private static ECCKey ecc_import(byte[] in) {
        // decode asn.1
        var buffer = ByteBuffer.wrap(in);
        // struct
        var type = buffer.get();
        // length
        var length1 = buffer.get();
        // bit string
        var a = buffer.get();
        // length
        var b = buffer.get();
        var c = buffer.get();
        var d = buffer.get();
        // if flags == 1, private key
        byte flags = (byte) ((d & 0xff) >>> c);
        // integer
        var e = buffer.get();
        // length
        var f = buffer.get();
        //
        int key_size = buffer.get();
        // integer
        var h = buffer.get();
        var publicKeyXLength = buffer.get();
        byte[] publicKeyX = new byte[publicKeyXLength];
        buffer.get(publicKeyX);
        var j = buffer.get();
        var publicKeyYLength = buffer.get();
        byte[] publicKeyY = new byte[publicKeyYLength];
        buffer.get(publicKeyY);
        ECCKey key;
        if (flags == PK_PRIVATE) {
            var m = buffer.get();
            var privateKeyLength = buffer.get();
            // the private key
            byte[] k = new byte[privateKeyLength];
            buffer.get(k);
            var point = new ECCPoint(publicKeyX, publicKeyY, null);
            key = new ECCKey(1, point, k);
        } else {
            var point = new ECCPoint(publicKeyX, publicKeyY, null);
            key = new ECCKey(1, point, null);
        }
        return key;
    }

    private static byte[] ecc_export(int t, ECCKey key) {
        // encode asn.1
        int publicKeyLength;
        if (t == 1) {
            publicKeyLength = 2 + 4 + 3 + 2 + key.point.x.length + 2 + key.point.y.length + 2 + key.k.length;
        } else {
            publicKeyLength = 2 + 4 + 3 + 2 + key.point.x.length + 2 + key.point.y.length;
        }
        var publicKey = ByteBuffer.allocate(publicKeyLength).put((byte) 0x30).put((byte) (publicKeyLength - 2)).put((byte) 0x03).put((byte) 0x02).put((byte) 0x07).put((byte) 0x00).put((byte) 0x02).put((byte) 1).put((byte) 0x20).put((byte) 0x02).put((byte) key.point.x.length).put(key.point.x).put((byte) 0x02).put((byte) key.point.y.length).put(key.point.y);
        if (t == PK_PRIVATE) {
            publicKey.put((byte) 0x02).put((byte) key.k.length).put(key.k);
        }
        return publicKey.array();
    }

    private static int getSecurityLevel(byte[] key, long counter) throws NoSuchAlgorithmException {
        var sha1 = MessageDigest.getInstance("SHA-1");
        sha1.update(key);
        sha1.update(Long.toString(counter).getBytes());
        return Long.numberOfTrailingZeros(ByteBuffer.wrap(sha1.digest()).order(ByteOrder.LITTLE_ENDIAN).getLong(0));
    }

    private static void deObfuscateInPlace(byte[] data) throws NoSuchAlgorithmException, DigestException {
        var sha1 = MessageDigest.getInstance("SHA-1");
        int strlen = 0;
        // fixme
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

    private static void random2() {
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

    private record ECCPoint(byte[] x, byte[] y, byte[] z) {
    }

    private record ECCKey(int type, ECCPoint point, byte[] k) {
    }

}
