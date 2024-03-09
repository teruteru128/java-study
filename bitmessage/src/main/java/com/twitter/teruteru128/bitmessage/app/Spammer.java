package com.twitter.teruteru128.bitmessage.app;

import com.twitter.teruteru128.bitmessage.spec.AddressFactory;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.time.Duration;
import java.util.*;
import java.util.random.RandomGenerator;

import static java.net.http.HttpRequest.BodyPublishers.ofString;

public class Spammer {

    public static final HttpRequest.Builder requestBuilder;
    private static final SecureRandom RANDOM = (SecureRandom) RandomGenerator.of("SecureRandom");

    static {
        var bmApiServerUrl = System.getenv("BM_API_SERVER_URL");
        var bmApiServerUrl2 = URI.create((bmApiServerUrl == null || bmApiServerUrl.isEmpty()) ? "http://localhost:8442/" : bmApiServerUrl);
        requestBuilder = HttpRequest.newBuilder(bmApiServerUrl2);
        requestBuilder.header("Content-Type", "application/json-rpc");
        requestBuilder.header("Authorization", "Basic " + System.getenv("BM_TOKEN"));
    }


    public Spammer() {
    }

    public static byte[] generateMessage(int length) {
        // FIXME Should I use RandomGenerator.getDefault() ?
        return Spammer.generateMessage(length, RANDOM);
    }

    public static byte[] generateMessage(int length, RandomGenerator random) {
        // capacity = (length * 6) / 5;
        int capacity = length + (length / 5);
        byte[] msg = new byte[capacity];
        for (int i = 0; i < capacity; i++) {
            if ((i % 60) == 59) {
                msg[i] = '\n';
            } else if ((i % 6) == 5) {
                msg[i] = ' ';
            } else {
                msg[i] = (byte) random.nextInt('0', 0x3a);
            }
        }
        // trim
        while ((0 < capacity) && (msg[capacity - 1] & 0xff) <= ' ') {
            capacity--;
        }
        return Arrays.copyOf(msg, capacity);
    }

    /**
     * @param random Random number generator for forging hashes(ハッシュを捏造するための乱数生成源)
     * @param num    捏造する件数
     * @throws IOException          入出力エラーが発生した場合
     * @throws InterruptedException 待機中に割込みが発生した場合
     */
    public static void getPubKeySpam(SecureRandom random, int num) throws IOException, InterruptedException {
        var hashes = new byte[19 * num];
        random.nextBytes(hashes);
        var builder = new StringBuilder(114514);
        builder.append('[');
        var encoder = Base64.getEncoder();
        for (int i = 0; i < num; i++) {
            if (i != 0) {
                builder.append(',');
            }
            var addressBody = AddressFactory.encodeAddress(4, 1, hashes, i * 19, 19);
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
        try (var client = HttpClient.newHttpClient()) {
            var response = client.send(requestBuilder.POST(ofString(builder.toString())).build(), HttpResponse.BodyHandlers.ofString());
            var statusCode = response.statusCode();
            if (statusCode != 200) {
                System.err.printf("status code: %d%n", statusCode);
                return;
            }
            var body = response.body();
            System.out.println(body);
        }
    }

    public static void unitSpam(List<String> addresses, int unitSize, Duration d, int offset) throws IOException, InterruptedException {
        int length = addresses.size();
        var builder = new StringBuilder("{\"jsonrpc\":\"2.0\",\"method\":\"sendMessage\",\"params\":[\"");
        var prefixLength = builder.length();
        int k = offset;
        try (var client = HttpClient.newHttpClient()) {
            for (int i = offset; i < length; i += unitSize) {
                var joiner = new StringJoiner(",", "[", "]");
                var list = addresses.subList(offset, Math.min(length, offset + unitSize));
                for (var address : list) {
                    builder.append(address);
                    builder.append("\",\"BM-2cVPhC8Bdrx2ZemLw98oGUsgjDAfwsigyc\",\"\",\"\",2,3600],\"id\":");
                    builder.append(k++);
                    builder.append("}");
                    joiner.add(builder.toString());
                    builder.setLength(prefixLength);
                }
                var r = client.send(requestBuilder.POST(ofString(joiner.toString())).build(), HttpResponse.BodyHandlers.ofString());
                System.out.println(r.body());
                Thread.sleep(d);
            }
        }
    }
}
