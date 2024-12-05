package com.github.teruteru128.sample.proxy;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.github.teruteru128.net.OnionProxySelector;
import com.github.teruteru128.sample.Sample;
import java.util.concurrent.Callable;
import picocli.CommandLine.ExitCode;

/**
 * <p>HTTP ClientでSOCKS proxyを使いたかったサンプル。</p>
 * <p>HTTP proxyしか使えないらしい。クソが。</p>
 */
public class HttpRequestWithProxySample implements Sample, Callable<Integer> {

    @Override
    public Integer call() throws URISyntaxException, IOException, InterruptedException {
        sample();
        return ExitCode.OK;
    }

    @Override
    public void sample() throws URISyntaxException, IOException, InterruptedException {
        sample(URI.create(""));
    }
    public String sample(URI name) throws URISyntaxException, IOException, InterruptedException {
        var selector = OnionProxySelector.getInstance();
        HttpResponse<String> response;
        try (var client = HttpClient.newBuilder().proxy(selector).build()) {
            var request = HttpRequest.newBuilder(name).build();
            response = client.send(request, BodyHandlers.ofString());
        }
        System.out.println(response.statusCode());
        return response.body();
    }
}
