module com.twitter.teruteru.ncv {
  requires jakarta.xml.bind;
  requires org.glassfish.jaxb.runtime;

  exports com.twitter.teruteru128.ncv;
  opens com.twitter.teruteru128.ncv;
  uses jakarta.xml.bind.JAXBContext;
}
