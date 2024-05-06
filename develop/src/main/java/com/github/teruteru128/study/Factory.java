package com.github.teruteru128.study;

import com.github.teruteru128.bitmessage.app.Spammer;
import com.github.teruteru128.fx.App;
import com.github.teruteru128.sample.clone.CloneSample;
import com.github.teruteru128.sample.kdf.PBKDF2Sample;
import com.github.teruteru128.sample.awt.TrayIconDemo;
import javafx.application.Application;

import javax.crypto.SecretKeyFactory;
import java.awt.*;
import java.io.*;
import java.math.BigInteger;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.security.*;
import java.security.spec.*;
import java.sql.SQLException;
import java.time.Duration;
import java.util.Base64;
import java.util.EnumSet;
import java.util.HexFormat;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;
import java.util.random.RandomGenerator;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

public class Factory {
    public static final RandomGenerator SECURE_RANDOM_GENERATOR = RandomGenerator.of("SecureRandom");

    /**
     * @param args
     * @throws IOException
     * @throws InterruptedException
     * @throws NoSuchAlgorithmException
     * @throws DigestException
     * @throws SQLException
     * @throws URISyntaxException
     * @throws AWTException
     * @throws ExecutionException
     */
    static void create(String[] args) throws IOException, InterruptedException, NoSuchAlgorithmException, DigestException, SQLException, URISyntaxException, AWTException, ExecutionException, InvalidParameterSpecException, InvalidKeySpecException, SignatureException, InvalidKeyException, ClassNotFoundException {
        switch (args[0]) {
            case "clone" -> CloneSample.cloneSample();
            case "getPubKeySpam" ->
                    Spammer.getPubKeySpam((SecureRandom) SECURE_RANDOM_GENERATOR, args.length >= 2 ? Integer.parseInt(args[1]) : 10000);
            case "random" -> Random.doubleSample(RandomGenerator.getDefault());
            case "random2" -> Random.random2();
            case "random3" -> Random.random3();
            case "random4" -> Random.random4();
            case "ts1" -> TeamSpeak.ts1();
            case "ts2" -> TeamSpeak.ts2();
            case "ts3" -> TeamSpeak.ts3();
            case "unitSpam" -> {
                if (args.length >= 2) {
                    Spammer.unitSpam(Files.readAllLines(Path.of(args[1])), 2500, Duration.ofHours(12), args.length >= 3 ? Integer.parseInt(args[2]) : 0);
                }
            }
            case "unitSpam2" -> {
                if (args.length >= 2) {
                    Spammer.unitSpam2(Files.readAllLines(Path.of(args[1])), 2500, args.length >= 3 ? Integer.parseInt(args[2]) : 0);
                }
            }
            case "hash-base64" -> {
                if (args.length >= 2) {
                    System.out.println(Base64.getEncoder().encodeToString(MessageDigest.getInstance("SHA-256").digest(Files.readAllBytes(Path.of(args[1])))));
                }
            }
            case "search-tor" -> {
                var min = args.length >= 2 ? Integer.parseInt(args[1]) : (4299 + 9473);
                var max = args.length >= 3 ? Integer.parseInt(args[2]) : 23000;
                SiteChecker.searchTor(min, max);
            }
            case "check-tor" -> SiteChecker.siteCheck();
            case "map" -> System.out.println("System.mapLibraryName(\"OpenCL\") = " + System.mapLibraryName("OpenCL"));
            case "telnet-tor" -> {
                var hostname = args[1];
                var port = Integer.parseInt(args[2]);
                Telnet.extracted(hostname, port);
            }
            case "loto7" -> {
                if (args.length >= 2) {
                    Takarakuji.getLoto7Numbers(Integer.parseInt(args[1]));
                } else {
                    Takarakuji.getLoto7Numbers(1);
                }
            }
            case "tray" -> new TrayIconDemo().sample();
            case "zgrep" -> {
                if (args.length < 3) {
                    return;
                }
                extracted(args[1], args[2]);
            }
            case "sign" -> extracted();
            case "fx" -> Application.launch(App.class, args);
            case "pbkdf2" -> {
                if (args.length >= 2) {
                    byte[] salt;
                    if (args.length == 2) {
                        salt = new byte[16];
                        SECURE_RANDOM_GENERATOR.nextBytes(salt);
                    } else {
                        salt = HexFormat.of().parseHex(args[2]);
                    }
                    PBKDF2Sample.getFormatName(args[1].toCharArray(), salt);
                }
            }
            case "pbkdf2-2" -> {
                var factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA3-512");
                System.out.printf("algo: %s(%s)%n", factory.getAlgorithm(), factory.getProvider());
                System.out.println(factory);
            }
            case "list-encodings" -> {
                System.err.printf("native.encoding=%s%n", System.getProperty("native.encoding"));
                System.err.printf("stderr.encoding=%s%n", System.getProperty("stderr.encoding"));
                System.err.printf("stdout.encoding=%s%n", System.getProperty("stdout.encoding"));
                System.err.printf("file.encoding=%s%n", Charset.defaultCharset().displayName());
            }
            case "ssl"->{
                var factory = KeyFactory.getInstance("Ed25519");
                var p = factory.generatePrivate(new PKCS8EncodedKeySpec(Files.readAllBytes(Path.of(args[1]))));
            }
            case null, default -> {
                System.err.println("unknown command");
                Runtime.getRuntime().exit(1);
            }
        }
    }

