package com.twitter.teruteru128.bitmessage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.twitter.teruteru128.bitmessage.app.Spammer;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Base64;
import java.util.concurrent.ExecutionException;
import java.util.stream.StreamSupport;

public class BM {

    public static void list() throws InterruptedException, ExecutionException, IOException {
        // bm からaddress bookを取得する
        // 将来的にこれを使ってSPAMを投げられるようになったらいいね
        try (var client = HttpClient.newHttpClient()) {
            var r2 = client.sendAsync(Spammer.requestBuilder.POST(HttpRequest.BodyPublishers.ofString("{\"jsonrpc\":\"2.0\",\"method\":\"listAddressBookEntries\",\"id\":1}")).build(), HttpResponse.BodyHandlers.ofByteArray());
            Thread.sleep(1000);
            System.out.println("君と夏の終わり");
            Thread.sleep(1000);
            System.out.println("将来終わり");
            Thread.sleep(1000);
            System.out.println("人生終わり");
            Thread.sleep(1000);
            System.out.println("うんちぶり");
            var decoder = Base64.getDecoder();
            // レスポンスボディが2GBを超える場合、InputStreamを使わないと例外が発生する
            var objectMapper = new ObjectMapper();
            var httpResponse = r2.get();
            var statusCode = httpResponse.statusCode();
            if (statusCode == HttpURLConnection.HTTP_OK) {
                var root = objectMapper.readTree(httpResponse.body());
                var result = root.get("result");
                var addresses = result.get("addresses");
                if (addresses instanceof ArrayNode arrayNode) {
                    StreamSupport.stream(arrayNode.spliterator(), false)
                            .map(n -> new AddressEntry(new String(decoder.decode(n.get("label").asText())), n.get("address").asText()))
                            .filter(n -> n.label().startsWith("fake-"))
                            .filter(n -> !n.address().startsWith("BM-2c"))
                            .forEach(System.out::println);
                } else {
                    System.err.printf("addresses is not list!%s%n", addresses);
                }
            } else {
                System.err.printf("NG(%d)%n", statusCode);
            }
        }
    }

}
