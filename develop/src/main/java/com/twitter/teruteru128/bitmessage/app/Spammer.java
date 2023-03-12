package com.twitter.teruteru128.bitmessage.app;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublisher;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.Base64;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;

import com.twitter.teruteru128.bitmessage.spec.BMAddress;

public class Spammer {

    private static final HttpClient CLIENT = HttpClient.newBuilder().build();
    private static final Base64.Encoder ENCODER = Base64.getEncoder();
    private static final SecureRandom RANDOM = (SecureRandom) RandomGenerator.of("SecureRandom");

    public Spammer() {
    }

    private static int stringSize(long x) {
        int d = 1;
        if (x >= 0) {
            d = 0;
            x = -x;
        }
        long p = -10;
        for (int i = 1; i < 19; i++) {
            if (x > p)
                return i + d;
            p = 10 * p;
        }
        return 19 + d;
    }

    public String createBody(long count) {
        int capacity = 2;
        // method body
        capacity += count * 206;
        if (count >= 1) {
            // num of delimiter
            capacity += count - 1;
        }
        for (long i = 1; i <= count; i++) {
            // ids
            capacity += stringSize(i);
        }
        var view = CharBuffer.allocate(capacity).put('[');
        var ripe = new byte[20];
        var shortripe = new byte[19];
        var uuid = ENCODER.encodeToString(UUID.randomUUID().toString().getBytes());
        for (long i = 1; i <= count; i++) {
            if (i != 1) {
                view.put(',');
            }
            view.put("{\"jsonrpc\":\"2.0\",\"method\":\"sendMessage\",\"params\":[\"");
            RANDOM.nextBytes(shortripe);
            System.arraycopy(shortripe, 0, ripe, 1, 19);
            BMAddress.encodeAddress(view, ripe);
            view.put("\",\"BM-NBJxKhQmidR2TBtD3H74yZhDHpzZ7TXM\",\"dGVzdA==\",\"");
            view.put(uuid);
            view.put("\",2,");
            view.put(Integer.toString(RANDOM.nextInt(3600, 3900)));
            view.put("],\"id\":");
            view.put(Long.toString(i));
            view.put('}');
        }
        view.put(']');
        view.flip();
        return view.toString();
    }

    public HttpResponse<String> post(BodyPublisher publisher) {
        // System.err.printf("start!: %s%n", LocalDateTime.now());
        try {
            var request = HttpRequest.newBuilder(URI.create("http://192.168.12.8:8442/"))
                    .header("Content-Type", "application/json")
                    .header("Authorization", "Basic dGVydXRlcnUxMjg6YW5hbGJlYWRz")
                    .POST(publisher)
                    .build();
            var response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
            // System.err.printf("done!: %s%n", LocalDateTime.now());
            return response;
        } catch (IOException e) {
            System.err.printf("error!: %s%n", LocalDateTime.now());
            throw new UncheckedIOException(e);
        } catch (InterruptedException e) {
            System.err.printf("error!: %s%n", LocalDateTime.now());
            throw new RuntimeException(e);
        }
    }

    public HttpResponse<String> doSpam(long count) {
        return post(HttpRequest.BodyPublishers.ofString(createBody(count)));
    }

    public HttpResponse<String> send(String toaddress, String fromaddress, String subject, String message) {
        return send(toaddress, fromaddress, subject, message,
                ThreadLocalRandom.current().nextInt(345300, 345900));
    }

    private static Base64.Encoder base64 = Base64.getEncoder();

    public HttpResponse<String> send(String toaddress, String fromaddress, String subject, String message, int ttl) {
        return post(HttpRequest.BodyPublishers
                .ofString(String.format(
                        "{\"jsonrpc\":\"2.0\",\"method\":\"sendMessage\",\"params\":[\"%s\",\"%s\",\"%s\",\"%s\",2,%d], \"id\": 1}",
                        toaddress, fromaddress, base64.encodeToString(subject.getBytes(StandardCharsets.UTF_8)),
                        base64.encodeToString(message.getBytes(StandardCharsets.UTF_8)), ttl)));
    }

}
