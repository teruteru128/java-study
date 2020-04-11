
/**
 * @author teruteru
 *
 */
module com.twitter.teruteru128.study {
    requires java.desktop;
//    requires java.json;
    requires java.logging;
    requires java.management;
    requires java.naming;
    requires java.rmi;
    requires java.scripting;
    requires java.sql;
    requires java.xml.bind;
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
    exports com.twitter.teruteru128.study.fx.sample1;
    exports com.twitter.teruteru128.study.fx.sample2;
    exports com.twitter.teruteru128.study.fx.sample3;
    exports com.twitter.teruteru128.study.fx.sample4;
}
