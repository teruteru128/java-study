package com.twitter.teruteru128.study;

import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.security.DrbgParameters;
import java.security.SecureRandom;
import java.security.Security;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HexFormat;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.random.RandomGenerator;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import com.twitter.teruteru128.bitmessage.app.NewPostTask;

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
public class Main implements Callable<Long> {

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
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        SecureRandom random = SecureRandom.getInstanceStrong();

        System.err.println("address list loading...");

        var toAddressesLoadTask = main.forkJoinPool.submit(()->java.nio.file.Files.readAllLines(Paths.get("out.txt"), StandardCharsets.UTF_8));
        var fromAddressesLoadTask = main.forkJoinPool.submit(()->java.nio.file.Files.readAllLines(Paths.get("notchannels.txt"), StandardCharsets.UTF_8));

        var toAddresses = new ArrayList<>(toAddressesLoadTask.get());
        int toAddressesSize = toAddresses.size();
        System.err.printf("toAddressListをロードしました: %d件%n", toAddressesSize);
        Collections.shuffle(toAddresses, random);

        var fromAddresses = new ArrayList<>(fromAddressesLoadTask.get());
        int fromAddressesSize = fromAddresses.size();
        System.err.printf("fromAddressListをロードしました: %d件%n", fromAddressesSize);
        // 128bit乱数では35個のシャッフルまでしか耐えられない
        // 1152bit乱数では187個のシャッフルまでしか耐えられない
        Collections.shuffle(fromAddresses, random);

        var task = new NewPostTask(toAddresses, fromAddresses, 10000);

        var f = main.scheduledExecutorService.scheduleAtFixedRate(task, 0, 23, TimeUnit.HOURS);
        System.err.println("起動しました");
        f.get();

        /* 
        var task = new ScheduledPostTask(toAddresses, fromAddresses, 10000);
        var f = main.scheduledExecutorService.scheduleAtFixedRate(task, 0, (long) (86400D / 10000), TimeUnit.SECONDS);
        System.err.println("起動しました");
        f.get();
         */
        /* 
        var context = SSLContext.getDefault();
        var engine = context.createSSLEngine();
        var parameters = engine.getSSLParameters();
        var cipherSuites = parameters.getCipherSuites();
        if (!com.twitter.teruteru128.util.Arrays.contains(cipherSuites, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA")) {
            int newLength = cipherSuites.length + 1;
            cipherSuites = Arrays.copyOf(cipherSuites, newLength);
            cipherSuites[newLength - 1] = "TLS_ECDH_anon_WITH_AES_256_CBC_SHA";
            parameters.setCipherSuites(cipherSuites);
            engine.setSSLParameters(parameters);
        }
        engine.setUseClientMode(true);
        */
    }

    private ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
    private ForkJoinPool forkJoinPool = (ForkJoinPool) Executors.newWorkStealingPool();

    @Override
    public Long call() throws Exception {
        long a = 0;
        return a;
    }

}
