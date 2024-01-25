package com.twitter.teruteru128.sample;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class JsonRPCRequestSample implements Sample {

    private static final HttpClient CLIENT = HttpClient.newBuilder().build();

    public static void jsonRPCRequestSample() throws IOException, InterruptedException {
        var request = HttpRequest.newBuilder(URI.create("http://192.168.12.8:8442/"))
                .header("Content-Type", "application/json-rpc")
                .header("Authorization", "Basic " + System.getenv("BM_TOKEN"))
                .POST(HttpRequest.BodyPublishers.ofString(
                        "{\"jsonrpc\": \"2.0\", \"method\": \"helloWorld\", \"params\": [\"33\", \"4\"], \"id\": 1}"))
                .build();
        var response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.statusCode());
        System.out.println(response.body());
    }

    private static HttpClient client = HttpClient.newBuilder().build();
    private static final HttpRequest.Builder requestBuilder = HttpRequest
            .newBuilder(URI.create("http://localhost:8442/"))
            .header("Content-Type", "application/json-rpc")
            .header("Authorization", "Basic " + System.getenv("BM_TOKEN"));

    public static void sample(String a) throws IOException, InterruptedException {
        var requestBody = HttpRequest.BodyPublishers.ofString(a);
        var request = client.send(requestBuilder.copy().POST(requestBody).build(),
                HttpResponse.BodyHandlers.ofString());
        System.out.println(request.body());
    }

    public void sample() throws IOException, InterruptedException {
        sample("");
    }
}
