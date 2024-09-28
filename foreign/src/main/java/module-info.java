module com.github.teruteru.foreign {
  requires com.github.teruteru.foreign.opencl;
  requires com.github.teruteru.foreign.windows;
  requires com.github.teruteru.foreign.setjmp;
  requires info.picocli;
  requires com.github.teruteru.gmp;
  requires org.slf4j;
  opens com.github.teruteru128.foreign;
  opens com.github.teruteru128.foreign.converters;
  uses java.security.Provider;
}
