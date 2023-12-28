package com.twitter.teruteru128.study;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublisher;
import java.net.http.HttpRequest.Builder;
import java.time.Instant;
import java.net.http.HttpResponse;
import java.util.Base64;

public class Task2 implements Runnable {
    /**
     *
     */
    private static final Builder BUILDER = HttpRequest.newBuilder(URI.create("http://192.168.12.8:8442/"))
            .header("Content-Type", "application/json-rpc")
            .header("Authorization", "Basic dGVydXRlcnUxMjg6YW5hbGJlYWRz");
    private static final String BODY = "{\"jsonrpc\":\"2.0\",\"method\":\"sendBroadcast\",\"params\":[\"BM-5oRJjqvLSW9WWSACs1nNDYVFTYGxdrm\",\"\",\"%s\",2,3600],\"id\":1}";
    private static final HttpClient CLIENT = HttpClient.newBuilder().build();
    private static final Base64.Encoder ENCODER = Base64.getEncoder();

    @Override
    public void run() {
        try {
            String message = ENCODER.encodeToString(Long.toString(Instant.now().getEpochSecond()).getBytes());
            BodyPublisher publisher = HttpRequest.BodyPublishers.ofString(String.format(BODY, message));
            HttpRequest request = BUILDER.POST(publisher).build();
            var r = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(r.body());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
