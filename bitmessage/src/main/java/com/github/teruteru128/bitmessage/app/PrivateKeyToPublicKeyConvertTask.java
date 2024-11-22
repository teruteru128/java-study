package com.github.teruteru128.bitmessage.app;

import static com.github.teruteru128.bitmessage.Const.PRIVATE_KEY_LENGTH;
import static com.github.teruteru128.bitmessage.Const.PUBLIC_KEY_LENGTH;

import com.github.teruteru128.bitmessage.Const;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.Callable;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Parameters;

@Command(name = "convert")
public class PrivateKeyToPublicKeyConvertTask implements Callable<Integer> {

  @Parameters
  private Path privateKeyPath;
  @Parameters
  private Path publicKeyPath;

  /**
   * @see <a href="https://github.com/Bitmessage/PyBitmessage/blob/6f35da4096770a668c4944c3024cd7ddb34be092/src/class_addressGenerator.py#L131">class_addressGenerator.py</a>
   * @see <a href="https://en.bitcoin.it/wiki/Wallet_import_format">Wallet import format</a>
   * @see <a href="https://stackoverflow.com/questions/49204787/deriving-ecdsa-public-key-from-private-key">Deriving ECDSA Public Key from Private Key - stack overflow</a>
   */
  @Override
  public Integer call() throws IOException {
    byte[] potentialPublicEncryptionKey;
    byte[] privateKeys = Files.readAllBytes(privateKeyPath);
    var keyNum = privateKeys.length / PRIVATE_KEY_LENGTH;
    byte[] publicKeys = new byte[keyNum * PUBLIC_KEY_LENGTH];
    int privateKeyOffset = 0;
    int publicKeyOffset = 0;
    for (int i = 0; i < keyNum;
        i++, privateKeyOffset += PRIVATE_KEY_LENGTH, publicKeyOffset += PUBLIC_KEY_LENGTH) {
      var n = new BigInteger(1, privateKeys, privateKeyOffset, PRIVATE_KEY_LENGTH);
      potentialPublicEncryptionKey = Const.SEC_P256_K1_G.multiply(n).normalize().getEncoded(false);
      System.arraycopy(potentialPublicEncryptionKey, 0, publicKeys, publicKeyOffset,
          PUBLIC_KEY_LENGTH);
    }
    Files.write(publicKeyPath, publicKeys);
    return ExitCode.OK;
  }
}
