module com.github.teruteru.sample {
  requires java.net.http;
  requires java.sql;
  requires com.github.teruteru.study;
  requires org.apache.commons.statistics.distribution;
  requires org.apache.commons.rng.simple;
  requires org.xerial.sqlitejdbc;
  requires org.bouncycastle.provider;
  exports com.github.teruteru128.sample;
}
