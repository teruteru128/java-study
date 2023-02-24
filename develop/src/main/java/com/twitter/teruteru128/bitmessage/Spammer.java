package com.twitter.teruteru128.bitmessage;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.Base64;
import java.util.StringJoiner;
import java.util.UUID;
import java.util.random.RandomGenerator;

import com.twitter.teruteru128.bitmessage.spec.BMAddress;

public class Spammer {

    private static final HttpClient CLIENT = HttpClient.newBuilder().build();
    private static final Base64.Encoder ENCODER = Base64.getEncoder();
    private static final SecureRandom RANDOM = (SecureRandom)RandomGenerator.of("SecureRandom");

    public Spammer() {
    }

    public HttpResponse<String> doSpam(long count) {
        System.err.printf("start!: %s%n", LocalDateTime.now());
        try {
            var joiner = new StringJoiner(",", "[", "]");
            var ripe = new byte[20];
            var shortripe = new byte[19];
            var uuid = ENCODER.encodeToString(UUID.randomUUID().toString().getBytes());
            for (long i = 1; i <= count; i++) {
                RANDOM.nextBytes(shortripe);
                System.arraycopy(shortripe, 0, ripe, 1, 19);
                var address = BMAddress.encodeAddress(ripe);
                joiner.add(String.format(
                        "{\"jsonrpc\":\"2.0\",\"method\":\"sendMessage\",\"params\":[\"%s\",\"BM-NBJxKhQmidR2TBtD3H74yZhDHpzZ7TXM\",\"dGVzdA==\",\"%s\",2,\"%d\"],\"id\":%d}",
                        address, uuid, RANDOM.nextInt(3600, 3900), i));
            }
            var request = HttpRequest.newBuilder(URI.create("http://192.168.12.8:8442/"))
                    .header("Content-Type", "application/json")
                    .header("Authorization", "Basic dGVydXRlcnUxMjg6YW5hbGJlYWRz")
                    .POST(HttpRequest.BodyPublishers.ofString(joiner.toString()))
                    .build();
            var response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
            System.err.printf("done!: %s%n", LocalDateTime.now());
            return response;
        } catch (IOException e) {
            System.err.printf("error!: %s%n", LocalDateTime.now());
            throw new UncheckedIOException(e);
        } catch (InterruptedException e) {
            System.err.printf("error!: %s%n", LocalDateTime.now());
            throw new RuntimeException(e);
        }
    }

}
