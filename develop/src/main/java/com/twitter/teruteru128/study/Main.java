package com.twitter.teruteru128.study;

import com.twitter.teruteru128.bitmessage.Structs;
import com.twitter.teruteru128.encode.Base58;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.util.Base64;

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
        int num = 2000;
        var hashes = new byte[19 * num];
        var random = SecureRandom.getInstanceStrong();
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
        // random Double
        long randomBits;
        int exp = 1022;
        do {
            randomBits = random.nextLong();
            exp -= Long.numberOfTrailingZeros(~randomBits);
        } while (randomBits == 0);
        long fraction = random.nextLong() >> (64 - 52);
        var bits = (((long) exp) << 52) + fraction;
        System.out.println(Double.longBitsToDouble(bits));
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
