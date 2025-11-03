package com.github.teruteru128.study;

import java.util.concurrent.Callable;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Parameters;

@Command(name = "calcBustSize", description = "バストサイズのカップ数計算")
public class CalcBustSize implements Callable<Integer> {

  @Parameters()
  char m;
  @Parameters()
  int[] diff;

  @Override
  public Integer call() {
    // Mカップの3つ下と6つ下は何だったかなってアホかな？
    System.out.printf("%c%n", m);
    for (var c : diff) {
      System.out.printf("%c%n", m - c);
    }
    return ExitCode.OK;
  }
}
