package com.twitter.teruteru128.sample;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;

import com.twitter.teruteru128.net.OnionProxySelector;

public class HttpRequestWithProxySample implements Sample {
    public void sample() throws URISyntaxException, IOException, InterruptedException {
        sample(URI.create(""));
    }
    public String sample(URI name) throws URISyntaxException, IOException, InterruptedException {
        var selector = OnionProxySelector.getInstance();
        var client = HttpClient.newBuilder().proxy(selector).build();
        var request = HttpRequest.newBuilder(name).build();
        var response = client.send(request, BodyHandlers.ofString());
        System.out.println(response.statusCode());
        return response.body();
    }
}
