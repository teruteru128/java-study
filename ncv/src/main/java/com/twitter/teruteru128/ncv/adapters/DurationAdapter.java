package com.twitter.teruteru128.ncv.adapters;

import java.time.Duration;
import java.util.regex.Pattern;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

/**
 * DurationAdaptor
 */
public class DurationAdapter extends XmlAdapter<String, Duration> {

  private static final Pattern PATTERN1 = Pattern.compile("^(\\d+):(\\d+):(\\d+)$");

  @Override
  public Duration unmarshal(String v) throws Exception {
    return Duration.parse(PATTERN1.matcher(v).replaceAll("PT$1H$2M$3S"));
  }

  @Override
  public String marshal(Duration v) throws Exception {
    return String.format("%02d:%02d:%02d", v.toHours(), v.toMinutesPart(), v.toSecondsPart());
  }

}
