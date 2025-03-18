package com.github.teruteru128.study;

public final class FactorDatabase {

  public static final String FDB_USER_ID = System.getenv("FDBUSER");
  public static final String FDB_USER_COOKIE =
      FDB_USER_ID != null ? "fdbuser=" + FDB_USER_ID : "";

  private FactorDatabase() {
  }
}
