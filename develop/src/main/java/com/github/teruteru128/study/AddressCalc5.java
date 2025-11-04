package com.github.teruteru128.study;

import static com.github.teruteru128.study.AddressCalc.loadPublicKey;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.random.RandomGenerator;
import java.util.stream.IntStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine.Command;

@Command(name = "addressSearch5")
public class AddressCalc5 implements Callable<Void> {

  private final String pathSource;
  private final Logger logger = LoggerFactory.getLogger(getClass());

  public AddressCalc5(String dirPath) {
    this.pathSource = dirPath;
  }

  @Override
  public Void call() throws IOException, NoSuchAlgorithmException, DigestException {
    // ポジション選択
    long indexOfKey;
    int signFileNumber;
    int signKeyNumber;
    int encFileNumber;
    int encKeyNumber;
    // ファイルから鍵を1024個ずつ読み込み
    List<Path> pathList;
    try (var lines = Files.lines(Path.of(pathSource))) {
      pathList = lines.map(Path::of).toList();
    }
    var signKeyBuf = new byte[65 * 1024];
    var encKeyBuf = new byte[65 * 1024];
    var sha512 = MessageDigest.getInstance("SHA-512");
    var ripemd160 = MessageDigest.getInstance("RIPEMD160");
    var buffer = ByteBuffer.allocate(64);
    var hash = buffer.array();
    var random = RandomGenerator.getDefault();
    while (true) {
      // 0b1/signFileNumber/signKeyNumber/encFileNumber/encKeyNumber/L
      // 0b1_00000000_00000000000000_00000000_00000000000000L
      indexOfKey = random.nextLong(0b1_00000000_00000000000000_00000000_00000000000000L);
      signFileNumber = (int) (indexOfKey >> 36 & 0xff);
      signKeyNumber = (int) (indexOfKey >> 22 & 0x3fff) << 10;
      encFileNumber = (int) (indexOfKey >> 14 & 0xff);
      encKeyNumber = (int) (indexOfKey & 0x3fff) << 10;
      loadPublicKey(signKeyBuf, pathList.get(signFileNumber), signKeyNumber);
      loadPublicKey(encKeyBuf, pathList.get(encFileNumber), encKeyNumber);
      for (int i = 0; i < 66560; i += 65) {
        for (int j = 0; j < 66560; j += 65) {
          sha512.update(signKeyBuf, i, 65);
          sha512.update(encKeyBuf, j, 65);
          sha512.digest(hash, 0, 64);
          ripemd160.update(hash, 0, 64);
          ripemd160.digest(hash, 0, 20);
          if (IntStream.of(0, 1, 2, 3, 4, 5).anyMatch(v -> hash[v] != 0)) {
            continue;
          }
          logger.info("Found! {}, {}, {}, {}({})", signFileNumber, signKeyNumber + (i / 65),
              encFileNumber, encKeyNumber + (j / 65), Long.numberOfLeadingZeros(buffer.getLong(0)));

          if (IntStream.range(6, 20).anyMatch(k -> hash[k] != 0)) {
            return null;
          }
        }
      }
    }
  }
}
