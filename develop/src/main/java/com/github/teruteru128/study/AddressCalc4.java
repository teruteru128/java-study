package com.github.teruteru128.study;

import static java.lang.Math.max;

import static com.github.teruteru128.foreign.bmhash.BmHash16.LANES;

import com.github.teruteru128.bitmessage.Const;
import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
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
    // ripeを16件まとめて受け取るバッファ
    var ripes = new byte[LANES * Const.RIPEMD160_DIGEST_LENGTH];
    int j;
    long offset;
    int max = 0;
    int score;
    int lane;
    long start;
    // ダイジェストはAVX-512の16レーン実装に任せる。使えない環境では自動的に
    // 1件ずつのOpenSSL経路へ落ちる
    try (var calculator = new RipeCalculator()) {
      System.err.printf("16レーン実装: %s%n",
          RipeCalculator.isBatchAccelerated() ? "有効" : "無効(1件ずつ計算します)");
      calculator.setSignKey(signKey, 0);
      for (int i = 0; i < 256; i++) {
        var file = Path.of(String.format(fileTemplate, i));
        // 1ファイル1.04GBをヒープに読むとGCを無駄に働かせるうえ、ネイティブへ写す手間も
        // 増える。mmapしてMemorySegmentのまま渡せば入力側のコピーが完全に無くなる
        try (var arena = Arena.ofConfined();
            var channel = FileChannel.open(file, StandardOpenOption.READ)) {
          var keys = channel.map(MapMode.READ_ONLY, 0, Files.size(file), arena);
          start = System.nanoTime();
          // 16777216は16で割り切れるので端数は出ない
          for (j = 0, offset = 0; j < 16777216; j += LANES, offset += 65L * LANES) {
            calculator.calcRipeBatch(keys, offset, ripes);
            for (lane = 0; lane < LANES; lane++) {
              score = Long.numberOfLeadingZeros(
                  (long) LONG_HANDLE.get(ripes, lane * Const.RIPEMD160_DIGEST_LENGTH));
              max = max(max, score);
              if (score >= 45) {
                System.out.printf("%d, %d, %d, %d(%d)%n", fileNumber, keyNumber, i, j + lane,
                    score);
              }
            }
          }
        }
        System.err.printf("finish %d: %fs%n", i, (System.nanoTime() - start) / 1e9);
      }
    }
    System.out.printf("best: %d%n", max);
    return null;
  }

}
