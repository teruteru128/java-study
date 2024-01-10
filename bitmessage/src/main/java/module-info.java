module com.twitter.teruteru.bitmessage {
    requires java.net.http;

    requires org.bouncycastle.provider;
    requires com.twitter.teruteru.encode;
    requires org.xerial.sqlitejdbc;
    requires org.apache.commons.codec;
    requires com.twitter.teruteru.time;

    exports com.twitter.teruteru128.bitmessage;
    exports com.twitter.teruteru128.bitmessage.app;
    exports com.twitter.teruteru128.bitmessage.spec;
}