    private static void extracted(String path, String patternArg) throws IOException {
        var p = Paths.get(path);
        var pattern = Pattern.compile(patternArg);
        Files.walkFileTree(p, EnumSet.noneOf(FileVisitOption.class), Integer.MAX_VALUE, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                var fileName = file.getFileName().toString();
                if (fileName.endsWith(".gz")) {
                    try (var s = new BufferedReader(new InputStreamReader(new GZIPInputStream(Files.newInputStream(file, StandardOpenOption.READ)), StandardCharsets.UTF_8))) {
                        s.lines().filter(l -> pattern.matcher(l).find()).forEach(System.out::println);
                    } catch (UncheckedIOException e) {
                        System.err.println("ERROR: " + file);
                        return FileVisitResult.CONTINUE;
                    }
                }
                return FileVisitResult.CONTINUE;
            }
        });
    }

    private static void extracted() throws NoSuchAlgorithmException, InvalidParameterSpecException, InvalidKeySpecException, IOException, InvalidKeyException, SignatureException {
        // 処理をシリアライズするなら普通にクラスをシリアライズしろってなｗ
        var parameters = AlgorithmParameters.getInstance("EC");
        parameters.init(new ECGenParameterSpec("secp256k1"));
        var params = parameters.getParameterSpec(ECParameterSpec.class);
        var factory = KeyFactory.getInstance("ECDSA");

        var hexFormat = HexFormat.of();
        var p = factory.generatePrivate(new ECPrivateKeySpec(new BigInteger(1, hexFormat.parseHex("2071778BC323CE82095CB4D26C8B62F94DB4748CE5A9F61C6D2DDFFADE2BB446")), params));
        var sign = Signature.getInstance("ECDSA");
        var signObject = new SignedObject((Function<String, String> & Serializable) i -> i.repeat(3) + "って？", p, sign);
        var x = new BigInteger(1, hexFormat.parseHex("F166D9114137A496AE1BEDE6B6CA6EAB19B84D34984897183B7426650C33ED8A"));
        var y = new BigInteger(1, hexFormat.parseHex("A8E145E1A671C4C4D40EDA5CF858273798E5746EB277A568C1B710ABB440E46F"));
        var w = new ECPoint(x, y);
        var keySpec = new ECPublicKeySpec(w, params);
        var verificationKey = factory.generatePublic(keySpec);
        if (signObject.verify(verificationKey, sign)) {
            System.out.println("check ok");
        } else {
            System.out.println("check ng");
        }
    }
}
