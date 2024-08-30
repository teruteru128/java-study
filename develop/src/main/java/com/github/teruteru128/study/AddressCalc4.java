package com.github.teruteru128.study;

import static java.lang.Math.max;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class AddressCalc4 implements Callable<Void> {

  public final String fileTemplate;

  public AddressCalc4(String dir) {
    fileTemplate = dir;
  }

  @Override
  public Void call() throws IOException, NoSuchAlgorithmException, DigestException {
    final var indexOfKey = ThreadLocalRandom.current().nextInt();
    final var fileNumber = (indexOfKey >> 24) & 0xff;
    final var keyNumber = indexOfKey & 0xffffff;
    var signKey = new byte[65];
    AddressCalc.loadPublicKey(signKey, Path.of(String.format(fileTemplate, fileNumber)), keyNumber);
    var sha512 = MessageDigest.getInstance("SHA-512");
    var ripemd160 = MessageDigest.getInstance("RIPEMD160");
    var buffer = ByteBuffer.allocate(64);
    var hash = buffer.array();
    byte[] keys;
    int j;
    int offset;
    int max = 0;
    int score;
    long start;
    for (int i = 0; i < 256; i++) {
      keys = Files.readAllBytes(Path.of(String.format(fileTemplate, i)));
      start = System.nanoTime();
      for (j = 0, offset = 0; j < 16777216; j++, offset += 65) {
        sha512.update(signKey, 0, 65);
        sha512.update(keys, offset, 65);
        sha512.digest(hash, 0, 64);
        ripemd160.update(hash, 0, 64);
        ripemd160.digest(hash, 0, 20);
        score = Long.numberOfLeadingZeros(buffer.getLong(0));
        max = max(max, score);
        if (hash[0] == 0 && hash[1] == 0 && hash[2] == 0 && hash[3] == 0) {
          System.out.printf("%d, %d, %d, %d(%d)%n", fileNumber, keyNumber, i, j, score);
        }
      }
      System.err.printf("finish %d: %fs%n", i, (System.nanoTime() - start) / 1e9);
    }
    System.out.printf("best: %d%n", max);
    return null;
  }

}
