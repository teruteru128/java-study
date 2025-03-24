package com.github.teruteru128.foreign.converters;

import java.math.BigInteger;
import java.util.HexFormat;
import picocli.CommandLine;

public class BigIntegerHexConverter implements CommandLine.ITypeConverter<BigInteger> {

  public static final HexFormat HEX_FORMAT = HexFormat.of();

  @Override
  public BigInteger convert(String value) {
    return new BigInteger(1, HEX_FORMAT.parseHex(value));
  }
}
