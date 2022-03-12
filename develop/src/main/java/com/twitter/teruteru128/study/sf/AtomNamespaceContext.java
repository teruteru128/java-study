package com.twitter.teruteru128.study.sf;

import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.NamespaceContext;

class AtomNamespaceContext implements NamespaceContext {

  private static final String PREFIX = "atom";
  private static final String NAMESPACE_URI = "http://www.w3.org/2005/Atom";
  private static final String EMPTY = "";

  @Override
  public String getNamespaceURI(String prefix) {
    if (AtomNamespaceContext.PREFIX.equals(prefix)) {
        return NAMESPACE_URI;
    }
    return EMPTY;
  }

  @Override
  public String getPrefix(String namespaceURI) {
    if (NAMESPACE_URI.equals(namespaceURI)) {
        return PREFIX;
    }
    return EMPTY;
  }

  @Override
  public Iterator<String> getPrefixes(String namespaceURI) {
    return List.of(PREFIX).iterator();
  }
}
