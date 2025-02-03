package com.github.teruteru128.study;

import static com.github.teruteru128.bitmessage.Const.SEC_P256_K1_G;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import com.github.teruteru128.bitmessage.genaddress.BMAddressGenerator;
import com.github.teruteru128.bitmessage.spec.AddressFactory;
import com.github.teruteru128.encode.Base58;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HexFormat;
import java.util.concurrent.Callable;
import java.util.random.RandomGenerator;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "multi2", description = {"指定した署名鍵とファイルの暗号鍵からアドレスを計算する"})
public class Multi2 implements Callable<Integer> {

  public static final YAMLMapper YAML_MAPPER = new YAMLMapper();
  private static final HexFormat FORMAT = HexFormat.of();
  @Parameters
  private String signPrivateKey58;
  @Option(names = {"--config"})
  private Path configPath = Path.of("keyconfig.yml");

  @Override
  public Integer call() throws IOException, NoSuchAlgorithmException, DigestException {
    var sp = Base58.decode(signPrivateKey58);
    var sigPubKey = SEC_P256_K1_G.multiply(new BigInteger(1, sp, 1, 32)).getEncoded(false);
    var index = Factory.SECURE_RANDOM_GENERATOR.nextInt();
    System.out.printf("index: %d%n", index);
    var fileNumber = (index >> 24) & 0xff;
    System.out.printf("file number: %d%n", fileNumber);
    final var initialOffset = (index & 0xffffff) * 65;
    System.out.printf("initial offset: %d%n", initialOffset);
    JsonNode root;
    try (var in = new BufferedInputStream(Files.newInputStream(configPath))) {
      root = YAML_MAPPER.readTree(in);
    }
    var publicList = root.get("public");
    var privateList = root.get("private");
    var sha512 = MessageDigest.getInstance("SHA-512");
    var ripemd160 = MessageDigest.getInstance("RIPEMD160");
    long privateKeyOffset;
    byte[] ripe;
    try (var file = new RandomAccessFile(Path.of(publicList.get(fileNumber).textValue()).toFile(), "r")) {
      var publicKey = new byte[65];
      ripe = new byte[64];
      file.seek(initialOffset);
      do {
        file.readFully(publicKey);
        sha512.update(sigPubKey);
        sha512.update(publicKey);
        sha512.digest(ripe, 0, 64);
        ripemd160.update(ripe, 0, 64);
        ripemd160.digest(ripe, 0, 20);
      } while (ripe[0] != 0);
      System.out.printf("ripe: %s%n", FORMAT.formatHex(ripe, 0, 20));
      var currentOffset = file.getFilePointer() - 65;
      privateKeyOffset = (currentOffset / 65) * 32;
      System.out.printf("offset: %d -> %d%n", currentOffset, privateKeyOffset);
    }
    String p;
    try (var file = new RandomAccessFile(
        Path.of(privateList.get(fileNumber).textValue()).toFile(), "r")) {
      file.seek(privateKeyOffset);
      var privateKey = new byte[32];
      file.readFully(privateKey);
      p = BMAddressGenerator.encodeWIF(privateKey);
    }
    System.out.printf("enc private key: %s%n", p);
    System.out.printf("address: %s%n", AddressFactory.encodeAddress(4, 1, ripe, 0, 20));

    return ExitCode.OK;
  }
}
