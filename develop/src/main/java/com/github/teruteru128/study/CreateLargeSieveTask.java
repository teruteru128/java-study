package com.github.teruteru128.study;

import java.io.IOException;
import java.nio.file.Path;
import java.sql.SQLException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Parameters;

// FIXME 引数が多すぎる。ファイルで入力させよう
@Command(name = "createLargeSieve")
public class CreateLargeSieveTask implements Callable<Integer> {

  private static final Logger logger = LoggerFactory.getLogger(CreateLargeSieveTask.class);
  @Parameters()
  private Path argumentsFilePath;

  public CreateLargeSieveTask() {
  }

  @Override
  public Integer call()
      throws IOException, ClassNotFoundException, ExecutionException, InterruptedException, SQLException {
    // 小さなふるいを使って大きなふるいから合成数を除外
    // 大きな篩の長さ->1048576 / 20 * 64 = 3355444
    logger.info("終わり！");
    return ExitCode.OK;
  }

}
