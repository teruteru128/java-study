
/**
 * 
*/
module com.twitter.teruteru.dao {
    requires java.sql;
    requires java.naming;
    requires com.h2database;

    exports com.twitter.teruteru128.dao;
}
