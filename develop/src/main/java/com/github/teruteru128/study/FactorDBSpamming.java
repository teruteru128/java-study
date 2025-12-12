package com.github.teruteru128.study;

import tools.jackson.databind.ObjectMapper;

public class FactorDBSpamming {

  public static final String QUERY_ENDPOINT = "https://factordb.com/api?query=";
  public static final String ID_ENDPOINT = "https://factordb.com/api?id=";
  public static final String REPORT_FACTOR_ENDPOINT = "https://factordb.com/reportfactor.php";
  public static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

}
