package com.twitter.teruteru128.study;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.twitter.teruteru128.bitmessage.spec.AddressFactory;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.util.Base64;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;
import java.util.stream.StreamSupport;

import static java.net.http.HttpRequest.BodyPublishers.ofString;
import static java.net.http.HttpResponse.BodyHandlers.ofByteArray;

/**
 * Main
 */
public class Main {

    public static final RandomGenerator SECURE_RANDOM_GENERATOR = RandomGenerator.of("SecureRandom");
    private static final HttpRequest.Builder requestBuilder = HttpRequest.newBuilder(URI.create(System.getenv("BM_API_SERVER_URL"))).header("Content-Type", "application/json-rpc").header("Authorization", "Basic " + System.getenv("BM_TOKEN"));

    static {
        try {
            if (Security.getProvider("BC") == null) {
                var clazz = Class.forName("org.bouncycastle.jce.provider.BouncyCastleProvider");
                var subclass = clazz.asSubclass(Provider.class);
                var constructor = subclass.getConstructor();
                var provider = constructor.newInstance();
                Security.addProvider(provider);
            }
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException |
                 IllegalArgumentException | InvocationTargetException | SecurityException e) {
            throw new InternalError(e);
        }
    }

    /**
     * @param args command line arguments
     * @throws Exception 何か起こるかもしれない
     */
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            return;
        }
        var command = args[0];
        if (command.equalsIgnoreCase("getPubKeySpam")) {
            if (args.length >= 2) {
                getPubKeySpam((SecureRandom) SECURE_RANDOM_GENERATOR, Integer.parseInt(args[1]));
            } else {
                getPubKeySpam((SecureRandom) SECURE_RANDOM_GENERATOR, 10000);
            }
        }
        if (command.equalsIgnoreCase("list")) {
            // bm からaddress bookを取得する
            // 将来的にこれを使ってSPAMを投げられるようになったらいいね
            try (var client = HttpClient.newHttpClient()) {
                var r2 = client.sendAsync(requestBuilder.POST(ofString("{\"jsonrpc\":\"2.0\",\"method\":\"listAddressBookEntries\",\"id\":1}")).build(), ofByteArray());
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
        if (command.equalsIgnoreCase("random")) {
            doubleSample(ThreadLocalRandom.current());
        }
        if (command.equalsIgnoreCase("random2")) {
            var feats = (101. / 64) * nextDouble(SECURE_RANDOM_GENERATOR) + 1;
            System.out.printf("%f feats, %f cm%n", feats, feats * 30.48);
            var milk = Math.pow(10, 4 + nextDouble(SECURE_RANDOM_GENERATOR));
            System.out.printf("%f ml, %f L%n", milk, milk / 1000);
        }
        if (command.equalsIgnoreCase("search")) {
            if (args.length >= 2) {
                Search.searchWithExecutor(Integer.parseInt(args[1], 10));
            } else {
                Search.searchWithExecutor(Runtime.getRuntime().availableProcessors());
            }
        }
        if (command.equalsIgnoreCase("search2")) {
            if (args.length >= 2) {
                int initialSeed = Integer.parseInt(args[1]);
                Search.searchWithExecutor2(initialSeed);
            } else {
                Search.searchWithExecutor2();
            }
        }
        if (command.equalsIgnoreCase("clone")) {
            var signNumber = 0;
            var magnitude = new byte[0];
            var myZero = new MyB(signNumber, magnitude);
            System.out.println(BigInteger.ZERO.equals(myZero));
            System.out.println(BigInteger.ZERO.getClass() == myZero.getClass());
        }
    }

    /**
     * @param random 乱数生成源
     * @see <a href="https://speakerdeck.com/hole/rand01">[0.0, 1.0) の乱数を得るための“本当の”方法 - speakerdeck</a>
     */
    private static void doubleSample(RandomGenerator random) {
        long start = System.nanoTime();
        for (int i = 0; i < 100000000; i++)
            nextDouble(random);
        long finish = System.nanoTime();
        System.out.printf("%f seconds%n", (finish - start) / 1e9);
        System.out.println(nextDouble(random));
    }

    /**
     * FIXME 乱数系ユーティリティクラス的な？ものに移動する
     *
     * @param random 乱数生成源
     * @return double
     * @see <a href="https://speakerdeck.com/hole/rand01">[0.0, 1.0) の乱数を得るための“本当の”方法 </a>
     */
    public static double nextDouble(RandomGenerator random) {
        // random Double
        long bits = random.nextLong();
        long fraction = bits & 0xfffffffffffffL;
        int exp = -Long.numberOfTrailingZeros(~(bits >>> 52));
        if (exp == -12) {
            long randomBits;
            do {
                randomBits = random.nextLong();
                exp -= Long.numberOfTrailingZeros(~randomBits);
            } while (randomBits == -1);
        }
        if (fraction == 0 && random.nextBoolean()) {
            exp++;
        }
        return Double.longBitsToDouble(((long) (exp + 1022) << 52) | fraction);
    }

    /**
     * @param random Random number generator for forging hashes(ハッシュを捏造するための乱数生成源)
     * @param num    捏造する件数
     * @throws IOException          入出力エラーが発生した場合
     * @throws InterruptedException 待機中に割込みが発生した場合
     */
    private static void getPubKeySpam(SecureRandom random, int num) throws IOException, InterruptedException {
        var hashes = new byte[19 * num];
        random.nextBytes(hashes);
        var builder = new StringBuilder(114514);
        builder.append('[');
        var encoder = Base64.getEncoder();
        for (int i = 0; i < num; i++) {
            if (i != 0) {
                builder.append(',');
            }
            var addressBody = AddressFactory.encodeAddress(4, 1, hashes, i * 19, 19);
            builder.append("{\"jsonrpc\":\"2.0\",\"method\":\"addAddressBookEntry\",\"params\":[\"BM-");
            builder.append(addressBody);
            builder.append("\",\"");
            var label = "fake-" + addressBody.substring(0, 6);
            var encodedLabel = encoder.encodeToString(label.getBytes(StandardCharsets.UTF_8));
            builder.append(encodedLabel);
            builder.append("\"],\"id\":");
            builder.append(i + 1);
            builder.append('}');
        }
        builder.append(']');
        try (var c = HttpClient.newHttpClient()) {
            var response = c.send(requestBuilder.POST(ofString(builder.toString())).build(), HttpResponse.BodyHandlers.ofString());
            var statusCode = response.statusCode();
            if (statusCode != 200) {
                System.err.printf("status code: %d%n", statusCode);
                return;
            }
            var body = response.body();
            System.out.println(body);
        }
    }

}
