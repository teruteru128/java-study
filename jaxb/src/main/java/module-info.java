module com.twitter.teruteru.jaxb {
  requires jakarta.xml.bind;
  requires org.glassfish.jaxb.runtime;

  opens com.twitter.teruteru128.jaxb to jakarta.xml.bind;
  uses jakarta.xml.bind.JAXBContext;
}
