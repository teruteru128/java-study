package com.twitter.teruteru128.bitmessage;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Base64;
import java.util.StringJoiner;
import java.util.UUID;

public class Spammer {

    public void doSpam() throws InterruptedException, IOException {
        var joiner = new StringJoiner(",", "[", "]");
        var encoder = Base64.getEncoder();
        for (long i = 1; i <= 2; i++) {
            joiner.add(String.format(
                    "{\"jsonrpc\": \"2.0\", \"method\": \"sendMessage\", \"params\": [\"BM-2D9ni5ptvgV9kDdFuioUnMbu6hujKrLagb\", \"BM-2cVPhC8Bdrx2ZemLw98oGUsgjDAfwsigyc\", \"dGVzdA==\", \"%s\"], \"id\": %d}",
                    encoder.encodeToString(UUID.randomUUID().toString().getBytes()), i));
        }
        var request = HttpRequest.newBuilder(URI.create("http://192.168.12.8:8442/"))
                .header("Content-Type", "application/json")
                .header("Authorization", "Basic dGVydXRlcnUxMjg6YW5hbGJlYWRz")
                .POST(HttpRequest.BodyPublishers.ofString(joiner.toString()))
                .build();
        System.out.println("create request done.");
        var client = HttpClient.newBuilder().build();
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.statusCode());
        System.out.println(response.body());
    }

}
