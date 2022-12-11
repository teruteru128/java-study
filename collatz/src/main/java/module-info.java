module com.twitter.teruteru.collatz {
  requires transitive java.sql;
  requires java.naming;

  opens com.twitter.teruteru128.collatz;
  exports com.twitter.teruteru128.collatz;
}
