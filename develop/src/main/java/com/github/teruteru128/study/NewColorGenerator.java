package com.github.teruteru128.study;

import com.github.teruteru128.color.ColorConverter;
import com.github.teruteru128.color.HLSColor;
import java.util.concurrent.Callable;
import java.util.random.RandomGenerator;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Option;

@Command(name = "generateNewColor")
public class NewColorGenerator implements Callable<Integer> {

  @Option(names = {"--fix-saturation-to-1",
      "-S"}, defaultValue = "false")
  boolean fixSaturationTo1;

  @Override
  public Integer call() throws Exception {
    var h = MyRandom.nextDouble(Factory.SECURE_RANDOM_GENERATOR) * 6;
    var l = 0.5;
    double s;
    if (fixSaturationTo1) {
      s = 1;
    } else {
      s = (double) Factory.SECURE_RANDOM_GENERATOR.nextInt(192, 256) / 255;
    }
    var rgb = ColorConverter.HLSToRGB(new HLSColor(h, l, s));
    var r = rgb.r();
    var g = rgb.g();
    var b = rgb.b();
    var v = 0xff000000 | r << 16 | g << 8 | b;
    System.out.printf("%d, %d, %d(%d, %<08x)%n", r, g, b, v);
    return ExitCode.OK;
  }
}
