package com.github.teruteru128.study.converters;

import picocli.CommandLine.ITypeConverter;

public class UnsignedLongConverter implements ITypeConverter<Long> {

  @Override
  public Long convert(String value) throws Exception {
    return Long.parseUnsignedLong(value);
  }
}
