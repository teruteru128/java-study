package com.twitter.teruteru128.study;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.Builder;
import java.net.http.HttpResponse;
import java.time.Instant;
import java.util.Base64;
import java.util.regex.Pattern;

public class Task2 implements Runnable {
    /**
     *
     */
    private static final Builder BUILDER = HttpRequest.newBuilder(URI.create("http://192.168.12.8:8442/"))
            .header("Content-Type", "application/json-rpc")
            .header("Authorization", "Basic dGVydXRlcnUxMjg6YW5hbGJlYWRz");
    private static final String REQUEST_BODY = "{\"jsonrpc\":\"2.0\",\"method\":\"sendBroadcast\",\"params\":[\"BM-5oEizuNC8bBDBwgG9wSTNEpgJ8iTYLW\",\"\",\"%s\",2,3600],\"id\":1}";
    private static final HttpClient CLIENT = HttpClient.newBuilder().build();
    private static final Base64.Encoder ENCODER = Base64.getEncoder();
    private static final Pattern PATTERN = Pattern
            .compile("\\{\"jsonrpc\": \"2.0\", \"result\": \"([0-9a-f]{76})\", \"id\": \\d+\\}");

    @Override
    public void run() {
        try {
            var responseBody = CLIENT.send(
                    BUILDER.POST(HttpRequest.BodyPublishers.ofString(String.format(REQUEST_BODY,
                            ENCODER.encodeToString(Long.toString(Instant.now().getEpochSecond()).getBytes())))).build(),
                    HttpResponse.BodyHandlers.ofString()).body();
            var matcher = PATTERN.matcher(responseBody);
            System.out.println(matcher.matches() ? matcher.group(1) : responseBody);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
