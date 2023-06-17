package com.twitter.teruteru128.study;

import java.io.IOException;
import java.math.BigInteger;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.LongBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.security.KeyFactory;
import java.security.Security;
import java.security.Signature;
import java.security.spec.EdECPoint;
import java.security.spec.EdECPrivateKeySpec;
import java.security.spec.EdECPublicKeySpec;
import java.security.spec.NamedParameterSpec;
import java.util.BitSet;
import java.util.HexFormat;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.math.ec.ECPoint;

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
public class Main {

    static {
        if (Security.getProvider("BC") == null) {
            Security.addProvider(new BouncyCastleProvider());
        }
    }

    public static void sample(String a) throws IOException, InterruptedException {

        var client = HttpClient.newBuilder().build();
        var requestBuilder = HttpRequest.newBuilder(URI.create("http://localhost:8442/"))
                .header("Content-Type", "application/json-rpc")
                .header("Authorization", "Basic dGVydXRlcnUxMjg6YW5hbGJlYWRz");
        var requestBody = HttpRequest.BodyPublishers.ofString(a);
        var request = client.send(requestBuilder.copy().POST(requestBody).build(),
                HttpResponse.BodyHandlers.ofString());
        System.out.println(request.body());

    }

    static final HexFormat format = HexFormat.of();

    public static void printPoint(ECPoint point1) {
        System.out.println(point1);
        System.out.println(format.formatHex(point1.getEncoded(false)));
        System.out.println(format.formatHex(point1.getEncoded(true)));
        System.out.println(point1.getClass());
        System.out.println(point1 instanceof ECPoint.AbstractF2m);
        System.out.println(point1 instanceof ECPoint.AbstractFp);
        System.out.println(point1 instanceof ECPoint.F2m);
        System.out.println(point1 instanceof ECPoint.Fp);
    }

    public static void a() throws Exception {
        var format = HexFormat.of();
        var factory = KeyFactory.getInstance("Ed25519");
        var s0 = new EdECPrivateKeySpec(NamedParameterSpec.ED25519, format.parseHex(
                "86575b7afeb80e1d8ba7b295e06edc0de9fc53fb90981daebbecef93c6ff1a8c"));
        var s1 = new EdECPublicKeySpec(NamedParameterSpec.ED25519, new EdECPoint(false, new BigInteger(
                "1e6d78bf292bae807135fe2385c72ac353151a6cfed6bf573edb45278053558f", 16)));
        var sig = Signature.getInstance("Ed25519");

        var prik = factory.generatePrivate(s0);
        var pubk = factory.generatePublic(s1);

        var prispec = factory.getKeySpec(prik, EdECPrivateKeySpec.class);
        var pubspec = factory.getKeySpec(pubk, EdECPublicKeySpec.class);

        System.out.printf("private key: %s%n", format.formatHex(prispec.getBytes()));
        var point = pubspec.getPoint();
        System.out.printf("public key: %b, %x%n", point.isXOdd(), point.getY());

        sig.initSign(prik);

        var msg = "brown fox jumps over the lazy dog".getBytes(StandardCharsets.UTF_8);
        sig.update(msg);

        var hash = sig.sign();
        System.out.printf("%s%n", format.formatHex(hash));

        sig.initVerify(pubk);

        sig.update(msg);

        var b = sig.verify(hash);
        System.out.println(b);
    }

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        var p = Path.of("H:\\Data\\0x1000000000smallsieve.bs");
        try (FileChannel ch = (FileChannel) Files.newByteChannel(p, StandardOpenOption.READ)) {
            long filesize = ch.size();
            MappedByteBuffer buf = null;
            long mapedsize = 0;
            BitSet set;
            LongBuffer lo;
            long offset = 0;
            int card = 0;
            int size = 0;
            int length = 0;
            while (offset < filesize) {
                mapedsize = Math.min(filesize - offset, Integer.MAX_VALUE);
                buf = ch.map(FileChannel.MapMode.READ_ONLY, offset, mapedsize);
                lo = buf.asLongBuffer();
                if (offset == 0) {
                    lo.get();
                }
                set = BitSet.valueOf(lo);
                card += set.cardinality();
                size += set.size();
                length += set.length();
                offset = mapedsize;
            }
            System.out.printf("%d, %d, %d%n", card, size, length);
        }
    }

}
