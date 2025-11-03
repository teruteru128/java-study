package com.github.teruteru128.study.converters;

import com.github.teruteru128.gmp.__mpz_struct;
import com.github.teruteru128.gmp.gmp_h;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import picocli.CommandLine.ITypeConverter;

public class MPZConverter implements ITypeConverter<MemorySegment> {

  @Override
  public MemorySegment convert(String value) {
    var auto = Arena.ofAuto();
    var num = __mpz_struct.allocate(auto).reinterpret(auto, gmp_h::mpz_clear);
    var i = gmp_h.mpz_init_set_str(num, auto.allocateFrom(value), 10);
    if (i != 0) {
      throw new NumberFormatException("thrown exception by mpz_init_set_str");
    }
    return num;
  }
}
