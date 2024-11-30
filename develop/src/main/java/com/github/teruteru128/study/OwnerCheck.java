package com.github.teruteru128.study;

import com.github.teruteru128.foreign.converters.PathConverter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.Callable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Parameters;

@Command(name = "ownerCheck")
public class OwnerCheck implements Callable<Integer> {

  private static final Logger log = LoggerFactory.getLogger(OwnerCheck.class);
  @Parameters(converter = PathConverter.class)
  Path arg;
  @Parameters
  String targetOwnerName;

  @Override
  public Integer call() throws IOException {
    var defaultFileSystem = FileSystems.getDefault();
    var targetOwner = defaultFileSystem.getUserPrincipalLookupService()
        .lookupPrincipalByName(targetOwnerName);
    var checker = new FileOwnerChecker(targetOwner);
    log.error("target path: {}", arg);
    log.error("target owner: {}", targetOwner);
    Files.walkFileTree(arg, checker);
    return ExitCode.OK;
  }
}
