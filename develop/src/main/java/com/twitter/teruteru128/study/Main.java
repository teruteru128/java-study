package com.twitter.teruteru128.study;

import com.twitter.teruteru128.bitmessage.spec.AddressFactory;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.spec.*;
import java.util.Base64;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;
import java.util.stream.IntStream;

/**
 * Main
 */
public class Main {

    private static final HttpRequest.Builder requestBuilder = HttpRequest.newBuilder(URI.create("http://192.168.12.8:8442/")).header("Content-Type", "application/json-rpc").header("Authorization", "Basic " + System.getenv("BM_TOKEN"));

    static {
        try {
            Security.addProvider(Class.forName("org.bouncycastle.jce.provider.BouncyCastleProvider").asSubclass(Provider.class).getConstructor().newInstance());
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
        var random = SecureRandom.getInstanceStrong();
        var command = args[0];
        if (command.equalsIgnoreCase("getPubKeySpam")) {
            getPubKeySpam(random, args.length >= 2 ? Integer.parseInt(args[1]) : 10000);
        }
        if (command.equalsIgnoreCase("random")) {
            doubleSample(ThreadLocalRandom.current());
        }
        if (command.equalsIgnoreCase("random2")) {
            var feats = ((165. / 64) - 1.0) * nextDouble(random) + 1;
            System.out.printf("%f feats, %f cm%n", feats, feats * 30.48);
            var milk = Math.pow(10, 4 + nextDouble(random));
            System.out.printf("%f ml, %f L%n", milk, milk / 1000);
        }
        if (command.equalsIgnoreCase("randomAlgorithms")) {
            RandomGeneratorFactory.all().map(RandomGeneratorFactory::name).forEach(System.out::println);
            System.out.println(RandomGenerator.getDefault());
        }
        if (command.equalsIgnoreCase("search")) {
            Search.getExecutor(args.length >= 2 ? Integer.parseInt(args[1], 10) : Runtime.getRuntime().availableProcessors());
        }
        if (command.equalsIgnoreCase("sample")) {
            sample(random);
        }
        if (command.equalsIgnoreCase("homo")) {
            int num = args.length >= 2 ? Integer.parseInt(args[1]) : 10;
            System.out.println(Homo.getHomo(num));
            System.out.printf("%s%n", Charset.defaultCharset().displayName());
        }
        if (command.equalsIgnoreCase("parallel")) {
            IntStream.range(0, 114514).parallel().mapToObj(i -> Thread.currentThread()).forEach(System.out::println);
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

    private static double nextDouble(RandomGenerator random) {
        // random Double
        long bits = random.nextLong();
        long fraction = bits & 0xfffffffffffffL;
        int exp = 1022 - Long.numberOfTrailingZeros(~(bits >>> 52));
        if (exp == 1010) {
            long randomBits;
            do {
                randomBits = random.nextLong();
                exp -= Long.numberOfTrailingZeros(~randomBits);
            } while (randomBits == 0);
        }
        if (fraction == 0) {
            exp++;
        }
        return Double.longBitsToDouble(((long) exp << 52) | fraction);
    }

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
            var response = c.send(requestBuilder.POST(HttpRequest.BodyPublishers.ofString(builder.toString())).build(), HttpResponse.BodyHandlers.ofString());
            var statusCode = response.statusCode();
            if (statusCode != 200) {
                System.err.printf("status code: %d%n", statusCode);
                return;
            }
            var body = response.body();
            System.out.println(body);
        }
    }

    /**
     * 　鍵を乱数で選んですべての鍵と共有秘密を生成してみる
     *
     * @param random 乱数生成源
     * @throws IOException                   ファイル入力失敗
     * @throws NoSuchAlgorithmException      多分起きない
     * @throws InvalidParameterSpecException 多分起きない
     * @throws InvalidKeySpecException       多分起きない
     * @see javax.crypto.KeyAgreement
     */
    private static void sample(RandomGenerator random) throws IOException, NoSuchAlgorithmException, InvalidParameterSpecException, InvalidKeySpecException {
        var i = random.nextInt();
        var b = new byte[65];
        var p = Search.first.resolve(String.format("publicKeys%d.bin", i >>> 24));
        try (var file = new RandomAccessFile(p.toFile(), "r")) {
            file.seek((i & 0xffffff) * 65);
            file.read(b);
        }
        var parameters = AlgorithmParameters.getInstance("EC");
        parameters.init(new ECGenParameterSpec("SECP256K1"));
        var parameterSpec = parameters.getParameterSpec(ECParameterSpec.class);
        System.out.printf("%064x%n", parameterSpec.getOrder());
        var spec1 = new ECPublicKeySpec(new ECPoint(new BigInteger(1, b, 1, 32), new BigInteger(1, b, 33, 32)), parameterSpec);
        var factory = KeyFactory.getInstance("EC");
        var a = factory.generatePublic(spec1);
        System.out.println(a);
        // 最初のファイルを読み込んで公開鍵のリストに変換しlistにセットする
        // executorを使って次のファイルの読み込みと変換を始める(future)
        // foreach list して a との共有秘密を生成する
        // futureから読み込んだ鍵を取り出しlistにセットする
    }

}
