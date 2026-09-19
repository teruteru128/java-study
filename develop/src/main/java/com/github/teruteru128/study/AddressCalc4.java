package com.github.teruteru128.study;

import static java.lang.Math.max;

import com.github.teruteru128.bitmessage.Const;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

// FIXME コンストラクタを呼び出す時点で計算対象の範囲は確定しているべき
@Command(name = "addressSearch4")
public class AddressCalc4 implements Callable<Void> {

  private static final VarHandle LONG_HANDLE = MethodHandles.byteArrayViewVarHandle(long[].class,
      ByteOrder.BIG_ENDIAN);

  @Parameters(index = "0", description = "公開鍵ファイル名のテンプレート(例: /path/to/publicKeys%d.bin)")
  public String fileTemplate;

  /**
   * picocliから生成されるためのコンストラクタ。
   */
  public AddressCalc4() {
  }

  public AddressCalc4(String dir) {
    fileTemplate = dir;
  }

  @Override
  public Void call() throws IOException {
    final var indexOfKey = ThreadLocalRandom.current().nextInt();
    final var fileNumber = (indexOfKey >> 24) & 0xff;
    final var keyNumber = indexOfKey & 0xffffff;
    var signKey = new byte[65];
    AddressCalc.loadPublicKey(signKey, Path.of(String.format(fileTemplate, fileNumber)), keyNumber);
    var hash = new byte[Const.SHA512_DIGEST_LENGTH];
    byte[] keys;
    int j;
    int offset;
    int max = 0;
    int score;
    long start;
    // ダイジェストはOpenSSLに任せる(BouncyCastleの純Javaより約2.3倍速い)
    try (var calculator = new RipeCalculator()) {
      calculator.setSignKey(signKey, 0);
      for (int i = 0; i < 256; i++) {
        keys = Files.readAllBytes(Path.of(String.format(fileTemplate, i)));
        start = System.nanoTime();
        for (j = 0, offset = 0; j < 16777216; j++, offset += 65) {
          calculator.calcRipe(keys, offset, hash);
          score = Long.numberOfLeadingZeros((long) LONG_HANDLE.get(hash, 0));
          max = max(max, score);
          if (score >= 45) {
            System.out.printf("%d, %d, %d, %d(%d)%n", fileNumber, keyNumber, i, j, score);
          }
        }
        System.err.printf("finish %d: %fs%n", i, (System.nanoTime() - start) / 1e9);
      }
    }
    System.out.printf("best: %d%n", max);
    return null;
  }

}
