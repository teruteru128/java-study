module com.twitter.teruteru.impl {
  requires transitive com.twitter.teruteru.library;

  provides com.twitter.teruteru128.library.Library with com.twitter.teruteru128.impl.LibraryImpl;
  provides com.twitter.teruteru128.library.LibraryFactory with com.twitter.teruteru128.impl.LibraryFactoryImpl;
}
