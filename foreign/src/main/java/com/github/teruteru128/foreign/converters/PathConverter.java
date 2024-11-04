package com.github.teruteru128.foreign.converters;

import java.nio.file.Path;
import picocli.CommandLine.ITypeConverter;

/**
 */
public class PathConverter implements ITypeConverter<Path> {

  @Override
  public Path convert(String value) {
    return Path.of(value);
  }
}
