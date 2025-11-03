package com.github.teruteru128.study;

public record Label(String label, int version) implements Comparable<Label> {

  @Override
  public int compareTo(Label o) {
    var i = label.compareTo(o.label());
    return i != 0 ? i : Integer.compare(version, o.version);
  }
}
