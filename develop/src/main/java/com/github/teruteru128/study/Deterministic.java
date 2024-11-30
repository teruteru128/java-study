package com.github.teruteru128.study;

import com.github.teruteru128.bitmessage.app.DeterministicAddressGenerator;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.Callable;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;


@Command(name = "de")
public class Deterministic implements Callable<Integer> {

  public Integer call() {
    return ExitCode.OK;
  }

  @Command(name = "passphrase")
  public Integer passphrase(String passphrase) {
    var a = new DeterministicAddressGenerator().apply(passphrase);
    a.addresses().forEach(System.out::println);
    System.out.println(a.signingKey());
    System.out.println(a.encryptingKey());
    return ExitCode.OK;
  }

  @Command(name = "file")
  public Integer file(Path path) throws IOException {
    var first = Files.readAllLines(path).getFirst();
    var a = new DeterministicAddressGenerator().apply(first);
    System.out.println("[chan] " + first);
    a.addresses().forEach(System.out::println);
    System.out.println(a.signingKey());
    System.out.println(a.encryptingKey());
    return ExitCode.OK;
  }

}
