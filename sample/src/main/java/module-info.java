module com.github.teruteru.sample {
  requires java.desktop;
  requires java.net.http;
  requires java.sql;
  requires org.apache.commons.statistics.distribution;
  requires org.apache.commons.rng.simple;
  requires org.xerial.sqlitejdbc;
  requires org.bouncycastle.provider;
  requires info.picocli;
  requires com.github.teruteru.study;
  requires com.github.teruteru.math;
  requires org.apache.tomcat.embed.core;
  requires com.github.teruteru.foreign.gmp;
  exports com.github.teruteru128.sample;
  exports com.github.teruteru128.sample.dynamic;
  exports com.github.teruteru128.sample.forward;
}
