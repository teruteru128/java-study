package com.twitter.teruteru128.bitmessage;

import com.twitter.teruteru128.bitmessage.p2p.Message;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublisher;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.Base64;
import java.util.List;
import java.util.StringJoiner;
import java.util.concurrent.ThreadLocalRandom;

public class Sender {

    public static final HttpClient CLIENT = HttpClient.newHttpClient();
    private static final Base64.Encoder ENCODER = Base64.getEncoder();

    public static HttpResponse<String> send(String toAddress, String fromAddress, String subject, String message)
            throws InterruptedException, IOException {
        return Sender.send(toAddress, fromAddress, subject, message.getBytes(StandardCharsets.UTF_8));
    }

    public static HttpResponse<String> send(String toAddress, String fromAddress, String subject, byte[] message)
            throws InterruptedException, IOException {
        return Sender.send(toAddress, fromAddress, subject, message, ThreadLocalRandom.current().nextInt(345300, 345900));
    }

    public static HttpResponse<String> send(String toAddress, String fromAddress, String subject, String message,
                                            int ttl) throws InterruptedException, IOException {
        return Sender.send(List.of(new Message(toAddress, fromAddress, subject.getBytes(StandardCharsets.UTF_8), message.getBytes(StandardCharsets.UTF_8), ttl)));
    }

    public static HttpResponse<String> send(String toAddress, String fromAddress, String subject, byte[] message,
                                            int ttl) throws InterruptedException, IOException {
        return Sender.send(List.of(new Message(toAddress, fromAddress, subject.getBytes(StandardCharsets.UTF_8), message, ttl)));
    }

    public static HttpResponse<String> post(BodyPublisher publisher) throws InterruptedException, IOException {
        // System.err.printf("start!: %s%n", LocalDateTime.now());
        var request = HttpRequest.newBuilder(URI.create("http://192.168.12.8:8442/"))
                .header("Content-Type", "application/json-rpc")
                .header("Authorization", "Basic " + System.getenv("BM_TOKEN"))
                .POST(publisher)
                .build();
        try {
            return CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
        } finally {
            System.err.printf("done!: %s%n", LocalDateTime.now());
        }
    }

    /**
     * @param messages message body
     */
    public static HttpResponse<String> send(List<Message> messages) throws InterruptedException, IOException {
        var sj = new StringJoiner(",", "[", "]");
        int index = 1;
        for (Message message : messages) {
            sj.add(String.format(
                    "{\"jsonrpc\":\"2.0\",\"method\":\"sendMessage\",\"params\":[\"%s\",\"%s\",\"%s\",\"%s\",2,%d],\"id\":\"%d\"}",
                    message.toAddress(), message.fromAddress(), ENCODER.encodeToString(message.utf8EncodedSubject()),
                    ENCODER.encodeToString(message.utf8EncodedMessage()), message.ttl(), index++));
        }
        return post(HttpRequest.BodyPublishers.ofString(sj.toString()));
    }
}
