
/**
 * 
 */
module com.twitter.teruteru.bitmessage.helloworld {
  requires xmlrpc.client;

  opens com.twitter.teruteru128.bitmessage.client;
  exports com.twitter.teruteru128.bitmessage.client;
}
