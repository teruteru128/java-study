package com.twitter.teruteru128.bitmessage;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDateTime;
import java.util.Base64;
import java.util.StringJoiner;
import java.util.UUID;
import java.util.random.RandomGenerator;

import com.twitter.teruteru128.bitmessage.spec.BMAddress;

public class Spammer {

    private HttpClient client = HttpClient.newBuilder().build();

    public Spammer() {
    }

    public HttpResponse<String> doSpam(long count) {
        try {
            var joiner = new StringJoiner(",", "[", "]");
            var encoder = Base64.getEncoder();
            var random = RandomGenerator.of("SecureRandom");
            var ripe = new byte[20];
            var shortripe = new byte[19];
            var uuid = encoder.encodeToString(UUID.randomUUID().toString().getBytes());
            for (long i = 1; i <= count; i++) {
                random.nextBytes(shortripe);
                System.arraycopy(shortripe, 0, ripe, 1, 19);
                var address = BMAddress.encodeAddress(ripe);
                joiner.add(String.format(
                        "{\"jsonrpc\":\"2.0\",\"method\":\"sendMessage\",\"params\":[\"%s\",\"BM-NBJxKhQmidR2TBtD3H74yZhDHpzZ7TXM\",\"dGVzdA==\",\"%s\",2,\"%d\"],\"id\":%d}",
                        address, uuid, random.nextInt(3600, 3900), i));
            }
            var request = HttpRequest.newBuilder(URI.create("http://192.168.12.8:8442/"))
                    .header("Content-Type", "application/json")
                    .header("Authorization", "Basic dGVydXRlcnUxMjg6YW5hbGJlYWRz")
                    .POST(HttpRequest.BodyPublishers.ofString(joiner.toString()))
                    .build();
            var response = client.send(request, HttpResponse.BodyHandlers.ofString());
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
