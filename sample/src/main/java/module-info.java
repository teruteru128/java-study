module com.github.teruteru.sample {
  requires java.desktop;
  requires java.net.http;
  requires java.sql;
  requires org.apache.commons.statistics.distribution;
  requires org.apache.commons.rng.simple;
  requires org.xerial.sqlitejdbc;
  requires org.bouncycastle.provider;
  exports com.github.teruteru128.sample;
}
