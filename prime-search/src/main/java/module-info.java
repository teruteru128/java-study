module com.github.teruteru.primesearch {
  requires com.github.teruteru.foreign.gmp.linux;
  requires info.picocli;
  requires org.slf4j;
  requires java.sql;
  requires org.xerial.sqlitejdbc;
  requires org.postgresql.jdbc;

  opens com.github.teruteru128.primesearch;
  opens com.github.teruteru128.primesearch.search;
  opens com.github.teruteru128.primesearch.db;
}
