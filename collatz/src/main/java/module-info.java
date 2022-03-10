module com.twitter.teruteru.collatz {
  requires java.sql;
  requires java.naming;
  requires transitive com.h2database;

  opens com.twitter.teruteru128.collatz;
  exports com.twitter.teruteru128.collatz;
}
