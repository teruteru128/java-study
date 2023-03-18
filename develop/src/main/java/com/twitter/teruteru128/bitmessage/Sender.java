package com.twitter.teruteru128.bitmessage;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.ThreadLocalRandom;

import com.twitter.teruteru128.bitmessage.app.Spammer;

public class Sender {

    public static HttpResponse<String> send(String toaddress, String fromaddress, String subject, String message) {
        return Sender.send(toaddress, fromaddress, subject, message,
                ThreadLocalRandom.current().nextInt(345300, 345900));
    }

    public static HttpResponse<String> send(String toaddress, String fromaddress, String subject, byte[] message) {
        return Sender.send(toaddress, fromaddress, subject, message,
                ThreadLocalRandom.current().nextInt(345300, 345900));
    }

    public static Base64.Encoder base64 = Base64.getEncoder();

    public static HttpResponse<String> send(String toaddress, String fromaddress, String subject, String message, int ttl) {
        return Spammer.post(HttpRequest.BodyPublishers
                .ofString(String.format(
                        "{\"jsonrpc\":\"2.0\",\"method\":\"sendMessage\",\"params\":[\"%s\",\"%s\",\"%s\",\"%s\",2,%d], \"id\": 1}",
                        toaddress, fromaddress, base64.encodeToString(subject.getBytes(StandardCharsets.UTF_8)),
                        base64.encodeToString(message.getBytes(StandardCharsets.UTF_8)), ttl)));
    }

    public static HttpResponse<String> send(String toaddress, String fromaddress, String subject, byte[] message, int ttl) {
        return Spammer.post(HttpRequest.BodyPublishers
                .ofString(String.format(
                        "{\"jsonrpc\":\"2.0\",\"method\":\"sendMessage\",\"params\":[\"%s\",\"%s\",\"%s\",\"%s\",2,%d], \"id\": 1}",
                        toaddress, fromaddress, base64.encodeToString(subject.getBytes(StandardCharsets.UTF_8)),
                        base64.encodeToString(message), ttl)));
    }

}
