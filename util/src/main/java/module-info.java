module com.twitter.teruteru.util {
    requires jakarta.xml.bind;

    opens com.twitter.teruteru128.util;
    exports com.twitter.teruteru128.encode;
    exports com.twitter.teruteru128.util;
}
