
/**
 * Teruteru's Sample Repository
 * 
 * @author teruteru
 * @moduleGraph
 */
module com.twitter.teruteru.sample {
    requires java.desktop;
    requires java.net.http;
    requires java.sql;

    requires commons.math3;

    requires org.bouncycastle.provider;
    requires com.twitter.teruteru.study;
    requires com.twitter.teruteru.util;
    requires org.xerial.sqlitejdbc;
}
