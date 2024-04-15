package com.github.teruteru128.study;

import com.github.teruteru128.bitmessage.app.Spammer;
import com.github.teruteru128.sample.CloneSample;
import com.github.teruteru128.sample.TrayIconDemo;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.sql.SQLException;
import java.time.Duration;
import java.util.Base64;
import java.util.random.RandomGenerator;

public class Factory {
    public static final RandomGenerator SECURE_RANDOM_GENERATOR = RandomGenerator.of("SecureRandom");

    static void create(String[] args) throws IOException, InterruptedException, NoSuchAlgorithmException, DigestException, SQLException, URISyntaxException, AWTException {
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
            case null, default -> {
                System.err.println("unknown command");
                Runtime.getRuntime().exit(1);
            }
        }
    }
}
