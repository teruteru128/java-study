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
  requires thymeleaf;
  exports com.github.teruteru128.sample;
  exports com.github.teruteru128.sample.dynamic;
  exports com.github.teruteru128.sample.forward;
  exports com.github.teruteru128.sample.primes;
  exports com.github.teruteru128.sample.user;
  exports com.github.teruteru128.sample.user.register;
  opens com.github.teruteru128.sample;
  opens com.github.teruteru128.sample.aes;
  opens com.github.teruteru128.sample.ec;
  opens com.github.teruteru128.sample.user.login;
  opens com.github.teruteru128.sample.user.register;
  exports com.github.teruteru128.sample.user.login;
}
