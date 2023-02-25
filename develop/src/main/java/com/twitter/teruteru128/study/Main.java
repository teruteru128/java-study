package com.twitter.teruteru128.study;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.Security;
import java.security.spec.ECGenParameterSpec;
import java.time.Duration;
import java.time.Instant;
import java.util.HexFormat;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import com.twitter.teruteru128.bitmessage.Spammer;

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
public class Main implements Callable<Void> {

    static {
        if (Security.getProvider("BC") == null) {
            Security.addProvider(new BouncyCastleProvider());
        }
    }

    public Main() {
        super();
    }

    private static Main main = new Main();

    public static void aesSample() throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException,
            IllegalBlockSizeException, BadPaddingException {
        var cipher = Cipher.getInstance("AES/ECB/NoPadding");
        var key = new byte[96];
        new SecureRandom().nextBytes(key);
        var keySpec1 = new SecretKeySpec(key, 0, 32, "AES");
        var keySpec2 = new SecretKeySpec(key, 32, 32, "AES");
        var keySpec3 = new SecretKeySpec(key, 64, 32, "AES");
        var message = new byte[16];
        var format = HexFormat.of();
        cipher.init(Cipher.ENCRYPT_MODE, keySpec1);
        var work = cipher.doFinal(message);
        cipher.init(Cipher.DECRYPT_MODE, keySpec2);
        work = cipher.doFinal(work);
        cipher.init(Cipher.ENCRYPT_MODE, keySpec3);
        work = cipher.doFinal(work);
        System.out.println(format.formatHex(work));
    }

    public static void secp256k1GenerateSample()
            throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        var generator1 = KeyPairGenerator.getInstance("EC", "BC");
        // secp256k1はJDK 16で削除されました。
        generator1.initialize(new ECGenParameterSpec("secp256k1"));
        var pubKey = (ECPublicKey) generator1.generateKeyPair().getPublic();
        System.out.println(pubKey.getAlgorithm());
        System.out.println(pubKey.getFormat());
        var q = pubKey.getQ();
        System.out.println(q.getXCoord().getClass());
        System.out.println(HexFormat.of().formatHex(pubKey.getQ().getEncoded(false)));
        System.out.println(HexFormat.of().formatHex(pubKey.getEncoded()));

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

