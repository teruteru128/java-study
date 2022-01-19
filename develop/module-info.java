
/**
 * @author teruteru
 * @moduleGraph
 */
module com.twitter.teruteru.study {
    requires java.desktop;
    requires java.logging;
    requires java.management;
    requires java.naming;
    requires java.rmi;
    requires java.scripting;
    requires java.sql;
    requires com.google.gson;
    requires jakarta.json;
    requires jakarta.mail;
    requires transitive jakarta.xml.bind;
    requires org.bouncycastle.provider;
    requires org.json;
    requires org.twitter4j.core;
    requires com.h2database;

    opens com.twitter.teruteru128.study.jaxb to jakarta.xml.bind;
}
