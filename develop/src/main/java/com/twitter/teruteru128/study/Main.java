package com.twitter.teruteru128.study;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.util.Arrays;
import java.util.Base64;
import java.util.StringJoiner;

import com.twitter.teruteru128.bitmessage.Structs;
import com.twitter.teruteru128.encode.Base58;

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
     * @param args command line arguments
     * @throws Exception 何か起こるかもしれない
     */
    public static void main(String[] args) throws Exception {
        int num = 60000;
        var hashes = new byte[19 * num];
        SecureRandom.getInstanceStrong().nextBytes(hashes);
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

    private static String encodeAddress(byte[] ripe) {
        return encodeAddress(4, 1, ripe, 0, ripe.length);
    }

    private static String encodeAddress(int version, int stream, byte[] ripe) {
        return encodeAddress(4, 1, ripe, 0, ripe.length);
    }

    private static String encodeAddress(int version, int stream, byte[] ripe, int offset, int length) {
        int i = 0;
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
        byte[] variantVersion = Structs.encodeVarint(version);
        byte[] variantStream = Structs.encodeVarint(stream);
        var buffer = ByteBuffer.allocate(variantVersion.length + variantStream.length + length - i + 4)
                .put(variantVersion).put(variantStream).put(ripe, offset + i, length - i);
        byte[] array = buffer.array();
        try {
            MessageDigest sha512 = MessageDigest.getInstance("sha-512");
            byte[] hash = new byte[64];
            sha512.update(array, 0, buffer.capacity() - 4);
            sha512.digest(hash, 0, 64);
            sha512.update(hash, 0, 64);
            sha512.digest(hash, 0, 64);
            buffer.put(hash, 0, 4);
            return Base58.encode(array);
        } catch (NoSuchAlgorithmException | DigestException e) {
            throw new RuntimeException(e);
        }
    }
}
