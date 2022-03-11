package com.twitter.teruteru128.study.sf;

import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.NamespaceContext;

class AtomNamespaceContext implements NamespaceContext {

  private static final String prefix = "atom";
  private static final String namespaceUri = "http://www.w3.org/2005/Atom";

  @Override
  public String getNamespaceURI(String prefix) {
    System.out.println("AtomNamespaceContext.getNamespaceURI()");
    if (prefix.equals(prefix)) {
        return namespaceUri;
    }
    return "";
  }

  @Override
  public String getPrefix(String namespaceURI) {
    System.out.println("AtomNamespaceContext.getPrefix()");
    if (namespaceUri.equals(namespaceURI)) {
        return prefix;
    }
    return "";
  }

  @Override
  public Iterator<String> getPrefixes(String namespaceURI) {
    System.out.println("AtomNamespaceContext.getPrefixes()");
    return List.of(prefix).iterator();
  }
}