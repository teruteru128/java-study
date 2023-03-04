package com.twitter.teruteru128.study;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.Security;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import com.twitter.teruteru128.bitmessage.Dandelion;

/**
 * Main
 * 秘密鍵かな？
 * ioxhJc1lIE2m+WFdBg3ieQb6rk8sSvg3wRv/ImJz2tc=
 * cm2E2vmE0Nd8aVP/4Ph2S1R6C5bkC1H7CiUBzbcDG3U=
 * BixgbLYk35GP+XHYdK/DgSWIUXyCTwCwEtY4h/G22dw=
 * BH4RDmdo0Yq0Ftiw0lm9ej5BmpZ35kEw2kaWZlZ0Do8=
 * lMhxDh6RPpWOsnJMeS12pTJ/j7EPn+ugpdbNQCGbiwc=
 * 9hZn+KDlwjgrbyFpaX5ibuaO4QfaFbIL79NUrwJlcRQ=
 * T+tDF4I700WFkFhGieYxWgQKPO/MDcntDYzMrqQSZjzwV2DzaI1OM/CsJWE30WBqMI1SxbEQHufR1A76I7ayWN==
 * nySkaCQxGErccmiqLznSQduXgFICpjnl2bo7n3FAhQMlku79plIeL85/etpN865GAnlUpErSppEYHvn4couGh3==
 * ns2bQQ4zlnfcCTSAxEH3gDDYHcBswKw92jQeEgm+9tse74XdX+LNwgfw7OsMUjOGtLMb7R/kXNRXYv1AHi71iV==
 * NxhJ5JwWhUtUccCfJNtVqzdpCMGOaAtknmcEKLyglZFNXE66EiFi9wPFekwekx3ln8m9v5wnfv7V8jSrpZ/SHQ==
 * +3n5qDbtpicXBy+Yyol/TJkg2IoQ01vZ/U2SvgpP+Fdm4DrIYngY7X0ZS53rc/KKIHT//jVqNwNBz1sGFyYUDg==
 * cLtHGFI7X/Xl6Ly03DczMzl2bsHJmI2BMQKKCckUek5vTIiltDPfT3PxdT6zxW1LzwVqJIsQEkxxPNTswgpSFg==
 * pMQBNF+F12AXT3T0mQq7S0l1VcCr/Dw2Q54zeuHH0/1ExLgbhHEsmAHf3WR9nK/Ku1Mc/eU3vaAO78yplJB76A==
 * QUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQQ==
 * D8BH6DLNJekZ5jiiIVSnyS5ziE9XJSRG5bA9OdiFdjee6HTxHxFQXyEQdhfN+E69RKToLYXGDxK2X9v9eEcbUxdSp9tbptXegxkNQgIxg97BAq9gtmxPm4Ebngl/Q/I4
 * cLJlMSoCYBgR0d/bg7zG1B77BBWy7f1KLiJG5b8mPmlD8dAJKCZSEFRdWLuxSyRjgFFeiMm4+l+2SNIhL/SBma7ABhg232DeJkbUcZJKqBfAI9taPQ5Y9bwIXrcjxqMx
 * clock_gettimeを使って取得した時刻からtv_nsecの下1バイトを集めたやつ
 * ojHbK3vBB70XXaPfJWun7TNvtfs3fcP/RYvHDXvLB2Gn7SlvtfE3fbn/RYHHDV2j6SVrsfczebX7QX3DCWOf5Q==
 * b4Ohtcnd8QUZLUtfc4ebr83h9QknRVltgZWzx9vvAxc1SV1xhaO3y9/9ESU5V2t/k7HF2e0LHzNHW2+DobXJ3Q==
 * KEZaboKWqr7S5voYLEBUaHyQpLjM6v4SJjpOYnaUqLzQ5PgMIDRIZnqOorbK3vIGGjhMYHSInLDE2PYKHjJGWg==
 * hZmtwdXp/RElOVdrf5Onu8/j9wspPVFleY2htcnd8Q8jN0tfc4ebr8PX9QkdMUVZbYGVqcfb7wMXKz9TZ3uPrQ==
 * btRLuN4FP1H9vF3/ES0LPL757PPmfNY5xuIJszbhRFbiyxC7ADqoNVFjFVFOvM5Qs+QUEUsVl5RywYzvFXE1og==
 * 1bit右シフトしてみた。そのままだと1byteが奇数しか出ないっぽい
 * pQicBD8LZAewO48VT8ZlBGwZcsaDIhDSZ+iCNL9jII1Y95v+deF7z0auNNddtiOBwR5y5H4TolDldaYh2UuVSA==
 * Ya/piNyZ969sH/qUEPDazlnQVgRnbyLGN6RI+4YvGZoHGdbPw3tgQDktJs9pXYhF+KZoFo0T/bBjZuxUAmCqWA==
 * mgbBWuOBHpn/wEm10SiPBZgiulzISK44ngU/m/14uzvTrIXrKlqeDnq5ONvwM6TyYsQwM2dP4wR5/shIxymU4g==
 */
