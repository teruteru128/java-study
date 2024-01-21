module com.twitter.teruteru.bitmessage {
    requires java.net.http;

    requires org.bouncycastle.provider;
    requires org.xerial.sqlitejdbc;
    requires org.apache.commons.codec;
    requires com.twitter.teruteru.encode;
    requires com.twitter.teruteru.time;

    exports com.twitter.teruteru128.bitmessage;
    exports com.twitter.teruteru128.bitmessage.app;
    exports com.twitter.teruteru128.bitmessage.dandelion;
    exports com.twitter.teruteru128.bitmessage.genaddress;
    exports com.twitter.teruteru128.bitmessage.inventory;
    exports com.twitter.teruteru128.bitmessage.p2p;
    exports com.twitter.teruteru128.bitmessage.protocol;
    exports com.twitter.teruteru128.bitmessage.protocol.payload;
    exports com.twitter.teruteru128.bitmessage.spec;
}
