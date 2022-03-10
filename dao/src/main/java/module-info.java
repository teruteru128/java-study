
/**
 * 
*/
module com.twitter.teruteru.dao {
    requires java.sql;
    requires java.naming;
    requires transitive com.h2database;

    opens com.twitter.teruteru128.dao;
    exports com.twitter.teruteru128.dao;
}
