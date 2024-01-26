package com.twitter.teruteru128.study;

import com.twitter.teruteru128.bitmessage.Structs;
import com.twitter.teruteru128.encode.Base58;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.util.Base64;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

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
     * @param args command line arguments
     * @throws Exception 何か起こるかもしれない
     */
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            return;
        }
        var random = SecureRandom.getInstanceStrong();
        if (args[0].equals("bomb")) {
            generateAddressBook(random);
        }
        if (args[0].equals("random")) {
            doubleSample(random);
        }
        if (args[0].equalsIgnoreCase("randomAlgorithms")) {
            RandomGeneratorFactory.all().map(RandomGeneratorFactory::name).forEach(System.out::println);
            System.out.println(RandomGenerator.getDefault());
        }
        if (args[0].equalsIgnoreCase("search")) {
            Search.getExecutor(args.length >= 2 ? Integer.parseInt(args[1], 10) : Runtime.getRuntime().availableProcessors());
        }
    }

    /**
     * @param random 乱数生成源
     * @see <a href="https://speakerdeck.com/hole/rand01">[0.0, 1.0) の乱数を得るための“本当の”方法 - speakerdeck</a>
     */
    private static void doubleSample(SecureRandom random) {
        System.out.println(nextDouble(random));
    }

    private static double nextDouble(SecureRandom random) {
        // random Double
        long randomBits = random.nextLong();
        long fraction = (randomBits >>> 12) & 0xFFFFFFFFFFFFFL;
        int exp = 1022 - Long.numberOfTrailingZeros(~(randomBits & 0xfff));
        // 1010 == 1022 - 12
        if (exp == 1010) {
            do {
                randomBits = random.nextLong();
                exp -= Long.numberOfTrailingZeros(~randomBits);
            } while (randomBits == 0);
        }
        if (fraction == 0) {
            exp++;
        }
        var bits = (((long) exp) << 52) + fraction;
        return Double.longBitsToDouble(bits);
    }

    private static void generateAddressBook(SecureRandom random) throws IOException, InterruptedException {
        int num = 10000;
        var hashes = new byte[19 * num];
        random.nextBytes(hashes);
        var builder = new StringBuilder(114514);
        builder.append('[');
        var encoder = Base64.getEncoder();
        for (int i = 0; i < num; i++) {
            if (i != 0) {
                builder.append(',');
            }
            var addressBody = encodeAddress(4, 1, hashes, i * 19, 19);
            builder.append("{\"jsonrpc\":\"2.0\",\"method\":\"addAddressBookEntry\",\"params\":[\"BM-");
            builder.append(addressBody);
            builder.append("\",\"");
            var label = "fake-" + addressBody.substring(0, 6);
            var encodedLabel = encoder.encodeToString(label.getBytes(StandardCharsets.UTF_8));
            builder.append(encodedLabel);
            builder.append("\"],\"id\":");
            builder.append(i + 1);
            builder.append('}');
        }
        builder.append(']');
        try (var c = HttpClient.newHttpClient()) {
            System.out.println(c.send(HttpRequest.newBuilder(URI.create("http://192.168.12.8:8442/"))
                            .header("Content-Type", "application/json-rpc")
                            .header("Authorization", "Basic " + System.getenv("BM_TOKEN"))
                            .POST(HttpRequest.BodyPublishers.ofString(builder.toString())).build(),
                    HttpResponse.BodyHandlers.ofString()).body());
        }
    }

    public static String encodeAddress(byte[] ripe) {
        return encodeAddress(4, 1, ripe, 0, ripe.length);
    }

    public static String encodeAddress(int version, int stream, byte[] ripe) {
        return encodeAddress(version, stream, ripe, 0, ripe.length);
    }

    public static String encodeAddress(int version, int stream, byte[] ripe, int offset, int length) {
        String result;
        var i = 0;
        if (2 <= version && version < 4) {
            if (length >= 19 && ripe[offset] == 0) {
                i++;
                if (length == 20 && ripe[offset + 1] == 0) {
                    i++;
                }
            }
        } else if (version == 4) {
            while (ripe[offset + i] == 0 && i < length) {
                i++;
            }
        }
        var variantVersion = Structs.encodeVarint(version);
        var variantStream = Structs.encodeVarint(stream);
        var buffer = ByteBuffer.allocate(variantVersion.length + variantStream.length + length - i + 4)
                .put(variantVersion).put(variantStream).put(ripe, offset + i, length - i);
        byte[] array = buffer.array();
        try {
            var sha512 = MessageDigest.getInstance("sha-512");
            var hash = new byte[64];
            sha512.update(array, 0, buffer.capacity() - 4);
            sha512.digest(hash, 0, 64);
            sha512.update(hash, 0, 64);
            sha512.digest(hash, 0, 64);
            buffer.put(hash, 0, 4);
            result = Base58.encode(array);
        } catch (NoSuchAlgorithmException | DigestException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
