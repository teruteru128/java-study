module com.twitter.teruteru.bitmessage {
    requires java.net.http;

    requires org.bouncycastle.provider;
    requires org.xerial.sqlitejdbc;
    requires org.apache.commons.codec;
    requires org.slf4j;
    requires com.twitter.teruteru.encode;
    requires com.twitter.teruteru.time;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.annotation;
    requires org.openapitools.jackson.nullable;

    exports com.twitter.teruteru128.bitmessage;
    exports com.twitter.teruteru128.bitmessage.app;
    // exports com.twitter.teruteru128.bitmessage.dandelion;
    exports com.twitter.teruteru128.bitmessage.genaddress;
    exports com.twitter.teruteru128.bitmessage.spec;
}
