package com.github.teruteru128.foreign.converters;

import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import picocli.CommandLine.ITypeConverter;

public class BigIntegerConverter implements ITypeConverter<BigInteger> {

  @Override
  public BigInteger convert(String s) throws Exception {
    try (var oin = new ObjectInputStream(Files.newInputStream(Path.of(s)))) {
      return (BigInteger) oin.readObject();
    }
  }
}
