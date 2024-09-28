package com.github.teruteru128.foreign.converters;

import java.nio.file.Path;
import picocli.CommandLine;

public class PathConverter implements CommandLine.ITypeConverter<Path> {

  @Override
  public Path convert(String value) {
    return Path.of(value);
  }
}
