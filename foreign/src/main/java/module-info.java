module com.github.teruteru.foreign {
  requires com.github.teruteru.bcrypt;
  requires com.github.teruteru.foreign.gmp;
  requires com.github.teruteru.heapapi;
  requires com.github.teruteru.foreign.mpz_aprcl;
  requires com.github.teruteru.foreign.opencl;
  requires com.github.teruteru.foreign.windows;
  requires com.github.teruteru.foreign.setjmp;
  requires info.picocli;
  requires org.slf4j;
  requires org.xerial.sqlitejdbc;
  opens com.github.teruteru128.foreign;
  opens com.github.teruteru128.foreign.converters;
  exports com.github.teruteru128.foreign;
  uses java.security.Provider;
}
