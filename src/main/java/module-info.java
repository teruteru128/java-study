
/**
 * @author teruteru
 * @moduleGraph
 */
module com.twitter.teruteru128.study {
    requires java.desktop;
    requires jakarta.json;
    requires java.logging;
    requires java.management;
    requires java.naming;
    requires java.rmi;
    requires java.scripting;
    requires java.sql;
    requires transitive jakarta.xml.bind;
    requires com.google.gson;
    requires jcuda;
    requires org.bouncycastle.pg;
    requires org.bouncycastle.provider;
    requires org.bukkit;
    requires org.json;
    requires transitive org.twitter4j.core;
    requires mysql.connector.java;
    requires commons.math3;
    requires transitive javafx.controls;
    requires transitive javafx.fxml;
    requires com.h2database;
    requires jakarta.mail;
    requires twitter.text;
    requires transitive xmlrpc.common;
    requires transitive xmlrpc.client;
    requires transitive ws.commons.util;

    opens com.twitter.teruteru128.application to javafx.fxml, javafx.graphics;
    opens com.twitter.teruteru128.study.fx.sample1 to javafx.fxml, javafx.graphics;
    opens com.twitter.teruteru128.study.fx.sample2 to javafx.fxml, javafx.graphics;
    opens com.twitter.teruteru128.study.fx.sample3 to javafx.fxml, javafx.graphics;
    opens com.twitter.teruteru128.study.fx.sample4 to javafx.fxml, javafx.graphics;
    opens com.twitter.teruteru128.study.jaxb to jakarta.xml.bind;
}
