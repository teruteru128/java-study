
/**
 * Teruteru's Test Repository
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

    // guava
    requires com.google.common;

    //
    requires jakarta.json;
    requires org.bouncycastle.provider;
    requires org.twitter4j.core;
    requires com.twitter.teruteru.encode;
    requires com.twitter.teruteru.util;
    requires org.glassfish.jaxb.runtime;
}
