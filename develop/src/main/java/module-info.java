
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
    requires com.h2database;
    requires com.twitter.teruteru.encode;
    requires com.twitter.teruteru.util;
    requires org.glassfish.jaxb.runtime;
    requires com.twitter.teruteru.impl;
    requires com.twitter.teruteru.library;
    requires com.twitter.teruteru.collatz;
    requires com.twitter.teruteru.ncv;

    uses com.twitter.teruteru128.library.Library;
    uses com.twitter.teruteru128.library.LibraryFactory;
}