public class Main implements Callable<String> {

    static {
        if (Security.getProvider("BC") == null) {
            Security.addProvider(new BouncyCastleProvider());
        }
    }

    public Main() {
        super();
    }

    private static Main main = new Main();

    /**
     * {@link Dandelion#poissonTimeout()}のサンプル
     * 
     * @param average
     * @return
     */
    public static long poisson(long average) {
        double xp = 1. / (1 - ThreadLocalRandom.current().nextDouble());
        long count = 0;
        double exp_average = Math.exp(average);
        while (xp < exp_average) {
            xp /= (1 - ThreadLocalRandom.current().nextDouble());
            count++;
        }
        return count;
    }

    private static final HttpClient CLIENT = HttpClient.newBuilder().build();

    public static void jsonRPCRequestSample() throws IOException, InterruptedException {
        var request = HttpRequest.newBuilder(URI.create("http://192.168.12.8:8442/"))
                .header("Content-Type", "application/json-rpc")
                .header("Authorization", "Basic dGVydXRlcnUxMjg6YW5hbGJlYWRz")
                .POST(HttpRequest.BodyPublishers.ofString(
                        "{\"jsonrpc\": \"2.0\", \"method\": \"helloWorld\", \"params\": [\"33\", \"4\"], \"id\": 1}"))
                .build();
        var response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.statusCode());
        System.out.println(response.body());

    }

    /**
     * @see org.apache.commons.math3.distribution.TriangularDistribution
     * @param min
     * @param max
     * @param mean
     * @param x
     * @return
     */
    public static double triangularDistribution(double min, double max, double mean, double x) {
        if (min >= mean || mean >= max || min >= max) {
            throw new IllegalArgumentException();
        }
        double frac = (mean - min) / (max - min);
        if (x < frac) {
            return Math.sqrt(x * (mean - min) * (max - min)) + min;
        }
        return -Math.sqrt((1 - x) * (max - mean) * (max - min)) + max;
    }

    /***/
    public static void chinpo() {
        double penisSize1 = 0;
        double penisSize2 = 0;
        double penisSize3 = 0;
        double penisSize4 = 0;

        for (int i = 0; i < 10; i++) {
            penisSize1 = ThreadLocalRandom.current().nextGaussian(21, 9);
            penisSize2 = ThreadLocalRandom.current().nextDouble(9, 17);
            System.out.printf("%s, %s%n", Double.toString(penisSize1), Double.toString(penisSize2));
        }
        for (int i = 0; i < 10; i++) {
            penisSize3 = triangularDistribution(18, 30, 24, ThreadLocalRandom.current().nextDouble());
            penisSize4 = triangularDistribution(9, 17, 15, ThreadLocalRandom.current().nextDouble());
            System.out.printf("%s, %s%n", Double.toString(penisSize3), Double.toString(penisSize4));
        }
    }

    /**
     * @see org.apache.commons.math3.distribution.ExponentialDistribution
     */
    public static void anyDistributionSample() {
        double r = 0;
        double s = 0;
        for (int i = 0; i < 10; i++) {
            // ここ指数分布
            r = -Math.log(1 - ThreadLocalRandom.current().nextDouble());
            s = Math.sqrt(r);
            System.out.printf("%f, %f%n", r * 600, s * 600);
        }
    }

    /**
     * 
     * @param length
     * @param ttl
     * @param proofOfWorkNonceTrialsPerByte
     * @param payloadLengthExtraBytes
     * @return
     */
    static long calcTarget(int length, int ttl, int proofOfWorkNonceTrialsPerByte, int payloadLengthExtraBytes) {
        return (long) (0x1p64 / (proofOfWorkNonceTrialsPerByte
                * (length + 8 + payloadLengthExtraBytes + ((ttl * (length + 8 + payloadLengthExtraBytes)) / 0x1p16))));
    }

    private static ForkJoinPool service = (ForkJoinPool) Executors.newWorkStealingPool();

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        var s = service.submit(main);
        service.shutdown();
        System.out.println(s.get());
    }

    @Override
    public String call() throws Exception {
        char[] l = "ファルコン・パンチ".toCharArray();
        var s = RandomGenerator.of("SecureRandom");
        int length = l.length;
        char w = '\0';
        int j = 0;
        for (int i = 0; i < length - 2; i++) {
            j = s.nextInt(i, length);
            w = l[i];
            l[i] = l[j];
            l[j] = w;
        }
        return new String(l);
    }

}
