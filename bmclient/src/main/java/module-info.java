
/**
 * 
 */
@SuppressWarnings("module")
module com.twitter.teruteru.bitmessage.helloworld {
  // A module that is no longer maintained.
  requires xmlrpc.client;

  opens com.twitter.teruteru128.bitmessage.client;
  exports com.twitter.teruteru128.bitmessage.client;
}
