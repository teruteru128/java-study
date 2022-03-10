package com.twitter.teruteru128.impl;

import com.twitter.teruteru128.library.Library;
import com.twitter.teruteru128.library.LibraryFactory;

public class LibraryFactoryImpl implements LibraryFactory {

  private Library library = new LibraryImpl();

  public Library getInstance(){
    return library;
  }
}
