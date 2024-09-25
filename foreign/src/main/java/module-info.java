module com.github.teruteru.foreign {
  requires com.github.teruteru.foreign.opencl;
  requires com.github.teruteru.foreign.windows;
  requires com.github.teruteru.foreign.setjmp;
  requires info.picocli;
  requires com.github.teruteru.gmp;
  opens com.github.teruteru128.foreign;
  uses java.security.Provider;
}
