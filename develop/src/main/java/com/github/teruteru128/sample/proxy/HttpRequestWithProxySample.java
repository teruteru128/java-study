package com.github.teruteru128.sample.proxy;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;

import com.github.teruteru128.net.OnionProxySelector;
import com.github.teruteru128.sample.Sample;

/**
 * <p>HTTP ClientでSOCKS proxyを使いたかったサンプル。</p>
 * <p>HTTP proxyしか使えないらしい。クソが。</p>
 */
public class HttpRequestWithProxySample implements Sample {
    @Override
    public void sample() throws URISyntaxException, IOException, InterruptedException {
        sample(URI.create(""));
    }
    public String sample(URI name) throws URISyntaxException, IOException, InterruptedException {
        var selector = OnionProxySelector.getInstance();
        java.net.http.HttpResponse<String> response;
        try (var client = HttpClient.newBuilder().proxy(selector).build()) {
            var request = HttpRequest.newBuilder(name).build();
            response = client.send(request, BodyHandlers.ofString());
        }
        System.out.println(response.statusCode());
        return response.body();
    }
}
