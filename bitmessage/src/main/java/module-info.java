module com.github.teruteru.bitmessage {
    requires java.net.http;

    requires org.bouncycastle.provider;
    requires org.xerial.sqlitejdbc;
    requires org.apache.commons.codec;
    requires org.slf4j;
    requires com.github.teruteru.encode;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.annotation;
    requires org.openapitools.jackson.nullable;

    exports com.github.teruteru128.bitmessage;
    exports com.github.teruteru128.bitmessage.app;
    // exports com.github.teruteru128.bitmessage.dandelion;
    exports com.github.teruteru128.bitmessage.genaddress;
    exports com.github.teruteru128.bitmessage.spec;
}