    public static void chinpo() {
        System.out.println();
        double penisSize1 = 0;
        double penisSize2 = 0;
        double penisSize3 = 0;
        double penisSize4 = 0;
        
        for (int i = 0; i < 10; i++) {
            penisSize1 = ThreadLocalRandom.current().nextGaussian(21, 9);
            penisSize2 = ThreadLocalRandom.current().nextDouble(18, 24);
            System.out.printf("%s, %s%n", Double.toString(penisSize1), Double.toString(penisSize2));
        }
        for (int i = 0; i < 10; i++) {
            penisSize3 = triangularDistribution(18, 30, 24, ThreadLocalRandom.current().nextDouble());
            penisSize4 = triangularDistribution(9, 17, 15, ThreadLocalRandom.current().nextDouble());
            System.out.printf("%s, %s%n", Double.toString(penisSize3), Double.toString(penisSize4));
        }
    }

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        /* 
        var service = Executors.newScheduledThreadPool(1);
        var now = Instant.now();
        // durUnit 単位で切り上げ
        var durUnit = DetailedChronoUnit.FIVE_MINUTES.getDuration();
        var dur = durUnit.toNanos();
        var nod = (now.getEpochSecond() % 86400) * 1000_000_000L + now.getNano();
        // TODO replace to ceilDiv on JDK 18
        var result = (long) Math.ceil((double) nod / dur) * dur;
        var target = now.plusNanos(result - nod);
        var diff = Duration.between(now, target);
        System.out.printf("%d分%d秒%09d待機します……%n", diff.toMinutesPart(), diff.toSecondsPart(), diff.toNanosPart());
        var future = service.scheduleAtFixedRate(() -> new Spammer().doSpam(1000), diff.toMillis(), durUnit.toMillis(),
                TimeUnit.MILLISECONDS);
        service.schedule(() -> {
            future.cancel(false);
            service.shutdown();
        }, 1, TimeUnit.DAYS);
         */
        chinpo();
        /*
         * System.out.println(ThreadLocalRandom.current().nextInt(-256, 256));
         * for(int i = 0; i < 10; i++) {
         * System.out.println(poisson(30));
         * }
         * System.out.println("--");
         * 
         * double r = 0;
         * double s = 0;
         * for (int i = 0; i < 10; i++) {
         * // ここ指数分布
         * r = -Math.log(1 - ThreadLocalRandom.current().nextDouble());
         * s = Math.sqrt(r);
         * System.out.printf("%f, %f%n", r * 600, s * 600);
         * }
         */
        // 原点を通る一次関数とガウス関数をxについて解いてなんかできねえかな……
        // 1次関数 y = ax の a を乱数tan(pi * (1-randomReal())/2)にして y = e^(-x^2) とxに付いて解くとか
        // y = sqrt(-log(x))
        // y = sqrt(-log(tan(pi * (1-randomReal())/2)))
        /*
         * var client = HttpClient.newBuilder().build();
         * var request = HttpRequest.newBuilder(URI.create("http://192.168.12.8:8442/"))
         * .header("Content-Type", "application/json-rpc")
         * .header("Authorization", "Basic dGVydXRlcnUxMjg6YW5hbGJlYWRz")
         * .POST(HttpRequest.BodyPublishers.ofString(
         * "{\"jsonrpc\": \"2.0\", \"method\": \"helloWorld\", \"params\": [\"33\", \"4\"], \"id\": 1}"
         * ))
         * .build();
         * var response = client.send(request, HttpResponse.BodyHandlers.ofString());
         * System.out.println(response.statusCode());
         * System.out.println(response.body());
         */
        /*
         * var generator1 = KeyPairGenerator.getInstance("EC", "BC");
         * // secp256k1はJDK 16で削除されました。
         * generator1.initialize(new ECGenParameterSpec("secp256k1"));
         * var pubKey = (ECPublicKey)generator1.generateKeyPair().getPublic();
         * System.out.println(pubKey.getAlgorithm());
         * System.out.println();
         * System.out.println(pubKey.getFormat());
         * var q = pubKey.getQ();
         * System.out.println(q.getXCoord().getClass());
         * System.out.println(HexFormat.of().formatHex(pubKey.getQ().getEncoded(false)))
         * ;
         * System.out.println(HexFormat.of().formatHex(pubKey.getEncoded()));
         */
    }

    @Override
    public Void call() throws Exception {
        // Protocol.connect();
        /*
         * var parameters = AlgorithmParameters.getInstance("EC");
         * parameters.init(new ECGenParameterSpec("secp256k1"));
         * var parameterSpec = parameters.getParameterSpec(ECParameterSpec.class);
         * 
         * var hexFormat = HexFormat.of();
         * 
         * var s = hexFormat.parseHex(
         * "094C02B90C53CF627A5DF9C6C9961E9476A905C782601C5CBBD546510C66834417572FE987A4C1D036B18E6F1DD00B9213F8D568B09642BFA91E0F4E3BFD0E24"
         * );
         * var sx = new BigInteger(s, 0, 32);
         * var sy = new BigInteger(s, 32, 32);
         * var edata = hexFormat.parseHex(
         * "47001D7B44C49BB75369AAB880BF547E86AE21384657B1C8F67E4ED05856E6CDBBFEF225D297426E6AEDCF50605F127F68F14BB23CA21B161F77C1D67277C11B"
         * );
         * var ex = new BigInteger(edata, 0, 32);
         * var ey = new BigInteger(edata, 32, 32);
         * 
         * var signPublicKeySpec = new ECPublicKeySpec(new ECPoint(sx, sy),
         * parameterSpec);
         * var encPublicKeySpec = new ECPublicKeySpec(new ECPoint(ex, ey),
         * parameterSpec);
         * 
         * var keyFactory = KeyFactory.getInstance("EC");
         * 
         * var signPublicKey = keyFactory.generatePublic(signPublicKeySpec);
         * var encPublicKey = keyFactory.generatePublic(encPublicKeySpec);
         * 
         * System.out.println(signPublicKey);
         * System.out.println(encPublicKey);
         * 
         * var sig = Signature.getInstance("SHA256withECDSA");
         * sig.initVerify(signPublicKey);
         * var kex = KeyAgreement.getInstance("ECDH");
         * // kex.init(encPublicKey);
         * System.out.println(sig);
         * System.out.println(kex);
         */
        return null;
    }

}
