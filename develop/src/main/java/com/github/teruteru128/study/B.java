package com.github.teruteru128.study;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.random.RandomGenerator;

public class B {

  public static final long MASK = 1L << (64 - 45);
  public static final int KEY_ARRAY_LENGTH = 16777216;

  public void b(String pathStr) throws IOException, NoSuchAlgorithmException, DigestException {
    var path = Path.of(pathStr);
    var b = Files.readAllBytes(path);
    try (var pool = (ForkJoinPool) Executors.newWorkStealingPool(); var o = new PrintStream(
        Files.newOutputStream(Path.of("out.txt"), StandardOpenOption.WRITE,
            StandardOpenOption.APPEND, StandardOpenOption.CREATE), true)) {
      var generator = RandomGenerator.getDefault();
      var array = new CompletableFuture[KEY_ARRAY_LENGTH];
      var sha512_s = MessageDigest.getInstance("SHA-512");
      var start = LocalDateTime.now();
      for (var index = generator.nextInt(KEY_ARRAY_LENGTH) * 65; index < 1090519040; index += 65) {
        sha512_s.update(b, index, 65);
        for (int j = 0; j < KEY_ARRAY_LENGTH; j++) {
          int finalIndex = index;
          int finalJ = j * 65;
          array[j] = CompletableFuture.runAsync(() -> {
            try {
              var sha512 = (MessageDigest) sha512_s.clone();
              var ripemd160 = MessageDigest.getInstance("RIPEMD160");
              ByteBuffer buf = ByteBuffer.allocate(64);
              byte[] hash = buf.array();
              sha512.update(b, finalJ, 65);
              sha512.digest(hash, 0, 64);
              ripemd160.update(hash, 0, 64);
              ripemd160.digest(hash, 0, 20);
              var aLong = buf.getLong(0);
              if (Long.compareUnsigned(aLong, MASK) < 0) {
                o.printf("[%s] %016x, %d, %d%n", LocalDateTime.now(), aLong, finalIndex, finalJ);
                System.out.printf("%016x, %d, %d%n", aLong, finalIndex, finalJ);
              }
            } catch (CloneNotSupportedException | DigestException |
                     NoSuchAlgorithmException ignored) {
            }
          }, pool);
        }
        CompletableFuture.allOf(array).get();
        var finish = LocalDateTime.now();
        System.err.printf("[%s, %s]... %d%n", finish, Duration.between(start, finish), index);
        sha512_s.reset();
        start = finish;
      }
    } catch (ExecutionException ignored) {
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }
}
