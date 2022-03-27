module com.twitter.teruteru.ncv {
  requires transitive jakarta.xml.bind;
  requires org.glassfish.jaxb.runtime;

  exports com.twitter.teruteru128.ncv.adapters;
  exports com.twitter.teruteru128.ncv.commentlog;
  opens com.twitter.teruteru128.ncv.commentlog;
  exports com.twitter.teruteru128.ncv.usersetting;
  opens com.twitter.teruteru128.ncv.usersetting;
  uses jakarta.xml.bind.JAXBContext;
}
