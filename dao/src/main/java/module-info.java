
/**
 * 
*/
module com.twitter.teruteru.dao {
    requires transitive java.sql;
    requires java.naming;

    opens com.twitter.teruteru128.dao;
    exports com.twitter.teruteru128.dao;
}
